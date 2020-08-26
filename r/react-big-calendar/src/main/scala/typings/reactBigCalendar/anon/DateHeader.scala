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
trait DateHeader extends js.Object {
  var dateHeader: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
  ] = js.native
  var event: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
  ] = js.native
  var header: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
  ] = js.native
}

object DateHeader {
  @scala.inline
  def apply(): DateHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateHeader]
  }
  @scala.inline
  implicit class DateHeaderOps[Self <: DateHeader] (val x: Self) extends AnyVal {
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
    def setDateHeader(
      value: SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
    ): Self = this.set("dateHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateHeader: Self = this.set("dateHeader", js.undefined)
    @scala.inline
    def setEvent(
      value: SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
    ): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setHeader(
      value: SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
    ): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
  }
  
}

