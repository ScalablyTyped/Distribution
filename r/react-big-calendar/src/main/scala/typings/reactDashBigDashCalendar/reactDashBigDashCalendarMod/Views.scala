package typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.agenda
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.day
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.month
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.week
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.work_week
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Views extends js.Object {
  var AGENDA: agenda
  var DAY: day
  var MONTH: month
  var WEEK: week
  var WORK_WEEK: work_week
}

object Views {
  @scala.inline
  def apply(AGENDA: agenda, DAY: day, MONTH: month, WEEK: week, WORK_WEEK: work_week): Views = {
    val __obj = js.Dynamic.literal(AGENDA = AGENDA, DAY = DAY, MONTH = MONTH, WEEK = WEEK, WORK_WEEK = WORK_WEEK)
  
    __obj.asInstanceOf[Views]
  }
}

