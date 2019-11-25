package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.replace
  - typings.std.stdStrings.add
  - typings.std.stdStrings.accumulate
  - typings.std.stdStrings.auto
*/
trait CompositeOperationOrAuto extends js.Object

object CompositeOperationOrAuto {
  @scala.inline
  def accumulate: typings.std.stdStrings.accumulate = this.cast("accumulate")
  @scala.inline
  def add: typings.std.stdStrings.add = this.cast("add")
  @scala.inline
  def auto: typings.std.stdStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def replace: typings.std.stdStrings.replace = this.cast("replace")
}

