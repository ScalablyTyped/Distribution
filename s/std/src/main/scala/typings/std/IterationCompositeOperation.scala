package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.replace
  - typings.std.stdStrings.accumulate
*/
trait IterationCompositeOperation extends js.Object

object IterationCompositeOperation {
  @scala.inline
  def accumulate: typings.std.stdStrings.accumulate = this.cast("accumulate")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def replace: typings.std.stdStrings.replace = this.cast("replace")
}

