package typings.reactNativeMaps.libMapViewDottypesMod

import typings.reactNativeMaps.libSharedTypesMod.LatLng
import typings.reactNativeMaps.libSharedTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlMarker extends StObject {
  
  var coordinate: LatLng
  
  var description: String
  
  var id: String
  
  var position: Point
  
  var title: String
}
object KmlMarker {
  
  inline def apply(coordinate: LatLng, description: String, id: String, position: Point, title: String): KmlMarker = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[KmlMarker]
  }
  
  extension [Self <: KmlMarker](x: Self) {
    
    inline def setCoordinate(value: LatLng): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
