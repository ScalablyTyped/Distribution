package typings.reactVirtualized

import typings.react.mod.CSSProperties
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.reactVirtualized.anon.ClassNameBottomLeftGrid
import typings.reactVirtualized.anon.ClassNameBottomRightGrid
import typings.reactVirtualized.anon.PartialCellPosition
import typings.reactVirtualized.anon.RowIndex
import typings.reactVirtualized.esGridMod.GridCellProps
import typings.reactVirtualized.esGridMod.GridProps
import typings.reactVirtualized.mod.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMultiGridMod {
  
  @JSImport("react-virtualized/dist/es/MultiGrid", "MultiGrid")
  @js.native
  class MultiGrid protected ()
    extends PureComponent[MultiGridProps, MultiGridState, js.Any] {
    def this(props: MultiGridProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MultiGridProps, context: js.Any) = this()
    
    def forceUpdateGrids(): Unit = js.native
    
    /** See Grid#invalidateCellSizeAfterRender */
    def invalidateCellSizeAfterRender(): Unit = js.native
    def invalidateCellSizeAfterRender(params: PartialCellPosition): Unit = js.native
    
    /** See Grid#measureAllCells */
    def measureAllCells(): Unit = js.native
    
    /** See Grid#recomputeGridSize */
    def recomputeGridSize(): Unit = js.native
    def recomputeGridSize(params: RowIndex): Unit = js.native
  }
  /* static members */
  object MultiGrid {
    
    @JSImport("react-virtualized/dist/es/MultiGrid", "MultiGrid")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/es/MultiGrid", "MultiGrid.defaultProps")
    @js.native
    def defaultProps: ClassNameBottomRightGrid = js.native
    @scala.inline
    def defaultProps_=(x: ClassNameBottomRightGrid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getDerivedStateFromProps(nextProps: MultiGridProps, prevState: MultiGridState): MultiGridState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[MultiGridState | Null]
    
    @JSImport("react-virtualized/dist/es/MultiGrid", "MultiGrid.propTypes")
    @js.native
    def propTypes: ClassNameBottomLeftGrid = js.native
    @scala.inline
    def propTypes_=(x: ClassNameBottomLeftGrid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait MultiGridProps
    extends StObject
       with GridProps {
    
    var classNameBottomLeftGrid: js.UndefOr[String] = js.undefined
    
    var classNameBottomRightGrid: js.UndefOr[String] = js.undefined
    
    var classNameTopLeftGrid: js.UndefOr[String] = js.undefined
    
    var classNameTopRightGrid: js.UndefOr[String] = js.undefined
    
    var enableFixedColumnScroll: js.UndefOr[Boolean] = js.undefined
    
    var enableFixedRowScroll: js.UndefOr[Boolean] = js.undefined
    
    var fixedColumnCount: js.UndefOr[Double] = js.undefined
    
    var fixedRowCount: js.UndefOr[Double] = js.undefined
    
    var styleBottomLeftGrid: js.UndefOr[CSSProperties] = js.undefined
    
    var styleBottomRightGrid: js.UndefOr[CSSProperties] = js.undefined
    
    var styleTopLeftGrid: js.UndefOr[CSSProperties] = js.undefined
    
    var styleTopRightGrid: js.UndefOr[CSSProperties] = js.undefined
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
      width: Double
    ): MultiGridProps = {
      val __obj = js.Dynamic.literal(cellRenderer = js.Any.fromFunction1(cellRenderer), columnCount = columnCount.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiGridProps]
    }
    
    @scala.inline
    implicit class MultiGridPropsMutableBuilder[Self <: MultiGridProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassNameBottomLeftGrid(value: String): Self = StObject.set(x, "classNameBottomLeftGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameBottomLeftGridUndefined: Self = StObject.set(x, "classNameBottomLeftGrid", js.undefined)
      
      @scala.inline
      def setClassNameBottomRightGrid(value: String): Self = StObject.set(x, "classNameBottomRightGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameBottomRightGridUndefined: Self = StObject.set(x, "classNameBottomRightGrid", js.undefined)
      
      @scala.inline
      def setClassNameTopLeftGrid(value: String): Self = StObject.set(x, "classNameTopLeftGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameTopLeftGridUndefined: Self = StObject.set(x, "classNameTopLeftGrid", js.undefined)
      
      @scala.inline
      def setClassNameTopRightGrid(value: String): Self = StObject.set(x, "classNameTopRightGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameTopRightGridUndefined: Self = StObject.set(x, "classNameTopRightGrid", js.undefined)
      
      @scala.inline
      def setEnableFixedColumnScroll(value: Boolean): Self = StObject.set(x, "enableFixedColumnScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableFixedColumnScrollUndefined: Self = StObject.set(x, "enableFixedColumnScroll", js.undefined)
      
      @scala.inline
      def setEnableFixedRowScroll(value: Boolean): Self = StObject.set(x, "enableFixedRowScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableFixedRowScrollUndefined: Self = StObject.set(x, "enableFixedRowScroll", js.undefined)
      
      @scala.inline
      def setFixedColumnCount(value: Double): Self = StObject.set(x, "fixedColumnCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedColumnCountUndefined: Self = StObject.set(x, "fixedColumnCount", js.undefined)
      
      @scala.inline
      def setFixedRowCount(value: Double): Self = StObject.set(x, "fixedRowCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedRowCountUndefined: Self = StObject.set(x, "fixedRowCount", js.undefined)
      
      @scala.inline
      def setStyleBottomLeftGrid(value: CSSProperties): Self = StObject.set(x, "styleBottomLeftGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleBottomLeftGridUndefined: Self = StObject.set(x, "styleBottomLeftGrid", js.undefined)
      
      @scala.inline
      def setStyleBottomRightGrid(value: CSSProperties): Self = StObject.set(x, "styleBottomRightGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleBottomRightGridUndefined: Self = StObject.set(x, "styleBottomRightGrid", js.undefined)
      
      @scala.inline
      def setStyleTopLeftGrid(value: CSSProperties): Self = StObject.set(x, "styleTopLeftGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleTopLeftGridUndefined: Self = StObject.set(x, "styleTopLeftGrid", js.undefined)
      
      @scala.inline
      def setStyleTopRightGrid(value: CSSProperties): Self = StObject.set(x, "styleTopRightGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleTopRightGridUndefined: Self = StObject.set(x, "styleTopRightGrid", js.undefined)
    }
  }
  
  trait MultiGridState extends StObject {
    
    var scrollLeft: Double
    
    var scrollTop: Double
  }
  object MultiGridState {
    
    @scala.inline
    def apply(scrollLeft: Double, scrollTop: Double): MultiGridState = {
      val __obj = js.Dynamic.literal(scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiGridState]
    }
    
    @scala.inline
    implicit class MultiGridStateMutableBuilder[Self <: MultiGridState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    }
  }
}
