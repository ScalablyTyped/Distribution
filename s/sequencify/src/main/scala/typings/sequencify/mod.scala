package typings.sequencify

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sequencify", JSImport.Namespace)
  @js.native
  def apply[T /* <: TaskMap */](tasks: T, names: js.Array[/* keyof T */ String], results: js.Array[/* keyof T */ String]): Unit = js.native
  @JSImport("sequencify", JSImport.Namespace)
  @js.native
  def apply[T /* <: TaskMap */](
    tasks: T,
    names: js.Array[/* keyof T */ String],
    results: js.Array[/* keyof T */ String],
    nest: js.Array[String]
  ): Unit = js.native
  
  @js.native
  trait Task extends StObject {
    
    var dep: js.Array[String] = js.native
    
    var name: String = js.native
  }
  object Task {
    
    @scala.inline
    def apply(dep: js.Array[String], name: String): Task = {
      val __obj = js.Dynamic.literal(dep = dep.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Task]
    }
    
    @scala.inline
    implicit class TaskMutableBuilder[Self <: Task] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDep(value: js.Array[String]): Self = StObject.set(x, "dep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepVarargs(value: String*): Self = StObject.set(x, "dep", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type TaskMap = StringDictionary[Task]
}
