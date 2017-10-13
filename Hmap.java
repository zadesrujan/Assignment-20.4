package sets;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> friendsNames=new HashMap<Integer,String>();
		//put(K key, V value) method is used to associate the specified 
				//value with the specified key in this map.
		
		friendsNames.put(1,"Priya");
		 friendsNames.put(2,"sudha");
		 friendsNames.put(4,"srujan");
		 friendsNames.put(3,"nagaraj");
		 System.out.println(friendsNames);
		 //create the object of keys set
		 Set<Integer> keys=friendsNames.keySet();
		 for(Integer key:keys)//print the keys using ternary values
		 {
			 System.out.println(key);
		 }
		 System.out.println(friendsNames);
		//system : is a class in java language pacakge.
		 //out : static member of the system class.
	  	//println : to print what is output.
		 
		 Collection<String> values=friendsNames.values();
		 for(String value:values)
		 {
			 System.out.println(value);
			//system : is a class in java language pacakge.
		  	//out : static member of the system class.
		  	//println : to print what is output.
		 }
// The Java collections framework (JCF) is a set of classes and 
//interfaces that implement commonly reusable collection data structures.
	//synchronzing the employees 
// Map interface provides methods for storing values based on key basis.
	@SuppressWarnings("rawtypes")
	Map map=Collections.synchronizedMap(friendsNames);
	System.out.println("After synchronizing:");
	//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.
	@SuppressWarnings("rawtypes")
	Collection value=map.entrySet();//enter into the set
	synchronized(friendsNames)
	{
		
		@SuppressWarnings("rawtypes")
		Iterator i=value.iterator();
		while(i.hasNext())
		{
			//create the object and displaying
			@SuppressWarnings("rawtypes")
			Map.Entry me=(Map.Entry)i.next();
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
			//system : is a class in java language pacakge.
	  		//out : static member of the system class.
	  		//println : to print what is output.
		}
	}
}

	}


