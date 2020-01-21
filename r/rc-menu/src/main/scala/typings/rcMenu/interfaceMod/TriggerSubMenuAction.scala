package typings.rcMenu.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rcMenu.rcMenuStrings.click
  - typings.rcMenu.rcMenuStrings.hover
*/
trait TriggerSubMenuAction extends js.Object

object TriggerSubMenuAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def click: typings.rcMenu.rcMenuStrings.click = this.cast("click")
  @scala.inline
  def hover: typings.rcMenu.rcMenuStrings.hover = this.cast("hover")
}

