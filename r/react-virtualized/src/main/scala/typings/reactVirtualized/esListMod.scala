package typings.reactVirtualized

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactVirtualized.anon.AlignmentIndex
import typings.reactVirtualized.anon.AutoHeight
import typings.reactVirtualized.anon.PartialCellPosition
import typings.reactVirtualized.esCellMeasurerMod.CellPosition
import typings.reactVirtualized.esCellMeasurerMod.MeasuredCellParent
import typings.reactVirtualized.esGridMod.GridCoreProps
import typings.reactVirtualized.esScrollSyncMod.OnScrollParams
import typings.reactVirtualized.mod.Index
import typings.reactVirtualized.mod.IndexRange
import typings.reactVirtualized.mod.OverscanIndexRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  trait ListProps
    extends StObject
       with GridCoreProps {
    
    /** Optional renderer to be used in place of rows when rowCount is 0 */
    var noRowsRenderer: js.UndefOr[js.Function0[Element]] = js.undefined
    
    /**
      * Callback invoked with information about the slice of rows that were just rendered.
      * ({ startIndex, stopIndex }): void
      */
    var onRowsRendered: js.UndefOr[js.Function1[/* info */ RenderedRows, Unit]] = js.undefined
    
    /**
      * Callback invoked whenever the scroll offset changes within the inner scrollable region.
      * This callback can be used to sync scrolling between lists, tables, or grids.
      * ({ clientHeight, scrollHeight, scrollTop }): void
      */
    @JSName("onScroll")
    var onScroll_ListProps: js.UndefOr[js.Function1[/* params */ OnScrollParams, Unit]] = js.undefined
    
    /** Responsible for rendering a row given an index; ({ index: number }): node */
    var rowRenderer: ListRowRenderer
    
    /** See Grid#scrollToAlignment */
    @JSName("scrollToAlignment")
    var scrollToAlignment_ListProps: js.UndefOr[String] = js.undefined
    
    /** Row index to ensure visible (by forcefully scrolling if necessary) */
    var scrollToIndex: js.UndefOr[Double] = js.undefined
  }
  object ListProps {
    
    @scala.inline
    def apply(
      height: Double,
      rowCount: Double,
      rowHeight: Double | (js.Function1[/* params */ Index, Double]),
      rowRenderer: /* props */ ListRowProps => ReactNode,
      width: Double
    ): ListProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], rowRenderer = js.Any.fromFunction1(rowRenderer), width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListProps]
    }
    
    @scala.inline
    implicit class ListPropsMutableBuilder[Self <: ListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoRowsRenderer(value: () => Element): Self = StObject.set(x, "noRowsRenderer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNoRowsRendererUndefined: Self = StObject.set(x, "noRowsRenderer", js.undefined)
      
      @scala.inline
      def setOnRowsRendered(value: /* info */ RenderedRows => Unit): Self = StObject.set(x, "onRowsRendered", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowsRenderedUndefined: Self = StObject.set(x, "onRowsRendered", js.undefined)
      
      @scala.inline
      def setOnScroll(value: /* params */ OnScrollParams => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setRowRenderer(value: /* props */ ListRowProps => ReactNode): Self = StObject.set(x, "rowRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollToAlignment(value: String): Self = StObject.set(x, "scrollToAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToAlignmentUndefined: Self = StObject.set(x, "scrollToAlignment", js.undefined)
      
      @scala.inline
      def setScrollToIndex(value: Double): Self = StObject.set(x, "scrollToIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToIndexUndefined: Self = StObject.set(x, "scrollToIndex", js.undefined)
    }
  }
  
  /* Inlined std.Pick<react-virtualized.react-virtualized/dist/es/Grid.GridCellProps, std.Exclude<keyof react-virtualized.react-virtualized/dist/es/Grid.GridCellProps, 'rowIndex'>> & {  index :react-virtualized.react-virtualized/dist/es/Grid.GridCellProps['rowIndex']} */
  trait ListRowProps extends StObject {
    
    var columnIndex: Double
    
    var index: Double
    
    var isScrolling: Boolean
    
    var isVisible: Boolean
    
    var key: String
    
    var parent: (Component[GridCoreProps, js.Object, js.Any]) & MeasuredCellParent
    
    var style: CSSProperties
  }
  object ListRowProps {
    
    @scala.inline
    def apply(
      columnIndex: Double,
      index: Double,
      isScrolling: Boolean,
      isVisible: Boolean,
      key: String,
      parent: (Component[GridCoreProps, js.Object, js.Any]) & MeasuredCellParent,
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
      def setParent(value: (Component[GridCoreProps, js.Object, js.Any]) & MeasuredCellParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  type ListRowRenderer = js.Function1[/* props */ ListRowProps, ReactNode]
  
  trait RenderedRows
    extends StObject
       with OverscanIndexRange
       with IndexRange
  object RenderedRows {
    
    @scala.inline
    def apply(overscanStartIndex: Double, overscanStopIndex: Double, startIndex: Double, stopIndex: Double): RenderedRows = {
      val __obj = js.Dynamic.literal(overscanStartIndex = overscanStartIndex.asInstanceOf[js.Any], overscanStopIndex = overscanStopIndex.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], stopIndex = stopIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderedRows]
    }
  }
}
