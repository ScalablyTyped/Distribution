package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

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
    val __obj = js.Dynamic.literal(day = day, hour = hour, minute = minute, month = month, week = week, year = year)
  
    __obj.asInstanceOf[LabelFormat]
  }
}

