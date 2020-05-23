package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventValue extends js.Object {
  var event: typings.std.Event
  var value: js.Any
}

object EventValue {
  @scala.inline
  def apply(event: typings.std.Event, value: js.Any): EventValue = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventValue]
  }
}

