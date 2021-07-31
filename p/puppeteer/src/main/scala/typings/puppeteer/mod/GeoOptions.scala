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
  
  @scala.inline
  def apply(latitude: Double, longitude: Double): GeoOptions = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoOptions]
  }
  
  @scala.inline
  implicit class GeoOptionsMutableBuilder[Self <: GeoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
