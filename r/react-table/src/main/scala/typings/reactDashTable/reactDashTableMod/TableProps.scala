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
    SubComponent: SubComponentFunction,
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
    defaultFilterMethod: DefaultFilterFunction,
    defaultFiltered: js.Array[Filter],
    defaultFiltering: js.Array[Filter],
    defaultPageSize: Double,
    defaultResized: js.Array[Resize],
    defaultResizing: js.Array[Resize],
    defaultSortDesc: Boolean,
    defaultSortMethod: SortFunction,
    defaultSorted: js.Array[SortingRule],
    defaultSorting: js.Array[SortingRule],
    expandedRows: ExpandedRows,
    expanderDefaults: Partial[ExpanderDefaults],
    filterable: Boolean,
    filtered: js.Array[Filter],
    freezeWhenExpanded: Boolean,
    getLoadingProps: ComponentPropsGetter0,
    getNoDataProps: ComponentPropsGetter0,
    getPaginationProps: ComponentPropsGetter0,
    getProps: ComponentPropsGetterRC | ComponentPropsGetterC | ComponentPropsGetter0,
    getResizerProps: ComponentPropsGetter0,
    getTableProps: ComponentPropsGetter0,
    getTbodyProps: ComponentPropsGetter0,
    getTdProps: ComponentPropsGetterRC | ComponentPropsGetterR,
    getTfootProps: ComponentPropsGetter0,
    getTfootTdProps: ComponentPropsGetterC,
    getTfootTrProps: ComponentPropsGetter0,
    getTheadFilterProps: ComponentPropsGetter0,
    getTheadFilterThProps: ComponentPropsGetterC,
    getTheadFilterTrProps: ComponentPropsGetter0,
    getTheadGroupProps: ComponentPropsGetter0,
    getTheadGroupThProps: ComponentPropsGetterC,
    getTheadGroupTrProps: ComponentPropsGetter0,
    getTheadProps: ComponentPropsGetter0,
    getTheadThProps: ComponentPropsGetterC,
    getTheadTrProps: ComponentPropsGetter0,
    getTrGroupProps: ComponentPropsGetterR | ComponentPropsGetter0,
    getTrProps: ComponentPropsGetterR | ComponentPropsGetter0,
    groupedByPivotKey: String,
    indexKey: String,
    loading: Boolean,
    loadingText: ReactNode,
    manual: Boolean,
    multiSort: Boolean,
    nestingLevelKey: String,
    nextText: ReactNode,
    noDataText: ReactNode | ComponentType[js.Object],
    ofText: ReactNode,
    onChange: ReactTableFunction,
    onExpandRow: ReactTableFunction,
    onExpandedChange: ExpandedChangeFunction,
    onFetchData: (js.Any, js.Any) => Unit,
    onFilteredChange: FilteredChangeFunction,
    onPageChange: PageChangeFunction,
    onPageSizeChange: PageSizeChangeFunction,
    onResizedChange: ResizedChangeFunction,
    onSortedChange: SortedChangeFunction,
    originalKey: String,
    pageSizeOptions: js.Array[Double],
    pageText: ReactNode,
    pivotBy: js.Array[String],
    pivotColumnWidth: Double,
    pivotDefaults: Partial[PivotDefaults],
    pivotIDKey: String,
    pivotValKey: String,
    previousText: ReactNode,
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
    minRows: Int | Double = null,
    page: Int | Double = null,
    pageSize: Int | Double = null,
    pages: Int | Double = null,
    resolveData: /* data */ js.Array[D] => js.Array[ResolvedData] = null
  ): TableProps[D, ResolvedData] = {
    val __obj = js.Dynamic.literal(AggregatedComponent = AggregatedComponent.asInstanceOf[js.Any], ExpanderComponent = ExpanderComponent.asInstanceOf[js.Any], FilterComponent = FilterComponent.asInstanceOf[js.Any], LoadingComponent = LoadingComponent.asInstanceOf[js.Any], NextComponent = NextComponent.asInstanceOf[js.Any], NoDataComponent = NoDataComponent.asInstanceOf[js.Any], PadRowComponent = js.Any.fromFunction0(PadRowComponent), PaginationComponent = PaginationComponent.asInstanceOf[js.Any], PivotComponent = PivotComponent.asInstanceOf[js.Any], PivotValueComponent = PivotValueComponent.asInstanceOf[js.Any], PreviousComponent = PreviousComponent.asInstanceOf[js.Any], ResizerComponent = ResizerComponent.asInstanceOf[js.Any], SubComponent = SubComponent, TableComponent = TableComponent.asInstanceOf[js.Any], TbodyComponent = TbodyComponent.asInstanceOf[js.Any], TdComponent = TdComponent.asInstanceOf[js.Any], TfootComponent = TfootComponent.asInstanceOf[js.Any], ThComponent = ThComponent.asInstanceOf[js.Any], TheadComponent = TheadComponent.asInstanceOf[js.Any], TrComponent = TrComponent.asInstanceOf[js.Any], TrGroupComponent = TrGroupComponent.asInstanceOf[js.Any], aggregatedKey = aggregatedKey, children = js.Any.fromFunction3(children), className = className, collapseOnDataChange = collapseOnDataChange, collapseOnPageChange = collapseOnPageChange, collapseOnSortingChange = collapseOnSortingChange, column = column, data = data, defaultFilterMethod = defaultFilterMethod, defaultFiltered = defaultFiltered, defaultFiltering = defaultFiltering, defaultPageSize = defaultPageSize, defaultResized = defaultResized, defaultResizing = defaultResizing, defaultSortDesc = defaultSortDesc, defaultSortMethod = defaultSortMethod, defaultSorted = defaultSorted, defaultSorting = defaultSorting, expandedRows = expandedRows, expanderDefaults = expanderDefaults, filterable = filterable, filtered = filtered, freezeWhenExpanded = freezeWhenExpanded, getLoadingProps = getLoadingProps, getNoDataProps = getNoDataProps, getPaginationProps = getPaginationProps, getProps = getProps.asInstanceOf[js.Any], getResizerProps = getResizerProps, getTableProps = getTableProps, getTbodyProps = getTbodyProps, getTdProps = getTdProps.asInstanceOf[js.Any], getTfootProps = getTfootProps, getTfootTdProps = getTfootTdProps, getTfootTrProps = getTfootTrProps, getTheadFilterProps = getTheadFilterProps, getTheadFilterThProps = getTheadFilterThProps, getTheadFilterTrProps = getTheadFilterTrProps, getTheadGroupProps = getTheadGroupProps, getTheadGroupThProps = getTheadGroupThProps, getTheadGroupTrProps = getTheadGroupTrProps, getTheadProps = getTheadProps, getTheadThProps = getTheadThProps, getTheadTrProps = getTheadTrProps, getTrGroupProps = getTrGroupProps.asInstanceOf[js.Any], getTrProps = getTrProps.asInstanceOf[js.Any], groupedByPivotKey = groupedByPivotKey, indexKey = indexKey, loading = loading, loadingText = loadingText.asInstanceOf[js.Any], manual = manual, multiSort = multiSort, nestingLevelKey = nestingLevelKey, nextText = nextText.asInstanceOf[js.Any], noDataText = noDataText.asInstanceOf[js.Any], ofText = ofText.asInstanceOf[js.Any], onChange = onChange, onExpandRow = onExpandRow, onExpandedChange = onExpandedChange, onFetchData = js.Any.fromFunction2(onFetchData), onFilteredChange = onFilteredChange, onPageChange = onPageChange, onPageSizeChange = onPageSizeChange, onResizedChange = onResizedChange, onSortedChange = onSortedChange, originalKey = originalKey, pageSizeOptions = pageSizeOptions, pageText = pageText.asInstanceOf[js.Any], pivotBy = pivotBy, pivotColumnWidth = pivotColumnWidth, pivotDefaults = pivotDefaults, pivotIDKey = pivotIDKey, pivotValKey = pivotValKey, previousText = previousText.asInstanceOf[js.Any], resizable = resizable, resized = resized, rowsText = rowsText, showFilters = showFilters, showPageJump = showPageJump, showPageSizeOptions = showPageSizeOptions, showPagination = showPagination, showPaginationBottom = showPaginationBottom, showPaginationTop = showPaginationTop, sortable = sortable, sorted = sorted, sorting = sorting, style = style, subRowsKey = subRowsKey)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (minRows != null) __obj.updateDynamic("minRows")(minRows.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    if (resolveData != null) __obj.updateDynamic("resolveData")(js.Any.fromFunction1(resolveData))
    __obj.asInstanceOf[TableProps[D, ResolvedData]]
  }
}

