package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.util.IGeolocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMap extends IContainer {
  
  /** [Config Option] (Ext.util.Geolocation) */
  var geo: js.UndefOr[IGeolocation] = js.native
  
  /** [Method] Returns the value of geo
    * @returns Ext.util.Geolocation
    */
  var getGeo: js.UndefOr[js.Function0[IGeolocation]] = js.native
  
  /** [Method] Returns the value of map
    * @returns google.maps.Map
    */
  var getMap: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of mapListeners
    * @returns Object
    */
  var getMapListeners: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the state of the Map
    * @returns Object mapOptions
    */
  var getState: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of useCurrentLocation
    * @returns Boolean/Ext.util.Geolocation
    */
  var getUseCurrentLocation: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Config Option] (google.maps.Map) */
  var map: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var mapListeners: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var mapOptions: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var maskMap: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var maskMapCls: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Sets the value of geo
    * @param geo Ext.util.Geolocation The new value.
    */
  var setGeo: js.UndefOr[js.Function1[/* geo */ js.UndefOr[IGeolocation], Unit]] = js.native
  
  /** [Method] Sets the value of map
    * @param map google.maps.Map The new value.
    */
  var setMap: js.UndefOr[js.Function1[/* map */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Moves the map center to the designated coordinates hash of the form  latitude 37 381592 longitude  122 135672
    * @param coordinates Object/google.maps.LatLng Object representing the desired Latitude and longitude upon which to center the map.
    */
  var setMapCenter: js.UndefOr[js.Function1[/* coordinates */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of mapListeners
    * @param mapListeners Object The new value.
    */
  var setMapListeners: js.UndefOr[js.Function1[/* mapListeners */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of mapOptions
    * @param mapOptions Object The new value.
    */
  var setMapOptions: js.UndefOr[js.Function1[/* mapOptions */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of useCurrentLocation
    * @param useCurrentLocation Boolean/Ext.util.Geolocation The new value.
    */
  var setUseCurrentLocation: js.UndefOr[js.Function1[/* useCurrentLocation */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Moves the map center to the designated coordinates hash of the form  latitude 37 381592 longitude  122 135672
    * @param coordinates Object/google.maps.LatLng Object representing the desired Latitude and longitude upon which to center the map.
    */
  @JSName("update")
  var update_IMap: js.UndefOr[js.Function1[/* coordinates */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Boolean/Ext.util.Geolocation) */
  var useCurrentLocation: js.UndefOr[js.Any] = js.native
}
object IMap {
  
  @scala.inline
  def apply(): IMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMap]
  }
  
  @scala.inline
  implicit class IMapMutableBuilder[Self <: IMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeo(value: IGeolocation): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoUndefined: Self = StObject.set(x, "geo", js.undefined)
    
    @scala.inline
    def setGetGeo(value: () => IGeolocation): Self = StObject.set(x, "getGeo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGeoUndefined: Self = StObject.set(x, "getGeo", js.undefined)
    
    @scala.inline
    def setGetMap(value: () => _): Self = StObject.set(x, "getMap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMapListeners(value: () => _): Self = StObject.set(x, "getMapListeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMapListenersUndefined: Self = StObject.set(x, "getMapListeners", js.undefined)
    
    @scala.inline
    def setGetMapUndefined: Self = StObject.set(x, "getMap", js.undefined)
    
    @scala.inline
    def setGetState(value: () => _): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStateUndefined: Self = StObject.set(x, "getState", js.undefined)
    
    @scala.inline
    def setGetUseCurrentLocation(value: () => _): Self = StObject.set(x, "getUseCurrentLocation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUseCurrentLocationUndefined: Self = StObject.set(x, "getUseCurrentLocation", js.undefined)
    
    @scala.inline
    def setMap(value: js.Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapListeners(value: js.Any): Self = StObject.set(x, "mapListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapListenersUndefined: Self = StObject.set(x, "mapListeners", js.undefined)
    
    @scala.inline
    def setMapOptions(value: js.Any): Self = StObject.set(x, "mapOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapOptionsUndefined: Self = StObject.set(x, "mapOptions", js.undefined)
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setMaskMap(value: Boolean): Self = StObject.set(x, "maskMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskMapCls(value: java.lang.String): Self = StObject.set(x, "maskMapCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskMapClsUndefined: Self = StObject.set(x, "maskMapCls", js.undefined)
    
    @scala.inline
    def setMaskMapUndefined: Self = StObject.set(x, "maskMap", js.undefined)
    
    @scala.inline
    def setSetGeo(value: /* geo */ js.UndefOr[IGeolocation] => Unit): Self = StObject.set(x, "setGeo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetGeoUndefined: Self = StObject.set(x, "setGeo", js.undefined)
    
    @scala.inline
    def setSetMap(value: /* map */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setMap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMapCenter(value: /* coordinates */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setMapCenter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMapCenterUndefined: Self = StObject.set(x, "setMapCenter", js.undefined)
    
    @scala.inline
    def setSetMapListeners(value: /* mapListeners */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setMapListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMapListenersUndefined: Self = StObject.set(x, "setMapListeners", js.undefined)
    
    @scala.inline
    def setSetMapOptions(value: /* mapOptions */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setMapOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMapOptionsUndefined: Self = StObject.set(x, "setMapOptions", js.undefined)
    
    @scala.inline
    def setSetMapUndefined: Self = StObject.set(x, "setMap", js.undefined)
    
    @scala.inline
    def setSetUseCurrentLocation(value: /* useCurrentLocation */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setUseCurrentLocation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUseCurrentLocationUndefined: Self = StObject.set(x, "setUseCurrentLocation", js.undefined)
    
    @scala.inline
    def setUpdate(value: /* coordinates */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    @scala.inline
    def setUseCurrentLocation(value: js.Any): Self = StObject.set(x, "useCurrentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCurrentLocationUndefined: Self = StObject.set(x, "useCurrentLocation", js.undefined)
  }
}
