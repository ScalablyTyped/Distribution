package typings.restartHooks

import typings.restartHooks.anon.Clear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsUseThrottledEventHandlerMod {
  
  @JSImport("@restart/hooks/cjs/useThrottledEventHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TEvent](handler: js.Function1[/* event */ TEvent, Unit]): ThrottledHandler[TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(handler.asInstanceOf[js.Any]).asInstanceOf[ThrottledHandler[TEvent]]
  
  type ThrottledHandler[TEvent] = (js.Function1[/* event */ TEvent, Unit]) & Clear
}
