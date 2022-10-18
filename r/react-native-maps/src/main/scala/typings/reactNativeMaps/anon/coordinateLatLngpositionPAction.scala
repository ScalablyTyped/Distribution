package typings.reactNativeMaps.anon

import typings.reactNativeMaps.libSharedTypesMod.LatLng
import typings.reactNativeMaps.reactNativeMapsStrings.`marker-select`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  coordinate :react-native-maps.react-native-maps/lib/sharedTypes.LatLng,   position :react-native-maps.react-native-maps/lib/sharedTypes.Point} & {  id :string,   action :'marker-select'} */
trait coordinateLatLngpositionPAction extends StObject {
  
  var action: `marker-select`
  
  var coordinate: LatLng
  
  var id: String
  
  var position: typings.reactNativeMaps.libSharedTypesMod.Point
}
object coordinateLatLngpositionPAction {
  
  inline def apply(coordinate: LatLng, id: String, position: typings.reactNativeMaps.libSharedTypesMod.Point): coordinateLatLngpositionPAction = {
    val __obj = js.Dynamic.literal(action = "marker-select", coordinate = coordinate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[coordinateLatLngpositionPAction]
  }
  
  extension [Self <: coordinateLatLngpositionPAction](x: Self) {
    
    inline def setAction(value: `marker-select`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setCoordinate(value: LatLng): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: typings.reactNativeMaps.libSharedTypesMod.Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
