package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.raphael.raphaelStrings.start
  - typings.raphael.raphaelStrings.middle
  - typings.raphael.raphaelStrings.end
*/
trait RaphaelTextAnchorType extends js.Object

object RaphaelTextAnchorType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def end: typings.raphael.raphaelStrings.end = this.cast("end")
  @scala.inline
  def middle: typings.raphael.raphaelStrings.middle = this.cast("middle")
  @scala.inline
  def start: typings.raphael.raphaelStrings.start = this.cast("start")
}

