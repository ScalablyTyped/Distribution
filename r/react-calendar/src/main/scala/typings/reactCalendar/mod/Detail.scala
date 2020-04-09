package typings.reactCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactCalendar.reactCalendarStrings.month
  - typings.reactCalendar.reactCalendarStrings.year
  - typings.reactCalendar.reactCalendarStrings.decade
  - typings.reactCalendar.reactCalendarStrings.century
*/
trait Detail extends js.Object

object Detail {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def century: typings.reactCalendar.reactCalendarStrings.century = this.cast("century")
  @scala.inline
  def decade: typings.reactCalendar.reactCalendarStrings.decade = this.cast("decade")
  @scala.inline
  def month: typings.reactCalendar.reactCalendarStrings.month = this.cast("month")
  @scala.inline
  def year: typings.reactCalendar.reactCalendarStrings.year = this.cast("year")
}

