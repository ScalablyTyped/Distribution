package typings.reactVis.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoronoiProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  // default: ''
  var extent: js.Array[js.Array[Double]]
  
  var nodes: js.Array[VoronoiPoint]
  
  var onBlur: js.UndefOr[RVMouseEventHandler] = js.undefined
  
  var onClick: js.UndefOr[RVMouseEventHandler] = js.undefined
  
  var onHover: js.UndefOr[RVMouseEventHandler] = js.undefined
  
  var onMouseDown: js.UndefOr[RVMouseEventHandler] = js.undefined
  
  var onMouseUp: js.UndefOr[RVMouseEventHandler] = js.undefined
  
  var x: js.UndefOr[js.Function1[/* d */ js.Any, Double]] = js.undefined
  
  var y: js.UndefOr[js.Function1[/* d */ js.Any, Double]] = js.undefined
}
object VoronoiProps {
  
  inline def apply(extent: js.Array[js.Array[Double]], nodes: js.Array[VoronoiPoint]): VoronoiProps = {
    val __obj = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoronoiProps]
  }
  
  extension [Self <: VoronoiProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setExtent(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentVarargs(value: js.Array[Double]*): Self = StObject.set(x, "extent", js.Array(value :_*))
    
    inline def setNodes(value: js.Array[VoronoiPoint]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: VoronoiPoint*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    inline def setOnBlur(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnHover(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
    
    inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
    
    inline def setOnMouseDown(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseUp(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setX(value: /* d */ js.Any => Double): Self = StObject.set(x, "x", js.Any.fromFunction1(value))
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: /* d */ js.Any => Double): Self = StObject.set(x, "y", js.Any.fromFunction1(value))
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
