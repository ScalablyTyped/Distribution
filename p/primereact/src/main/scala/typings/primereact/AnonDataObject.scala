package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataObject extends js.Object {
  var data: js.Object
  var originalEvent: Event_
}

object AnonDataObject {
  @scala.inline
  def apply(data: js.Object, originalEvent: Event_): AnonDataObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataObject]
  }
}

