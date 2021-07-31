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
  
  @scala.inline
  def apply(northEast: LatLng, southWest: LatLng): NorthEast = {
    val __obj = js.Dynamic.literal(northEast = northEast.asInstanceOf[js.Any], southWest = southWest.asInstanceOf[js.Any])
    __obj.asInstanceOf[NorthEast]
  }
  
  @scala.inline
  implicit class NorthEastMutableBuilder[Self <: NorthEast] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNorthEast(value: LatLng): Self = StObject.set(x, "northEast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSouthWest(value: LatLng): Self = StObject.set(x, "southWest", value.asInstanceOf[js.Any])
  }
}
