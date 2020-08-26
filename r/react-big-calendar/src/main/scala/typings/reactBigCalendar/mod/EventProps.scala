package typings.reactBigCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventProps[TEvent /* <: js.Object */] extends js.Object {
  var event: TEvent = js.native
  var title: String = js.native
}

object EventProps {
  @scala.inline
  def apply[/* <: js.Object */ TEvent](event: TEvent, title: String): EventProps[TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventProps[TEvent]]
  }
  @scala.inline
  implicit class EventPropsOps[Self <: EventProps[_], /* <: js.Object */ TEvent] (val x: Self with EventProps[TEvent]) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

