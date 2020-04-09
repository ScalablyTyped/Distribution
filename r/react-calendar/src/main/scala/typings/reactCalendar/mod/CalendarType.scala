package typings.reactCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactCalendar.reactCalendarStrings.`ISO 8601`
  - typings.reactCalendar.reactCalendarStrings.US
  - typings.reactCalendar.reactCalendarStrings.Arabic
  - typings.reactCalendar.reactCalendarStrings.Hebrew
*/
trait CalendarType extends js.Object

object CalendarType {
  @scala.inline
  def Arabic: typings.reactCalendar.reactCalendarStrings.Arabic = this.cast("Arabic")
  @scala.inline
  def Hebrew: typings.reactCalendar.reactCalendarStrings.Hebrew = this.cast("Hebrew")
  @scala.inline
  def `ISO 8601`: typings.reactCalendar.reactCalendarStrings.`ISO 8601` = this.cast("ISO 8601")
  @scala.inline
  def US: typings.reactCalendar.reactCalendarStrings.US = this.cast("US")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

