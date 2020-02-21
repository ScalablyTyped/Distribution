package typings.sharepoint.CUI.Page

import typings.sharepoint.CUI.IRootBuildClient
import typings.sharepoint.CUI.RootUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.Page.PageManager")
@js.native
class PageManager ()
  extends RootUser
     with ICommandHandler
     with IRootBuildClient {
  def add_ribbonInited(value: js.Function0[Unit]): js.Any = js.native
  /* CompleteClass */
  override def canHandleCommand(commandId: String): Boolean = js.native
  def get_commandDispatcher(): CommandDispatcher = js.native
  def get_focusManager(): FocusManager = js.native
  def get_undoManager(): UndoManager = js.native
  /* CompleteClass */
  override def handleCommand(commandId: String, properties: js.Any, sequenceNumber: Double): Boolean = js.native
}

/* static members */
@JSGlobal("CUI.Page.PageManager")
@js.native
object PageManager extends js.Object {
  def createPageManager(): PageManager = js.native
  def get_instance(): PageManager = js.native
  def initialize(): Unit = js.native
}

