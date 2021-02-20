package typings.reactSortablePane

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.TouchEvent
import typings.react.mod.global.JSX.Element
import typings.reactMotion.mod.SpringHelperConfig
import typings.reactSortablePane.anon.ClassName
import typings.reactSortablePane.anon.Next
import typings.reactSortablePane.anon.PageX
import typings.reactSortablePane.paneMod.PaneProps
import typings.reactSortablePane.reactSortablePaneStrings.horizontal
import typings.reactSortablePane.reactSortablePaneStrings.vertical
import typings.resizeObserverPolyfill.mod.global.ResizeObserver
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-sortable-pane", "Pane")
  @js.native
  class Pane protected ()
    extends typings.reactSortablePane.paneMod.Pane {
    def this(props: PaneProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PaneProps, context: js.Any) = this()
  }
  /* static members */
  object Pane {
    
    @JSImport("react-sortable-pane", "Pane")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sortable-pane", "Pane.defaultProps")
    @js.native
    def defaultProps: ClassName = js.native
    @scala.inline
    def defaultProps_=(x: ClassName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sortable-pane", "SortablePane")
  @js.native
  class SortablePane protected ()
    extends Component[SortablePaneProps, State, js.Any] {
    def this(props: SortablePaneProps) = this()
    
    def addPane(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MSortablePane(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSortablePane(prevProps: SortablePaneProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSortablePane(): Unit = js.native
    
    def debounceUpdate(): Unit = js.native
    
    /**
      * Determine where a particular pane should be ordered
      *
      * @param  {number} position     - Top of the current pane
      * @param  {number} paneIndex    - Index of the pane
      * @return {number}              - New index of the pane based on position
      */
    def getItemCountByPosition(position: Double, paneIndex: Double): Double = js.native
    
    def getItemPositionByIndex(index: Double): Double = js.native
    
    def getPaneSizeList(): js.Array[Double] = js.native
    
    /**
      * Find the position sum of halfway points of panes surrounding a given pane
      *
      *  |-------------|
      *  |             | ---> 'previous' halfway
      *  |-------------|
      *                  <--- margin
      *  |-------------|
      *  | currentPane |
      *  |-------------|
      *                  <--- margin
      *  |-------------|
      *  |             |
      *  |             | ---> 'next' halfway
      *  |             |
      *  |-------------|
      *
      *
      * @param  {number}   currentPane - Index of reference pane
      * @param  {number[]} sizes       - Array of pane sizes
      * @param  {number}   margin      - The margin between panes
      * @return {object}               - Object containing 'previous' and 'next'
      *                                  pane halfway points
      */
    def getSurroundingHalfSizes(currentPane: Double, sizes: js.Array[Double], margin: Double): Next = js.native
    
    def handleMouseDown(pos: Double, pressX: Double, pressY: Double, e: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
    def handleMouseDown(pos: Double, pressX: Double, pressY: Double, e: TouchEvent[HTMLElement]): Unit = js.native
    
    def handleMouseUp(e: typings.std.MouseEvent): Unit = js.native
    def handleMouseUp(e: typings.std.TouchEvent): Unit = js.native
    
    def handleMove(hasPageXPageY: PageX): Unit = js.native
    
    def handleResizeStart(
      i: Double,
      e: MouseEvent[HTMLElement, NativeMouseEvent],
      dir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizableDirection */ js.Any
    ): Unit = js.native
    def handleResizeStart(
      i: Double,
      e: TouchEvent[HTMLElement],
      dir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizableDirection */ js.Any
    ): Unit = js.native
    
    def handleResizeStop(
      i: Double,
      e: typings.std.MouseEvent,
      dir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizableDirection */ js.Any,
      elementRef: HTMLElement,
      delta: PaneSize
    ): Unit = js.native
    def handleResizeStop(
      i: Double,
      e: typings.std.TouchEvent,
      dir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizableDirection */ js.Any,
      elementRef: HTMLElement,
      delta: PaneSize
    ): Unit = js.native
    
    def handleTouchMove(e: typings.std.TouchEvent): Unit = js.native
    
    def handleTouchStart(key: Double, x: Double, y: Double, e: TouchEvent[HTMLElement], child: ReactElement): Unit = js.native
    
    def isHorizontal(): Boolean = js.native
    
    def onResize(
      i: Double,
      e: typings.std.MouseEvent,
      dir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizableDirection */ js.Any,
      elementRef: HTMLElement,
      delta: PaneSize
    ): Unit = js.native
    def onResize(
      i: Double,
      e: typings.std.TouchEvent,
      dir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizableDirection */ js.Any,
      elementRef: HTMLElement,
      delta: PaneSize
    ): Unit = js.native
    
    val order: js.Array[Double] = js.native
    
    val panes: js.Array[PaneProperty] = js.native
    
    var panesWrapper: HTMLDivElement = js.native
    
    def removePane(): Unit = js.native
    
    def renderPanes(): js.Array[Element] = js.native
    
    var resizeObserver: ResizeObserver = js.native
    
    var sizePropsUpdated: Boolean = js.native
  }
  object SortablePane {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-sortable-pane", "SortablePane.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-sortable-pane", "SortablePane.defaultProps.children")
      @js.native
      def children: js.Array[scala.Nothing] = js.native
      @scala.inline
      def children_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("react-sortable-pane", "SortablePane.defaultProps.className")
      @js.native
      def className: String = js.native
      @scala.inline
      def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("react-sortable-pane", "SortablePane.defaultProps.direction")
      @js.native
      def direction: String = js.native
      @scala.inline
      def direction_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
      
      @JSImport("react-sortable-pane", "SortablePane.defaultProps.disableEffect")
      @js.native
      def disableEffect: Boolean = js.native
      @scala.inline
      def disableEffect_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableEffect")(x.asInstanceOf[js.Any])
      
      @JSImport("react-sortable-pane", "SortablePane.defaultProps.isSortable")
      @js.native
      def isSortable: Boolean = js.native
      @scala.inline
      def isSortable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSortable")(x.asInstanceOf[js.Any])
      
      @JSImport("react-sortable-pane", "SortablePane.defaultProps.margin")
      @js.native
      def margin: Double = js.native
      @scala.inline
      def margin_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("margin")(x.asInstanceOf[js.Any])
      
      @JSImport("react-sortable-pane", "SortablePane.defaultProps.onClick")
      @js.native
      def onClick(): Null = js.native
      
      @JSImport("react-sortable-pane", "SortablePane.defaultProps.onDragStart")
      @js.native
      def onDragStart(): Null = js.native
      
      @JSImport("react-sortable-pane", "SortablePane.defaultProps.onDragStop")
      @js.native
      def onDragStop(): Null = js.native
      
      @JSImport("react-sortable-pane", "SortablePane.defaultProps.onOrderChange")
      @js.native
      def onOrderChange(): Null = js.native
      
      @JSImport("react-sortable-pane", "SortablePane.defaultProps.onResize")
      @js.native
      def onResize(): Null = js.native
      
      @JSImport("react-sortable-pane", "SortablePane.defaultProps.onResizeStart")
      @js.native
      def onResizeStart(): Null = js.native
      
      @JSImport("react-sortable-pane", "SortablePane.defaultProps.onResizeStop")
      @js.native
      def onResizeStop(): Null = js.native
      
      @JSImport("react-sortable-pane", "SortablePane.defaultProps.onTouchStart")
      @js.native
      def onTouchStart(): Null = js.native
      
      @JSImport("react-sortable-pane", "SortablePane.defaultProps.springConfig")
      @js.native
      def springConfig: SpringHelperConfig = js.native
      @scala.inline
      def springConfig_=(x: SpringHelperConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("springConfig")(x.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSortablePane.reactSortablePaneStrings.horizontal
    - typings.reactSortablePane.reactSortablePaneStrings.vertical
  */
  trait PaneDirection extends StObject
  object PaneDirection {
    
    @scala.inline
    def horizontal: typings.reactSortablePane.reactSortablePaneStrings.horizontal = "horizontal".asInstanceOf[typings.reactSortablePane.reactSortablePaneStrings.horizontal]
    
    @scala.inline
    def vertical: typings.reactSortablePane.reactSortablePaneStrings.vertical = "vertical".asInstanceOf[typings.reactSortablePane.reactSortablePaneStrings.vertical]
  }
  
  type PaneKey = String | Double | Null
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSortablePane.reactSortablePaneStrings.add
    - typings.reactSortablePane.reactSortablePaneStrings.remove
  */
  trait PaneMode extends StObject
  object PaneMode {
    
    @scala.inline
    def add: typings.reactSortablePane.reactSortablePaneStrings.add = "add".asInstanceOf[typings.reactSortablePane.reactSortablePaneStrings.add]
    
    @scala.inline
    def remove: typings.reactSortablePane.reactSortablePaneStrings.remove = "remove".asInstanceOf[typings.reactSortablePane.reactSortablePaneStrings.remove]
  }
  
  @js.native
  trait PaneProperty extends StObject {
    
    var key: PaneKey = js.native
    
    var ref: typings.std.Element | Null = js.native
  }
  object PaneProperty {
    
    @scala.inline
    def apply(): PaneProperty = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaneProperty]
    }
    
    @scala.inline
    implicit class PanePropertyMutableBuilder[Self <: PaneProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: PaneKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNull: Self = StObject.set(x, "key", null)
      
      @scala.inline
      def setRef(value: typings.std.Element): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSortablePane.reactSortablePaneStrings.x
    - typings.reactSortablePane.reactSortablePaneStrings.y
    - typings.reactSortablePane.reactSortablePaneStrings.xy
  */
  trait PaneResizeDirection extends StObject
  object PaneResizeDirection {
    
    @scala.inline
    def x: typings.reactSortablePane.reactSortablePaneStrings.x = "x".asInstanceOf[typings.reactSortablePane.reactSortablePaneStrings.x]
    
    @scala.inline
    def xy: typings.reactSortablePane.reactSortablePaneStrings.xy = "xy".asInstanceOf[typings.reactSortablePane.reactSortablePaneStrings.xy]
    
    @scala.inline
    def y: typings.reactSortablePane.reactSortablePaneStrings.y = "y".asInstanceOf[typings.reactSortablePane.reactSortablePaneStrings.y]
  }
  
  @js.native
  trait PaneSize extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object PaneSize {
    
    @scala.inline
    def apply(height: Double, width: Double): PaneSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaneSize]
    }
    
    @scala.inline
    implicit class PaneSizeMutableBuilder[Self <: PaneSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SortablePaneProps extends StObject {
    
    var children: js.Array[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var defaultOrder: js.UndefOr[js.Array[String]] = js.native
    
    var direction: js.UndefOr[horizontal | vertical] = js.native
    
    var disableEffect: js.UndefOr[Boolean] = js.native
    
    var dragHandleClassName: js.UndefOr[String] = js.native
    
    var isSortable: js.UndefOr[Boolean] = js.native
    
    var margin: js.UndefOr[Double] = js.native
    
    var onDragStart: js.UndefOr[
        js.Function3[
          /* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], 
          /* key */ PaneKey, 
          /* elementRef */ HTMLElement, 
          Unit
        ]
      ] = js.native
    
    var onDragStop: js.UndefOr[
        js.Function4[
          /* e */ typings.std.MouseEvent | typings.std.TouchEvent, 
          /* key */ PaneKey, 
          /* elementRef */ HTMLElement, 
          /* order */ js.Array[String], 
          Unit
        ]
      ] = js.native
    
    var onOrderChange: js.UndefOr[js.Function1[/* order */ js.Array[String], Unit]] = js.native
    
    var onResize: js.UndefOr[
        js.Function5[
          /* e */ typings.std.MouseEvent | typings.std.TouchEvent, 
          /* key */ PaneKey, 
          /* dir */ PaneResizeDirection, 
          /* elementRef */ HTMLElement, 
          /* delta */ PaneSize, 
          Unit
        ]
      ] = js.native
    
    var onResizeStart: js.UndefOr[
        js.Function3[
          /* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], 
          /* key */ PaneKey, 
          /* dir */ PaneResizeDirection, 
          Unit
        ]
      ] = js.native
    
    var onResizeStop: js.UndefOr[
        js.Function5[
          /* e */ typings.std.MouseEvent | typings.std.TouchEvent, 
          /* key */ PaneKey, 
          /* dir */ PaneResizeDirection, 
          /* elementRef */ HTMLElement, 
          /* delta */ PaneSize, 
          Unit
        ]
      ] = js.native
    
    var order: js.UndefOr[js.Array[String]] = js.native
    
    var springConfig: js.UndefOr[SpringHelperConfig] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object SortablePaneProps {
    
    @scala.inline
    def apply(children: js.Array[ReactElement]): SortablePaneProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortablePaneProps]
    }
    
    @scala.inline
    implicit class SortablePanePropsMutableBuilder[Self <: SortablePaneProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultOrder(value: js.Array[String]): Self = StObject.set(x, "defaultOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOrderUndefined: Self = StObject.set(x, "defaultOrder", js.undefined)
      
      @scala.inline
      def setDefaultOrderVarargs(value: String*): Self = StObject.set(x, "defaultOrder", js.Array(value :_*))
      
      @scala.inline
      def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisableEffect(value: Boolean): Self = StObject.set(x, "disableEffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableEffectUndefined: Self = StObject.set(x, "disableEffect", js.undefined)
      
      @scala.inline
      def setDragHandleClassName(value: String): Self = StObject.set(x, "dragHandleClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragHandleClassNameUndefined: Self = StObject.set(x, "dragHandleClassName", js.undefined)
      
      @scala.inline
      def setIsSortable(value: Boolean): Self = StObject.set(x, "isSortable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSortableUndefined: Self = StObject.set(x, "isSortable", js.undefined)
      
      @scala.inline
      def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOnDragStart(
        value: (/* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], /* key */ PaneKey, /* elementRef */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onDragStart", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragStop(
        value: (/* e */ typings.std.MouseEvent | typings.std.TouchEvent, /* key */ PaneKey, /* elementRef */ HTMLElement, /* order */ js.Array[String]) => Unit
      ): Self = StObject.set(x, "onDragStop", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnDragStopUndefined: Self = StObject.set(x, "onDragStop", js.undefined)
      
      @scala.inline
      def setOnOrderChange(value: /* order */ js.Array[String] => Unit): Self = StObject.set(x, "onOrderChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOrderChangeUndefined: Self = StObject.set(x, "onOrderChange", js.undefined)
      
      @scala.inline
      def setOnResize(
        value: (/* e */ typings.std.MouseEvent | typings.std.TouchEvent, /* key */ PaneKey, /* dir */ PaneResizeDirection, /* elementRef */ HTMLElement, /* delta */ PaneSize) => Unit
      ): Self = StObject.set(x, "onResize", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnResizeStart(
        value: (/* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], /* key */ PaneKey, /* dir */ PaneResizeDirection) => Unit
      ): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnResizeStartUndefined: Self = StObject.set(x, "onResizeStart", js.undefined)
      
      @scala.inline
      def setOnResizeStop(
        value: (/* e */ typings.std.MouseEvent | typings.std.TouchEvent, /* key */ PaneKey, /* dir */ PaneResizeDirection, /* elementRef */ HTMLElement, /* delta */ PaneSize) => Unit
      ): Self = StObject.set(x, "onResizeStop", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnResizeStopUndefined: Self = StObject.set(x, "onResizeStop", js.undefined)
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setOrder(value: js.Array[String]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setOrderVarargs(value: String*): Self = StObject.set(x, "order", js.Array(value :_*))
      
      @scala.inline
      def setSpringConfig(value: SpringHelperConfig): Self = StObject.set(x, "springConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpringConfigUndefined: Self = StObject.set(x, "springConfig", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait State extends StObject {
    
    var delta: Double = js.native
    
    var isPressed: Boolean = js.native
    
    var isResizing: Boolean = js.native
    
    var lastPressed: Double = js.native
    
    var mouse: Double = js.native
    
    var panes: js.Array[PaneProperty] = js.native
  }
  object State {
    
    @scala.inline
    def apply(
      delta: Double,
      isPressed: Boolean,
      isResizing: Boolean,
      lastPressed: Double,
      mouse: Double,
      panes: js.Array[PaneProperty]
    ): State = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], isPressed = isPressed.asInstanceOf[js.Any], isResizing = isResizing.asInstanceOf[js.Any], lastPressed = lastPressed.asInstanceOf[js.Any], mouse = mouse.asInstanceOf[js.Any], panes = panes.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPressed(value: Boolean): Self = StObject.set(x, "isPressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResizing(value: Boolean): Self = StObject.set(x, "isResizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastPressed(value: Double): Self = StObject.set(x, "lastPressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouse(value: Double): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanes(value: js.Array[PaneProperty]): Self = StObject.set(x, "panes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanesVarargs(value: PaneProperty*): Self = StObject.set(x, "panes", js.Array(value :_*))
    }
  }
  
  object global {
    
    @js.native
    trait Window extends StObject {
      
      var TouchEvent: typings.std.TouchEvent = js.native
    }
    object Window {
      
      @scala.inline
      def apply(TouchEvent: typings.std.TouchEvent): Window = {
        val __obj = js.Dynamic.literal(TouchEvent = TouchEvent.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTouchEvent(value: typings.std.TouchEvent): Self = StObject.set(x, "TouchEvent", value.asInstanceOf[js.Any])
      }
    }
  }
}
