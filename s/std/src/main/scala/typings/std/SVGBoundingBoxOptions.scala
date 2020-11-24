package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGBoundingBoxOptions extends js.Object {
  
  var clipped: js.UndefOr[scala.Boolean] = js.native
  
  var fill: js.UndefOr[scala.Boolean] = js.native
  
  var markers: js.UndefOr[scala.Boolean] = js.native
  
  var stroke: js.UndefOr[scala.Boolean] = js.native
}
object SVGBoundingBoxOptions {
  
  @scala.inline
  def apply(): SVGBoundingBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGBoundingBoxOptions]
  }
  
  @scala.inline
  implicit class SVGBoundingBoxOptionsOps[Self <: SVGBoundingBoxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClipped(value: scala.Boolean): Self = this.set("clipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipped: Self = this.set("clipped", js.undefined)
    
    @scala.inline
    def setFill(value: scala.Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setMarkers(value: scala.Boolean): Self = this.set("markers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkers: Self = this.set("markers", js.undefined)
    
    @scala.inline
    def setStroke(value: scala.Boolean): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
  }
}
