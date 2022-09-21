package typings.redisClient.genericTransformersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoCoordinates extends StObject {
  
  var latitude: String | Double
  
  var longitude: String | Double
}
object GeoCoordinates {
  
  inline def apply(latitude: String | Double, longitude: String | Double): GeoCoordinates = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoCoordinates]
  }
  
  extension [Self <: GeoCoordinates](x: Self) {
    
    inline def setLatitude(value: String | Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: String | Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
