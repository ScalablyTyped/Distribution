package typings.reactVirtualized.esTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactVirtualized.anon.SortBy
import typings.reactVirtualized.esCellMeasurerMod.CellMeasurerCache
import typings.reactVirtualized.esGridMod.GridCellRangeProps
import typings.reactVirtualized.esGridMod.GridCellRangeRenderer
import typings.reactVirtualized.esGridMod.OverscanIndices
import typings.reactVirtualized.esGridMod.OverscanIndicesGetter
import typings.reactVirtualized.esGridMod.OverscanIndicesGetterParams
import typings.reactVirtualized.esGridMod.ScrollParams
import typings.reactVirtualized.esGridMod.ScrollbarPresenceParams
import typings.reactVirtualized.esGridMod.SectionRenderedParams
import typings.reactVirtualized.mod.Alignment
import typings.reactVirtualized.mod.Index
import typings.reactVirtualized.mod.IndexRange
import typings.reactVirtualized.mod.OverscanIndexRange
import typings.reactVirtualized.mod.ScrollEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-virtualized.react-virtualized/dist/es/Grid.GridCoreProps & {  aria-label :string | undefined,   deferredMeasurementCache :react-virtualized.react-virtualized/dist/es/CellMeasurer.CellMeasurerCache | undefined,   autoHeight :boolean | undefined,   children :react.react.ReactNode | undefined,   className :string | undefined,   disableHeader :boolean | undefined,   estimatedRowSize :number | undefined,   gridClassName :string | undefined,   gridStyle :any | undefined,   headerClassName :string | undefined,   headerHeight :number,   headerRowRenderer :react-virtualized.react-virtualized/dist/es/Table.TableHeaderRowRenderer | undefined,   headerStyle :any | undefined,   height :number | undefined,   id :string | undefined,   noRowsRenderer :(): react.react.<global>.JSX.Element | null | undefined,   onHeaderClick :(params : react-virtualized.react-virtualized/dist/es/Table.HeaderMouseEventHandlerParams): void | undefined,   onRowClick :(info : react-virtualized.react-virtualized/dist/es/Table.RowMouseEventHandlerParams): void | undefined,   onRowDoubleClick :(info : react-virtualized.react-virtualized/dist/es/Table.RowMouseEventHandlerParams): void | undefined,   onRowMouseOut :(info : react-virtualized.react-virtualized/dist/es/Table.RowMouseEventHandlerParams): void | undefined,   onRowMouseOver :(info : react-virtualized.react-virtualized/dist/es/Table.RowMouseEventHandlerParams): void | undefined,   onRowsRendered :(info : react-virtualized.react-virtualized.IndexRange & react-virtualized.react-virtualized.OverscanIndexRange): void | undefined,   onScroll :(info : react-virtualized.react-virtualized.ScrollEventData): void | undefined,   overscanRowCount :number | undefined,   rowClassName :string | (info : react-virtualized.react-virtualized.Index): string | undefined,   rowGetter :(info : react-virtualized.react-virtualized.Index): any | undefined,   rowHeight :number | (info : react-virtualized.react-virtualized.Index): number,   rowCount :number,   rowRenderer :react-virtualized.react-virtualized/dist/es/Table.TableRowRenderer | undefined,   rowStyle :react.react.CSSProperties | (info : react-virtualized.react-virtualized.Index): react.react.CSSProperties | undefined,   scrollToAlignment :string | undefined,   scrollToIndex :number | undefined,   scrollTop :number | undefined,   sort :(info : {  sortBy :string,   sortDirection :react-virtualized.react-virtualized/dist/es/Table.SortDirectionType}): void | undefined,   sortBy :string | undefined,   sortDirection :react-virtualized.react-virtualized/dist/es/Table.SortDirectionType | undefined,   style :react.react.CSSProperties | undefined,   tabIndex :number | null | undefined,   width :number | undefined} */
@js.native
trait TableProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ StringDictionary[js.Any] {
  
  var `aria-label`: js.UndefOr[String] = js.native
  
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the width of the inner scrollable container to 'auto'.
    * This is useful for single-column Grids to ensure that the column doesn't extend below a vertical scrollbar.
    */
  var autoContainerWidth: js.UndefOr[Boolean] = js.native
  
  /**
    * Removes fixed height from the scrollingContainer so that the total height of rows can stretch the window.
    * Intended for use with WindowScroller
    */
  /**
    * Removes fixed height from the scrollingContainer so that the total height
    * of rows can stretch the window. Intended for use with WindowScroller
    */
  var autoHeight: js.UndefOr[Boolean] = js.native
  
  /**
    * Removes fixed width from the scrollingContainer so that the total width of rows can stretch the window.
    * Intended for use with WindowScroller
    */
  var autoWidth: js.UndefOr[Boolean] = js.native
  
  /**
    * Responsible for rendering a group of cells given their index ranges.
    * Should implement the following interface: ({
    *   cellCache: Map,
    *   cellRenderer: Function,
    *   columnSizeAndPositionManager: CellSizeAndPositionManager,
    *   columnStartIndex: number,
    *   columnStopIndex: number,
    *   isScrolling: boolean,
    *   rowSizeAndPositionManager: CellSizeAndPositionManager,
    *   rowStartIndex: number,
    *   rowStopIndex: number,
    *   scrollLeft: number,
    *   scrollTop: number
    * }): Array<PropTypes.node>
    */
  var cellRangeRenderer: js.UndefOr[GridCellRangeRenderer] = js.native
  
  /** One or more Columns describing the data displayed in this row */
  var children: js.UndefOr[ReactNode] = js.native
  
  /**
    * Optional custom CSS class name to attach to root Grid element.
    */
  /** Optional CSS class name */
  var className: js.UndefOr[String] = js.native
  
  /** Unfiltered props for the Grid container. */
  var containerProps: js.UndefOr[js.Object] = js.native
  
  /** ARIA role for the cell-container.  */
  var containerRole: js.UndefOr[String] = js.native
  
  /** Optional inline style applied to inner cell-container */
  var containerStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * If CellMeasurer is used to measure this Grid's children, this should be a pointer to its CellMeasurerCache.
    * A shared CellMeasurerCache reference enables Grid and CellMeasurer to share measurement data.
    */
  var deferredMeasurementCache: js.UndefOr[CellMeasurerCache] = js.native
  
  /** Disable rendering the header at all */
  var disableHeader: js.UndefOr[Boolean] = js.native
  
  /**
    * Used to estimate the total width of a Grid before all of its columns have actually been measured.
    * The estimated total width is adjusted as columns are rendered.
    */
  var estimatedColumnSize: js.UndefOr[Double] = js.native
  
  /**
    * Used to estimate the total height of a Grid before all of its rows have actually been measured.
    * The estimated total height is adjusted as rows are rendered.
    */
  /**
    * Used to estimate the total height of a Table before all of its rows have actually been measured.
    * The estimated total height is adjusted as rows are rendered.
    */
  var estimatedRowSize: js.UndefOr[Double] = js.native
  
  /**
    * Exposed for testing purposes only.
    */
  var getScrollbarSize: js.UndefOr[js.Function0[Double]] = js.native
  
  /** Optional custom CSS class name to attach to inner Grid element. */
  var gridClassName: js.UndefOr[String] = js.native
  
  /** Optional inline style to attach to inner Grid element. */
  var gridStyle: js.UndefOr[js.Any] = js.native
  
  /** Optional CSS class to apply to all column headers */
  var headerClassName: js.UndefOr[String] = js.native
  
  /** Fixed height of header row */
  var headerHeight: Double = js.native
  
  /**
    * Responsible for rendering a table row given an array of columns:
    * Should implement the following interface: ({
    *   className: string,
    *   columns: any[],
    *   style: any
    * }): PropTypes.node
    */
  var headerRowRenderer: js.UndefOr[TableHeaderRowRenderer] = js.native
  
  /** Optional custom inline style to attach to table header columns. */
  var headerStyle: js.UndefOr[js.Any] = js.native
  
  /**
    * Height of Grid; this property determines the number of visible (vs virtualized) rows.
    */
  /** Fixed/available height for out DOM element */
  var height: Double with js.UndefOr[Double] = js.native
  
  /**
    * Optional custom id to attach to root Grid element.
    */
  /** Optional id */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Override internal is-scrolling state tracking.
    * This property is primarily intended for use with the WindowScroller component.
    */
  var isScrolling: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional renderer to be used in place of rows when either :rowCount or :columnCount is 0.
    */
  var noContentRenderer: js.UndefOr[js.Function0[ReactNode]] = js.native
  
  /** Optional renderer to be used in place of table body rows when rowCount is 0 */
  var noRowsRenderer: js.UndefOr[js.Function0[Element | Null]] = js.native
  
  /**
    * Optional callback when a column's header is clicked.
    * ({ columnData: any, dataKey: string }): void
    */
  var onHeaderClick: js.UndefOr[js.Function1[/* params */ HeaderMouseEventHandlerParams, Unit]] = js.native
  
  /**
    * Callback invoked when a user clicks on a table row.
    * ({ index: number }): void
    */
  var onRowClick: js.UndefOr[js.Function1[/* info */ RowMouseEventHandlerParams, Unit]] = js.native
  
  /**
    * Callback invoked when a user double-clicks on a table row.
    * ({ index: number }): void
    */
  var onRowDoubleClick: js.UndefOr[js.Function1[/* info */ RowMouseEventHandlerParams, Unit]] = js.native
  
  /**
    * Callback invoked when the mouse leaves a table row.
    * ({ index: number }): void
    */
  var onRowMouseOut: js.UndefOr[js.Function1[/* info */ RowMouseEventHandlerParams, Unit]] = js.native
  
  /**
    * Callback invoked when a user moves the mouse over a table row.
    * ({ index: number }): void
    */
  var onRowMouseOver: js.UndefOr[js.Function1[/* info */ RowMouseEventHandlerParams, Unit]] = js.native
  
  /**
    * Callback invoked with information about the slice of rows that were just rendered.
    * ({ startIndex, stopIndex }): void
    */
  var onRowsRendered: js.UndefOr[js.Function1[/* info */ IndexRange with OverscanIndexRange, Unit]] = js.native
  
  /**
    * Callback invoked whenever the scroll offset changes within the inner scrollable region.
    * This callback can be used to sync scrolling between lists, tables, or grids.
    * ({ clientHeight, clientWidth, scrollHeight, scrollLeft, scrollTop, scrollWidth }): void
    */
  /**
    * Callback invoked whenever the scroll offset changes within the inner scrollable region.
    * This callback can be used to sync scrolling between lists, tables, or grids.
    * ({ clientHeight, scrollHeight, scrollTop }): void
    */
  var onScroll: (js.UndefOr[js.Function1[/* params */ ScrollParams, _]]) with (js.UndefOr[js.Function1[/* info */ ScrollEventData, Unit]]) = js.native
  
  /**
    * Called whenever a horizontal or vertical scrollbar is added or removed.
    * ({ horizontal: boolean, size: number, vertical: boolean }): void
    */
  var onScrollbarPresenceChange: js.UndefOr[js.Function1[/* params */ ScrollbarPresenceParams, _]] = js.native
  
  /**
    * Callback invoked with information about the section of the Grid that was just rendered.
    * ({ columnStartIndex, columnStopIndex, rowStartIndex, rowStopIndex }): void
    */
  var onSectionRendered: js.UndefOr[js.Function1[/* params */ SectionRenderedParams, _]] = js.native
  
  /**
    * Number of columns to render before/after the visible section of the grid.
    * These columns can help for smoother scrolling on touch devices or browsers that send scroll events infrequently.
    */
  var overscanColumnCount: js.UndefOr[Double] = js.native
  
  /**
    * Calculates the number of cells to overscan before and after a specified range.
    * This function ensures that overscanning doesn't exceed the available cells.
    * Should implement the following interface: ({
    *   cellCount: number,
    *   overscanCellsCount: number,
    *   scrollDirection: number,
    *   startIndex: number,
    *   stopIndex: number
    * }): {overscanStartIndex: number, overscanStopIndex: number}
    */
  var overscanIndicesGetter: js.UndefOr[OverscanIndicesGetter] = js.native
  
  /**
    * Number of rows to render above/below the visible section of the grid.
    * These rows can help for smoother scrolling on touch devices or browsers that send scroll events infrequently.
    */
  /**
    * Number of rows to render above/below the visible bounds of the list.
    * These rows can help for smoother scrolling on touch devices.
    */
  var overscanRowCount: js.UndefOr[Double] = js.native
  
  /**
    * ARIA role for the grid element.
    */
  var role: js.UndefOr[String] = js.native
  
  /**
    * Optional CSS class to apply to all table rows (including the header row).
    * This property can be a CSS class name (string) or a function that returns a class name.
    * If a function is provided its signature should be: ({ index: number }): string
    */
  var rowClassName: js.UndefOr[String | (js.Function1[/* info */ Index, String])] = js.native
  
  /**
    * Number of rows in grid.
    */
  /** Number of rows in table. */
  var rowCount: Double = js.native
  
  /**
    * Callback responsible for returning a data row given an index.
    * ({ index: number }): any
    */
  var rowGetter: js.UndefOr[js.Function1[/* info */ Index, _]] = js.native
  
  /**
    * Either a fixed row height (number) or a function that returns the height of a row given its index.
    * Should implement the following interface: ({ index: number }): number
    */
  /**
    * Either a fixed row height (number) or a function that returns the height of a row given its index.
    * ({ index: number }): number
    */
  var rowHeight: Double | (js.Function1[/* params */ Index, Double]) = js.native
  
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
  var rowRenderer: js.UndefOr[TableRowRenderer] = js.native
  
  /** Optional custom inline style to attach to table rows. */
  var rowStyle: js.UndefOr[CSSProperties | (js.Function1[/* info */ Index, CSSProperties])] = js.native
  
  /** Horizontal offset. */
  var scrollLeft: js.UndefOr[Double] = js.native
  
  /**
    * Controls scroll-to-cell behavior of the Grid.
    * The default ("auto") scrolls the least amount possible to ensure that the specified cell is fully visible.
    * Use "start" to align cells to the top/left of the Grid and "end" to align bottom/right.
    */
  /** See Grid#scrollToAlignment */
  var scrollToAlignment: js.UndefOr[Alignment] with js.UndefOr[String] = js.native
  
  /**
    * Column index to ensure visible (by forcefully scrolling if necessary)
    */
  var scrollToColumn: js.UndefOr[Double] = js.native
  
  /** Row index to ensure visible (by forcefully scrolling if necessary) */
  var scrollToIndex: js.UndefOr[Double] = js.native
  
  /**
    * Row index to ensure visible (by forcefully scrolling if necessary)
    */
  var scrollToRow: js.UndefOr[Double] = js.native
  
  /** Vertical offset. */
  var scrollTop: js.UndefOr[Double] = js.native
  
  /** Wait this amount of time after the last scroll event before resetting Grid `pointer-events`. */
  var scrollingResetTimeInterval: js.UndefOr[Double] = js.native
  
  /**
    * Sort function to be called if a sortable header is clicked.
    * ({ sortBy: string, sortDirection: SortDirection }): void
    */
  var sort: js.UndefOr[js.Function1[/* info */ SortBy, Unit]] = js.native
  
  /** Table data is currently sorted by this :dataKey (if it is sorted at all) */
  var sortBy: js.UndefOr[String] = js.native
  
  /** Table data is currently sorted in this direction (if it is sorted at all) */
  var sortDirection: js.UndefOr[SortDirectionType] = js.native
  
  /** Optional inline style */
  var style: js.UndefOr[CSSProperties] = js.native
  
  /** Tab index for focus */
  var tabIndex: js.UndefOr[Double | Null] = js.native
  
  /**
    * Width of Grid; this property determines the number of visible (vs virtualized) columns.
    */
  /** Width of list */
  var width: Double with js.UndefOr[Double] = js.native
}
object TableProps {
  
  @scala.inline
  def apply(
    headerHeight: Double,
    height: Double with js.UndefOr[Double],
    onScroll: (js.UndefOr[js.Function1[/* params */ ScrollParams, _]]) with (js.UndefOr[js.Function1[/* info */ ScrollEventData, Unit]]),
    rowCount: Double,
    rowHeight: Double | (js.Function1[/* params */ Index, Double]),
    scrollToAlignment: js.UndefOr[Alignment] with js.UndefOr[String],
    width: Double with js.UndefOr[Double]
  ): TableProps = {
    val __obj = js.Dynamic.literal(headerHeight = headerHeight.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], onScroll = onScroll.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], scrollToAlignment = scrollToAlignment.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProps]
  }
  
  @scala.inline
  implicit class TablePropsOps[Self <: TableProps] (val x: Self) extends AnyVal {
    
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
    def setHeaderHeight(value: Double): Self = this.set("headerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double with js.UndefOr[Double]): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnScroll(
      value: (js.UndefOr[js.Function1[/* params */ ScrollParams, _]]) with (js.UndefOr[js.Function1[/* info */ ScrollEventData, Unit]])
    ): Self = this.set("onScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeightFunction1(value: /* params */ Index => Double): Self = this.set("rowHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowHeight(value: Double | (js.Function1[/* params */ Index, Double])): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToAlignment(value: js.UndefOr[Alignment] with js.UndefOr[String]): Self = this.set("scrollToAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double with js.UndefOr[Double]): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    
    @scala.inline
    def `setAria-readonly`(value: Boolean): Self = this.set("aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-readonly`: Self = this.set("aria-readonly", js.undefined)
    
    @scala.inline
    def setAutoContainerWidth(value: Boolean): Self = this.set("autoContainerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoContainerWidth: Self = this.set("autoContainerWidth", js.undefined)
    
    @scala.inline
    def setAutoHeight(value: Boolean): Self = this.set("autoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHeight: Self = this.set("autoHeight", js.undefined)
    
    @scala.inline
    def setAutoWidth(value: Boolean): Self = this.set("autoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoWidth: Self = this.set("autoWidth", js.undefined)
    
    @scala.inline
    def setCellRangeRenderer(value: /* params */ GridCellRangeProps => js.Array[ReactNode]): Self = this.set("cellRangeRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellRangeRenderer: Self = this.set("cellRangeRenderer", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContainerProps(value: js.Object): Self = this.set("containerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerProps: Self = this.set("containerProps", js.undefined)
    
    @scala.inline
    def setContainerRole(value: String): Self = this.set("containerRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerRole: Self = this.set("containerRole", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: CSSProperties): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setDeferredMeasurementCache(value: CellMeasurerCache): Self = this.set("deferredMeasurementCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferredMeasurementCache: Self = this.set("deferredMeasurementCache", js.undefined)
    
    @scala.inline
    def setDisableHeader(value: Boolean): Self = this.set("disableHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableHeader: Self = this.set("disableHeader", js.undefined)
    
    @scala.inline
    def setEstimatedColumnSize(value: Double): Self = this.set("estimatedColumnSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedColumnSize: Self = this.set("estimatedColumnSize", js.undefined)
    
    @scala.inline
    def setEstimatedRowSize(value: Double): Self = this.set("estimatedRowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedRowSize: Self = this.set("estimatedRowSize", js.undefined)
    
    @scala.inline
    def setGetScrollbarSize(value: () => Double): Self = this.set("getScrollbarSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetScrollbarSize: Self = this.set("getScrollbarSize", js.undefined)
    
    @scala.inline
    def setGridClassName(value: String): Self = this.set("gridClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridClassName: Self = this.set("gridClassName", js.undefined)
    
    @scala.inline
    def setGridStyle(value: js.Any): Self = this.set("gridStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridStyle: Self = this.set("gridStyle", js.undefined)
    
    @scala.inline
    def setHeaderClassName(value: String): Self = this.set("headerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderClassName: Self = this.set("headerClassName", js.undefined)
    
    @scala.inline
    def setHeaderRowRenderer(value: /* props */ TableHeaderRowProps => ReactNode): Self = this.set("headerRowRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHeaderRowRenderer: Self = this.set("headerRowRenderer", js.undefined)
    
    @scala.inline
    def setHeaderStyle(value: js.Any): Self = this.set("headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderStyle: Self = this.set("headerStyle", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsScrolling(value: Boolean): Self = this.set("isScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsScrolling: Self = this.set("isScrolling", js.undefined)
    
    @scala.inline
    def setNoContentRenderer(value: () => ReactNode): Self = this.set("noContentRenderer", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNoContentRenderer: Self = this.set("noContentRenderer", js.undefined)
    
    @scala.inline
    def setNoRowsRenderer(value: () => Element | Null): Self = this.set("noRowsRenderer", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNoRowsRenderer: Self = this.set("noRowsRenderer", js.undefined)
    
    @scala.inline
    def setOnHeaderClick(value: /* params */ HeaderMouseEventHandlerParams => Unit): Self = this.set("onHeaderClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnHeaderClick: Self = this.set("onHeaderClick", js.undefined)
    
    @scala.inline
    def setOnRowClick(value: /* info */ RowMouseEventHandlerParams => Unit): Self = this.set("onRowClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowClick: Self = this.set("onRowClick", js.undefined)
    
    @scala.inline
    def setOnRowDoubleClick(value: /* info */ RowMouseEventHandlerParams => Unit): Self = this.set("onRowDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowDoubleClick: Self = this.set("onRowDoubleClick", js.undefined)
    
    @scala.inline
    def setOnRowMouseOut(value: /* info */ RowMouseEventHandlerParams => Unit): Self = this.set("onRowMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowMouseOut: Self = this.set("onRowMouseOut", js.undefined)
    
    @scala.inline
    def setOnRowMouseOver(value: /* info */ RowMouseEventHandlerParams => Unit): Self = this.set("onRowMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowMouseOver: Self = this.set("onRowMouseOver", js.undefined)
    
    @scala.inline
    def setOnRowsRendered(value: /* info */ IndexRange with OverscanIndexRange => Unit): Self = this.set("onRowsRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowsRendered: Self = this.set("onRowsRendered", js.undefined)
    
    @scala.inline
    def setOnScrollbarPresenceChange(value: /* params */ ScrollbarPresenceParams => _): Self = this.set("onScrollbarPresenceChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScrollbarPresenceChange: Self = this.set("onScrollbarPresenceChange", js.undefined)
    
    @scala.inline
    def setOnSectionRendered(value: /* params */ SectionRenderedParams => _): Self = this.set("onSectionRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSectionRendered: Self = this.set("onSectionRendered", js.undefined)
    
    @scala.inline
    def setOverscanColumnCount(value: Double): Self = this.set("overscanColumnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverscanColumnCount: Self = this.set("overscanColumnCount", js.undefined)
    
    @scala.inline
    def setOverscanIndicesGetter(value: /* params */ OverscanIndicesGetterParams => OverscanIndices): Self = this.set("overscanIndicesGetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOverscanIndicesGetter: Self = this.set("overscanIndicesGetter", js.undefined)
    
    @scala.inline
    def setOverscanRowCount(value: Double): Self = this.set("overscanRowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverscanRowCount: Self = this.set("overscanRowCount", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setRowClassNameFunction1(value: /* info */ Index => String): Self = this.set("rowClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowClassName(value: String | (js.Function1[/* info */ Index, String])): Self = this.set("rowClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowClassName: Self = this.set("rowClassName", js.undefined)
    
    @scala.inline
    def setRowGetter(value: /* info */ Index => _): Self = this.set("rowGetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRowGetter: Self = this.set("rowGetter", js.undefined)
    
    @scala.inline
    def setRowRenderer(value: /* props */ TableRowProps => ReactNode): Self = this.set("rowRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRowRenderer: Self = this.set("rowRenderer", js.undefined)
    
    @scala.inline
    def setRowStyleFunction1(value: /* info */ Index => CSSProperties): Self = this.set("rowStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowStyle(value: CSSProperties | (js.Function1[/* info */ Index, CSSProperties])): Self = this.set("rowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowStyle: Self = this.set("rowStyle", js.undefined)
    
    @scala.inline
    def setScrollLeft(value: Double): Self = this.set("scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollLeft: Self = this.set("scrollLeft", js.undefined)
    
    @scala.inline
    def setScrollToColumn(value: Double): Self = this.set("scrollToColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollToColumn: Self = this.set("scrollToColumn", js.undefined)
    
    @scala.inline
    def setScrollToIndex(value: Double): Self = this.set("scrollToIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollToIndex: Self = this.set("scrollToIndex", js.undefined)
    
    @scala.inline
    def setScrollToRow(value: Double): Self = this.set("scrollToRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollToRow: Self = this.set("scrollToRow", js.undefined)
    
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollTop: Self = this.set("scrollTop", js.undefined)
    
    @scala.inline
    def setScrollingResetTimeInterval(value: Double): Self = this.set("scrollingResetTimeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollingResetTimeInterval: Self = this.set("scrollingResetTimeInterval", js.undefined)
    
    @scala.inline
    def setSort(value: /* info */ SortBy => Unit): Self = this.set("sort", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setSortBy(value: String): Self = this.set("sortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortBy: Self = this.set("sortBy", js.undefined)
    
    @scala.inline
    def setSortDirection(value: SortDirectionType): Self = this.set("sortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortDirection: Self = this.set("sortDirection", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTabIndexNull: Self = this.set("tabIndex", null)
  }
}
