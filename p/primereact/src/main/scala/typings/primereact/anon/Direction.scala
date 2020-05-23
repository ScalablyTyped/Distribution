package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Direction extends js.Object {
  var direction: String
  var originalEvent: typings.std.Event
  var value: js.Any
}

object Direction {
  @scala.inline
  def apply(direction: String, originalEvent: typings.std.Event, value: js.Any): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
}

