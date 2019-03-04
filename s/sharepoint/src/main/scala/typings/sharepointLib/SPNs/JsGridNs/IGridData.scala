package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IGridData extends js.Object {
  var AdditionalParams: js.UndefOr[js.Any] = js.undefined
  var AutoFilterEntries: js.UndefOr[js.Any] = js.undefined
  var AutoFilterState: js.UndefOr[js.Any] = js.undefined
  var AutoFilterableColumns: js.UndefOr[scala.Boolean] = js.undefined
  var CellStyles: js.UndefOr[js.Any] = js.undefined
  var Columns: js.Array[IColumnInfo]
  var Fields: js.Array[IFieldInfo]
  var GanttInfo: js.UndefOr[js.Any] = js.undefined
  var GroupingGridRowStyleIds: js.UndefOr[js.Array[_]] = js.undefined
  var HierarchyState: js.UndefOr[js.Any] = js.undefined
  var LocalizedTable: js.Array[_]
  var LookupTableInfo: js.UndefOr[js.Array[ILookupTableInfo]] = js.undefined
  var MetaData: IGridMetadata
  var MultiValueSeparator: js.UndefOr[java.lang.String] = js.undefined
  var PaneLayout: js.UndefOr[PaneLayout] = js.undefined
  var PivotedColumns: js.UndefOr[js.Array[ColumnInfo]] = js.undefined
  var RecordCount: js.UndefOr[scala.Double] = js.undefined
  var SortState: js.UndefOr[js.Array[_]] = js.undefined
  var TopRecord: js.UndefOr[scala.Double] = js.undefined
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
    AutoFilterableColumns: js.UndefOr[scala.Boolean] = js.undefined,
    CellStyles: js.Any = null,
    GanttInfo: js.Any = null,
    GroupingGridRowStyleIds: js.Array[_] = null,
    HierarchyState: js.Any = null,
    LookupTableInfo: js.Array[ILookupTableInfo] = null,
    MultiValueSeparator: java.lang.String = null,
    PaneLayout: PaneLayout = null,
    PivotedColumns: js.Array[ColumnInfo] = null,
    RecordCount: scala.Int | scala.Double = null,
    SortState: js.Array[_] = null,
    TopRecord: scala.Int | scala.Double = null,
    UnfilteredHierarchy: js.Any = null,
    ViewDepKeys: js.Array[_] = null
  ): IGridData = {
    val __obj = js.Dynamic.literal(Columns = Columns, Fields = Fields, LocalizedTable = LocalizedTable, MetaData = MetaData, UnlocalizedTable = UnlocalizedTable, ViewInfo = ViewInfo)
    if (AdditionalParams != null) __obj.updateDynamic("AdditionalParams")(AdditionalParams)
    if (AutoFilterEntries != null) __obj.updateDynamic("AutoFilterEntries")(AutoFilterEntries)
    if (AutoFilterState != null) __obj.updateDynamic("AutoFilterState")(AutoFilterState)
    if (!js.isUndefined(AutoFilterableColumns)) __obj.updateDynamic("AutoFilterableColumns")(AutoFilterableColumns)
    if (CellStyles != null) __obj.updateDynamic("CellStyles")(CellStyles)
    if (GanttInfo != null) __obj.updateDynamic("GanttInfo")(GanttInfo)
    if (GroupingGridRowStyleIds != null) __obj.updateDynamic("GroupingGridRowStyleIds")(GroupingGridRowStyleIds)
    if (HierarchyState != null) __obj.updateDynamic("HierarchyState")(HierarchyState)
    if (LookupTableInfo != null) __obj.updateDynamic("LookupTableInfo")(LookupTableInfo)
    if (MultiValueSeparator != null) __obj.updateDynamic("MultiValueSeparator")(MultiValueSeparator)
    if (PaneLayout != null) __obj.updateDynamic("PaneLayout")(PaneLayout)
    if (PivotedColumns != null) __obj.updateDynamic("PivotedColumns")(PivotedColumns)
    if (RecordCount != null) __obj.updateDynamic("RecordCount")(RecordCount.asInstanceOf[js.Any])
    if (SortState != null) __obj.updateDynamic("SortState")(SortState)
    if (TopRecord != null) __obj.updateDynamic("TopRecord")(TopRecord.asInstanceOf[js.Any])
    if (UnfilteredHierarchy != null) __obj.updateDynamic("UnfilteredHierarchy")(UnfilteredHierarchy)
    if (ViewDepKeys != null) __obj.updateDynamic("ViewDepKeys")(ViewDepKeys)
    __obj.asInstanceOf[IGridData]
  }
}

