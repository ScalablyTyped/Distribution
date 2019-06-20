package typings
package reactDashTableLib.reactDashTableMod

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
  var className: java.lang.String
  /** Default: true */
  var collapseOnDataChange: scala.Boolean
  /** Default: true */
  var collapseOnPageChange: scala.Boolean
  /** Default: true */
  var collapseOnSortingChange: scala.Boolean
  /** Global Column Defaults */
  var column: stdLib.Partial[GlobalColumn]
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
  var defaultPageSize: scala.Double
  /** Default: [] */
  var defaultResized: js.Array[Resize]
  /** Default: [] */
  var defaultResizing: js.Array[Resize]
  /** Default: false */
  var defaultSortDesc: scala.Boolean
  /** Default: ... */
  var defaultSortMethod: SortFunction
  /** Default: [] */
  var defaultSorted: js.Array[SortingRule]
  /** Default: [] */
  var defaultSorting: js.Array[SortingRule]
  /** Expander defaults. */
  var expanderDefaults: stdLib.Partial[ExpanderDefaults]
  /** Default: false */
  var filterable: scala.Boolean
  /** Default: false */
  var freezeWhenExpanded: scala.Boolean
  /** Default: false */
  var loading: scala.Boolean
  /** Default: false */
  var manual: scala.Boolean
  /**
    * Default: undefined
    * Otherwise take value from 'pageSize' if defined
    * @TODO: add minRows to react-table defaultProps even if undefined
    */
  var minRows: js.UndefOr[scala.Double] = js.undefined
  /** Default: true */
  var multiSort: scala.Boolean
  /** On change. */
  var onChange: ReactTableFunction
  /** Default: [5, 10, 20, 25, 50, 100] */
  var pageSizeOptions: js.Array[scala.Double]
  /** Privot defaults. */
  var pivotDefaults: stdLib.Partial[PivotDefaults]
  /** Default: true */
  var resizable: scala.Boolean
  var resolveData: js.UndefOr[js.Function1[/* data */ js.Array[D], js.Array[ResolvedData]]] = js.undefined
  /** Default: false */
  var showFilters: scala.Boolean
  /** Default: true */
  var showPageJump: scala.Boolean
  /** Default: true */
  var showPageSizeOptions: scala.Boolean
  /** Default: true */
  var showPagination: scala.Boolean
  /** Default: true  */
  var showPaginationBottom: scala.Boolean
  /** Default: false */
  var showPaginationTop: scala.Boolean
  /** Default: true */
  var sortable: scala.Boolean
  /** Default: {} */
  var style: js.Object
  /** The content rendered inside of a padding row */
  def PadRowComponent(): reactLib.reactMod.ReactNode
  /** Control callback for functional rendering */
  def children(
    state: FinalState[ResolvedData],
    makeTable: js.Function0[reactLib.reactMod.ReactElement],
    instance: Instance[ResolvedData]
  ): reactLib.reactMod.ReactNode
  /** Server-side callbacks */
  def onFetchData(state: js.Any, instance: js.Any): scala.Unit
}

object TableProps {
  @scala.inline
  def apply[D, ResolvedData](
    AggregatedComponent: reactLib.reactMod.ReactType[_],
    ExpanderComponent: reactLib.reactMod.ReactType[_],
    FilterComponent: reactLib.reactMod.ReactType[_],
    LoadingComponent: reactLib.reactMod.ReactType[_],
    NextComponent: reactLib.reactMod.ReactType[_],
    NoDataComponent: reactLib.reactMod.ReactType[_],
    PadRowComponent: () => reactLib.reactMod.ReactNode,
    PaginationComponent: reactLib.reactMod.ReactType[_],
    PivotComponent: reactLib.reactMod.ReactType[_],
    PivotValueComponent: reactLib.reactMod.ReactType[_],
    PreviousComponent: reactLib.reactMod.ReactType[_],
    ResizerComponent: reactLib.reactMod.ReactType[_],
    SubComponent: SubComponentFunction,
    TableComponent: reactLib.reactMod.ReactType[_],
    TbodyComponent: reactLib.reactMod.ReactType[_],
    TdComponent: reactLib.reactMod.ReactType[_],
    TfootComponent: reactLib.reactMod.ReactType[_],
    ThComponent: reactLib.reactMod.ReactType[_],
    TheadComponent: reactLib.reactMod.ReactType[_],
    TrComponent: reactLib.reactMod.ReactType[_],
    TrGroupComponent: reactLib.reactMod.ReactType[_],
    aggregatedKey: java.lang.String,
    children: (FinalState[ResolvedData], js.Function0[reactLib.reactMod.ReactElement], Instance[ResolvedData]) => reactLib.reactMod.ReactNode,
    className: java.lang.String,
    collapseOnDataChange: scala.Boolean,
    collapseOnPageChange: scala.Boolean,
    collapseOnSortingChange: scala.Boolean,
    column: stdLib.Partial[GlobalColumn],
    data: js.Array[D],
    defaultFilterMethod: DefaultFilterFunction,
    defaultFiltered: js.Array[Filter],
    defaultFiltering: js.Array[Filter],
    defaultPageSize: scala.Double,
    defaultResized: js.Array[Resize],
    defaultResizing: js.Array[Resize],
    defaultSortDesc: scala.Boolean,
    defaultSortMethod: SortFunction,
    defaultSorted: js.Array[SortingRule],
    defaultSorting: js.Array[SortingRule],
    expandedRows: ExpandedRows,
    expanderDefaults: stdLib.Partial[ExpanderDefaults],
    filterable: scala.Boolean,
    filtered: js.Array[Filter],
    freezeWhenExpanded: scala.Boolean,
    getLoadingProps: ComponentPropsGetter0,
    getNoDataProps: ComponentPropsGetter0,
    getPaginationProps: ComponentPropsGetter0,
    getProps: ComponentPropsGetterRC | ComponentPropsGetterC | ComponentPropsGetter0,
    getResizerProps: ComponentPropsGetter0,
    getTableProps: ComponentPropsGetter0,
    getTbodyProps: ComponentPropsGetter0,
    getTdProps: ComponentPropsGetterRC | ComponentPropsGetterR,
    getTfootProps: ComponentPropsGetter0,
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
    groupedByPivotKey: java.lang.String,
    indexKey: java.lang.String,
    loading: scala.Boolean,
    loadingText: reactLib.reactMod.ReactNode,
    manual: scala.Boolean,
    multiSort: scala.Boolean,
    nestingLevelKey: java.lang.String,
    nextText: reactLib.reactMod.ReactNode,
    noDataText: reactLib.reactMod.ReactNode | reactLib.reactMod.ComponentType[js.Object],
    ofText: reactLib.reactMod.ReactNode,
    onChange: ReactTableFunction,
    onExpandRow: ReactTableFunction,
    onExpandedChange: ExpandedChangeFunction,
    onFetchData: (js.Any, js.Any) => scala.Unit,
    onFilteredChange: FilteredChangeFunction,
    onPageChange: PageChangeFunction,
    onPageSizeChange: PageSizeChangeFunction,
    onResizedChange: ResizedChangeFunction,
    onSortedChange: SortedChangeFunction,
    originalKey: java.lang.String,
    pageSizeOptions: js.Array[scala.Double],
    pageText: reactLib.reactMod.ReactNode,
    pivotBy: js.Array[java.lang.String],
    pivotColumnWidth: scala.Double,
    pivotDefaults: stdLib.Partial[PivotDefaults],
    pivotIDKey: java.lang.String,
    pivotValKey: java.lang.String,
    previousText: reactLib.reactMod.ReactNode,
    resizable: scala.Boolean,
    resized: js.Array[Resize],
    rowsText: java.lang.String,
    showFilters: scala.Boolean,
    showPageJump: scala.Boolean,
    showPageSizeOptions: scala.Boolean,
    showPagination: scala.Boolean,
    showPaginationBottom: scala.Boolean,
    showPaginationTop: scala.Boolean,
    sortable: scala.Boolean,
    sorted: js.Array[SortingRule],
    sorting: scala.Double,
    style: js.Object,
    subRowsKey: java.lang.String,
    columns: js.Array[Column[ResolvedData]] = null,
    minRows: scala.Int | scala.Double = null,
    page: scala.Int | scala.Double = null,
    pageSize: scala.Int | scala.Double = null,
    pages: scala.Int | scala.Double = null,
    resolveData: /* data */ js.Array[D] => js.Array[ResolvedData] = null
  ): TableProps[D, ResolvedData] = {
    val __obj = js.Dynamic.literal(AggregatedComponent = AggregatedComponent.asInstanceOf[js.Any], ExpanderComponent = ExpanderComponent.asInstanceOf[js.Any], FilterComponent = FilterComponent.asInstanceOf[js.Any], LoadingComponent = LoadingComponent.asInstanceOf[js.Any], NextComponent = NextComponent.asInstanceOf[js.Any], NoDataComponent = NoDataComponent.asInstanceOf[js.Any], PadRowComponent = js.Any.fromFunction0(PadRowComponent), PaginationComponent = PaginationComponent.asInstanceOf[js.Any], PivotComponent = PivotComponent.asInstanceOf[js.Any], PivotValueComponent = PivotValueComponent.asInstanceOf[js.Any], PreviousComponent = PreviousComponent.asInstanceOf[js.Any], ResizerComponent = ResizerComponent.asInstanceOf[js.Any], SubComponent = SubComponent, TableComponent = TableComponent.asInstanceOf[js.Any], TbodyComponent = TbodyComponent.asInstanceOf[js.Any], TdComponent = TdComponent.asInstanceOf[js.Any], TfootComponent = TfootComponent.asInstanceOf[js.Any], ThComponent = ThComponent.asInstanceOf[js.Any], TheadComponent = TheadComponent.asInstanceOf[js.Any], TrComponent = TrComponent.asInstanceOf[js.Any], TrGroupComponent = TrGroupComponent.asInstanceOf[js.Any], aggregatedKey = aggregatedKey, children = js.Any.fromFunction3(children), className = className, collapseOnDataChange = collapseOnDataChange, collapseOnPageChange = collapseOnPageChange, collapseOnSortingChange = collapseOnSortingChange, column = column, data = data, defaultFilterMethod = defaultFilterMethod, defaultFiltered = defaultFiltered, defaultFiltering = defaultFiltering, defaultPageSize = defaultPageSize, defaultResized = defaultResized, defaultResizing = defaultResizing, defaultSortDesc = defaultSortDesc, defaultSortMethod = defaultSortMethod, defaultSorted = defaultSorted, defaultSorting = defaultSorting, expandedRows = expandedRows, expanderDefaults = expanderDefaults, filterable = filterable, filtered = filtered, freezeWhenExpanded = freezeWhenExpanded, getLoadingProps = getLoadingProps, getNoDataProps = getNoDataProps, getPaginationProps = getPaginationProps, getProps = getProps.asInstanceOf[js.Any], getResizerProps = getResizerProps, getTableProps = getTableProps, getTbodyProps = getTbodyProps, getTdProps = getTdProps.asInstanceOf[js.Any], getTfootProps = getTfootProps, getTfootTrProps = getTfootTrProps, getTheadFilterProps = getTheadFilterProps, getTheadFilterThProps = getTheadFilterThProps, getTheadFilterTrProps = getTheadFilterTrProps, getTheadGroupProps = getTheadGroupProps, getTheadGroupThProps = getTheadGroupThProps, getTheadGroupTrProps = getTheadGroupTrProps, getTheadProps = getTheadProps, getTheadThProps = getTheadThProps, getTheadTrProps = getTheadTrProps, getTrGroupProps = getTrGroupProps.asInstanceOf[js.Any], getTrProps = getTrProps.asInstanceOf[js.Any], groupedByPivotKey = groupedByPivotKey, indexKey = indexKey, loading = loading, loadingText = loadingText.asInstanceOf[js.Any], manual = manual, multiSort = multiSort, nestingLevelKey = nestingLevelKey, nextText = nextText.asInstanceOf[js.Any], noDataText = noDataText.asInstanceOf[js.Any], ofText = ofText.asInstanceOf[js.Any], onChange = onChange, onExpandRow = onExpandRow, onExpandedChange = onExpandedChange, onFetchData = js.Any.fromFunction2(onFetchData), onFilteredChange = onFilteredChange, onPageChange = onPageChange, onPageSizeChange = onPageSizeChange, onResizedChange = onResizedChange, onSortedChange = onSortedChange, originalKey = originalKey, pageSizeOptions = pageSizeOptions, pageText = pageText.asInstanceOf[js.Any], pivotBy = pivotBy, pivotColumnWidth = pivotColumnWidth, pivotDefaults = pivotDefaults, pivotIDKey = pivotIDKey, pivotValKey = pivotValKey, previousText = previousText.asInstanceOf[js.Any], resizable = resizable, resized = resized, rowsText = rowsText, showFilters = showFilters, showPageJump = showPageJump, showPageSizeOptions = showPageSizeOptions, showPagination = showPagination, showPaginationBottom = showPaginationBottom, showPaginationTop = showPaginationTop, sortable = sortable, sorted = sorted, sorting = sorting, style = style, subRowsKey = subRowsKey)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (minRows != null) __obj.updateDynamic("minRows")(minRows.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    if (resolveData != null) __obj.updateDynamic("resolveData")(js.Any.fromFunction1(resolveData))
    __obj.asInstanceOf[TableProps[D, ResolvedData]]
  }
}

