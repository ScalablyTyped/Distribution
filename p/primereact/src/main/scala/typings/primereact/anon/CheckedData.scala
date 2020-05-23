package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckedData extends js.Object {
  var checked: Boolean
  var data: js.Object
  var originalEvent: typings.std.Event
}

object CheckedData {
  @scala.inline
  def apply(checked: Boolean, data: js.Object, originalEvent: typings.std.Event): CheckedData = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckedData]
  }
}

