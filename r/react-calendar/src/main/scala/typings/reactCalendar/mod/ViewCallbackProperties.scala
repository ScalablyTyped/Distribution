package typings.reactCalendar.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewCallbackProperties extends js.Object {
  var activeStartDate: Date = js.native
  var view: Detail = js.native
}

object ViewCallbackProperties {
  @scala.inline
  def apply(activeStartDate: Date, view: Detail): ViewCallbackProperties = {
    val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewCallbackProperties]
  }
  @scala.inline
  implicit class ViewCallbackPropertiesOps[Self <: ViewCallbackProperties] (val x: Self) extends AnyVal {
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
    def setActiveStartDate(value: Date): Self = this.set("activeStartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setView(value: Detail): Self = this.set("view", value.asInstanceOf[js.Any])
  }
  
}

