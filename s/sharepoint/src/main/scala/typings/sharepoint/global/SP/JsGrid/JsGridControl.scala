package typings.sharepoint.global.SP.JsGrid

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SP.JsGrid.IStyleManager
import typings.sharepoint.SP.Utilities.Set
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.JsGrid.JsGridControl")
@js.native
open class JsGridControl protected ()
  extends StObject
     with typings.sharepoint.SP.JsGrid.JsGridControl {
  def this(parentNode: HTMLElement, bShowLoadingBanner: Boolean) = this()
}
object JsGridControl {
  
  @JSGlobal("SP.JsGrid.JsGridControl.GanttParameters")
  @js.native
  open class GanttParameters ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.JsGridControl.GanttParameters {
    
    /* CompleteClass */
    var columns: typings.sharepoint.SP.JsGrid.ColumnInfoCollection = js.native
  }
  
  @JSGlobal("SP.JsGrid.JsGridControl.Parameters")
  @js.native
  open class Parameters ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.JsGridControl.Parameters {
    
    /* CompleteClass */
    var bEnableDiffTracking: Boolean = js.native
    
    // TODO
    /* CompleteClass */
    var bNotificationsEnabled: Boolean = js.native
    
    /* CompleteClass */
    var commandMgr: typings.sharepoint.SP.JsGrid.CommandManager = js.native
    
    /* CompleteClass */
    var enabledRowHeaderAutoStates: Set = js.native
    
    /* CompleteClass */
    var isRTL: Boolean = js.native
    
    /* CompleteClass */
    var minHeaderHeight: Double = js.native
    
    /* CompleteClass */
    var minRowHeight: Double = js.native
    
    /* CompleteClass */
    var name: Any = js.native
    
    /* CompleteClass */
    var styleManager: IStyleManager = js.native
    
    /* CompleteClass */
    var tableCache: typings.sharepoint.SP.JsGrid.TableCache = js.native
    
    /* CompleteClass */
    var tableViewParams: typings.sharepoint.SP.JsGrid.JsGridControl.TableViewParameters = js.native
  }
  
  @JSGlobal("SP.JsGrid.JsGridControl.PivotedGridParameters")
  @js.native
  open class PivotedGridParameters ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.JsGridControl.PivotedGridParameters
  
  @JSGlobal("SP.JsGrid.JsGridControl.RowViewParameters")
  @js.native
  open class RowViewParameters ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.JsGridControl.RowViewParameters {
    
    /* CompleteClass */
    var autoFilterEntries: Any = js.native
    
    /* CompleteClass */
    var autoFilterState: Any = js.native
    
    /* CompleteClass */
    var filterState: Any = js.native
    
    /* CompleteClass */
    var filteredDescCounts: Any = js.native
    
    /* CompleteClass */
    var groupingLevel: Any = js.native
    
    /* CompleteClass */
    var groupingRecordKeyPrefix: Any = js.native
    
    /* CompleteClass */
    var hierarchyDelayLoadKeys: Any = js.native
    
    /* CompleteClass */
    var hierarchyMode: typings.sharepoint.SP.JsGrid.HierarchyMode = js.native
    
    /* CompleteClass */
    var hierarchyState: Any = js.native
    
    /* CompleteClass */
    var sortState: Any = js.native
    
    /* CompleteClass */
    var topViewIdx: Double = js.native
    
    /* CompleteClass */
    var unfilteredHierarchyMgr: Any = js.native
    
    /* CompleteClass */
    var view: Any = js.native
  }
  
  @JSGlobal("SP.JsGrid.JsGridControl.TableViewParameters")
  @js.native
  open class TableViewParameters ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.JsGridControl.TableViewParameters {
    
    /* CompleteClass */
    var allowedSelectionTypes: typings.sharepoint.SP.JsGrid.SelectionTypeFlags = js.native
    
    /* CompleteClass */
    var bAutoFilterableColumns: Boolean = js.native
    
    /* CompleteClass */
    var bEditingEnabled: Boolean = js.native
    
    /* CompleteClass */
    var bFillControlEnabled: Boolean = js.native
    
    /* CompleteClass */
    var bHidableColumns: Boolean = js.native
    
    /* CompleteClass */
    var bMovableColumns: Boolean = js.native
    
    /* CompleteClass */
    var bNewRowEnabled: Boolean = js.native
    
    /* CompleteClass */
    var bRecordIndicatorCheckboxesEnabled: Boolean = js.native
    
    /* CompleteClass */
    var bResizableColumns: Boolean = js.native
    
    /* CompleteClass */
    var bRowHeadersEnabled: Boolean = js.native
    
    /* CompleteClass */
    var bSortableColumns: Boolean = js.native
    
    /* CompleteClass */
    var checkSelectionCheckboxDisabledRecordKeys: js.Array[String] = js.native
    
    /* CompleteClass */
    var checkSelectionCheckboxHiddenRecordKeys: js.Array[String] = js.native
    
    /* CompleteClass */
    var checkSelectionCheckedRecordKeys: js.Array[String] = js.native
    
    /* CompleteClass */
    var columns: typings.sharepoint.SP.JsGrid.ColumnInfoCollection = js.native
    
    /* CompleteClass */
    var defaultEditMode: typings.sharepoint.SP.JsGrid.EditMode = js.native
    
    // TODO
    /* CompleteClass */
    var ganttParams: typings.sharepoint.SP.JsGrid.JsGridControl.GanttParameters = js.native
    
    /* CompleteClass */
    var gridFieldMap: StringDictionary[typings.sharepoint.SP.JsGrid.GridField] = js.native
    
    /* CompleteClass */
    var keyFieldName: String = js.native
    
    /* CompleteClass */
    var messageOverrides: Any = js.native
    
    // TODO
    /* CompleteClass */
    var operationalConstantsFieldKeyMap: Any = js.native
    
    /* CompleteClass */
    var paneLayout: typings.sharepoint.SP.JsGrid.PaneLayout = js.native
    
    /* CompleteClass */
    var pivotedGridParams: typings.sharepoint.SP.JsGrid.JsGridControl.PivotedGridParameters = js.native
    
    /* CompleteClass */
    var rowViewParams: typings.sharepoint.SP.JsGrid.JsGridControl.RowViewParameters = js.native
  }
}
