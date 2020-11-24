package typings.reactNativeMaps.mod

import typings.reactNative.mod.ViewProps
import typings.reactNativeMaps.anon.Action
import typings.reactNativeMaps.anon.ActionId
import typings.reactNativeMaps.anon.Id
import typings.reactNativeMaps.anon.Name
import typings.reactNativeMaps.anon.`0`
import typings.reactNativeMaps.reactNativeMapsStrings.google
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapViewProps extends ViewProps {
  
  var cacheEnabled: js.UndefOr[Boolean] = js.native
  
  var camera: js.UndefOr[Camera] = js.native
  
  var compassOffset: js.UndefOr[Point] = js.native
  
  var customMapStyle: js.UndefOr[js.Array[MapStyleElement]] = js.native
  
  var customMapStyleString: js.UndefOr[String] = js.native
  
  var followsUserLocation: js.UndefOr[Boolean] = js.native
  
  var initialCamera: js.UndefOr[Camera] = js.native
  
  var initialRegion: js.UndefOr[Region] = js.native
  
  var kmlSrc: js.UndefOr[String] = js.native
  
  var legalLabelInsets: js.UndefOr[EdgeInsets] = js.native
  
  var liteMode: js.UndefOr[Boolean] = js.native
  
  var loadingBackgroundColor: js.UndefOr[String] = js.native
  
  var loadingEnabled: js.UndefOr[Boolean] = js.native
  
  var loadingIndicatorColor: js.UndefOr[String] = js.native
  
  var mapPadding: js.UndefOr[EdgePadding] = js.native
  
  var mapType: js.UndefOr[MapTypes] = js.native
  
  var maxDelta: js.UndefOr[Double] = js.native
  
  var maxZoomLevel: js.UndefOr[Double] = js.native
  
  var minDelta: js.UndefOr[Double] = js.native
  
  var minZoomLevel: js.UndefOr[Double] = js.native
  
  var moveOnMarkerPress: js.UndefOr[Boolean] = js.native
  
  var onCalloutPress: js.UndefOr[js.Function1[/* event */ MapEvent[`0`], Unit]] = js.native
  
  var onKmlReady: js.UndefOr[js.Function1[/* values */ KmlMapEvent, Unit]] = js.native
  
  var onLongPress: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], Unit]] = js.native
  
  var onMapReady: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onMarkerDeselect: js.UndefOr[js.Function1[/* event */ MapEvent[ActionId], Unit]] = js.native
  
  var onMarkerDrag: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], Unit]] = js.native
  
  var onMarkerDragEnd: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], Unit]] = js.native
  
  var onMarkerDragStart: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], Unit]] = js.native
  
  var onMarkerPress: js.UndefOr[js.Function1[/* event */ MapEvent[Action], Unit]] = js.native
  
  var onMarkerSelect: js.UndefOr[js.Function1[/* event */ MapEvent[Id], Unit]] = js.native
  
  var onPanDrag: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], Unit]] = js.native
  
  var onPoiClick: js.UndefOr[js.Function1[/* event */ MapEvent[Name], Unit]] = js.native
  
  var onPress: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], Unit]] = js.native
  
  var onRegionChange: js.UndefOr[js.Function1[/* region */ Region, Unit]] = js.native
  
  var onRegionChangeComplete: js.UndefOr[js.Function1[/* region */ Region, Unit]] = js.native
  
  var onUserLocationChange: js.UndefOr[js.Function1[/* event */ EventUserLocation, Unit]] = js.native
  
  var pitchEnabled: js.UndefOr[Boolean] = js.native
  
  var provider: js.UndefOr[google | Null] = js.native
  
  var region: js.UndefOr[Region] = js.native
  
  var rotateEnabled: js.UndefOr[Boolean] = js.native
  
  var scrollEnabled: js.UndefOr[Boolean] = js.native
  
  var showsBuildings: js.UndefOr[Boolean] = js.native
  
  var showsCompass: js.UndefOr[Boolean] = js.native
  
  var showsIndoorLevelPicker: js.UndefOr[Boolean] = js.native
  
  var showsIndoors: js.UndefOr[Boolean] = js.native
  
  var showsMyLocationButton: js.UndefOr[Boolean] = js.native
  
  var showsPointsOfInterest: js.UndefOr[Boolean] = js.native
  
  var showsScale: js.UndefOr[Boolean] = js.native
  
  var showsTraffic: js.UndefOr[Boolean] = js.native
  
  var showsUserLocation: js.UndefOr[Boolean] = js.native
  
  var toolbarEnabled: js.UndefOr[Boolean] = js.native
  
  var userLocationAnnotationTitle: js.UndefOr[String] = js.native
  
  var zoomControlEnabled: js.UndefOr[Boolean] = js.native
  
  var zoomEnabled: js.UndefOr[Boolean] = js.native
  
  var zoomTapEnabled: js.UndefOr[Boolean] = js.native
}
object MapViewProps {
  
  @scala.inline
  def apply(): MapViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapViewProps]
  }
  
  @scala.inline
  implicit class MapViewPropsOps[Self <: MapViewProps] (val x: Self) extends AnyVal {
    
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
    def setCacheEnabled(value: Boolean): Self = this.set("cacheEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheEnabled: Self = this.set("cacheEnabled", js.undefined)
    
    @scala.inline
    def setCamera(value: Camera): Self = this.set("camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCamera: Self = this.set("camera", js.undefined)
    
    @scala.inline
    def setCompassOffset(value: Point): Self = this.set("compassOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompassOffset: Self = this.set("compassOffset", js.undefined)
    
    @scala.inline
    def setCustomMapStyleVarargs(value: MapStyleElement*): Self = this.set("customMapStyle", js.Array(value :_*))
    
    @scala.inline
    def setCustomMapStyle(value: js.Array[MapStyleElement]): Self = this.set("customMapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomMapStyle: Self = this.set("customMapStyle", js.undefined)
    
    @scala.inline
    def setCustomMapStyleString(value: String): Self = this.set("customMapStyleString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomMapStyleString: Self = this.set("customMapStyleString", js.undefined)
    
    @scala.inline
    def setFollowsUserLocation(value: Boolean): Self = this.set("followsUserLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowsUserLocation: Self = this.set("followsUserLocation", js.undefined)
    
    @scala.inline
    def setInitialCamera(value: Camera): Self = this.set("initialCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialCamera: Self = this.set("initialCamera", js.undefined)
    
    @scala.inline
    def setInitialRegion(value: Region): Self = this.set("initialRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialRegion: Self = this.set("initialRegion", js.undefined)
    
    @scala.inline
    def setKmlSrc(value: String): Self = this.set("kmlSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmlSrc: Self = this.set("kmlSrc", js.undefined)
    
    @scala.inline
    def setLegalLabelInsets(value: EdgeInsets): Self = this.set("legalLabelInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegalLabelInsets: Self = this.set("legalLabelInsets", js.undefined)
    
    @scala.inline
    def setLiteMode(value: Boolean): Self = this.set("liteMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiteMode: Self = this.set("liteMode", js.undefined)
    
    @scala.inline
    def setLoadingBackgroundColor(value: String): Self = this.set("loadingBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingBackgroundColor: Self = this.set("loadingBackgroundColor", js.undefined)
    
    @scala.inline
    def setLoadingEnabled(value: Boolean): Self = this.set("loadingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingEnabled: Self = this.set("loadingEnabled", js.undefined)
    
    @scala.inline
    def setLoadingIndicatorColor(value: String): Self = this.set("loadingIndicatorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingIndicatorColor: Self = this.set("loadingIndicatorColor", js.undefined)
    
    @scala.inline
    def setMapPadding(value: EdgePadding): Self = this.set("mapPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapPadding: Self = this.set("mapPadding", js.undefined)
    
    @scala.inline
    def setMapType(value: MapTypes): Self = this.set("mapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapType: Self = this.set("mapType", js.undefined)
    
    @scala.inline
    def setMaxDelta(value: Double): Self = this.set("maxDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDelta: Self = this.set("maxDelta", js.undefined)
    
    @scala.inline
    def setMaxZoomLevel(value: Double): Self = this.set("maxZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoomLevel: Self = this.set("maxZoomLevel", js.undefined)
    
    @scala.inline
    def setMinDelta(value: Double): Self = this.set("minDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDelta: Self = this.set("minDelta", js.undefined)
    
    @scala.inline
    def setMinZoomLevel(value: Double): Self = this.set("minZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinZoomLevel: Self = this.set("minZoomLevel", js.undefined)
    
    @scala.inline
    def setMoveOnMarkerPress(value: Boolean): Self = this.set("moveOnMarkerPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveOnMarkerPress: Self = this.set("moveOnMarkerPress", js.undefined)
    
    @scala.inline
    def setOnCalloutPress(value: /* event */ MapEvent[`0`] => Unit): Self = this.set("onCalloutPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCalloutPress: Self = this.set("onCalloutPress", js.undefined)
    
    @scala.inline
    def setOnKmlReady(value: /* values */ KmlMapEvent => Unit): Self = this.set("onKmlReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKmlReady: Self = this.set("onKmlReady", js.undefined)
    
    @scala.inline
    def setOnLongPress(value: /* event */ MapEvent[js.Object] => Unit): Self = this.set("onLongPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLongPress: Self = this.set("onLongPress", js.undefined)
    
    @scala.inline
    def setOnMapReady(value: () => Unit): Self = this.set("onMapReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnMapReady: Self = this.set("onMapReady", js.undefined)
    
    @scala.inline
    def setOnMarkerDeselect(value: /* event */ MapEvent[ActionId] => Unit): Self = this.set("onMarkerDeselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMarkerDeselect: Self = this.set("onMarkerDeselect", js.undefined)
    
    @scala.inline
    def setOnMarkerDrag(value: /* event */ MapEvent[js.Object] => Unit): Self = this.set("onMarkerDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMarkerDrag: Self = this.set("onMarkerDrag", js.undefined)
    
    @scala.inline
    def setOnMarkerDragEnd(value: /* event */ MapEvent[js.Object] => Unit): Self = this.set("onMarkerDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMarkerDragEnd: Self = this.set("onMarkerDragEnd", js.undefined)
    
    @scala.inline
    def setOnMarkerDragStart(value: /* event */ MapEvent[js.Object] => Unit): Self = this.set("onMarkerDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMarkerDragStart: Self = this.set("onMarkerDragStart", js.undefined)
    
    @scala.inline
    def setOnMarkerPress(value: /* event */ MapEvent[Action] => Unit): Self = this.set("onMarkerPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMarkerPress: Self = this.set("onMarkerPress", js.undefined)
    
    @scala.inline
    def setOnMarkerSelect(value: /* event */ MapEvent[Id] => Unit): Self = this.set("onMarkerSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMarkerSelect: Self = this.set("onMarkerSelect", js.undefined)
    
    @scala.inline
    def setOnPanDrag(value: /* event */ MapEvent[js.Object] => Unit): Self = this.set("onPanDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPanDrag: Self = this.set("onPanDrag", js.undefined)
    
    @scala.inline
    def setOnPoiClick(value: /* event */ MapEvent[Name] => Unit): Self = this.set("onPoiClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPoiClick: Self = this.set("onPoiClick", js.undefined)
    
    @scala.inline
    def setOnPress(value: /* event */ MapEvent[js.Object] => Unit): Self = this.set("onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    
    @scala.inline
    def setOnRegionChange(value: /* region */ Region => Unit): Self = this.set("onRegionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRegionChange: Self = this.set("onRegionChange", js.undefined)
    
    @scala.inline
    def setOnRegionChangeComplete(value: /* region */ Region => Unit): Self = this.set("onRegionChangeComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRegionChangeComplete: Self = this.set("onRegionChangeComplete", js.undefined)
    
    @scala.inline
    def setOnUserLocationChange(value: /* event */ EventUserLocation => Unit): Self = this.set("onUserLocationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUserLocationChange: Self = this.set("onUserLocationChange", js.undefined)
    
    @scala.inline
    def setPitchEnabled(value: Boolean): Self = this.set("pitchEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePitchEnabled: Self = this.set("pitchEnabled", js.undefined)
    
    @scala.inline
    def setProvider(value: google): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    
    @scala.inline
    def setProviderNull: Self = this.set("provider", null)
    
    @scala.inline
    def setRegion(value: Region): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setRotateEnabled(value: Boolean): Self = this.set("rotateEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotateEnabled: Self = this.set("rotateEnabled", js.undefined)
    
    @scala.inline
    def setScrollEnabled(value: Boolean): Self = this.set("scrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollEnabled: Self = this.set("scrollEnabled", js.undefined)
    
    @scala.inline
    def setShowsBuildings(value: Boolean): Self = this.set("showsBuildings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsBuildings: Self = this.set("showsBuildings", js.undefined)
    
    @scala.inline
    def setShowsCompass(value: Boolean): Self = this.set("showsCompass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsCompass: Self = this.set("showsCompass", js.undefined)
    
    @scala.inline
    def setShowsIndoorLevelPicker(value: Boolean): Self = this.set("showsIndoorLevelPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsIndoorLevelPicker: Self = this.set("showsIndoorLevelPicker", js.undefined)
    
    @scala.inline
    def setShowsIndoors(value: Boolean): Self = this.set("showsIndoors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsIndoors: Self = this.set("showsIndoors", js.undefined)
    
    @scala.inline
    def setShowsMyLocationButton(value: Boolean): Self = this.set("showsMyLocationButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsMyLocationButton: Self = this.set("showsMyLocationButton", js.undefined)
    
    @scala.inline
    def setShowsPointsOfInterest(value: Boolean): Self = this.set("showsPointsOfInterest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsPointsOfInterest: Self = this.set("showsPointsOfInterest", js.undefined)
    
    @scala.inline
    def setShowsScale(value: Boolean): Self = this.set("showsScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsScale: Self = this.set("showsScale", js.undefined)
    
    @scala.inline
    def setShowsTraffic(value: Boolean): Self = this.set("showsTraffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsTraffic: Self = this.set("showsTraffic", js.undefined)
    
    @scala.inline
    def setShowsUserLocation(value: Boolean): Self = this.set("showsUserLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsUserLocation: Self = this.set("showsUserLocation", js.undefined)
    
    @scala.inline
    def setToolbarEnabled(value: Boolean): Self = this.set("toolbarEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarEnabled: Self = this.set("toolbarEnabled", js.undefined)
    
    @scala.inline
    def setUserLocationAnnotationTitle(value: String): Self = this.set("userLocationAnnotationTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserLocationAnnotationTitle: Self = this.set("userLocationAnnotationTitle", js.undefined)
    
    @scala.inline
    def setZoomControlEnabled(value: Boolean): Self = this.set("zoomControlEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomControlEnabled: Self = this.set("zoomControlEnabled", js.undefined)
    
    @scala.inline
    def setZoomEnabled(value: Boolean): Self = this.set("zoomEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomEnabled: Self = this.set("zoomEnabled", js.undefined)
    
    @scala.inline
    def setZoomTapEnabled(value: Boolean): Self = this.set("zoomTapEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomTapEnabled: Self = this.set("zoomTapEnabled", js.undefined)
  }
}
