package typings.primereact.fullCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullCalendarProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var events: js.UndefOr[js.Array[_]] = js.native
  var id: js.UndefOr[String] = js.native
  var options: js.UndefOr[js.Object] = js.native
  var style: js.UndefOr[js.Object] = js.native
}

object FullCalendarProps {
  @scala.inline
  def apply(): FullCalendarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullCalendarProps]
  }
  @scala.inline
  implicit class FullCalendarPropsOps[Self <: FullCalendarProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setEventsVarargs(value: js.Any*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[_]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

