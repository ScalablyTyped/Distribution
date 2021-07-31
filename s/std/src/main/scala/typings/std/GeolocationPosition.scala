package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeolocationPosition extends StObject {
  
  val coords: GeolocationCoordinates
  
  val timestamp: Double
}
object GeolocationPosition {
  
  @scala.inline
  def apply(coords: GeolocationCoordinates, timestamp: Double): GeolocationPosition = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationPosition]
  }
  
  @scala.inline
  implicit class GeolocationPositionMutableBuilder[Self <: GeolocationPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoords(value: GeolocationCoordinates): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
