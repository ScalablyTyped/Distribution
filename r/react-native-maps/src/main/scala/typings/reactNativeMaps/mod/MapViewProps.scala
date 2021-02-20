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
  implicit class MapViewPropsMutableBuilder[Self <: MapViewProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheEnabled(value: Boolean): Self = StObject.set(x, "cacheEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheEnabledUndefined: Self = StObject.set(x, "cacheEnabled", js.undefined)
    
    @scala.inline
    def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    @scala.inline
    def setCompassOffset(value: Point): Self = StObject.set(x, "compassOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompassOffsetUndefined: Self = StObject.set(x, "compassOffset", js.undefined)
    
    @scala.inline
    def setCustomMapStyle(value: js.Array[MapStyleElement]): Self = StObject.set(x, "customMapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMapStyleString(value: String): Self = StObject.set(x, "customMapStyleString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMapStyleStringUndefined: Self = StObject.set(x, "customMapStyleString", js.undefined)
    
    @scala.inline
    def setCustomMapStyleUndefined: Self = StObject.set(x, "customMapStyle", js.undefined)
    
    @scala.inline
    def setCustomMapStyleVarargs(value: MapStyleElement*): Self = StObject.set(x, "customMapStyle", js.Array(value :_*))
    
    @scala.inline
    def setFollowsUserLocation(value: Boolean): Self = StObject.set(x, "followsUserLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowsUserLocationUndefined: Self = StObject.set(x, "followsUserLocation", js.undefined)
    
    @scala.inline
    def setInitialCamera(value: Camera): Self = StObject.set(x, "initialCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialCameraUndefined: Self = StObject.set(x, "initialCamera", js.undefined)
    
    @scala.inline
    def setInitialRegion(value: Region): Self = StObject.set(x, "initialRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialRegionUndefined: Self = StObject.set(x, "initialRegion", js.undefined)
    
    @scala.inline
    def setKmlSrc(value: String): Self = StObject.set(x, "kmlSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmlSrcUndefined: Self = StObject.set(x, "kmlSrc", js.undefined)
    
    @scala.inline
    def setLegalLabelInsets(value: EdgeInsets): Self = StObject.set(x, "legalLabelInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalLabelInsetsUndefined: Self = StObject.set(x, "legalLabelInsets", js.undefined)
    
    @scala.inline
    def setLiteMode(value: Boolean): Self = StObject.set(x, "liteMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiteModeUndefined: Self = StObject.set(x, "liteMode", js.undefined)
    
    @scala.inline
    def setLoadingBackgroundColor(value: String): Self = StObject.set(x, "loadingBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingBackgroundColorUndefined: Self = StObject.set(x, "loadingBackgroundColor", js.undefined)
    
    @scala.inline
    def setLoadingEnabled(value: Boolean): Self = StObject.set(x, "loadingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingEnabledUndefined: Self = StObject.set(x, "loadingEnabled", js.undefined)
    
    @scala.inline
    def setLoadingIndicatorColor(value: String): Self = StObject.set(x, "loadingIndicatorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingIndicatorColorUndefined: Self = StObject.set(x, "loadingIndicatorColor", js.undefined)
    
    @scala.inline
    def setMapPadding(value: EdgePadding): Self = StObject.set(x, "mapPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapPaddingUndefined: Self = StObject.set(x, "mapPadding", js.undefined)
    
    @scala.inline
    def setMapType(value: MapTypes): Self = StObject.set(x, "mapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapTypeUndefined: Self = StObject.set(x, "mapType", js.undefined)
    
    @scala.inline
    def setMaxDelta(value: Double): Self = StObject.set(x, "maxDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDeltaUndefined: Self = StObject.set(x, "maxDelta", js.undefined)
    
    @scala.inline
    def setMaxZoomLevel(value: Double): Self = StObject.set(x, "maxZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomLevelUndefined: Self = StObject.set(x, "maxZoomLevel", js.undefined)
    
    @scala.inline
    def setMinDelta(value: Double): Self = StObject.set(x, "minDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDeltaUndefined: Self = StObject.set(x, "minDelta", js.undefined)
    
    @scala.inline
    def setMinZoomLevel(value: Double): Self = StObject.set(x, "minZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomLevelUndefined: Self = StObject.set(x, "minZoomLevel", js.undefined)
    
    @scala.inline
    def setMoveOnMarkerPress(value: Boolean): Self = StObject.set(x, "moveOnMarkerPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveOnMarkerPressUndefined: Self = StObject.set(x, "moveOnMarkerPress", js.undefined)
    
    @scala.inline
    def setOnCalloutPress(value: /* event */ MapEvent[`0`] => Unit): Self = StObject.set(x, "onCalloutPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCalloutPressUndefined: Self = StObject.set(x, "onCalloutPress", js.undefined)
    
    @scala.inline
    def setOnKmlReady(value: /* values */ KmlMapEvent => Unit): Self = StObject.set(x, "onKmlReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKmlReadyUndefined: Self = StObject.set(x, "onKmlReady", js.undefined)
    
    @scala.inline
    def setOnLongPress(value: /* event */ MapEvent[js.Object] => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    @scala.inline
    def setOnMapReady(value: () => Unit): Self = StObject.set(x, "onMapReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMapReadyUndefined: Self = StObject.set(x, "onMapReady", js.undefined)
    
    @scala.inline
    def setOnMarkerDeselect(value: /* event */ MapEvent[ActionId] => Unit): Self = StObject.set(x, "onMarkerDeselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMarkerDeselectUndefined: Self = StObject.set(x, "onMarkerDeselect", js.undefined)
    
    @scala.inline
    def setOnMarkerDrag(value: /* event */ MapEvent[js.Object] => Unit): Self = StObject.set(x, "onMarkerDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMarkerDragEnd(value: /* event */ MapEvent[js.Object] => Unit): Self = StObject.set(x, "onMarkerDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMarkerDragEndUndefined: Self = StObject.set(x, "onMarkerDragEnd", js.undefined)
    
    @scala.inline
    def setOnMarkerDragStart(value: /* event */ MapEvent[js.Object] => Unit): Self = StObject.set(x, "onMarkerDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMarkerDragStartUndefined: Self = StObject.set(x, "onMarkerDragStart", js.undefined)
    
    @scala.inline
    def setOnMarkerDragUndefined: Self = StObject.set(x, "onMarkerDrag", js.undefined)
    
    @scala.inline
    def setOnMarkerPress(value: /* event */ MapEvent[Action] => Unit): Self = StObject.set(x, "onMarkerPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMarkerPressUndefined: Self = StObject.set(x, "onMarkerPress", js.undefined)
    
    @scala.inline
    def setOnMarkerSelect(value: /* event */ MapEvent[Id] => Unit): Self = StObject.set(x, "onMarkerSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMarkerSelectUndefined: Self = StObject.set(x, "onMarkerSelect", js.undefined)
    
    @scala.inline
    def setOnPanDrag(value: /* event */ MapEvent[js.Object] => Unit): Self = StObject.set(x, "onPanDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPanDragUndefined: Self = StObject.set(x, "onPanDrag", js.undefined)
    
    @scala.inline
    def setOnPoiClick(value: /* event */ MapEvent[Name] => Unit): Self = StObject.set(x, "onPoiClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPoiClickUndefined: Self = StObject.set(x, "onPoiClick", js.undefined)
    
    @scala.inline
    def setOnPress(value: /* event */ MapEvent[js.Object] => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setOnRegionChange(value: /* region */ Region => Unit): Self = StObject.set(x, "onRegionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRegionChangeComplete(value: /* region */ Region => Unit): Self = StObject.set(x, "onRegionChangeComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRegionChangeCompleteUndefined: Self = StObject.set(x, "onRegionChangeComplete", js.undefined)
    
    @scala.inline
    def setOnRegionChangeUndefined: Self = StObject.set(x, "onRegionChange", js.undefined)
    
    @scala.inline
    def setOnUserLocationChange(value: /* event */ EventUserLocation => Unit): Self = StObject.set(x, "onUserLocationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUserLocationChangeUndefined: Self = StObject.set(x, "onUserLocationChange", js.undefined)
    
    @scala.inline
    def setPitchEnabled(value: Boolean): Self = StObject.set(x, "pitchEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchEnabledUndefined: Self = StObject.set(x, "pitchEnabled", js.undefined)
    
    @scala.inline
    def setProvider(value: google): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderNull: Self = StObject.set(x, "provider", null)
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    @scala.inline
    def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setRotateEnabled(value: Boolean): Self = StObject.set(x, "rotateEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateEnabledUndefined: Self = StObject.set(x, "rotateEnabled", js.undefined)
    
    @scala.inline
    def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
    
    @scala.inline
    def setShowsBuildings(value: Boolean): Self = StObject.set(x, "showsBuildings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsBuildingsUndefined: Self = StObject.set(x, "showsBuildings", js.undefined)
    
    @scala.inline
    def setShowsCompass(value: Boolean): Self = StObject.set(x, "showsCompass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsCompassUndefined: Self = StObject.set(x, "showsCompass", js.undefined)
    
    @scala.inline
    def setShowsIndoorLevelPicker(value: Boolean): Self = StObject.set(x, "showsIndoorLevelPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsIndoorLevelPickerUndefined: Self = StObject.set(x, "showsIndoorLevelPicker", js.undefined)
    
    @scala.inline
    def setShowsIndoors(value: Boolean): Self = StObject.set(x, "showsIndoors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsIndoorsUndefined: Self = StObject.set(x, "showsIndoors", js.undefined)
    
    @scala.inline
    def setShowsMyLocationButton(value: Boolean): Self = StObject.set(x, "showsMyLocationButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsMyLocationButtonUndefined: Self = StObject.set(x, "showsMyLocationButton", js.undefined)
    
    @scala.inline
    def setShowsPointsOfInterest(value: Boolean): Self = StObject.set(x, "showsPointsOfInterest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsPointsOfInterestUndefined: Self = StObject.set(x, "showsPointsOfInterest", js.undefined)
    
    @scala.inline
    def setShowsScale(value: Boolean): Self = StObject.set(x, "showsScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsScaleUndefined: Self = StObject.set(x, "showsScale", js.undefined)
    
    @scala.inline
    def setShowsTraffic(value: Boolean): Self = StObject.set(x, "showsTraffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsTrafficUndefined: Self = StObject.set(x, "showsTraffic", js.undefined)
    
    @scala.inline
    def setShowsUserLocation(value: Boolean): Self = StObject.set(x, "showsUserLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsUserLocationUndefined: Self = StObject.set(x, "showsUserLocation", js.undefined)
    
    @scala.inline
    def setToolbarEnabled(value: Boolean): Self = StObject.set(x, "toolbarEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarEnabledUndefined: Self = StObject.set(x, "toolbarEnabled", js.undefined)
    
    @scala.inline
    def setUserLocationAnnotationTitle(value: String): Self = StObject.set(x, "userLocationAnnotationTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserLocationAnnotationTitleUndefined: Self = StObject.set(x, "userLocationAnnotationTitle", js.undefined)
    
    @scala.inline
    def setZoomControlEnabled(value: Boolean): Self = StObject.set(x, "zoomControlEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomControlEnabledUndefined: Self = StObject.set(x, "zoomControlEnabled", js.undefined)
    
    @scala.inline
    def setZoomEnabled(value: Boolean): Self = StObject.set(x, "zoomEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomEnabledUndefined: Self = StObject.set(x, "zoomEnabled", js.undefined)
    
    @scala.inline
    def setZoomTapEnabled(value: Boolean): Self = StObject.set(x, "zoomTapEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomTapEnabledUndefined: Self = StObject.set(x, "zoomTapEnabled", js.undefined)
  }
}
