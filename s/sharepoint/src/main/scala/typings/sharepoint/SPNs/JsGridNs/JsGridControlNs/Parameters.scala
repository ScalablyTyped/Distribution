package typings.sharepoint.SPNs.JsGridNs.JsGridControlNs

import typings.sharepoint.SPNs.JsGridNs.CommandManager
import typings.sharepoint.SPNs.JsGridNs.IStyleManager
import typings.sharepoint.SPNs.JsGridNs.TableCache
import typings.sharepoint.SPNs.UtilitiesNs.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.JsGridControl.Parameters")
@js.native
class Parameters () extends js.Object {
  var bEnableDiffTracking: Boolean = js.native
   // TODO
  var bNotificationsEnabled: Boolean = js.native
  var commandMgr: CommandManager = js.native
  var enabledRowHeaderAutoStates: Set = js.native
  var isRTL: Boolean = js.native
  var minHeaderHeight: Double = js.native
  var minRowHeight: Double = js.native
  var name: js.Any = js.native
  var styleManager: IStyleManager = js.native
  var tableCache: TableCache = js.native
  var tableViewParams: TableViewParameters = js.native
}

