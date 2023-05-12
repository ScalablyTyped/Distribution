package typings.reactResizable

import typings.react.mod.Component
import typings.reactResizable.anon.Height
import typings.reactResizable.anon.Style
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-resizable", "Resizable")
  @js.native
  open class Resizable protected () extends Component[ResizableProps, ResizableState, Any] {
    def this(props: ResizableProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ResizableProps, context: Any) = this()
  }
  
  @JSImport("react-resizable", "ResizableBox")
  @js.native
  open class ResizableBox protected () extends Component[ResizableBoxProps, ResizableBoxState, Any] {
    def this(props: ResizableBoxProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ResizableBoxProps, context: Any) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactResizable.reactResizableStrings.both
    - typings.reactResizable.reactResizableStrings.x
    - typings.reactResizable.reactResizableStrings.y
    - typings.reactResizable.reactResizableStrings.none
  */
  trait Axis extends StObject
  object Axis {
    
    inline def both: typings.reactResizable.reactResizableStrings.both = "both".asInstanceOf[typings.reactResizable.reactResizableStrings.both]
    
    inline def none: typings.reactResizable.reactResizableStrings.none = "none".asInstanceOf[typings.reactResizable.reactResizableStrings.none]
    
    inline def x: typings.reactResizable.reactResizableStrings.x = "x".asInstanceOf[typings.reactResizable.reactResizableStrings.x]
    
    inline def y: typings.reactResizable.reactResizableStrings.y = "y".asInstanceOf[typings.reactResizable.reactResizableStrings.y]
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
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: DragCallbackData] (val x: Self) extends AnyVal {
      
      inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      inline def setLastX(value: Double): Self = StObject.set(x, "lastX", value.asInstanceOf[js.Any])
      
      inline def setLastY(value: Double): Self = StObject.set(x, "lastY", value.asInstanceOf[js.Any])
      
      inline def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type ResizableBoxProps = ResizableProps & Style
  
  trait ResizableBoxState extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object ResizableBoxState {
    
    inline def apply(height: Double, width: Double): ResizableBoxState = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizableBoxState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResizableBoxState] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactResizable.anon.widthnumberheightnumberun
    - typings.reactResizable.anon.widthnumberundefinedheigh
    - typings.reactResizable.anon.widthnumberheightnumberax
  */
  trait ResizableProps extends StObject
  object ResizableProps {
    
    inline def widthnumberheightnumberax(height: Double, width: Double): typings.reactResizable.anon.widthnumberheightnumberax = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactResizable.anon.widthnumberheightnumberax]
    }
    
    inline def widthnumberheightnumberun(width: Double): typings.reactResizable.anon.widthnumberheightnumberun = {
      val __obj = js.Dynamic.literal(axis = "x", width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactResizable.anon.widthnumberheightnumberun]
    }
    
    inline def widthnumberundefinedheigh(height: Double): typings.reactResizable.anon.widthnumberundefinedheigh = {
      val __obj = js.Dynamic.literal(axis = "y", height = height.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactResizable.anon.widthnumberundefinedheigh]
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
    
    inline def apply(height: Double, resizing: Boolean, slackH: Double, slackW: Double, width: Double): ResizableState = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], resizing = resizing.asInstanceOf[js.Any], slackH = slackH.asInstanceOf[js.Any], slackW = slackW.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizableState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResizableState] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setResizing(value: Boolean): Self = StObject.set(x, "resizing", value.asInstanceOf[js.Any])
      
      inline def setSlackH(value: Double): Self = StObject.set(x, "slackH", value.asInstanceOf[js.Any])
      
      inline def setSlackW(value: Double): Self = StObject.set(x, "slackW", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResizeCallbackData extends StObject {
    
    var handle: ResizeHandle
    
    var node: HTMLElement
    
    var size: Height
  }
  object ResizeCallbackData {
    
    inline def apply(handle: ResizeHandle, node: HTMLElement, size: Height): ResizeCallbackData = {
      val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeCallbackData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResizeCallbackData] (val x: Self) extends AnyVal {
      
      inline def setHandle(value: ResizeHandle): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
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
    
    inline def e: typings.reactResizable.reactResizableStrings.e = "e".asInstanceOf[typings.reactResizable.reactResizableStrings.e]
    
    inline def n: typings.reactResizable.reactResizableStrings.n = "n".asInstanceOf[typings.reactResizable.reactResizableStrings.n]
    
    inline def ne: typings.reactResizable.reactResizableStrings.ne = "ne".asInstanceOf[typings.reactResizable.reactResizableStrings.ne]
    
    inline def nw: typings.reactResizable.reactResizableStrings.nw = "nw".asInstanceOf[typings.reactResizable.reactResizableStrings.nw]
    
    inline def s: typings.reactResizable.reactResizableStrings.s = "s".asInstanceOf[typings.reactResizable.reactResizableStrings.s]
    
    inline def se: typings.reactResizable.reactResizableStrings.se = "se".asInstanceOf[typings.reactResizable.reactResizableStrings.se]
    
    inline def sw: typings.reactResizable.reactResizableStrings.sw = "sw".asInstanceOf[typings.reactResizable.reactResizableStrings.sw]
    
    inline def w: typings.reactResizable.reactResizableStrings.w = "w".asInstanceOf[typings.reactResizable.reactResizableStrings.w]
  }
}
