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

@js.native
trait TableViewParameters extends js.Object {
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
  @scala.inline
  implicit class TableViewParametersOps[Self <: TableViewParameters] (val x: Self) extends AnyVal {
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
    def setAllowedSelectionTypes(value: SelectionTypeFlags): Self = this.set("allowedSelectionTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setBAutoFilterableColumns(value: Boolean): Self = this.set("bAutoFilterableColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setBEditingEnabled(value: Boolean): Self = this.set("bEditingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setBFillControlEnabled(value: Boolean): Self = this.set("bFillControlEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setBHidableColumns(value: Boolean): Self = this.set("bHidableColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setBMovableColumns(value: Boolean): Self = this.set("bMovableColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setBNewRowEnabled(value: Boolean): Self = this.set("bNewRowEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setBRecordIndicatorCheckboxesEnabled(value: Boolean): Self = this.set("bRecordIndicatorCheckboxesEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setBResizableColumns(value: Boolean): Self = this.set("bResizableColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setBRowHeadersEnabled(value: Boolean): Self = this.set("bRowHeadersEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setBSortableColumns(value: Boolean): Self = this.set("bSortableColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckSelectionCheckboxDisabledRecordKeysVarargs(value: String*): Self = this.set("checkSelectionCheckboxDisabledRecordKeys", js.Array(value :_*))
    @scala.inline
    def setCheckSelectionCheckboxDisabledRecordKeys(value: js.Array[String]): Self = this.set("checkSelectionCheckboxDisabledRecordKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckSelectionCheckboxHiddenRecordKeysVarargs(value: String*): Self = this.set("checkSelectionCheckboxHiddenRecordKeys", js.Array(value :_*))
    @scala.inline
    def setCheckSelectionCheckboxHiddenRecordKeys(value: js.Array[String]): Self = this.set("checkSelectionCheckboxHiddenRecordKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckSelectionCheckedRecordKeysVarargs(value: String*): Self = this.set("checkSelectionCheckedRecordKeys", js.Array(value :_*))
    @scala.inline
    def setCheckSelectionCheckedRecordKeys(value: js.Array[String]): Self = this.set("checkSelectionCheckedRecordKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumns(value: ColumnInfoCollection): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultEditMode(value: EditMode): Self = this.set("defaultEditMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setGanttParams(value: GanttParameters): Self = this.set("ganttParams", value.asInstanceOf[js.Any])
    @scala.inline
    def setGridFieldMap(value: StringDictionary[GridField]): Self = this.set("gridFieldMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyFieldName(value: String): Self = this.set("keyFieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageOverrides(value: js.Any): Self = this.set("messageOverrides", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationalConstantsFieldKeyMap(value: js.Any): Self = this.set("operationalConstantsFieldKeyMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaneLayout(value: PaneLayout): Self = this.set("paneLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setPivotedGridParams(value: PivotedGridParameters): Self = this.set("pivotedGridParams", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowViewParams(value: RowViewParameters): Self = this.set("rowViewParams", value.asInstanceOf[js.Any])
  }
  
}

