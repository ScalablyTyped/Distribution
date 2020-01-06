package typings.strange.strangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.strange.strangeStrings.LeftparenthesisRightparenthesis
  - typings.strange.strangeStrings.`[]`
  - typings.strange.strangeStrings.`[Rightparenthesis`
  - typings.strange.strangeStrings.`Leftparenthesis]`
*/
trait Bounds extends js.Object

object Bounds {
  @scala.inline
  def LeftparenthesisRightparenthesis: typings.strange.strangeStrings.LeftparenthesisRightparenthesis = this.cast("()")
  @scala.inline
  def `Leftparenthesis]`: typings.strange.strangeStrings.`Leftparenthesis]` = this.cast("(]")
  @scala.inline
  def `[Rightparenthesis`: typings.strange.strangeStrings.`[Rightparenthesis` = this.cast("[)")
  @scala.inline
  def `[]`: typings.strange.strangeStrings.`[]` = this.cast("[]")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

