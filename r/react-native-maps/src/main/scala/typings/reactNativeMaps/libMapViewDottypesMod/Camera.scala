package typings.reactNativeMaps.libMapViewDottypesMod

import typings.reactNativeMaps.libSharedTypesMod.LatLng
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Camera extends StObject {
  
  /**
    * Apple Maps
    */
  var altitude: js.UndefOr[Double] = js.undefined
  
  var center: LatLng
  
  var heading: Double
  
  var pitch: Double
  
  /**
    * Google Maps
    */
  var zoom: js.UndefOr[Double] = js.undefined
}
object Camera {
  
  inline def apply(center: LatLng, heading: Double, pitch: Double): Camera = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Camera]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Camera] (val x: Self) extends AnyVal {
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    inline def setCenter(value: LatLng): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
