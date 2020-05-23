package typings.sharepoint.global.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.Page")
@js.native
object Page extends js.Object {
  @js.native
  class CommandDispatcher ()
    extends typings.sharepoint.CUI.Page.CommandDispatcher {
    /* CompleteClass */
    override def executeCommand(commandId: String, properties: js.Any): js.Any = js.native
  }
  
  @js.native
  class FocusManager ()
    extends typings.sharepoint.CUI.Page.FocusManager {
    /* CompleteClass */
    override def canHandleCommand(commandId: String): Boolean = js.native
    /* CompleteClass */
    override def executeCommand(commandId: String, properties: js.Any): js.Any = js.native
    /* CompleteClass */
    override def getFocusedComponents(): js.Array[typings.sharepoint.CUI.Component] = js.native
    /* CompleteClass */
    override def handleCommand(commandId: String, properties: js.Any, sequenceNumber: Double): Boolean = js.native
    /* CompleteClass */
    override def releaseAllFoci(): Boolean = js.native
    /* CompleteClass */
    override def releaseFocusFromComponent(component: typings.sharepoint.CUI.Component): js.Any = js.native
    /* CompleteClass */
    override def requestFocusForComponent(component: typings.sharepoint.CUI.Component): js.Any = js.native
  }
  
  @js.native
  class PageComponent ()
    extends typings.sharepoint.CUI.Page.PageComponent {
    /* CompleteClass */
    override def canHandleCommand(commandId: String): Boolean = js.native
    /* CompleteClass */
    override def getFocusedCommands(): js.Array[String] = js.native
    /* CompleteClass */
    override def getGlobalCommands(): js.Array[String] = js.native
    /* CompleteClass */
    override def getId(): String = js.native
    /* CompleteClass */
    override def handleCommand(commandId: String, properties: js.Any, sequenceNumber: Double): Boolean = js.native
    /* CompleteClass */
    override def init(): scala.Unit = js.native
    /* CompleteClass */
    override def isFocusable(): Boolean = js.native
    /* CompleteClass */
    override def receiveFocus(): Boolean = js.native
    /* CompleteClass */
    override def yieldFocus(): Boolean = js.native
  }
  
  @js.native
  class PageManager ()
    extends typings.sharepoint.CUI.Page.PageManager {
    /* CompleteClass */
    override def add_ribbonInited(value: js.Function0[scala.Unit]): js.Any = js.native
    /* CompleteClass */
    override def canHandleCommand(commandId: String): Boolean = js.native
    /* CompleteClass */
    override def get_commandDispatcher(): typings.sharepoint.CUI.Page.CommandDispatcher = js.native
    /* CompleteClass */
    override def get_focusManager(): typings.sharepoint.CUI.Page.FocusManager = js.native
    /* CompleteClass */
    override def get_undoManager(): typings.sharepoint.CUI.Page.UndoManager = js.native
    /* CompleteClass */
    override def handleCommand(commandId: String, properties: js.Any, sequenceNumber: Double): Boolean = js.native
  }
  
  @js.native
  class UndoManager ()
    extends typings.sharepoint.CUI.Page.UndoManager {
    /* CompleteClass */
    override def canHandleCommand(commandId: String): Boolean = js.native
    /* CompleteClass */
    override def handleCommand(commandId: String, properties: js.Any, sequenceNumber: Double): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PageManager extends js.Object {
    def createPageManager(): typings.sharepoint.CUI.Page.PageManager = js.native
    def get_instance(): typings.sharepoint.CUI.Page.PageManager = js.native
    def initialize(): scala.Unit = js.native
  }
  
}

