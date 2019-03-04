package typings
package reactDashOnsenuiLib.reactDashOnsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchChangeEvent
  extends reactLib.Event {
  var isInteractive: scala.Boolean
  var switch: reactLib.HTMLElement
  var value: scala.Boolean
}

object SwitchChangeEvent {
  @scala.inline
  def apply(isInteractive: scala.Boolean, switch: reactLib.HTMLElement, value: scala.Boolean): SwitchChangeEvent = {
    val __obj = js.Dynamic.literal(isInteractive = isInteractive, switch = switch, value = value)
  
    __obj.asInstanceOf[SwitchChangeEvent]
  }
}

