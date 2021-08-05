package typings.reactNativeMaps.anon

import typings.reactNativeMaps.mod.LatLng
import typings.reactNativeMaps.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coordinate extends StObject {
  
  var coordinate: LatLng
  
  var position: Point
}
object Coordinate {
  
  inline def apply(coordinate: LatLng, position: Point): Coordinate = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinate]
  }
  
  extension [Self <: Coordinate](x: Self) {
    
    inline def setCoordinate(value: LatLng): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
