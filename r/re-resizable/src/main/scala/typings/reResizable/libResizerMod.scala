package typings.reResizable

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.react.mod.TouchEvent
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResizerMod {
  
  @JSImport("re-resizable/lib/resizer", "Resizer")
  @js.native
  open class Resizer protected ()
    extends PureComponent[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
    
    def onMouseDown(e: MouseEvent[HTMLDivElement, NativeMouseEvent]): Unit = js.native
    
    def onTouchStart(e: TouchEvent[HTMLDivElement]): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reResizable.reResizableStrings.top
    - typings.reResizable.reResizableStrings.right
    - typings.reResizable.reResizableStrings.bottom
    - typings.reResizable.reResizableStrings.left
    - typings.reResizable.reResizableStrings.topRight
    - typings.reResizable.reResizableStrings.bottomRight
    - typings.reResizable.reResizableStrings.bottomLeft
    - typings.reResizable.reResizableStrings.topLeft
  */
  trait Direction extends StObject
  object Direction {
    
    inline def bottom: typings.reResizable.reResizableStrings.bottom = "bottom".asInstanceOf[typings.reResizable.reResizableStrings.bottom]
    
    inline def bottomLeft: typings.reResizable.reResizableStrings.bottomLeft = "bottomLeft".asInstanceOf[typings.reResizable.reResizableStrings.bottomLeft]
    
    inline def bottomRight: typings.reResizable.reResizableStrings.bottomRight = "bottomRight".asInstanceOf[typings.reResizable.reResizableStrings.bottomRight]
    
    inline def left: typings.reResizable.reResizableStrings.left = "left".asInstanceOf[typings.reResizable.reResizableStrings.left]
    
    inline def right: typings.reResizable.reResizableStrings.right = "right".asInstanceOf[typings.reResizable.reResizableStrings.right]
    
    inline def top: typings.reResizable.reResizableStrings.top = "top".asInstanceOf[typings.reResizable.reResizableStrings.top]
    
    inline def topLeft: typings.reResizable.reResizableStrings.topLeft = "topLeft".asInstanceOf[typings.reResizable.reResizableStrings.topLeft]
    
    inline def topRight: typings.reResizable.reResizableStrings.topRight = "topRight".asInstanceOf[typings.reResizable.reResizableStrings.topRight]
  }
  
  type OnStartCallback = js.Function2[
    /* e */ (MouseEvent[HTMLDivElement, NativeMouseEvent]) | TouchEvent[HTMLDivElement], 
    /* dir */ Direction, 
    Unit
  ]
  
  trait Props extends StObject {
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var direction: Direction
    
    var onResizeStart: OnStartCallback
    
    var replaceStyles: js.UndefOr[CSSProperties] = js.undefined
  }
  object Props {
    
    inline def apply(
      direction: Direction,
      onResizeStart: (/* e */ (MouseEvent[HTMLDivElement, NativeMouseEvent]) | TouchEvent[HTMLDivElement], /* dir */ Direction) => Unit
    ): Props = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], onResizeStart = js.Any.fromFunction2(onResizeStart))
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setOnResizeStart(
        value: (/* e */ (MouseEvent[HTMLDivElement, NativeMouseEvent]) | TouchEvent[HTMLDivElement], /* dir */ Direction) => Unit
      ): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction2(value))
      
      inline def setReplaceStyles(value: CSSProperties): Self = StObject.set(x, "replaceStyles", value.asInstanceOf[js.Any])
      
      inline def setReplaceStylesUndefined: Self = StObject.set(x, "replaceStyles", js.undefined)
    }
  }
}
