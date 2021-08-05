package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoOptions extends StObject {
  
  /**
    * Non-negative accuracy value.
    */
  var accuracy: js.UndefOr[Double] = js.undefined
  
  /**
    * Latitude between -90 and 90.
    */
  var latitude: Double
  
  /**
    * Longitude between -180 and 180.
    */
  var longitude: Double
}
object GeoOptions {
  
  inline def apply(latitude: Double, longitude: Double): GeoOptions = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoOptions]
  }
  
  extension [Self <: GeoOptions](x: Self) {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
