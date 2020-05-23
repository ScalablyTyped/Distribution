package typings.reactNativeMaps.mod

import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
import typings.reactNative.reactNativeStrings.`box-none`
import typings.reactNative.reactNativeStrings.`box-only`
import typings.reactNative.reactNativeStrings.`no-hide-descendants`
import typings.reactNative.reactNativeStrings.assertive
import typings.reactNative.reactNativeStrings.auto
import typings.reactNative.reactNativeStrings.button
import typings.reactNative.reactNativeStrings.no
import typings.reactNative.reactNativeStrings.none
import typings.reactNative.reactNativeStrings.polite
import typings.reactNative.reactNativeStrings.radiobutton_checked
import typings.reactNative.reactNativeStrings.radiobutton_unchecked
import typings.reactNative.reactNativeStrings.yes
import typings.reactNativeMaps.anon.Action
import typings.reactNativeMaps.anon.ActionId
import typings.reactNativeMaps.anon.Id
import typings.reactNativeMaps.anon.Name
import typings.reactNativeMaps.anon.`0`
import typings.reactNativeMaps.reactNativeMapsStrings.google
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewProps extends ViewProps {
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
  @scala.inline
  def apply(
    accessibilityActions: js.Array[AccessibilityActionInfo] = null,
    accessibilityComponentType: none | button | radiobutton_checked | radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityHint: String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    accessibilityLiveRegion: none | polite | assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityState: AccessibilityState = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessibilityValue: AccessibilityValue = null,
    accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined,
    accessible: js.UndefOr[Boolean] = js.undefined,
    cacheEnabled: js.UndefOr[Boolean] = js.undefined,
    camera: Camera = null,
    collapsable: js.UndefOr[Boolean] = js.undefined,
    compassOffset: Point = null,
    customMapStyle: js.Array[MapStyleElement] = null,
    customMapStyleString: String = null,
    followsUserLocation: js.UndefOr[Boolean] = js.undefined,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    initialCamera: Camera = null,
    initialRegion: Region = null,
    isTVSelectable: js.UndefOr[Boolean] = js.undefined,
    kmlSrc: String = null,
    legalLabelInsets: EdgeInsets = null,
    liteMode: js.UndefOr[Boolean] = js.undefined,
    loadingBackgroundColor: String = null,
    loadingEnabled: js.UndefOr[Boolean] = js.undefined,
    loadingIndicatorColor: String = null,
    mapPadding: EdgePadding = null,
    mapType: MapTypes = null,
    maxDelta: js.UndefOr[Double] = js.undefined,
    maxZoomLevel: js.UndefOr[Double] = js.undefined,
    minDelta: js.UndefOr[Double] = js.undefined,
    minZoomLevel: js.UndefOr[Double] = js.undefined,
    moveOnMarkerPress: js.UndefOr[Boolean] = js.undefined,
    nativeID: String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
    onAccessibilityAction: /* event */ AccessibilityActionEvent => Unit = null,
    onAccessibilityEscape: () => Unit = null,
    onAccessibilityTap: () => Unit = null,
    onCalloutPress: /* event */ MapEvent[`0`] => Unit = null,
    onKmlReady: /* values */ KmlMapEvent => Unit = null,
    onLayout: /* event */ LayoutChangeEvent => Unit = null,
    onLongPress: /* event */ MapEvent[js.Object] => Unit = null,
    onMagicTap: () => Unit = null,
    onMapReady: () => Unit = null,
    onMarkerDeselect: /* event */ MapEvent[ActionId] => Unit = null,
    onMarkerDrag: /* event */ MapEvent[js.Object] => Unit = null,
    onMarkerDragEnd: /* event */ MapEvent[js.Object] => Unit = null,
    onMarkerDragStart: /* event */ MapEvent[js.Object] => Unit = null,
    onMarkerPress: /* event */ MapEvent[Action] => Unit = null,
    onMarkerSelect: /* event */ MapEvent[Id] => Unit = null,
    onMoveShouldSetResponder: /* event */ GestureResponderEvent => Boolean = null,
    onMoveShouldSetResponderCapture: /* event */ GestureResponderEvent => Boolean = null,
    onPanDrag: /* event */ MapEvent[js.Object] => Unit = null,
    onPoiClick: /* event */ MapEvent[Name] => Unit = null,
    onPress: /* event */ MapEvent[js.Object] => Unit = null,
    onRegionChange: /* region */ Region => Unit = null,
    onRegionChangeComplete: /* region */ Region => Unit = null,
    onResponderEnd: /* event */ GestureResponderEvent => Unit = null,
    onResponderGrant: /* event */ GestureResponderEvent => Unit = null,
    onResponderMove: /* event */ GestureResponderEvent => Unit = null,
    onResponderReject: /* event */ GestureResponderEvent => Unit = null,
    onResponderRelease: /* event */ GestureResponderEvent => Unit = null,
    onResponderStart: /* event */ GestureResponderEvent => Unit = null,
    onResponderTerminate: /* event */ GestureResponderEvent => Unit = null,
    onResponderTerminationRequest: /* event */ GestureResponderEvent => Boolean = null,
    onStartShouldSetResponder: /* event */ GestureResponderEvent => Boolean = null,
    onStartShouldSetResponderCapture: /* event */ GestureResponderEvent => Boolean = null,
    onTouchCancel: /* event */ GestureResponderEvent => Unit = null,
    onTouchEnd: /* event */ GestureResponderEvent => Unit = null,
    onTouchEndCapture: /* event */ GestureResponderEvent => Unit = null,
    onTouchMove: /* event */ GestureResponderEvent => Unit = null,
    onTouchStart: /* event */ GestureResponderEvent => Unit = null,
    onUserLocationChange: /* event */ EventUserLocation => Unit = null,
    pitchEnabled: js.UndefOr[Boolean] = js.undefined,
    pointerEvents: `box-none` | none | `box-only` | auto = null,
    provider: js.UndefOr[Null | google] = js.undefined,
    region: Region = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
    rotateEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
    showsBuildings: js.UndefOr[Boolean] = js.undefined,
    showsCompass: js.UndefOr[Boolean] = js.undefined,
    showsIndoorLevelPicker: js.UndefOr[Boolean] = js.undefined,
    showsIndoors: js.UndefOr[Boolean] = js.undefined,
    showsMyLocationButton: js.UndefOr[Boolean] = js.undefined,
    showsPointsOfInterest: js.UndefOr[Boolean] = js.undefined,
    showsScale: js.UndefOr[Boolean] = js.undefined,
    showsTraffic: js.UndefOr[Boolean] = js.undefined,
    showsUserLocation: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    testID: String = null,
    toolbarEnabled: js.UndefOr[Boolean] = js.undefined,
    tvParallaxMagnification: js.UndefOr[Double] = js.undefined,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined,
    tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined,
    tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined,
    userLocationAnnotationTitle: String = null,
    zoomControlEnabled: js.UndefOr[Boolean] = js.undefined,
    zoomEnabled: js.UndefOr[Boolean] = js.undefined,
    zoomTapEnabled: js.UndefOr[Boolean] = js.undefined
  ): MapViewProps = {
    val __obj = js.Dynamic.literal()
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.get.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.get.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (accessibilityValue != null) __obj.updateDynamic("accessibilityValue")(accessibilityValue.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheEnabled)) __obj.updateDynamic("cacheEnabled")(cacheEnabled.get.asInstanceOf[js.Any])
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable.get.asInstanceOf[js.Any])
    if (compassOffset != null) __obj.updateDynamic("compassOffset")(compassOffset.asInstanceOf[js.Any])
    if (customMapStyle != null) __obj.updateDynamic("customMapStyle")(customMapStyle.asInstanceOf[js.Any])
    if (customMapStyleString != null) __obj.updateDynamic("customMapStyleString")(customMapStyleString.asInstanceOf[js.Any])
    if (!js.isUndefined(followsUserLocation)) __obj.updateDynamic("followsUserLocation")(followsUserLocation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.get.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (initialCamera != null) __obj.updateDynamic("initialCamera")(initialCamera.asInstanceOf[js.Any])
    if (initialRegion != null) __obj.updateDynamic("initialRegion")(initialRegion.asInstanceOf[js.Any])
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable.get.asInstanceOf[js.Any])
    if (kmlSrc != null) __obj.updateDynamic("kmlSrc")(kmlSrc.asInstanceOf[js.Any])
    if (legalLabelInsets != null) __obj.updateDynamic("legalLabelInsets")(legalLabelInsets.asInstanceOf[js.Any])
    if (!js.isUndefined(liteMode)) __obj.updateDynamic("liteMode")(liteMode.get.asInstanceOf[js.Any])
    if (loadingBackgroundColor != null) __obj.updateDynamic("loadingBackgroundColor")(loadingBackgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(loadingEnabled)) __obj.updateDynamic("loadingEnabled")(loadingEnabled.get.asInstanceOf[js.Any])
    if (loadingIndicatorColor != null) __obj.updateDynamic("loadingIndicatorColor")(loadingIndicatorColor.asInstanceOf[js.Any])
    if (mapPadding != null) __obj.updateDynamic("mapPadding")(mapPadding.asInstanceOf[js.Any])
    if (mapType != null) __obj.updateDynamic("mapType")(mapType.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDelta)) __obj.updateDynamic("maxDelta")(maxDelta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoomLevel)) __obj.updateDynamic("maxZoomLevel")(maxZoomLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minDelta)) __obj.updateDynamic("minDelta")(minDelta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoomLevel)) __obj.updateDynamic("minZoomLevel")(minZoomLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(moveOnMarkerPress)) __obj.updateDynamic("moveOnMarkerPress")(moveOnMarkerPress.get.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing.get.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1(onAccessibilityAction))
    if (onAccessibilityEscape != null) __obj.updateDynamic("onAccessibilityEscape")(js.Any.fromFunction0(onAccessibilityEscape))
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onCalloutPress != null) __obj.updateDynamic("onCalloutPress")(js.Any.fromFunction1(onCalloutPress))
    if (onKmlReady != null) __obj.updateDynamic("onKmlReady")(js.Any.fromFunction1(onKmlReady))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1(onLongPress))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onMapReady != null) __obj.updateDynamic("onMapReady")(js.Any.fromFunction0(onMapReady))
    if (onMarkerDeselect != null) __obj.updateDynamic("onMarkerDeselect")(js.Any.fromFunction1(onMarkerDeselect))
    if (onMarkerDrag != null) __obj.updateDynamic("onMarkerDrag")(js.Any.fromFunction1(onMarkerDrag))
    if (onMarkerDragEnd != null) __obj.updateDynamic("onMarkerDragEnd")(js.Any.fromFunction1(onMarkerDragEnd))
    if (onMarkerDragStart != null) __obj.updateDynamic("onMarkerDragStart")(js.Any.fromFunction1(onMarkerDragStart))
    if (onMarkerPress != null) __obj.updateDynamic("onMarkerPress")(js.Any.fromFunction1(onMarkerPress))
    if (onMarkerSelect != null) __obj.updateDynamic("onMarkerSelect")(js.Any.fromFunction1(onMarkerSelect))
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1(onMoveShouldSetResponder))
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1(onMoveShouldSetResponderCapture))
    if (onPanDrag != null) __obj.updateDynamic("onPanDrag")(js.Any.fromFunction1(onPanDrag))
    if (onPoiClick != null) __obj.updateDynamic("onPoiClick")(js.Any.fromFunction1(onPoiClick))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (onRegionChange != null) __obj.updateDynamic("onRegionChange")(js.Any.fromFunction1(onRegionChange))
    if (onRegionChangeComplete != null) __obj.updateDynamic("onRegionChangeComplete")(js.Any.fromFunction1(onRegionChangeComplete))
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(js.Any.fromFunction1(onResponderEnd))
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(js.Any.fromFunction1(onResponderGrant))
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(js.Any.fromFunction1(onResponderMove))
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(js.Any.fromFunction1(onResponderReject))
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(js.Any.fromFunction1(onResponderRelease))
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(js.Any.fromFunction1(onResponderStart))
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(js.Any.fromFunction1(onResponderTerminate))
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(js.Any.fromFunction1(onResponderTerminationRequest))
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1(onStartShouldSetResponder))
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1(onStartShouldSetResponderCapture))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1(onTouchEndCapture))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onUserLocationChange != null) __obj.updateDynamic("onUserLocationChange")(js.Any.fromFunction1(onUserLocationChange))
    if (!js.isUndefined(pitchEnabled)) __obj.updateDynamic("pitchEnabled")(pitchEnabled.get.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(provider)) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.get.asInstanceOf[js.Any])
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotateEnabled)) __obj.updateDynamic("rotateEnabled")(rotateEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showsBuildings)) __obj.updateDynamic("showsBuildings")(showsBuildings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showsCompass)) __obj.updateDynamic("showsCompass")(showsCompass.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showsIndoorLevelPicker)) __obj.updateDynamic("showsIndoorLevelPicker")(showsIndoorLevelPicker.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showsIndoors)) __obj.updateDynamic("showsIndoors")(showsIndoors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showsMyLocationButton)) __obj.updateDynamic("showsMyLocationButton")(showsMyLocationButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showsPointsOfInterest)) __obj.updateDynamic("showsPointsOfInterest")(showsPointsOfInterest.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showsScale)) __obj.updateDynamic("showsScale")(showsScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showsTraffic)) __obj.updateDynamic("showsTraffic")(showsTraffic.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showsUserLocation)) __obj.updateDynamic("showsUserLocation")(showsUserLocation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbarEnabled)) __obj.updateDynamic("toolbarEnabled")(toolbarEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tvParallaxMagnification)) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.get.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(tvParallaxShiftDistanceX)) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tvParallaxShiftDistanceY)) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tvParallaxTiltAngle)) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.get.asInstanceOf[js.Any])
    if (userLocationAnnotationTitle != null) __obj.updateDynamic("userLocationAnnotationTitle")(userLocationAnnotationTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomControlEnabled)) __obj.updateDynamic("zoomControlEnabled")(zoomControlEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomEnabled)) __obj.updateDynamic("zoomEnabled")(zoomEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomTapEnabled)) __obj.updateDynamic("zoomTapEnabled")(zoomTapEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapViewProps]
  }
}

