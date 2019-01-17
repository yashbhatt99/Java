public class studentTc3 
{
    	int sid;
    	String sname;
    	static String scoll="GTU";
   
   
    	public studentTc3(int sid,String sname)
	{
        	this.sid=sid;
        	this.sname=sname;
    	}

   	void display()
	{
       		System.out.println("Student Roll numeber:"+sid);
		System.out.println(" ");
       		System.out.println("Student Name: "+sname);
		System.out.println(" ");
       		System.out.println("Student Collage:"+scoll);
		System.out.println(" ");
  	}
	
    	public static void main(String[] args) 
	{
        	studentTc3 s1 = new studentTc3(1,"Som");
        	studentTc3 s2 = new studentTc3(2,"Amit");
        	studentTc3 s3 = new studentTc3(3,"Raj");
        	s1.display();
        	s2.display();
        	s3.display();
    	}
}