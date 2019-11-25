package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.`very-low`
  - typings.std.stdStrings.low
  - typings.std.stdStrings.medium
  - typings.std.stdStrings.high
*/
trait RTCPriorityType extends js.Object

object RTCPriorityType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typings.std.stdStrings.high = this.cast("high")
  @scala.inline
  def low: typings.std.stdStrings.low = this.cast("low")
  @scala.inline
  def medium: typings.std.stdStrings.medium = this.cast("medium")
  @scala.inline
  def `very-low`: typings.std.stdStrings.`very-low` = this.cast("very-low")
}

