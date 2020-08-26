package typings.reactBigCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait End[TEvent /* <: js.Object */] extends js.Object {
  var end: js.UndefOr[js.Function1[/* event */ TEvent, typings.std.Date]] = js.native
  var start: js.UndefOr[js.Function1[/* event */ TEvent, typings.std.Date]] = js.native
  var title: js.UndefOr[js.Function1[/* event */ TEvent, String]] = js.native
  var tooltip: js.UndefOr[js.Function1[/* event */ TEvent, String]] = js.native
}

object End {
  @scala.inline
  def apply[/* <: js.Object */ TEvent](): End[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[End[TEvent]]
  }
  @scala.inline
  implicit class EndOps[Self <: End[_], /* <: js.Object */ TEvent] (val x: Self with End[TEvent]) extends AnyVal {
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
    def setEnd(value: /* event */ TEvent => typings.std.Date): Self = this.set("end", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setStart(value: /* event */ TEvent => typings.std.Date): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setTitle(value: /* event */ TEvent => String): Self = this.set("title", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTooltip(value: /* event */ TEvent => String): Self = this.set("tooltip", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
  
}

