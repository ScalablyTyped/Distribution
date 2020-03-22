package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheckedOriginalEvent extends js.Object {
  var checked: Boolean
  var originalEvent: Event_
  var target: AnonChecked
  var value: js.Any
}

object AnonCheckedOriginalEvent {
  @scala.inline
  def apply(checked: Boolean, originalEvent: Event_, target: AnonChecked, value: js.Any): AnonCheckedOriginalEvent = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCheckedOriginalEvent]
  }
}

