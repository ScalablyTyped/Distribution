package typings.sharepoint.global.SP

import typings.sharepoint.anon.FsObjType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListOperation {
  
  object Overrides {
    
    @JSGlobal("SP.ListOperation.Overrides.overrideDeleteConfirmation")
    @js.native
    def overrideDeleteConfirmation(listId: String, overrideText: String): Unit = js.native
  }
  
  object Selection {
    
    @JSGlobal("SP.ListOperation.Selection.deselectAllListItems")
    @js.native
    def deselectAllListItems(iid: String): Unit = js.native
    
    @JSGlobal("SP.ListOperation.Selection.getSelectedItems")
    @js.native
    def getSelectedItems(): js.Array[FsObjType] = js.native
    
    @JSGlobal("SP.ListOperation.Selection.getSelectedList")
    @js.native
    def getSelectedList(): String = js.native
    
    @JSGlobal("SP.ListOperation.Selection.getSelectedView")
    @js.native
    def getSelectedView(): String = js.native
    
    @JSGlobal("SP.ListOperation.Selection.navigateUp")
    @js.native
    def navigateUp(viewId: String): Unit = js.native
    
    @JSGlobal("SP.ListOperation.Selection.selectListItem")
    @js.native
    def selectListItem(iid: String, bSelect: Boolean): Unit = js.native
  }
  
  object ViewOperation {
    
    @JSGlobal("SP.ListOperation.ViewOperation.getSelectedView")
    @js.native
    def getSelectedView(): String = js.native
    
    @JSGlobal("SP.ListOperation.ViewOperation.navigateUp")
    @js.native
    def navigateUp(viewId: String): Unit = js.native
    
    @JSGlobal("SP.ListOperation.ViewOperation.refreshView")
    @js.native
    def refreshView(viewId: String): Unit = js.native
  }
}
