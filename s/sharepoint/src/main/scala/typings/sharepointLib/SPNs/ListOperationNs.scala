package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ListOperation")
@js.native
object ListOperationNs extends js.Object {
  @JSName("Overrides")
  @js.native
  object OverridesNs extends js.Object {
    def overrideDeleteConfirmation(listId: java.lang.String, overrideText: java.lang.String): scala.Unit = js.native
  }
  
  @JSName("Selection")
  @js.native
  object SelectionNs extends js.Object {
    def deselectAllListItems(iid: java.lang.String): scala.Unit = js.native
    def getSelectedItems(): js.Array[sharepointLib.Anon_FsObjType] = js.native
    def getSelectedList(): java.lang.String = js.native
    def getSelectedView(): java.lang.String = js.native
    def navigateUp(viewId: java.lang.String): scala.Unit = js.native
    def selectListItem(iid: java.lang.String, bSelect: scala.Boolean): scala.Unit = js.native
  }
  
  @JSName("ViewOperation")
  @js.native
  object ViewOperationNs extends js.Object {
    def getSelectedView(): java.lang.String = js.native
    def navigateUp(viewId: java.lang.String): scala.Unit = js.native
    def refreshView(viewId: java.lang.String): scala.Unit = js.native
  }
  
}

