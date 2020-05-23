package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.`no-hide-descendants`
import typings.reactNative.reactNativeStrings.assertive
import typings.reactNative.reactNativeStrings.auto
import typings.reactNative.reactNativeStrings.button
import typings.reactNative.reactNativeStrings.no
import typings.reactNative.reactNativeStrings.none
import typings.reactNative.reactNativeStrings.polite
import typings.reactNative.reactNativeStrings.radiobutton_checked
import typings.reactNative.reactNativeStrings.radiobutton_unchecked
import typings.reactNative.reactNativeStrings.resize
import typings.reactNative.reactNativeStrings.scale
import typings.reactNative.reactNativeStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageBackgroundProps extends ImagePropsBase {
  var imageRef: js.UndefOr[js.Function1[/* image */ Image, Unit]] = js.undefined
  var imageStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object ImageBackgroundProps {
  @scala.inline
  def apply(
    source: ImageSourcePropType,
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
    blurRadius: js.UndefOr[Double] = js.undefined,
    borderBottomLeftRadius: js.UndefOr[Double] = js.undefined,
    borderBottomRightRadius: js.UndefOr[Double] = js.undefined,
    borderRadius: js.UndefOr[Double] = js.undefined,
    borderTopLeftRadius: js.UndefOr[Double] = js.undefined,
    borderTopRightRadius: js.UndefOr[Double] = js.undefined,
    capInsets: Insets = null,
    defaultSource: ImageURISource | Double = null,
    fadeDuration: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    imageRef: /* image */ Image => Unit = null,
    imageStyle: js.UndefOr[Null | StyleProp[ImageStyle]] = js.undefined,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    loadingIndicatorSource: ImageURISource = null,
    onAccessibilityAction: /* event */ AccessibilityActionEvent => Unit = null,
    onAccessibilityEscape: () => Unit = null,
    onAccessibilityTap: () => Unit = null,
    onError: /* error */ NativeSyntheticEvent[ImageErrorEventData] => Unit = null,
    onLayout: /* event */ LayoutChangeEvent => Unit = null,
    onLoad: /* event */ NativeSyntheticEvent[ImageLoadEventData] => Unit = null,
    onLoadEnd: () => Unit = null,
    onLoadStart: () => Unit = null,
    onMagicTap: () => Unit = null,
    onPartialLoad: () => Unit = null,
    onProgress: /* event */ NativeSyntheticEvent[ImageProgressEventDataIOS] => Unit = null,
    progressiveRenderingEnabled: js.UndefOr[Boolean] = js.undefined,
    resizeMethod: auto | resize | scale = null,
    resizeMode: ImageResizeMode = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    testID: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): ImageBackgroundProps = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
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
    if (!js.isUndefined(blurRadius)) __obj.updateDynamic("blurRadius")(blurRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderBottomLeftRadius)) __obj.updateDynamic("borderBottomLeftRadius")(borderBottomLeftRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderBottomRightRadius)) __obj.updateDynamic("borderBottomRightRadius")(borderBottomRightRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRadius)) __obj.updateDynamic("borderRadius")(borderRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderTopLeftRadius)) __obj.updateDynamic("borderTopLeftRadius")(borderTopLeftRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderTopRightRadius)) __obj.updateDynamic("borderTopRightRadius")(borderTopRightRadius.get.asInstanceOf[js.Any])
    if (capInsets != null) __obj.updateDynamic("capInsets")(capInsets.asInstanceOf[js.Any])
    if (defaultSource != null) __obj.updateDynamic("defaultSource")(defaultSource.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeDuration)) __obj.updateDynamic("fadeDuration")(fadeDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (imageRef != null) __obj.updateDynamic("imageRef")(js.Any.fromFunction1(imageRef))
    if (!js.isUndefined(imageStyle)) __obj.updateDynamic("imageStyle")(imageStyle.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (loadingIndicatorSource != null) __obj.updateDynamic("loadingIndicatorSource")(loadingIndicatorSource.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1(onAccessibilityAction))
    if (onAccessibilityEscape != null) __obj.updateDynamic("onAccessibilityEscape")(js.Any.fromFunction0(onAccessibilityEscape))
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadEnd != null) __obj.updateDynamic("onLoadEnd")(js.Any.fromFunction0(onLoadEnd))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction0(onLoadStart))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onPartialLoad != null) __obj.updateDynamic("onPartialLoad")(js.Any.fromFunction0(onPartialLoad))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (!js.isUndefined(progressiveRenderingEnabled)) __obj.updateDynamic("progressiveRenderingEnabled")(progressiveRenderingEnabled.get.asInstanceOf[js.Any])
    if (resizeMethod != null) __obj.updateDynamic("resizeMethod")(resizeMethod.asInstanceOf[js.Any])
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageBackgroundProps]
  }
}

