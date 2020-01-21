package typings.reactBigCalendar.mod

import typings.reactBigCalendar.reactBigCalendarStrings.agenda_
import typings.reactBigCalendar.reactBigCalendarStrings.day_
import typings.reactBigCalendar.reactBigCalendarStrings.month_
import typings.reactBigCalendar.reactBigCalendarStrings.week_
import typings.reactBigCalendar.reactBigCalendarStrings.work_week_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactBigCalendar.reactBigCalendarStrings.month_
  - typings.reactBigCalendar.reactBigCalendarStrings.week_
  - typings.reactBigCalendar.reactBigCalendarStrings.work_week_
  - typings.reactBigCalendar.reactBigCalendarStrings.day_
  - typings.reactBigCalendar.reactBigCalendarStrings.agenda_
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

