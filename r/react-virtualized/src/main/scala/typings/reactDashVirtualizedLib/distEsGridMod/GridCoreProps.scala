package typings
package reactDashVirtualizedLib.distEsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GridCoreProps
  extends /**
     * PLEASE NOTE
     * The [key: string]: any; line is here on purpose
     * This is due to the need of force re-render of PureComponent
     * Check the following link if you want to know more
     * https://github.com/bvaughn/react-virtualized#pass-thru-props
     */
/* key */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  var `aria-label`: js.UndefOr[java.lang.String] = js.undefined
  var `aria-readonly`: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Set the width of the inner scrollable container to 'auto'.
       * This is useful for single-column Grids to ensure that the column doesn't extend below a vertical scrollbar.
       */
  var autoContainerWidth: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Removes fixed height from the scrollingContainer so that the total height of rows can stretch the window.
       * Intended for use with WindowScroller
       */
  var autoHeight: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Removes fixed width from the scrollingContainer so that the total width of rows can stretch the window.
       * Intended for use with WindowScroller
       */
  var autoWidth: js.UndefOr[scala.Boolean] = js.undefined
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
  var cellRangeRenderer: js.UndefOr[GridCellRangeRenderer] = js.undefined
  /**
       * Optional custom CSS class name to attach to root Grid element.
       */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Unfiltered props for the Grid container. */
  var containerProps: js.UndefOr[js.Object] = js.undefined
  /** ARIA role for the cell-container.  */
  var containerRole: js.UndefOr[java.lang.String] = js.undefined
  /** Optional inline style applied to inner cell-container */
  var containerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
       * If CellMeasurer is used to measure this Grid's children, this should be a pointer to its CellMeasurerCache.
       * A shared CellMeasurerCache reference enables Grid and CellMeasurer to share measurement data.
       */
  var deferredMeasurementCache: js.UndefOr[reactDashVirtualizedLib.distEsCellMeasurerMod.CellMeasurerCache] = js.undefined
  /**
       * Used to estimate the total width of a Grid before all of its columns have actually been measured.
       * The estimated total width is adjusted as columns are rendered.
       */
  var estimatedColumnSize: js.UndefOr[scala.Double] = js.undefined
  /**
       * Used to estimate the total height of a Grid before all of its rows have actually been measured.
       * The estimated total height is adjusted as rows are rendered.
       */
  var estimatedRowSize: js.UndefOr[scala.Double] = js.undefined
  /**
       * Exposed for testing purposes only.
       */
  var getScrollbarSize: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /**
       * Height of Grid; this property determines the number of visible (vs virtualized) rows.
       */
  var height: scala.Double
  /**
       * Optional custom id to attach to root Grid element.
       */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Override internal is-scrolling state tracking.
       * This property is primarily intended for use with the WindowScroller component.
       */
  var isScrolling: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Optional renderer to be used in place of rows when either :rowCount or :columnCount is 0.
       */
  var noContentRenderer: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  /**
       * Callback invoked whenever the scroll offset changes within the inner scrollable region.
       * This callback can be used to sync scrolling between lists, tables, or grids.
       * ({ clientHeight, clientWidth, scrollHeight, scrollLeft, scrollTop, scrollWidth }): void
       */
  var onScroll: js.UndefOr[js.Function1[/* params */ ScrollParams, _]] = js.undefined
  /**
       * Called whenever a horizontal or vertical scrollbar is added or removed.
       * ({ horizontal: boolean, size: number, vertical: boolean }): void
       */
  var onScrollbarPresenceChange: js.UndefOr[js.Function1[/* params */ ScrollbarPresenceParams, _]] = js.undefined
  /**
       * Callback invoked with information about the section of the Grid that was just rendered.
       * ({ columnStartIndex, columnStopIndex, rowStartIndex, rowStopIndex }): void
       */
  var onSectionRendered: js.UndefOr[js.Function1[/* params */ SectionRenderedParams, _]] = js.undefined
  /**
       * Number of columns to render before/after the visible section of the grid.
       * These columns can help for smoother scrolling on touch devices or browsers that send scroll events infrequently.
       */
  var overscanColumnCount: js.UndefOr[scala.Double] = js.undefined
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
  var overscanIndicesGetter: js.UndefOr[OverscanIndicesGetter] = js.undefined
  /**
       * Number of rows to render above/below the visible section of the grid.
       * These rows can help for smoother scrolling on touch devices or browsers that send scroll events infrequently.
       */
  var overscanRowCount: js.UndefOr[scala.Double] = js.undefined
  /**
       * ARIA role for the grid element.
       */
  var role: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Number of rows in grid.
       */
  var rowCount: scala.Double
  /**
       * Either a fixed row height (number) or a function that returns the height of a row given its index.
       * Should implement the following interface: ({ index: number }): number
       */
  var rowHeight: scala.Double | (js.Function1[/* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, scala.Double])
  /** Horizontal offset. */
  var scrollLeft: js.UndefOr[scala.Double] = js.undefined
  /**
       * Controls scroll-to-cell behavior of the Grid.
       * The default ("auto") scrolls the least amount possible to ensure that the specified cell is fully visible.
       * Use "start" to align cells to the top/left of the Grid and "end" to align bottom/right.
       */
  var scrollToAlignment: js.UndefOr[reactDashVirtualizedLib.reactDashVirtualizedMod.Alignment] = js.undefined
  /**
       * Column index to ensure visible (by forcefully scrolling if necessary)
       */
  var scrollToColumn: js.UndefOr[scala.Double] = js.undefined
  /**
       * Row index to ensure visible (by forcefully scrolling if necessary)
       */
  var scrollToRow: js.UndefOr[scala.Double] = js.undefined
  /** Vertical offset. */
  var scrollTop: js.UndefOr[scala.Double] = js.undefined
  /** Wait this amount of time after the last scroll event before resetting Grid `pointer-events`. */
  var scrollingResetTimeInterval: js.UndefOr[scala.Double] = js.undefined
  /** Optional inline style */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /** Tab index for focus */
  var tabIndex: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
       * Width of Grid; this property determines the number of visible (vs virtualized) columns.
       */
  var width: scala.Double
}

