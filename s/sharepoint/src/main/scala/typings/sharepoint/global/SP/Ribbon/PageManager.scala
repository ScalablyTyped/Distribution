package typings.sharepoint.global.SP.Ribbon

import typings.sharepoint.CUI.Component
import typings.sharepoint.CUI.Page.CommandDispatcher
import typings.sharepoint.CUI.Page.FocusManager
import typings.sharepoint.CUI.Page.UndoManager
import typings.sharepoint.CUI.Root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.Ribbon.PageManager")
@js.native
class PageManager ()
  extends StObject
     with typings.sharepoint.SP.Ribbon.PageManager {
  
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
object PageManager {
  
  @JSGlobal("SP.Ribbon.PageManager")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def getInstance(): typings.sharepoint.SP.Ribbon.PageManager = ^.asInstanceOf[js.Dynamic].applyDynamic("get_instance")().asInstanceOf[typings.sharepoint.SP.Ribbon.PageManager]
}
