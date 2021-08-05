package typings.reactBootstrapTableNext.mod

import typings.react.mod.CSSProperties
import typings.react.mod.global.JSX.Element
import typings.reactBootstrapTableNext.anon.DataSize
import typings.reactBootstrapTableNext.anon.Order
import typings.reactBootstrapTableNext.anon.Partialpaginationbooleanf
import typings.reactBootstrapTableNext.anon.SortCaret
import typings.reactBootstrapTableNext.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapTableProps[T /* <: js.Object */, K] extends StObject {
  
  var bodyClasses: js.UndefOr[String] = js.undefined
  
  var bootstrap4: js.UndefOr[Boolean] = js.undefined
  
  var bordered: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Same as HTML caption tag, you can set it as String or a React JSX.
    */
  var caption: js.UndefOr[Element | String] = js.undefined
  
  var cellEdit: js.UndefOr[js.Any] = js.undefined
  
  var classes: js.UndefOr[String] = js.undefined
  
  var columns: js.Array[ColumnDescription[js.Any, js.Any]]
  
  var condensed: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Provides data for your table. It accepts a single Array object.
    */
  var data: js.Array[js.Any]
  
  var defaultSortDirection: js.UndefOr[SortOrder] = js.undefined
  
  var defaultSorted: js.UndefOr[js.Array[Order]] = js.undefined
  
  var expandRow: js.UndefOr[ExpandRowProps[T, K]] = js.undefined
  
  var filter: js.UndefOr[js.Any] = js.undefined
  
  var filterPosition: js.UndefOr[FilterPosition] = js.undefined
  
  var filtersClasses: js.UndefOr[String] = js.undefined
  
  var footerClasses: js.UndefOr[String] = js.undefined
  
  var headerClasses: js.UndefOr[String] = js.undefined
  
  var headerWrapperClasses: js.UndefOr[String] = js.undefined
  
  var hover: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Tells react-bootstrap-table2 which column is unique.
    */
  var keyField: String
  
  var noDataIndication: js.UndefOr[(js.Function0[Element | String]) | Element | String] = js.undefined
  
  /**
    * This callback function will be called only when data size change by search/filter etc.
    */
  var onDataSizeChange: js.UndefOr[js.Function1[/* props */ DataSize, Unit]] = js.undefined
  
  var onExternalFilter: js.UndefOr[js.Any] = js.undefined
  
  var onFilter: js.UndefOr[js.Any] = js.undefined
  
  var onSort: js.UndefOr[js.Any] = js.undefined
  
  var onTableChange: js.UndefOr[TableChangeHandler[T]] = js.undefined
  
  var overlay: js.UndefOr[js.Any] = js.undefined
  
  var pagination: js.UndefOr[`0`] = js.undefined
  
  var parentClassName: js.UndefOr[
    String | (js.Function3[/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double, String])
  ] = js.undefined
  
  var remote: js.UndefOr[Boolean | Partialpaginationbooleanf] = js.undefined
  
  var rowClasses: js.UndefOr[(js.Function2[/* row */ T, /* rowIndex */ Double, String]) | String] = js.undefined
  
  var rowEvents: js.UndefOr[RowEventHandlerProps[js.Any]] = js.undefined
  
  var rowStyle: js.UndefOr[
    (js.Function2[/* row */ T, /* rowIndex */ Double, CSSProperties]) | CSSProperties
  ] = js.undefined
  
  var search: js.UndefOr[SearchProps[T] | Boolean] = js.undefined
  
  var selectRow: js.UndefOr[SelectRowProps[T]] = js.undefined
  
  var sort: js.UndefOr[SortCaret] = js.undefined
  
  var striped: js.UndefOr[Boolean] = js.undefined
  
  var tabIndexCell: js.UndefOr[Boolean] = js.undefined
  
  var wrapperClasses: js.UndefOr[String] = js.undefined
}
object BootstrapTableProps {
  
  inline def apply[T /* <: js.Object */, K](columns: js.Array[ColumnDescription[js.Any, js.Any]], data: js.Array[js.Any], keyField: String): BootstrapTableProps[T, K] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keyField = keyField.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapTableProps[T, K]]
  }
  
  extension [Self <: BootstrapTableProps[?, ?], T /* <: js.Object */, K](x: Self & (BootstrapTableProps[T, K])) {
    
    inline def setBodyClasses(value: String): Self = StObject.set(x, "bodyClasses", value.asInstanceOf[js.Any])
    
    inline def setBodyClassesUndefined: Self = StObject.set(x, "bodyClasses", js.undefined)
    
    inline def setBootstrap4(value: Boolean): Self = StObject.set(x, "bootstrap4", value.asInstanceOf[js.Any])
    
    inline def setBootstrap4Undefined: Self = StObject.set(x, "bootstrap4", js.undefined)
    
    inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
    
    inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
    
    inline def setCaption(value: Element | String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setCellEdit(value: js.Any): Self = StObject.set(x, "cellEdit", value.asInstanceOf[js.Any])
    
    inline def setCellEditUndefined: Self = StObject.set(x, "cellEdit", js.undefined)
    
    inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setColumns(value: js.Array[ColumnDescription[js.Any, js.Any]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: (ColumnDescription[js.Any, js.Any])*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setCondensed(value: Boolean): Self = StObject.set(x, "condensed", value.asInstanceOf[js.Any])
    
    inline def setCondensedUndefined: Self = StObject.set(x, "condensed", js.undefined)
    
    inline def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setDefaultSortDirection(value: SortOrder): Self = StObject.set(x, "defaultSortDirection", value.asInstanceOf[js.Any])
    
    inline def setDefaultSortDirectionUndefined: Self = StObject.set(x, "defaultSortDirection", js.undefined)
    
    inline def setDefaultSorted(value: js.Array[Order]): Self = StObject.set(x, "defaultSorted", value.asInstanceOf[js.Any])
    
    inline def setDefaultSortedUndefined: Self = StObject.set(x, "defaultSorted", js.undefined)
    
    inline def setDefaultSortedVarargs(value: Order*): Self = StObject.set(x, "defaultSorted", js.Array(value :_*))
    
    inline def setExpandRow(value: ExpandRowProps[T, K]): Self = StObject.set(x, "expandRow", value.asInstanceOf[js.Any])
    
    inline def setExpandRowUndefined: Self = StObject.set(x, "expandRow", js.undefined)
    
    inline def setFilter(value: js.Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterPosition(value: FilterPosition): Self = StObject.set(x, "filterPosition", value.asInstanceOf[js.Any])
    
    inline def setFilterPositionUndefined: Self = StObject.set(x, "filterPosition", js.undefined)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFiltersClasses(value: String): Self = StObject.set(x, "filtersClasses", value.asInstanceOf[js.Any])
    
    inline def setFiltersClassesUndefined: Self = StObject.set(x, "filtersClasses", js.undefined)
    
    inline def setFooterClasses(value: String): Self = StObject.set(x, "footerClasses", value.asInstanceOf[js.Any])
    
    inline def setFooterClassesUndefined: Self = StObject.set(x, "footerClasses", js.undefined)
    
    inline def setHeaderClasses(value: String): Self = StObject.set(x, "headerClasses", value.asInstanceOf[js.Any])
    
    inline def setHeaderClassesUndefined: Self = StObject.set(x, "headerClasses", js.undefined)
    
    inline def setHeaderWrapperClasses(value: String): Self = StObject.set(x, "headerWrapperClasses", value.asInstanceOf[js.Any])
    
    inline def setHeaderWrapperClassesUndefined: Self = StObject.set(x, "headerWrapperClasses", js.undefined)
    
    inline def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKeyField(value: String): Self = StObject.set(x, "keyField", value.asInstanceOf[js.Any])
    
    inline def setNoDataIndication(value: (js.Function0[Element | String]) | Element | String): Self = StObject.set(x, "noDataIndication", value.asInstanceOf[js.Any])
    
    inline def setNoDataIndicationFunction0(value: () => Element | String): Self = StObject.set(x, "noDataIndication", js.Any.fromFunction0(value))
    
    inline def setNoDataIndicationUndefined: Self = StObject.set(x, "noDataIndication", js.undefined)
    
    inline def setOnDataSizeChange(value: /* props */ DataSize => Unit): Self = StObject.set(x, "onDataSizeChange", js.Any.fromFunction1(value))
    
    inline def setOnDataSizeChangeUndefined: Self = StObject.set(x, "onDataSizeChange", js.undefined)
    
    inline def setOnExternalFilter(value: js.Any): Self = StObject.set(x, "onExternalFilter", value.asInstanceOf[js.Any])
    
    inline def setOnExternalFilterUndefined: Self = StObject.set(x, "onExternalFilter", js.undefined)
    
    inline def setOnFilter(value: js.Any): Self = StObject.set(x, "onFilter", value.asInstanceOf[js.Any])
    
    inline def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
    
    inline def setOnSort(value: js.Any): Self = StObject.set(x, "onSort", value.asInstanceOf[js.Any])
    
    inline def setOnSortUndefined: Self = StObject.set(x, "onSort", js.undefined)
    
    inline def setOnTableChange(value: (/* type */ TableChangeType, /* newState */ TableChangeState[T]) => Unit): Self = StObject.set(x, "onTableChange", js.Any.fromFunction2(value))
    
    inline def setOnTableChangeUndefined: Self = StObject.set(x, "onTableChange", js.undefined)
    
    inline def setOverlay(value: js.Any): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    inline def setPagination(value: `0`): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    
    inline def setParentClassName(value: String | (js.Function3[/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double, String])): Self = StObject.set(x, "parentClassName", value.asInstanceOf[js.Any])
    
    inline def setParentClassNameFunction3(value: (/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double) => String): Self = StObject.set(x, "parentClassName", js.Any.fromFunction3(value))
    
    inline def setParentClassNameUndefined: Self = StObject.set(x, "parentClassName", js.undefined)
    
    inline def setRemote(value: Boolean | Partialpaginationbooleanf): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    inline def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
    
    inline def setRowClasses(value: (js.Function2[/* row */ T, /* rowIndex */ Double, String]) | String): Self = StObject.set(x, "rowClasses", value.asInstanceOf[js.Any])
    
    inline def setRowClassesFunction2(value: (/* row */ T, /* rowIndex */ Double) => String): Self = StObject.set(x, "rowClasses", js.Any.fromFunction2(value))
    
    inline def setRowClassesUndefined: Self = StObject.set(x, "rowClasses", js.undefined)
    
    inline def setRowEvents(value: RowEventHandlerProps[js.Any]): Self = StObject.set(x, "rowEvents", value.asInstanceOf[js.Any])
    
    inline def setRowEventsUndefined: Self = StObject.set(x, "rowEvents", js.undefined)
    
    inline def setRowStyle(value: (js.Function2[/* row */ T, /* rowIndex */ Double, CSSProperties]) | CSSProperties): Self = StObject.set(x, "rowStyle", value.asInstanceOf[js.Any])
    
    inline def setRowStyleFunction2(value: (/* row */ T, /* rowIndex */ Double) => CSSProperties): Self = StObject.set(x, "rowStyle", js.Any.fromFunction2(value))
    
    inline def setRowStyleUndefined: Self = StObject.set(x, "rowStyle", js.undefined)
    
    inline def setSearch(value: SearchProps[T] | Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setSelectRow(value: SelectRowProps[T]): Self = StObject.set(x, "selectRow", value.asInstanceOf[js.Any])
    
    inline def setSelectRowUndefined: Self = StObject.set(x, "selectRow", js.undefined)
    
    inline def setSort(value: SortCaret): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setStriped(value: Boolean): Self = StObject.set(x, "striped", value.asInstanceOf[js.Any])
    
    inline def setStripedUndefined: Self = StObject.set(x, "striped", js.undefined)
    
    inline def setTabIndexCell(value: Boolean): Self = StObject.set(x, "tabIndexCell", value.asInstanceOf[js.Any])
    
    inline def setTabIndexCellUndefined: Self = StObject.set(x, "tabIndexCell", js.undefined)
    
    inline def setWrapperClasses(value: String): Self = StObject.set(x, "wrapperClasses", value.asInstanceOf[js.Any])
    
    inline def setWrapperClassesUndefined: Self = StObject.set(x, "wrapperClasses", js.undefined)
  }
}
