package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.IEvented
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeolocation
  extends StObject
     with IEvented {
  
  /** [Property] (Number) */
  var accuracy: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Boolean) */
  var allowHighAccuracy: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Number) */
  var altitude: js.UndefOr[Double] = js.undefined
  
  /** [Property] (Number) */
  var altitudeAccuracy: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Boolean) */
  var autoUpdate: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var frequency: js.UndefOr[Double] = js.undefined
  
  /** [Method] Returns the value of allowHighAccuracy
    * @returns Boolean
    */
  var getAllowHighAccuracy: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of autoUpdate
    * @returns Boolean
    */
  var getAutoUpdate: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of frequency
    * @returns Number
    */
  var getFrequency: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of maximumAge
    * @returns Number
    */
  var getMaximumAge: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of timeout
    * @returns Number
    */
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Property] (Number) */
  var heading: js.UndefOr[Double] = js.undefined
  
  /** [Property] (Number) */
  var latitude: js.UndefOr[Double] = js.undefined
  
  /** [Property] (Number) */
  var longitude: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var maximumAge: js.UndefOr[Double] = js.undefined
  
  /** [Method] Sets the value of allowHighAccuracy
    * @param allowHighAccuracy Boolean The new value.
    */
  var setAllowHighAccuracy: js.UndefOr[js.Function1[/* allowHighAccuracy */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of autoUpdate
    * @param autoUpdate Boolean The new value.
    */
  var setAutoUpdate: js.UndefOr[js.Function1[/* autoUpdate */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of frequency
    * @param frequency Number The new value.
    */
  var setFrequency: js.UndefOr[js.Function1[/* frequency */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of maximumAge
    * @param maximumAge Number The new value.
    */
  var setMaximumAge: js.UndefOr[js.Function1[/* maximumAge */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of timeout
    * @param timeout Number The new value.
    */
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Property] (Number) */
  var speed: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /** [Property] (Date) */
  var timestamp: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Executes a onetime location update operation raising either a locationupdate or locationerror event
    * @param callback Function A callback method to be called when the location retrieval has been completed. Will be called on both success and failure. The method will be passed one parameter, Ext.util.Geolocation (this reference), set to null on failure. geo.updateLocation(function (geo) {  alert('Latitude: ' + (geo !== null ? geo.latitude : 'failed')); });
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    */
  var updateLocation: js.UndefOr[
    js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
}
object IGeolocation {
  
  @scala.inline
  def apply(): IGeolocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeolocation]
  }
  
  @scala.inline
  implicit class IGeolocationMutableBuilder[Self <: IGeolocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    @scala.inline
    def setAllowHighAccuracy(value: Boolean): Self = StObject.set(x, "allowHighAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowHighAccuracyUndefined: Self = StObject.set(x, "allowHighAccuracy", js.undefined)
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeAccuracy(value: Double): Self = StObject.set(x, "altitudeAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeAccuracyUndefined: Self = StObject.set(x, "altitudeAccuracy", js.undefined)
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setAutoUpdate(value: Boolean): Self = StObject.set(x, "autoUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpdateUndefined: Self = StObject.set(x, "autoUpdate", js.undefined)
    
    @scala.inline
    def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    @scala.inline
    def setGetAllowHighAccuracy(value: () => Boolean): Self = StObject.set(x, "getAllowHighAccuracy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAllowHighAccuracyUndefined: Self = StObject.set(x, "getAllowHighAccuracy", js.undefined)
    
    @scala.inline
    def setGetAutoUpdate(value: () => Boolean): Self = StObject.set(x, "getAutoUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAutoUpdateUndefined: Self = StObject.set(x, "getAutoUpdate", js.undefined)
    
    @scala.inline
    def setGetFrequency(value: () => Double): Self = StObject.set(x, "getFrequency", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFrequencyUndefined: Self = StObject.set(x, "getFrequency", js.undefined)
    
    @scala.inline
    def setGetMaximumAge(value: () => Double): Self = StObject.set(x, "getMaximumAge", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaximumAgeUndefined: Self = StObject.set(x, "getMaximumAge", js.undefined)
    
    @scala.inline
    def setGetTimeout(value: () => Double): Self = StObject.set(x, "getTimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTimeoutUndefined: Self = StObject.set(x, "getTimeout", js.undefined)
    
    @scala.inline
    def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    @scala.inline
    def setMaximumAge(value: Double): Self = StObject.set(x, "maximumAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumAgeUndefined: Self = StObject.set(x, "maximumAge", js.undefined)
    
    @scala.inline
    def setSetAllowHighAccuracy(value: /* allowHighAccuracy */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAllowHighAccuracy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAllowHighAccuracyUndefined: Self = StObject.set(x, "setAllowHighAccuracy", js.undefined)
    
    @scala.inline
    def setSetAutoUpdate(value: /* autoUpdate */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAutoUpdateUndefined: Self = StObject.set(x, "setAutoUpdate", js.undefined)
    
    @scala.inline
    def setSetFrequency(value: /* frequency */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setFrequency", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFrequencyUndefined: Self = StObject.set(x, "setFrequency", js.undefined)
    
    @scala.inline
    def setSetMaximumAge(value: /* maximumAge */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaximumAge", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMaximumAgeUndefined: Self = StObject.set(x, "setMaximumAge", js.undefined)
    
    @scala.inline
    def setSetTimeout(value: /* timeout */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTimeoutUndefined: Self = StObject.set(x, "setTimeout", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTimestamp(value: js.Any): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setUpdateLocation(value: (/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "updateLocation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateLocationUndefined: Self = StObject.set(x, "updateLocation", js.undefined)
  }
}
