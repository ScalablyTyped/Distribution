package typings.reactVirtualized.esMultiGridMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.reactVirtualized.esCellMeasurerMod.CellMeasurerCache
import typings.reactVirtualized.esGridMod.GridCellProps
import typings.reactVirtualized.esGridMod.GridCellRangeProps
import typings.reactVirtualized.esGridMod.GridCellRangeRenderer
import typings.reactVirtualized.esGridMod.GridCellRenderer
import typings.reactVirtualized.esGridMod.OverscanIndices
import typings.reactVirtualized.esGridMod.OverscanIndicesGetter
import typings.reactVirtualized.esGridMod.OverscanIndicesGetterParams
import typings.reactVirtualized.esGridMod.ScrollParams
import typings.reactVirtualized.esGridMod.ScrollbarPresenceParams
import typings.reactVirtualized.esGridMod.SectionRenderedParams
import typings.reactVirtualized.mod.Alignment
import typings.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  classNameBottomLeftGrid ? :string,   classNameBottomRightGrid ? :string,   classNameTopLeftGrid ? :string,   classNameTopRightGrid ? :string,   enableFixedColumnScroll ? :boolean,   enableFixedRowScroll ? :boolean,   fixedColumnCount ? :number,   fixedRowCount ? :number,   style ? :react.react.CSSProperties,   styleBottomLeftGrid ? :react.react.CSSProperties,   styleBottomRightGrid ? :react.react.CSSProperties,   styleTopLeftGrid ? :react.react.CSSProperties,   styleTopRightGrid ? :react.react.CSSProperties} & react-virtualized.react-virtualized/dist/es/Grid.GridProps */
trait MultiGridProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ StringDictionary[js.Any] {
  var `aria-label`: js.UndefOr[String] = js.undefined
  var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the width of the inner scrollable container to 'auto'.
    * This is useful for single-column Grids to ensure that the column doesn't extend below a vertical scrollbar.
    */
  var autoContainerWidth: js.UndefOr[Boolean] = js.undefined
  /**
    * Removes fixed height from the scrollingContainer so that the total height of rows can stretch the window.
    * Intended for use with WindowScroller
    */
  var autoHeight: js.UndefOr[Boolean] = js.undefined
  /**
    * Removes fixed width from the scrollingContainer so that the total width of rows can stretch the window.
    * Intended for use with WindowScroller
    */
  var autoWidth: js.UndefOr[Boolean] = js.undefined
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
    * Responsible for rendering a cell given an row and column index.
    * Should implement the following interface: ({ columnIndex: number, rowIndex: number }): PropTypes.node
    */
  var cellRenderer: GridCellRenderer
  /**
    * Optional custom CSS class name to attach to root Grid element.
    */
  var className: js.UndefOr[String] = js.undefined
  var classNameBottomLeftGrid: js.UndefOr[String] = js.undefined
  var classNameBottomRightGrid: js.UndefOr[String] = js.undefined
  var classNameTopLeftGrid: js.UndefOr[String] = js.undefined
  var classNameTopRightGrid: js.UndefOr[String] = js.undefined
  /**
    * Number of columns in grid.
    */
  var columnCount: Double
  /**
    * Either a fixed column width (number) or a function that returns the width of a column given its index.
    * Should implement the following interface: (index: number): number
    */
  var columnWidth: Double | (js.Function1[/* params */ Index, Double])
  /** Unfiltered props for the Grid container. */
  var containerProps: js.UndefOr[js.Object] = js.undefined
  /** ARIA role for the cell-container.  */
  var containerRole: js.UndefOr[String] = js.undefined
  /** Optional inline style applied to inner cell-container */
  var containerStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
    * If CellMeasurer is used to measure this Grid's children, this should be a pointer to its CellMeasurerCache.
    * A shared CellMeasurerCache reference enables Grid and CellMeasurer to share measurement data.
    */
  var deferredMeasurementCache: js.UndefOr[CellMeasurerCache] = js.undefined
  var enableFixedColumnScroll: js.UndefOr[Boolean] = js.undefined
  var enableFixedRowScroll: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to estimate the total width of a Grid before all of its columns have actually been measured.
    * The estimated total width is adjusted as columns are rendered.
    */
  var estimatedColumnSize: js.UndefOr[Double] = js.undefined
  /**
    * Used to estimate the total height of a Grid before all of its rows have actually been measured.
    * The estimated total height is adjusted as rows are rendered.
    */
  var estimatedRowSize: js.UndefOr[Double] = js.undefined
  var fixedColumnCount: js.UndefOr[Double] = js.undefined
  var fixedRowCount: js.UndefOr[Double] = js.undefined
  /**
    * Exposed for testing purposes only.
    */
  var getScrollbarSize: js.UndefOr[js.Function0[Double]] = js.undefined
  /**
    * Height of Grid; this property determines the number of visible (vs virtualized) rows.
    */
  var height: Double
  /**
    * Optional custom id to attach to root Grid element.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Override internal is-scrolling state tracking.
    * This property is primarily intended for use with the WindowScroller component.
    */
  var isScrolling: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional renderer to be used in place of rows when either :rowCount or :columnCount is 0.
    */
  var noContentRenderer: js.UndefOr[js.Function0[ReactNode]] = js.undefined
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
  var overscanColumnCount: js.UndefOr[Double] = js.undefined
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
  var overscanRowCount: js.UndefOr[Double] = js.undefined
  /**
    * ARIA role for the grid element.
    */
  var role: js.UndefOr[String] = js.undefined
  /**
    * Number of rows in grid.
    */
  var rowCount: Double
  /**
    * Either a fixed row height (number) or a function that returns the height of a row given its index.
    * Should implement the following interface: ({ index: number }): number
    */
  var rowHeight: Double | (js.Function1[/* params */ Index, Double])
  /** Horizontal offset. */
  var scrollLeft: js.UndefOr[Double] = js.undefined
  /**
    * Controls scroll-to-cell behavior of the Grid.
    * The default ("auto") scrolls the least amount possible to ensure that the specified cell is fully visible.
    * Use "start" to align cells to the top/left of the Grid and "end" to align bottom/right.
    */
  var scrollToAlignment: js.UndefOr[Alignment] = js.undefined
  /**
    * Column index to ensure visible (by forcefully scrolling if necessary)
    */
  var scrollToColumn: js.UndefOr[Double] = js.undefined
  /**
    * Row index to ensure visible (by forcefully scrolling if necessary)
    */
  var scrollToRow: js.UndefOr[Double] = js.undefined
  /** Vertical offset. */
  var scrollTop: js.UndefOr[Double] = js.undefined
  /** Wait this amount of time after the last scroll event before resetting Grid `pointer-events`. */
  var scrollingResetTimeInterval: js.UndefOr[Double] = js.undefined
  /** Optional inline style */
  var style: js.UndefOr[CSSProperties] = js.undefined
  var styleBottomLeftGrid: js.UndefOr[CSSProperties] = js.undefined
  var styleBottomRightGrid: js.UndefOr[CSSProperties] = js.undefined
  var styleTopLeftGrid: js.UndefOr[CSSProperties] = js.undefined
  var styleTopRightGrid: js.UndefOr[CSSProperties] = js.undefined
  /** Tab index for focus */
  var tabIndex: js.UndefOr[Double | Null] = js.undefined
  /**
    * Width of Grid; this property determines the number of visible (vs virtualized) columns.
    */
  var width: Double
}

object MultiGridProps {
  @scala.inline
  def apply(
    cellRenderer: /* props */ GridCellProps => ReactNode,
    columnCount: Double,
    columnWidth: Double | (js.Function1[/* params */ Index, Double]),
    height: Double,
    rowCount: Double,
    rowHeight: Double | (js.Function1[/* params */ Index, Double]),
    width: Double,
    StringDictionary: /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] = null,
    `aria-label`: String = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    autoContainerWidth: js.UndefOr[Boolean] = js.undefined,
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    cellRangeRenderer: /* params */ GridCellRangeProps => js.Array[ReactNode] = null,
    className: String = null,
    classNameBottomLeftGrid: String = null,
    classNameBottomRightGrid: String = null,
    classNameTopLeftGrid: String = null,
    classNameTopRightGrid: String = null,
    containerProps: js.Object = null,
    containerRole: String = null,
    containerStyle: CSSProperties = null,
    deferredMeasurementCache: CellMeasurerCache = null,
    enableFixedColumnScroll: js.UndefOr[Boolean] = js.undefined,
    enableFixedRowScroll: js.UndefOr[Boolean] = js.undefined,
    estimatedColumnSize: Int | Double = null,
    estimatedRowSize: Int | Double = null,
    fixedColumnCount: Int | Double = null,
    fixedRowCount: Int | Double = null,
    getScrollbarSize: () => Double = null,
    id: String = null,
    isScrolling: js.UndefOr[Boolean] = js.undefined,
    noContentRenderer: () => ReactNode = null,
    onScroll: /* params */ ScrollParams => _ = null,
    onScrollbarPresenceChange: /* params */ ScrollbarPresenceParams => _ = null,
    onSectionRendered: /* params */ SectionRenderedParams => _ = null,
    overscanColumnCount: Int | Double = null,
    overscanIndicesGetter: /* params */ OverscanIndicesGetterParams => OverscanIndices = null,
    overscanRowCount: Int | Double = null,
    role: String = null,
    scrollLeft: Int | Double = null,
    scrollToAlignment: Alignment = null,
    scrollToColumn: Int | Double = null,
    scrollToRow: Int | Double = null,
    scrollTop: Int | Double = null,
    scrollingResetTimeInterval: Int | Double = null,
    style: CSSProperties = null,
    styleBottomLeftGrid: CSSProperties = null,
    styleBottomRightGrid: CSSProperties = null,
    styleTopLeftGrid: CSSProperties = null,
    styleTopRightGrid: CSSProperties = null,
    tabIndex: Int | Double = null
  ): MultiGridProps = {
    val __obj = js.Dynamic.literal(cellRenderer = js.Any.fromFunction1(cellRenderer), columnCount = columnCount.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (!js.isUndefined(autoContainerWidth)) __obj.updateDynamic("autoContainerWidth")(autoContainerWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.asInstanceOf[js.Any])
    if (cellRangeRenderer != null) __obj.updateDynamic("cellRangeRenderer")(js.Any.fromFunction1(cellRangeRenderer))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classNameBottomLeftGrid != null) __obj.updateDynamic("classNameBottomLeftGrid")(classNameBottomLeftGrid.asInstanceOf[js.Any])
    if (classNameBottomRightGrid != null) __obj.updateDynamic("classNameBottomRightGrid")(classNameBottomRightGrid.asInstanceOf[js.Any])
    if (classNameTopLeftGrid != null) __obj.updateDynamic("classNameTopLeftGrid")(classNameTopLeftGrid.asInstanceOf[js.Any])
    if (classNameTopRightGrid != null) __obj.updateDynamic("classNameTopRightGrid")(classNameTopRightGrid.asInstanceOf[js.Any])
    if (containerProps != null) __obj.updateDynamic("containerProps")(containerProps.asInstanceOf[js.Any])
    if (containerRole != null) __obj.updateDynamic("containerRole")(containerRole.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (deferredMeasurementCache != null) __obj.updateDynamic("deferredMeasurementCache")(deferredMeasurementCache.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFixedColumnScroll)) __obj.updateDynamic("enableFixedColumnScroll")(enableFixedColumnScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFixedRowScroll)) __obj.updateDynamic("enableFixedRowScroll")(enableFixedRowScroll.asInstanceOf[js.Any])
    if (estimatedColumnSize != null) __obj.updateDynamic("estimatedColumnSize")(estimatedColumnSize.asInstanceOf[js.Any])
    if (estimatedRowSize != null) __obj.updateDynamic("estimatedRowSize")(estimatedRowSize.asInstanceOf[js.Any])
    if (fixedColumnCount != null) __obj.updateDynamic("fixedColumnCount")(fixedColumnCount.asInstanceOf[js.Any])
    if (fixedRowCount != null) __obj.updateDynamic("fixedRowCount")(fixedRowCount.asInstanceOf[js.Any])
    if (getScrollbarSize != null) __obj.updateDynamic("getScrollbarSize")(js.Any.fromFunction0(getScrollbarSize))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isScrolling)) __obj.updateDynamic("isScrolling")(isScrolling.asInstanceOf[js.Any])
    if (noContentRenderer != null) __obj.updateDynamic("noContentRenderer")(js.Any.fromFunction0(noContentRenderer))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onScrollbarPresenceChange != null) __obj.updateDynamic("onScrollbarPresenceChange")(js.Any.fromFunction1(onScrollbarPresenceChange))
    if (onSectionRendered != null) __obj.updateDynamic("onSectionRendered")(js.Any.fromFunction1(onSectionRendered))
    if (overscanColumnCount != null) __obj.updateDynamic("overscanColumnCount")(overscanColumnCount.asInstanceOf[js.Any])
    if (overscanIndicesGetter != null) __obj.updateDynamic("overscanIndicesGetter")(js.Any.fromFunction1(overscanIndicesGetter))
    if (overscanRowCount != null) __obj.updateDynamic("overscanRowCount")(overscanRowCount.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollToAlignment != null) __obj.updateDynamic("scrollToAlignment")(scrollToAlignment.asInstanceOf[js.Any])
    if (scrollToColumn != null) __obj.updateDynamic("scrollToColumn")(scrollToColumn.asInstanceOf[js.Any])
    if (scrollToRow != null) __obj.updateDynamic("scrollToRow")(scrollToRow.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (scrollingResetTimeInterval != null) __obj.updateDynamic("scrollingResetTimeInterval")(scrollingResetTimeInterval.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styleBottomLeftGrid != null) __obj.updateDynamic("styleBottomLeftGrid")(styleBottomLeftGrid.asInstanceOf[js.Any])
    if (styleBottomRightGrid != null) __obj.updateDynamic("styleBottomRightGrid")(styleBottomRightGrid.asInstanceOf[js.Any])
    if (styleTopLeftGrid != null) __obj.updateDynamic("styleTopLeftGrid")(styleTopLeftGrid.asInstanceOf[js.Any])
    if (styleTopRightGrid != null) __obj.updateDynamic("styleTopRightGrid")(styleTopRightGrid.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiGridProps]
  }
}

