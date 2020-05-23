package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IGridData extends js.Object {
  var AdditionalParams: js.UndefOr[js.Any] = js.undefined
  var AutoFilterEntries: js.UndefOr[js.Any] = js.undefined
  var AutoFilterState: js.UndefOr[js.Any] = js.undefined
  var AutoFilterableColumns: js.UndefOr[Boolean] = js.undefined
  var CellStyles: js.UndefOr[js.Any] = js.undefined
  var Columns: js.Array[IColumnInfo]
  var Fields: js.Array[IFieldInfo]
  var GanttInfo: js.UndefOr[js.Any] = js.undefined
  var GroupingGridRowStyleIds: js.UndefOr[js.Array[_]] = js.undefined
  var HierarchyState: js.UndefOr[js.Any] = js.undefined
  var LocalizedTable: js.Array[_]
  var LookupTableInfo: js.UndefOr[js.Array[ILookupTableInfo]] = js.undefined
  var MetaData: IGridMetadata
  var MultiValueSeparator: js.UndefOr[String] = js.undefined
  var PaneLayout: js.UndefOr[typings.sharepoint.SP.JsGrid.PaneLayout] = js.undefined
  var PivotedColumns: js.UndefOr[js.Array[ColumnInfo]] = js.undefined
  var RecordCount: js.UndefOr[Double] = js.undefined
  var SortState: js.UndefOr[js.Array[_]] = js.undefined
  var TopRecord: js.UndefOr[Double] = js.undefined
  var UnfilteredHierarchy: js.UndefOr[js.Any] = js.undefined
  var UnlocalizedTable: js.Array[_]
  var ViewDepKeys: js.UndefOr[js.Array[_]] = js.undefined
  var ViewInfo: js.Array[_]
}

object IGridData {
  @scala.inline
  def apply(
    Columns: js.Array[IColumnInfo],
    Fields: js.Array[IFieldInfo],
    LocalizedTable: js.Array[_],
    MetaData: IGridMetadata,
    UnlocalizedTable: js.Array[_],
    ViewInfo: js.Array[_],
    AdditionalParams: js.Any = null,
    AutoFilterEntries: js.Any = null,
    AutoFilterState: js.Any = null,
    AutoFilterableColumns: js.UndefOr[Boolean] = js.undefined,
    CellStyles: js.Any = null,
    GanttInfo: js.Any = null,
    GroupingGridRowStyleIds: js.Array[_] = null,
    HierarchyState: js.Any = null,
    LookupTableInfo: js.Array[ILookupTableInfo] = null,
    MultiValueSeparator: String = null,
    PaneLayout: PaneLayout = null,
    PivotedColumns: js.Array[ColumnInfo] = null,
    RecordCount: js.UndefOr[Double] = js.undefined,
    SortState: js.Array[_] = null,
    TopRecord: js.UndefOr[Double] = js.undefined,
    UnfilteredHierarchy: js.Any = null,
    ViewDepKeys: js.Array[_] = null
  ): IGridData = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], Fields = Fields.asInstanceOf[js.Any], LocalizedTable = LocalizedTable.asInstanceOf[js.Any], MetaData = MetaData.asInstanceOf[js.Any], UnlocalizedTable = UnlocalizedTable.asInstanceOf[js.Any], ViewInfo = ViewInfo.asInstanceOf[js.Any])
    if (AdditionalParams != null) __obj.updateDynamic("AdditionalParams")(AdditionalParams.asInstanceOf[js.Any])
    if (AutoFilterEntries != null) __obj.updateDynamic("AutoFilterEntries")(AutoFilterEntries.asInstanceOf[js.Any])
    if (AutoFilterState != null) __obj.updateDynamic("AutoFilterState")(AutoFilterState.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoFilterableColumns)) __obj.updateDynamic("AutoFilterableColumns")(AutoFilterableColumns.get.asInstanceOf[js.Any])
    if (CellStyles != null) __obj.updateDynamic("CellStyles")(CellStyles.asInstanceOf[js.Any])
    if (GanttInfo != null) __obj.updateDynamic("GanttInfo")(GanttInfo.asInstanceOf[js.Any])
    if (GroupingGridRowStyleIds != null) __obj.updateDynamic("GroupingGridRowStyleIds")(GroupingGridRowStyleIds.asInstanceOf[js.Any])
    if (HierarchyState != null) __obj.updateDynamic("HierarchyState")(HierarchyState.asInstanceOf[js.Any])
    if (LookupTableInfo != null) __obj.updateDynamic("LookupTableInfo")(LookupTableInfo.asInstanceOf[js.Any])
    if (MultiValueSeparator != null) __obj.updateDynamic("MultiValueSeparator")(MultiValueSeparator.asInstanceOf[js.Any])
    if (PaneLayout != null) __obj.updateDynamic("PaneLayout")(PaneLayout.asInstanceOf[js.Any])
    if (PivotedColumns != null) __obj.updateDynamic("PivotedColumns")(PivotedColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(RecordCount)) __obj.updateDynamic("RecordCount")(RecordCount.get.asInstanceOf[js.Any])
    if (SortState != null) __obj.updateDynamic("SortState")(SortState.asInstanceOf[js.Any])
    if (!js.isUndefined(TopRecord)) __obj.updateDynamic("TopRecord")(TopRecord.get.asInstanceOf[js.Any])
    if (UnfilteredHierarchy != null) __obj.updateDynamic("UnfilteredHierarchy")(UnfilteredHierarchy.asInstanceOf[js.Any])
    if (ViewDepKeys != null) __obj.updateDynamic("ViewDepKeys")(ViewDepKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridData]
  }
}

