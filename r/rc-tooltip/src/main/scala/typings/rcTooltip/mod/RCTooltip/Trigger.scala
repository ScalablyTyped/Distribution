package typings.rcTooltip.mod.RCTooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rcTooltip.rcTooltipStrings.hover
  - typings.rcTooltip.rcTooltipStrings.click
  - typings.rcTooltip.rcTooltipStrings.focus
*/
trait Trigger extends js.Object

object Trigger {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def click: typings.rcTooltip.rcTooltipStrings.click = this.cast("click")
  @scala.inline
  def focus: typings.rcTooltip.rcTooltipStrings.focus = this.cast("focus")
  @scala.inline
  def hover: typings.rcTooltip.rcTooltipStrings.hover = this.cast("hover")
}

