package typings.reactNativeMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoordinateAccuracy extends StObject {
  
  var coordinate: Accuracy
}
object CoordinateAccuracy {
  
  inline def apply(coordinate: Accuracy): CoordinateAccuracy = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinateAccuracy]
  }
  
  extension [Self <: CoordinateAccuracy](x: Self) {
    
    inline def setCoordinate(value: Accuracy): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
  }
}
