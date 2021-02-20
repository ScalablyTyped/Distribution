package typings.reactVis.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoronoiProps extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  // default: ''
  var extent: js.Array[js.Array[Double]] = js.native
  
  var nodes: js.Array[VoronoiPoint] = js.native
  
  var onBlur: js.UndefOr[RVMouseEventHandler] = js.native
  
  var onClick: js.UndefOr[RVMouseEventHandler] = js.native
  
  var onHover: js.UndefOr[RVMouseEventHandler] = js.native
  
  var onMouseDown: js.UndefOr[RVMouseEventHandler] = js.native
  
  var onMouseUp: js.UndefOr[RVMouseEventHandler] = js.native
  
  var x: js.UndefOr[js.Function1[/* d */ js.Any, Double]] = js.native
  
  var y: js.UndefOr[js.Function1[/* d */ js.Any, Double]] = js.native
}
object VoronoiProps {
  
  @scala.inline
  def apply(extent: js.Array[js.Array[Double]], nodes: js.Array[VoronoiPoint]): VoronoiProps = {
    val __obj = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoronoiProps]
  }
  
  @scala.inline
  implicit class VoronoiPropsMutableBuilder[Self <: VoronoiProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setExtent(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtentVarargs(value: js.Array[Double]*): Self = StObject.set(x, "extent", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[VoronoiPoint]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: VoronoiPoint*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setOnBlur(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnHover(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    @scala.inline
    def setX(value: /* d */ js.Any => Double): Self = StObject.set(x, "x", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: /* d */ js.Any => Double): Self = StObject.set(x, "y", js.Any.fromFunction1(value))
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
