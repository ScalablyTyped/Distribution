package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings._empty
  - typings.std.stdStrings.maybe
  - typings.std.stdStrings.probably
*/
trait CanPlayTypeResult extends js.Object

object CanPlayTypeResult {
  @scala.inline
  def _empty: typings.std.stdStrings._empty = this.cast("")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def maybe: typings.std.stdStrings.maybe = this.cast("maybe")
  @scala.inline
  def probably: typings.std.stdStrings.probably = this.cast("probably")
}

