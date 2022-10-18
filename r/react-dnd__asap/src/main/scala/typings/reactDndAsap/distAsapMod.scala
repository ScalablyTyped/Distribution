package typings.reactDndAsap

import typings.reactDndAsap.distTypesMod.TaskFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAsapMod {
  
  @JSImport("@react-dnd/asap/dist/asap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asap(task: TaskFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("asap")(task.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
