package typings.reactDates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// shapes/FocusedInputShape.js
/* Rewritten from type alias, can be one of: 
  - typings.reactDates.reactDatesStrings.startDate
  - typings.reactDates.reactDatesStrings.endDate
*/
trait FocusedInputShape extends js.Object

object FocusedInputShape {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def endDate: typings.reactDates.reactDatesStrings.endDate = this.cast("endDate")
  @scala.inline
  def startDate: typings.reactDates.reactDatesStrings.startDate = this.cast("startDate")
}

