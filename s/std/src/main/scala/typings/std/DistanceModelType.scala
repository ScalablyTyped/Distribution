package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.linear
  - typings.std.stdStrings.inverse
  - typings.std.stdStrings.exponential
*/
trait DistanceModelType extends js.Object

object DistanceModelType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exponential: typings.std.stdStrings.exponential = this.cast("exponential")
  @scala.inline
  def inverse: typings.std.stdStrings.inverse = this.cast("inverse")
  @scala.inline
  def linear: typings.std.stdStrings.linear = this.cast("linear")
}

