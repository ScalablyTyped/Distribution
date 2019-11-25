package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.start
  - typings.std.stdStrings.end
  - typings.std.stdStrings.left
  - typings.std.stdStrings.right
  - typings.std.stdStrings.center
*/
trait CanvasTextAlign extends js.Object

object CanvasTextAlign {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.std.stdStrings.center = this.cast("center")
  @scala.inline
  def end: typings.std.stdStrings.end = this.cast("end")
  @scala.inline
  def left: typings.std.stdStrings.left = this.cast("left")
  @scala.inline
  def right: typings.std.stdStrings.right = this.cast("right")
  @scala.inline
  def start: typings.std.stdStrings.start = this.cast("start")
}

