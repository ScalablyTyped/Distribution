package typings.reactSortablePane

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.TouchEvent
import typings.reactMotion.mod.SpringHelperConfig
import typings.reactSortablePane.anon.ClassName
import typings.reactSortablePane.anon.Next
import typings.reactSortablePane.anon.PageX
import typings.reactSortablePane.libPaneMod.PaneProps
import typings.reactSortablePane.reactSortablePaneStrings.horizontal
import typings.reactSortablePane.reactSortablePaneStrings.vertical
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.ResizeObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-sortable-pane", "Pane")
  @js.native
  open class Pane protected ()
    extends typings.reactSortablePane.libPaneMod.Pane {
    def this(props: PaneProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PaneProps, context: Any) = this()
  }
  /* static members */
  object Pane {
    
    @JSImport("react-sortable-pane", "Pane")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sortable-pane", "Pane.defaultProps")
    @js.native
    def defaultProps: ClassName = js.native
    inline def defaultProps_=(x: ClassName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSortablePane.reactSortablePaneStrings.horizontal
    - typings.reactSortablePane.reactSortablePaneStrings.vertical
  */
  trait PaneDirection extends StObject
  object PaneDirection {
    
    inline def horizontal: typings.reactSortablePane.reactSortablePaneStrings.horizontal = "horizontal".asInstanceOf[typings.reactSortablePane.reactSortablePaneStrings.horizontal]
    
    inline def vertical: typings.reactSortablePane.reactSortablePaneStrings.vertical = "vertical".asInstanceOf[typings.reactSortablePane.reactSortablePaneStrings.vertical]
  }
  
  type PaneKey = String | Double | Null
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSortablePane.reactSortablePaneStrings.add
    - typings.reactSortablePane.reactSortablePaneStrings.remove
  */
  trait PaneMode extends StObject
  object PaneMode {
    
    inline def add: typings.reactSortablePane.reactSortablePaneStrings.add = "add".asInstanceOf[typings.reactSortablePane.reactSortablePaneStrings.add]
    
    inline def remove: typings.reactSortablePane.reactSortablePaneStrings.remove = "remove".asInstanceOf[typings.reactSortablePane.reactSortablePaneStrings.remove]
  }
  
  trait PaneProperty extends StObject {
    
    var key: PaneKey
    
    var ref: Element | Null
  }
  object PaneProperty {
    
    inline def apply(): PaneProperty = {
      val __obj = js.Dynamic.literal(key = null, ref = null)
      __obj.asInstanceOf[PaneProperty]
    }
    
    extension [Self <: PaneProperty](x: Self) {
      
      inline def setKey(value: PaneKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setRef(value: Element): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSortablePane.reactSortablePaneStrings.x
    - typings.reactSortablePane.reactSortablePaneStrings.y
    - typings.reactSortablePane.reactSortablePaneStrings.xy
  */
  trait PaneResizeDirection extends StObject
  object PaneResizeDirection {
    
    inline def x: typings.reactSortablePane.reactSortablePaneStrings.x = "x".asInstanceOf[typings.reactSortablePane.reactSortablePaneStrings.x]
    
    inline def xy: typings.reactSortablePane.reactSortablePaneStrings.xy = "xy".asInstanceOf[typings.reactSortablePane.reactSortablePaneStrings.xy]
    
    inline def y: typings.reactSortablePane.reactSortablePaneStrings.y = "y".asInstanceOf[typings.reactSortablePane.reactSortablePaneStrings.y]
  }
  
  trait PaneSize extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object PaneSize {
    
    inline def apply(height: Double, width: Double): PaneSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaneSize]
    }
    
    extension [Self <: PaneSize](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SortablePane extends Component[SortablePaneProps, State, Any] {
    
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
    
    def handleMove(param0: PageX): Unit = js.native
    
    def handleResizeStart(
      i: Double,
      e: MouseEvent[HTMLElement, NativeMouseEvent],
      dir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizableDirection */ Any
    ): Unit = js.native
    def handleResizeStart(
      i: Double,
      e: TouchEvent[HTMLElement],
      dir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizableDirection */ Any
    ): Unit = js.native
    
    def handleResizeStop(
      i: Double,
      e: typings.std.MouseEvent,
      dir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizableDirection */ Any,
      elementRef: HTMLElement,
      delta: PaneSize
    ): Unit = js.native
    def handleResizeStop(
      i: Double,
      e: typings.std.TouchEvent,
      dir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizableDirection */ Any,
      elementRef: HTMLElement,
      delta: PaneSize
    ): Unit = js.native
    
    def handleTouchMove(e: typings.std.TouchEvent): Unit = js.native
    
    def handleTouchStart(key: Double, x: Double, y: Double, e: TouchEvent[HTMLElement], child: ReactElement): Unit = js.native
    
    def isHorizontal(): Boolean = js.native
    
    def onResize(
      i: Double,
      e: typings.std.MouseEvent,
      dir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizableDirection */ Any,
      elementRef: HTMLElement,
      delta: PaneSize
    ): Unit = js.native
    def onResize(
      i: Double,
      e: typings.std.TouchEvent,
      dir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizableDirection */ Any,
      elementRef: HTMLElement,
      delta: PaneSize
    ): Unit = js.native
    
    val order: js.Array[Double] = js.native
    
    val panes: js.Array[PaneProperty] = js.native
    
    var panesWrapper: HTMLDivElement = js.native
    
    def removePane(): Unit = js.native
    
    def renderPanes(): js.Array[typings.react.mod.global.JSX.Element] = js.native
    
    var resizeObserver: ResizeObserver = js.native
    
    var sizePropsUpdated: Boolean = js.native
  }
  
  trait SortablePaneProps extends StObject {
    
    var children: js.Array[ReactElement]
    
    var className: js.UndefOr[String] = js.undefined
    
    var defaultOrder: js.UndefOr[js.Array[String]] = js.undefined
    
    var direction: js.UndefOr[horizontal | vertical] = js.undefined
    
    var disableEffect: js.UndefOr[Boolean] = js.undefined
    
    var dragHandleClassName: js.UndefOr[String] = js.undefined
    
    var isSortable: js.UndefOr[Boolean] = js.undefined
    
    var margin: js.UndefOr[Double] = js.undefined
    
    var onDragStart: js.UndefOr[
        js.Function3[
          /* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], 
          /* key */ PaneKey, 
          /* elementRef */ HTMLElement, 
          Unit
        ]
      ] = js.undefined
    
    var onDragStop: js.UndefOr[
        js.Function4[
          /* e */ typings.std.MouseEvent | typings.std.TouchEvent, 
          /* key */ PaneKey, 
          /* elementRef */ HTMLElement, 
          /* order */ js.Array[String], 
          Unit
        ]
      ] = js.undefined
    
    var onOrderChange: js.UndefOr[js.Function1[/* order */ js.Array[String], Unit]] = js.undefined
    
    var onResize: js.UndefOr[
        js.Function5[
          /* e */ typings.std.MouseEvent | typings.std.TouchEvent, 
          /* key */ PaneKey, 
          /* dir */ PaneResizeDirection, 
          /* elementRef */ HTMLElement, 
          /* delta */ PaneSize, 
          Unit
        ]
      ] = js.undefined
    
    var onResizeStart: js.UndefOr[
        js.Function3[
          /* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], 
          /* key */ PaneKey, 
          /* dir */ PaneResizeDirection, 
          Unit
        ]
      ] = js.undefined
    
    var onResizeStop: js.UndefOr[
        js.Function5[
          /* e */ typings.std.MouseEvent | typings.std.TouchEvent, 
          /* key */ PaneKey, 
          /* dir */ PaneResizeDirection, 
          /* elementRef */ HTMLElement, 
          /* delta */ PaneSize, 
          Unit
        ]
      ] = js.undefined
    
    var order: js.UndefOr[js.Array[String]] = js.undefined
    
    var springConfig: js.UndefOr[SpringHelperConfig] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object SortablePaneProps {
    
    inline def apply(children: js.Array[ReactElement]): SortablePaneProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortablePaneProps]
    }
    
    extension [Self <: SortablePaneProps](x: Self) {
      
      inline def setChildren(value: js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultOrder(value: js.Array[String]): Self = StObject.set(x, "defaultOrder", value.asInstanceOf[js.Any])
      
      inline def setDefaultOrderUndefined: Self = StObject.set(x, "defaultOrder", js.undefined)
      
      inline def setDefaultOrderVarargs(value: String*): Self = StObject.set(x, "defaultOrder", js.Array(value*))
      
      inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisableEffect(value: Boolean): Self = StObject.set(x, "disableEffect", value.asInstanceOf[js.Any])
      
      inline def setDisableEffectUndefined: Self = StObject.set(x, "disableEffect", js.undefined)
      
      inline def setDragHandleClassName(value: String): Self = StObject.set(x, "dragHandleClassName", value.asInstanceOf[js.Any])
      
      inline def setDragHandleClassNameUndefined: Self = StObject.set(x, "dragHandleClassName", js.undefined)
      
      inline def setIsSortable(value: Boolean): Self = StObject.set(x, "isSortable", value.asInstanceOf[js.Any])
      
      inline def setIsSortableUndefined: Self = StObject.set(x, "isSortable", js.undefined)
      
      inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOnDragStart(
        value: (/* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], /* key */ PaneKey, /* elementRef */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onDragStart", js.Any.fromFunction3(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragStop(
        value: (/* e */ typings.std.MouseEvent | typings.std.TouchEvent, /* key */ PaneKey, /* elementRef */ HTMLElement, /* order */ js.Array[String]) => Unit
      ): Self = StObject.set(x, "onDragStop", js.Any.fromFunction4(value))
      
      inline def setOnDragStopUndefined: Self = StObject.set(x, "onDragStop", js.undefined)
      
      inline def setOnOrderChange(value: /* order */ js.Array[String] => Unit): Self = StObject.set(x, "onOrderChange", js.Any.fromFunction1(value))
      
      inline def setOnOrderChangeUndefined: Self = StObject.set(x, "onOrderChange", js.undefined)
      
      inline def setOnResize(
        value: (/* e */ typings.std.MouseEvent | typings.std.TouchEvent, /* key */ PaneKey, /* dir */ PaneResizeDirection, /* elementRef */ HTMLElement, /* delta */ PaneSize) => Unit
      ): Self = StObject.set(x, "onResize", js.Any.fromFunction5(value))
      
      inline def setOnResizeStart(
        value: (/* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], /* key */ PaneKey, /* dir */ PaneResizeDirection) => Unit
      ): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction3(value))
      
      inline def setOnResizeStartUndefined: Self = StObject.set(x, "onResizeStart", js.undefined)
      
      inline def setOnResizeStop(
        value: (/* e */ typings.std.MouseEvent | typings.std.TouchEvent, /* key */ PaneKey, /* dir */ PaneResizeDirection, /* elementRef */ HTMLElement, /* delta */ PaneSize) => Unit
      ): Self = StObject.set(x, "onResizeStop", js.Any.fromFunction5(value))
      
      inline def setOnResizeStopUndefined: Self = StObject.set(x, "onResizeStop", js.undefined)
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOrder(value: js.Array[String]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrderVarargs(value: String*): Self = StObject.set(x, "order", js.Array(value*))
      
      inline def setSpringConfig(value: SpringHelperConfig): Self = StObject.set(x, "springConfig", value.asInstanceOf[js.Any])
      
      inline def setSpringConfigUndefined: Self = StObject.set(x, "springConfig", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var delta: Double
    
    var isPressed: Boolean
    
    var isResizing: Boolean
    
    var lastPressed: Double
    
    var mouse: Double
    
    var panes: js.Array[PaneProperty]
  }
  object State {
    
    inline def apply(
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
    
    extension [Self <: State](x: Self) {
      
      inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setIsPressed(value: Boolean): Self = StObject.set(x, "isPressed", value.asInstanceOf[js.Any])
      
      inline def setIsResizing(value: Boolean): Self = StObject.set(x, "isResizing", value.asInstanceOf[js.Any])
      
      inline def setLastPressed(value: Double): Self = StObject.set(x, "lastPressed", value.asInstanceOf[js.Any])
      
      inline def setMouse(value: Double): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
      
      inline def setPanes(value: js.Array[PaneProperty]): Self = StObject.set(x, "panes", value.asInstanceOf[js.Any])
      
      inline def setPanesVarargs(value: PaneProperty*): Self = StObject.set(x, "panes", js.Array(value*))
    }
  }
  
  object global {
    
    trait Window extends StObject {
      
      var TouchEvent: typings.std.TouchEvent
    }
    object Window {
      
      inline def apply(TouchEvent: typings.std.TouchEvent): Window = {
        val __obj = js.Dynamic.literal(TouchEvent = TouchEvent.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setTouchEvent(value: typings.std.TouchEvent): Self = StObject.set(x, "TouchEvent", value.asInstanceOf[js.Any])
      }
    }
  }
}
