package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var event: typings.std.Event
  var value: Boolean
}

object Event {
  @scala.inline
  def apply(event: typings.std.Event, value: Boolean): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

