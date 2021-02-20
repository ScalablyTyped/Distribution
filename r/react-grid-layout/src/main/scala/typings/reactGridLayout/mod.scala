package typings.reactGridLayout

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.reactGridLayout.anon.H
import typings.reactGridLayout.reactGridLayoutStrings.horizontal
import typings.reactGridLayout.reactGridLayoutStrings.vertical
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-grid-layout", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[ReactGridLayoutProps, js.Object, js.Any]
  
  @JSImport("react-grid-layout", "Responsive")
  @js.native
  class Responsive protected ()
    extends Component[ResponsiveProps, js.Object, js.Any] {
    def this(props: ResponsiveProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ResponsiveProps, context: js.Any) = this()
  }
  
  @JSImport("react-grid-layout", "WidthProvider")
  @js.native
  def WidthProvider[P](component: ComponentClass[P, ComponentState]): ComponentClass[P with WidthProviderProps, ComponentState] = js.native
  @JSImport("react-grid-layout", "WidthProvider")
  @js.native
  def WidthProvider[P](component: FunctionComponent[P]): ComponentClass[P with WidthProviderProps, ComponentState] = js.native
  
  @js.native
  trait CoreProps extends StObject {
    
    /**
      * If true, the container height swells and contracts to fit contents.
      */
    var autoSize: js.UndefOr[Boolean] = js.native
    
    /**
      * The classname to add to the root element.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Compaction type.
      */
    var compactType: js.UndefOr[vertical | horizontal | Null] = js.native
    
    /**
      * A CSS selector for tags that will not be draggable.
      *
      * For example: `draggableCancel: '.MyNonDraggableAreaClassName'`
      *
      * If you forget the leading. it will not work.
      */
    var draggableCancel: js.UndefOr[String] = js.native
    
    /**
      * A CSS selector for tags that will act as the draggable handle.
      *
      * For example: `draggableHandle: '.MyDragHandleClassName'`
      *
      * If you forget the leading . it will not work.
      */
    var draggableHandle: js.UndefOr[String] = js.native
    
    /**
      * Configuration of a dropping element. Dropping element is a "virtual" element
      * which appears when you drag over some element from outside.
      */
    var droppingItem: js.UndefOr[H] = js.native
    
    /**
      * If true and draggable, all items will be moved only within grid.
      */
    var isBounded: js.UndefOr[Boolean] = js.native
    
    /**
      * If set to false it will disable dragging on all children.
      */
    var isDraggable: js.UndefOr[Boolean] = js.native
    
    /**
      * If set to false it will not call `onDrop()` callback.
      */
    var isDroppable: js.UndefOr[Boolean] = js.native
    
    /**
      * If set to false it will disable resizing on all children.
      */
    var isResizable: js.UndefOr[Boolean] = js.native
    
    /**
      * Default Infinity, but you can specify a max here if you like.
      * Note that this isn't fully fleshed out and won't error if you specify a layout that
      * extends beyond the row capacity. It will, however, not allow users to drag/resize
      * an item past the barrier. They can push items beyond the barrier, though.
      * Intentionally not documented for this reason.
      */
    var maxRows: js.UndefOr[Double] = js.native
    
    /**
      * Calls on each drag movement.
      */
    var onDrag: js.UndefOr[ItemCallback] = js.native
    
    /**
      * Calls when drag starts.
      */
    var onDragStart: js.UndefOr[ItemCallback] = js.native
    
    /**
      * Calls when drag is complete.
      */
    var onDragStop: js.UndefOr[ItemCallback] = js.native
    
    /**
      * Calls when some element has been dropped
      */
    var onDrop: js.UndefOr[
        js.Function3[/* layout */ js.Array[Layout], /* item */ Layout, /* e */ Event, Unit]
      ] = js.native
    
    /**
      * Calls when resize movement happens.
      */
    var onResize: js.UndefOr[ItemCallback] = js.native
    
    /**
      * Calls when resize starts.
      */
    var onResizeStart: js.UndefOr[ItemCallback] = js.native
    
    /**
      * Calls when resize is complete.
      */
    var onResizeStop: js.UndefOr[ItemCallback] = js.native
    
    /**
      * If true, grid items won't change position when being dragged over.
      */
    var preventCollision: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines custom component for resize handle
      */
    var resizeHandle: js.UndefOr[ReactNode | (js.Function1[/* resizeHandle */ ResizeHandle, ReactNode])] = js.native
    
    /**
      * Defines which resize handles should be rendered
      * Allows for any combination of:
      * 's' - South handle (bottom-center)
      * 'w' - West handle (left-center)
      * 'e' - East handle (right-center)
      * 'n' - North handle (top-center)
      * 'sw' - Southwest handle (bottom-left)
      * 'nw' - Northwest handle (top-left)
      * 'se' - Southeast handle (bottom-right)
      * 'ne' - Northeast handle (top-right)
      */
    var resizeHandles: js.UndefOr[js.Array[ResizeHandle]] = js.native
    
    /**
      * Rows have a static height, but you can change this based on breakpoints if you like.
      */
    var rowHeight: js.UndefOr[Double] = js.native
    
    /**
      * Inline-style object to pass to the root element.
      */
    var style: js.UndefOr[CSSProperties] = js.native
    
    /**
      * Scale coefficient for CSS3 `transform: scale()`
      */
    var transformScale: js.UndefOr[Double] = js.native
    
    /**
      * Uses CSS3 `translate()` instead of position top/left.
      * This makes about 6x faster paint performance.
      */
    var useCSSTransforms: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, the layout will compact vertically.
      */
    var verticalCompact: js.UndefOr[Boolean] = js.native
    
    /**
      * This allows setting the initial width on the server side.
      * This is required unless using the HOC <WidthProvider> or similar.
      */
    var width: js.UndefOr[Double] = js.native
  }
  object CoreProps {
    
    @scala.inline
    def apply(): CoreProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoreProps]
    }
    
    @scala.inline
    implicit class CorePropsMutableBuilder[Self <: CoreProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoSize(value: Boolean): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCompactType(value: vertical | horizontal): Self = StObject.set(x, "compactType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactTypeNull: Self = StObject.set(x, "compactType", null)
      
      @scala.inline
      def setCompactTypeUndefined: Self = StObject.set(x, "compactType", js.undefined)
      
      @scala.inline
      def setDraggableCancel(value: String): Self = StObject.set(x, "draggableCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableCancelUndefined: Self = StObject.set(x, "draggableCancel", js.undefined)
      
      @scala.inline
      def setDraggableHandle(value: String): Self = StObject.set(x, "draggableHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableHandleUndefined: Self = StObject.set(x, "draggableHandle", js.undefined)
      
      @scala.inline
      def setDroppingItem(value: H): Self = StObject.set(x, "droppingItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDroppingItemUndefined: Self = StObject.set(x, "droppingItem", js.undefined)
      
      @scala.inline
      def setIsBounded(value: Boolean): Self = StObject.set(x, "isBounded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBoundedUndefined: Self = StObject.set(x, "isBounded", js.undefined)
      
      @scala.inline
      def setIsDraggable(value: Boolean): Self = StObject.set(x, "isDraggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDraggableUndefined: Self = StObject.set(x, "isDraggable", js.undefined)
      
      @scala.inline
      def setIsDroppable(value: Boolean): Self = StObject.set(x, "isDroppable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDroppableUndefined: Self = StObject.set(x, "isDroppable", js.undefined)
      
      @scala.inline
      def setIsResizable(value: Boolean): Self = StObject.set(x, "isResizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResizableUndefined: Self = StObject.set(x, "isResizable", js.undefined)
      
      @scala.inline
      def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
      
      @scala.inline
      def setOnDrag(
        value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onDrag", js.Any.fromFunction6(value))
      
      @scala.inline
      def setOnDragStart(
        value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onDragStart", js.Any.fromFunction6(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragStop(
        value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onDragStop", js.Any.fromFunction6(value))
      
      @scala.inline
      def setOnDragStopUndefined: Self = StObject.set(x, "onDragStop", js.undefined)
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnDrop(value: (/* layout */ js.Array[Layout], /* item */ Layout, /* e */ Event) => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnResize(
        value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onResize", js.Any.fromFunction6(value))
      
      @scala.inline
      def setOnResizeStart(
        value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction6(value))
      
      @scala.inline
      def setOnResizeStartUndefined: Self = StObject.set(x, "onResizeStart", js.undefined)
      
      @scala.inline
      def setOnResizeStop(
        value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onResizeStop", js.Any.fromFunction6(value))
      
      @scala.inline
      def setOnResizeStopUndefined: Self = StObject.set(x, "onResizeStop", js.undefined)
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setPreventCollision(value: Boolean): Self = StObject.set(x, "preventCollision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventCollisionUndefined: Self = StObject.set(x, "preventCollision", js.undefined)
      
      @scala.inline
      def setResizeHandle(value: ReactNode | (js.Function1[/* resizeHandle */ ResizeHandle, ReactNode])): Self = StObject.set(x, "resizeHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeHandleFunction1(value: /* resizeHandle */ ResizeHandle => ReactNode): Self = StObject.set(x, "resizeHandle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResizeHandleUndefined: Self = StObject.set(x, "resizeHandle", js.undefined)
      
      @scala.inline
      def setResizeHandles(value: js.Array[ResizeHandle]): Self = StObject.set(x, "resizeHandles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeHandlesUndefined: Self = StObject.set(x, "resizeHandles", js.undefined)
      
      @scala.inline
      def setResizeHandlesVarargs(value: ResizeHandle*): Self = StObject.set(x, "resizeHandles", js.Array(value :_*))
      
      @scala.inline
      def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTransformScale(value: Double): Self = StObject.set(x, "transformScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformScaleUndefined: Self = StObject.set(x, "transformScale", js.undefined)
      
      @scala.inline
      def setUseCSSTransforms(value: Boolean): Self = StObject.set(x, "useCSSTransforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCSSTransformsUndefined: Self = StObject.set(x, "useCSSTransforms", js.undefined)
      
      @scala.inline
      def setVerticalCompact(value: Boolean): Self = StObject.set(x, "verticalCompact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalCompactUndefined: Self = StObject.set(x, "verticalCompact", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type ItemCallback = js.Function6[
    /* layout */ js.Array[Layout], 
    /* oldItem */ Layout, 
    /* newItem */ Layout, 
    /* placeholder */ Layout, 
    /* event */ MouseEvent, 
    /* element */ HTMLElement, 
    Unit
  ]
  
  @js.native
  trait Layout extends StObject {
    
    /**
      * Height in grid units.
      */
    var h: Double = js.native
    
    /**
      * A string corresponding to the component key.
      * Uses the index of components instead if not provided.
      */
    var i: String = js.native
    
    /**
      * If true and draggable, item will be moved only within grid.
      */
    var isBounded: js.UndefOr[Boolean] = js.native
    
    /**
      * If false, will not be draggable. Overrides `static`.
      */
    var isDraggable: js.UndefOr[Boolean] = js.native
    
    /**
      * If false, will not be resizable. Overrides `static`.
      */
    var isResizable: js.UndefOr[Boolean] = js.native
    
    /**
      * Maximum height in grid units.
      */
    var maxH: js.UndefOr[Double] = js.native
    
    /**
      * Maximum width in grid units.
      */
    var maxW: js.UndefOr[Double] = js.native
    
    /**
      * Minimum height in grid units.
      */
    var minH: js.UndefOr[Double] = js.native
    
    /**
      * Minimum width in grid units.
      */
    var minW: js.UndefOr[Double] = js.native
    
    /**
      * set by DragEvents (onDragStart, onDrag, onDragStop) and ResizeEvents (onResizeStart, onResize, onResizeStop)
      */
    var moved: js.UndefOr[Boolean] = js.native
    
    /**
      * By default, a handle is only shown on the bottom-right (southeast) corner.
      * Note that resizing from the top or left is generally not intuitive.
      */
    var resizeHandles: js.UndefOr[js.Array[ResizeHandle]] = js.native
    
    /**
      * If true, equal to `isDraggable: false` and `isResizable: false`.
      */
    var static: js.UndefOr[Boolean] = js.native
    
    /**
      * Width in grid units.
      */
    var w: Double = js.native
    
    /**
      * X position in grid units.
      */
    var x: Double = js.native
    
    /**
      * Y position in grid units.
      */
    var y: Double = js.native
  }
  object Layout {
    
    @scala.inline
    def apply(h: Double, i: String, w: Double, x: Double, y: Double): Layout = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Layout]
    }
    
    @scala.inline
    implicit class LayoutMutableBuilder[Self <: Layout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI(value: String): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBounded(value: Boolean): Self = StObject.set(x, "isBounded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBoundedUndefined: Self = StObject.set(x, "isBounded", js.undefined)
      
      @scala.inline
      def setIsDraggable(value: Boolean): Self = StObject.set(x, "isDraggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDraggableUndefined: Self = StObject.set(x, "isDraggable", js.undefined)
      
      @scala.inline
      def setIsResizable(value: Boolean): Self = StObject.set(x, "isResizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResizableUndefined: Self = StObject.set(x, "isResizable", js.undefined)
      
      @scala.inline
      def setMaxH(value: Double): Self = StObject.set(x, "maxH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHUndefined: Self = StObject.set(x, "maxH", js.undefined)
      
      @scala.inline
      def setMaxW(value: Double): Self = StObject.set(x, "maxW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWUndefined: Self = StObject.set(x, "maxW", js.undefined)
      
      @scala.inline
      def setMinH(value: Double): Self = StObject.set(x, "minH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHUndefined: Self = StObject.set(x, "minH", js.undefined)
      
      @scala.inline
      def setMinW(value: Double): Self = StObject.set(x, "minW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWUndefined: Self = StObject.set(x, "minW", js.undefined)
      
      @scala.inline
      def setMoved(value: Boolean): Self = StObject.set(x, "moved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovedUndefined: Self = StObject.set(x, "moved", js.undefined)
      
      @scala.inline
      def setResizeHandles(value: js.Array[ResizeHandle]): Self = StObject.set(x, "resizeHandles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeHandlesUndefined: Self = StObject.set(x, "resizeHandles", js.undefined)
      
      @scala.inline
      def setResizeHandlesVarargs(value: ResizeHandle*): Self = StObject.set(x, "resizeHandles", js.Array(value :_*))
      
      @scala.inline
      def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type Layouts = StringDictionary[js.Array[Layout]]
  
  type ReactGridLayout = Component[ReactGridLayoutProps, js.Object, js.Any]
  
  @js.native
  trait ReactGridLayoutProps extends CoreProps {
    
    /**
      * Number of columns in this layout.
      */
    var cols: js.UndefOr[Double] = js.native
    
    /**
      * Padding inside the container `[x, y]` in px.
      */
    var containerPadding: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    /**
      * Layout is an array of object with the format:
      *
      * `{x: number, y: number, w: number, h: number}`
      *
      * The index into the layout must match the key used on each item component.
      * If you choose to use custom keys, you can specify that key in the layout
      * array objects like so:
      *
      * `{i: string, x: number, y: number, w: number, h: number}`
      *
      * If not provided, use data-grid props on children.
      */
    var layout: js.UndefOr[js.Array[Layout]] = js.native
    
    /**
      * Margin between items `[x, y]` in px.
      */
    var margin: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    /**
      * Callback so you can save the layout.
      * Calls back with (currentLayout) after every drag or resize stop.
      */
    var onLayoutChange: js.UndefOr[js.Function1[/* layout */ js.Array[Layout], Unit]] = js.native
  }
  object ReactGridLayoutProps {
    
    @scala.inline
    def apply(): ReactGridLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactGridLayoutProps]
    }
    
    @scala.inline
    implicit class ReactGridLayoutPropsMutableBuilder[Self <: ReactGridLayoutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setContainerPadding(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "containerPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerPaddingUndefined: Self = StObject.set(x, "containerPadding", js.undefined)
      
      @scala.inline
      def setLayout(value: js.Array[Layout]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setLayoutVarargs(value: Layout*): Self = StObject.set(x, "layout", js.Array(value :_*))
      
      @scala.inline
      def setMargin(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOnLayoutChange(value: /* layout */ js.Array[Layout] => Unit): Self = StObject.set(x, "onLayoutChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLayoutChangeUndefined: Self = StObject.set(x, "onLayoutChange", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactGridLayout.reactGridLayoutStrings.s
    - typings.reactGridLayout.reactGridLayoutStrings.w
    - typings.reactGridLayout.reactGridLayoutStrings.e
    - typings.reactGridLayout.reactGridLayoutStrings.n
    - typings.reactGridLayout.reactGridLayoutStrings.sw
    - typings.reactGridLayout.reactGridLayoutStrings.nw
    - typings.reactGridLayout.reactGridLayoutStrings.se
    - typings.reactGridLayout.reactGridLayoutStrings.ne
  */
  trait ResizeHandle extends StObject
  object ResizeHandle {
    
    @scala.inline
    def e: typings.reactGridLayout.reactGridLayoutStrings.e = "e".asInstanceOf[typings.reactGridLayout.reactGridLayoutStrings.e]
    
    @scala.inline
    def n: typings.reactGridLayout.reactGridLayoutStrings.n = "n".asInstanceOf[typings.reactGridLayout.reactGridLayoutStrings.n]
    
    @scala.inline
    def ne: typings.reactGridLayout.reactGridLayoutStrings.ne = "ne".asInstanceOf[typings.reactGridLayout.reactGridLayoutStrings.ne]
    
    @scala.inline
    def nw: typings.reactGridLayout.reactGridLayoutStrings.nw = "nw".asInstanceOf[typings.reactGridLayout.reactGridLayoutStrings.nw]
    
    @scala.inline
    def s: typings.reactGridLayout.reactGridLayoutStrings.s = "s".asInstanceOf[typings.reactGridLayout.reactGridLayoutStrings.s]
    
    @scala.inline
    def se: typings.reactGridLayout.reactGridLayoutStrings.se = "se".asInstanceOf[typings.reactGridLayout.reactGridLayoutStrings.se]
    
    @scala.inline
    def sw: typings.reactGridLayout.reactGridLayoutStrings.sw = "sw".asInstanceOf[typings.reactGridLayout.reactGridLayoutStrings.sw]
    
    @scala.inline
    def w: typings.reactGridLayout.reactGridLayoutStrings.w = "w".asInstanceOf[typings.reactGridLayout.reactGridLayoutStrings.w]
  }
  
  @js.native
  trait ResponsiveProps extends CoreProps {
    
    /**
      * `{name: pxVal}, e.g. {lg: 1200, md: 996, sm: 768, xs: 480}`
      *
      * Breakpoint names are arbitrary but must match in the cols and layouts objects.
      */
    var breakpoints: js.UndefOr[StringDictionary[Double]] = js.native
    
    /**
      * Number of cols. This is a breakpoint -> cols map, e.g. `{lg: 12, md: 10, ...}`.
      */
    var cols: js.UndefOr[StringDictionary[Double]] = js.native
    
    /**
      * Padding inside the container in px and formatt [x, y] or { breakpoint: [x, y] }.
      */
    var containerPadding: js.UndefOr[(js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]])] = js.native
    
    /**
      * layouts is an object mapping breakpoints to layouts.
      *
      * e.g. `{lg: Layout[], md: Layout[], ...}`
      */
    var layouts: js.UndefOr[Layouts] = js.native
    
    /**
      * Margin between items in px and formatt [x, y] or { breakpoint: [x, y] }.
      */
    var margin: js.UndefOr[(js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]])] = js.native
    
    /**
      * Calls back with breakpoint and new number pf cols.
      */
    var onBreakpointChange: js.UndefOr[js.Function2[/* newBreakpoint */ String, /* newCols */ Double, Unit]] = js.native
    
    /**
      * Callback so you can save the layout.
      */
    var onLayoutChange: js.UndefOr[
        js.Function2[/* currentLayout */ js.Array[Layout], /* allLayouts */ Layouts, Unit]
      ] = js.native
    
    /**
      * Callback when the width changes, so you can modify the layout as needed.
      */
    var onWidthChange: js.UndefOr[
        js.Function4[
          /* containerWidth */ Double, 
          /* margin */ js.Tuple2[Double, Double], 
          /* cols */ Double, 
          /* containerPadding */ js.Tuple2[Double, Double], 
          Unit
        ]
      ] = js.native
  }
  object ResponsiveProps {
    
    @scala.inline
    def apply(): ResponsiveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveProps]
    }
    
    @scala.inline
    implicit class ResponsivePropsMutableBuilder[Self <: ResponsiveProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakpoints(value: StringDictionary[Double]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      @scala.inline
      def setCols(value: StringDictionary[Double]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setContainerPadding(value: (js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]])): Self = StObject.set(x, "containerPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerPaddingUndefined: Self = StObject.set(x, "containerPadding", js.undefined)
      
      @scala.inline
      def setLayouts(value: Layouts): Self = StObject.set(x, "layouts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutsUndefined: Self = StObject.set(x, "layouts", js.undefined)
      
      @scala.inline
      def setMargin(value: (js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]])): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOnBreakpointChange(value: (/* newBreakpoint */ String, /* newCols */ Double) => Unit): Self = StObject.set(x, "onBreakpointChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBreakpointChangeUndefined: Self = StObject.set(x, "onBreakpointChange", js.undefined)
      
      @scala.inline
      def setOnLayoutChange(value: (/* currentLayout */ js.Array[Layout], /* allLayouts */ Layouts) => Unit): Self = StObject.set(x, "onLayoutChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnLayoutChangeUndefined: Self = StObject.set(x, "onLayoutChange", js.undefined)
      
      @scala.inline
      def setOnWidthChange(
        value: (/* containerWidth */ Double, /* margin */ js.Tuple2[Double, Double], /* cols */ Double, /* containerPadding */ js.Tuple2[Double, Double]) => Unit
      ): Self = StObject.set(x, "onWidthChange", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnWidthChangeUndefined: Self = StObject.set(x, "onWidthChange", js.undefined)
    }
  }
  
  @js.native
  trait WidthProviderProps extends StObject {
    
    /**
      * If true, WidthProvider will measure the container's width before mounting children.
      * Use this if you'd like to completely eliminate any resizing animation on
      * application/component mount.
      */
    var measureBeforeMount: js.UndefOr[Boolean] = js.native
  }
  object WidthProviderProps {
    
    @scala.inline
    def apply(): WidthProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WidthProviderProps]
    }
    
    @scala.inline
    implicit class WidthProviderPropsMutableBuilder[Self <: WidthProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMeasureBeforeMount(value: Boolean): Self = StObject.set(x, "measureBeforeMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasureBeforeMountUndefined: Self = StObject.set(x, "measureBeforeMount", js.undefined)
    }
  }
}
