package typings.sharepoint.SPNs.JsGridNs.JsGridControlNs

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SPNs.JsGridNs.ColumnInfoCollection
import typings.sharepoint.SPNs.JsGridNs.EditMode
import typings.sharepoint.SPNs.JsGridNs.GridField
import typings.sharepoint.SPNs.JsGridNs.PaneLayout
import typings.sharepoint.SPNs.JsGridNs.SelectionTypeFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.JsGridControl.TableViewParameters")
@js.native
class TableViewParameters () extends js.Object {
  var allowedSelectionTypes: SelectionTypeFlags = js.native
  var bAutoFilterableColumns: Boolean = js.native
  var bEditingEnabled: Boolean = js.native
  var bFillControlEnabled: Boolean = js.native
  var bHidableColumns: Boolean = js.native
  var bMovableColumns: Boolean = js.native
  var bNewRowEnabled: Boolean = js.native
  var bRecordIndicatorCheckboxesEnabled: Boolean = js.native
  var bResizableColumns: Boolean = js.native
  var bRowHeadersEnabled: Boolean = js.native
  var bSortableColumns: Boolean = js.native
  var checkSelectionCheckboxDisabledRecordKeys: js.Array[String] = js.native
  var checkSelectionCheckboxHiddenRecordKeys: js.Array[String] = js.native
  var checkSelectionCheckedRecordKeys: js.Array[String] = js.native
  var columns: ColumnInfoCollection = js.native
  var defaultEditMode: EditMode = js.native
   // TODO
  var ganttParams: GanttParameters = js.native
  var gridFieldMap: StringDictionary[GridField] = js.native
  var keyFieldName: String = js.native
  var messageOverrides: js.Any = js.native
   // TODO
  var operationalConstantsFieldKeyMap: js.Any = js.native
  var paneLayout: PaneLayout = js.native
  var pivotedGridParams: PivotedGridParameters = js.native
  var rowViewParams: RowViewParameters = js.native
}

