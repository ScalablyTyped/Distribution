package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSocketEventMap extends js.Object {
  var close: CloseEvent
  var error: Event
  var message: MessageEvent
  var open: Event
}

object WebSocketEventMap {
  @scala.inline
  def apply(close: CloseEvent, error: Event, message: MessageEvent, open: Event): WebSocketEventMap = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketEventMap]
  }
}

