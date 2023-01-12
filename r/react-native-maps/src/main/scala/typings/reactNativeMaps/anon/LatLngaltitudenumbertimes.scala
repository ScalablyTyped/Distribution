package typings.reactNativeMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-maps.react-native-maps/lib/sharedTypes.LatLng & {  altitude :number,   timestamp :number,   accuracy :number,   speed :number,   heading :number,   altitudeAccuracy :number | undefined,   isFromMockProvider :boolean | undefined} */
trait LatLngaltitudenumbertimes extends StObject {
  
  var accuracy: Double
  
  var altitude: Double
  
  /**
    * @platform iOS
    */
  var altitudeAccuracy: js.UndefOr[Double] = js.undefined
  
  var heading: Double
  
  /**
    * @platform Android
    */
  var isFromMockProvider: js.UndefOr[Boolean] = js.undefined
  
  var latitude: Double
  
  var longitude: Double
  
  var speed: Double
  
  var timestamp: Double
}
object LatLngaltitudenumbertimes {
  
  inline def apply(
    accuracy: Double,
    altitude: Double,
    heading: Double,
    latitude: Double,
    longitude: Double,
    speed: Double,
    timestamp: Double
  ): LatLngaltitudenumbertimes = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatLngaltitudenumbertimes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LatLngaltitudenumbertimes] (val x: Self) extends AnyVal {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeAccuracy(value: Double): Self = StObject.set(x, "altitudeAccuracy", value.asInstanceOf[js.Any])
    
    inline def setAltitudeAccuracyUndefined: Self = StObject.set(x, "altitudeAccuracy", js.undefined)
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setIsFromMockProvider(value: Boolean): Self = StObject.set(x, "isFromMockProvider", value.asInstanceOf[js.Any])
    
    inline def setIsFromMockProviderUndefined: Self = StObject.set(x, "isFromMockProvider", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
