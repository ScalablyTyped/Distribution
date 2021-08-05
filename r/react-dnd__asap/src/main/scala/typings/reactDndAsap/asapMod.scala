package typings.reactDndAsap

import typings.reactDndAsap.typesMod.Task
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asapMod {
  
  @JSImport("@react-dnd/asap/lib/node/asap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asap(task: Task): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("asap")(task.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
