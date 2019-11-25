package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.round
  - typings.std.stdStrings.bevel
  - typings.std.stdStrings.miter
*/
trait CanvasLineJoin extends js.Object

object CanvasLineJoin {
  @scala.inline
  def bevel: typings.std.stdStrings.bevel = this.cast("bevel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def miter: typings.std.stdStrings.miter = this.cast("miter")
  @scala.inline
  def round: typings.std.stdStrings.round = this.cast("round")
}

