package typings.stellarSdk

import typings.std.MessageEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSourceEventMap extends js.Object {
  var error: Event = js.native
  var message: MessageEvent = js.native
  var open: Event = js.native
}

object EventSourceEventMap {
  @scala.inline
  def apply(error: Event, message: MessageEvent, open: Event): EventSourceEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSourceEventMap]
  }
  @scala.inline
  implicit class EventSourceEventMapOps[Self <: EventSourceEventMap] (val x: Self) extends AnyVal {
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
    def setError(value: Event): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: MessageEvent): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: Event): Self = this.set("open", value.asInstanceOf[js.Any])
  }
  
}

