package typings.sharepoint.global.SP.JsGrid

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SP.JsGrid.IStyleManager
import typings.sharepoint.SP.Utilities.Set
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.JsGridControl")
@js.native
class JsGridControl protected ()
  extends typings.sharepoint.SP.JsGrid.JsGridControl {
  def this(parentNode: HTMLElement, bShowLoadingBanner: Boolean) = this()
}

@JSGlobal("SP.JsGrid.JsGridControl")
@js.native
object JsGridControl extends js.Object {
  @js.native
  class GanttParameters ()
    extends typings.sharepoint.SP.JsGrid.JsGridControl.GanttParameters {
    /* CompleteClass */
    override var columns: typings.sharepoint.SP.JsGrid.ColumnInfoCollection = js.native
  }
  
  @js.native
  class Parameters ()
    extends typings.sharepoint.SP.JsGrid.JsGridControl.Parameters {
    /* CompleteClass */
    override var bEnableDiffTracking: Boolean = js.native
     // TODO
    /* CompleteClass */
    override var bNotificationsEnabled: Boolean = js.native
    /* CompleteClass */
    override var commandMgr: typings.sharepoint.SP.JsGrid.CommandManager = js.native
    /* CompleteClass */
    override var enabledRowHeaderAutoStates: Set = js.native
    /* CompleteClass */
    override var isRTL: Boolean = js.native
    /* CompleteClass */
    override var minHeaderHeight: Double = js.native
    /* CompleteClass */
    override var minRowHeight: Double = js.native
    /* CompleteClass */
    override var name: js.Any = js.native
    /* CompleteClass */
    override var styleManager: IStyleManager = js.native
    /* CompleteClass */
    override var tableCache: typings.sharepoint.SP.JsGrid.TableCache = js.native
    /* CompleteClass */
    override var tableViewParams: typings.sharepoint.SP.JsGrid.JsGridControl.TableViewParameters = js.native
  }
  
  @js.native
  class PivotedGridParameters ()
    extends typings.sharepoint.SP.JsGrid.JsGridControl.PivotedGridParameters
  
  @js.native
  class RowViewParameters ()
    extends typings.sharepoint.SP.JsGrid.JsGridControl.RowViewParameters {
    /* CompleteClass */
    override var autoFilterEntries: js.Any = js.native
    /* CompleteClass */
    override var autoFilterState: js.Any = js.native
    /* CompleteClass */
    override var filterState: js.Any = js.native
    /* CompleteClass */
    override var filteredDescCounts: js.Any = js.native
    /* CompleteClass */
    override var groupingLevel: js.Any = js.native
    /* CompleteClass */
    override var groupingRecordKeyPrefix: js.Any = js.native
    /* CompleteClass */
    override var hierarchyDelayLoadKeys: js.Any = js.native
    /* CompleteClass */
    override var hierarchyMode: typings.sharepoint.SP.JsGrid.HierarchyMode = js.native
    /* CompleteClass */
    override var hierarchyState: js.Any = js.native
    /* CompleteClass */
    override var sortState: js.Any = js.native
    /* CompleteClass */
    override var topViewIdx: Double = js.native
    /* CompleteClass */
    override var unfilteredHierarchyMgr: js.Any = js.native
    /* CompleteClass */
    override var view: js.Any = js.native
  }
  
  @js.native
  class TableViewParameters ()
    extends typings.sharepoint.SP.JsGrid.JsGridControl.TableViewParameters {
    /* CompleteClass */
    override var allowedSelectionTypes: typings.sharepoint.SP.JsGrid.SelectionTypeFlags = js.native
    /* CompleteClass */
    override var bAutoFilterableColumns: Boolean = js.native
    /* CompleteClass */
    override var bEditingEnabled: Boolean = js.native
    /* CompleteClass */
    override var bFillControlEnabled: Boolean = js.native
    /* CompleteClass */
    override var bHidableColumns: Boolean = js.native
    /* CompleteClass */
    override var bMovableColumns: Boolean = js.native
    /* CompleteClass */
    override var bNewRowEnabled: Boolean = js.native
    /* CompleteClass */
    override var bRecordIndicatorCheckboxesEnabled: Boolean = js.native
    /* CompleteClass */
    override var bResizableColumns: Boolean = js.native
    /* CompleteClass */
    override var bRowHeadersEnabled: Boolean = js.native
    /* CompleteClass */
    override var bSortableColumns: Boolean = js.native
    /* CompleteClass */
    override var checkSelectionCheckboxDisabledRecordKeys: js.Array[String] = js.native
    /* CompleteClass */
    override var checkSelectionCheckboxHiddenRecordKeys: js.Array[String] = js.native
    /* CompleteClass */
    override var checkSelectionCheckedRecordKeys: js.Array[String] = js.native
    /* CompleteClass */
    override var columns: typings.sharepoint.SP.JsGrid.ColumnInfoCollection = js.native
    /* CompleteClass */
    override var defaultEditMode: typings.sharepoint.SP.JsGrid.EditMode = js.native
     // TODO
    /* CompleteClass */
    override var ganttParams: typings.sharepoint.SP.JsGrid.JsGridControl.GanttParameters = js.native
    /* CompleteClass */
    override var gridFieldMap: StringDictionary[typings.sharepoint.SP.JsGrid.GridField] = js.native
    /* CompleteClass */
    override var keyFieldName: String = js.native
    /* CompleteClass */
    override var messageOverrides: js.Any = js.native
     // TODO
    /* CompleteClass */
    override var operationalConstantsFieldKeyMap: js.Any = js.native
    /* CompleteClass */
    override var paneLayout: typings.sharepoint.SP.JsGrid.PaneLayout = js.native
    /* CompleteClass */
    override var pivotedGridParams: typings.sharepoint.SP.JsGrid.JsGridControl.PivotedGridParameters = js.native
    /* CompleteClass */
    override var rowViewParams: typings.sharepoint.SP.JsGrid.JsGridControl.RowViewParameters = js.native
  }
  
}

