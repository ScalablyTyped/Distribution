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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapTableProps[T /* <: js.Object */, K] extends StObject {
  
  var bodyClasses: js.UndefOr[String] = js.native
  
  var bootstrap4: js.UndefOr[Boolean] = js.native
  
  var bordered: js.UndefOr[Boolean] = js.native
  
  /**
    * Same as HTML caption tag, you can set it as String or a React JSX.
    */
  var caption: js.UndefOr[Element | String] = js.native
  
  var cellEdit: js.UndefOr[js.Any] = js.native
  
  var classes: js.UndefOr[String] = js.native
  
  var columns: js.Array[ColumnDescription[_, _]] = js.native
  
  var condensed: js.UndefOr[Boolean] = js.native
  
  /**
    *  Provides data for your table. It accepts a single Array object.
    */
  var data: js.Array[_] = js.native
  
  var defaultSortDirection: js.UndefOr[SortOrder] = js.native
  
  var defaultSorted: js.UndefOr[js.Array[Order]] = js.native
  
  var expandRow: js.UndefOr[ExpandRowProps[T, K]] = js.native
  
  var filter: js.UndefOr[js.Any] = js.native
  
  var filterPosition: js.UndefOr[FilterPosition] = js.native
  
  var filtersClasses: js.UndefOr[String] = js.native
  
  var footerClasses: js.UndefOr[String] = js.native
  
  var headerClasses: js.UndefOr[String] = js.native
  
  var headerWrapperClasses: js.UndefOr[String] = js.native
  
  var hover: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  /**
    * Tells react-bootstrap-table2 which column is unique.
    */
  var keyField: String = js.native
  
  var noDataIndication: js.UndefOr[(js.Function0[Element | String]) | Element | String] = js.native
  
  /**
    * This callback function will be called only when data size change by search/filter etc.
    */
  var onDataSizeChange: js.UndefOr[js.Function1[/* props */ DataSize, Unit]] = js.native
  
  var onExternalFilter: js.UndefOr[js.Any] = js.native
  
  var onFilter: js.UndefOr[js.Any] = js.native
  
  var onSort: js.UndefOr[js.Any] = js.native
  
  var onTableChange: js.UndefOr[TableChangeHandler[T]] = js.native
  
  var overlay: js.UndefOr[js.Any] = js.native
  
  var pagination: js.UndefOr[`0`] = js.native
  
  var parentClassName: js.UndefOr[
    String | (js.Function3[/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double, String])
  ] = js.native
  
  var remote: js.UndefOr[Boolean | Partialpaginationbooleanf] = js.native
  
  var rowClasses: js.UndefOr[(js.Function2[/* row */ T, /* rowIndex */ Double, String]) | String] = js.native
  
  var rowEvents: js.UndefOr[RowEventHandlerProps[_]] = js.native
  
  var rowStyle: js.UndefOr[
    (js.Function2[/* row */ T, /* rowIndex */ Double, CSSProperties]) | CSSProperties
  ] = js.native
  
  var search: js.UndefOr[SearchProps[T] | Boolean] = js.native
  
  var selectRow: js.UndefOr[SelectRowProps[T]] = js.native
  
  var sort: js.UndefOr[SortCaret] = js.native
  
  var striped: js.UndefOr[Boolean] = js.native
  
  var tabIndexCell: js.UndefOr[Boolean] = js.native
  
  var wrapperClasses: js.UndefOr[String] = js.native
}
object BootstrapTableProps {
  
  @scala.inline
  def apply[T /* <: js.Object */, K](columns: js.Array[ColumnDescription[_, _]], data: js.Array[_], keyField: String): BootstrapTableProps[T, K] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keyField = keyField.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapTableProps[T, K]]
  }
  
  @scala.inline
  implicit class BootstrapTablePropsMutableBuilder[Self <: BootstrapTableProps[_, _], T /* <: js.Object */, K] (val x: Self with (BootstrapTableProps[T, K])) extends AnyVal {
    
    @scala.inline
    def setBodyClasses(value: String): Self = StObject.set(x, "bodyClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyClassesUndefined: Self = StObject.set(x, "bodyClasses", js.undefined)
    
    @scala.inline
    def setBootstrap4(value: Boolean): Self = StObject.set(x, "bootstrap4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrap4Undefined: Self = StObject.set(x, "bootstrap4", js.undefined)
    
    @scala.inline
    def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
    
    @scala.inline
    def setCaption(value: Element | String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setCellEdit(value: js.Any): Self = StObject.set(x, "cellEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellEditUndefined: Self = StObject.set(x, "cellEdit", js.undefined)
    
    @scala.inline
    def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Array[ColumnDescription[_, _]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: (ColumnDescription[js.Any, js.Any])*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setCondensed(value: Boolean): Self = StObject.set(x, "condensed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCondensedUndefined: Self = StObject.set(x, "condensed", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDefaultSortDirection(value: SortOrder): Self = StObject.set(x, "defaultSortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSortDirectionUndefined: Self = StObject.set(x, "defaultSortDirection", js.undefined)
    
    @scala.inline
    def setDefaultSorted(value: js.Array[Order]): Self = StObject.set(x, "defaultSorted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSortedUndefined: Self = StObject.set(x, "defaultSorted", js.undefined)
    
    @scala.inline
    def setDefaultSortedVarargs(value: Order*): Self = StObject.set(x, "defaultSorted", js.Array(value :_*))
    
    @scala.inline
    def setExpandRow(value: ExpandRowProps[T, K]): Self = StObject.set(x, "expandRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandRowUndefined: Self = StObject.set(x, "expandRow", js.undefined)
    
    @scala.inline
    def setFilter(value: js.Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterPosition(value: FilterPosition): Self = StObject.set(x, "filterPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterPositionUndefined: Self = StObject.set(x, "filterPosition", js.undefined)
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFiltersClasses(value: String): Self = StObject.set(x, "filtersClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersClassesUndefined: Self = StObject.set(x, "filtersClasses", js.undefined)
    
    @scala.inline
    def setFooterClasses(value: String): Self = StObject.set(x, "footerClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterClassesUndefined: Self = StObject.set(x, "footerClasses", js.undefined)
    
    @scala.inline
    def setHeaderClasses(value: String): Self = StObject.set(x, "headerClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderClassesUndefined: Self = StObject.set(x, "headerClasses", js.undefined)
    
    @scala.inline
    def setHeaderWrapperClasses(value: String): Self = StObject.set(x, "headerWrapperClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderWrapperClassesUndefined: Self = StObject.set(x, "headerWrapperClasses", js.undefined)
    
    @scala.inline
    def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKeyField(value: String): Self = StObject.set(x, "keyField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDataIndication(value: (js.Function0[Element | String]) | Element | String): Self = StObject.set(x, "noDataIndication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDataIndicationFunction0(value: () => Element | String): Self = StObject.set(x, "noDataIndication", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNoDataIndicationUndefined: Self = StObject.set(x, "noDataIndication", js.undefined)
    
    @scala.inline
    def setOnDataSizeChange(value: /* props */ DataSize => Unit): Self = StObject.set(x, "onDataSizeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDataSizeChangeUndefined: Self = StObject.set(x, "onDataSizeChange", js.undefined)
    
    @scala.inline
    def setOnExternalFilter(value: js.Any): Self = StObject.set(x, "onExternalFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnExternalFilterUndefined: Self = StObject.set(x, "onExternalFilter", js.undefined)
    
    @scala.inline
    def setOnFilter(value: js.Any): Self = StObject.set(x, "onFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
    
    @scala.inline
    def setOnSort(value: js.Any): Self = StObject.set(x, "onSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSortUndefined: Self = StObject.set(x, "onSort", js.undefined)
    
    @scala.inline
    def setOnTableChange(value: (/* type */ TableChangeType, /* newState */ TableChangeState[T]) => Unit): Self = StObject.set(x, "onTableChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnTableChangeUndefined: Self = StObject.set(x, "onTableChange", js.undefined)
    
    @scala.inline
    def setOverlay(value: js.Any): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    @scala.inline
    def setPagination(value: `0`): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    
    @scala.inline
    def setParentClassName(value: String | (js.Function3[/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double, String])): Self = StObject.set(x, "parentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentClassNameFunction3(value: (/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double) => String): Self = StObject.set(x, "parentClassName", js.Any.fromFunction3(value))
    
    @scala.inline
    def setParentClassNameUndefined: Self = StObject.set(x, "parentClassName", js.undefined)
    
    @scala.inline
    def setRemote(value: Boolean | Partialpaginationbooleanf): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
    
    @scala.inline
    def setRowClasses(value: (js.Function2[/* row */ T, /* rowIndex */ Double, String]) | String): Self = StObject.set(x, "rowClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowClassesFunction2(value: (/* row */ T, /* rowIndex */ Double) => String): Self = StObject.set(x, "rowClasses", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRowClassesUndefined: Self = StObject.set(x, "rowClasses", js.undefined)
    
    @scala.inline
    def setRowEvents(value: RowEventHandlerProps[_]): Self = StObject.set(x, "rowEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowEventsUndefined: Self = StObject.set(x, "rowEvents", js.undefined)
    
    @scala.inline
    def setRowStyle(value: (js.Function2[/* row */ T, /* rowIndex */ Double, CSSProperties]) | CSSProperties): Self = StObject.set(x, "rowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowStyleFunction2(value: (/* row */ T, /* rowIndex */ Double) => CSSProperties): Self = StObject.set(x, "rowStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRowStyleUndefined: Self = StObject.set(x, "rowStyle", js.undefined)
    
    @scala.inline
    def setSearch(value: SearchProps[T] | Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    @scala.inline
    def setSelectRow(value: SelectRowProps[T]): Self = StObject.set(x, "selectRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectRowUndefined: Self = StObject.set(x, "selectRow", js.undefined)
    
    @scala.inline
    def setSort(value: SortCaret): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setStriped(value: Boolean): Self = StObject.set(x, "striped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripedUndefined: Self = StObject.set(x, "striped", js.undefined)
    
    @scala.inline
    def setTabIndexCell(value: Boolean): Self = StObject.set(x, "tabIndexCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexCellUndefined: Self = StObject.set(x, "tabIndexCell", js.undefined)
    
    @scala.inline
    def setWrapperClasses(value: String): Self = StObject.set(x, "wrapperClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperClassesUndefined: Self = StObject.set(x, "wrapperClasses", js.undefined)
  }
}
