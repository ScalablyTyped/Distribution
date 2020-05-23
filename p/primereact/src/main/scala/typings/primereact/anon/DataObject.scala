package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  var data: js.Object
  var originalEvent: typings.std.Event
}

object DataObject {
  @scala.inline
  def apply(data: js.Object, originalEvent: typings.std.Event): DataObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

