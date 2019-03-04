package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageBackgroundProps extends ImagePropsBase {
  var imageRef: js.UndefOr[js.Function1[/* image */ Image, scala.Unit]] = js.undefined
  var imageStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object ImageBackgroundProps {
  @scala.inline
  def apply(
    source: ImageSourcePropType,
    accessibilityComponentType: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.button | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_checked | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityHint: java.lang.String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityLabel: java.lang.String = null,
    accessibilityLiveRegion: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.polite | reactDashNativeLib.reactDashNativeLibStrings.assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityStates: js.Array[AccessibilityState] = null,
    accessibilityTraits: reactDashNativeLib.AccessibilityTrait | js.Array[reactDashNativeLib.AccessibilityTrait] = null,
    accessible: js.UndefOr[scala.Boolean] = js.undefined,
    blurRadius: scala.Int | scala.Double = null,
    borderBottomLeftRadius: scala.Int | scala.Double = null,
    borderBottomRightRadius: scala.Int | scala.Double = null,
    borderRadius: scala.Int | scala.Double = null,
    borderTopLeftRadius: scala.Int | scala.Double = null,
    borderTopRightRadius: scala.Int | scala.Double = null,
    capInsets: Insets = null,
    defaultSource: ImageURISource | scala.Double = null,
    fadeDuration: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    imageRef: js.Function1[/* image */ Image, scala.Unit] = null,
    imageStyle: StyleProp[ImageStyle] = null,
    importantForAccessibility: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.yes | reactDashNativeLib.reactDashNativeLibStrings.no | reactDashNativeLib.reactDashNativeLibStrings.`no-hide-descendants` = null,
    loadingIndicatorSource: ImageURISource = null,
    onAccessibilityTap: js.Function0[scala.Unit] = null,
    onError: js.Function1[/* error */ NativeSyntheticEvent[ImageErrorEventData], scala.Unit] = null,
    onLayout: js.Function1[/* event */ LayoutChangeEvent, scala.Unit] = null,
    onLoad: js.Function1[/* event */ NativeSyntheticEvent[ImageLoadEventData], scala.Unit] = null,
    onLoadEnd: js.Function0[scala.Unit] = null,
    onLoadStart: js.Function0[scala.Unit] = null,
    onMagicTap: js.Function0[scala.Unit] = null,
    onPartialLoad: js.Function0[scala.Unit] = null,
    onProgress: js.Function1[/* event */ NativeSyntheticEvent[ImageProgressEventDataIOS], scala.Unit] = null,
    progressiveRenderingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    resizeMethod: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.resize | reactDashNativeLib.reactDashNativeLibStrings.scale = null,
    resizeMode: ImageResizeMode = null,
    style: StyleProp[ViewStyle] = null,
    testID: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): ImageBackgroundProps = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden)
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint)
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors)
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole)
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates)
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible)
    if (blurRadius != null) __obj.updateDynamic("blurRadius")(blurRadius.asInstanceOf[js.Any])
    if (borderBottomLeftRadius != null) __obj.updateDynamic("borderBottomLeftRadius")(borderBottomLeftRadius.asInstanceOf[js.Any])
    if (borderBottomRightRadius != null) __obj.updateDynamic("borderBottomRightRadius")(borderBottomRightRadius.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderTopLeftRadius != null) __obj.updateDynamic("borderTopLeftRadius")(borderTopLeftRadius.asInstanceOf[js.Any])
    if (borderTopRightRadius != null) __obj.updateDynamic("borderTopRightRadius")(borderTopRightRadius.asInstanceOf[js.Any])
    if (capInsets != null) __obj.updateDynamic("capInsets")(capInsets)
    if (defaultSource != null) __obj.updateDynamic("defaultSource")(defaultSource.asInstanceOf[js.Any])
    if (fadeDuration != null) __obj.updateDynamic("fadeDuration")(fadeDuration.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (imageRef != null) __obj.updateDynamic("imageRef")(imageRef)
    if (imageStyle != null) __obj.updateDynamic("imageStyle")(imageStyle.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (loadingIndicatorSource != null) __obj.updateDynamic("loadingIndicatorSource")(loadingIndicatorSource)
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(onAccessibilityTap)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onLayout != null) __obj.updateDynamic("onLayout")(onLayout)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (onLoadEnd != null) __obj.updateDynamic("onLoadEnd")(onLoadEnd)
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(onLoadStart)
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(onMagicTap)
    if (onPartialLoad != null) __obj.updateDynamic("onPartialLoad")(onPartialLoad)
    if (onProgress != null) __obj.updateDynamic("onProgress")(onProgress)
    if (!js.isUndefined(progressiveRenderingEnabled)) __obj.updateDynamic("progressiveRenderingEnabled")(progressiveRenderingEnabled)
    if (resizeMethod != null) __obj.updateDynamic("resizeMethod")(resizeMethod.asInstanceOf[js.Any])
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageBackgroundProps]
  }
}

