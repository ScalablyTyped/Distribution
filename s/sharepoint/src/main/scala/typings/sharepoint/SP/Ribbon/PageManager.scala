package typings.sharepoint.SP.Ribbon

import typings.sharepoint.CUI.Component
import typings.sharepoint.CUI.Page.CommandDispatcher
import typings.sharepoint.CUI.Page.FocusManager
import typings.sharepoint.CUI.Page.UndoManager
import typings.sharepoint.CUI.Root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageManager
  extends typings.sharepoint.CUI.Page.PageManager {
  def addPageComponent(component: Component): Unit
  def get_ribbon(): typings.sharepoint.SP.Ribbon.Ribbon
  def isRootCommandEnabled(commandId: String, root: Root): Boolean
  def onRootRefreshed(root: Root): Unit
  def removePageComponent(component: Component): Unit
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
}

