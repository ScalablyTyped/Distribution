package typings.strange.strangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.strange.strangeStrings.LeftparenthesisRightparenthesis
  - typings.strange.strangeStrings.LeftsquarebracketRightsquarebracket
  - typings.strange.strangeStrings.LeftsquarebracketRightparenthesis
  - typings.strange.strangeStrings.LeftparenthesisRightsquarebracket
*/
trait Bounds extends js.Object

object Bounds {
  @scala.inline
  def LeftparenthesisRightparenthesis: typings.strange.strangeStrings.LeftparenthesisRightparenthesis = this.cast("()")
  @scala.inline
  def LeftparenthesisRightsquarebracket: typings.strange.strangeStrings.LeftparenthesisRightsquarebracket = this.cast("(]")
  @scala.inline
  def LeftsquarebracketRightparenthesis: typings.strange.strangeStrings.LeftsquarebracketRightparenthesis = this.cast("[)")
  @scala.inline
  def LeftsquarebracketRightsquarebracket: typings.strange.strangeStrings.LeftsquarebracketRightsquarebracket = this.cast("[]")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

