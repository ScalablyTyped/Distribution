package typings.reactDashTable.reactDashTableMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.ReactType
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps[D, ResolvedData]
  extends TextProps
     with ComponentDecoratorProps
     with ControlledStateCallbackProps
     with PivotingProps
     with ControlledStateOverrideProps
     with ComponentProps {
  /**
    * Default: string
    * Adding a -striped className to ReactTable will slightly color odd numbered rows for legibility
    * Adding a -highlight className to ReactTable will highlight any row as you hover over it
    */
  var className: String
  /** Default: true */
  var collapseOnDataChange: Boolean
  /** Default: true */
  var collapseOnPageChange: Boolean
  /** Default: true */
  var collapseOnSortingChange: Boolean
  /** Global Column Defaults */
  var column: Partial[GlobalColumn]
  /** Array of all Available Columns */
  var columns: js.UndefOr[js.Array[Column[ResolvedData]]] = js.undefined
  /** Default: [] */
  var data: js.Array[D]
  /** Default: ... */
  var defaultFilterMethod: DefaultFilterFunction
  /** Default: [] */
  var defaultFiltered: js.Array[Filter]
  /** Default: [] */
  var defaultFiltering: js.Array[Filter]
  /** Default: 20 */
  var defaultPageSize: Double
  /** Default: [] */
  var defaultResized: js.Array[Resize]
  /** Default: [] */
  var defaultResizing: js.Array[Resize]
  /** Default: false */
  var defaultSortDesc: Boolean
  /** Default: ... */
  var defaultSortMethod: SortFunction
  /** Default: [] */
  var defaultSorted: js.Array[SortingRule]
  /** Default: [] */
  var defaultSorting: js.Array[SortingRule]
  /** Expander defaults. */
  var expanderDefaults: Partial[ExpanderDefaults]
  /** Default: false */
  var filterable: Boolean
  /** Default: false */
  var freezeWhenExpanded: Boolean
  /** Default: false */
  var loading: Boolean
  /** Default: false */
  var manual: Boolean
  /**
    * Default: undefined
    * Otherwise take value from 'pageSize' if defined
    * @TODO: add minRows to react-table defaultProps even if undefined
    */
  var minRows: js.UndefOr[Double] = js.undefined
  /** Default: true */
  var multiSort: Boolean
  /** On change. */
  var onChange: ReactTableFunction
  /** Default: [5, 10, 20, 25, 50, 100] */
  var pageSizeOptions: js.Array[Double]
  /** Privot defaults. */
  var pivotDefaults: Partial[PivotDefaults]
  /** Default: true */
  var resizable: Boolean
  var resolveData: js.UndefOr[js.Function1[/* data */ js.Array[D], js.Array[ResolvedData]]] = js.undefined
  /** Default: false */
  var showFilters: Boolean
  /** Default: true */
  var showPageJump: Boolean
  /** Default: true */
  var showPageSizeOptions: Boolean
  /** Default: true */
  var showPagination: Boolean
  /** Default: true  */
  var showPaginationBottom: Boolean
  /** Default: false */
  var showPaginationTop: Boolean
  /** Default: true */
  var sortable: Boolean
  /** Default: {} */
  var style: js.Object
  /** The content rendered inside of a padding row */
  def PadRowComponent(): ReactNode
  /** Control callback for functional rendering */
  def children(
    state: FinalState[ResolvedData],
    makeTable: js.Function0[ReactElement],
    instance: Instance[ResolvedData]
  ): ReactNode
  /** Server-side callbacks */
  def onFetchData(state: js.Any, instance: js.Any): Unit
}

object TableProps {
  @scala.inline
  def apply[D, ResolvedData](
    AggregatedComponent: ReactType[_],
    ExpanderComponent: ReactType[_],
    FilterComponent: ReactType[_],
    LoadingComponent: ReactType[_],
    NextComponent: ReactType[_],
    NoDataComponent: ReactType[_],
    PadRowComponent: () => ReactNode,
    PaginationComponent: ReactType[_],
    PivotComponent: ReactType[_],
    PivotValueComponent: ReactType[_],
    PreviousComponent: ReactType[_],
    ResizerComponent: ReactType[_],
    SubComponent: /* rowInfo */ RowInfo => ReactNode,
    TableComponent: ReactType[_],
    TbodyComponent: ReactType[_],
    TdComponent: ReactType[_],
    TfootComponent: ReactType[_],
    ThComponent: ReactType[_],
    TheadComponent: ReactType[_],
    TrComponent: ReactType[_],
    TrGroupComponent: ReactType[_],
    aggregatedKey: String,
    children: (FinalState[ResolvedData], js.Function0[ReactElement], Instance[ResolvedData]) => ReactNode,
    className: String,
    collapseOnDataChange: Boolean,
    collapseOnPageChange: Boolean,
    collapseOnSortingChange: Boolean,
    column: Partial[GlobalColumn],
    data: js.Array[D],
    defaultFilterMethod: (/* filter */ Filter, /* row */ js.Any, /* column */ js.Any) => Boolean,
    defaultFiltered: js.Array[Filter],
    defaultFiltering: js.Array[Filter],
    defaultPageSize: Double,
    defaultResized: js.Array[Resize],
    defaultResizing: js.Array[Resize],
    defaultSortDesc: Boolean,
    defaultSortMethod: (/* a */ js.Any, /* b */ js.Any, /* desc */ js.Any) => Double,
    defaultSorted: js.Array[SortingRule],
    defaultSorting: js.Array[SortingRule],
    expandedRows: ExpandedRows,
    expanderDefaults: Partial[ExpanderDefaults],
    filterable: Boolean,
    filtered: js.Array[Filter],
    freezeWhenExpanded: Boolean,
    getLoadingProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getNoDataProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getPaginationProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getProps: (/* finalState */ js.Any, js.UndefOr[RowInfo], js.UndefOr[Column[js.Any]], js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getResizerProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTableProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTbodyProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTdProps: (/* finalState */ js.Any, js.UndefOr[RowInfo], js.UndefOr[Column[js.Any]], js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTfootProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTfootTdProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[Column[js.Any]], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTfootTrProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTheadFilterProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTheadFilterThProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[Column[js.Any]], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTheadFilterTrProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTheadGroupProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTheadGroupThProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[Column[js.Any]], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTheadGroupTrProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTheadProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTheadThProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[Column[js.Any]], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTheadTrProps: (/* finalState */ js.Any, /* rowInfo */ js.UndefOr[scala.Nothing], /* column */ js.UndefOr[scala.Nothing], /* instance */ js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTrGroupProps: (/* finalState */ js.Any, js.UndefOr[RowInfo], js.UndefOr[scala.Nothing], js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    getTrProps: (/* finalState */ js.Any, js.UndefOr[RowInfo], js.UndefOr[scala.Nothing], js.UndefOr[js.Any]) => js.UndefOr[js.Object],
    groupedByPivotKey: String,
    indexKey: String,
    loading: Boolean,
    manual: Boolean,
    multiSort: Boolean,
    nestingLevelKey: String,
    onChange: /* value */ js.UndefOr[js.Any] => Unit,
    onExpandRow: /* value */ js.UndefOr[js.Any] => Unit,
    onExpandedChange: (/* column */ js.Any, /* event */ js.Any, /* isTouch */ Boolean) => Unit,
    onFetchData: (js.Any, js.Any) => Unit,
    onFilteredChange: (/* newFiltering */ js.Array[Filter], /* column */ js.Any, /* value */ js.Any) => Unit,
    onPageChange: /* page */ Double => Unit,
    onPageSizeChange: (/* newPageSize */ Double, /* newPage */ Double) => Unit,
    onResizedChange: (/* newResized */ js.Array[Resize], /* event */ js.Any) => Unit,
    onSortedChange: (/* newSorted */ js.Array[SortingRule], /* column */ js.Any, /* additive */ Boolean) => Unit,
    originalKey: String,
    pageSizeOptions: js.Array[Double],
    pivotBy: js.Array[String],
    pivotColumnWidth: Double,
    pivotDefaults: Partial[PivotDefaults],
    pivotIDKey: String,
    pivotValKey: String,
    resizable: Boolean,
    resized: js.Array[Resize],
    rowsText: String,
    showFilters: Boolean,
    showPageJump: Boolean,
    showPageSizeOptions: Boolean,
    showPagination: Boolean,
    showPaginationBottom: Boolean,
    showPaginationTop: Boolean,
    sortable: Boolean,
    sorted: js.Array[SortingRule],
    sorting: Double,
    style: js.Object,
    subRowsKey: String,
    columns: js.Array[Column[ResolvedData]] = null,
    loadingText: ReactNode = null,
    minRows: Int | Double = null,
    nextText: ReactNode = null,
    noDataText: ReactNode | ComponentType[js.Object] = null,
    ofText: ReactNode = null,
    page: Int | Double = null,
    pageSize: Int | Double = null,
    pageText: ReactNode = null,
    pages: Int | Double = null,
    previousText: ReactNode = null,
    resolveData: /* data */ js.Array[D] => js.Array[ResolvedData] = null
  ): TableProps[D, ResolvedData] = {
    val __obj = js.Dynamic.literal(AggregatedComponent = AggregatedComponent.asInstanceOf[js.Any], ExpanderComponent = ExpanderComponent.asInstanceOf[js.Any], FilterComponent = FilterComponent.asInstanceOf[js.Any], LoadingComponent = LoadingComponent.asInstanceOf[js.Any], NextComponent = NextComponent.asInstanceOf[js.Any], NoDataComponent = NoDataComponent.asInstanceOf[js.Any], PadRowComponent = js.Any.fromFunction0(PadRowComponent), PaginationComponent = PaginationComponent.asInstanceOf[js.Any], PivotComponent = PivotComponent.asInstanceOf[js.Any], PivotValueComponent = PivotValueComponent.asInstanceOf[js.Any], PreviousComponent = PreviousComponent.asInstanceOf[js.Any], ResizerComponent = ResizerComponent.asInstanceOf[js.Any], SubComponent = js.Any.fromFunction1(SubComponent), TableComponent = TableComponent.asInstanceOf[js.Any], TbodyComponent = TbodyComponent.asInstanceOf[js.Any], TdComponent = TdComponent.asInstanceOf[js.Any], TfootComponent = TfootComponent.asInstanceOf[js.Any], ThComponent = ThComponent.asInstanceOf[js.Any], TheadComponent = TheadComponent.asInstanceOf[js.Any], TrComponent = TrComponent.asInstanceOf[js.Any], TrGroupComponent = TrGroupComponent.asInstanceOf[js.Any], aggregatedKey = aggregatedKey, children = js.Any.fromFunction3(children), className = className, collapseOnDataChange = collapseOnDataChange, collapseOnPageChange = collapseOnPageChange, collapseOnSortingChange = collapseOnSortingChange, column = column, data = data, defaultFilterMethod = js.Any.fromFunction3(defaultFilterMethod), defaultFiltered = defaultFiltered, defaultFiltering = defaultFiltering, defaultPageSize = defaultPageSize, defaultResized = defaultResized, defaultResizing = defaultResizing, defaultSortDesc = defaultSortDesc, defaultSortMethod = js.Any.fromFunction3(defaultSortMethod), defaultSorted = defaultSorted, defaultSorting = defaultSorting, expandedRows = expandedRows, expanderDefaults = expanderDefaults, filterable = filterable, filtered = filtered, freezeWhenExpanded = freezeWhenExpanded, getLoadingProps = js.Any.fromFunction4(getLoadingProps), getNoDataProps = js.Any.fromFunction4(getNoDataProps), getPaginationProps = js.Any.fromFunction4(getPaginationProps), getProps = js.Any.fromFunction4(getProps), getResizerProps = js.Any.fromFunction4(getResizerProps), getTableProps = js.Any.fromFunction4(getTableProps), getTbodyProps = js.Any.fromFunction4(getTbodyProps), getTdProps = js.Any.fromFunction4(getTdProps), getTfootProps = js.Any.fromFunction4(getTfootProps), getTfootTdProps = js.Any.fromFunction4(getTfootTdProps), getTfootTrProps = js.Any.fromFunction4(getTfootTrProps), getTheadFilterProps = js.Any.fromFunction4(getTheadFilterProps), getTheadFilterThProps = js.Any.fromFunction4(getTheadFilterThProps), getTheadFilterTrProps = js.Any.fromFunction4(getTheadFilterTrProps), getTheadGroupProps = js.Any.fromFunction4(getTheadGroupProps), getTheadGroupThProps = js.Any.fromFunction4(getTheadGroupThProps), getTheadGroupTrProps = js.Any.fromFunction4(getTheadGroupTrProps), getTheadProps = js.Any.fromFunction4(getTheadProps), getTheadThProps = js.Any.fromFunction4(getTheadThProps), getTheadTrProps = js.Any.fromFunction4(getTheadTrProps), getTrGroupProps = js.Any.fromFunction4(getTrGroupProps), getTrProps = js.Any.fromFunction4(getTrProps), groupedByPivotKey = groupedByPivotKey, indexKey = indexKey, loading = loading, manual = manual, multiSort = multiSort, nestingLevelKey = nestingLevelKey, onChange = js.Any.fromFunction1(onChange), onExpandRow = js.Any.fromFunction1(onExpandRow), onExpandedChange = js.Any.fromFunction3(onExpandedChange), onFetchData = js.Any.fromFunction2(onFetchData), onFilteredChange = js.Any.fromFunction3(onFilteredChange), onPageChange = js.Any.fromFunction1(onPageChange), onPageSizeChange = js.Any.fromFunction2(onPageSizeChange), onResizedChange = js.Any.fromFunction2(onResizedChange), onSortedChange = js.Any.fromFunction3(onSortedChange), originalKey = originalKey, pageSizeOptions = pageSizeOptions, pivotBy = pivotBy, pivotColumnWidth = pivotColumnWidth, pivotDefaults = pivotDefaults, pivotIDKey = pivotIDKey, pivotValKey = pivotValKey, resizable = resizable, resized = resized, rowsText = rowsText, showFilters = showFilters, showPageJump = showPageJump, showPageSizeOptions = showPageSizeOptions, showPagination = showPagination, showPaginationBottom = showPaginationBottom, showPaginationTop = showPaginationTop, sortable = sortable, sorted = sorted, sorting = sorting, style = style, subRowsKey = subRowsKey)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText.asInstanceOf[js.Any])
    if (minRows != null) __obj.updateDynamic("minRows")(minRows.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (ofText != null) __obj.updateDynamic("ofText")(ofText.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageText != null) __obj.updateDynamic("pageText")(pageText.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    if (previousText != null) __obj.updateDynamic("previousText")(previousText.asInstanceOf[js.Any])
    if (resolveData != null) __obj.updateDynamic("resolveData")(js.Any.fromFunction1(resolveData))
    __obj.asInstanceOf[TableProps[D, ResolvedData]]
  }
}

