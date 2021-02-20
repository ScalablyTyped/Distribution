package typings.reactVirtualized

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactVirtualized.anon.AlignmentIndex
import typings.reactVirtualized.anon.AutoHeight
import typings.reactVirtualized.anon.PartialCellPosition
import typings.reactVirtualized.esCellMeasurerMod.CellMeasurerCache
import typings.reactVirtualized.esCellMeasurerMod.CellPosition
import typings.reactVirtualized.esCellMeasurerMod.MeasuredCellParent
import typings.reactVirtualized.esGridMod.GridCellRangeProps
import typings.reactVirtualized.esGridMod.GridCellRangeRenderer
import typings.reactVirtualized.esGridMod.GridCoreProps
import typings.reactVirtualized.esGridMod.OverscanIndices
import typings.reactVirtualized.esGridMod.OverscanIndicesGetter
import typings.reactVirtualized.esGridMod.OverscanIndicesGetterParams
import typings.reactVirtualized.esGridMod.ScrollParams
import typings.reactVirtualized.esGridMod.ScrollbarPresenceParams
import typings.reactVirtualized.esGridMod.SectionRenderedParams
import typings.reactVirtualized.esScrollSyncMod.OnScrollParams
import typings.reactVirtualized.mod.Alignment
import typings.reactVirtualized.mod.Index
import typings.reactVirtualized.mod.IndexRange
import typings.reactVirtualized.mod.OverscanIndexRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esListMod {
  
  @JSImport("react-virtualized/dist/es/List", "List")
  @js.native
  class List protected ()
    extends PureComponent[ListProps, js.Object, js.Any] {
    def this(props: ListProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ListProps, context: js.Any) = this()
    
    var Grid: js.UndefOr[typings.reactVirtualized.esGridMod.Grid] = js.native
    
    def forceUpdateGrid(): Unit = js.native
    
    /** See Grid#getOffsetForCell */
    def getOffsetForRow(params: AlignmentIndex): Double = js.native
    
    /** CellMeasurer compatibility */
    def invalidateCellSizeAfterRender(hasColumnIndexRowIndex: CellPosition): Unit = js.native
    
    /** See Grid#measureAllCells */
    def measureAllRows(): Unit = js.native
    
    /** CellMeasurer compatibility */
    def recomputeGridSize(): Unit = js.native
    def recomputeGridSize(params: PartialCellPosition): Unit = js.native
    
    /** See Grid#recomputeGridSize */
    def recomputeRowHeights(): Unit = js.native
    def recomputeRowHeights(index: Double): Unit = js.native
    
    /** See Grid#scrollToPosition */
    def scrollToPosition(): Unit = js.native
    def scrollToPosition(scrollTop: Double): Unit = js.native
    
    /** See Grid#scrollToCell */
    def scrollToRow(): Unit = js.native
    def scrollToRow(index: Double): Unit = js.native
  }
  /* static members */
  object List {
    
    @JSImport("react-virtualized/dist/es/List", "List")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/es/List", "List.defaultProps")
    @js.native
    def defaultProps: AutoHeight = js.native
    @scala.inline
    def defaultProps_=(x: AutoHeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined react-virtualized.react-virtualized/dist/es/Grid.GridCoreProps & {  deferredMeasurementCache :react-virtualized.react-virtualized/dist/es/CellMeasurer.CellMeasurerCache | undefined,   autoHeight :boolean | undefined,   className :string | undefined,   estimatedRowSize :number | undefined,   height :number,   noRowsRenderer :(): react.react.<global>.JSX.Element | undefined,   onRowsRendered :(info : react-virtualized.react-virtualized/dist/es/List.RenderedRows): void | undefined,   overscanRowCount :number | undefined,   onScroll :(params : react-virtualized.react-virtualized/dist/es/ScrollSync.OnScrollParams): void | undefined,   overscanIndicesGetter :react-virtualized.react-virtualized/dist/es/Grid.OverscanIndicesGetter | undefined,   rowHeight :number | (info : react-virtualized.react-virtualized.Index): number,   rowRenderer :react-virtualized.react-virtualized/dist/es/List.ListRowRenderer,   rowCount :number,   scrollToAlignment :string | undefined,   scrollToIndex :number | undefined,   scrollTop :number | undefined,   style :react.react.CSSProperties | undefined,   tabIndex :number | null | undefined,   width :number} */
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
    var onRowsRendered: js.UndefOr[js.Function1[/* info */ RenderedRows, Unit]] = js.native
    
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
    var onScroll: (js.UndefOr[js.Function1[/* params */ ScrollParams, _]]) with (js.UndefOr[js.Function1[/* params */ OnScrollParams, Unit]]) = js.native
    
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
  object ListProps {
    
    @scala.inline
    def apply(
      height: Double,
      onScroll: (js.UndefOr[js.Function1[/* params */ ScrollParams, _]]) with (js.UndefOr[js.Function1[/* params */ OnScrollParams, Unit]]),
      rowCount: Double,
      rowHeight: Double | (js.Function1[/* params */ Index, Double]),
      rowRenderer: /* props */ ListRowProps => ReactNode,
      scrollToAlignment: js.UndefOr[Alignment] with js.UndefOr[String],
      width: Double
    ): ListProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], onScroll = onScroll.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], rowRenderer = js.Any.fromFunction1(rowRenderer), scrollToAlignment = scrollToAlignment.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListProps]
    }
    
    @scala.inline
    implicit class ListPropsMutableBuilder[Self <: ListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      @scala.inline
      def setAutoContainerWidth(value: Boolean): Self = StObject.set(x, "autoContainerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoContainerWidthUndefined: Self = StObject.set(x, "autoContainerWidth", js.undefined)
      
      @scala.inline
      def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
      
      @scala.inline
      def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
      
      @scala.inline
      def setCellRangeRenderer(value: /* params */ GridCellRangeProps => js.Array[ReactNode]): Self = StObject.set(x, "cellRangeRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellRangeRendererUndefined: Self = StObject.set(x, "cellRangeRenderer", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContainerProps(value: js.Object): Self = StObject.set(x, "containerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerPropsUndefined: Self = StObject.set(x, "containerProps", js.undefined)
      
      @scala.inline
      def setContainerRole(value: String): Self = StObject.set(x, "containerRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerRoleUndefined: Self = StObject.set(x, "containerRole", js.undefined)
      
      @scala.inline
      def setContainerStyle(value: CSSProperties): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setDeferredMeasurementCache(value: CellMeasurerCache): Self = StObject.set(x, "deferredMeasurementCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferredMeasurementCacheUndefined: Self = StObject.set(x, "deferredMeasurementCache", js.undefined)
      
      @scala.inline
      def setEstimatedColumnSize(value: Double): Self = StObject.set(x, "estimatedColumnSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEstimatedColumnSizeUndefined: Self = StObject.set(x, "estimatedColumnSize", js.undefined)
      
      @scala.inline
      def setEstimatedRowSize(value: Double): Self = StObject.set(x, "estimatedRowSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEstimatedRowSizeUndefined: Self = StObject.set(x, "estimatedRowSize", js.undefined)
      
      @scala.inline
      def setGetScrollbarSize(value: () => Double): Self = StObject.set(x, "getScrollbarSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetScrollbarSizeUndefined: Self = StObject.set(x, "getScrollbarSize", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsScrollingUndefined: Self = StObject.set(x, "isScrolling", js.undefined)
      
      @scala.inline
      def setNoContentRenderer(value: () => ReactNode): Self = StObject.set(x, "noContentRenderer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNoContentRendererUndefined: Self = StObject.set(x, "noContentRenderer", js.undefined)
      
      @scala.inline
      def setNoRowsRenderer(value: () => Element): Self = StObject.set(x, "noRowsRenderer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNoRowsRendererUndefined: Self = StObject.set(x, "noRowsRenderer", js.undefined)
      
      @scala.inline
      def setOnRowsRendered(value: /* info */ RenderedRows => Unit): Self = StObject.set(x, "onRowsRendered", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowsRenderedUndefined: Self = StObject.set(x, "onRowsRendered", js.undefined)
      
      @scala.inline
      def setOnScroll(
        value: (js.UndefOr[js.Function1[/* params */ ScrollParams, _]]) with (js.UndefOr[js.Function1[/* params */ OnScrollParams, Unit]])
      ): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnScrollbarPresenceChange(value: /* params */ ScrollbarPresenceParams => _): Self = StObject.set(x, "onScrollbarPresenceChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollbarPresenceChangeUndefined: Self = StObject.set(x, "onScrollbarPresenceChange", js.undefined)
      
      @scala.inline
      def setOnSectionRendered(value: /* params */ SectionRenderedParams => _): Self = StObject.set(x, "onSectionRendered", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSectionRenderedUndefined: Self = StObject.set(x, "onSectionRendered", js.undefined)
      
      @scala.inline
      def setOverscanColumnCount(value: Double): Self = StObject.set(x, "overscanColumnCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverscanColumnCountUndefined: Self = StObject.set(x, "overscanColumnCount", js.undefined)
      
      @scala.inline
      def setOverscanIndicesGetter(value: /* params */ OverscanIndicesGetterParams => OverscanIndices): Self = StObject.set(x, "overscanIndicesGetter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOverscanIndicesGetterUndefined: Self = StObject.set(x, "overscanIndicesGetter", js.undefined)
      
      @scala.inline
      def setOverscanRowCount(value: Double): Self = StObject.set(x, "overscanRowCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverscanRowCountUndefined: Self = StObject.set(x, "overscanRowCount", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHeight(value: Double | (js.Function1[/* params */ Index, Double])): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHeightFunction1(value: /* params */ Index => Double): Self = StObject.set(x, "rowHeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowRenderer(value: /* props */ ListRowProps => ReactNode): Self = StObject.set(x, "rowRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
      
      @scala.inline
      def setScrollToAlignment(value: js.UndefOr[Alignment] with js.UndefOr[String]): Self = StObject.set(x, "scrollToAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToColumn(value: Double): Self = StObject.set(x, "scrollToColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToColumnUndefined: Self = StObject.set(x, "scrollToColumn", js.undefined)
      
      @scala.inline
      def setScrollToIndex(value: Double): Self = StObject.set(x, "scrollToIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToIndexUndefined: Self = StObject.set(x, "scrollToIndex", js.undefined)
      
      @scala.inline
      def setScrollToRow(value: Double): Self = StObject.set(x, "scrollToRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToRowUndefined: Self = StObject.set(x, "scrollToRow", js.undefined)
      
      @scala.inline
      def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
      
      @scala.inline
      def setScrollingResetTimeInterval(value: Double): Self = StObject.set(x, "scrollingResetTimeInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollingResetTimeIntervalUndefined: Self = StObject.set(x, "scrollingResetTimeInterval", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexNull: Self = StObject.set(x, "tabIndex", null)
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<react-virtualized.react-virtualized/dist/es/Grid.GridCellProps, std.Exclude<keyof react-virtualized.react-virtualized/dist/es/Grid.GridCellProps, 'rowIndex'>> & {  index :react-virtualized.react-virtualized/dist/es/Grid.GridCellProps['rowIndex']} */
  @js.native
  trait ListRowProps extends StObject {
    
    var columnIndex: Double = js.native
    
    var index: Double = js.native
    
    var isScrolling: Boolean = js.native
    
    var isVisible: Boolean = js.native
    
    var key: String = js.native
    
    var parent: (Component[GridCoreProps, js.Object, _]) with MeasuredCellParent = js.native
    
    var style: CSSProperties = js.native
  }
  object ListRowProps {
    
    @scala.inline
    def apply(
      columnIndex: Double,
      index: Double,
      isScrolling: Boolean,
      isVisible: Boolean,
      key: String,
      parent: (Component[GridCoreProps, js.Object, _]) with MeasuredCellParent,
      style: CSSProperties
    ): ListRowProps = {
      val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListRowProps]
    }
    
    @scala.inline
    implicit class ListRowPropsMutableBuilder[Self <: ListRowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: (Component[GridCoreProps, js.Object, _]) with MeasuredCellParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  type ListRowRenderer = js.Function1[/* props */ ListRowProps, ReactNode]
  
  type RenderedRows = OverscanIndexRange with IndexRange
}
