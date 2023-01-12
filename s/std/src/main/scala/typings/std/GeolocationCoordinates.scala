package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait GeolocationCoordinates extends StObject {
  
  /* standard dom */
  val accuracy: Double
  
  /* standard dom */
  val altitude: Double | Null
  
  /* standard dom */
  val altitudeAccuracy: Double | Null
  
  /* standard dom */
  val heading: Double | Null
  
  /* standard dom */
  val latitude: Double
  
  /* standard dom */
  val longitude: Double
  
  /* standard dom */
  val speed: Double | Null
}
object GeolocationCoordinates {
  
  inline def apply(accuracy: Double, latitude: Double, longitude: Double): GeolocationCoordinates = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], altitude = null, altitudeAccuracy = null, heading = null, speed = null)
    __obj.asInstanceOf[GeolocationCoordinates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeolocationCoordinates] (val x: Self) extends AnyVal {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeAccuracy(value: Double): Self = StObject.set(x, "altitudeAccuracy", value.asInstanceOf[js.Any])
    
    inline def setAltitudeAccuracyNull: Self = StObject.set(x, "altitudeAccuracy", null)
    
    inline def setAltitudeNull: Self = StObject.set(x, "altitude", null)
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingNull: Self = StObject.set(x, "heading", null)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedNull: Self = StObject.set(x, "speed", null)
  }
}
