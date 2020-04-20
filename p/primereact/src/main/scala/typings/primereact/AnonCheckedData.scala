package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheckedData extends js.Object {
  var checked: Boolean
  var data: js.Object
  var originalEvent: Event_
}

object AnonCheckedData {
  @scala.inline
  def apply(checked: Boolean, data: js.Object, originalEvent: Event_): AnonCheckedData = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCheckedData]
  }
}

