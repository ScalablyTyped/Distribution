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

object IMap {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    baseCls: java.lang.String = null,
    geo: senchaUnderscoreTouchLib.ExtNs.utilNs.IGeolocation = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    getGeo: js.Function0[senchaUnderscoreTouchLib.ExtNs.utilNs.IGeolocation] = null,
    getMap: js.Function0[_] = null,
    getMapListeners: js.Function0[_] = null,
    getState: js.Function0[_] = null,
    getUseCurrentLocation: js.Function0[_] = null,
    initialize: js.Function0[scala.Unit] = null,
    map: js.Any = null,
    mapListeners: js.Any = null,
    mapOptions: js.Any = null,
    maskMap: js.UndefOr[scala.Boolean] = js.undefined,
    maskMapCls: java.lang.String = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setGeo: js.Function1[
      /* geo */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.utilNs.IGeolocation], 
      scala.Unit
    ] = null,
    setMap: js.Function1[/* map */ js.UndefOr[js.Any], scala.Unit] = null,
    setMapCenter: js.Function1[/* coordinates */ js.UndefOr[js.Any], scala.Unit] = null,
    setMapListeners: js.Function1[/* mapListeners */ js.UndefOr[js.Any], scala.Unit] = null,
    setMapOptions: js.Function1[/* mapOptions */ js.UndefOr[js.Any], scala.Unit] = null,
    setUseCurrentLocation: js.Function1[/* useCurrentLocation */ js.UndefOr[js.Any], scala.Unit] = null,
    update: js.Function1[/* coordinates */ js.UndefOr[js.Any], scala.Unit] = null,
    useCurrentLocation: js.Any = null
  ): IMap = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (geo != null) __obj.updateDynamic("geo")(geo)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getGeo != null) __obj.updateDynamic("getGeo")(getGeo)
    if (getMap != null) __obj.updateDynamic("getMap")(getMap)
    if (getMapListeners != null) __obj.updateDynamic("getMapListeners")(getMapListeners)
    if (getState != null) __obj.updateDynamic("getState")(getState)
    if (getUseCurrentLocation != null) __obj.updateDynamic("getUseCurrentLocation")(getUseCurrentLocation)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (map != null) __obj.updateDynamic("map")(map)
    if (mapListeners != null) __obj.updateDynamic("mapListeners")(mapListeners)
    if (mapOptions != null) __obj.updateDynamic("mapOptions")(mapOptions)
    if (!js.isUndefined(maskMap)) __obj.updateDynamic("maskMap")(maskMap)
    if (maskMapCls != null) __obj.updateDynamic("maskMapCls")(maskMapCls)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setGeo != null) __obj.updateDynamic("setGeo")(setGeo)
    if (setMap != null) __obj.updateDynamic("setMap")(setMap)
    if (setMapCenter != null) __obj.updateDynamic("setMapCenter")(setMapCenter)
    if (setMapListeners != null) __obj.updateDynamic("setMapListeners")(setMapListeners)
    if (setMapOptions != null) __obj.updateDynamic("setMapOptions")(setMapOptions)
    if (setUseCurrentLocation != null) __obj.updateDynamic("setUseCurrentLocation")(setUseCurrentLocation)
    if (update != null) __obj.updateDynamic("update")(update)
    if (useCurrentLocation != null) __obj.updateDynamic("useCurrentLocation")(useCurrentLocation)
    __obj.asInstanceOf[IMap]
  }
}

