package typings.reactDndAsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object makeRequestCallMod {
  
  @JSImport("@react-dnd/asap/dist/makeRequestCall", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-dnd/asap/dist/makeRequestCall", "makeRequestCall")
  @js.native
  val makeRequestCall: js.Function1[/* callback */ js.Function0[Unit], js.Function0[Unit]] = js.native
  
  inline def makeRequestCallFromMutationObserver(callback: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRequestCallFromMutationObserver")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def makeRequestCallFromTimer(callback: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRequestCallFromTimer")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
}
