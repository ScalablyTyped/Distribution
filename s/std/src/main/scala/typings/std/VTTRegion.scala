package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VTTRegion extends StObject {
  
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
  implicit class VTTRegionMutableBuilder[Self <: VTTRegion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionAnchorX(value: Double): Self = StObject.set(x, "regionAnchorX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionAnchorY(value: Double): Self = StObject.set(x, "regionAnchorY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScroll(value: ScrollSetting): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportAnchorX(value: Double): Self = StObject.set(x, "viewportAnchorX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportAnchorY(value: Double): Self = StObject.set(x, "viewportAnchorY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
