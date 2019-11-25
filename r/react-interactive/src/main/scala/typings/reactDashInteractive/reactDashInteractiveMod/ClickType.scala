package typings.reactDashInteractive.reactDashInteractiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashInteractive.reactDashInteractiveStrings.mouseClick
  - typings.reactDashInteractive.reactDashInteractiveStrings.tapClick
  - typings.reactDashInteractive.reactDashInteractiveStrings.keyClick
*/
trait ClickType extends js.Object

object ClickType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def keyClick: typings.reactDashInteractive.reactDashInteractiveStrings.keyClick = this.cast("keyClick")
  @scala.inline
  def mouseClick: typings.reactDashInteractive.reactDashInteractiveStrings.mouseClick = this.cast("mouseClick")
  @scala.inline
  def tapClick: typings.reactDashInteractive.reactDashInteractiveStrings.tapClick = this.cast("tapClick")
}

