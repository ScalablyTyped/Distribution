package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.nonzero
  - typings.std.stdStrings.evenodd
*/
trait CanvasFillRule extends js.Object

object CanvasFillRule {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def evenodd: typings.std.stdStrings.evenodd = this.cast("evenodd")
  @scala.inline
  def nonzero: typings.std.stdStrings.nonzero = this.cast("nonzero")
}

