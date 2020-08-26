package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebSocketEventMap extends js.Object {
  var close: CloseEvent = js.native
  var error: Event = js.native
  var message: MessageEvent = js.native
  var open: Event = js.native
}

object WebSocketEventMap {
  @scala.inline
  def apply(close: CloseEvent, error: Event, message: MessageEvent, open: Event): WebSocketEventMap = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketEventMap]
  }
  @scala.inline
  implicit class WebSocketEventMapOps[Self <: WebSocketEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClose(value: CloseEvent): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Event): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: MessageEvent): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: Event): Self = this.set("open", value.asInstanceOf[js.Any])
  }
  
}

