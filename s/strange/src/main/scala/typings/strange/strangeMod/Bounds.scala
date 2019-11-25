package typings.strange.strangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.strange.strangeStrings.`()`
  - typings.strange.strangeStrings.`[]`
  - typings.strange.strangeStrings.`[)`
  - typings.strange.strangeStrings.`(]`
*/
trait Bounds extends js.Object

object Bounds {
  @scala.inline
  def `()`: typings.strange.strangeStrings.`()` = this.cast("()")
  @scala.inline
  def `(]`: typings.strange.strangeStrings.`(]` = this.cast("(]")
  @scala.inline
  def `[)`: typings.strange.strangeStrings.`[)` = this.cast("[)")
  @scala.inline
  def `[]`: typings.strange.strangeStrings.`[]` = this.cast("[]")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

