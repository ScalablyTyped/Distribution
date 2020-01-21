package typings.reactTooltip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactTooltip.reactTooltipStrings.top
  - typings.reactTooltip.reactTooltipStrings.right
  - typings.reactTooltip.reactTooltipStrings.bottom
  - typings.reactTooltip.reactTooltipStrings.left
*/
trait Place extends js.Object

object Place {
  @scala.inline
  def bottom: typings.reactTooltip.reactTooltipStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typings.reactTooltip.reactTooltipStrings.left = this.cast("left")
  @scala.inline
  def right: typings.reactTooltip.reactTooltipStrings.right = this.cast("right")
  @scala.inline
  def top: typings.reactTooltip.reactTooltipStrings.top = this.cast("top")
}

