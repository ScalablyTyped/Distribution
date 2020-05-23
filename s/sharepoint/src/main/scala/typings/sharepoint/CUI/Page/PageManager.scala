package typings.sharepoint.CUI.Page

import typings.sharepoint.CUI.IRootBuildClient
import typings.sharepoint.CUI.RootUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageManager
  extends RootUser
     with ICommandHandler
     with IRootBuildClient {
  def add_ribbonInited(value: js.Function0[Unit]): js.Any
  def get_commandDispatcher(): CommandDispatcher
  def get_focusManager(): FocusManager
  def get_undoManager(): UndoManager
}

object PageManager {
  @scala.inline
  def apply(
    add_ribbonInited: js.Function0[Unit] => js.Any,
    canHandleCommand: String => Boolean,
    get_commandDispatcher: () => CommandDispatcher,
    get_focusManager: () => FocusManager,
    get_undoManager: () => UndoManager,
    handleCommand: (String, js.Any, Double) => Boolean
  ): PageManager = {
    val __obj = js.Dynamic.literal(add_ribbonInited = js.Any.fromFunction1(add_ribbonInited), canHandleCommand = js.Any.fromFunction1(canHandleCommand), get_commandDispatcher = js.Any.fromFunction0(get_commandDispatcher), get_focusManager = js.Any.fromFunction0(get_focusManager), get_undoManager = js.Any.fromFunction0(get_undoManager), handleCommand = js.Any.fromFunction3(handleCommand))
    __obj.asInstanceOf[PageManager]
  }
}

