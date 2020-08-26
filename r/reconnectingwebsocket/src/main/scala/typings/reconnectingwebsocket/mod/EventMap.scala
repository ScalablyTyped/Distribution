package typings.reconnectingwebsocket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventMap extends js.Object {
  var close: CloseEvent = js.native
  var connecting: ConnectingEvent = js.native
  var error: ErrorEvent = js.native
  var message: MessageEvent = js.native
  var open: OpenEvent = js.native
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
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], connecting = connecting.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
  @scala.inline
  implicit class EventMapOps[Self <: EventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClose(value: CloseEvent): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnecting(value: ConnectingEvent): Self = this.set("connecting", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: ErrorEvent): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: MessageEvent): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: OpenEvent): Self = this.set("open", value.asInstanceOf[js.Any])
  }
  
}

