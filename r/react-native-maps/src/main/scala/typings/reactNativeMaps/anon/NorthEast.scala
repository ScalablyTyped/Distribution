package typings.reactNativeMaps.anon

import typings.reactNativeMaps.mod.LatLng
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NorthEast extends StObject {
  
  var northEast: LatLng
  
  var southWest: LatLng
}
object NorthEast {
  
  inline def apply(northEast: LatLng, southWest: LatLng): NorthEast = {
    val __obj = js.Dynamic.literal(northEast = northEast.asInstanceOf[js.Any], southWest = southWest.asInstanceOf[js.Any])
    __obj.asInstanceOf[NorthEast]
  }
  
  extension [Self <: NorthEast](x: Self) {
    
    inline def setNorthEast(value: LatLng): Self = StObject.set(x, "northEast", value.asInstanceOf[js.Any])
    
    inline def setSouthWest(value: LatLng): Self = StObject.set(x, "southWest", value.asInstanceOf[js.Any])
  }
}
