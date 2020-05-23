package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckedOriginalEvent extends js.Object {
  var checked: Boolean
  var originalEvent: typings.std.Event
  var target: Checked
  var value: js.Any
}

object CheckedOriginalEvent {
  @scala.inline
  def apply(checked: Boolean, originalEvent: typings.std.Event, target: Checked, value: js.Any): CheckedOriginalEvent = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckedOriginalEvent]
  }
}

