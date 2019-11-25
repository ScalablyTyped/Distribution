package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.top
  - typings.std.stdStrings.hanging
  - typings.std.stdStrings.middle
  - typings.std.stdStrings.alphabetic
  - typings.std.stdStrings.ideographic
  - typings.std.stdStrings.bottom
*/
trait CanvasTextBaseline extends js.Object

object CanvasTextBaseline {
  @scala.inline
  def alphabetic: typings.std.stdStrings.alphabetic = this.cast("alphabetic")
  @scala.inline
  def bottom: typings.std.stdStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hanging: typings.std.stdStrings.hanging = this.cast("hanging")
  @scala.inline
  def ideographic: typings.std.stdStrings.ideographic = this.cast("ideographic")
  @scala.inline
  def middle: typings.std.stdStrings.middle = this.cast("middle")
  @scala.inline
  def top: typings.std.stdStrings.top = this.cast("top")
}

