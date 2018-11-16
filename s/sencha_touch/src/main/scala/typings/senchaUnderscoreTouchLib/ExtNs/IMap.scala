package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IMap extends IContainer {
  /** [Config Option] (Ext.util.Geolocation) */
  var geo: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.utilNs.IGeolocation] = js.undefined
  /** [Method] Returns the value of geo
  		* @returns Ext.util.Geolocation
  		*/
  var getGeo: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.utilNs.IGeolocation]] = js.undefined
  /** [Method] Returns the value of map
  		* @returns google.maps.Map
  		*/
  var getMap: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of mapListeners
  		* @returns Object
  		*/
  var getMapListeners: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the state of the Map
  		* @returns Object mapOptions
  		*/
  var getState: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of useCurrentLocation
  		* @returns Boolean/Ext.util.Geolocation
  		*/
  var getUseCurrentLocation: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (google.maps.Map) */
  var map: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var mapListeners: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var mapOptions: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var maskMap: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var maskMapCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of geo
  		* @param geo Ext.util.Geolocation The new value.
  		*/
  var setGeo: js.UndefOr[
    js.Function1[
      /* geo */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.utilNs.IGeolocation], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of map
  		* @param map google.maps.Map The new value.
  		*/
  var setMap: js.UndefOr[js.Function1[/* map */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Moves the map center to the designated coordinates hash of the form  latitude 37 381592 longitude  122 135672
  		* @param coordinates Object/google.maps.LatLng Object representing the desired Latitude and longitude upon which to center the map.
  		*/
  var setMapCenter: js.UndefOr[js.Function1[/* coordinates */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of mapListeners
  		* @param mapListeners Object The new value.
  		*/
  var setMapListeners: js.UndefOr[js.Function1[/* mapListeners */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of mapOptions
  		* @param mapOptions Object The new value.
  		*/
  var setMapOptions: js.UndefOr[js.Function1[/* mapOptions */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of useCurrentLocation
  		* @param useCurrentLocation Boolean/Ext.util.Geolocation The new value.
  		*/
  var setUseCurrentLocation: js.UndefOr[js.Function1[/* useCurrentLocation */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Moves the map center to the designated coordinates hash of the form  latitude 37 381592 longitude  122 135672
  		* @param coordinates Object/google.maps.LatLng Object representing the desired Latitude and longitude upon which to center the map.
  		*/
  @JSName("update")
  var update_IMap: js.UndefOr[js.Function1[/* coordinates */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean/Ext.util.Geolocation) */
  var useCurrentLocation: js.UndefOr[js.Any] = js.undefined
}

