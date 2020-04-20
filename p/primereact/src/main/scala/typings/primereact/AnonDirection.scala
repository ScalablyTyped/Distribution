package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirection extends js.Object {
  var direction: String
  var originalEvent: Event_
  var value: js.Any
}

object AnonDirection {
  @scala.inline
  def apply(direction: String, originalEvent: Event_, value: js.Any): AnonDirection = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirection]
  }
}

