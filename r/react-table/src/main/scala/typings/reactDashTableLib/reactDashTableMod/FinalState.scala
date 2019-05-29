package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinalState[D] extends TableProps[D, D] {
  var allDecoratedColumns: js.Array[Column[D]]
  var allVisibleColumns: js.Array[Column[D]]
  var canNext: scala.Boolean
  var canPrevious: scala.Boolean
  var endRow: scala.Double
  var frozen: scala.Boolean
  var hasColumnFooter: scala.Boolean
  var hasHeaderGroups: scala.Boolean
  var headerGroups: js.Array[_]
  var padRows: scala.Double
  var pageRows: js.Array[DerivedDataObject]
  var resolvedData: js.Array[DerivedDataObject]
  var rowMinWidth: scala.Double
  var sortedData: js.Array[DerivedDataObject]
  var startRow: scala.Double
}

object FinalState {
  @scala.inline
  def apply[D](
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
    SubComponent: SubComponentFunction[D],
    TableComponent: reactLib.reactMod.ReactType[_],
    TbodyComponent: reactLib.reactMod.ReactType[_],
    TdComponent: reactLib.reactMod.ReactType[_],
    TfootComponent: reactLib.reactMod.ReactType[_],
    ThComponent: reactLib.reactMod.ReactType[_],
    TheadComponent: reactLib.reactMod.ReactType[_],
    TrComponent: reactLib.reactMod.ReactType[_],
    TrGroupComponent: reactLib.reactMod.ReactType[_],
    aggregatedKey: java.lang.String,
    allDecoratedColumns: js.Array[Column[D]],
    allVisibleColumns: js.Array[Column[D]],
    canNext: scala.Boolean,
    canPrevious: scala.Boolean,
    children: (FinalState[D], js.Function0[reactLib.reactMod.ReactElement[_]], Instance[D]) => reactLib.reactMod.ReactNode,
    className: java.lang.String,
    collapseOnDataChange: scala.Boolean,
    collapseOnPageChange: scala.Boolean,
    collapseOnSortingChange: scala.Boolean,
    column: stdLib.Partial[GlobalColumn[D]],
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
    endRow: scala.Double,
    expandedRows: ExpandedRows,
    expanderDefaults: stdLib.Partial[ExpanderDefaults],
    filterable: scala.Boolean,
    filtered: js.Array[Filter],
    freezeWhenExpanded: scala.Boolean,
    frozen: scala.Boolean,
    getLoadingProps: ComponentPropsGetter0,
    getNoDataProps: ComponentPropsGetter0,
    getPaginationProps: ComponentPropsGetter0,
    getProps: ComponentPropsGetterRC[D] | ComponentPropsGetterC[D] | ComponentPropsGetter0,
    getResizerProps: ComponentPropsGetter0,
    getTableProps: ComponentPropsGetter0,
    getTbodyProps: ComponentPropsGetter0,
    getTdProps: ComponentPropsGetterRC[D] | ComponentPropsGetterR[D],
    getTfootProps: ComponentPropsGetter0,
    getTfootTrProps: ComponentPropsGetter0,
    getTheadFilterProps: ComponentPropsGetter0,
    getTheadFilterThProps: ComponentPropsGetterC[D],
    getTheadFilterTrProps: ComponentPropsGetter0,
    getTheadGroupProps: ComponentPropsGetter0,
    getTheadGroupThProps: ComponentPropsGetterC[D],
    getTheadGroupTrProps: ComponentPropsGetter0,
    getTheadProps: ComponentPropsGetter0,
    getTheadThProps: ComponentPropsGetterC[D],
    getTheadTrProps: ComponentPropsGetter0,
    getTrGroupProps: ComponentPropsGetterR[D] | ComponentPropsGetter0,
    getTrProps: ComponentPropsGetterR[D] | ComponentPropsGetter0,
    groupedByPivotKey: java.lang.String,
    hasColumnFooter: scala.Boolean,
    hasHeaderGroups: scala.Boolean,
    headerGroups: js.Array[_],
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
    padRows: scala.Double,
    pageRows: js.Array[DerivedDataObject],
    pageSizeOptions: js.Array[scala.Double],
    pageText: reactLib.reactMod.ReactNode,
    pivotBy: js.Array[java.lang.String],
    pivotColumnWidth: scala.Double,
    pivotDefaults: stdLib.Partial[PivotDefaults[D]],
    pivotIDKey: java.lang.String,
    pivotValKey: java.lang.String,
    previousText: reactLib.reactMod.ReactNode,
    resizable: scala.Boolean,
    resized: js.Array[Resize],
    resolvedData: js.Array[DerivedDataObject],
    rowMinWidth: scala.Double,
    rowsText: java.lang.String,
    showFilters: scala.Boolean,
    showPageJump: scala.Boolean,
    showPageSizeOptions: scala.Boolean,
    showPagination: scala.Boolean,
    showPaginationBottom: scala.Boolean,
    showPaginationTop: scala.Boolean,
    sortable: scala.Boolean,
    sorted: js.Array[SortingRule],
    sortedData: js.Array[DerivedDataObject],
    sorting: scala.Double,
    startRow: scala.Double,
    style: js.Object,
    subRowsKey: java.lang.String,
    columns: js.Array[Column[D]] = null,
    minRows: scala.Int | scala.Double = null,
    page: scala.Int | scala.Double = null,
    pageSize: scala.Int | scala.Double = null,
    pages: scala.Int | scala.Double = null,
    resolveData: /* data */ js.Array[D] => js.Array[D] = null
  ): FinalState[D] = {
    val __obj = js.Dynamic.literal(AggregatedComponent = AggregatedComponent.asInstanceOf[js.Any], ExpanderComponent = ExpanderComponent.asInstanceOf[js.Any], FilterComponent = FilterComponent.asInstanceOf[js.Any], LoadingComponent = LoadingComponent.asInstanceOf[js.Any], NextComponent = NextComponent.asInstanceOf[js.Any], NoDataComponent = NoDataComponent.asInstanceOf[js.Any], PadRowComponent = js.Any.fromFunction0(PadRowComponent), PaginationComponent = PaginationComponent.asInstanceOf[js.Any], PivotComponent = PivotComponent.asInstanceOf[js.Any], PivotValueComponent = PivotValueComponent.asInstanceOf[js.Any], PreviousComponent = PreviousComponent.asInstanceOf[js.Any], ResizerComponent = ResizerComponent.asInstanceOf[js.Any], SubComponent = SubComponent, TableComponent = TableComponent.asInstanceOf[js.Any], TbodyComponent = TbodyComponent.asInstanceOf[js.Any], TdComponent = TdComponent.asInstanceOf[js.Any], TfootComponent = TfootComponent.asInstanceOf[js.Any], ThComponent = ThComponent.asInstanceOf[js.Any], TheadComponent = TheadComponent.asInstanceOf[js.Any], TrComponent = TrComponent.asInstanceOf[js.Any], TrGroupComponent = TrGroupComponent.asInstanceOf[js.Any], aggregatedKey = aggregatedKey, allDecoratedColumns = allDecoratedColumns, allVisibleColumns = allVisibleColumns, canNext = canNext, canPrevious = canPrevious, children = js.Any.fromFunction3(children), className = className, collapseOnDataChange = collapseOnDataChange, collapseOnPageChange = collapseOnPageChange, collapseOnSortingChange = collapseOnSortingChange, column = column, data = data, defaultFilterMethod = defaultFilterMethod, defaultFiltered = defaultFiltered, defaultFiltering = defaultFiltering, defaultPageSize = defaultPageSize, defaultResized = defaultResized, defaultResizing = defaultResizing, defaultSortDesc = defaultSortDesc, defaultSortMethod = defaultSortMethod, defaultSorted = defaultSorted, defaultSorting = defaultSorting, endRow = endRow, expandedRows = expandedRows, expanderDefaults = expanderDefaults, filterable = filterable, filtered = filtered, freezeWhenExpanded = freezeWhenExpanded, frozen = frozen, getLoadingProps = getLoadingProps, getNoDataProps = getNoDataProps, getPaginationProps = getPaginationProps, getProps = getProps.asInstanceOf[js.Any], getResizerProps = getResizerProps, getTableProps = getTableProps, getTbodyProps = getTbodyProps, getTdProps = getTdProps.asInstanceOf[js.Any], getTfootProps = getTfootProps, getTfootTrProps = getTfootTrProps, getTheadFilterProps = getTheadFilterProps, getTheadFilterThProps = getTheadFilterThProps, getTheadFilterTrProps = getTheadFilterTrProps, getTheadGroupProps = getTheadGroupProps, getTheadGroupThProps = getTheadGroupThProps, getTheadGroupTrProps = getTheadGroupTrProps, getTheadProps = getTheadProps, getTheadThProps = getTheadThProps, getTheadTrProps = getTheadTrProps, getTrGroupProps = getTrGroupProps.asInstanceOf[js.Any], getTrProps = getTrProps.asInstanceOf[js.Any], groupedByPivotKey = groupedByPivotKey, hasColumnFooter = hasColumnFooter, hasHeaderGroups = hasHeaderGroups, headerGroups = headerGroups, indexKey = indexKey, loading = loading, loadingText = loadingText.asInstanceOf[js.Any], manual = manual, multiSort = multiSort, nestingLevelKey = nestingLevelKey, nextText = nextText.asInstanceOf[js.Any], noDataText = noDataText.asInstanceOf[js.Any], ofText = ofText.asInstanceOf[js.Any], onChange = onChange, onExpandRow = onExpandRow, onExpandedChange = onExpandedChange, onFetchData = js.Any.fromFunction2(onFetchData), onFilteredChange = onFilteredChange, onPageChange = onPageChange, onPageSizeChange = onPageSizeChange, onResizedChange = onResizedChange, onSortedChange = onSortedChange, originalKey = originalKey, padRows = padRows, pageRows = pageRows, pageSizeOptions = pageSizeOptions, pageText = pageText.asInstanceOf[js.Any], pivotBy = pivotBy, pivotColumnWidth = pivotColumnWidth, pivotDefaults = pivotDefaults, pivotIDKey = pivotIDKey, pivotValKey = pivotValKey, previousText = previousText.asInstanceOf[js.Any], resizable = resizable, resized = resized, resolvedData = resolvedData, rowMinWidth = rowMinWidth, rowsText = rowsText, showFilters = showFilters, showPageJump = showPageJump, showPageSizeOptions = showPageSizeOptions, showPagination = showPagination, showPaginationBottom = showPaginationBottom, showPaginationTop = showPaginationTop, sortable = sortable, sorted = sorted, sortedData = sortedData, sorting = sorting, startRow = startRow, style = style, subRowsKey = subRowsKey)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (minRows != null) __obj.updateDynamic("minRows")(minRows.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    if (resolveData != null) __obj.updateDynamic("resolveData")(js.Any.fromFunction1(resolveData))
    __obj.asInstanceOf[FinalState[D]]
  }
}

