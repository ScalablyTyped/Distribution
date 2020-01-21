package typings.reactDates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// shapes/CalendarInfoPositionShape.js
/* Rewritten from type alias, can be one of: 
  - typings.reactDates.reactDatesStrings.top
  - typings.reactDates.reactDatesStrings.bottom
  - typings.reactDates.reactDatesStrings.before
  - typings.reactDates.reactDatesStrings.after
*/
trait CalendarInfoPositionShape extends js.Object

object CalendarInfoPositionShape {
  @scala.inline
  def after: typings.reactDates.reactDatesStrings.after = this.cast("after")
  @scala.inline
  def before: typings.reactDates.reactDatesStrings.before = this.cast("before")
  @scala.inline
  def bottom: typings.reactDates.reactDatesStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def top: typings.reactDates.reactDatesStrings.top = this.cast("top")
}

