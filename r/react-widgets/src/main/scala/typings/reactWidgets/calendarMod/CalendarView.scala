package typings.reactWidgets.calendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactWidgets.reactWidgetsStrings.month
  - typings.reactWidgets.reactWidgetsStrings.year
  - typings.reactWidgets.reactWidgetsStrings.decade
  - typings.reactWidgets.reactWidgetsStrings.century
*/
trait CalendarView extends js.Object

object CalendarView {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def century: typings.reactWidgets.reactWidgetsStrings.century = this.cast("century")
  @scala.inline
  def decade: typings.reactWidgets.reactWidgetsStrings.decade = this.cast("decade")
  @scala.inline
  def month: typings.reactWidgets.reactWidgetsStrings.month = this.cast("month")
  @scala.inline
  def year: typings.reactWidgets.reactWidgetsStrings.year = this.cast("year")
}

