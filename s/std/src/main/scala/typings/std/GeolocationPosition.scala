package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeolocationPosition extends StObject {
  
  val coords: GeolocationCoordinates
  
  val timestamp: Double
}
object GeolocationPosition {
  
  inline def apply(coords: GeolocationCoordinates, timestamp: Double): GeolocationPosition = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationPosition]
  }
  
  extension [Self <: GeolocationPosition](x: Self) {
    
    inline def setCoords(value: GeolocationCoordinates): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
