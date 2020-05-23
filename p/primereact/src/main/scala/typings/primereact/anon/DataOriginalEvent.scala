package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataOriginalEvent extends js.Object {
  var data: js.Any
  var originalEvent: typings.std.Event
}

object DataOriginalEvent {
  @scala.inline
  def apply(data: js.Any, originalEvent: typings.std.Event): DataOriginalEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataOriginalEvent]
  }
}

