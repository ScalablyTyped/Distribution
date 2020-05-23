package typings.sharepoint.CUI.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageComponent extends ICommandHandler {
  def getFocusedCommands(): js.Array[String]
  def getGlobalCommands(): js.Array[String]
  def getId(): String
  def init(): Unit
  def isFocusable(): Boolean
  def receiveFocus(): Boolean
  def yieldFocus(): Boolean
}

object PageComponent {
  @scala.inline
  def apply(
    canHandleCommand: String => Boolean,
    getFocusedCommands: () => js.Array[String],
    getGlobalCommands: () => js.Array[String],
    getId: () => String,
    handleCommand: (String, js.Any, Double) => Boolean,
    init: () => Unit,
    isFocusable: () => Boolean,
    receiveFocus: () => Boolean,
    yieldFocus: () => Boolean
  ): PageComponent = {
    val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), getFocusedCommands = js.Any.fromFunction0(getFocusedCommands), getGlobalCommands = js.Any.fromFunction0(getGlobalCommands), getId = js.Any.fromFunction0(getId), handleCommand = js.Any.fromFunction3(handleCommand), init = js.Any.fromFunction0(init), isFocusable = js.Any.fromFunction0(isFocusable), receiveFocus = js.Any.fromFunction0(receiveFocus), yieldFocus = js.Any.fromFunction0(yieldFocus))
    __obj.asInstanceOf[PageComponent]
  }
}

