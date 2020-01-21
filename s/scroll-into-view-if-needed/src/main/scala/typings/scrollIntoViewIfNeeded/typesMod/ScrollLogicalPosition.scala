package typings.scrollIntoViewIfNeeded.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.scrollIntoViewIfNeeded.scrollIntoViewIfNeededStrings.start
  - typings.scrollIntoViewIfNeeded.scrollIntoViewIfNeededStrings.center
  - typings.scrollIntoViewIfNeeded.scrollIntoViewIfNeededStrings.end
  - typings.scrollIntoViewIfNeeded.scrollIntoViewIfNeededStrings.nearest
*/
trait ScrollLogicalPosition extends js.Object

object ScrollLogicalPosition {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.scrollIntoViewIfNeeded.scrollIntoViewIfNeededStrings.center = this.cast("center")
  @scala.inline
  def end: typings.scrollIntoViewIfNeeded.scrollIntoViewIfNeededStrings.end = this.cast("end")
  @scala.inline
  def nearest: typings.scrollIntoViewIfNeeded.scrollIntoViewIfNeededStrings.nearest = this.cast("nearest")
  @scala.inline
  def start: typings.scrollIntoViewIfNeeded.scrollIntoViewIfNeededStrings.start = this.cast("start")
}

