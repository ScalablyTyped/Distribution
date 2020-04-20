package typings.reactCalendarTimeline.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelFormat extends js.Object {
  var day: TimeFormat
  var hour: TimeFormat
  var minute: TimeFormat
  var month: TimeFormat
  var week: TimeFormat
  var year: TimeFormat
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
}

