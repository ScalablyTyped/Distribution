package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.raphael.raphaelStrings.bevel
  - typings.raphael.raphaelStrings.round
  - typings.raphael.raphaelStrings.miter
*/
trait RaphaelLineJoinType extends js.Object

object RaphaelLineJoinType {
  @scala.inline
  def bevel: typings.raphael.raphaelStrings.bevel = this.cast("bevel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def miter: typings.raphael.raphaelStrings.miter = this.cast("miter")
  @scala.inline
  def round: typings.raphael.raphaelStrings.round = this.cast("round")
}

