package typings.reactInteractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactInteractive.reactInteractiveStrings.normal
  - typings.reactInteractive.reactInteractiveStrings.hover
  - typings.reactInteractive.reactInteractiveStrings.hoverActive
  - typings.reactInteractive.reactInteractiveStrings.touchActive
  - typings.reactInteractive.reactInteractiveStrings.keyActive
*/
trait IState extends js.Object

object IState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hover: typings.reactInteractive.reactInteractiveStrings.hover = this.cast("hover")
  @scala.inline
  def hoverActive: typings.reactInteractive.reactInteractiveStrings.hoverActive = this.cast("hoverActive")
  @scala.inline
  def keyActive: typings.reactInteractive.reactInteractiveStrings.keyActive = this.cast("keyActive")
  @scala.inline
  def normal: typings.reactInteractive.reactInteractiveStrings.normal = this.cast("normal")
  @scala.inline
  def touchActive: typings.reactInteractive.reactInteractiveStrings.touchActive = this.cast("touchActive")
}

