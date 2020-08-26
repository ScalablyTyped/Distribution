package typings.sharepoint.CUI.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageComponent extends ICommandHandler {
  def getFocusedCommands(): js.Array[String] = js.native
  def getGlobalCommands(): js.Array[String] = js.native
  def getId(): String = js.native
  def init(): Unit = js.native
  def isFocusable(): Boolean = js.native
  def receiveFocus(): Boolean = js.native
  def yieldFocus(): Boolean = js.native
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
  @scala.inline
  implicit class PageComponentOps[Self <: PageComponent] (val x: Self) extends AnyVal {
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
    def setGetFocusedCommands(value: () => js.Array[String]): Self = this.set("getFocusedCommands", js.Any.fromFunction0(value))
    @scala.inline
    def setGetGlobalCommands(value: () => js.Array[String]): Self = this.set("getGlobalCommands", js.Any.fromFunction0(value))
    @scala.inline
    def setGetId(value: () => String): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    @scala.inline
    def setIsFocusable(value: () => Boolean): Self = this.set("isFocusable", js.Any.fromFunction0(value))
    @scala.inline
    def setReceiveFocus(value: () => Boolean): Self = this.set("receiveFocus", js.Any.fromFunction0(value))
    @scala.inline
    def setYieldFocus(value: () => Boolean): Self = this.set("yieldFocus", js.Any.fromFunction0(value))
  }
  
}

