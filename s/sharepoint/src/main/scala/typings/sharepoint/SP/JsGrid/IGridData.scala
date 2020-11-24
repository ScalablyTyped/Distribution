package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGridData extends js.Object {
  
  var AdditionalParams: js.UndefOr[js.Any] = js.native
  
  var AutoFilterEntries: js.UndefOr[js.Any] = js.native
  
  var AutoFilterState: js.UndefOr[js.Any] = js.native
  
  var AutoFilterableColumns: js.UndefOr[Boolean] = js.native
  
  var CellStyles: js.UndefOr[js.Any] = js.native
  
  var Columns: js.Array[IColumnInfo] = js.native
  
  var Fields: js.Array[IFieldInfo] = js.native
  
  var GanttInfo: js.UndefOr[js.Any] = js.native
  
  var GroupingGridRowStyleIds: js.UndefOr[js.Array[_]] = js.native
  
  var HierarchyState: js.UndefOr[js.Any] = js.native
  
  var LocalizedTable: js.Array[_] = js.native
  
  var LookupTableInfo: js.UndefOr[js.Array[ILookupTableInfo]] = js.native
  
  var MetaData: IGridMetadata = js.native
  
  var MultiValueSeparator: js.UndefOr[String] = js.native
  
  var PaneLayout: js.UndefOr[typings.sharepoint.SP.JsGrid.PaneLayout] = js.native
  
  var PivotedColumns: js.UndefOr[js.Array[ColumnInfo]] = js.native
  
  var RecordCount: js.UndefOr[Double] = js.native
  
  var SortState: js.UndefOr[js.Array[_]] = js.native
  
  var TopRecord: js.UndefOr[Double] = js.native
  
  var UnfilteredHierarchy: js.UndefOr[js.Any] = js.native
  
  var UnlocalizedTable: js.Array[_] = js.native
  
  var ViewDepKeys: js.UndefOr[js.Array[_]] = js.native
  
  var ViewInfo: js.Array[_] = js.native
}
object IGridData {
  
  @scala.inline
  def apply(
    Columns: js.Array[IColumnInfo],
    Fields: js.Array[IFieldInfo],
    LocalizedTable: js.Array[_],
    MetaData: IGridMetadata,
    UnlocalizedTable: js.Array[_],
    ViewInfo: js.Array[_]
  ): IGridData = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], Fields = Fields.asInstanceOf[js.Any], LocalizedTable = LocalizedTable.asInstanceOf[js.Any], MetaData = MetaData.asInstanceOf[js.Any], UnlocalizedTable = UnlocalizedTable.asInstanceOf[js.Any], ViewInfo = ViewInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridData]
  }
  
  @scala.inline
  implicit class IGridDataOps[Self <: IGridData] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: IColumnInfo*): Self = this.set("Columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[IColumnInfo]): Self = this.set("Columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: IFieldInfo*): Self = this.set("Fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[IFieldInfo]): Self = this.set("Fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizedTableVarargs(value: js.Any*): Self = this.set("LocalizedTable", js.Array(value :_*))
    
    @scala.inline
    def setLocalizedTable(value: js.Array[_]): Self = this.set("LocalizedTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaData(value: IGridMetadata): Self = this.set("MetaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlocalizedTableVarargs(value: js.Any*): Self = this.set("UnlocalizedTable", js.Array(value :_*))
    
    @scala.inline
    def setUnlocalizedTable(value: js.Array[_]): Self = this.set("UnlocalizedTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewInfoVarargs(value: js.Any*): Self = this.set("ViewInfo", js.Array(value :_*))
    
    @scala.inline
    def setViewInfo(value: js.Array[_]): Self = this.set("ViewInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalParams(value: js.Any): Self = this.set("AdditionalParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalParams: Self = this.set("AdditionalParams", js.undefined)
    
    @scala.inline
    def setAutoFilterEntries(value: js.Any): Self = this.set("AutoFilterEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFilterEntries: Self = this.set("AutoFilterEntries", js.undefined)
    
    @scala.inline
    def setAutoFilterState(value: js.Any): Self = this.set("AutoFilterState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFilterState: Self = this.set("AutoFilterState", js.undefined)
    
    @scala.inline
    def setAutoFilterableColumns(value: Boolean): Self = this.set("AutoFilterableColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFilterableColumns: Self = this.set("AutoFilterableColumns", js.undefined)
    
    @scala.inline
    def setCellStyles(value: js.Any): Self = this.set("CellStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellStyles: Self = this.set("CellStyles", js.undefined)
    
    @scala.inline
    def setGanttInfo(value: js.Any): Self = this.set("GanttInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGanttInfo: Self = this.set("GanttInfo", js.undefined)
    
    @scala.inline
    def setGroupingGridRowStyleIdsVarargs(value: js.Any*): Self = this.set("GroupingGridRowStyleIds", js.Array(value :_*))
    
    @scala.inline
    def setGroupingGridRowStyleIds(value: js.Array[_]): Self = this.set("GroupingGridRowStyleIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupingGridRowStyleIds: Self = this.set("GroupingGridRowStyleIds", js.undefined)
    
    @scala.inline
    def setHierarchyState(value: js.Any): Self = this.set("HierarchyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHierarchyState: Self = this.set("HierarchyState", js.undefined)
    
    @scala.inline
    def setLookupTableInfoVarargs(value: ILookupTableInfo*): Self = this.set("LookupTableInfo", js.Array(value :_*))
    
    @scala.inline
    def setLookupTableInfo(value: js.Array[ILookupTableInfo]): Self = this.set("LookupTableInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookupTableInfo: Self = this.set("LookupTableInfo", js.undefined)
    
    @scala.inline
    def setMultiValueSeparator(value: String): Self = this.set("MultiValueSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiValueSeparator: Self = this.set("MultiValueSeparator", js.undefined)
    
    @scala.inline
    def setPaneLayout(value: PaneLayout): Self = this.set("PaneLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaneLayout: Self = this.set("PaneLayout", js.undefined)
    
    @scala.inline
    def setPivotedColumnsVarargs(value: ColumnInfo*): Self = this.set("PivotedColumns", js.Array(value :_*))
    
    @scala.inline
    def setPivotedColumns(value: js.Array[ColumnInfo]): Self = this.set("PivotedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotedColumns: Self = this.set("PivotedColumns", js.undefined)
    
    @scala.inline
    def setRecordCount(value: Double): Self = this.set("RecordCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordCount: Self = this.set("RecordCount", js.undefined)
    
    @scala.inline
    def setSortStateVarargs(value: js.Any*): Self = this.set("SortState", js.Array(value :_*))
    
    @scala.inline
    def setSortState(value: js.Array[_]): Self = this.set("SortState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortState: Self = this.set("SortState", js.undefined)
    
    @scala.inline
    def setTopRecord(value: Double): Self = this.set("TopRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopRecord: Self = this.set("TopRecord", js.undefined)
    
    @scala.inline
    def setUnfilteredHierarchy(value: js.Any): Self = this.set("UnfilteredHierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnfilteredHierarchy: Self = this.set("UnfilteredHierarchy", js.undefined)
    
    @scala.inline
    def setViewDepKeysVarargs(value: js.Any*): Self = this.set("ViewDepKeys", js.Array(value :_*))
    
    @scala.inline
    def setViewDepKeys(value: js.Array[_]): Self = this.set("ViewDepKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewDepKeys: Self = this.set("ViewDepKeys", js.undefined)
  }
}
