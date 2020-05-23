package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetValue extends js.Object {
  var originalEvent: typings.std.Event
  var target: IdName
  var value: Boolean
}

object TargetValue {
  @scala.inline
  def apply(originalEvent: typings.std.Event, target: IdName, value: Boolean): TargetValue = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetValue]
  }
}

