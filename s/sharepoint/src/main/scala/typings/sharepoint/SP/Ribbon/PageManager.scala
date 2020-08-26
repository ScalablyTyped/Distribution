package typings.sharepoint.SP.Ribbon

import typings.sharepoint.CUI.Component
import typings.sharepoint.CUI.Page.CommandDispatcher
import typings.sharepoint.CUI.Page.FocusManager
import typings.sharepoint.CUI.Page.UndoManager
import typings.sharepoint.CUI.Root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageManager
  extends typings.sharepoint.CUI.Page.PageManager {
  def addPageComponent(component: Component): Unit = js.native
  def get_ribbon(): typings.sharepoint.SP.Ribbon.Ribbon = js.native
  def isRootCommandEnabled(commandId: String, root: Root): Boolean = js.native
  def onRootRefreshed(root: Root): Unit = js.native
  def removePageComponent(component: Component): Unit = js.native
}

object PageManager {
  @scala.inline
  def apply(
    addPageComponent: Component => Unit,
    add_ribbonInited: js.Function0[Unit] => js.Any,
    canHandleCommand: String => Boolean,
    get_commandDispatcher: () => CommandDispatcher,
    get_focusManager: () => FocusManager,
    get_ribbon: () => typings.sharepoint.SP.Ribbon.Ribbon,
    get_undoManager: () => UndoManager,
    handleCommand: (String, js.Any, Double) => Boolean,
    isRootCommandEnabled: (String, Root) => Boolean,
    onRootRefreshed: Root => Unit,
    removePageComponent: Component => Unit
  ): PageManager = {
    val __obj = js.Dynamic.literal(addPageComponent = js.Any.fromFunction1(addPageComponent), add_ribbonInited = js.Any.fromFunction1(add_ribbonInited), canHandleCommand = js.Any.fromFunction1(canHandleCommand), get_commandDispatcher = js.Any.fromFunction0(get_commandDispatcher), get_focusManager = js.Any.fromFunction0(get_focusManager), get_ribbon = js.Any.fromFunction0(get_ribbon), get_undoManager = js.Any.fromFunction0(get_undoManager), handleCommand = js.Any.fromFunction3(handleCommand), isRootCommandEnabled = js.Any.fromFunction2(isRootCommandEnabled), onRootRefreshed = js.Any.fromFunction1(onRootRefreshed), removePageComponent = js.Any.fromFunction1(removePageComponent))
    __obj.asInstanceOf[PageManager]
  }
  @scala.inline
  implicit class PageManagerOps[Self <: PageManager] (val x: Self) extends AnyVal {
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
    def setAddPageComponent(value: Component => Unit): Self = this.set("addPageComponent", js.Any.fromFunction1(value))
    @scala.inline
    def setGet_ribbon(value: () => typings.sharepoint.SP.Ribbon.Ribbon): Self = this.set("get_ribbon", js.Any.fromFunction0(value))
    @scala.inline
    def setIsRootCommandEnabled(value: (String, Root) => Boolean): Self = this.set("isRootCommandEnabled", js.Any.fromFunction2(value))
    @scala.inline
    def setOnRootRefreshed(value: Root => Unit): Self = this.set("onRootRefreshed", js.Any.fromFunction1(value))
    @scala.inline
    def setRemovePageComponent(value: Component => Unit): Self = this.set("removePageComponent", js.Any.fromFunction1(value))
  }
  
}

