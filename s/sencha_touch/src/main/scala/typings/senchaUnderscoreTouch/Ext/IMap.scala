package typings.senchaUnderscoreTouch.Ext

import typings.senchaUnderscoreTouch.Ext.util.IGeolocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMap extends IContainer {
  /** [Config Option] (Ext.util.Geolocation) */
  var geo: js.UndefOr[IGeolocation] = js.undefined
  /** [Method] Returns the value of geo
  		* @returns Ext.util.Geolocation
  		*/
  var getGeo: js.UndefOr[js.Function0[IGeolocation]] = js.undefined
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
  var maskMap: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var maskMapCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of geo
  		* @param geo Ext.util.Geolocation The new value.
  		*/
  var setGeo: js.UndefOr[js.Function1[/* geo */ js.UndefOr[IGeolocation], Unit]] = js.undefined
  /** [Method] Sets the value of map
  		* @param map google.maps.Map The new value.
  		*/
  var setMap: js.UndefOr[js.Function1[/* map */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Moves the map center to the designated coordinates hash of the form  latitude 37 381592 longitude  122 135672
  		* @param coordinates Object/google.maps.LatLng Object representing the desired Latitude and longitude upon which to center the map.
  		*/
  var setMapCenter: js.UndefOr[js.Function1[/* coordinates */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of mapListeners
  		* @param mapListeners Object The new value.
  		*/
  var setMapListeners: js.UndefOr[js.Function1[/* mapListeners */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of mapOptions
  		* @param mapOptions Object The new value.
  		*/
  var setMapOptions: js.UndefOr[js.Function1[/* mapOptions */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of useCurrentLocation
  		* @param useCurrentLocation Boolean/Ext.util.Geolocation The new value.
  		*/
  var setUseCurrentLocation: js.UndefOr[js.Function1[/* useCurrentLocation */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Moves the map center to the designated coordinates hash of the form  latitude 37 381592 longitude  122 135672
  		* @param coordinates Object/google.maps.LatLng Object representing the desired Latitude and longitude upon which to center the map.
  		*/
  @JSName("update")
  var update_IMap: js.UndefOr[js.Function1[/* coordinates */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Boolean/Ext.util.Geolocation) */
  var useCurrentLocation: js.UndefOr[js.Any] = js.undefined
}

object IMap {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    baseCls: java.lang.String = null,
    geo: IGeolocation = null,
    getBaseCls: () => java.lang.String = null,
    getGeo: () => IGeolocation = null,
    getMap: () => _ = null,
    getMapListeners: () => _ = null,
    getState: () => _ = null,
    getUseCurrentLocation: () => _ = null,
    initialize: () => Unit = null,
    map: js.Any = null,
    mapListeners: js.Any = null,
    mapOptions: js.Any = null,
    maskMap: js.UndefOr[Boolean] = js.undefined,
    maskMapCls: java.lang.String = null,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => Unit = null,
    setGeo: /* geo */ js.UndefOr[IGeolocation] => Unit = null,
    setMap: /* map */ js.UndefOr[js.Any] => Unit = null,
    setMapCenter: /* coordinates */ js.UndefOr[js.Any] => Unit = null,
    setMapListeners: /* mapListeners */ js.UndefOr[js.Any] => Unit = null,
    setMapOptions: /* mapOptions */ js.UndefOr[js.Any] => Unit = null,
    setUseCurrentLocation: /* useCurrentLocation */ js.UndefOr[js.Any] => Unit = null,
    update: /* coordinates */ js.UndefOr[js.Any] => Unit = null,
    useCurrentLocation: js.Any = null
  ): IMap = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (geo != null) __obj.updateDynamic("geo")(geo)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getGeo != null) __obj.updateDynamic("getGeo")(js.Any.fromFunction0(getGeo))
    if (getMap != null) __obj.updateDynamic("getMap")(js.Any.fromFunction0(getMap))
    if (getMapListeners != null) __obj.updateDynamic("getMapListeners")(js.Any.fromFunction0(getMapListeners))
    if (getState != null) __obj.updateDynamic("getState")(js.Any.fromFunction0(getState))
    if (getUseCurrentLocation != null) __obj.updateDynamic("getUseCurrentLocation")(js.Any.fromFunction0(getUseCurrentLocation))
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction0(initialize))
    if (map != null) __obj.updateDynamic("map")(map)
    if (mapListeners != null) __obj.updateDynamic("mapListeners")(mapListeners)
    if (mapOptions != null) __obj.updateDynamic("mapOptions")(mapOptions)
    if (!js.isUndefined(maskMap)) __obj.updateDynamic("maskMap")(maskMap)
    if (maskMapCls != null) __obj.updateDynamic("maskMapCls")(maskMapCls)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    if (setGeo != null) __obj.updateDynamic("setGeo")(js.Any.fromFunction1(setGeo))
    if (setMap != null) __obj.updateDynamic("setMap")(js.Any.fromFunction1(setMap))
    if (setMapCenter != null) __obj.updateDynamic("setMapCenter")(js.Any.fromFunction1(setMapCenter))
    if (setMapListeners != null) __obj.updateDynamic("setMapListeners")(js.Any.fromFunction1(setMapListeners))
    if (setMapOptions != null) __obj.updateDynamic("setMapOptions")(js.Any.fromFunction1(setMapOptions))
    if (setUseCurrentLocation != null) __obj.updateDynamic("setUseCurrentLocation")(js.Any.fromFunction1(setUseCurrentLocation))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1(update))
    if (useCurrentLocation != null) __obj.updateDynamic("useCurrentLocation")(useCurrentLocation)
    __obj.asInstanceOf[IMap]
  }
}

