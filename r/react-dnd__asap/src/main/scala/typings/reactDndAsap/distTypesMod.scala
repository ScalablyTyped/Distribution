package typings.reactDndAsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  trait Task extends StObject {
    
    def call(): Unit
  }
  object Task {
    
    inline def apply(call: () => Unit): Task = {
      val __obj = js.Dynamic.literal(call = js.Any.fromFunction0(call))
      __obj.asInstanceOf[Task]
    }
    
    extension [Self <: Task](x: Self) {
      
      inline def setCall(value: () => Unit): Self = StObject.set(x, "call", js.Any.fromFunction0(value))
    }
  }
  
  type TaskFn = js.Function0[Unit]
}
