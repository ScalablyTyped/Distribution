package typings.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasOverlayProps extends BaseControlProps {
  
  def redraw(opts: CanvasRedrawOptions): Unit = js.native
}
object CanvasOverlayProps {
  
  @scala.inline
  def apply(redraw: CanvasRedrawOptions => Unit): CanvasOverlayProps = {
    val __obj = js.Dynamic.literal(redraw = js.Any.fromFunction1(redraw))
    __obj.asInstanceOf[CanvasOverlayProps]
  }
  
  @scala.inline
  implicit class CanvasOverlayPropsOps[Self <: CanvasOverlayProps] (val x: Self) extends AnyVal {
    
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
    def setRedraw(value: CanvasRedrawOptions => Unit): Self = this.set("redraw", js.Any.fromFunction1(value))
  }
}
