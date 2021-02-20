package typings.reactVirtualized

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.reactVirtualized.anon.ClientHeight
import typings.reactVirtualized.anon.KeyMapper
import typings.reactVirtualized.anon.Reset
import typings.reactVirtualized.anon.RowIndexNumber
import typings.reactVirtualized.esCellMeasurerMod.CellMeasurerCacheInterface
import typings.reactVirtualized.esCellMeasurerMod.MeasuredCellParent
import typings.reactVirtualized.mod.IndexRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMasonryMod {
  
  @JSImport("react-virtualized/dist/es/Masonry", "DEFAULT_SCROLLING_RESET_TIME_INTERVAL")
  @js.native
  val DEFAULT_SCROLLING_RESET_TIME_INTERVAL: /* 150 */ Double = js.native
  
  @JSImport("react-virtualized/dist/es/Masonry", "Masonry")
  @js.native
  class Masonry protected ()
    extends PureComponent[MasonryProps, MasonryState, js.Any] {
    def this(props: MasonryProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MasonryProps, context: js.Any) = this()
    
    def clearCellPositions(): Unit = js.native
    
    // HACK This method signature was intended for Grid
    def invalidateCellSizeAfterRender(params: RowIndexNumber): Unit = js.native
    
    def recomputeCellPositions(): Unit = js.native
  }
  /* static members */
  object Masonry {
    
    @JSImport("react-virtualized/dist/es/Masonry", "Masonry")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/es/Masonry", "Masonry.defaultProps")
    @js.native
    def defaultProps: KeyMapper = js.native
    @scala.inline
    def defaultProps_=(x: KeyMapper): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-virtualized/dist/es/Masonry", "Masonry.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: MasonryProps, prevState: MasonryState): MasonryState | Null = js.native
  }
  
  @JSImport("react-virtualized/dist/es/Masonry", "createCellPositioner")
  @js.native
  def createCellPositioner(params: createCellPositionerParams): Positioner = js.native
  
  type CellRenderer = js.Function1[/* props */ MasonryCellProps, ReactNode]
  
  @js.native
  trait MasonryCellProps extends StObject {
    
    var index: Double = js.native
    
    var isScrolling: Boolean = js.native
    
    var key: Key = js.native
    
    var parent: MeasuredCellParent = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object MasonryCellProps {
    
    @scala.inline
    def apply(index: Double, isScrolling: Boolean, key: Key, parent: MeasuredCellParent): MasonryCellProps = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[MasonryCellProps]
    }
    
    @scala.inline
    implicit class MasonryCellPropsMutableBuilder[Self <: MasonryCellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: MeasuredCellParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait MasonryProps
    extends /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] {
    
    var autoHeight: Boolean = js.native
    
    var cellCount: Double = js.native
    
    var cellMeasurerCache: CellMeasurerCacheInterface = js.native
    
    var cellPositioner: Positioner = js.native
    
    var cellRenderer: CellRenderer = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var height: Double = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var keyMapper: js.UndefOr[typings.reactVirtualized.esCellMeasurerMod.KeyMapper] = js.native
    
    var onCellsRendered: js.UndefOr[OnCellsRenderedCallback] = js.native
    
    var onScroll: js.UndefOr[OnScrollCallback] = js.native
    
    var overscanByPixels: js.UndefOr[Double] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var scrollingResetTimeInterval: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tabIndex: js.UndefOr[Double | Null] = js.native
    
    var width: Double = js.native
  }
  object MasonryProps {
    
    @scala.inline
    def apply(
      autoHeight: Boolean,
      cellCount: Double,
      cellMeasurerCache: CellMeasurerCacheInterface,
      cellPositioner: Positioner,
      cellRenderer: /* props */ MasonryCellProps => ReactNode,
      height: Double,
      width: Double
    ): MasonryProps = {
      val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], cellCount = cellCount.asInstanceOf[js.Any], cellMeasurerCache = cellMeasurerCache.asInstanceOf[js.Any], cellPositioner = cellPositioner.asInstanceOf[js.Any], cellRenderer = js.Any.fromFunction1(cellRenderer), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MasonryProps]
    }
    
    @scala.inline
    implicit class MasonryPropsMutableBuilder[Self <: MasonryProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellCount(value: Double): Self = StObject.set(x, "cellCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellMeasurerCache(value: CellMeasurerCacheInterface): Self = StObject.set(x, "cellMeasurerCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellPositioner(value: Positioner): Self = StObject.set(x, "cellPositioner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellRenderer(value: /* props */ MasonryCellProps => ReactNode): Self = StObject.set(x, "cellRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setKeyMapper(value: (/* rowIndex */ Double, /* columnIndex */ Double) => js.Any): Self = StObject.set(x, "keyMapper", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyMapperUndefined: Self = StObject.set(x, "keyMapper", js.undefined)
      
      @scala.inline
      def setOnCellsRendered(value: /* params */ IndexRange => Unit): Self = StObject.set(x, "onCellsRendered", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCellsRenderedUndefined: Self = StObject.set(x, "onCellsRendered", js.undefined)
      
      @scala.inline
      def setOnScroll(value: /* params */ ClientHeight => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOverscanByPixels(value: Double): Self = StObject.set(x, "overscanByPixels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverscanByPixelsUndefined: Self = StObject.set(x, "overscanByPixels", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
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
  
  @js.native
  trait MasonryState extends StObject {
    
    var isScrolling: Boolean = js.native
    
    var scrollTop: Double = js.native
  }
  object MasonryState {
    
    @scala.inline
    def apply(isScrolling: Boolean, scrollTop: Double): MasonryState = {
      val __obj = js.Dynamic.literal(isScrolling = isScrolling.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[MasonryState]
    }
    
    @scala.inline
    implicit class MasonryStateMutableBuilder[Self <: MasonryState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    }
  }
  
  type OnCellsRenderedCallback = js.Function1[/* params */ IndexRange, Unit]
  
  type OnScrollCallback = js.Function1[/* params */ ClientHeight, Unit]
  
  @js.native
  trait Position extends StObject {
    
    var left: Double = js.native
    
    var top: Double = js.native
  }
  object Position {
    
    @scala.inline
    def apply(left: Double, top: Double): Position = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  type Positioner = (js.Function1[/* index */ Double, Position]) with Reset
  
  @js.native
  trait createCellPositionerParams extends StObject {
    
    var cellMeasurerCache: CellMeasurerCacheInterface = js.native
    
    var columnCount: Double = js.native
    
    var columnWidth: Double = js.native
    
    var spacer: js.UndefOr[Double] = js.native
  }
  object createCellPositionerParams {
    
    @scala.inline
    def apply(cellMeasurerCache: CellMeasurerCacheInterface, columnCount: Double, columnWidth: Double): createCellPositionerParams = {
      val __obj = js.Dynamic.literal(cellMeasurerCache = cellMeasurerCache.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[createCellPositionerParams]
    }
    
    @scala.inline
    implicit class createCellPositionerParamsMutableBuilder[Self <: createCellPositionerParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellMeasurerCache(value: CellMeasurerCacheInterface): Self = StObject.set(x, "cellMeasurerCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacer(value: Double): Self = StObject.set(x, "spacer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacerUndefined: Self = StObject.set(x, "spacer", js.undefined)
    }
  }
  
  type emptyObject = js.Object
  
  type identity = js.Function1[/* value */ js.Any, js.Any]
  
  type noop = js.Function0[Unit]
  
  @js.native
  trait resetParams extends StObject {
    
    var columnCount: Double = js.native
    
    var columnWidth: Double = js.native
    
    var spacer: js.UndefOr[Double] = js.native
  }
  object resetParams {
    
    @scala.inline
    def apply(columnCount: Double, columnWidth: Double): resetParams = {
      val __obj = js.Dynamic.literal(columnCount = columnCount.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[resetParams]
    }
    
    @scala.inline
    implicit class resetParamsMutableBuilder[Self <: resetParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacer(value: Double): Self = StObject.set(x, "spacer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacerUndefined: Self = StObject.set(x, "spacer", js.undefined)
    }
  }
}
