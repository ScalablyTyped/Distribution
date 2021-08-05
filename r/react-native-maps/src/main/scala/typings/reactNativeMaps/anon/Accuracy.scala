package typings.reactNativeMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accuracy extends StObject {
  
  var accuracy: Double
  
  var altitude: Double
  
  var isFromMockProvider: Boolean
  
  var latitude: Double
  
  var longitude: Double
  
  var speed: Double
  
  var timestamp: Double
}
object Accuracy {
  
  inline def apply(
    accuracy: Double,
    altitude: Double,
    isFromMockProvider: Boolean,
    latitude: Double,
    longitude: Double,
    speed: Double,
    timestamp: Double
  ): Accuracy = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], isFromMockProvider = isFromMockProvider.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accuracy]
  }
  
  extension [Self <: Accuracy](x: Self) {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setIsFromMockProvider(value: Boolean): Self = StObject.set(x, "isFromMockProvider", value.asInstanceOf[js.Any])
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
