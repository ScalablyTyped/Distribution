package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTRegion) */
trait VTTRegion extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTRegion/id) */
  /* standard dom */
  var id: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTRegion/lines) */
  /* standard dom */
  var lines: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTRegion/regionAnchorX) */
  /* standard dom */
  var regionAnchorX: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTRegion/regionAnchorY) */
  /* standard dom */
  var regionAnchorY: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTRegion/scroll) */
  /* standard dom */
  var scroll: ScrollSetting
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTRegion/viewportAnchorX) */
  /* standard dom */
  var viewportAnchorX: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTRegion/viewportAnchorY) */
  /* standard dom */
  var viewportAnchorY: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTRegion/width) */
  /* standard dom */
  var width: Double
}
object VTTRegion {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: VTTRegion] (val x: Self) extends AnyVal {
    
    inline def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setRegionAnchorX(value: Double): Self = StObject.set(x, "regionAnchorX", value.asInstanceOf[js.Any])
    
    inline def setRegionAnchorY(value: Double): Self = StObject.set(x, "regionAnchorY", value.asInstanceOf[js.Any])
    
    inline def setScroll(value: ScrollSetting): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setViewportAnchorX(value: Double): Self = StObject.set(x, "viewportAnchorX", value.asInstanceOf[js.Any])
    
    inline def setViewportAnchorY(value: Double): Self = StObject.set(x, "viewportAnchorY", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
