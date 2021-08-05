package typings.reactNativeMaps.mod

import typings.reactNative.mod.ViewProps
import typings.reactNativeMaps.anon.Action
import typings.reactNativeMaps.anon.ActionId
import typings.reactNativeMaps.anon.Id
import typings.reactNativeMaps.anon.Name
import typings.reactNativeMaps.anon.`0`
import typings.reactNativeMaps.reactNativeMapsStrings.google
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapViewProps
  extends StObject
     with ViewProps {
  
  var cacheEnabled: js.UndefOr[Boolean] = js.undefined
  
  var camera: js.UndefOr[Camera] = js.undefined
  
  var compassOffset: js.UndefOr[Point] = js.undefined
  
  var customMapStyle: js.UndefOr[js.Array[MapStyleElement]] = js.undefined
  
  var customMapStyleString: js.UndefOr[String] = js.undefined
  
  var followsUserLocation: js.UndefOr[Boolean] = js.undefined
  
  var initialCamera: js.UndefOr[Camera] = js.undefined
  
  var initialRegion: js.UndefOr[Region] = js.undefined
  
  var kmlSrc: js.UndefOr[String] = js.undefined
  
  var legalLabelInsets: js.UndefOr[EdgeInsets] = js.undefined
  
  var liteMode: js.UndefOr[Boolean] = js.undefined
  
  var loadingBackgroundColor: js.UndefOr[String] = js.undefined
  
  var loadingEnabled: js.UndefOr[Boolean] = js.undefined
  
  var loadingIndicatorColor: js.UndefOr[String] = js.undefined
  
  var mapPadding: js.UndefOr[EdgePadding] = js.undefined
  
  var mapType: js.UndefOr[MapTypes] = js.undefined
  
  var maxDelta: js.UndefOr[Double] = js.undefined
  
  var maxZoomLevel: js.UndefOr[Double] = js.undefined
  
  var minDelta: js.UndefOr[Double] = js.undefined
  
  var minZoomLevel: js.UndefOr[Double] = js.undefined
  
  var moveOnMarkerPress: js.UndefOr[Boolean] = js.undefined
  
  var onCalloutPress: js.UndefOr[js.Function1[/* event */ MapEvent[`0`], Unit]] = js.undefined
  
  var onKmlReady: js.UndefOr[js.Function1[/* values */ KmlMapEvent, Unit]] = js.undefined
  
  var onLongPress: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], Unit]] = js.undefined
  
  var onMapReady: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onMarkerDeselect: js.UndefOr[js.Function1[/* event */ MapEvent[ActionId], Unit]] = js.undefined
  
  var onMarkerDrag: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], Unit]] = js.undefined
  
  var onMarkerDragEnd: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], Unit]] = js.undefined
  
  var onMarkerDragStart: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], Unit]] = js.undefined
  
  var onMarkerPress: js.UndefOr[js.Function1[/* event */ MapEvent[Action], Unit]] = js.undefined
  
  var onMarkerSelect: js.UndefOr[js.Function1[/* event */ MapEvent[Id], Unit]] = js.undefined
  
  var onPanDrag: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], Unit]] = js.undefined
  
  var onPoiClick: js.UndefOr[js.Function1[/* event */ MapEvent[Name], Unit]] = js.undefined
  
  var onPress: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], Unit]] = js.undefined
  
  var onRegionChange: js.UndefOr[js.Function1[/* region */ Region, Unit]] = js.undefined
  
  var onRegionChangeComplete: js.UndefOr[js.Function1[/* region */ Region, Unit]] = js.undefined
  
  var onUserLocationChange: js.UndefOr[js.Function1[/* event */ EventUserLocation, Unit]] = js.undefined
  
  var pitchEnabled: js.UndefOr[Boolean] = js.undefined
  
  var provider: js.UndefOr[google | Null] = js.undefined
  
  var region: js.UndefOr[Region] = js.undefined
  
  var rotateEnabled: js.UndefOr[Boolean] = js.undefined
  
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  
  var showsBuildings: js.UndefOr[Boolean] = js.undefined
  
  var showsCompass: js.UndefOr[Boolean] = js.undefined
  
  var showsIndoorLevelPicker: js.UndefOr[Boolean] = js.undefined
  
  var showsIndoors: js.UndefOr[Boolean] = js.undefined
  
  var showsMyLocationButton: js.UndefOr[Boolean] = js.undefined
  
  var showsPointsOfInterest: js.UndefOr[Boolean] = js.undefined
  
  var showsScale: js.UndefOr[Boolean] = js.undefined
  
  var showsTraffic: js.UndefOr[Boolean] = js.undefined
  
  var showsUserLocation: js.UndefOr[Boolean] = js.undefined
  
  var toolbarEnabled: js.UndefOr[Boolean] = js.undefined
  
  var userLocationAnnotationTitle: js.UndefOr[String] = js.undefined
  
  var zoomControlEnabled: js.UndefOr[Boolean] = js.undefined
  
  var zoomEnabled: js.UndefOr[Boolean] = js.undefined
  
  var zoomTapEnabled: js.UndefOr[Boolean] = js.undefined
}
object MapViewProps {
  
  inline def apply(): MapViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapViewProps]
  }
  
  extension [Self <: MapViewProps](x: Self) {
    
    inline def setCacheEnabled(value: Boolean): Self = StObject.set(x, "cacheEnabled", value.asInstanceOf[js.Any])
    
    inline def setCacheEnabledUndefined: Self = StObject.set(x, "cacheEnabled", js.undefined)
    
    inline def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    inline def setCompassOffset(value: Point): Self = StObject.set(x, "compassOffset", value.asInstanceOf[js.Any])
    
    inline def setCompassOffsetUndefined: Self = StObject.set(x, "compassOffset", js.undefined)
    
    inline def setCustomMapStyle(value: js.Array[MapStyleElement]): Self = StObject.set(x, "customMapStyle", value.asInstanceOf[js.Any])
    
    inline def setCustomMapStyleString(value: String): Self = StObject.set(x, "customMapStyleString", value.asInstanceOf[js.Any])
    
    inline def setCustomMapStyleStringUndefined: Self = StObject.set(x, "customMapStyleString", js.undefined)
    
    inline def setCustomMapStyleUndefined: Self = StObject.set(x, "customMapStyle", js.undefined)
    
    inline def setCustomMapStyleVarargs(value: MapStyleElement*): Self = StObject.set(x, "customMapStyle", js.Array(value :_*))
    
    inline def setFollowsUserLocation(value: Boolean): Self = StObject.set(x, "followsUserLocation", value.asInstanceOf[js.Any])
    
    inline def setFollowsUserLocationUndefined: Self = StObject.set(x, "followsUserLocation", js.undefined)
    
    inline def setInitialCamera(value: Camera): Self = StObject.set(x, "initialCamera", value.asInstanceOf[js.Any])
    
    inline def setInitialCameraUndefined: Self = StObject.set(x, "initialCamera", js.undefined)
    
    inline def setInitialRegion(value: Region): Self = StObject.set(x, "initialRegion", value.asInstanceOf[js.Any])
    
    inline def setInitialRegionUndefined: Self = StObject.set(x, "initialRegion", js.undefined)
    
    inline def setKmlSrc(value: String): Self = StObject.set(x, "kmlSrc", value.asInstanceOf[js.Any])
    
    inline def setKmlSrcUndefined: Self = StObject.set(x, "kmlSrc", js.undefined)
    
    inline def setLegalLabelInsets(value: EdgeInsets): Self = StObject.set(x, "legalLabelInsets", value.asInstanceOf[js.Any])
    
    inline def setLegalLabelInsetsUndefined: Self = StObject.set(x, "legalLabelInsets", js.undefined)
    
    inline def setLiteMode(value: Boolean): Self = StObject.set(x, "liteMode", value.asInstanceOf[js.Any])
    
    inline def setLiteModeUndefined: Self = StObject.set(x, "liteMode", js.undefined)
    
    inline def setLoadingBackgroundColor(value: String): Self = StObject.set(x, "loadingBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setLoadingBackgroundColorUndefined: Self = StObject.set(x, "loadingBackgroundColor", js.undefined)
    
    inline def setLoadingEnabled(value: Boolean): Self = StObject.set(x, "loadingEnabled", value.asInstanceOf[js.Any])
    
    inline def setLoadingEnabledUndefined: Self = StObject.set(x, "loadingEnabled", js.undefined)
    
    inline def setLoadingIndicatorColor(value: String): Self = StObject.set(x, "loadingIndicatorColor", value.asInstanceOf[js.Any])
    
    inline def setLoadingIndicatorColorUndefined: Self = StObject.set(x, "loadingIndicatorColor", js.undefined)
    
    inline def setMapPadding(value: EdgePadding): Self = StObject.set(x, "mapPadding", value.asInstanceOf[js.Any])
    
    inline def setMapPaddingUndefined: Self = StObject.set(x, "mapPadding", js.undefined)
    
    inline def setMapType(value: MapTypes): Self = StObject.set(x, "mapType", value.asInstanceOf[js.Any])
    
    inline def setMapTypeUndefined: Self = StObject.set(x, "mapType", js.undefined)
    
    inline def setMaxDelta(value: Double): Self = StObject.set(x, "maxDelta", value.asInstanceOf[js.Any])
    
    inline def setMaxDeltaUndefined: Self = StObject.set(x, "maxDelta", js.undefined)
    
    inline def setMaxZoomLevel(value: Double): Self = StObject.set(x, "maxZoomLevel", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomLevelUndefined: Self = StObject.set(x, "maxZoomLevel", js.undefined)
    
    inline def setMinDelta(value: Double): Self = StObject.set(x, "minDelta", value.asInstanceOf[js.Any])
    
    inline def setMinDeltaUndefined: Self = StObject.set(x, "minDelta", js.undefined)
    
    inline def setMinZoomLevel(value: Double): Self = StObject.set(x, "minZoomLevel", value.asInstanceOf[js.Any])
    
    inline def setMinZoomLevelUndefined: Self = StObject.set(x, "minZoomLevel", js.undefined)
    
    inline def setMoveOnMarkerPress(value: Boolean): Self = StObject.set(x, "moveOnMarkerPress", value.asInstanceOf[js.Any])
    
    inline def setMoveOnMarkerPressUndefined: Self = StObject.set(x, "moveOnMarkerPress", js.undefined)
    
    inline def setOnCalloutPress(value: /* event */ MapEvent[`0`] => Unit): Self = StObject.set(x, "onCalloutPress", js.Any.fromFunction1(value))
    
    inline def setOnCalloutPressUndefined: Self = StObject.set(x, "onCalloutPress", js.undefined)
    
    inline def setOnKmlReady(value: /* values */ KmlMapEvent => Unit): Self = StObject.set(x, "onKmlReady", js.Any.fromFunction1(value))
    
    inline def setOnKmlReadyUndefined: Self = StObject.set(x, "onKmlReady", js.undefined)
    
    inline def setOnLongPress(value: /* event */ MapEvent[js.Object] => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
    
    inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    inline def setOnMapReady(value: () => Unit): Self = StObject.set(x, "onMapReady", js.Any.fromFunction0(value))
    
    inline def setOnMapReadyUndefined: Self = StObject.set(x, "onMapReady", js.undefined)
    
    inline def setOnMarkerDeselect(value: /* event */ MapEvent[ActionId] => Unit): Self = StObject.set(x, "onMarkerDeselect", js.Any.fromFunction1(value))
    
    inline def setOnMarkerDeselectUndefined: Self = StObject.set(x, "onMarkerDeselect", js.undefined)
    
    inline def setOnMarkerDrag(value: /* event */ MapEvent[js.Object] => Unit): Self = StObject.set(x, "onMarkerDrag", js.Any.fromFunction1(value))
    
    inline def setOnMarkerDragEnd(value: /* event */ MapEvent[js.Object] => Unit): Self = StObject.set(x, "onMarkerDragEnd", js.Any.fromFunction1(value))
    
    inline def setOnMarkerDragEndUndefined: Self = StObject.set(x, "onMarkerDragEnd", js.undefined)
    
    inline def setOnMarkerDragStart(value: /* event */ MapEvent[js.Object] => Unit): Self = StObject.set(x, "onMarkerDragStart", js.Any.fromFunction1(value))
    
    inline def setOnMarkerDragStartUndefined: Self = StObject.set(x, "onMarkerDragStart", js.undefined)
    
    inline def setOnMarkerDragUndefined: Self = StObject.set(x, "onMarkerDrag", js.undefined)
    
    inline def setOnMarkerPress(value: /* event */ MapEvent[Action] => Unit): Self = StObject.set(x, "onMarkerPress", js.Any.fromFunction1(value))
    
    inline def setOnMarkerPressUndefined: Self = StObject.set(x, "onMarkerPress", js.undefined)
    
    inline def setOnMarkerSelect(value: /* event */ MapEvent[Id] => Unit): Self = StObject.set(x, "onMarkerSelect", js.Any.fromFunction1(value))
    
    inline def setOnMarkerSelectUndefined: Self = StObject.set(x, "onMarkerSelect", js.undefined)
    
    inline def setOnPanDrag(value: /* event */ MapEvent[js.Object] => Unit): Self = StObject.set(x, "onPanDrag", js.Any.fromFunction1(value))
    
    inline def setOnPanDragUndefined: Self = StObject.set(x, "onPanDrag", js.undefined)
    
    inline def setOnPoiClick(value: /* event */ MapEvent[Name] => Unit): Self = StObject.set(x, "onPoiClick", js.Any.fromFunction1(value))
    
    inline def setOnPoiClickUndefined: Self = StObject.set(x, "onPoiClick", js.undefined)
    
    inline def setOnPress(value: /* event */ MapEvent[js.Object] => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setOnRegionChange(value: /* region */ Region => Unit): Self = StObject.set(x, "onRegionChange", js.Any.fromFunction1(value))
    
    inline def setOnRegionChangeComplete(value: /* region */ Region => Unit): Self = StObject.set(x, "onRegionChangeComplete", js.Any.fromFunction1(value))
    
    inline def setOnRegionChangeCompleteUndefined: Self = StObject.set(x, "onRegionChangeComplete", js.undefined)
    
    inline def setOnRegionChangeUndefined: Self = StObject.set(x, "onRegionChange", js.undefined)
    
    inline def setOnUserLocationChange(value: /* event */ EventUserLocation => Unit): Self = StObject.set(x, "onUserLocationChange", js.Any.fromFunction1(value))
    
    inline def setOnUserLocationChangeUndefined: Self = StObject.set(x, "onUserLocationChange", js.undefined)
    
    inline def setPitchEnabled(value: Boolean): Self = StObject.set(x, "pitchEnabled", value.asInstanceOf[js.Any])
    
    inline def setPitchEnabledUndefined: Self = StObject.set(x, "pitchEnabled", js.undefined)
    
    inline def setProvider(value: google): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderNull: Self = StObject.set(x, "provider", null)
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRotateEnabled(value: Boolean): Self = StObject.set(x, "rotateEnabled", value.asInstanceOf[js.Any])
    
    inline def setRotateEnabledUndefined: Self = StObject.set(x, "rotateEnabled", js.undefined)
    
    inline def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
    
    inline def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
    
    inline def setShowsBuildings(value: Boolean): Self = StObject.set(x, "showsBuildings", value.asInstanceOf[js.Any])
    
    inline def setShowsBuildingsUndefined: Self = StObject.set(x, "showsBuildings", js.undefined)
    
    inline def setShowsCompass(value: Boolean): Self = StObject.set(x, "showsCompass", value.asInstanceOf[js.Any])
    
    inline def setShowsCompassUndefined: Self = StObject.set(x, "showsCompass", js.undefined)
    
    inline def setShowsIndoorLevelPicker(value: Boolean): Self = StObject.set(x, "showsIndoorLevelPicker", value.asInstanceOf[js.Any])
    
    inline def setShowsIndoorLevelPickerUndefined: Self = StObject.set(x, "showsIndoorLevelPicker", js.undefined)
    
    inline def setShowsIndoors(value: Boolean): Self = StObject.set(x, "showsIndoors", value.asInstanceOf[js.Any])
    
    inline def setShowsIndoorsUndefined: Self = StObject.set(x, "showsIndoors", js.undefined)
    
    inline def setShowsMyLocationButton(value: Boolean): Self = StObject.set(x, "showsMyLocationButton", value.asInstanceOf[js.Any])
    
    inline def setShowsMyLocationButtonUndefined: Self = StObject.set(x, "showsMyLocationButton", js.undefined)
    
    inline def setShowsPointsOfInterest(value: Boolean): Self = StObject.set(x, "showsPointsOfInterest", value.asInstanceOf[js.Any])
    
    inline def setShowsPointsOfInterestUndefined: Self = StObject.set(x, "showsPointsOfInterest", js.undefined)
    
    inline def setShowsScale(value: Boolean): Self = StObject.set(x, "showsScale", value.asInstanceOf[js.Any])
    
    inline def setShowsScaleUndefined: Self = StObject.set(x, "showsScale", js.undefined)
    
    inline def setShowsTraffic(value: Boolean): Self = StObject.set(x, "showsTraffic", value.asInstanceOf[js.Any])
    
    inline def setShowsTrafficUndefined: Self = StObject.set(x, "showsTraffic", js.undefined)
    
    inline def setShowsUserLocation(value: Boolean): Self = StObject.set(x, "showsUserLocation", value.asInstanceOf[js.Any])
    
    inline def setShowsUserLocationUndefined: Self = StObject.set(x, "showsUserLocation", js.undefined)
    
    inline def setToolbarEnabled(value: Boolean): Self = StObject.set(x, "toolbarEnabled", value.asInstanceOf[js.Any])
    
    inline def setToolbarEnabledUndefined: Self = StObject.set(x, "toolbarEnabled", js.undefined)
    
    inline def setUserLocationAnnotationTitle(value: String): Self = StObject.set(x, "userLocationAnnotationTitle", value.asInstanceOf[js.Any])
    
    inline def setUserLocationAnnotationTitleUndefined: Self = StObject.set(x, "userLocationAnnotationTitle", js.undefined)
    
    inline def setZoomControlEnabled(value: Boolean): Self = StObject.set(x, "zoomControlEnabled", value.asInstanceOf[js.Any])
    
    inline def setZoomControlEnabledUndefined: Self = StObject.set(x, "zoomControlEnabled", js.undefined)
    
    inline def setZoomEnabled(value: Boolean): Self = StObject.set(x, "zoomEnabled", value.asInstanceOf[js.Any])
    
    inline def setZoomEnabledUndefined: Self = StObject.set(x, "zoomEnabled", js.undefined)
    
    inline def setZoomTapEnabled(value: Boolean): Self = StObject.set(x, "zoomTapEnabled", value.asInstanceOf[js.Any])
    
    inline def setZoomTapEnabledUndefined: Self = StObject.set(x, "zoomTapEnabled", js.undefined)
  }
}
