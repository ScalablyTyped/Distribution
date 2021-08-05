package typings.reactNativeMauron85BackgroundGeolocation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationOptions extends StObject {
  
  /**
    * If true and if the device is able to provide a more accurate position, it will do so.
    */
  var enableHighAccuracy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum age in milliseconds of a possible cached location that is acceptable to return.
    */
  var maximumAge: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum time in milliseconds device will wait for location.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}
object LocationOptions {
  
  inline def apply(): LocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationOptions]
  }
  
  extension [Self <: LocationOptions](x: Self) {
    
    inline def setEnableHighAccuracy(value: Boolean): Self = StObject.set(x, "enableHighAccuracy", value.asInstanceOf[js.Any])
    
    inline def setEnableHighAccuracyUndefined: Self = StObject.set(x, "enableHighAccuracy", js.undefined)
    
    inline def setMaximumAge(value: Double): Self = StObject.set(x, "maximumAge", value.asInstanceOf[js.Any])
    
    inline def setMaximumAgeUndefined: Self = StObject.set(x, "maximumAge", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
