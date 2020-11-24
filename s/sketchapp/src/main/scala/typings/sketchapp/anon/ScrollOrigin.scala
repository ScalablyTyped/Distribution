package typings.sketchapp.anon

import typings.sketchapp.SketchMSCurvePoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollOrigin extends js.Object {
  
  var scrollOrigin: SketchMSCurvePoint = js.native
  
  var zoomValue: Double = js.native
}
object ScrollOrigin {
  
  @scala.inline
  def apply(scrollOrigin: SketchMSCurvePoint, zoomValue: Double): ScrollOrigin = {
    val __obj = js.Dynamic.literal(scrollOrigin = scrollOrigin.asInstanceOf[js.Any], zoomValue = zoomValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollOrigin]
  }
  
  @scala.inline
  implicit class ScrollOriginOps[Self <: ScrollOrigin] (val x: Self) extends AnyVal {
    
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
    def setScrollOrigin(value: SketchMSCurvePoint): Self = this.set("scrollOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomValue(value: Double): Self = this.set("zoomValue", value.asInstanceOf[js.Any])
  }
}
