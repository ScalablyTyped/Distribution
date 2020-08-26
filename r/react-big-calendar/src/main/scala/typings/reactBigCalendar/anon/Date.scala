package typings.reactBigCalendar.anon

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.SFC
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Date extends js.Object {
  var date: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
  ] = js.native
  var event: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
  ] = js.native
  var time: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
  ] = js.native
}

object Date {
  @scala.inline
  def apply(): Date = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Date]
  }
  @scala.inline
  implicit class DateOps[Self <: Date] (val x: Self) extends AnyVal {
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
    def setDate(
      value: SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
    ): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setEvent(
      value: SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
    ): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setTime(
      value: SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
    ): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
  
}

