package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait GeolocationPosition extends StObject {
  
  /* standard dom */
  val coords: GeolocationCoordinates
  
  /* standard dom */
  val timestamp: EpochTimeStamp
}
object GeolocationPosition {
  
  inline def apply(coords: GeolocationCoordinates, timestamp: EpochTimeStamp): GeolocationPosition = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeolocationPosition] (val x: Self) extends AnyVal {
    
    inline def setCoords(value: GeolocationCoordinates): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: EpochTimeStamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
