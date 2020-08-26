package typings.reactCalendar.anon

import typings.reactCalendar.mod.Detail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Date extends js.Object {
  var date: typings.std.Date = js.native
  var label: String = js.native
  var view: Detail = js.native
}

object Date {
  @scala.inline
  def apply(date: typings.std.Date, label: String, view: Detail): Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
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
    def setDate(value: typings.std.Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setView(value: Detail): Self = this.set("view", value.asInstanceOf[js.Any])
  }
  
}

