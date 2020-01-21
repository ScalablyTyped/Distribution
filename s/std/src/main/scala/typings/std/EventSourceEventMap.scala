package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSourceEventMap extends js.Object {
  var error: Event_
  var message: MessageEvent
  var open: Event_
}

object EventSourceEventMap {
  @scala.inline
  def apply(error: Event_, message: MessageEvent, open: Event_): EventSourceEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventSourceEventMap]
  }
}

