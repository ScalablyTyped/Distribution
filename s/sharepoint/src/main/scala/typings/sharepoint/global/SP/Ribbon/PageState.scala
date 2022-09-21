package typings.sharepoint.global.SP.Ribbon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PageState {
  
  @JSGlobal("SP.Ribbon.PageState.Handlers")
  @js.native
  open class Handlers ()
    extends StObject
       with typings.sharepoint.SP.Ribbon.PageState.Handlers
  
  @JSGlobal("SP.Ribbon.PageState.PageStateCommands")
  @js.native
  open class PageStateCommands ()
    extends StObject
       with typings.sharepoint.SP.Ribbon.PageState.PageStateCommands
  
  @JSGlobal("SP.Ribbon.PageState.PageStateHandler")
  @js.native
  open class PageStateHandler ()
    extends StObject
       with typings.sharepoint.SP.Ribbon.PageState.PageStateHandler {
    
    /* CompleteClass */
    override def canHandleCommand(commandId: String): Boolean = js.native
    
    /* CompleteClass */
    override def getFocusedCommands(): js.Array[String] = js.native
    
    /* CompleteClass */
    override def getGlobalCommands(): js.Array[String] = js.native
    
    /* CompleteClass */
    override def getId(): String = js.native
    
    /* CompleteClass */
    override def handleCommand(commandId: String, properties: Any, sequenceNumber: Double): Boolean = js.native
    
    /* CompleteClass */
    override def init(): Unit = js.native
    
    /* CompleteClass */
    override def isFocusable(): Boolean = js.native
    
    /* CompleteClass */
    override def receiveFocus(): Boolean = js.native
    
    /* CompleteClass */
    override def yieldFocus(): Boolean = js.native
  }
  
  @JSGlobal("SP.Ribbon.PageState.PageStateStrings")
  @js.native
  open class PageStateStrings ()
    extends StObject
       with typings.sharepoint.SP.Ribbon.PageState.PageStateStrings
  
  @JSGlobal("SP.Ribbon.PageState.StateChangeDialogHandler")
  @js.native
  open class StateChangeDialogHandler ()
    extends StObject
       with typings.sharepoint.SP.Ribbon.PageState.StateChangeDialogHandler
}
