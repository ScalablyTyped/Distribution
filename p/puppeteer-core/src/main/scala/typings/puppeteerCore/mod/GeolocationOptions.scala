package typings.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeolocationOptions extends StObject {
  
  /**
    * Optional non-negative accuracy value.
    */
  var accuracy: js.UndefOr[Double] = js.undefined
  
  /**
    * Longitude between `-180` and `180`.
    */
  var latitude: Double
  
  /**
    * Latitude between `-90` and `90`.
    */
  var longitude: Double
}
object GeolocationOptions {
  
  inline def apply(latitude: Double, longitude: Double): GeolocationOptions = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationOptions]
  }
  
  extension [Self <: GeolocationOptions](x: Self) {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
