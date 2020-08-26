package typings.reactBootstrapTableNext.mod

import typings.react.mod.CSSProperties
import typings.react.mod.global.JSX.Element
import typings.reactBootstrapTableNext.anon.DataSize
import typings.reactBootstrapTableNext.anon.Order
import typings.reactBootstrapTableNext.anon.Partialpaginationbooleanf
import typings.reactBootstrapTableNext.anon.SortCaret
import typings.reactBootstrapTableNext.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapTableProps[T /* <: js.Object */] extends js.Object {
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
  var expandRow: js.UndefOr[ExpandRowProps[T]] = js.native
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
  var noDataIndication: js.UndefOr[js.Function0[Element | String]] = js.native
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
  def apply[/* <: js.Object */ T](columns: js.Array[ColumnDescription[_, _]], data: js.Array[_], keyField: String): BootstrapTableProps[T] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keyField = keyField.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapTableProps[T]]
  }
  @scala.inline
  implicit class BootstrapTablePropsOps[Self <: BootstrapTableProps[_], /* <: js.Object */ T] (val x: Self with BootstrapTableProps[T]) extends AnyVal {
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
    def setColumnsVarargs(value: (ColumnDescription[js.Any, js.Any])*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[ColumnDescription[_, _]]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyField(value: String): Self = this.set("keyField", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyClasses(value: String): Self = this.set("bodyClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyClasses: Self = this.set("bodyClasses", js.undefined)
    @scala.inline
    def setBootstrap4(value: Boolean): Self = this.set("bootstrap4", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBootstrap4: Self = this.set("bootstrap4", js.undefined)
    @scala.inline
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBordered: Self = this.set("bordered", js.undefined)
    @scala.inline
    def setCaption(value: Element | String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setCellEdit(value: js.Any): Self = this.set("cellEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellEdit: Self = this.set("cellEdit", js.undefined)
    @scala.inline
    def setClasses(value: String): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setCondensed(value: Boolean): Self = this.set("condensed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondensed: Self = this.set("condensed", js.undefined)
    @scala.inline
    def setDefaultSortDirection(value: SortOrder): Self = this.set("defaultSortDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSortDirection: Self = this.set("defaultSortDirection", js.undefined)
    @scala.inline
    def setDefaultSortedVarargs(value: Order*): Self = this.set("defaultSorted", js.Array(value :_*))
    @scala.inline
    def setDefaultSorted(value: js.Array[Order]): Self = this.set("defaultSorted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSorted: Self = this.set("defaultSorted", js.undefined)
    @scala.inline
    def setExpandRow(value: ExpandRowProps[T]): Self = this.set("expandRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandRow: Self = this.set("expandRow", js.undefined)
    @scala.inline
    def setFilter(value: js.Any): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFilterPosition(value: FilterPosition): Self = this.set("filterPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterPosition: Self = this.set("filterPosition", js.undefined)
    @scala.inline
    def setFiltersClasses(value: String): Self = this.set("filtersClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiltersClasses: Self = this.set("filtersClasses", js.undefined)
    @scala.inline
    def setFooterClasses(value: String): Self = this.set("footerClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterClasses: Self = this.set("footerClasses", js.undefined)
    @scala.inline
    def setHeaderClasses(value: String): Self = this.set("headerClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderClasses: Self = this.set("headerClasses", js.undefined)
    @scala.inline
    def setHeaderWrapperClasses(value: String): Self = this.set("headerWrapperClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderWrapperClasses: Self = this.set("headerWrapperClasses", js.undefined)
    @scala.inline
    def setHover(value: Boolean): Self = this.set("hover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setNoDataIndication(value: () => Element | String): Self = this.set("noDataIndication", js.Any.fromFunction0(value))
    @scala.inline
    def deleteNoDataIndication: Self = this.set("noDataIndication", js.undefined)
    @scala.inline
    def setOnDataSizeChange(value: /* props */ DataSize => Unit): Self = this.set("onDataSizeChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDataSizeChange: Self = this.set("onDataSizeChange", js.undefined)
    @scala.inline
    def setOnExternalFilter(value: js.Any): Self = this.set("onExternalFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnExternalFilter: Self = this.set("onExternalFilter", js.undefined)
    @scala.inline
    def setOnFilter(value: js.Any): Self = this.set("onFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnFilter: Self = this.set("onFilter", js.undefined)
    @scala.inline
    def setOnSort(value: js.Any): Self = this.set("onSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSort: Self = this.set("onSort", js.undefined)
    @scala.inline
    def setOnTableChange(value: (/* type */ TableChangeType, /* newState */ TableChangeState[T]) => Unit): Self = this.set("onTableChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnTableChange: Self = this.set("onTableChange", js.undefined)
    @scala.inline
    def setOverlay(value: js.Any): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setPagination(value: `0`): Self = this.set("pagination", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    @scala.inline
    def setParentClassNameFunction3(value: (/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double) => String): Self = this.set("parentClassName", js.Any.fromFunction3(value))
    @scala.inline
    def setParentClassName(value: String | (js.Function3[/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double, String])): Self = this.set("parentClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentClassName: Self = this.set("parentClassName", js.undefined)
    @scala.inline
    def setRemote(value: Boolean | Partialpaginationbooleanf): Self = this.set("remote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemote: Self = this.set("remote", js.undefined)
    @scala.inline
    def setRowClassesFunction2(value: (/* row */ T, /* rowIndex */ Double) => String): Self = this.set("rowClasses", js.Any.fromFunction2(value))
    @scala.inline
    def setRowClasses(value: (js.Function2[/* row */ T, /* rowIndex */ Double, String]) | String): Self = this.set("rowClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowClasses: Self = this.set("rowClasses", js.undefined)
    @scala.inline
    def setRowEvents(value: RowEventHandlerProps[_]): Self = this.set("rowEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowEvents: Self = this.set("rowEvents", js.undefined)
    @scala.inline
    def setRowStyleFunction2(value: (/* row */ T, /* rowIndex */ Double) => CSSProperties): Self = this.set("rowStyle", js.Any.fromFunction2(value))
    @scala.inline
    def setRowStyle(value: (js.Function2[/* row */ T, /* rowIndex */ Double, CSSProperties]) | CSSProperties): Self = this.set("rowStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowStyle: Self = this.set("rowStyle", js.undefined)
    @scala.inline
    def setSearch(value: SearchProps[T] | Boolean): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    @scala.inline
    def setSelectRow(value: SelectRowProps[T]): Self = this.set("selectRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectRow: Self = this.set("selectRow", js.undefined)
    @scala.inline
    def setSort(value: SortCaret): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setStriped(value: Boolean): Self = this.set("striped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStriped: Self = this.set("striped", js.undefined)
    @scala.inline
    def setTabIndexCell(value: Boolean): Self = this.set("tabIndexCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndexCell: Self = this.set("tabIndexCell", js.undefined)
    @scala.inline
    def setWrapperClasses(value: String): Self = this.set("wrapperClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapperClasses: Self = this.set("wrapperClasses", js.undefined)
  }
  
}

