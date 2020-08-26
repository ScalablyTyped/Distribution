package typings.reactCalendarTimeline.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelFormat extends js.Object {
  var day: TimeFormat = js.native
  var hour: TimeFormat = js.native
  var minute: TimeFormat = js.native
  var month: TimeFormat = js.native
  var week: TimeFormat = js.native
  var year: TimeFormat = js.native
}

object LabelFormat {
  @scala.inline
  def apply(
    day: TimeFormat,
    hour: TimeFormat,
    minute: TimeFormat,
    month: TimeFormat,
    week: TimeFormat,
    year: TimeFormat
  ): LabelFormat = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelFormat]
  }
  @scala.inline
  implicit class LabelFormatOps[Self <: LabelFormat] (val x: Self) extends AnyVal {
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
    def setDay(value: TimeFormat): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def setHour(value: TimeFormat): Self = this.set("hour", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinute(value: TimeFormat): Self = this.set("minute", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonth(value: TimeFormat): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeek(value: TimeFormat): Self = this.set("week", value.asInstanceOf[js.Any])
    @scala.inline
    def setYear(value: TimeFormat): Self = this.set("year", value.asInstanceOf[js.Any])
  }
  
}

