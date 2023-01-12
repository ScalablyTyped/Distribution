package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGBoundingBoxOptions extends StObject {
  
  /* standard dom */
  var clipped: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var markers: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var stroke: js.UndefOr[scala.Boolean] = js.undefined
}
object SVGBoundingBoxOptions {
  
  inline def apply(): SVGBoundingBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGBoundingBoxOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGBoundingBoxOptions] (val x: Self) extends AnyVal {
    
    inline def setClipped(value: scala.Boolean): Self = StObject.set(x, "clipped", value.asInstanceOf[js.Any])
    
    inline def setClippedUndefined: Self = StObject.set(x, "clipped", js.undefined)
    
    inline def setFill(value: scala.Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setMarkers(value: scala.Boolean): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
    
    inline def setStroke(value: scala.Boolean): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
