package typings.reactNativeMaps.libMapViewDottypesMod

import typings.reactNativeMaps.libSharedTypesMod.LatLng
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoundingBox extends StObject {
  
  var northEast: LatLng
  
  var southWest: LatLng
}
object BoundingBox {
  
  inline def apply(northEast: LatLng, southWest: LatLng): BoundingBox = {
    val __obj = js.Dynamic.literal(northEast = northEast.asInstanceOf[js.Any], southWest = southWest.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoundingBox] (val x: Self) extends AnyVal {
    
    inline def setNorthEast(value: LatLng): Self = StObject.set(x, "northEast", value.asInstanceOf[js.Any])
    
    inline def setSouthWest(value: LatLng): Self = StObject.set(x, "southWest", value.asInstanceOf[js.Any])
  }
}
