package typings.reactDates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// shape/ScrollableOrientationShape.js
/* Rewritten from type alias, can be one of: 
  - typings.reactDates.reactDatesStrings.horizontal
  - typings.reactDates.reactDatesStrings.vertical
  - typings.reactDates.reactDatesStrings.verticalScrollable
*/
trait ScrollableOrientationShape extends js.Object

object ScrollableOrientationShape {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def horizontal: typings.reactDates.reactDatesStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def vertical: typings.reactDates.reactDatesStrings.vertical = this.cast("vertical")
  @scala.inline
  def verticalScrollable: typings.reactDates.reactDatesStrings.verticalScrollable = this.cast("verticalScrollable")
}

