package typings.reactResizable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactResizable.reactResizableStrings.both
  - typings.reactResizable.reactResizableStrings.x
  - typings.reactResizable.reactResizableStrings.y
  - typings.reactResizable.reactResizableStrings.none
*/
trait Axis extends js.Object

object Axis {
  @scala.inline
  def both: typings.reactResizable.reactResizableStrings.both = this.cast("both")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typings.reactResizable.reactResizableStrings.none = this.cast("none")
  @scala.inline
  def x: typings.reactResizable.reactResizableStrings.x = this.cast("x")
  @scala.inline
  def y: typings.reactResizable.reactResizableStrings.y = this.cast("y")
}

