package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGridData extends StObject {
  
  var AdditionalParams: js.UndefOr[Any] = js.undefined
  
  var AutoFilterEntries: js.UndefOr[Any] = js.undefined
  
  var AutoFilterState: js.UndefOr[Any] = js.undefined
  
  var AutoFilterableColumns: js.UndefOr[Boolean] = js.undefined
  
  var CellStyles: js.UndefOr[Any] = js.undefined
  
  var Columns: js.Array[IColumnInfo]
  
  var Fields: js.Array[IFieldInfo]
  
  var GanttInfo: js.UndefOr[Any] = js.undefined
  
  var GroupingGridRowStyleIds: js.UndefOr[js.Array[Any]] = js.undefined
  
  var HierarchyState: js.UndefOr[Any] = js.undefined
  
  var LocalizedTable: js.Array[Any]
  
  var LookupTableInfo: js.UndefOr[js.Array[ILookupTableInfo]] = js.undefined
  
  var MetaData: IGridMetadata
  
  var MultiValueSeparator: js.UndefOr[String] = js.undefined
  
  var PaneLayout: js.UndefOr[typings.sharepoint.SP.JsGrid.PaneLayout] = js.undefined
  
  var PivotedColumns: js.UndefOr[js.Array[ColumnInfo]] = js.undefined
  
  var RecordCount: js.UndefOr[Double] = js.undefined
  
  var SortState: js.UndefOr[js.Array[Any]] = js.undefined
  
  var TopRecord: js.UndefOr[Double] = js.undefined
  
  var UnfilteredHierarchy: js.UndefOr[Any] = js.undefined
  
  var UnlocalizedTable: js.Array[Any]
  
  var ViewDepKeys: js.UndefOr[js.Array[Any]] = js.undefined
  
  var ViewInfo: js.Array[Any]
}
object IGridData {
  
  inline def apply(
    Columns: js.Array[IColumnInfo],
    Fields: js.Array[IFieldInfo],
    LocalizedTable: js.Array[Any],
    MetaData: IGridMetadata,
    UnlocalizedTable: js.Array[Any],
    ViewInfo: js.Array[Any]
  ): IGridData = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], Fields = Fields.asInstanceOf[js.Any], LocalizedTable = LocalizedTable.asInstanceOf[js.Any], MetaData = MetaData.asInstanceOf[js.Any], UnlocalizedTable = UnlocalizedTable.asInstanceOf[js.Any], ViewInfo = ViewInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGridData] (val x: Self) extends AnyVal {
    
    inline def setAdditionalParams(value: Any): Self = StObject.set(x, "AdditionalParams", value.asInstanceOf[js.Any])
    
    inline def setAdditionalParamsUndefined: Self = StObject.set(x, "AdditionalParams", js.undefined)
    
    inline def setAutoFilterEntries(value: Any): Self = StObject.set(x, "AutoFilterEntries", value.asInstanceOf[js.Any])
    
    inline def setAutoFilterEntriesUndefined: Self = StObject.set(x, "AutoFilterEntries", js.undefined)
    
    inline def setAutoFilterState(value: Any): Self = StObject.set(x, "AutoFilterState", value.asInstanceOf[js.Any])
    
    inline def setAutoFilterStateUndefined: Self = StObject.set(x, "AutoFilterState", js.undefined)
    
    inline def setAutoFilterableColumns(value: Boolean): Self = StObject.set(x, "AutoFilterableColumns", value.asInstanceOf[js.Any])
    
    inline def setAutoFilterableColumnsUndefined: Self = StObject.set(x, "AutoFilterableColumns", js.undefined)
    
    inline def setCellStyles(value: Any): Self = StObject.set(x, "CellStyles", value.asInstanceOf[js.Any])
    
    inline def setCellStylesUndefined: Self = StObject.set(x, "CellStyles", js.undefined)
    
    inline def setColumns(value: js.Array[IColumnInfo]): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: IColumnInfo*): Self = StObject.set(x, "Columns", js.Array(value*))
    
    inline def setFields(value: js.Array[IFieldInfo]): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: IFieldInfo*): Self = StObject.set(x, "Fields", js.Array(value*))
    
    inline def setGanttInfo(value: Any): Self = StObject.set(x, "GanttInfo", value.asInstanceOf[js.Any])
    
    inline def setGanttInfoUndefined: Self = StObject.set(x, "GanttInfo", js.undefined)
    
    inline def setGroupingGridRowStyleIds(value: js.Array[Any]): Self = StObject.set(x, "GroupingGridRowStyleIds", value.asInstanceOf[js.Any])
    
    inline def setGroupingGridRowStyleIdsUndefined: Self = StObject.set(x, "GroupingGridRowStyleIds", js.undefined)
    
    inline def setGroupingGridRowStyleIdsVarargs(value: Any*): Self = StObject.set(x, "GroupingGridRowStyleIds", js.Array(value*))
    
    inline def setHierarchyState(value: Any): Self = StObject.set(x, "HierarchyState", value.asInstanceOf[js.Any])
    
    inline def setHierarchyStateUndefined: Self = StObject.set(x, "HierarchyState", js.undefined)
    
    inline def setLocalizedTable(value: js.Array[Any]): Self = StObject.set(x, "LocalizedTable", value.asInstanceOf[js.Any])
    
    inline def setLocalizedTableVarargs(value: Any*): Self = StObject.set(x, "LocalizedTable", js.Array(value*))
    
    inline def setLookupTableInfo(value: js.Array[ILookupTableInfo]): Self = StObject.set(x, "LookupTableInfo", value.asInstanceOf[js.Any])
    
    inline def setLookupTableInfoUndefined: Self = StObject.set(x, "LookupTableInfo", js.undefined)
    
    inline def setLookupTableInfoVarargs(value: ILookupTableInfo*): Self = StObject.set(x, "LookupTableInfo", js.Array(value*))
    
    inline def setMetaData(value: IGridMetadata): Self = StObject.set(x, "MetaData", value.asInstanceOf[js.Any])
    
    inline def setMultiValueSeparator(value: String): Self = StObject.set(x, "MultiValueSeparator", value.asInstanceOf[js.Any])
    
    inline def setMultiValueSeparatorUndefined: Self = StObject.set(x, "MultiValueSeparator", js.undefined)
    
    inline def setPaneLayout(value: PaneLayout): Self = StObject.set(x, "PaneLayout", value.asInstanceOf[js.Any])
    
    inline def setPaneLayoutUndefined: Self = StObject.set(x, "PaneLayout", js.undefined)
    
    inline def setPivotedColumns(value: js.Array[ColumnInfo]): Self = StObject.set(x, "PivotedColumns", value.asInstanceOf[js.Any])
    
    inline def setPivotedColumnsUndefined: Self = StObject.set(x, "PivotedColumns", js.undefined)
    
    inline def setPivotedColumnsVarargs(value: ColumnInfo*): Self = StObject.set(x, "PivotedColumns", js.Array(value*))
    
    inline def setRecordCount(value: Double): Self = StObject.set(x, "RecordCount", value.asInstanceOf[js.Any])
    
    inline def setRecordCountUndefined: Self = StObject.set(x, "RecordCount", js.undefined)
    
    inline def setSortState(value: js.Array[Any]): Self = StObject.set(x, "SortState", value.asInstanceOf[js.Any])
    
    inline def setSortStateUndefined: Self = StObject.set(x, "SortState", js.undefined)
    
    inline def setSortStateVarargs(value: Any*): Self = StObject.set(x, "SortState", js.Array(value*))
    
    inline def setTopRecord(value: Double): Self = StObject.set(x, "TopRecord", value.asInstanceOf[js.Any])
    
    inline def setTopRecordUndefined: Self = StObject.set(x, "TopRecord", js.undefined)
    
    inline def setUnfilteredHierarchy(value: Any): Self = StObject.set(x, "UnfilteredHierarchy", value.asInstanceOf[js.Any])
    
    inline def setUnfilteredHierarchyUndefined: Self = StObject.set(x, "UnfilteredHierarchy", js.undefined)
    
    inline def setUnlocalizedTable(value: js.Array[Any]): Self = StObject.set(x, "UnlocalizedTable", value.asInstanceOf[js.Any])
    
    inline def setUnlocalizedTableVarargs(value: Any*): Self = StObject.set(x, "UnlocalizedTable", js.Array(value*))
    
    inline def setViewDepKeys(value: js.Array[Any]): Self = StObject.set(x, "ViewDepKeys", value.asInstanceOf[js.Any])
    
    inline def setViewDepKeysUndefined: Self = StObject.set(x, "ViewDepKeys", js.undefined)
    
    inline def setViewDepKeysVarargs(value: Any*): Self = StObject.set(x, "ViewDepKeys", js.Array(value*))
    
    inline def setViewInfo(value: js.Array[Any]): Self = StObject.set(x, "ViewInfo", value.asInstanceOf[js.Any])
    
    inline def setViewInfoVarargs(value: Any*): Self = StObject.set(x, "ViewInfo", js.Array(value*))
  }
}
