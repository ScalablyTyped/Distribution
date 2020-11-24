package typings.reactVis.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoronoiProps extends js.Object {
  
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
  implicit class VoronoiPropsOps[Self <: VoronoiProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExtentVarargs(value: js.Array[Double]*): Self = this.set("extent", js.Array(value :_*))
    
    @scala.inline
    def setExtent(value: js.Array[js.Array[Double]]): Self = this.set("extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: VoronoiPoint*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[VoronoiPoint]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setOnBlur(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnHover(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnHover: Self = this.set("onHover", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    
    @scala.inline
    def setX(value: /* d */ js.Any => Double): Self = this.set("x", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: /* d */ js.Any => Double): Self = this.set("y", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
