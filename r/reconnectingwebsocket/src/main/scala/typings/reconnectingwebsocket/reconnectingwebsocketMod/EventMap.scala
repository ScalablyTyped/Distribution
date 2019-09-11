package typings.reconnectingwebsocket.reconnectingwebsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var close: CloseEvent
  var connecting: ConnectingEvent
  var error: ErrorEvent
  var message: MessageEvent
  var open: OpenEvent
}

object EventMap {
  @scala.inline
  def apply(
    close: CloseEvent,
    connecting: ConnectingEvent,
    error: ErrorEvent,
    message: MessageEvent,
    open: OpenEvent
  ): EventMap = {
    val __obj = js.Dynamic.literal(close = close, connecting = connecting, error = error, message = message, open = open)
  
    __obj.asInstanceOf[EventMap]
  }
}

