package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressViewIOSProps extends ViewProps {
  /**
    * The progress value (between 0 and 1).
    */
  var progress: js.UndefOr[scala.Double] = js.undefined
  /**
    * A stretchable image to display as the progress bar.
    */
  var progressImage: js.UndefOr[ImageURISource | js.Array[ImageURISource]] = js.undefined
  /**
    * The tint color of the progress bar itself.
    */
  var progressTintColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The progress bar style.
    */
  var progressViewStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.default | reactDashNativeLib.reactDashNativeLibStrings.bar
  ] = js.undefined
  /**
    * A stretchable image to display behind the progress bar.
    */
  var trackImage: js.UndefOr[ImageURISource | js.Array[ImageURISource]] = js.undefined
  /**
    * The tint color of the progress bar track.
    */
  var trackTintColor: js.UndefOr[java.lang.String] = js.undefined
}

object ProgressViewIOSProps {
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
    collapsable: js.UndefOr[scala.Boolean] = js.undefined,
    hitSlop: Insets = null,
    importantForAccessibility: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.yes | reactDashNativeLib.reactDashNativeLibStrings.no | reactDashNativeLib.reactDashNativeLibStrings.`no-hide-descendants` = null,
    nativeID: java.lang.String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[scala.Boolean] = js.undefined,
    onAccessibilityAction: js.Function0[scala.Unit] = null,
    onAccessibilityTap: js.Function0[scala.Unit] = null,
    onLayout: js.Function1[/* event */ LayoutChangeEvent, scala.Unit] = null,
    onMagicTap: js.Function0[scala.Unit] = null,
    onMoveShouldSetResponder: js.Function1[/* event */ GestureResponderEvent, scala.Boolean] = null,
    onMoveShouldSetResponderCapture: js.Function1[/* event */ GestureResponderEvent, scala.Boolean] = null,
    onResponderEnd: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderGrant: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderMove: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderReject: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderRelease: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderStart: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderTerminate: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderTerminationRequest: js.Function1[/* event */ GestureResponderEvent, scala.Boolean] = null,
    onStartShouldSetResponder: js.Function1[/* event */ GestureResponderEvent, scala.Boolean] = null,
    onStartShouldSetResponderCapture: js.Function1[/* event */ GestureResponderEvent, scala.Boolean] = null,
    onTouchCancel: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onTouchEnd: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onTouchEndCapture: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onTouchMove: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onTouchStart: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    pointerEvents: reactDashNativeLib.reactDashNativeLibStrings.`box-none` | reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.`box-only` | reactDashNativeLib.reactDashNativeLibStrings.auto = null,
    progress: scala.Int | scala.Double = null,
    progressImage: ImageURISource | js.Array[ImageURISource] = null,
    progressTintColor: java.lang.String = null,
    progressViewStyle: reactDashNativeLib.reactDashNativeLibStrings.default | reactDashNativeLib.reactDashNativeLibStrings.bar = null,
    removeClippedSubviews: js.UndefOr[scala.Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[scala.Boolean] = js.undefined,
    shouldRasterizeIOS: js.UndefOr[scala.Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    testID: java.lang.String = null,
    trackImage: ImageURISource | js.Array[ImageURISource] = null,
    trackTintColor: java.lang.String = null
  ): ProgressViewIOSProps = {
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
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable)
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop)
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID)
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing)
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(onAccessibilityAction)
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(onAccessibilityTap)
    if (onLayout != null) __obj.updateDynamic("onLayout")(onLayout)
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(onMagicTap)
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(onMoveShouldSetResponder)
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(onMoveShouldSetResponderCapture)
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(onResponderEnd)
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(onResponderGrant)
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(onResponderMove)
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(onResponderReject)
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(onResponderRelease)
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(onResponderStart)
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(onResponderTerminate)
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(onResponderTerminationRequest)
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(onStartShouldSetResponder)
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(onStartShouldSetResponderCapture)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(onTouchEndCapture)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (progressImage != null) __obj.updateDynamic("progressImage")(progressImage.asInstanceOf[js.Any])
    if (progressTintColor != null) __obj.updateDynamic("progressTintColor")(progressTintColor)
    if (progressViewStyle != null) __obj.updateDynamic("progressViewStyle")(progressViewStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews)
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid)
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (trackImage != null) __obj.updateDynamic("trackImage")(trackImage.asInstanceOf[js.Any])
    if (trackTintColor != null) __obj.updateDynamic("trackTintColor")(trackTintColor)
    __obj.asInstanceOf[ProgressViewIOSProps]
  }
}

