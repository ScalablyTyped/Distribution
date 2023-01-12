package typings.reactNativeMaps.anon

import typings.reactNativeMaps.libSharedTypesMod.LatLng
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoordinatePosition extends StObject {
  
  var coordinate: LatLng
  
  var position: typings.reactNativeMaps.libSharedTypesMod.Point
}
object CoordinatePosition {
  
  inline def apply(coordinate: LatLng, position: typings.reactNativeMaps.libSharedTypesMod.Point): CoordinatePosition = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinatePosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoordinatePosition] (val x: Self) extends AnyVal {
    
    inline def setCoordinate(value: LatLng): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: typings.reactNativeMaps.libSharedTypesMod.Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
