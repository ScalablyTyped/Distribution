package typings.reactInteractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactInteractive.reactInteractiveStrings.mouseClick
  - typings.reactInteractive.reactInteractiveStrings.tapClick
  - typings.reactInteractive.reactInteractiveStrings.keyClick
*/
trait ClickType extends js.Object

object ClickType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def keyClick: typings.reactInteractive.reactInteractiveStrings.keyClick = this.cast("keyClick")
  @scala.inline
  def mouseClick: typings.reactInteractive.reactInteractiveStrings.mouseClick = this.cast("mouseClick")
  @scala.inline
  def tapClick: typings.reactInteractive.reactInteractiveStrings.tapClick = this.cast("tapClick")
}

