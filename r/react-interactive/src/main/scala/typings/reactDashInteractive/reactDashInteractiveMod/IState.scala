package typings.reactDashInteractive.reactDashInteractiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashInteractive.reactDashInteractiveStrings.normal
  - typings.reactDashInteractive.reactDashInteractiveStrings.hover
  - typings.reactDashInteractive.reactDashInteractiveStrings.hoverActive
  - typings.reactDashInteractive.reactDashInteractiveStrings.touchActive
  - typings.reactDashInteractive.reactDashInteractiveStrings.keyActive
*/
trait IState extends js.Object

object IState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hover: typings.reactDashInteractive.reactDashInteractiveStrings.hover = this.cast("hover")
  @scala.inline
  def hoverActive: typings.reactDashInteractive.reactDashInteractiveStrings.hoverActive = this.cast("hoverActive")
  @scala.inline
  def keyActive: typings.reactDashInteractive.reactDashInteractiveStrings.keyActive = this.cast("keyActive")
  @scala.inline
  def normal: typings.reactDashInteractive.reactDashInteractiveStrings.normal = this.cast("normal")
  @scala.inline
  def touchActive: typings.reactDashInteractive.reactDashInteractiveStrings.touchActive = this.cast("touchActive")
}

