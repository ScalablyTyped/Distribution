package typings.sharepoint.global.SP.Ribbon

import typings.sharepoint.CUI.Component
import typings.sharepoint.CUI.Page.CommandDispatcher
import typings.sharepoint.CUI.Page.FocusManager
import typings.sharepoint.CUI.Page.UndoManager
import typings.sharepoint.CUI.Root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Ribbon.PageManager")
@js.native
class PageManager ()
  extends typings.sharepoint.SP.Ribbon.PageManager {
  /* CompleteClass */
  override def addPageComponent(component: Component): Unit = js.native
  /* CompleteClass */
  override def add_ribbonInited(value: js.Function0[Unit]): js.Any = js.native
  /* CompleteClass */
  override def canHandleCommand(commandId: String): Boolean = js.native
  /* CompleteClass */
  override def get_commandDispatcher(): CommandDispatcher = js.native
  /* CompleteClass */
  override def get_focusManager(): FocusManager = js.native
  /* CompleteClass */
  override def get_ribbon(): typings.sharepoint.SP.Ribbon.Ribbon = js.native
  /* CompleteClass */
  override def get_undoManager(): UndoManager = js.native
  /* CompleteClass */
  override def handleCommand(commandId: String, properties: js.Any, sequenceNumber: Double): Boolean = js.native
  /* CompleteClass */
  override def isRootCommandEnabled(commandId: String, root: Root): Boolean = js.native
  /* CompleteClass */
  override def onRootRefreshed(root: Root): Unit = js.native
  /* CompleteClass */
  override def removePageComponent(component: Component): Unit = js.native
}

/* static members */
@JSGlobal("SP.Ribbon.PageManager")
@js.native
object PageManager extends js.Object {
  def get_instance(): typings.sharepoint.SP.Ribbon.PageManager = js.native
}

