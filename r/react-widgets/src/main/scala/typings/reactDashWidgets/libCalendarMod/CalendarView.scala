package typings.reactDashWidgets.libCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashWidgets.reactDashWidgetsStrings.month
  - typings.reactDashWidgets.reactDashWidgetsStrings.year
  - typings.reactDashWidgets.reactDashWidgetsStrings.decade
  - typings.reactDashWidgets.reactDashWidgetsStrings.century
*/
trait CalendarView extends js.Object

object CalendarView {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def century: typings.reactDashWidgets.reactDashWidgetsStrings.century = this.cast("century")
  @scala.inline
  def decade: typings.reactDashWidgets.reactDashWidgetsStrings.decade = this.cast("decade")
  @scala.inline
  def month: typings.reactDashWidgets.reactDashWidgetsStrings.month = this.cast("month")
  @scala.inline
  def year: typings.reactDashWidgets.reactDashWidgetsStrings.year = this.cast("year")
}

