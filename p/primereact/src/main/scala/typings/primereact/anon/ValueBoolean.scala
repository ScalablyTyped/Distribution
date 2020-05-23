package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueBoolean extends js.Object {
  var originalEvent: typings.std.Event
  var value: Boolean
}

object ValueBoolean {
  @scala.inline
  def apply(originalEvent: typings.std.Event, value: Boolean): ValueBoolean = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueBoolean]
  }
}

