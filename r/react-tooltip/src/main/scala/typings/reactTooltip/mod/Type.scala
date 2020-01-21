package typings.reactTooltip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactTooltip.reactTooltipStrings.dark
  - typings.reactTooltip.reactTooltipStrings.success
  - typings.reactTooltip.reactTooltipStrings.warning
  - typings.reactTooltip.reactTooltipStrings.error
  - typings.reactTooltip.reactTooltipStrings.info
  - typings.reactTooltip.reactTooltipStrings.light
*/
trait Type extends js.Object

object Type {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dark: typings.reactTooltip.reactTooltipStrings.dark = this.cast("dark")
  @scala.inline
  def error: typings.reactTooltip.reactTooltipStrings.error = this.cast("error")
  @scala.inline
  def info: typings.reactTooltip.reactTooltipStrings.info = this.cast("info")
  @scala.inline
  def light: typings.reactTooltip.reactTooltipStrings.light = this.cast("light")
  @scala.inline
  def success: typings.reactTooltip.reactTooltipStrings.success = this.cast("success")
  @scala.inline
  def warning: typings.reactTooltip.reactTooltipStrings.warning = this.cast("warning")
}

