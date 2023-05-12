package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoCoordinateInput extends StObject {
  
  var latitude: Double
  
  var longitude: Double
}
object GeoCoordinateInput {
  
  inline def apply(latitude: Double, longitude: Double): GeoCoordinateInput = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoCoordinateInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoCoordinateInput] (val x: Self) extends AnyVal {
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
