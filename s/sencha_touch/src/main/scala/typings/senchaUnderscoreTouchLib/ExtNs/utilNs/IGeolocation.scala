package typings
package senchaUnderscoreTouchLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IGeolocation
  extends senchaUnderscoreTouchLib.ExtNs.IEvented {
  /** [Property] (Number) */
  var accuracy: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var allowHighAccuracy: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Number) */
  var altitude: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Number) */
  var altitudeAccuracy: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var autoUpdate: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var frequency: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Returns the value of allowHighAccuracy
  		* @returns Boolean
  		*/
  var getAllowHighAccuracy: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of autoUpdate
  		* @returns Boolean
  		*/
  var getAutoUpdate: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of frequency
  		* @returns Number
  		*/
  var getFrequency: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of maximumAge
  		* @returns Number
  		*/
  var getMaximumAge: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of timeout
  		* @returns Number
  		*/
  var getTimeout: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Property] (Number) */
  var heading: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Number) */
  var latitude: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Number) */
  var longitude: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var maximumAge: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Sets the value of allowHighAccuracy
  		* @param allowHighAccuracy Boolean The new value.
  		*/
  var setAllowHighAccuracy: js.UndefOr[js.Function1[/* allowHighAccuracy */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of autoUpdate
  		* @param autoUpdate Boolean The new value.
  		*/
  var setAutoUpdate: js.UndefOr[js.Function1[/* autoUpdate */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of frequency
  		* @param frequency Number The new value.
  		*/
  var setFrequency: js.UndefOr[js.Function1[/* frequency */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maximumAge
  		* @param maximumAge Number The new value.
  		*/
  var setMaximumAge: js.UndefOr[js.Function1[/* maximumAge */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of timeout
  		* @param timeout Number The new value.
  		*/
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Property] (Number) */
  var speed: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Date) */
  var timestamp: js.UndefOr[js.Any] = js.undefined
  /** [Method] Executes a onetime location update operation raising either a locationupdate or locationerror event
  		* @param callback Function A callback method to be called when the location retrieval has been completed. Will be called on both success and failure. The method will be passed one parameter, Ext.util.Geolocation (this reference), set to null on failure. geo.updateLocation(function (geo) {  alert('Latitude: ' + (geo !== null ? geo.latitude : 'failed')); });
  		* @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
  		*/
  var updateLocation: js.UndefOr[
    js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
}

