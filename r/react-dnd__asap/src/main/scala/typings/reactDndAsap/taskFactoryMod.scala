package typings.reactDndAsap

import typings.reactDndAsap.typesMod.Task
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskFactoryMod {
  
  @JSImport("@react-dnd/asap/dist/TaskFactory", "TaskFactory")
  @js.native
  open class TaskFactory protected () extends StObject {
    def this(onError: js.Function1[/* err */ Any, Unit]) = this()
    
    def create(task: js.Function0[Unit]): Task = js.native
    
    /* private */ var freeTasks: Any = js.native
    
    /* private */ var onError: Any = js.native
  }
}
