package typings.restartHooks

import typings.restartHooks.anon.Clear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@restart/hooks/cjs/useThrottledEventHandler", JSImport.Namespace)
@js.native
object useThrottledEventHandlerMod extends js.Object {
  
  def default[TEvent](handler: js.Function1[/* event */ TEvent, Unit]): ThrottledHandler[TEvent] = js.native
  
  type ThrottledHandler[TEvent] = (js.Function1[/* event */ TEvent, Unit]) with Clear
}
