package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewProps extends ViewProps {
  /**
    * Map annotations with title/subtitle.
    */
  var annotations: js.UndefOr[js.Array[MapViewAnnotation]] = js.undefined
  /**
    * If true the map will follow the user's location whenever it changes.
    * Note that this has no effect unless showsUserLocation is enabled.
    * Default value is true.
    */
  var followUserLocation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Insets for the map's legal label, originally at bottom left of the map. See EdgeInsetsPropType.js for more information.
    */
  var legalLabelInsets: js.UndefOr[Insets] = js.undefined
  /**
    * The map type to be displayed.
    *     standard: standard road map (default)
    *     satellite: satellite view
    *     hybrid: satellite view with roads and points of interest overlayed
    *
    * enum('standard', 'satellite', 'hybrid')
    */
  var mapType: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.standard | reactDashNativeLib.reactDashNativeLibStrings.satellite | reactDashNativeLib.reactDashNativeLibStrings.hybrid
  ] = js.undefined
  /**
    * Maximum size of area that can be displayed.
    */
  var maxDelta: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum size of area that can be displayed.
    */
  var minDelta: js.UndefOr[scala.Double] = js.undefined
  /**
    * Callback that is called once, when the user taps an annotation.
    */
  var onAnnotationPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback that is called continuously when the user is dragging the map.
    */
  var onRegionChange: js.UndefOr[js.Function1[/* region */ MapViewRegion, scala.Unit]] = js.undefined
  /**
    * Callback that is called once, when the user is done moving the map.
    */
  var onRegionChangeComplete: js.UndefOr[js.Function1[/* region */ MapViewRegion, scala.Unit]] = js.undefined
  /**
    * Map overlays
    */
  var overlays: js.UndefOr[js.Array[MapViewOverlay]] = js.undefined
  /**
    * When this property is set to true and a valid camera is associated with the map,
    * the camera’s pitch angle is used to tilt the plane of the map.
    *
    * When this property is set to false, the camera’s pitch angle is ignored and
    * the map is always displayed as if the user is looking straight down onto it.
    */
  var pitchEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The region to be displayed by the map.
    * The region is defined by the center coordinates and the span of coordinates to display.
    */
  var region: js.UndefOr[MapViewRegion] = js.undefined
  /**
    * When this property is set to true and a valid camera is associated with the map,
    * the camera’s heading angle is used to rotate the plane of the map around its center point.
    *
    * When this property is set to false, the camera’s heading angle is ignored and the map is always oriented
    * so that true north is situated at the top of the map view
    */
  var rotateEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If false the user won't be able to change the map region being displayed.
    * Default value is true.
    */
  var scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If false compass won't be displayed on the map.
    * Default value is true.
    */
  var showsCompass: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If false points of interest won't be displayed on the map.
    * Default value is true.
    */
  var showsPointsOfInterest: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true the app will ask for the user's location and focus on it.
    * Default value is false.
    *
    * NOTE: You need to add NSLocationWhenInUseUsageDescription key in Info.plist to enable geolocation,
    * otherwise it is going to fail silently!
    */
  var showsUserLocation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If false the user won't be able to pinch/zoom the map.
    * Default value is true.
    */
  var zoomEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object MapViewProps {
  @scala.inline
  def apply(
    accessibilityActions: js.Array[java.lang.String] = null,
    accessibilityComponentType: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.button | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_checked | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityHint: java.lang.String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityLabel: java.lang.String = null,
    accessibilityLiveRegion: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.polite | reactDashNativeLib.reactDashNativeLibStrings.assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityStates: js.Array[AccessibilityState] = null,
    accessibilityTraits: reactDashNativeLib.AccessibilityTrait | js.Array[reactDashNativeLib.AccessibilityTrait] = null,
    accessibilityViewIsModal: js.UndefOr[scala.Boolean] = js.undefined,
    accessible: js.UndefOr[scala.Boolean] = js.undefined,
    annotations: js.Array[MapViewAnnotation] = null,
    collapsable: js.UndefOr[scala.Boolean] = js.undefined,
    followUserLocation: js.UndefOr[scala.Boolean] = js.undefined,
    hitSlop: Insets = null,
    importantForAccessibility: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.yes | reactDashNativeLib.reactDashNativeLibStrings.no | reactDashNativeLib.reactDashNativeLibStrings.`no-hide-descendants` = null,
    legalLabelInsets: Insets = null,
    mapType: reactDashNativeLib.reactDashNativeLibStrings.standard | reactDashNativeLib.reactDashNativeLibStrings.satellite | reactDashNativeLib.reactDashNativeLibStrings.hybrid = null,
    maxDelta: scala.Int | scala.Double = null,
    minDelta: scala.Int | scala.Double = null,
    nativeID: java.lang.String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[scala.Boolean] = js.undefined,
    onAccessibilityAction: () => scala.Unit = null,
    onAccessibilityTap: () => scala.Unit = null,
    onAnnotationPress: () => scala.Unit = null,
    onLayout: /* event */ LayoutChangeEvent => scala.Unit = null,
    onMagicTap: () => scala.Unit = null,
    onMoveShouldSetResponder: /* event */ GestureResponderEvent => scala.Boolean = null,
    onMoveShouldSetResponderCapture: /* event */ GestureResponderEvent => scala.Boolean = null,
    onRegionChange: /* region */ MapViewRegion => scala.Unit = null,
    onRegionChangeComplete: /* region */ MapViewRegion => scala.Unit = null,
    onResponderEnd: /* event */ GestureResponderEvent => scala.Unit = null,
    onResponderGrant: /* event */ GestureResponderEvent => scala.Unit = null,
    onResponderMove: /* event */ GestureResponderEvent => scala.Unit = null,
    onResponderReject: /* event */ GestureResponderEvent => scala.Unit = null,
    onResponderRelease: /* event */ GestureResponderEvent => scala.Unit = null,
    onResponderStart: /* event */ GestureResponderEvent => scala.Unit = null,
    onResponderTerminate: /* event */ GestureResponderEvent => scala.Unit = null,
    onResponderTerminationRequest: /* event */ GestureResponderEvent => scala.Boolean = null,
    onStartShouldSetResponder: /* event */ GestureResponderEvent => scala.Boolean = null,
    onStartShouldSetResponderCapture: /* event */ GestureResponderEvent => scala.Boolean = null,
    onTouchCancel: /* event */ GestureResponderEvent => scala.Unit = null,
    onTouchEnd: /* event */ GestureResponderEvent => scala.Unit = null,
    onTouchEndCapture: /* event */ GestureResponderEvent => scala.Unit = null,
    onTouchMove: /* event */ GestureResponderEvent => scala.Unit = null,
    onTouchStart: /* event */ GestureResponderEvent => scala.Unit = null,
    overlays: js.Array[MapViewOverlay] = null,
    pitchEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    pointerEvents: reactDashNativeLib.reactDashNativeLibStrings.`box-none` | reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.`box-only` | reactDashNativeLib.reactDashNativeLibStrings.auto = null,
    region: MapViewRegion = null,
    removeClippedSubviews: js.UndefOr[scala.Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[scala.Boolean] = js.undefined,
    rotateEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    shouldRasterizeIOS: js.UndefOr[scala.Boolean] = js.undefined,
    showsCompass: js.UndefOr[scala.Boolean] = js.undefined,
    showsPointsOfInterest: js.UndefOr[scala.Boolean] = js.undefined,
    showsUserLocation: js.UndefOr[scala.Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    testID: java.lang.String = null,
    zoomEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): MapViewProps = {
    val __obj = js.Dynamic.literal()
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions)
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden)
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint)
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors)
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole)
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates)
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal)
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible)
    if (annotations != null) __obj.updateDynamic("annotations")(annotations)
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable)
    if (!js.isUndefined(followUserLocation)) __obj.updateDynamic("followUserLocation")(followUserLocation)
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop)
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (legalLabelInsets != null) __obj.updateDynamic("legalLabelInsets")(legalLabelInsets)
    if (mapType != null) __obj.updateDynamic("mapType")(mapType.asInstanceOf[js.Any])
    if (maxDelta != null) __obj.updateDynamic("maxDelta")(maxDelta.asInstanceOf[js.Any])
    if (minDelta != null) __obj.updateDynamic("minDelta")(minDelta.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID)
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing)
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction0(onAccessibilityAction))
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onAnnotationPress != null) __obj.updateDynamic("onAnnotationPress")(js.Any.fromFunction0(onAnnotationPress))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1(onMoveShouldSetResponder))
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1(onMoveShouldSetResponderCapture))
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
    if (overlays != null) __obj.updateDynamic("overlays")(overlays)
    if (!js.isUndefined(pitchEnabled)) __obj.updateDynamic("pitchEnabled")(pitchEnabled)
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region)
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews)
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid)
    if (!js.isUndefined(rotateEnabled)) __obj.updateDynamic("rotateEnabled")(rotateEnabled)
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled)
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS)
    if (!js.isUndefined(showsCompass)) __obj.updateDynamic("showsCompass")(showsCompass)
    if (!js.isUndefined(showsPointsOfInterest)) __obj.updateDynamic("showsPointsOfInterest")(showsPointsOfInterest)
    if (!js.isUndefined(showsUserLocation)) __obj.updateDynamic("showsUserLocation")(showsUserLocation)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (!js.isUndefined(zoomEnabled)) __obj.updateDynamic("zoomEnabled")(zoomEnabled)
    __obj.asInstanceOf[MapViewProps]
  }
}

