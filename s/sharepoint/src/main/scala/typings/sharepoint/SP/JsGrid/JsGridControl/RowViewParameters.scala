package typings.sharepoint.SP.JsGrid.JsGridControl

import typings.sharepoint.SP.JsGrid.HierarchyMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowViewParameters extends js.Object {
  var autoFilterEntries: js.Any
  var autoFilterState: js.Any
  var filterState: js.Any
  var filteredDescCounts: js.Any
  var groupingLevel: js.Any
  var groupingRecordKeyPrefix: js.Any
  var hierarchyDelayLoadKeys: js.Any
  var hierarchyMode: HierarchyMode
  var hierarchyState: js.Any
  var sortState: js.Any
  var topViewIdx: Double
  var unfilteredHierarchyMgr: js.Any
  var view: js.Any
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
}

