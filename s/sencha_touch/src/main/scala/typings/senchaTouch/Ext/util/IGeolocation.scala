package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.IEvented
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeolocation extends IEvented {
  
  /** [Property] (Number) */
  var accuracy: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var allowHighAccuracy: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Number) */
  var altitude: js.UndefOr[Double] = js.native
  
  /** [Property] (Number) */
  var altitudeAccuracy: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var autoUpdate: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var frequency: js.UndefOr[Double] = js.native
  
  /** [Method] Returns the value of allowHighAccuracy
    * @returns Boolean
    */
  var getAllowHighAccuracy: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of autoUpdate
    * @returns Boolean
    */
  var getAutoUpdate: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of frequency
    * @returns Number
    */
  var getFrequency: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of maximumAge
    * @returns Number
    */
  var getMaximumAge: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of timeout
    * @returns Number
    */
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Property] (Number) */
  var heading: js.UndefOr[Double] = js.native
  
  /** [Property] (Number) */
  var latitude: js.UndefOr[Double] = js.native
  
  /** [Property] (Number) */
  var longitude: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var maximumAge: js.UndefOr[Double] = js.native
  
  /** [Method] Sets the value of allowHighAccuracy
    * @param allowHighAccuracy Boolean The new value.
    */
  var setAllowHighAccuracy: js.UndefOr[js.Function1[/* allowHighAccuracy */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of autoUpdate
    * @param autoUpdate Boolean The new value.
    */
  var setAutoUpdate: js.UndefOr[js.Function1[/* autoUpdate */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of frequency
    * @param frequency Number The new value.
    */
  var setFrequency: js.UndefOr[js.Function1[/* frequency */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of maximumAge
    * @param maximumAge Number The new value.
    */
  var setMaximumAge: js.UndefOr[js.Function1[/* maximumAge */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of timeout
    * @param timeout Number The new value.
    */
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Property] (Number) */
  var speed: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.native
  
  /** [Property] (Date) */
  var timestamp: js.UndefOr[js.Any] = js.native
  
  /** [Method] Executes a onetime location update operation raising either a locationupdate or locationerror event
    * @param callback Function A callback method to be called when the location retrieval has been completed. Will be called on both success and failure. The method will be passed one parameter, Ext.util.Geolocation (this reference), set to null on failure. geo.updateLocation(function (geo) {  alert('Latitude: ' + (geo !== null ? geo.latitude : 'failed')); });
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    */
  var updateLocation: js.UndefOr[
    js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]
  ] = js.native
}
object IGeolocation {
  
  @scala.inline
  def apply(): IGeolocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeolocation]
  }
  
  @scala.inline
  implicit class IGeolocationOps[Self <: IGeolocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccuracy(value: Double): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccuracy: Self = this.set("accuracy", js.undefined)
    
    @scala.inline
    def setAllowHighAccuracy(value: Boolean): Self = this.set("allowHighAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowHighAccuracy: Self = this.set("allowHighAccuracy", js.undefined)
    
    @scala.inline
    def setAltitude(value: Double): Self = this.set("altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltitude: Self = this.set("altitude", js.undefined)
    
    @scala.inline
    def setAltitudeAccuracy(value: Double): Self = this.set("altitudeAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltitudeAccuracy: Self = this.set("altitudeAccuracy", js.undefined)
    
    @scala.inline
    def setAutoUpdate(value: Boolean): Self = this.set("autoUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoUpdate: Self = this.set("autoUpdate", js.undefined)
    
    @scala.inline
    def setFrequency(value: Double): Self = this.set("frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
    
    @scala.inline
    def setGetAllowHighAccuracy(value: () => Boolean): Self = this.set("getAllowHighAccuracy", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAllowHighAccuracy: Self = this.set("getAllowHighAccuracy", js.undefined)
    
    @scala.inline
    def setGetAutoUpdate(value: () => Boolean): Self = this.set("getAutoUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAutoUpdate: Self = this.set("getAutoUpdate", js.undefined)
    
    @scala.inline
    def setGetFrequency(value: () => Double): Self = this.set("getFrequency", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetFrequency: Self = this.set("getFrequency", js.undefined)
    
    @scala.inline
    def setGetMaximumAge(value: () => Double): Self = this.set("getMaximumAge", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMaximumAge: Self = this.set("getMaximumAge", js.undefined)
    
    @scala.inline
    def setGetTimeout(value: () => Double): Self = this.set("getTimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTimeout: Self = this.set("getTimeout", js.undefined)
    
    @scala.inline
    def setHeading(value: Double): Self = this.set("heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
    
    @scala.inline
    def setMaximumAge(value: Double): Self = this.set("maximumAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumAge: Self = this.set("maximumAge", js.undefined)
    
    @scala.inline
    def setSetAllowHighAccuracy(value: /* allowHighAccuracy */ js.UndefOr[Boolean] => Unit): Self = this.set("setAllowHighAccuracy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAllowHighAccuracy: Self = this.set("setAllowHighAccuracy", js.undefined)
    
    @scala.inline
    def setSetAutoUpdate(value: /* autoUpdate */ js.UndefOr[Boolean] => Unit): Self = this.set("setAutoUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAutoUpdate: Self = this.set("setAutoUpdate", js.undefined)
    
    @scala.inline
    def setSetFrequency(value: /* frequency */ js.UndefOr[Double] => Unit): Self = this.set("setFrequency", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetFrequency: Self = this.set("setFrequency", js.undefined)
    
    @scala.inline
    def setSetMaximumAge(value: /* maximumAge */ js.UndefOr[Double] => Unit): Self = this.set("setMaximumAge", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMaximumAge: Self = this.set("setMaximumAge", js.undefined)
    
    @scala.inline
    def setSetTimeout(value: /* timeout */ js.UndefOr[Double] => Unit): Self = this.set("setTimeout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTimeout: Self = this.set("setTimeout", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTimestamp(value: js.Any): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setUpdateLocation(value: (/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = this.set("updateLocation", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUpdateLocation: Self = this.set("updateLocation", js.undefined)
  }
}
