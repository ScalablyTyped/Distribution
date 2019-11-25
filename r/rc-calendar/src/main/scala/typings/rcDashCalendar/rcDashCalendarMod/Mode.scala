package typings.rcDashCalendar.rcDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rcDashCalendar.rcDashCalendarStrings.time
  - typings.rcDashCalendar.rcDashCalendarStrings.date
  - typings.rcDashCalendar.rcDashCalendarStrings.month
  - typings.rcDashCalendar.rcDashCalendarStrings.year
  - typings.rcDashCalendar.rcDashCalendarStrings.decade
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typings.rcDashCalendar.rcDashCalendarStrings.date = this.cast("date")
  @scala.inline
  def decade: typings.rcDashCalendar.rcDashCalendarStrings.decade = this.cast("decade")
  @scala.inline
  def month: typings.rcDashCalendar.rcDashCalendarStrings.month = this.cast("month")
  @scala.inline
  def time: typings.rcDashCalendar.rcDashCalendarStrings.time = this.cast("time")
  @scala.inline
  def year: typings.rcDashCalendar.rcDashCalendarStrings.year = this.cast("year")
}

