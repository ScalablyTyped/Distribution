package typings.reactVirtualized.esListMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod._Global_.JSX.Element
import typings.reactVirtualized.AnonOverscanStartIndex
import typings.reactVirtualized.esCellMeasurerMod.CellMeasurerCache
import typings.reactVirtualized.esGridMod.GridCellRangeRenderer
import typings.reactVirtualized.esGridMod.OverscanIndicesGetter
import typings.reactVirtualized.esGridMod.ScrollParams
import typings.reactVirtualized.esGridMod.ScrollbarPresenceParams
import typings.reactVirtualized.esGridMod.SectionRenderedParams
import typings.reactVirtualized.esScrollSyncMod.OnScrollParams
import typings.reactVirtualized.mod.Alignment
import typings.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-virtualized.react-virtualized/dist/es/Grid.GridCoreProps & {  deferredMeasurementCache ? :react-virtualized.react-virtualized/dist/es/CellMeasurer.CellMeasurerCache,   autoHeight ? :boolean,   className ? :string,   estimatedRowSize ? :number,   height  :number, noRowsRenderer ? (): react.react._Global_.JSX.Element, onRowsRendered ? (info : {  overscanStartIndex  :number,   overscanStopIndex  :number,   startIndex  :number,   stopIndex  :number}): void,   overscanRowCount ? :number, onScroll ? (params : react-virtualized.react-virtualized/dist/es/ScrollSync.OnScrollParams): void,   overscanIndicesGetter ? :react-virtualized.react-virtualized/dist/es/Grid.OverscanIndicesGetter,   rowHeight  :number | (info : react-virtualized.react-virtualized.Index): number,   rowRenderer  :react-virtualized.react-virtualized/dist/es/List.ListRowRenderer,   rowCount  :number,   scrollToAlignment ? :string,   scrollToIndex ? :number,   scrollTop ? :number,   style ? :react.react.CSSProperties,   tabIndex ? :number | null,   width  :number} */
@js.native
trait ListProps
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
    * Used to estimate the total height of a List before all of its rows have actually been measured.
    * The estimated total height is adjusted as rows are rendered.
    */
  var estimatedRowSize: js.UndefOr[Double] = js.native
  /**
    * Exposed for testing purposes only.
    */
  var getScrollbarSize: js.UndefOr[js.Function0[Double]] = js.native
  /**
    * Height of Grid; this property determines the number of visible (vs virtualized) rows.
    */
  /** Height constraint for list (determines how many actual rows are rendered) */
  var height: Double = js.native
  /**
    * Optional custom id to attach to root Grid element.
    */
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
  /** Optional renderer to be used in place of rows when rowCount is 0 */
  var noRowsRenderer: js.UndefOr[js.Function0[Element]] = js.native
  /**
    * Callback invoked with information about the slice of rows that were just rendered.
    * ({ startIndex, stopIndex }): void
    */
  var onRowsRendered: js.UndefOr[js.Function1[/* info */ AnonOverscanStartIndex, Unit]] = js.native
  /**
    * Callback invoked whenever the scroll offset changes within the inner scrollable region.
    * This callback can be used to sync scrolling between lists, tables, or grids.
    * ({ clientHeight, clientWidth, scrollHeight, scrollLeft, scrollTop, scrollWidth }): void
    */
  var onScroll: js.UndefOr[
    js.Function1[(/* params */ OnScrollParams) | (/* params */ ScrollParams), _ | Unit]
  ] = js.native
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
  /** See Grid#overscanIndicesGetter */
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
    * Number of rows in grid.
    */
  /** Number of rows in list. */
  var rowCount: Double = js.native
  /**
    * Either a fixed row height (number) or a function that returns the height of a row given its index.
    * Should implement the following interface: ({ index: number }): number
    */
  /**
    * Either a fixed row height (number) or a function that returns the height of a row given its index.
    * ({ index: number }): number
    */
  var rowHeight: Double | (js.Function1[/* params */ Index, Double]) = js.native
  /** Responsible for rendering a row given an index; ({ index: number }): node */
  var rowRenderer: ListRowRenderer = js.native
  /** Horizontal offset. */
  var scrollLeft: js.UndefOr[Double] = js.native
  /**
    * Controls scroll-to-cell behavior of the Grid.
    * The default ("auto") scrolls the least amount possible to ensure that the specified cell is fully visible.
    * Use "start" to align cells to the top/left of the Grid and "end" to align bottom/right.
    */
  /** See Grid#scrollToAlignment */
  var scrollToAlignment: js.UndefOr[Alignment with String] = js.native
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
  /** Optional inline style */
  var style: js.UndefOr[CSSProperties] = js.native
  /** Tab index for focus */
  var tabIndex: js.UndefOr[Double | Null] = js.native
  /**
    * Width of Grid; this property determines the number of visible (vs virtualized) columns.
    */
  /** Width of list */
  var width: Double = js.native
}

