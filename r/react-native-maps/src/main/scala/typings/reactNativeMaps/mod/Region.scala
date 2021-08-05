package typings.reactNativeMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Region extends StObject {
  
  var latitude: Double
  
  var latitudeDelta: Double
  
  var longitude: Double
  
  var longitudeDelta: Double
}
object Region {
  
  inline def apply(latitude: Double, latitudeDelta: Double, longitude: Double, longitudeDelta: Double): Region = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], latitudeDelta = latitudeDelta.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], longitudeDelta = longitudeDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
  
  extension [Self <: Region](x: Self) {
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeDelta(value: Double): Self = StObject.set(x, "latitudeDelta", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeDelta(value: Double): Self = StObject.set(x, "longitudeDelta", value.asInstanceOf[js.Any])
  }
}
