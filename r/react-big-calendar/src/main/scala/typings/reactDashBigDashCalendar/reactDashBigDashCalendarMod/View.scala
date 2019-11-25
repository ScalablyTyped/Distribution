package typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.agenda_
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.day_
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.month_
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.week_
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.work_week_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.month_
  - typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.week_
  - typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.work_week_
  - typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.day_
  - typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.agenda_
*/
trait View extends js.Object

object View {
  @scala.inline
  def agenda: agenda_ = this.cast("agenda")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def day: day_ = this.cast("day")
  @scala.inline
  def month: month_ = this.cast("month")
  @scala.inline
  def week: week_ = this.cast("week")
  @scala.inline
  def work_week: work_week_ = this.cast("work_week")
}

