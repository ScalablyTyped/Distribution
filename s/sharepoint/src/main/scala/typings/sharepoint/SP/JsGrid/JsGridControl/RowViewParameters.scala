package typings.sharepoint.SP.JsGrid.JsGridControl

import typings.sharepoint.SP.JsGrid.HierarchyMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowViewParameters extends js.Object {
  
  var autoFilterEntries: js.Any = js.native
  
  var autoFilterState: js.Any = js.native
  
  var filterState: js.Any = js.native
  
  var filteredDescCounts: js.Any = js.native
  
  var groupingLevel: js.Any = js.native
  
  var groupingRecordKeyPrefix: js.Any = js.native
  
  var hierarchyDelayLoadKeys: js.Any = js.native
  
  var hierarchyMode: HierarchyMode = js.native
  
  var hierarchyState: js.Any = js.native
  
  var sortState: js.Any = js.native
  
  var topViewIdx: Double = js.native
  
  var unfilteredHierarchyMgr: js.Any = js.native
  
  var view: js.Any = js.native
}
object RowViewParameters {
  
  @scala.inline
  def apply(
    autoFilterEntries: js.Any,
    autoFilterState: js.Any,
    filterState: js.Any,
    filteredDescCounts: js.Any,
    groupingLevel: js.Any,
    groupingRecordKeyPrefix: js.Any,
    hierarchyDelayLoadKeys: js.Any,
    hierarchyMode: HierarchyMode,
    hierarchyState: js.Any,
    sortState: js.Any,
    topViewIdx: Double,
    unfilteredHierarchyMgr: js.Any,
    view: js.Any
  ): RowViewParameters = {
    val __obj = js.Dynamic.literal(autoFilterEntries = autoFilterEntries.asInstanceOf[js.Any], autoFilterState = autoFilterState.asInstanceOf[js.Any], filterState = filterState.asInstanceOf[js.Any], filteredDescCounts = filteredDescCounts.asInstanceOf[js.Any], groupingLevel = groupingLevel.asInstanceOf[js.Any], groupingRecordKeyPrefix = groupingRecordKeyPrefix.asInstanceOf[js.Any], hierarchyDelayLoadKeys = hierarchyDelayLoadKeys.asInstanceOf[js.Any], hierarchyMode = hierarchyMode.asInstanceOf[js.Any], hierarchyState = hierarchyState.asInstanceOf[js.Any], sortState = sortState.asInstanceOf[js.Any], topViewIdx = topViewIdx.asInstanceOf[js.Any], unfilteredHierarchyMgr = unfilteredHierarchyMgr.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowViewParameters]
  }
  
  @scala.inline
  implicit class RowViewParametersOps[Self <: RowViewParameters] (val x: Self) extends AnyVal {
    
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
    def setAutoFilterEntries(value: js.Any): Self = this.set("autoFilterEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFilterState(value: js.Any): Self = this.set("autoFilterState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterState(value: js.Any): Self = this.set("filterState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredDescCounts(value: js.Any): Self = this.set("filteredDescCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingLevel(value: js.Any): Self = this.set("groupingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingRecordKeyPrefix(value: js.Any): Self = this.set("groupingRecordKeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchyDelayLoadKeys(value: js.Any): Self = this.set("hierarchyDelayLoadKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchyMode(value: HierarchyMode): Self = this.set("hierarchyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchyState(value: js.Any): Self = this.set("hierarchyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortState(value: js.Any): Self = this.set("sortState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopViewIdx(value: Double): Self = this.set("topViewIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnfilteredHierarchyMgr(value: js.Any): Self = this.set("unfilteredHierarchyMgr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: js.Any): Self = this.set("view", value.asInstanceOf[js.Any])
  }
}
