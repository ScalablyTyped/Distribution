package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataOriginalEvent extends js.Object {
  var data: js.Any
  var originalEvent: Event_
}

object AnonDataOriginalEvent {
  @scala.inline
  def apply(data: js.Any, originalEvent: Event_): AnonDataOriginalEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataOriginalEvent]
  }
}

