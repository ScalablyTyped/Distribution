package typings.reactTooltip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactTooltip.reactTooltipStrings.float
  - typings.reactTooltip.reactTooltipStrings.solid
*/
trait Effect extends js.Object

object Effect {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def float: typings.reactTooltip.reactTooltipStrings.float = this.cast("float")
  @scala.inline
  def solid: typings.reactTooltip.reactTooltipStrings.solid = this.cast("solid")
}

