package typings.sharepoint.SP.JsGrid.JsGridControl

import typings.sharepoint.SP.JsGrid.CommandManager
import typings.sharepoint.SP.JsGrid.IStyleManager
import typings.sharepoint.SP.JsGrid.TableCache
import typings.sharepoint.SP.Utilities.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parameters extends js.Object {
  
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
  
  @scala.inline
  implicit class ParametersOps[Self <: Parameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBEnableDiffTracking(value: Boolean): Self = this.set("bEnableDiffTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBNotificationsEnabled(value: Boolean): Self = this.set("bNotificationsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandMgr(value: CommandManager): Self = this.set("commandMgr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledRowHeaderAutoStates(value: Set): Self = this.set("enabledRowHeaderAutoStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRTL(value: Boolean): Self = this.set("isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeaderHeight(value: Double): Self = this.set("minHeaderHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinRowHeight(value: Double): Self = this.set("minRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: js.Any): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleManager(value: IStyleManager): Self = this.set("styleManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableCache(value: TableCache): Self = this.set("tableCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableViewParams(value: TableViewParameters): Self = this.set("tableViewParams", value.asInstanceOf[js.Any])
  }
}
