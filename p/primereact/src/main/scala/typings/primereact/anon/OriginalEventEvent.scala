package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalEventEvent extends js.Object {
  var originalEvent: typings.std.Event
  var value: String
}

object OriginalEventEvent {
  @scala.inline
  def apply(originalEvent: typings.std.Event, value: String): OriginalEventEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEventEvent]
  }
}

