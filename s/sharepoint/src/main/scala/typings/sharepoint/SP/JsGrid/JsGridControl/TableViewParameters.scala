package typings.sharepoint.SP.JsGrid.JsGridControl

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SP.JsGrid.ColumnInfoCollection
import typings.sharepoint.SP.JsGrid.EditMode
import typings.sharepoint.SP.JsGrid.GridField
import typings.sharepoint.SP.JsGrid.PaneLayout
import typings.sharepoint.SP.JsGrid.SelectionTypeFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableViewParameters extends js.Object {
  var allowedSelectionTypes: SelectionTypeFlags
  var bAutoFilterableColumns: Boolean
  var bEditingEnabled: Boolean
  var bFillControlEnabled: Boolean
  var bHidableColumns: Boolean
  var bMovableColumns: Boolean
  var bNewRowEnabled: Boolean
  var bRecordIndicatorCheckboxesEnabled: Boolean
  var bResizableColumns: Boolean
  var bRowHeadersEnabled: Boolean
  var bSortableColumns: Boolean
  var checkSelectionCheckboxDisabledRecordKeys: js.Array[String]
  var checkSelectionCheckboxHiddenRecordKeys: js.Array[String]
  var checkSelectionCheckedRecordKeys: js.Array[String]
  var columns: ColumnInfoCollection
  var defaultEditMode: EditMode
   // TODO
  var ganttParams: GanttParameters
  var gridFieldMap: StringDictionary[GridField]
  var keyFieldName: String
  var messageOverrides: js.Any
   // TODO
  var operationalConstantsFieldKeyMap: js.Any
  var paneLayout: PaneLayout
  var pivotedGridParams: PivotedGridParameters
  var rowViewParams: RowViewParameters
}

object TableViewParameters {
  @scala.inline
  def apply(
    allowedSelectionTypes: SelectionTypeFlags,
    bAutoFilterableColumns: Boolean,
    bEditingEnabled: Boolean,
    bFillControlEnabled: Boolean,
    bHidableColumns: Boolean,
    bMovableColumns: Boolean,
    bNewRowEnabled: Boolean,
    bRecordIndicatorCheckboxesEnabled: Boolean,
    bResizableColumns: Boolean,
    bRowHeadersEnabled: Boolean,
    bSortableColumns: Boolean,
    checkSelectionCheckboxDisabledRecordKeys: js.Array[String],
    checkSelectionCheckboxHiddenRecordKeys: js.Array[String],
    checkSelectionCheckedRecordKeys: js.Array[String],
    columns: ColumnInfoCollection,
    defaultEditMode: EditMode,
    ganttParams: GanttParameters,
    gridFieldMap: StringDictionary[GridField],
    keyFieldName: String,
    messageOverrides: js.Any,
    operationalConstantsFieldKeyMap: js.Any,
    paneLayout: PaneLayout,
    pivotedGridParams: PivotedGridParameters,
    rowViewParams: RowViewParameters
  ): TableViewParameters = {
    val __obj = js.Dynamic.literal(allowedSelectionTypes = allowedSelectionTypes.asInstanceOf[js.Any], bAutoFilterableColumns = bAutoFilterableColumns.asInstanceOf[js.Any], bEditingEnabled = bEditingEnabled.asInstanceOf[js.Any], bFillControlEnabled = bFillControlEnabled.asInstanceOf[js.Any], bHidableColumns = bHidableColumns.asInstanceOf[js.Any], bMovableColumns = bMovableColumns.asInstanceOf[js.Any], bNewRowEnabled = bNewRowEnabled.asInstanceOf[js.Any], bRecordIndicatorCheckboxesEnabled = bRecordIndicatorCheckboxesEnabled.asInstanceOf[js.Any], bResizableColumns = bResizableColumns.asInstanceOf[js.Any], bRowHeadersEnabled = bRowHeadersEnabled.asInstanceOf[js.Any], bSortableColumns = bSortableColumns.asInstanceOf[js.Any], checkSelectionCheckboxDisabledRecordKeys = checkSelectionCheckboxDisabledRecordKeys.asInstanceOf[js.Any], checkSelectionCheckboxHiddenRecordKeys = checkSelectionCheckboxHiddenRecordKeys.asInstanceOf[js.Any], checkSelectionCheckedRecordKeys = checkSelectionCheckedRecordKeys.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], defaultEditMode = defaultEditMode.asInstanceOf[js.Any], ganttParams = ganttParams.asInstanceOf[js.Any], gridFieldMap = gridFieldMap.asInstanceOf[js.Any], keyFieldName = keyFieldName.asInstanceOf[js.Any], messageOverrides = messageOverrides.asInstanceOf[js.Any], operationalConstantsFieldKeyMap = operationalConstantsFieldKeyMap.asInstanceOf[js.Any], paneLayout = paneLayout.asInstanceOf[js.Any], pivotedGridParams = pivotedGridParams.asInstanceOf[js.Any], rowViewParams = rowViewParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewParameters]
  }
}

