package typings.restartHooks

import typings.restartHooks.anon.Clear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useThrottledEventHandlerMod {
  
  @JSImport("@restart/hooks/cjs/useThrottledEventHandler", JSImport.Default)
  @js.native
  def default[TEvent](handler: js.Function1[/* event */ TEvent, Unit]): ThrottledHandler[TEvent] = js.native
  
  type ThrottledHandler[TEvent] = (js.Function1[/* event */ TEvent, Unit]) with Clear
}
