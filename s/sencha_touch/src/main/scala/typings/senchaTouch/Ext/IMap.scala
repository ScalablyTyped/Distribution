package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.util.IGeolocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IMapOps[Self <: IMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGeo(value: IGeolocation): Self = this.set("geo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeo: Self = this.set("geo", js.undefined)
    @scala.inline
    def setGetGeo(value: () => IGeolocation): Self = this.set("getGeo", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetGeo: Self = this.set("getGeo", js.undefined)
    @scala.inline
    def setGetMap(value: () => _): Self = this.set("getMap", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMap: Self = this.set("getMap", js.undefined)
    @scala.inline
    def setGetMapListeners(value: () => _): Self = this.set("getMapListeners", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMapListeners: Self = this.set("getMapListeners", js.undefined)
    @scala.inline
    def setGetState(value: () => _): Self = this.set("getState", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetState: Self = this.set("getState", js.undefined)
    @scala.inline
    def setGetUseCurrentLocation(value: () => _): Self = this.set("getUseCurrentLocation", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetUseCurrentLocation: Self = this.set("getUseCurrentLocation", js.undefined)
    @scala.inline
    def setMap(value: js.Any): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setMapListeners(value: js.Any): Self = this.set("mapListeners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapListeners: Self = this.set("mapListeners", js.undefined)
    @scala.inline
    def setMapOptions(value: js.Any): Self = this.set("mapOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapOptions: Self = this.set("mapOptions", js.undefined)
    @scala.inline
    def setMaskMap(value: Boolean): Self = this.set("maskMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskMap: Self = this.set("maskMap", js.undefined)
    @scala.inline
    def setMaskMapCls(value: java.lang.String): Self = this.set("maskMapCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskMapCls: Self = this.set("maskMapCls", js.undefined)
    @scala.inline
    def setSetGeo(value: /* geo */ js.UndefOr[IGeolocation] => Unit): Self = this.set("setGeo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetGeo: Self = this.set("setGeo", js.undefined)
    @scala.inline
    def setSetMap(value: /* map */ js.UndefOr[js.Any] => Unit): Self = this.set("setMap", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMap: Self = this.set("setMap", js.undefined)
    @scala.inline
    def setSetMapCenter(value: /* coordinates */ js.UndefOr[js.Any] => Unit): Self = this.set("setMapCenter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMapCenter: Self = this.set("setMapCenter", js.undefined)
    @scala.inline
    def setSetMapListeners(value: /* mapListeners */ js.UndefOr[js.Any] => Unit): Self = this.set("setMapListeners", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMapListeners: Self = this.set("setMapListeners", js.undefined)
    @scala.inline
    def setSetMapOptions(value: /* mapOptions */ js.UndefOr[js.Any] => Unit): Self = this.set("setMapOptions", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMapOptions: Self = this.set("setMapOptions", js.undefined)
    @scala.inline
    def setSetUseCurrentLocation(value: /* useCurrentLocation */ js.UndefOr[js.Any] => Unit): Self = this.set("setUseCurrentLocation", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetUseCurrentLocation: Self = this.set("setUseCurrentLocation", js.undefined)
    @scala.inline
    def setUpdate(value: /* coordinates */ js.UndefOr[js.Any] => Unit): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    @scala.inline
    def setUseCurrentLocation(value: js.Any): Self = this.set("useCurrentLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCurrentLocation: Self = this.set("useCurrentLocation", js.undefined)
  }
  
}

