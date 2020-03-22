package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOriginalEventTargetValue extends js.Object {
  var originalEvent: Event_
  var target: AnonNameValue
  var value: Double
}

object AnonOriginalEventTargetValue {
  @scala.inline
  def apply(originalEvent: Event_, target: AnonNameValue, value: Double): AnonOriginalEventTargetValue = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOriginalEventTargetValue]
  }
}

