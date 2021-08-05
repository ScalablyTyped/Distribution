package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to reflect the zoomAndPan attribute, and is mixed in to other interfaces for elements that support this attribute. */
trait SVGZoomAndPan extends StObject {
  
  val zoomAndPan: Double
}
object SVGZoomAndPan {
  
  inline def apply(zoomAndPan: Double): SVGZoomAndPan = {
    val __obj = js.Dynamic.literal(zoomAndPan = zoomAndPan.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGZoomAndPan]
  }
  
  extension [Self <: SVGZoomAndPan](x: Self) {
    
    inline def setZoomAndPan(value: Double): Self = StObject.set(x, "zoomAndPan", value.asInstanceOf[js.Any])
  }
}
