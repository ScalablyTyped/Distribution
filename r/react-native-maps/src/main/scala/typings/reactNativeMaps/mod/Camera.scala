package typings.reactNativeMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Camera extends StObject {
  
  var altitude: Double
  
  var center: LatLng
  
  var heading: Double
  
  var pitch: Double
  
  var zoom: Double
}
object Camera {
  
  inline def apply(altitude: Double, center: LatLng, heading: Double, pitch: Double, zoom: Double): Camera = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Camera]
  }
  
  extension [Self <: Camera](x: Self) {
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setCenter(value: LatLng): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
