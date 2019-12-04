package typings.primereact

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckedData extends js.Object {
  var checked: Boolean
  var data: js.Object
  var originalEvent: Event
}

object Anon_CheckedData {
  @scala.inline
  def apply(checked: Boolean, data: js.Object, originalEvent: Event): Anon_CheckedData = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CheckedData]
  }
}

