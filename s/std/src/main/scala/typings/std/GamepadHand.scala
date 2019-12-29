package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings._empty
  - typings.std.stdStrings.left
  - typings.std.stdStrings.right
*/
trait GamepadHand extends js.Object

object GamepadHand {
  @scala.inline
  def _empty: typings.std.stdStrings._empty = this.cast("")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typings.std.stdStrings.left = this.cast("left")
  @scala.inline
  def right: typings.std.stdStrings.right = this.cast("right")
}

