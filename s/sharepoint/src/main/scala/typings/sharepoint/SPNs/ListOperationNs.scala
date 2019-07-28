package typings.sharepoint.SPNs

import typings.sharepoint.Anon_FsObjType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ListOperation")
@js.native
object ListOperationNs extends js.Object {
  @JSName("Overrides")
  @js.native
  object OverridesNs extends js.Object {
    def overrideDeleteConfirmation(listId: String, overrideText: String): Unit = js.native
  }
  
  @JSName("Selection")
  @js.native
  object SelectionNs extends js.Object {
    def deselectAllListItems(iid: String): Unit = js.native
    def getSelectedItems(): js.Array[Anon_FsObjType] = js.native
    def getSelectedList(): String = js.native
    def getSelectedView(): String = js.native
    def navigateUp(viewId: String): Unit = js.native
    def selectListItem(iid: String, bSelect: Boolean): Unit = js.native
  }
  
  @JSName("ViewOperation")
  @js.native
  object ViewOperationNs extends js.Object {
    def getSelectedView(): String = js.native
    def navigateUp(viewId: String): Unit = js.native
    def refreshView(viewId: String): Unit = js.native
  }
  
}

