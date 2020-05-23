package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalEventTargetValue extends js.Object {
  var originalEvent: typings.std.Event
  var target: NameValue
  var value: Double
}

object OriginalEventTargetValue {
  @scala.inline
  def apply(originalEvent: typings.std.Event, target: NameValue, value: Double): OriginalEventTargetValue = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEventTargetValue]
  }
}

