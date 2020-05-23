package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var originalEvent: typings.std.Event
  var value: js.Any
}

object Value {
  @scala.inline
  def apply(originalEvent: typings.std.Event, value: js.Any): Value = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

