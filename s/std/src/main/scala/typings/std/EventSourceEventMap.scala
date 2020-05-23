package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSourceEventMap extends js.Object {
  var error: Event
  var message: MessageEvent
  var open: Event
}

object EventSourceEventMap {
  @scala.inline
  def apply(error: Event, message: MessageEvent, open: Event): EventSourceEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSourceEventMap]
  }
}

