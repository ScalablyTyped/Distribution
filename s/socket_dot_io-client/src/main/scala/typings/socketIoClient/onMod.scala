package typings.socketIoClient

import typings.socketIoComponentEmitter.mod.Emitter
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onMod {
  
  @JSImport("socket.io-client/build/esm/on", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def on(obj: Emitter[Any, Any, js.Object], ev: String, fn: js.Function1[/* err */ js.UndefOr[Any], Any]): VoidFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[VoidFunction]
}
