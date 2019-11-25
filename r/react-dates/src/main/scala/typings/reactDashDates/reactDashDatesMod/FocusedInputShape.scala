package typings.reactDashDates.reactDashDatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// shapes/FocusedInputShape.js
/* Rewritten from type alias, can be one of: 
  - typings.reactDashDates.reactDashDatesStrings.startDate
  - typings.reactDashDates.reactDashDatesStrings.endDate
*/
trait FocusedInputShape extends js.Object

object FocusedInputShape {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def endDate: typings.reactDashDates.reactDashDatesStrings.endDate = this.cast("endDate")
  @scala.inline
  def startDate: typings.reactDashDates.reactDashDatesStrings.startDate = this.cast("startDate")
}

