package typings.reactDashTable.reactDashTableMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.ReactType
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinalState[D] extends TableProps[D, D] {
  var allDecoratedColumns: js.Array[Column[D]]
  var allVisibleColumns: js.Array[Column[D]]
  var canNext: Boolean
  var canPrevious: Boolean
  var endRow: Double
  var frozen: Boolean
  var hasColumnFooter: Boolean
  var hasHeaderGroups: Boolean
  var headerGroups: js.Array[_]
  var padRows: Double
  var pageRows: js.Array[DerivedDataObject]
  var resolvedData: js.Array[DerivedDataObject]
  var rowMinWidth: Double
  var sortedData: js.Array[DerivedDataObject]
  var startRow: Double
}

object FinalState {
  @scala.inline
  def apply[D](
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
    allDecoratedColumns: js.Array[Column[D]],
    allVisibleColumns: js.Array[Column[D]],
    canNext: Boolean,
    canPrevious: Boolean,
    children: (FinalState[D], js.Function0[ReactElement], Instance[D]) => ReactNode,
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
    endRow: Double,
    expandedRows: ExpandedRows,
    expanderDefaults: Partial[ExpanderDefaults],
    filterable: Boolean,
    filtered: js.Array[Filter],
    freezeWhenExpanded: Boolean,
    frozen: Boolean,
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
    hasColumnFooter: Boolean,
    hasHeaderGroups: Boolean,
    headerGroups: js.Array[_],
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
    padRows: Double,
    pageRows: js.Array[DerivedDataObject],
    pageSizeOptions: js.Array[Double],
    pivotBy: js.Array[String],
    pivotColumnWidth: Double,
    pivotDefaults: Partial[PivotDefaults],
    pivotIDKey: String,
    pivotValKey: String,
    resizable: Boolean,
    resized: js.Array[Resize],
    resolvedData: js.Array[DerivedDataObject],
    rowMinWidth: Double,
    rowsText: String,
    showFilters: Boolean,
    showPageJump: Boolean,
    showPageSizeOptions: Boolean,
    showPagination: Boolean,
    showPaginationBottom: Boolean,
    showPaginationTop: Boolean,
    sortable: Boolean,
    sorted: js.Array[SortingRule],
    sortedData: js.Array[DerivedDataObject],
    sorting: Double,
    startRow: Double,
    style: js.Object,
    subRowsKey: String,
    columns: js.Array[Column[D]] = null,
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
    resolveData: /* data */ js.Array[D] => js.Array[D] = null
  ): FinalState[D] = {
    val __obj = js.Dynamic.literal(AggregatedComponent = AggregatedComponent.asInstanceOf[js.Any], ExpanderComponent = ExpanderComponent.asInstanceOf[js.Any], FilterComponent = FilterComponent.asInstanceOf[js.Any], LoadingComponent = LoadingComponent.asInstanceOf[js.Any], NextComponent = NextComponent.asInstanceOf[js.Any], NoDataComponent = NoDataComponent.asInstanceOf[js.Any], PadRowComponent = js.Any.fromFunction0(PadRowComponent), PaginationComponent = PaginationComponent.asInstanceOf[js.Any], PivotComponent = PivotComponent.asInstanceOf[js.Any], PivotValueComponent = PivotValueComponent.asInstanceOf[js.Any], PreviousComponent = PreviousComponent.asInstanceOf[js.Any], ResizerComponent = ResizerComponent.asInstanceOf[js.Any], SubComponent = js.Any.fromFunction1(SubComponent), TableComponent = TableComponent.asInstanceOf[js.Any], TbodyComponent = TbodyComponent.asInstanceOf[js.Any], TdComponent = TdComponent.asInstanceOf[js.Any], TfootComponent = TfootComponent.asInstanceOf[js.Any], ThComponent = ThComponent.asInstanceOf[js.Any], TheadComponent = TheadComponent.asInstanceOf[js.Any], TrComponent = TrComponent.asInstanceOf[js.Any], TrGroupComponent = TrGroupComponent.asInstanceOf[js.Any], aggregatedKey = aggregatedKey.asInstanceOf[js.Any], allDecoratedColumns = allDecoratedColumns.asInstanceOf[js.Any], allVisibleColumns = allVisibleColumns.asInstanceOf[js.Any], canNext = canNext.asInstanceOf[js.Any], canPrevious = canPrevious.asInstanceOf[js.Any], children = js.Any.fromFunction3(children), className = className.asInstanceOf[js.Any], collapseOnDataChange = collapseOnDataChange.asInstanceOf[js.Any], collapseOnPageChange = collapseOnPageChange.asInstanceOf[js.Any], collapseOnSortingChange = collapseOnSortingChange.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], defaultFilterMethod = js.Any.fromFunction3(defaultFilterMethod), defaultFiltered = defaultFiltered.asInstanceOf[js.Any], defaultFiltering = defaultFiltering.asInstanceOf[js.Any], defaultPageSize = defaultPageSize.asInstanceOf[js.Any], defaultResized = defaultResized.asInstanceOf[js.Any], defaultResizing = defaultResizing.asInstanceOf[js.Any], defaultSortDesc = defaultSortDesc.asInstanceOf[js.Any], defaultSortMethod = js.Any.fromFunction3(defaultSortMethod), defaultSorted = defaultSorted.asInstanceOf[js.Any], defaultSorting = defaultSorting.asInstanceOf[js.Any], endRow = endRow.asInstanceOf[js.Any], expandedRows = expandedRows.asInstanceOf[js.Any], expanderDefaults = expanderDefaults.asInstanceOf[js.Any], filterable = filterable.asInstanceOf[js.Any], filtered = filtered.asInstanceOf[js.Any], freezeWhenExpanded = freezeWhenExpanded.asInstanceOf[js.Any], frozen = frozen.asInstanceOf[js.Any], getLoadingProps = js.Any.fromFunction4(getLoadingProps), getNoDataProps = js.Any.fromFunction4(getNoDataProps), getPaginationProps = js.Any.fromFunction4(getPaginationProps), getProps = js.Any.fromFunction4(getProps), getResizerProps = js.Any.fromFunction4(getResizerProps), getTableProps = js.Any.fromFunction4(getTableProps), getTbodyProps = js.Any.fromFunction4(getTbodyProps), getTdProps = js.Any.fromFunction4(getTdProps), getTfootProps = js.Any.fromFunction4(getTfootProps), getTfootTdProps = js.Any.fromFunction4(getTfootTdProps), getTfootTrProps = js.Any.fromFunction4(getTfootTrProps), getTheadFilterProps = js.Any.fromFunction4(getTheadFilterProps), getTheadFilterThProps = js.Any.fromFunction4(getTheadFilterThProps), getTheadFilterTrProps = js.Any.fromFunction4(getTheadFilterTrProps), getTheadGroupProps = js.Any.fromFunction4(getTheadGroupProps), getTheadGroupThProps = js.Any.fromFunction4(getTheadGroupThProps), getTheadGroupTrProps = js.Any.fromFunction4(getTheadGroupTrProps), getTheadProps = js.Any.fromFunction4(getTheadProps), getTheadThProps = js.Any.fromFunction4(getTheadThProps), getTheadTrProps = js.Any.fromFunction4(getTheadTrProps), getTrGroupProps = js.Any.fromFunction4(getTrGroupProps), getTrProps = js.Any.fromFunction4(getTrProps), groupedByPivotKey = groupedByPivotKey.asInstanceOf[js.Any], hasColumnFooter = hasColumnFooter.asInstanceOf[js.Any], hasHeaderGroups = hasHeaderGroups.asInstanceOf[js.Any], headerGroups = headerGroups.asInstanceOf[js.Any], indexKey = indexKey.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], manual = manual.asInstanceOf[js.Any], multiSort = multiSort.asInstanceOf[js.Any], nestingLevelKey = nestingLevelKey.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onExpandRow = js.Any.fromFunction1(onExpandRow), onExpandedChange = js.Any.fromFunction3(onExpandedChange), onFetchData = js.Any.fromFunction2(onFetchData), onFilteredChange = js.Any.fromFunction3(onFilteredChange), onPageChange = js.Any.fromFunction1(onPageChange), onPageSizeChange = js.Any.fromFunction2(onPageSizeChange), onResizedChange = js.Any.fromFunction2(onResizedChange), onSortedChange = js.Any.fromFunction3(onSortedChange), originalKey = originalKey.asInstanceOf[js.Any], padRows = padRows.asInstanceOf[js.Any], pageRows = pageRows.asInstanceOf[js.Any], pageSizeOptions = pageSizeOptions.asInstanceOf[js.Any], pivotBy = pivotBy.asInstanceOf[js.Any], pivotColumnWidth = pivotColumnWidth.asInstanceOf[js.Any], pivotDefaults = pivotDefaults.asInstanceOf[js.Any], pivotIDKey = pivotIDKey.asInstanceOf[js.Any], pivotValKey = pivotValKey.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any], resized = resized.asInstanceOf[js.Any], resolvedData = resolvedData.asInstanceOf[js.Any], rowMinWidth = rowMinWidth.asInstanceOf[js.Any], rowsText = rowsText.asInstanceOf[js.Any], showFilters = showFilters.asInstanceOf[js.Any], showPageJump = showPageJump.asInstanceOf[js.Any], showPageSizeOptions = showPageSizeOptions.asInstanceOf[js.Any], showPagination = showPagination.asInstanceOf[js.Any], showPaginationBottom = showPaginationBottom.asInstanceOf[js.Any], showPaginationTop = showPaginationTop.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any], sorted = sorted.asInstanceOf[js.Any], sortedData = sortedData.asInstanceOf[js.Any], sorting = sorting.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], subRowsKey = subRowsKey.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[FinalState[D]]
  }
}

