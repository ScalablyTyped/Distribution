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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMasonryMod {
  
  @JSImport("react-virtualized/dist/es/Masonry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-virtualized/dist/es/Masonry", JSImport.Default)
  @js.native
  open class default protected () extends Masonry {
    def this(props: MasonryProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MasonryProps, context: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-virtualized/dist/es/Masonry", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/es/Masonry", "default.defaultProps")
    @js.native
    def defaultProps: KeyMapper = js.native
    inline def defaultProps_=(x: KeyMapper): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: MasonryProps, prevState: MasonryState): MasonryState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[MasonryState | Null]
  }
  
  @JSImport("react-virtualized/dist/es/Masonry", "DEFAULT_SCROLLING_RESET_TIME_INTERVAL")
  @js.native
  val DEFAULT_SCROLLING_RESET_TIME_INTERVAL: /* 150 */ Double = js.native
  
  @JSImport("react-virtualized/dist/es/Masonry", "Masonry")
  @js.native
  open class Masonry protected () extends PureComponent[MasonryProps, MasonryState, Any] {
    def this(props: MasonryProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MasonryProps, context: Any) = this()
    
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
    inline def defaultProps_=(x: KeyMapper): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: MasonryProps, prevState: MasonryState): MasonryState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[MasonryState | Null]
  }
  
  inline def createCellPositioner(params: createCellPositionerParams): Positioner = ^.asInstanceOf[js.Dynamic].applyDynamic("createCellPositioner")(params.asInstanceOf[js.Any]).asInstanceOf[Positioner]
  
  type CellRenderer = js.Function1[/* props */ MasonryCellProps, ReactNode]
  
  trait MasonryCellProps extends StObject {
    
    var index: Double
    
    var isScrolling: Boolean
    
    var key: Key
    
    var parent: MeasuredCellParent
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object MasonryCellProps {
    
    inline def apply(index: Double, isScrolling: Boolean, key: Key, parent: MeasuredCellParent): MasonryCellProps = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[MasonryCellProps]
    }
    
    extension [Self <: MasonryCellProps](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setParent(value: MeasuredCellParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait MasonryProps
    extends StObject
       with /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[Any] {
    
    var autoHeight: Boolean
    
    var cellCount: Double
    
    var cellMeasurerCache: CellMeasurerCacheInterface
    
    var cellPositioner: Positioner
    
    var cellRenderer: CellRenderer
    
    var className: js.UndefOr[String] = js.undefined
    
    var height: Double
    
    var id: js.UndefOr[String] = js.undefined
    
    var keyMapper: js.UndefOr[typings.reactVirtualized.esCellMeasurerMod.KeyMapper] = js.undefined
    
    var onCellsRendered: js.UndefOr[OnCellsRenderedCallback] = js.undefined
    
    var onScroll: js.UndefOr[OnScrollCallback] = js.undefined
    
    var overscanByPixels: js.UndefOr[Double] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var scrollingResetTimeInterval: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabIndex: js.UndefOr[Double | Null] = js.undefined
    
    var width: Double
  }
  object MasonryProps {
    
    inline def apply(
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
    
    extension [Self <: MasonryProps](x: Self) {
      
      inline def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
      
      inline def setCellCount(value: Double): Self = StObject.set(x, "cellCount", value.asInstanceOf[js.Any])
      
      inline def setCellMeasurerCache(value: CellMeasurerCacheInterface): Self = StObject.set(x, "cellMeasurerCache", value.asInstanceOf[js.Any])
      
      inline def setCellPositioner(value: Positioner): Self = StObject.set(x, "cellPositioner", value.asInstanceOf[js.Any])
      
      inline def setCellRenderer(value: /* props */ MasonryCellProps => ReactNode): Self = StObject.set(x, "cellRenderer", js.Any.fromFunction1(value))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setKeyMapper(value: (/* rowIndex */ Double, /* columnIndex */ Double) => Any): Self = StObject.set(x, "keyMapper", js.Any.fromFunction2(value))
      
      inline def setKeyMapperUndefined: Self = StObject.set(x, "keyMapper", js.undefined)
      
      inline def setOnCellsRendered(value: /* params */ IndexRange => Unit): Self = StObject.set(x, "onCellsRendered", js.Any.fromFunction1(value))
      
      inline def setOnCellsRenderedUndefined: Self = StObject.set(x, "onCellsRendered", js.undefined)
      
      inline def setOnScroll(value: /* params */ ClientHeight => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOverscanByPixels(value: Double): Self = StObject.set(x, "overscanByPixels", value.asInstanceOf[js.Any])
      
      inline def setOverscanByPixelsUndefined: Self = StObject.set(x, "overscanByPixels", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setScrollingResetTimeInterval(value: Double): Self = StObject.set(x, "scrollingResetTimeInterval", value.asInstanceOf[js.Any])
      
      inline def setScrollingResetTimeIntervalUndefined: Self = StObject.set(x, "scrollingResetTimeInterval", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexNull: Self = StObject.set(x, "tabIndex", null)
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait MasonryState extends StObject {
    
    var isScrolling: Boolean
    
    var scrollTop: Double
  }
  object MasonryState {
    
    inline def apply(isScrolling: Boolean, scrollTop: Double): MasonryState = {
      val __obj = js.Dynamic.literal(isScrolling = isScrolling.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[MasonryState]
    }
    
    extension [Self <: MasonryState](x: Self) {
      
      inline def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    }
  }
  
  type OnCellsRenderedCallback = js.Function1[/* params */ IndexRange, Unit]
  
  type OnScrollCallback = js.Function1[/* params */ ClientHeight, Unit]
  
  trait Position extends StObject {
    
    var left: Double
    
    var top: Double
  }
  object Position {
    
    inline def apply(left: Double, top: Double): Position = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  type Positioner = (js.Function1[/* index */ Double, Position]) & Reset
  
  trait createCellPositionerParams extends StObject {
    
    var cellMeasurerCache: CellMeasurerCacheInterface
    
    var columnCount: Double
    
    var columnWidth: Double
    
    var spacer: js.UndefOr[Double] = js.undefined
  }
  object createCellPositionerParams {
    
    inline def apply(cellMeasurerCache: CellMeasurerCacheInterface, columnCount: Double, columnWidth: Double): createCellPositionerParams = {
      val __obj = js.Dynamic.literal(cellMeasurerCache = cellMeasurerCache.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[createCellPositionerParams]
    }
    
    extension [Self <: createCellPositionerParams](x: Self) {
      
      inline def setCellMeasurerCache(value: CellMeasurerCacheInterface): Self = StObject.set(x, "cellMeasurerCache", value.asInstanceOf[js.Any])
      
      inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      inline def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setSpacer(value: Double): Self = StObject.set(x, "spacer", value.asInstanceOf[js.Any])
      
      inline def setSpacerUndefined: Self = StObject.set(x, "spacer", js.undefined)
    }
  }
  
  type emptyObject = js.Object
  
  type identity = js.Function1[/* value */ Any, Any]
  
  type noop = js.Function0[Unit]
  
  trait resetParams extends StObject {
    
    var columnCount: Double
    
    var columnWidth: Double
    
    var spacer: js.UndefOr[Double] = js.undefined
  }
  object resetParams {
    
    inline def apply(columnCount: Double, columnWidth: Double): resetParams = {
      val __obj = js.Dynamic.literal(columnCount = columnCount.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[resetParams]
    }
    
    extension [Self <: resetParams](x: Self) {
      
      inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      inline def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setSpacer(value: Double): Self = StObject.set(x, "spacer", value.asInstanceOf[js.Any])
      
      inline def setSpacerUndefined: Self = StObject.set(x, "spacer", js.undefined)
    }
  }
}
