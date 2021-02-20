package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGridData extends StObject {
  
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
  implicit class IGridDataMutableBuilder[Self <: IGridData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalParams(value: js.Any): Self = StObject.set(x, "AdditionalParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalParamsUndefined: Self = StObject.set(x, "AdditionalParams", js.undefined)
    
    @scala.inline
    def setAutoFilterEntries(value: js.Any): Self = StObject.set(x, "AutoFilterEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFilterEntriesUndefined: Self = StObject.set(x, "AutoFilterEntries", js.undefined)
    
    @scala.inline
    def setAutoFilterState(value: js.Any): Self = StObject.set(x, "AutoFilterState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFilterStateUndefined: Self = StObject.set(x, "AutoFilterState", js.undefined)
    
    @scala.inline
    def setAutoFilterableColumns(value: Boolean): Self = StObject.set(x, "AutoFilterableColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFilterableColumnsUndefined: Self = StObject.set(x, "AutoFilterableColumns", js.undefined)
    
    @scala.inline
    def setCellStyles(value: js.Any): Self = StObject.set(x, "CellStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellStylesUndefined: Self = StObject.set(x, "CellStyles", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Array[IColumnInfo]): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: IColumnInfo*): Self = StObject.set(x, "Columns", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[IFieldInfo]): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: IFieldInfo*): Self = StObject.set(x, "Fields", js.Array(value :_*))
    
    @scala.inline
    def setGanttInfo(value: js.Any): Self = StObject.set(x, "GanttInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGanttInfoUndefined: Self = StObject.set(x, "GanttInfo", js.undefined)
    
    @scala.inline
    def setGroupingGridRowStyleIds(value: js.Array[_]): Self = StObject.set(x, "GroupingGridRowStyleIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingGridRowStyleIdsUndefined: Self = StObject.set(x, "GroupingGridRowStyleIds", js.undefined)
    
    @scala.inline
    def setGroupingGridRowStyleIdsVarargs(value: js.Any*): Self = StObject.set(x, "GroupingGridRowStyleIds", js.Array(value :_*))
    
    @scala.inline
    def setHierarchyState(value: js.Any): Self = StObject.set(x, "HierarchyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchyStateUndefined: Self = StObject.set(x, "HierarchyState", js.undefined)
    
    @scala.inline
    def setLocalizedTable(value: js.Array[_]): Self = StObject.set(x, "LocalizedTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizedTableVarargs(value: js.Any*): Self = StObject.set(x, "LocalizedTable", js.Array(value :_*))
    
    @scala.inline
    def setLookupTableInfo(value: js.Array[ILookupTableInfo]): Self = StObject.set(x, "LookupTableInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookupTableInfoUndefined: Self = StObject.set(x, "LookupTableInfo", js.undefined)
    
    @scala.inline
    def setLookupTableInfoVarargs(value: ILookupTableInfo*): Self = StObject.set(x, "LookupTableInfo", js.Array(value :_*))
    
    @scala.inline
    def setMetaData(value: IGridMetadata): Self = StObject.set(x, "MetaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueSeparator(value: String): Self = StObject.set(x, "MultiValueSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueSeparatorUndefined: Self = StObject.set(x, "MultiValueSeparator", js.undefined)
    
    @scala.inline
    def setPaneLayout(value: PaneLayout): Self = StObject.set(x, "PaneLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaneLayoutUndefined: Self = StObject.set(x, "PaneLayout", js.undefined)
    
    @scala.inline
    def setPivotedColumns(value: js.Array[ColumnInfo]): Self = StObject.set(x, "PivotedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotedColumnsUndefined: Self = StObject.set(x, "PivotedColumns", js.undefined)
    
    @scala.inline
    def setPivotedColumnsVarargs(value: ColumnInfo*): Self = StObject.set(x, "PivotedColumns", js.Array(value :_*))
    
    @scala.inline
    def setRecordCount(value: Double): Self = StObject.set(x, "RecordCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordCountUndefined: Self = StObject.set(x, "RecordCount", js.undefined)
    
    @scala.inline
    def setSortState(value: js.Array[_]): Self = StObject.set(x, "SortState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortStateUndefined: Self = StObject.set(x, "SortState", js.undefined)
    
    @scala.inline
    def setSortStateVarargs(value: js.Any*): Self = StObject.set(x, "SortState", js.Array(value :_*))
    
    @scala.inline
    def setTopRecord(value: Double): Self = StObject.set(x, "TopRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopRecordUndefined: Self = StObject.set(x, "TopRecord", js.undefined)
    
    @scala.inline
    def setUnfilteredHierarchy(value: js.Any): Self = StObject.set(x, "UnfilteredHierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnfilteredHierarchyUndefined: Self = StObject.set(x, "UnfilteredHierarchy", js.undefined)
    
    @scala.inline
    def setUnlocalizedTable(value: js.Array[_]): Self = StObject.set(x, "UnlocalizedTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlocalizedTableVarargs(value: js.Any*): Self = StObject.set(x, "UnlocalizedTable", js.Array(value :_*))
    
    @scala.inline
    def setViewDepKeys(value: js.Array[_]): Self = StObject.set(x, "ViewDepKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewDepKeysUndefined: Self = StObject.set(x, "ViewDepKeys", js.undefined)
    
    @scala.inline
    def setViewDepKeysVarargs(value: js.Any*): Self = StObject.set(x, "ViewDepKeys", js.Array(value :_*))
    
    @scala.inline
    def setViewInfo(value: js.Array[_]): Self = StObject.set(x, "ViewInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewInfoVarargs(value: js.Any*): Self = StObject.set(x, "ViewInfo", js.Array(value :_*))
  }
}
