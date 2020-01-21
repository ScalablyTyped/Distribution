package typings.rcCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rcCalendar.rcCalendarStrings.time
  - typings.rcCalendar.rcCalendarStrings.date
  - typings.rcCalendar.rcCalendarStrings.month
  - typings.rcCalendar.rcCalendarStrings.year
  - typings.rcCalendar.rcCalendarStrings.decade
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typings.rcCalendar.rcCalendarStrings.date = this.cast("date")
  @scala.inline
  def decade: typings.rcCalendar.rcCalendarStrings.decade = this.cast("decade")
  @scala.inline
  def month: typings.rcCalendar.rcCalendarStrings.month = this.cast("month")
  @scala.inline
  def time: typings.rcCalendar.rcCalendarStrings.time = this.cast("time")
  @scala.inline
  def year: typings.rcCalendar.rcCalendarStrings.year = this.cast("year")
}

