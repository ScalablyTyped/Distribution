package typings.reactInteractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactInteractive.reactInteractiveBooleans.`false`
  - typings.reactInteractive.reactInteractiveStrings.tab
  - typings.reactInteractive.reactInteractiveStrings.mouse
  - typings.reactInteractive.reactInteractiveStrings.touch
*/
trait Focus extends js.Object

object Focus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `false`: typings.reactInteractive.reactInteractiveBooleans.`false` = this.cast(false)
  @scala.inline
  def mouse: typings.reactInteractive.reactInteractiveStrings.mouse = this.cast("mouse")
  @scala.inline
  def tab: typings.reactInteractive.reactInteractiveStrings.tab = this.cast("tab")
  @scala.inline
  def touch: typings.reactInteractive.reactInteractiveStrings.touch = this.cast("touch")
}

