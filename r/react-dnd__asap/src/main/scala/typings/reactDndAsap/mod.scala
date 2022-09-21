package typings.reactDndAsap

import typings.reactDndAsap.typesMod.TaskFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-dnd/asap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-dnd/asap", "AsapQueue")
  @js.native
  open class AsapQueue ()
    extends typings.reactDndAsap.asapQueueMod.AsapQueue
  
  @JSImport("@react-dnd/asap", "TaskFactory")
  @js.native
  open class TaskFactory protected ()
    extends typings.reactDndAsap.taskFactoryMod.TaskFactory {
    def this(onError: js.Function1[/* err */ Any, Unit]) = this()
  }
  
  inline def asap(task: TaskFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("asap")(task.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
