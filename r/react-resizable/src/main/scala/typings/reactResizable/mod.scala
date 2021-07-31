package typings.reactResizable

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.reactResizable.anon.Height
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-resizable", "Resizable")
  @js.native
  class Resizable protected ()
    extends Component[ResizableProps, ResizableState, js.Any] {
    def this(props: ResizableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ResizableProps, context: js.Any) = this()
  }
  
  @JSImport("react-resizable", "ResizableBox")
  @js.native
  class ResizableBox protected ()
    extends Component[ResizableBoxProps, ResizableBoxState, js.Any] {
    def this(props: ResizableBoxProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ResizableBoxProps, context: js.Any) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactResizable.reactResizableStrings.both
    - typings.reactResizable.reactResizableStrings.x
    - typings.reactResizable.reactResizableStrings.y
    - typings.reactResizable.reactResizableStrings.none
  */
  trait Axis extends StObject
  object Axis {
    
    @scala.inline
    def both: typings.reactResizable.reactResizableStrings.both = "both".asInstanceOf[typings.reactResizable.reactResizableStrings.both]
    
    @scala.inline
    def none: typings.reactResizable.reactResizableStrings.none = "none".asInstanceOf[typings.reactResizable.reactResizableStrings.none]
    
    @scala.inline
    def x: typings.reactResizable.reactResizableStrings.x = "x".asInstanceOf[typings.reactResizable.reactResizableStrings.x]
    
    @scala.inline
    def y: typings.reactResizable.reactResizableStrings.y = "y".asInstanceOf[typings.reactResizable.reactResizableStrings.y]
  }
  
  trait DragCallbackData extends StObject {
    
    var deltaX: Double
    
    var deltaY: Double
    
    var lastX: Double
    
    var lastY: Double
    
    var node: HTMLElement
    
    var x: Double
    
    var y: Double
  }
  object DragCallbackData {
    
    @scala.inline
    def apply(
      deltaX: Double,
      deltaY: Double,
      lastX: Double,
      lastY: Double,
      node: HTMLElement,
      x: Double,
      y: Double
    ): DragCallbackData = {
      val __obj = js.Dynamic.literal(deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], lastX = lastX.asInstanceOf[js.Any], lastY = lastY.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragCallbackData]
    }
    
    @scala.inline
    implicit class DragCallbackDataMutableBuilder[Self <: DragCallbackData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastX(value: Double): Self = StObject.set(x, "lastX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastY(value: Double): Self = StObject.set(x, "lastY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type ResizableBoxProps = ResizableProps
  
  trait ResizableBoxState extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object ResizableBoxState {
    
    @scala.inline
    def apply(height: Double, width: Double): ResizableBoxState = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizableBoxState]
    }
    
    @scala.inline
    implicit class ResizableBoxStateMutableBuilder[Self <: ResizableBoxState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResizableProps extends StObject {
    
    var axis: js.UndefOr[Axis] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var draggableOpts: js.UndefOr[js.Any] = js.undefined
    
    var handle: js.UndefOr[ReactNode | (js.Function1[/* resizeHandle */ ResizeHandle, ReactNode])] = js.undefined
    
    var handleSize: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var height: Double
    
    var lockAspectRatio: js.UndefOr[Boolean] = js.undefined
    
    var maxConstraints: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var minConstraints: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var onResize: js.UndefOr[
        js.Function2[/* e */ SyntheticEvent[Element, Event], /* data */ ResizeCallbackData, js.Any]
      ] = js.undefined
    
    var onResizeStart: js.UndefOr[
        js.Function2[/* e */ SyntheticEvent[Element, Event], /* data */ ResizeCallbackData, js.Any]
      ] = js.undefined
    
    var onResizeStop: js.UndefOr[
        js.Function2[/* e */ SyntheticEvent[Element, Event], /* data */ ResizeCallbackData, js.Any]
      ] = js.undefined
    
    var resizeHandles: js.UndefOr[js.Array[ResizeHandle]] = js.undefined
    
    var width: Double
  }
  object ResizableProps {
    
    @scala.inline
    def apply(height: Double, width: Double): ResizableProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizableProps]
    }
    
    @scala.inline
    implicit class ResizablePropsMutableBuilder[Self <: ResizableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: Axis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDraggableOpts(value: js.Any): Self = StObject.set(x, "draggableOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableOptsUndefined: Self = StObject.set(x, "draggableOpts", js.undefined)
      
      @scala.inline
      def setHandle(value: ReactNode | (js.Function1[/* resizeHandle */ ResizeHandle, ReactNode])): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleFunction1(value: /* resizeHandle */ ResizeHandle => ReactNode): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleSize(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "handleSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleSizeUndefined: Self = StObject.set(x, "handleSize", js.undefined)
      
      @scala.inline
      def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockAspectRatio(value: Boolean): Self = StObject.set(x, "lockAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockAspectRatioUndefined: Self = StObject.set(x, "lockAspectRatio", js.undefined)
      
      @scala.inline
      def setMaxConstraints(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "maxConstraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConstraintsUndefined: Self = StObject.set(x, "maxConstraints", js.undefined)
      
      @scala.inline
      def setMinConstraints(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "minConstraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinConstraintsUndefined: Self = StObject.set(x, "minConstraints", js.undefined)
      
      @scala.inline
      def setOnResize(value: (/* e */ SyntheticEvent[Element, Event], /* data */ ResizeCallbackData) => js.Any): Self = StObject.set(x, "onResize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnResizeStart(value: (/* e */ SyntheticEvent[Element, Event], /* data */ ResizeCallbackData) => js.Any): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnResizeStartUndefined: Self = StObject.set(x, "onResizeStart", js.undefined)
      
      @scala.inline
      def setOnResizeStop(value: (/* e */ SyntheticEvent[Element, Event], /* data */ ResizeCallbackData) => js.Any): Self = StObject.set(x, "onResizeStop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnResizeStopUndefined: Self = StObject.set(x, "onResizeStop", js.undefined)
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setResizeHandles(value: js.Array[ResizeHandle]): Self = StObject.set(x, "resizeHandles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeHandlesUndefined: Self = StObject.set(x, "resizeHandles", js.undefined)
      
      @scala.inline
      def setResizeHandlesVarargs(value: ResizeHandle*): Self = StObject.set(x, "resizeHandles", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResizableState extends StObject {
    
    var height: Double
    
    var resizing: Boolean
    
    var slackH: Double
    
    var slackW: Double
    
    var width: Double
  }
  object ResizableState {
    
    @scala.inline
    def apply(height: Double, resizing: Boolean, slackH: Double, slackW: Double, width: Double): ResizableState = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], resizing = resizing.asInstanceOf[js.Any], slackH = slackH.asInstanceOf[js.Any], slackW = slackW.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizableState]
    }
    
    @scala.inline
    implicit class ResizableStateMutableBuilder[Self <: ResizableState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizing(value: Boolean): Self = StObject.set(x, "resizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlackH(value: Double): Self = StObject.set(x, "slackH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlackW(value: Double): Self = StObject.set(x, "slackW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResizeCallbackData extends StObject {
    
    var handle: ResizeHandle
    
    var node: HTMLElement
    
    var size: Height
  }
  object ResizeCallbackData {
    
    @scala.inline
    def apply(handle: ResizeHandle, node: HTMLElement, size: Height): ResizeCallbackData = {
      val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeCallbackData]
    }
    
    @scala.inline
    implicit class ResizeCallbackDataMutableBuilder[Self <: ResizeCallbackData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandle(value: ResizeHandle): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactResizable.reactResizableStrings.s
    - typings.reactResizable.reactResizableStrings.w
    - typings.reactResizable.reactResizableStrings.e
    - typings.reactResizable.reactResizableStrings.n
    - typings.reactResizable.reactResizableStrings.sw
    - typings.reactResizable.reactResizableStrings.nw
    - typings.reactResizable.reactResizableStrings.se
    - typings.reactResizable.reactResizableStrings.ne
  */
  trait ResizeHandle extends StObject
  object ResizeHandle {
    
    @scala.inline
    def e: typings.reactResizable.reactResizableStrings.e = "e".asInstanceOf[typings.reactResizable.reactResizableStrings.e]
    
    @scala.inline
    def n: typings.reactResizable.reactResizableStrings.n = "n".asInstanceOf[typings.reactResizable.reactResizableStrings.n]
    
    @scala.inline
    def ne: typings.reactResizable.reactResizableStrings.ne = "ne".asInstanceOf[typings.reactResizable.reactResizableStrings.ne]
    
    @scala.inline
    def nw: typings.reactResizable.reactResizableStrings.nw = "nw".asInstanceOf[typings.reactResizable.reactResizableStrings.nw]
    
    @scala.inline
    def s: typings.reactResizable.reactResizableStrings.s = "s".asInstanceOf[typings.reactResizable.reactResizableStrings.s]
    
    @scala.inline
    def se: typings.reactResizable.reactResizableStrings.se = "se".asInstanceOf[typings.reactResizable.reactResizableStrings.se]
    
    @scala.inline
    def sw: typings.reactResizable.reactResizableStrings.sw = "sw".asInstanceOf[typings.reactResizable.reactResizableStrings.sw]
    
    @scala.inline
    def w: typings.reactResizable.reactResizableStrings.w = "w".asInstanceOf[typings.reactResizable.reactResizableStrings.w]
  }
}
