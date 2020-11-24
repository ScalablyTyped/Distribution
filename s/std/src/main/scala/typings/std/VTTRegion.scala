package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VTTRegion extends js.Object {
  
  var id: java.lang.String = js.native
  
  var lines: Double = js.native
  
  var regionAnchorX: Double = js.native
  
  var regionAnchorY: Double = js.native
  
  var scroll: ScrollSetting = js.native
  
  var viewportAnchorX: Double = js.native
  
  var viewportAnchorY: Double = js.native
  
  var width: Double = js.native
}
object VTTRegion {
  
  @scala.inline
  def apply(
    id: java.lang.String,
    lines: Double,
    regionAnchorX: Double,
    regionAnchorY: Double,
    scroll: ScrollSetting,
    viewportAnchorX: Double,
    viewportAnchorY: Double,
    width: Double
  ): VTTRegion = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], regionAnchorX = regionAnchorX.asInstanceOf[js.Any], regionAnchorY = regionAnchorY.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], viewportAnchorX = viewportAnchorX.asInstanceOf[js.Any], viewportAnchorY = viewportAnchorY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VTTRegion]
  }
  
  @scala.inline
  implicit class VTTRegionOps[Self <: VTTRegion] (val x: Self) extends AnyVal {
    
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
    def setId(value: java.lang.String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLines(value: Double): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionAnchorX(value: Double): Self = this.set("regionAnchorX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionAnchorY(value: Double): Self = this.set("regionAnchorY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScroll(value: ScrollSetting): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportAnchorX(value: Double): Self = this.set("viewportAnchorX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportAnchorY(value: Double): Self = this.set("viewportAnchorY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
