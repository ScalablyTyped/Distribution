package typings.reactDashVirtualized

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.reactDashVirtualized.distEsCellMeasurerMod.CellMeasurerCache
import typings.reactDashVirtualized.distEsTableMod.HeaderMouseEventHandlerParams
import typings.reactDashVirtualized.distEsTableMod.RowMouseEventHandlerParams
import typings.reactDashVirtualized.distEsTableMod.SortDirectionType
import typings.reactDashVirtualized.distEsTableMod.TableHeaderRowProps
import typings.reactDashVirtualized.distEsTableMod.TableHeaderRowRenderer
import typings.reactDashVirtualized.distEsTableMod.TableRowProps
import typings.reactDashVirtualized.distEsTableMod.TableRowRenderer
import typings.reactDashVirtualized.reactDashVirtualizedMod.Index
import typings.reactDashVirtualized.reactDashVirtualizedMod.IndexRange
import typings.reactDashVirtualized.reactDashVirtualizedMod.OverscanIndexRange
import typings.reactDashVirtualized.reactDashVirtualizedMod.ScrollEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArialabelAutoHeightChildren extends js.Object {
  var `aria-label`: js.UndefOr[String] = js.undefined
  /**
    * Removes fixed height from the scrollingContainer so that the total height
    * of rows can stretch the window. Intended for use with WindowScroller
    */
  var autoHeight: js.UndefOr[Boolean] = js.undefined
  /** One or more Columns describing the data displayed in this row */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Optional CSS class name */
  var className: js.UndefOr[String] = js.undefined
  var deferredMeasurementCache: js.UndefOr[CellMeasurerCache] = js.undefined
  /** Disable rendering the header at all */
  var disableHeader: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to estimate the total height of a Table before all of its rows have actually been measured.
    * The estimated total height is adjusted as rows are rendered.
    */
  var estimatedRowSize: js.UndefOr[Double] = js.undefined
  /** Optional custom CSS class name to attach to inner Grid element. */
  var gridClassName: js.UndefOr[String] = js.undefined
  /** Optional inline style to attach to inner Grid element. */
  var gridStyle: js.UndefOr[js.Any] = js.undefined
  /** Optional CSS class to apply to all column headers */
  var headerClassName: js.UndefOr[String] = js.undefined
  /** Fixed height of header row */
  var headerHeight: Double
  /**
    * Responsible for rendering a table row given an array of columns:
    * Should implement the following interface: ({
    *   className: string,
    *   columns: any[],
    *   style: any
    * }): PropTypes.node
    */
  var headerRowRenderer: js.UndefOr[TableHeaderRowRenderer] = js.undefined
  /** Optional custom inline style to attach to table header columns. */
  var headerStyle: js.UndefOr[js.Any] = js.undefined
  /** Fixed/available height for out DOM element */
  var height: js.UndefOr[Double] = js.undefined
  /** Optional id */
  var id: js.UndefOr[String] = js.undefined
  /** Optional renderer to be used in place of table body rows when rowCount is 0 */
  var noRowsRenderer: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Optional callback when a column's header is clicked.
    * ({ columnData: any, dataKey: string }): void
    */
  var onHeaderClick: js.UndefOr[js.Function1[/* params */ HeaderMouseEventHandlerParams, Unit]] = js.undefined
  /**
    * Callback invoked when a user clicks on a table row.
    * ({ index: number }): void
    */
  var onRowClick: js.UndefOr[js.Function1[/* info */ RowMouseEventHandlerParams, Unit]] = js.undefined
  /**
    * Callback invoked when a user double-clicks on a table row.
    * ({ index: number }): void
    */
  var onRowDoubleClick: js.UndefOr[js.Function1[/* info */ RowMouseEventHandlerParams, Unit]] = js.undefined
  /**
    * Callback invoked when the mouse leaves a table row.
    * ({ index: number }): void
    */
  var onRowMouseOut: js.UndefOr[js.Function1[/* info */ RowMouseEventHandlerParams, Unit]] = js.undefined
  /**
    * Callback invoked when a user moves the mouse over a table row.
    * ({ index: number }): void
    */
  var onRowMouseOver: js.UndefOr[js.Function1[/* info */ RowMouseEventHandlerParams, Unit]] = js.undefined
  /**
    * Callback invoked with information about the slice of rows that were just rendered.
    * ({ startIndex, stopIndex }): void
    */
  var onRowsRendered: js.UndefOr[js.Function1[/* info */ IndexRange with OverscanIndexRange, Unit]] = js.undefined
  /**
    * Callback invoked whenever the scroll offset changes within the inner scrollable region.
    * This callback can be used to sync scrolling between lists, tables, or grids.
    * ({ clientHeight, scrollHeight, scrollTop }): void
    */
  var onScroll: js.UndefOr[js.Function1[/* info */ ScrollEventData, Unit]] = js.undefined
  /**
    * Number of rows to render above/below the visible bounds of the list.
    * These rows can help for smoother scrolling on touch devices.
    */
  var overscanRowCount: js.UndefOr[Double] = js.undefined
  /**
    * Optional CSS class to apply to all table rows (including the header row).
    * This property can be a CSS class name (string) or a function that returns a class name.
    * If a function is provided its signature should be: ({ index: number }): string
    */
  var rowClassName: js.UndefOr[String | (js.Function1[/* info */ Index, String])] = js.undefined
  /** Number of rows in table. */
  var rowCount: Double
  /**
    * Callback responsible for returning a data row given an index.
    * ({ index: number }): any
    */
  var rowGetter: js.UndefOr[js.Function1[/* info */ Index, _]] = js.undefined
  /**
    * Either a fixed row height (number) or a function that returns the height of a row given its index.
    * ({ index: number }): number
    */
  var rowHeight: Double | (js.Function1[/* info */ Index, Double])
  /**
    * Responsible for rendering a table row given an array of columns:
    * Should implement the following interface: ({
    *   className: string,
    *   columns: Array,
    *   index: number,
    *   isScrolling: boolean,
    *   onRowClick: ?Function,
    *   onRowDoubleClick: ?Function,
    *   onRowMouseOver: ?Function,
    *   onRowMouseOut: ?Function,
    *   rowData: any,
    *   style: any
    * }): PropTypes.node
    */
  var rowRenderer: js.UndefOr[TableRowRenderer] = js.undefined
  /** Optional custom inline style to attach to table rows. */
  var rowStyle: js.UndefOr[CSSProperties | (js.Function1[/* info */ Index, CSSProperties])] = js.undefined
  /** See Grid#scrollToAlignment */
  var scrollToAlignment: js.UndefOr[String] = js.undefined
  /** Row index to ensure visible (by forcefully scrolling if necessary) */
  var scrollToIndex: js.UndefOr[Double] = js.undefined
  /** Vertical offset. */
  var scrollTop: js.UndefOr[Double] = js.undefined
  /**
    * Sort function to be called if a sortable header is clicked.
    * ({ sortBy: string, sortDirection: SortDirection }): void
    */
  var sort: js.UndefOr[js.Function1[/* info */ Anon_SortBy, Unit]] = js.undefined
  /** Table data is currently sorted by this :dataKey (if it is sorted at all) */
  var sortBy: js.UndefOr[String] = js.undefined
  /** Table data is currently sorted in this direction (if it is sorted at all) */
  var sortDirection: js.UndefOr[SortDirectionType] = js.undefined
  /** Optional inline style */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /** Tab index for focus */
  var tabIndex: js.UndefOr[Double | Null] = js.undefined
  /** Width of list */
  var width: js.UndefOr[Double] = js.undefined
}

object Anon_ArialabelAutoHeightChildren {
  @scala.inline
  def apply(
    headerHeight: Double,
    rowCount: Double,
    rowHeight: Double | (js.Function1[/* info */ Index, Double]),
    `aria-label`: String = null,
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    deferredMeasurementCache: CellMeasurerCache = null,
    disableHeader: js.UndefOr[Boolean] = js.undefined,
    estimatedRowSize: Int | Double = null,
    gridClassName: String = null,
    gridStyle: js.Any = null,
    headerClassName: String = null,
    headerRowRenderer: /* props */ TableHeaderRowProps => ReactNode = null,
    headerStyle: js.Any = null,
    height: Int | Double = null,
    id: String = null,
    noRowsRenderer: () => Unit = null,
    onHeaderClick: /* params */ HeaderMouseEventHandlerParams => Unit = null,
    onRowClick: /* info */ RowMouseEventHandlerParams => Unit = null,
    onRowDoubleClick: /* info */ RowMouseEventHandlerParams => Unit = null,
    onRowMouseOut: /* info */ RowMouseEventHandlerParams => Unit = null,
    onRowMouseOver: /* info */ RowMouseEventHandlerParams => Unit = null,
    onRowsRendered: /* info */ IndexRange with OverscanIndexRange => Unit = null,
    onScroll: /* info */ ScrollEventData => Unit = null,
    overscanRowCount: Int | Double = null,
    rowClassName: String | (js.Function1[/* info */ Index, String]) = null,
    rowGetter: /* info */ Index => _ = null,
    rowRenderer: /* props */ TableRowProps => ReactNode = null,
    rowStyle: CSSProperties | (js.Function1[/* info */ Index, CSSProperties]) = null,
    scrollToAlignment: String = null,
    scrollToIndex: Int | Double = null,
    scrollTop: Int | Double = null,
    sort: /* info */ Anon_SortBy => Unit = null,
    sortBy: String = null,
    sortDirection: SortDirectionType = null,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    width: Int | Double = null
  ): Anon_ArialabelAutoHeightChildren = {
    val __obj = js.Dynamic.literal(headerHeight = headerHeight, rowCount = rowCount, rowHeight = rowHeight.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (deferredMeasurementCache != null) __obj.updateDynamic("deferredMeasurementCache")(deferredMeasurementCache)
    if (!js.isUndefined(disableHeader)) __obj.updateDynamic("disableHeader")(disableHeader)
    if (estimatedRowSize != null) __obj.updateDynamic("estimatedRowSize")(estimatedRowSize.asInstanceOf[js.Any])
    if (gridClassName != null) __obj.updateDynamic("gridClassName")(gridClassName)
    if (gridStyle != null) __obj.updateDynamic("gridStyle")(gridStyle)
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName)
    if (headerRowRenderer != null) __obj.updateDynamic("headerRowRenderer")(js.Any.fromFunction1(headerRowRenderer))
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (noRowsRenderer != null) __obj.updateDynamic("noRowsRenderer")(js.Any.fromFunction0(noRowsRenderer))
    if (onHeaderClick != null) __obj.updateDynamic("onHeaderClick")(js.Any.fromFunction1(onHeaderClick))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction1(onRowClick))
    if (onRowDoubleClick != null) __obj.updateDynamic("onRowDoubleClick")(js.Any.fromFunction1(onRowDoubleClick))
    if (onRowMouseOut != null) __obj.updateDynamic("onRowMouseOut")(js.Any.fromFunction1(onRowMouseOut))
    if (onRowMouseOver != null) __obj.updateDynamic("onRowMouseOver")(js.Any.fromFunction1(onRowMouseOver))
    if (onRowsRendered != null) __obj.updateDynamic("onRowsRendered")(js.Any.fromFunction1(onRowsRendered))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (overscanRowCount != null) __obj.updateDynamic("overscanRowCount")(overscanRowCount.asInstanceOf[js.Any])
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(rowClassName.asInstanceOf[js.Any])
    if (rowGetter != null) __obj.updateDynamic("rowGetter")(js.Any.fromFunction1(rowGetter))
    if (rowRenderer != null) __obj.updateDynamic("rowRenderer")(js.Any.fromFunction1(rowRenderer))
    if (rowStyle != null) __obj.updateDynamic("rowStyle")(rowStyle.asInstanceOf[js.Any])
    if (scrollToAlignment != null) __obj.updateDynamic("scrollToAlignment")(scrollToAlignment)
    if (scrollToIndex != null) __obj.updateDynamic("scrollToIndex")(scrollToIndex.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction1(sort))
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy)
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArialabelAutoHeightChildren]
  }
}

