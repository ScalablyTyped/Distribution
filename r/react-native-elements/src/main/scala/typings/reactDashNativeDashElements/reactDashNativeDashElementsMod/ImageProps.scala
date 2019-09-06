package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactElement
import typings.reactDashNative.reactDashNativeMod.AccessibilityRole
import typings.reactDashNative.reactDashNativeMod.AccessibilityState
import typings.reactDashNative.reactDashNativeMod.AccessibilityStates
import typings.reactDashNative.reactDashNativeMod.AccessibilityTrait
import typings.reactDashNative.reactDashNativeMod.ImageErrorEventData
import typings.reactDashNative.reactDashNativeMod.ImageLoadEventData
import typings.reactDashNative.reactDashNativeMod.ImageProgressEventDataIOS
import typings.reactDashNative.reactDashNativeMod.ImageResizeMode
import typings.reactDashNative.reactDashNativeMod.ImageSourcePropType
import typings.reactDashNative.reactDashNativeMod.ImageStyle
import typings.reactDashNative.reactDashNativeMod.ImageURISource
import typings.reactDashNative.reactDashNativeMod.Insets
import typings.reactDashNative.reactDashNativeMod.LayoutChangeEvent
import typings.reactDashNative.reactDashNativeMod.NativeSyntheticEvent
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNative.reactDashNativeStrings.`no-hide-descendants`
import typings.reactDashNative.reactDashNativeStrings.assertive
import typings.reactDashNative.reactDashNativeStrings.auto
import typings.reactDashNative.reactDashNativeStrings.button
import typings.reactDashNative.reactDashNativeStrings.no
import typings.reactDashNative.reactDashNativeStrings.none
import typings.reactDashNative.reactDashNativeStrings.polite
import typings.reactDashNative.reactDashNativeStrings.radiobutton_checked
import typings.reactDashNative.reactDashNativeStrings.radiobutton_unchecked
import typings.reactDashNative.reactDashNativeStrings.resize
import typings.reactDashNative.reactDashNativeStrings.scale
import typings.reactDashNative.reactDashNativeStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProps
  extends typings.reactDashNative.reactDashNativeMod.ImageProps {
  /**
    * Specify a different component as the Image component.
    *
    * @default Image
    */
  var ImageComponent: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * Content to render when image is loading
    */
  var PlaceholderContent: js.UndefOr[ReactElement] = js.undefined
  /**
    * Additional styling for the container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Additional styling for the placeholder container
    */
  var placeholderStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object ImageProps {
  @scala.inline
  def apply(
    source: ImageSourcePropType,
    ImageComponent: ComponentType[_] = null,
    PlaceholderContent: ReactElement = null,
    accessibilityComponentType: none | button | radiobutton_checked | radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityHint: String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    accessibilityLiveRegion: none | polite | assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityState: AccessibilityState = null,
    accessibilityStates: js.Array[AccessibilityStates] = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessible: js.UndefOr[Boolean] = js.undefined,
    blurRadius: Int | Double = null,
    borderBottomLeftRadius: Int | Double = null,
    borderBottomRightRadius: Int | Double = null,
    borderRadius: Int | Double = null,
    borderTopLeftRadius: Int | Double = null,
    borderTopRightRadius: Int | Double = null,
    capInsets: Insets = null,
    containerStyle: StyleProp[ViewStyle] = null,
    defaultSource: ImageURISource | Double = null,
    fadeDuration: Int | Double = null,
    height: Int | Double = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    loadingIndicatorSource: ImageURISource = null,
    onAccessibilityTap: () => Unit = null,
    onError: /* error */ NativeSyntheticEvent[ImageErrorEventData] => Unit = null,
    onLayout: /* event */ LayoutChangeEvent => Unit = null,
    onLoad: /* event */ NativeSyntheticEvent[ImageLoadEventData] => Unit = null,
    onLoadEnd: () => Unit = null,
    onLoadStart: () => Unit = null,
    onMagicTap: () => Unit = null,
    onPartialLoad: () => Unit = null,
    onProgress: /* event */ NativeSyntheticEvent[ImageProgressEventDataIOS] => Unit = null,
    placeholderStyle: StyleProp[ViewStyle] = null,
    progressiveRenderingEnabled: js.UndefOr[Boolean] = js.undefined,
    resizeMethod: auto | resize | scale = null,
    resizeMode: ImageResizeMode = null,
    style: StyleProp[ImageStyle] = null,
    testID: String = null,
    width: Int | Double = null
  ): ImageProps = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (ImageComponent != null) __obj.updateDynamic("ImageComponent")(ImageComponent.asInstanceOf[js.Any])
    if (PlaceholderContent != null) __obj.updateDynamic("PlaceholderContent")(PlaceholderContent)
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden)
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint)
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors)
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole)
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState)
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
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (defaultSource != null) __obj.updateDynamic("defaultSource")(defaultSource.asInstanceOf[js.Any])
    if (fadeDuration != null) __obj.updateDynamic("fadeDuration")(fadeDuration.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (loadingIndicatorSource != null) __obj.updateDynamic("loadingIndicatorSource")(loadingIndicatorSource)
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadEnd != null) __obj.updateDynamic("onLoadEnd")(js.Any.fromFunction0(onLoadEnd))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction0(onLoadStart))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onPartialLoad != null) __obj.updateDynamic("onPartialLoad")(js.Any.fromFunction0(onPartialLoad))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (placeholderStyle != null) __obj.updateDynamic("placeholderStyle")(placeholderStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(progressiveRenderingEnabled)) __obj.updateDynamic("progressiveRenderingEnabled")(progressiveRenderingEnabled)
    if (resizeMethod != null) __obj.updateDynamic("resizeMethod")(resizeMethod.asInstanceOf[js.Any])
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
}

