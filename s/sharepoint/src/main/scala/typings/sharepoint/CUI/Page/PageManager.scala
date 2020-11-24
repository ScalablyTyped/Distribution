package typings.sharepoint.CUI.Page

import typings.sharepoint.CUI.IRootBuildClient
import typings.sharepoint.CUI.RootUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageManager
  extends RootUser
     with ICommandHandler
     with IRootBuildClient {
  
  def add_ribbonInited(value: js.Function0[Unit]): js.Any = js.native
  
  def get_commandDispatcher(): CommandDispatcher = js.native
  
  def get_focusManager(): FocusManager = js.native
  
  def get_undoManager(): UndoManager = js.native
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
    def setAdd_ribbonInited(value: js.Function0[Unit] => js.Any): Self = this.set("add_ribbonInited", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet_commandDispatcher(value: () => CommandDispatcher): Self = this.set("get_commandDispatcher", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_focusManager(value: () => FocusManager): Self = this.set("get_focusManager", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_undoManager(value: () => UndoManager): Self = this.set("get_undoManager", js.Any.fromFunction0(value))
  }
}
