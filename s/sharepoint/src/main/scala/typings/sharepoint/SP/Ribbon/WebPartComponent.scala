package typings.sharepoint.SP.Ribbon

import typings.sharepoint.CUI.Page.PageComponent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPartComponent extends PageComponent {
  def selectWebPart(zc: HTMLElement, setNextRibbonTab: Boolean): Unit = js.native
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
  @scala.inline
  implicit class WebPartComponentOps[Self <: WebPartComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSelectWebPart(value: (HTMLElement, Boolean) => Unit): Self = this.set("selectWebPart", js.Any.fromFunction2(value))
  }
  
}

