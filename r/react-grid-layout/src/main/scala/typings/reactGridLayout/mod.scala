package typings.reactGridLayout

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactGridLayout.anon.H
import typings.reactGridLayout.anon.W
import typings.reactGridLayout.anon.layerXnumberlayerYnumberE
import typings.reactGridLayout.reactGridLayoutBooleans.`false`
import typings.reactGridLayout.reactGridLayoutStrings.horizontal
import typings.reactGridLayout.reactGridLayoutStrings.vertical
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-grid-layout", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[ReactGridLayoutProps, js.Object, Any]
  @JSImport("react-grid-layout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-grid-layout", "Responsive")
  @js.native
  open class Responsive protected ()
    extends Component[ResponsiveProps, js.Object, Any] {
    def this(props: ResponsiveProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ResponsiveProps, context: Any) = this()
  }
  
  inline def WidthProvider[P](component: ComponentClass[P, ComponentState]): ComponentClass[P & WidthProviderProps, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("WidthProvider")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[P & WidthProviderProps, ComponentState]]
  inline def WidthProvider[P](component: FunctionComponent[P]): ComponentClass[P & WidthProviderProps, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("WidthProvider")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[P & WidthProviderProps, ComponentState]]
  
  trait CoreProps extends StObject {
    
    /**
      * If true, grid can be placed one over the other.
      */
    var allowOverlap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the container height swells and contracts to fit contents.
      */
    var autoSize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The classname to add to the root element.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Compaction type.
      */
    var compactType: js.UndefOr[vertical | horizontal | Null] = js.undefined
    
    /**
      * A CSS selector for tags that will not be draggable.
      * For example: `draggableCancel: '.MyNonDraggableAreaClassName'`
      * If you forget the leading. it will not work.
      * "".react-resizable-handle" is always prepended to this value.
      */
    var draggableCancel: js.UndefOr[String] = js.undefined
    
    /**
      * A CSS selector for tags that will act as the draggable handle.
      * For example: `draggableHandle: '.MyDragHandleClassName'`
      * If you forget the leading . it will not work.
      */
    var draggableHandle: js.UndefOr[String] = js.undefined
    
    /**
      * Configuration of a dropping element. Dropping element is a "virtual" element
      * which appears when you drag over some element from outside.
      */
    var droppingItem: js.UndefOr[H] = js.undefined
    
    /**
      * Ref for getting a reference for the grid's wrapping div.
      * You can use this instead of a regular ref and the deprecated `ReactDOM.findDOMNode()`` function.
      */
    var innerRef: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
    
    /**
      * If true and draggable, all items will be moved only within grid.
      */
    var isBounded: js.UndefOr[Boolean] = js.undefined
    
    // Flags:
    /**
      * If set to false it will disable dragging on all children.
      */
    var isDraggable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, droppable elements (with `draggable={true}` attribute)
      * can be dropped on the grid. It triggers "onDrop" callback
      * with position and event object as parameters.
      * It can be useful for dropping an element in a specific position
      * NOTE: In case of using Firefox you should add
      * `onDragStart={e => e.dataTransfer.setData('text/plain', '')}` attribute
      * along with `draggable={true}` otherwise this feature will work incorrect.
      * onDragStart attribute is required for Firefox for a dragging initialization
      * @see https://bugzilla.mozilla.org/show_bug.cgi?id=568313
      */
    var isDroppable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to false it will disable resizing on all children.
      */
    var isResizable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default Infinity, but you can specify a max here if you like.
      * Note that this isn't fully fleshed out and won't error if you specify a layout that
      * extends beyond the row capacity. It will, however, not allow users to drag/resize
      * an item past the barrier. They can push items beyond the barrier, though.
      * Intentionally not documented for this reason.
      */
    var maxRows: js.UndefOr[Double] = js.undefined
    
    /**
      * Calls on each drag movement.
      */
    var onDrag: js.UndefOr[ItemCallback] = js.undefined
    
    /**
      * Calls when drag starts.
      */
    var onDragStart: js.UndefOr[ItemCallback] = js.undefined
    
    /**
      * Calls when drag is complete.
      */
    var onDragStop: js.UndefOr[ItemCallback] = js.undefined
    
    /**
      * Calls when some element has been dropped
      */
    var onDrop: js.UndefOr[
        js.Function3[/* layout */ js.Array[Layout], /* item */ Layout, /* e */ Event, Unit]
      ] = js.undefined
    
    /**
      * Calls when an element is being dragged over the grid from outside as above.
      * This callback should return an object to dynamically change the droppingItem size
      * Return false to short-circuit the dragover
      */
    var onDropDragOver: js.UndefOr[js.Function1[/* e */ DragOverEvent, js.UndefOr[W | `false`]]] = js.undefined
    
    /**
      * Calls when resize movement happens.
      */
    var onResize: js.UndefOr[ItemCallback] = js.undefined
    
    /**
      * Calls when resize starts.
      */
    var onResizeStart: js.UndefOr[ItemCallback] = js.undefined
    
    /**
      * Calls when resize is complete.
      */
    var onResizeStop: js.UndefOr[ItemCallback] = js.undefined
    
    /**
      * If true, grid items won't change position when being dragged over.
      */
    var preventCollision: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines custom component for resize handle
      */
    var resizeHandle: js.UndefOr[ReactNode | (js.Function1[/* resizeHandle */ ResizeHandle, ReactNode])] = js.undefined
    
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
    var resizeHandles: js.UndefOr[js.Array[ResizeHandle]] = js.undefined
    
    /**
      * Rows have a static height, but you can change this based on breakpoints if you like.
      */
    var rowHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Inline-style object to pass to the root element.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * If parent DOM node of ResponsiveReactGridLayout or ReactGridLayout has "transform: scale(n)" css property,
      * we should set scale coefficient to avoid render artefacts while dragging.
      */
    var transformScale: js.UndefOr[Double] = js.undefined
    
    /**
      * Uses CSS3 `translate()` instead of position top/left.
      * This makes about 6x faster paint performance.
      */
    var useCSSTransforms: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the layout will compact vertically.
      */
    var verticalCompact: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This allows setting the initial width on the server side.
      * This is required unless using the HOC <WidthProvider> or similar.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CoreProps {
    
    inline def apply(): CoreProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoreProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CoreProps] (val x: Self) extends AnyVal {
      
      inline def setAllowOverlap(value: Boolean): Self = StObject.set(x, "allowOverlap", value.asInstanceOf[js.Any])
      
      inline def setAllowOverlapUndefined: Self = StObject.set(x, "allowOverlap", js.undefined)
      
      inline def setAutoSize(value: Boolean): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
      
      inline def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCompactType(value: vertical | horizontal): Self = StObject.set(x, "compactType", value.asInstanceOf[js.Any])
      
      inline def setCompactTypeNull: Self = StObject.set(x, "compactType", null)
      
      inline def setCompactTypeUndefined: Self = StObject.set(x, "compactType", js.undefined)
      
      inline def setDraggableCancel(value: String): Self = StObject.set(x, "draggableCancel", value.asInstanceOf[js.Any])
      
      inline def setDraggableCancelUndefined: Self = StObject.set(x, "draggableCancel", js.undefined)
      
      inline def setDraggableHandle(value: String): Self = StObject.set(x, "draggableHandle", value.asInstanceOf[js.Any])
      
      inline def setDraggableHandleUndefined: Self = StObject.set(x, "draggableHandle", js.undefined)
      
      inline def setDroppingItem(value: H): Self = StObject.set(x, "droppingItem", value.asInstanceOf[js.Any])
      
      inline def setDroppingItemUndefined: Self = StObject.set(x, "droppingItem", js.undefined)
      
      inline def setInnerRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setIsBounded(value: Boolean): Self = StObject.set(x, "isBounded", value.asInstanceOf[js.Any])
      
      inline def setIsBoundedUndefined: Self = StObject.set(x, "isBounded", js.undefined)
      
      inline def setIsDraggable(value: Boolean): Self = StObject.set(x, "isDraggable", value.asInstanceOf[js.Any])
      
      inline def setIsDraggableUndefined: Self = StObject.set(x, "isDraggable", js.undefined)
      
      inline def setIsDroppable(value: Boolean): Self = StObject.set(x, "isDroppable", value.asInstanceOf[js.Any])
      
      inline def setIsDroppableUndefined: Self = StObject.set(x, "isDroppable", js.undefined)
      
      inline def setIsResizable(value: Boolean): Self = StObject.set(x, "isResizable", value.asInstanceOf[js.Any])
      
      inline def setIsResizableUndefined: Self = StObject.set(x, "isResizable", js.undefined)
      
      inline def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
      
      inline def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
      
      inline def setOnDrag(
        value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onDrag", js.Any.fromFunction6(value))
      
      inline def setOnDragStart(
        value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onDragStart", js.Any.fromFunction6(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragStop(
        value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onDragStop", js.Any.fromFunction6(value))
      
      inline def setOnDragStopUndefined: Self = StObject.set(x, "onDragStop", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: (/* layout */ js.Array[Layout], /* item */ Layout, /* e */ Event) => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction3(value))
      
      inline def setOnDropDragOver(value: /* e */ DragOverEvent => js.UndefOr[W | `false`]): Self = StObject.set(x, "onDropDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDropDragOverUndefined: Self = StObject.set(x, "onDropDragOver", js.undefined)
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnResize(
        value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onResize", js.Any.fromFunction6(value))
      
      inline def setOnResizeStart(
        value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction6(value))
      
      inline def setOnResizeStartUndefined: Self = StObject.set(x, "onResizeStart", js.undefined)
      
      inline def setOnResizeStop(
        value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onResizeStop", js.Any.fromFunction6(value))
      
      inline def setOnResizeStopUndefined: Self = StObject.set(x, "onResizeStop", js.undefined)
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setPreventCollision(value: Boolean): Self = StObject.set(x, "preventCollision", value.asInstanceOf[js.Any])
      
      inline def setPreventCollisionUndefined: Self = StObject.set(x, "preventCollision", js.undefined)
      
      inline def setResizeHandle(value: ReactNode | (js.Function1[/* resizeHandle */ ResizeHandle, ReactNode])): Self = StObject.set(x, "resizeHandle", value.asInstanceOf[js.Any])
      
      inline def setResizeHandleFunction1(value: /* resizeHandle */ ResizeHandle => ReactNode): Self = StObject.set(x, "resizeHandle", js.Any.fromFunction1(value))
      
      inline def setResizeHandleUndefined: Self = StObject.set(x, "resizeHandle", js.undefined)
      
      inline def setResizeHandles(value: js.Array[ResizeHandle]): Self = StObject.set(x, "resizeHandles", value.asInstanceOf[js.Any])
      
      inline def setResizeHandlesUndefined: Self = StObject.set(x, "resizeHandles", js.undefined)
      
      inline def setResizeHandlesVarargs(value: ResizeHandle*): Self = StObject.set(x, "resizeHandles", js.Array(value*))
      
      inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTransformScale(value: Double): Self = StObject.set(x, "transformScale", value.asInstanceOf[js.Any])
      
      inline def setTransformScaleUndefined: Self = StObject.set(x, "transformScale", js.undefined)
      
      inline def setUseCSSTransforms(value: Boolean): Self = StObject.set(x, "useCSSTransforms", value.asInstanceOf[js.Any])
      
      inline def setUseCSSTransformsUndefined: Self = StObject.set(x, "useCSSTransforms", js.undefined)
      
      inline def setVerticalCompact(value: Boolean): Self = StObject.set(x, "verticalCompact", value.asInstanceOf[js.Any])
      
      inline def setVerticalCompactUndefined: Self = StObject.set(x, "verticalCompact", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait DragOverEvent
    extends StObject
       with MouseEvent {
    
    var nativeEvent: layerXnumberlayerYnumberE = js.native
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
  
  trait Layout extends StObject {
    
    /**
      * Height in grid units.
      */
    var h: Double
    
    /**
      * A string corresponding to the component key.
      * Uses the index of components instead if not provided.
      */
    var i: String
    
    /**
      * If true and draggable, item will be moved only within grid.
      */
    var isBounded: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If false, will not be draggable. Overrides `static`.
      */
    var isDraggable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If false, will not be resizable. Overrides `static`.
      */
    var isResizable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum height in grid units.
      */
    var maxH: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum width in grid units.
      */
    var maxW: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum height in grid units.
      */
    var minH: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum width in grid units.
      */
    var minW: js.UndefOr[Double] = js.undefined
    
    /**
      * set by DragEvents (onDragStart, onDrag, onDragStop) and ResizeEvents (onResizeStart, onResize, onResizeStop)
      */
    var moved: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, a handle is only shown on the bottom-right (southeast) corner.
      * Note that resizing from the top or left is generally not intuitive.
      */
    var resizeHandles: js.UndefOr[js.Array[ResizeHandle]] = js.undefined
    
    /**
      * If true, equal to `isDraggable: false` and `isResizable: false`.
      */
    var static: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Width in grid units.
      */
    var w: Double
    
    /**
      * X position in grid units.
      */
    var x: Double
    
    /**
      * Y position in grid units.
      */
    var y: Double
  }
  object Layout {
    
    inline def apply(h: Double, i: String, w: Double, x: Double, y: Double): Layout = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Layout]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Layout] (val x: Self) extends AnyVal {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setI(value: String): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setIsBounded(value: Boolean): Self = StObject.set(x, "isBounded", value.asInstanceOf[js.Any])
      
      inline def setIsBoundedUndefined: Self = StObject.set(x, "isBounded", js.undefined)
      
      inline def setIsDraggable(value: Boolean): Self = StObject.set(x, "isDraggable", value.asInstanceOf[js.Any])
      
      inline def setIsDraggableUndefined: Self = StObject.set(x, "isDraggable", js.undefined)
      
      inline def setIsResizable(value: Boolean): Self = StObject.set(x, "isResizable", value.asInstanceOf[js.Any])
      
      inline def setIsResizableUndefined: Self = StObject.set(x, "isResizable", js.undefined)
      
      inline def setMaxH(value: Double): Self = StObject.set(x, "maxH", value.asInstanceOf[js.Any])
      
      inline def setMaxHUndefined: Self = StObject.set(x, "maxH", js.undefined)
      
      inline def setMaxW(value: Double): Self = StObject.set(x, "maxW", value.asInstanceOf[js.Any])
      
      inline def setMaxWUndefined: Self = StObject.set(x, "maxW", js.undefined)
      
      inline def setMinH(value: Double): Self = StObject.set(x, "minH", value.asInstanceOf[js.Any])
      
      inline def setMinHUndefined: Self = StObject.set(x, "minH", js.undefined)
      
      inline def setMinW(value: Double): Self = StObject.set(x, "minW", value.asInstanceOf[js.Any])
      
      inline def setMinWUndefined: Self = StObject.set(x, "minW", js.undefined)
      
      inline def setMoved(value: Boolean): Self = StObject.set(x, "moved", value.asInstanceOf[js.Any])
      
      inline def setMovedUndefined: Self = StObject.set(x, "moved", js.undefined)
      
      inline def setResizeHandles(value: js.Array[ResizeHandle]): Self = StObject.set(x, "resizeHandles", value.asInstanceOf[js.Any])
      
      inline def setResizeHandlesUndefined: Self = StObject.set(x, "resizeHandles", js.undefined)
      
      inline def setResizeHandlesVarargs(value: ResizeHandle*): Self = StObject.set(x, "resizeHandles", js.Array(value*))
      
      inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type Layouts = StringDictionary[js.Array[Layout]]
  
  type ReactGridLayout = Component[ReactGridLayoutProps, js.Object, Any]
  
  trait ReactGridLayoutProps
    extends StObject
       with CoreProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Number of columns in this layout.
      */
    var cols: js.UndefOr[Double] = js.undefined
    
    /**
      * Padding inside the container `[x, y]` in px.
      */
    var containerPadding: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
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
    var layout: js.UndefOr[js.Array[Layout]] = js.undefined
    
    /**
      * Margin between items `[x, y]` in px.
      */
    var margin: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    /**
      * Callback so you can save the layout.
      * Calls back with (currentLayout) after every drag or resize stop.
      */
    var onLayoutChange: js.UndefOr[js.Function1[/* layout */ js.Array[Layout], Unit]] = js.undefined
  }
  object ReactGridLayoutProps {
    
    inline def apply(): ReactGridLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactGridLayoutProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactGridLayoutProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setContainerPadding(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "containerPadding", value.asInstanceOf[js.Any])
      
      inline def setContainerPaddingUndefined: Self = StObject.set(x, "containerPadding", js.undefined)
      
      inline def setLayout(value: js.Array[Layout]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setLayoutVarargs(value: Layout*): Self = StObject.set(x, "layout", js.Array(value*))
      
      inline def setMargin(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOnLayoutChange(value: /* layout */ js.Array[Layout] => Unit): Self = StObject.set(x, "onLayoutChange", js.Any.fromFunction1(value))
      
      inline def setOnLayoutChangeUndefined: Self = StObject.set(x, "onLayoutChange", js.undefined)
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
    
    inline def e: typings.reactGridLayout.reactGridLayoutStrings.e = "e".asInstanceOf[typings.reactGridLayout.reactGridLayoutStrings.e]
    
    inline def n: typings.reactGridLayout.reactGridLayoutStrings.n = "n".asInstanceOf[typings.reactGridLayout.reactGridLayoutStrings.n]
    
    inline def ne: typings.reactGridLayout.reactGridLayoutStrings.ne = "ne".asInstanceOf[typings.reactGridLayout.reactGridLayoutStrings.ne]
    
    inline def nw: typings.reactGridLayout.reactGridLayoutStrings.nw = "nw".asInstanceOf[typings.reactGridLayout.reactGridLayoutStrings.nw]
    
    inline def s: typings.reactGridLayout.reactGridLayoutStrings.s = "s".asInstanceOf[typings.reactGridLayout.reactGridLayoutStrings.s]
    
    inline def se: typings.reactGridLayout.reactGridLayoutStrings.se = "se".asInstanceOf[typings.reactGridLayout.reactGridLayoutStrings.se]
    
    inline def sw: typings.reactGridLayout.reactGridLayoutStrings.sw = "sw".asInstanceOf[typings.reactGridLayout.reactGridLayoutStrings.sw]
    
    inline def w: typings.reactGridLayout.reactGridLayoutStrings.w = "w".asInstanceOf[typings.reactGridLayout.reactGridLayoutStrings.w]
  }
  
  trait ResponsiveProps
    extends StObject
       with CoreProps {
    
    /**
      * Optional, but if you are managing width yourself you may want to set the breakpoint
      * yourself as well.
      */
    var breakpoint: js.UndefOr[String] = js.undefined
    
    /**
      * `{name: pxVal}, e.g. {lg: 1200, md: 996, sm: 768, xs: 480}`
      * Breakpoint names are arbitrary but must match in the cols and layouts objects.
      */
    var breakpoints: js.UndefOr[StringDictionary[Double]] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Number of cols. This is a breakpoint -> cols map, e.g. `{lg: 12, md: 10, ...}`.
      */
    var cols: js.UndefOr[StringDictionary[Double]] = js.undefined
    
    /**
      * Number of containerPadding. This is a breakpoint -> containerPadding map
      * e.g. { lg: [5, 5], md: [10, 10], sm: [15, 15] }
      * Padding inside the container [x, y] in px
      * e.g. [10, 10]
      */
    var containerPadding: js.UndefOr[(js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]])] = js.undefined
    
    /**
      * Layouts is an object mapping breakpoints to layouts.
      * e.g. `{lg: Layout[], md: Layout[], ...}`
      */
    var layouts: js.UndefOr[Layouts] = js.undefined
    
    /**
      * Number of margin. This is a breakpoint -> margin map
      * e.g. { lg: [5, 5], md: [10, 10], sm: [15, 15] }
      * Margin between items [x, y] in px
      * e.g. [10, 10]
      */
    var margin: js.UndefOr[(js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]])] = js.undefined
    
    /**
      * Calls back with breakpoint and new number pf cols.
      */
    var onBreakpointChange: js.UndefOr[js.Function2[/* newBreakpoint */ String, /* newCols */ Double, Unit]] = js.undefined
    
    /**
      * Callback so you can save the layout.
      * Calls back with (currentLayout, allLayouts). allLayouts are keyed by breakpoint.
      */
    var onLayoutChange: js.UndefOr[
        js.Function2[/* currentLayout */ js.Array[Layout], /* allLayouts */ Layouts, Unit]
      ] = js.undefined
    
    /**
      * Callback that triggers when the width changes, so you can modify the layout as needed.
      * Calls back with (containerWidth, margin, cols, containerPadding)
      */
    var onWidthChange: js.UndefOr[
        js.Function4[
          /* containerWidth */ Double, 
          /* margin */ js.Tuple2[Double, Double], 
          /* cols */ Double, 
          /* containerPadding */ js.Tuple2[Double, Double], 
          Unit
        ]
      ] = js.undefined
  }
  object ResponsiveProps {
    
    inline def apply(): ResponsiveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponsiveProps] (val x: Self) extends AnyVal {
      
      inline def setBreakpoint(value: String): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
      
      inline def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
      
      inline def setBreakpoints(value: StringDictionary[Double]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCols(value: StringDictionary[Double]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setContainerPadding(value: (js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]])): Self = StObject.set(x, "containerPadding", value.asInstanceOf[js.Any])
      
      inline def setContainerPaddingUndefined: Self = StObject.set(x, "containerPadding", js.undefined)
      
      inline def setLayouts(value: Layouts): Self = StObject.set(x, "layouts", value.asInstanceOf[js.Any])
      
      inline def setLayoutsUndefined: Self = StObject.set(x, "layouts", js.undefined)
      
      inline def setMargin(value: (js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]])): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOnBreakpointChange(value: (/* newBreakpoint */ String, /* newCols */ Double) => Unit): Self = StObject.set(x, "onBreakpointChange", js.Any.fromFunction2(value))
      
      inline def setOnBreakpointChangeUndefined: Self = StObject.set(x, "onBreakpointChange", js.undefined)
      
      inline def setOnLayoutChange(value: (/* currentLayout */ js.Array[Layout], /* allLayouts */ Layouts) => Unit): Self = StObject.set(x, "onLayoutChange", js.Any.fromFunction2(value))
      
      inline def setOnLayoutChangeUndefined: Self = StObject.set(x, "onLayoutChange", js.undefined)
      
      inline def setOnWidthChange(
        value: (/* containerWidth */ Double, /* margin */ js.Tuple2[Double, Double], /* cols */ Double, /* containerPadding */ js.Tuple2[Double, Double]) => Unit
      ): Self = StObject.set(x, "onWidthChange", js.Any.fromFunction4(value))
      
      inline def setOnWidthChangeUndefined: Self = StObject.set(x, "onWidthChange", js.undefined)
    }
  }
  
  trait WidthProviderProps extends StObject {
    
    /**
      * If true, WidthProvider will measure the container's width before mounting children.
      * Use this if you'd like to completely eliminate any resizing animation on
      * application/component mount.
      */
    var measureBeforeMount: js.UndefOr[Boolean] = js.undefined
  }
  object WidthProviderProps {
    
    inline def apply(): WidthProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WidthProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WidthProviderProps] (val x: Self) extends AnyVal {
      
      inline def setMeasureBeforeMount(value: Boolean): Self = StObject.set(x, "measureBeforeMount", value.asInstanceOf[js.Any])
      
      inline def setMeasureBeforeMountUndefined: Self = StObject.set(x, "measureBeforeMount", js.undefined)
    }
  }
}
