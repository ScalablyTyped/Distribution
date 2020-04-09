package typings.reactBootstrapTableNext.mod

import typings.react.mod.CSSProperties
import typings.react.mod._Global_.JSX.Element
import typings.reactBootstrapTableNext.AnonDataSize
import typings.reactBootstrapTableNext.AnonOptionsPaginationOptions
import typings.reactBootstrapTableNext.AnonOrder
import typings.reactBootstrapTableNext.AnonSortCaret
import typings.reactBootstrapTableNext.Partialpaginationbooleanf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapTableProps[T /* <: js.Object */] extends js.Object {
  var bodyClasses: js.UndefOr[String] = js.undefined
  var bootstrap4: js.UndefOr[Boolean] = js.undefined
  var bordered: js.UndefOr[Boolean] = js.undefined
  /**
    * Same as HTML caption tag, you can set it as String or a React JSX.
    */
  var caption: js.UndefOr[Element | String] = js.undefined
  var cellEdit: js.UndefOr[js.Any] = js.undefined
  var classes: js.UndefOr[String] = js.undefined
  var columns: js.Array[ColumnDescription[_, _]]
  var condensed: js.UndefOr[Boolean] = js.undefined
  /**
    *  Provides data for your table. It accepts a single Array object.
    */
  var data: js.Array[_]
  var defaultSortDirection: js.UndefOr[SortOrder] = js.undefined
  var defaultSorted: js.UndefOr[js.Array[AnonOrder]] = js.undefined
  var expandRow: js.UndefOr[ExpandRowProps[T]] = js.undefined
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
  var noDataIndication: js.UndefOr[js.Function0[Element | String]] = js.undefined
  /**
    * This callback function will be called only when data size change by search/filter etc.
    */
  var onDataSizeChange: js.UndefOr[js.Function1[/* props */ AnonDataSize, Unit]] = js.undefined
  var onExternalFilter: js.UndefOr[js.Any] = js.undefined
  var onFilter: js.UndefOr[js.Any] = js.undefined
  var onSort: js.UndefOr[js.Any] = js.undefined
  var onTableChange: js.UndefOr[TableChangeHandler[T]] = js.undefined
  var overlay: js.UndefOr[js.Any] = js.undefined
  var pagination: js.UndefOr[AnonOptionsPaginationOptions] = js.undefined
  var parentClassName: js.UndefOr[
    String | (js.Function3[/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double, String])
  ] = js.undefined
  var remote: js.UndefOr[Boolean | Partialpaginationbooleanf] = js.undefined
  var rowClasses: js.UndefOr[(js.Function2[/* row */ T, /* rowIndex */ Double, String]) | String] = js.undefined
  var rowEvents: js.UndefOr[RowEventHandlerProps[_]] = js.undefined
  var rowStyle: js.UndefOr[
    (js.Function2[/* row */ T, /* rowIndex */ Double, CSSProperties]) | CSSProperties
  ] = js.undefined
  var search: js.UndefOr[SearchProps[T] | Boolean] = js.undefined
  var selectRow: js.UndefOr[SelectRowProps[T]] = js.undefined
  var sort: js.UndefOr[AnonSortCaret] = js.undefined
  var striped: js.UndefOr[Boolean] = js.undefined
  var tabIndexCell: js.UndefOr[Boolean] = js.undefined
  var wrapperClasses: js.UndefOr[String] = js.undefined
}

object BootstrapTableProps {
  @scala.inline
  def apply[T /* <: js.Object */](
    columns: js.Array[ColumnDescription[_, _]],
    data: js.Array[_],
    keyField: String,
    bodyClasses: String = null,
    bootstrap4: js.UndefOr[Boolean] = js.undefined,
    bordered: js.UndefOr[Boolean] = js.undefined,
    caption: Element | String = null,
    cellEdit: js.Any = null,
    classes: String = null,
    condensed: js.UndefOr[Boolean] = js.undefined,
    defaultSortDirection: SortOrder = null,
    defaultSorted: js.Array[AnonOrder] = null,
    expandRow: ExpandRowProps[T] = null,
    filter: js.Any = null,
    filterPosition: FilterPosition = null,
    filtersClasses: String = null,
    footerClasses: String = null,
    headerClasses: String = null,
    headerWrapperClasses: String = null,
    hover: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    noDataIndication: () => Element | String = null,
    onDataSizeChange: /* props */ AnonDataSize => Unit = null,
    onExternalFilter: js.Any = null,
    onFilter: js.Any = null,
    onSort: js.Any = null,
    onTableChange: (/* type */ TableChangeType, /* newState */ TableChangeState[T]) => Unit = null,
    overlay: js.Any = null,
    pagination: AnonOptionsPaginationOptions = null,
    parentClassName: String | (js.Function3[/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double, String]) = null,
    remote: Boolean | Partialpaginationbooleanf = null,
    rowClasses: (js.Function2[/* row */ T, /* rowIndex */ Double, String]) | String = null,
    rowEvents: RowEventHandlerProps[_] = null,
    rowStyle: (js.Function2[/* row */ T, /* rowIndex */ Double, CSSProperties]) | CSSProperties = null,
    search: SearchProps[T] | Boolean = null,
    selectRow: SelectRowProps[T] = null,
    sort: AnonSortCaret = null,
    striped: js.UndefOr[Boolean] = js.undefined,
    tabIndexCell: js.UndefOr[Boolean] = js.undefined,
    wrapperClasses: String = null
  ): BootstrapTableProps[T] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keyField = keyField.asInstanceOf[js.Any])
    if (bodyClasses != null) __obj.updateDynamic("bodyClasses")(bodyClasses.asInstanceOf[js.Any])
    if (!js.isUndefined(bootstrap4)) __obj.updateDynamic("bootstrap4")(bootstrap4.asInstanceOf[js.Any])
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (cellEdit != null) __obj.updateDynamic("cellEdit")(cellEdit.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(condensed)) __obj.updateDynamic("condensed")(condensed.asInstanceOf[js.Any])
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection.asInstanceOf[js.Any])
    if (defaultSorted != null) __obj.updateDynamic("defaultSorted")(defaultSorted.asInstanceOf[js.Any])
    if (expandRow != null) __obj.updateDynamic("expandRow")(expandRow.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterPosition != null) __obj.updateDynamic("filterPosition")(filterPosition.asInstanceOf[js.Any])
    if (filtersClasses != null) __obj.updateDynamic("filtersClasses")(filtersClasses.asInstanceOf[js.Any])
    if (footerClasses != null) __obj.updateDynamic("footerClasses")(footerClasses.asInstanceOf[js.Any])
    if (headerClasses != null) __obj.updateDynamic("headerClasses")(headerClasses.asInstanceOf[js.Any])
    if (headerWrapperClasses != null) __obj.updateDynamic("headerWrapperClasses")(headerWrapperClasses.asInstanceOf[js.Any])
    if (!js.isUndefined(hover)) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (noDataIndication != null) __obj.updateDynamic("noDataIndication")(js.Any.fromFunction0(noDataIndication))
    if (onDataSizeChange != null) __obj.updateDynamic("onDataSizeChange")(js.Any.fromFunction1(onDataSizeChange))
    if (onExternalFilter != null) __obj.updateDynamic("onExternalFilter")(onExternalFilter.asInstanceOf[js.Any])
    if (onFilter != null) __obj.updateDynamic("onFilter")(onFilter.asInstanceOf[js.Any])
    if (onSort != null) __obj.updateDynamic("onSort")(onSort.asInstanceOf[js.Any])
    if (onTableChange != null) __obj.updateDynamic("onTableChange")(js.Any.fromFunction2(onTableChange))
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (parentClassName != null) __obj.updateDynamic("parentClassName")(parentClassName.asInstanceOf[js.Any])
    if (remote != null) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    if (rowClasses != null) __obj.updateDynamic("rowClasses")(rowClasses.asInstanceOf[js.Any])
    if (rowEvents != null) __obj.updateDynamic("rowEvents")(rowEvents.asInstanceOf[js.Any])
    if (rowStyle != null) __obj.updateDynamic("rowStyle")(rowStyle.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (selectRow != null) __obj.updateDynamic("selectRow")(selectRow.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndexCell)) __obj.updateDynamic("tabIndexCell")(tabIndexCell.asInstanceOf[js.Any])
    if (wrapperClasses != null) __obj.updateDynamic("wrapperClasses")(wrapperClasses.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapTableProps[T]]
  }
}

