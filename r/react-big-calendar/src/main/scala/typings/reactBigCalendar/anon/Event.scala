package typings.reactBigCalendar.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event[TEvent /* <: js.Object */] extends js.Object {
  var event: TEvent = js.native
  var style: CSSProperties = js.native
}

object Event {
  @scala.inline
  def apply[/* <: js.Object */ TEvent](event: TEvent, style: CSSProperties): Event[TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[TEvent]]
  }
  @scala.inline
  implicit class EventOps[Self <: Event[_], /* <: js.Object */ TEvent] (val x: Self with Event[TEvent]) extends AnyVal {
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
    def setEvent(value: TEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
  }
  
}

