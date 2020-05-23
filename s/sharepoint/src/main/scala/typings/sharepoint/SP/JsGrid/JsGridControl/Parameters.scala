package typings.sharepoint.SP.JsGrid.JsGridControl

import typings.sharepoint.SP.JsGrid.CommandManager
import typings.sharepoint.SP.JsGrid.IStyleManager
import typings.sharepoint.SP.JsGrid.TableCache
import typings.sharepoint.SP.Utilities.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameters extends js.Object {
  var bEnableDiffTracking: Boolean
   // TODO
  var bNotificationsEnabled: Boolean
  var commandMgr: CommandManager
  var enabledRowHeaderAutoStates: Set
  var isRTL: Boolean
  var minHeaderHeight: Double
  var minRowHeight: Double
  var name: js.Any
  var styleManager: IStyleManager
  var tableCache: TableCache
  var tableViewParams: TableViewParameters
}

object Parameters {
  @scala.inline
  def apply(
    bEnableDiffTracking: Boolean,
    bNotificationsEnabled: Boolean,
    commandMgr: CommandManager,
    enabledRowHeaderAutoStates: Set,
    isRTL: Boolean,
    minHeaderHeight: Double,
    minRowHeight: Double,
    name: js.Any,
    styleManager: IStyleManager,
    tableCache: TableCache,
    tableViewParams: TableViewParameters
  ): Parameters = {
    val __obj = js.Dynamic.literal(bEnableDiffTracking = bEnableDiffTracking.asInstanceOf[js.Any], bNotificationsEnabled = bNotificationsEnabled.asInstanceOf[js.Any], commandMgr = commandMgr.asInstanceOf[js.Any], enabledRowHeaderAutoStates = enabledRowHeaderAutoStates.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], minHeaderHeight = minHeaderHeight.asInstanceOf[js.Any], minRowHeight = minRowHeight.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], styleManager = styleManager.asInstanceOf[js.Any], tableCache = tableCache.asInstanceOf[js.Any], tableViewParams = tableViewParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
}

