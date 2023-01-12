package typings.reactNativeMaps.anon

import typings.reactNativeMaps.libSharedTypesMod.LatLng
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var coordinate: LatLng
  
  var name: String
  
  var placeId: String
  
  /**
    * @platform Android
    */
  var position: js.UndefOr[typings.reactNativeMaps.libSharedTypesMod.Point] = js.undefined
}
object Name {
  
  inline def apply(coordinate: LatLng, name: String, placeId: String): Name = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], placeId = placeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    inline def setCoordinate(value: LatLng): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: typings.reactNativeMaps.libSharedTypesMod.Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
