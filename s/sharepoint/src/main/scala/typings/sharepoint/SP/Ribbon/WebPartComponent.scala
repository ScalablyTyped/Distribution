package typings.sharepoint.SP.Ribbon

import typings.sharepoint.CUI.Page.PageComponent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPartComponent extends PageComponent {
  def selectWebPart(zc: HTMLElement, setNextRibbonTab: Boolean): Unit
}

object WebPartComponent {
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
    selectWebPart: (HTMLElement, Boolean) => Unit,
    yieldFocus: () => Boolean
  ): WebPartComponent = {
    val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), getFocusedCommands = js.Any.fromFunction0(getFocusedCommands), getGlobalCommands = js.Any.fromFunction0(getGlobalCommands), getId = js.Any.fromFunction0(getId), handleCommand = js.Any.fromFunction3(handleCommand), init = js.Any.fromFunction0(init), isFocusable = js.Any.fromFunction0(isFocusable), receiveFocus = js.Any.fromFunction0(receiveFocus), selectWebPart = js.Any.fromFunction2(selectWebPart), yieldFocus = js.Any.fromFunction0(yieldFocus))
    __obj.asInstanceOf[WebPartComponent]
  }
}

