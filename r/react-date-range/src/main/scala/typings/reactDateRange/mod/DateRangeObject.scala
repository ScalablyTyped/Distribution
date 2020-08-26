package typings.reactDateRange.mod

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateRangeObject extends js.Object {
  def endDate(now: Moment): Moment = js.native
  def startDate(now: Moment): Moment = js.native
}

object DateRangeObject {
  @scala.inline
  def apply(endDate: Moment => Moment, startDate: Moment => Moment): DateRangeObject = {
    val __obj = js.Dynamic.literal(endDate = js.Any.fromFunction1(endDate), startDate = js.Any.fromFunction1(startDate))
    __obj.asInstanceOf[DateRangeObject]
  }
  @scala.inline
  implicit class DateRangeObjectOps[Self <: DateRangeObject] (val x: Self) extends AnyVal {
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
    def setEndDate(value: Moment => Moment): Self = this.set("endDate", js.Any.fromFunction1(value))
    @scala.inline
    def setStartDate(value: Moment => Moment): Self = this.set("startDate", js.Any.fromFunction1(value))
  }
  
}

