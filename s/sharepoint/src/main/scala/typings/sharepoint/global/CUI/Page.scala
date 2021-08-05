package typings.sharepoint.global.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Page {
  
  @JSGlobal("CUI.Page.CommandDispatcher")
  @js.native
  class CommandDispatcher ()
    extends StObject
       with typings.sharepoint.CUI.Page.CommandDispatcher {
    
    /* CompleteClass */
    override def executeCommand(commandId: String, properties: js.Any): js.Any = js.native
  }
  
  @JSGlobal("CUI.Page.FocusManager")
  @js.native
  class FocusManager ()
    extends StObject
       with typings.sharepoint.CUI.Page.FocusManager {
    
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
  
  @JSGlobal("CUI.Page.PageComponent")
  @js.native
  class PageComponent ()
    extends StObject
       with typings.sharepoint.CUI.Page.PageComponent {
    
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
  
  @JSGlobal("CUI.Page.PageManager")
  @js.native
  class PageManager ()
    extends StObject
       with typings.sharepoint.CUI.Page.PageManager {
    
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
  object PageManager {
    
    @JSGlobal("CUI.Page.PageManager")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def createPageManager(): typings.sharepoint.CUI.Page.PageManager = ^.asInstanceOf[js.Dynamic].applyDynamic("createPageManager")().asInstanceOf[typings.sharepoint.CUI.Page.PageManager]
    
    /* static member */
    inline def getInstance(): typings.sharepoint.CUI.Page.PageManager = ^.asInstanceOf[js.Dynamic].applyDynamic("get_instance")().asInstanceOf[typings.sharepoint.CUI.Page.PageManager]
    
    /* static member */
    inline def initialize(): scala.Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")().asInstanceOf[scala.Unit]
  }
  
  @JSGlobal("CUI.Page.UndoManager")
  @js.native
  class UndoManager ()
    extends StObject
       with typings.sharepoint.CUI.Page.UndoManager {
    
    /* CompleteClass */
    override def canHandleCommand(commandId: String): Boolean = js.native
    
    /* CompleteClass */
    override def handleCommand(commandId: String, properties: js.Any, sequenceNumber: Double): Boolean = js.native
  }
}
