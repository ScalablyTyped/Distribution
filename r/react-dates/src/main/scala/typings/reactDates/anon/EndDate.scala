package typings.reactDates.anon

import typings.reactDates.mod.momentPropTypes.momentObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndDate extends js.Object {
  var endDate: momentObj | Null = js.native
  var startDate: momentObj | Null = js.native
}

object EndDate {
  @scala.inline
  def apply(): EndDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndDate]
  }
  @scala.inline
  implicit class EndDateOps[Self <: EndDate] (val x: Self) extends AnyVal {
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
    def setEndDate(value: momentObj): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndDateNull: Self = this.set("endDate", null)
    @scala.inline
    def setStartDate(value: momentObj): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartDateNull: Self = this.set("startDate", null)
  }
  
}

