package typings.reactNativeElements

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityStates
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.ImageErrorEventData
import typings.reactNative.mod.ImageLoadEventData
import typings.reactNative.mod.ImageProgressEventDataIOS
import typings.reactNative.mod.ImageResizeMode
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.RecursivePartial
import typings.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typings.reactNativeElements.reactNativeElementsStrings.assertive
import typings.reactNativeElements.reactNativeElementsStrings.auto
import typings.reactNativeElements.reactNativeElementsStrings.button
import typings.reactNativeElements.reactNativeElementsStrings.no
import typings.reactNativeElements.reactNativeElementsStrings.none
import typings.reactNativeElements.reactNativeElementsStrings.polite
import typings.reactNativeElements.reactNativeElementsStrings.radiobutton_checked
import typings.reactNativeElements.reactNativeElementsStrings.radiobutton_unchecked
import typings.reactNativeElements.reactNativeElementsStrings.resize
import typings.reactNativeElements.reactNativeElementsStrings.scale
import typings.reactNativeElements.reactNativeElementsStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.ImageProps>> */
trait RecursivePartialPartialIm extends js.Object {
  var ImageComponent: js.UndefOr[RecursivePartial[js.UndefOr[ComponentType[_]]]] = js.undefined
  var PlaceholderContent: js.UndefOr[RecursivePartial[js.UndefOr[ReactElement]]] = js.undefined
  var accessibilityActions: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]]] = js.undefined
  var accessibilityComponentType: js.UndefOr[
    RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]
  ] = js.undefined
  var accessibilityElementsHidden: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var accessibilityHint: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var accessibilityIgnoresInvertColors: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var accessibilityLabel: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var accessibilityLiveRegion: js.UndefOr[RecursivePartial[js.UndefOr[none | polite | assertive]]] = js.undefined
  var accessibilityRole: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityRole]]] = js.undefined
  var accessibilityState: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityState]]] = js.undefined
  var accessibilityStates: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[AccessibilityStates]]]] = js.undefined
  var accessibilityTraits: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]] = js.undefined
  var accessibilityValue: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityValue]]] = js.undefined
  var accessibilityViewIsModal: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var accessible: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var blurRadius: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var borderBottomLeftRadius: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var borderBottomRightRadius: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var borderRadius: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var borderTopLeftRadius: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var borderTopRightRadius: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var capInsets: js.UndefOr[RecursivePartial[js.UndefOr[Insets]]] = js.undefined
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var defaultSource: js.UndefOr[RecursivePartial[js.UndefOr[ImageURISource | Double]]] = js.undefined
  var fadeDuration: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var height: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var importantForAccessibility: js.UndefOr[RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.undefined
  var loadingIndicatorSource: js.UndefOr[RecursivePartial[js.UndefOr[ImageURISource]]] = js.undefined
  var onAccessibilityAction: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]
  ] = js.undefined
  var onAccessibilityEscape: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onAccessibilityTap: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onError: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[/* error */ NativeSyntheticEvent[ImageErrorEventData], Unit]]
    ]
  ] = js.undefined
  var onLayout: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]] = js.undefined
  var onLoad: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[ImageLoadEventData], Unit]]
    ]
  ] = js.undefined
  var onLoadEnd: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onLoadStart: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onMagicTap: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onPartialLoad: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onProgress: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[ImageProgressEventDataIOS], Unit]]
    ]
  ] = js.undefined
  var placeholderStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var progressiveRenderingEnabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var resizeMethod: js.UndefOr[RecursivePartial[js.UndefOr[auto | resize | scale]]] = js.undefined
  var resizeMode: js.UndefOr[RecursivePartial[js.UndefOr[ImageResizeMode]]] = js.undefined
  var source: js.UndefOr[RecursivePartial[js.UndefOr[ImageSourcePropType]]] = js.undefined
  var style: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ImageStyle]]]] = js.undefined
  var testID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var width: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
}

object RecursivePartialPartialIm {
  @scala.inline
  def apply(
    ImageComponent: RecursivePartial[js.UndefOr[ComponentType[_]]] = null,
    PlaceholderContent: RecursivePartial[js.UndefOr[ReactElement]] = null,
    accessibilityActions: RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]] = null,
    accessibilityComponentType: RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]] = null,
    accessibilityElementsHidden: RecursivePartial[js.UndefOr[Boolean]] = null,
    accessibilityHint: RecursivePartial[js.UndefOr[String]] = null,
    accessibilityIgnoresInvertColors: RecursivePartial[js.UndefOr[Boolean]] = null,
    accessibilityLabel: RecursivePartial[js.UndefOr[String]] = null,
    accessibilityLiveRegion: RecursivePartial[js.UndefOr[none | polite | assertive]] = null,
    accessibilityRole: RecursivePartial[js.UndefOr[AccessibilityRole]] = null,
    accessibilityState: RecursivePartial[js.UndefOr[AccessibilityState]] = null,
    accessibilityStates: RecursivePartial[js.UndefOr[js.Array[AccessibilityStates]]] = null,
    accessibilityTraits: RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]] = null,
    accessibilityValue: RecursivePartial[js.UndefOr[AccessibilityValue]] = null,
    accessibilityViewIsModal: RecursivePartial[js.UndefOr[Boolean]] = null,
    accessible: RecursivePartial[js.UndefOr[Boolean]] = null,
    blurRadius: RecursivePartial[js.UndefOr[Double]] = null,
    borderBottomLeftRadius: RecursivePartial[js.UndefOr[Double]] = null,
    borderBottomRightRadius: RecursivePartial[js.UndefOr[Double]] = null,
    borderRadius: RecursivePartial[js.UndefOr[Double]] = null,
    borderTopLeftRadius: RecursivePartial[js.UndefOr[Double]] = null,
    borderTopRightRadius: RecursivePartial[js.UndefOr[Double]] = null,
    capInsets: RecursivePartial[js.UndefOr[Insets]] = null,
    containerStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    defaultSource: RecursivePartial[js.UndefOr[ImageURISource | Double]] = null,
    fadeDuration: RecursivePartial[js.UndefOr[Double]] = null,
    height: RecursivePartial[js.UndefOr[Double]] = null,
    importantForAccessibility: RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]] = null,
    loadingIndicatorSource: RecursivePartial[js.UndefOr[ImageURISource]] = null,
    onAccessibilityAction: RecursivePartial[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]] = null,
    onAccessibilityEscape: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    onAccessibilityTap: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    onError: RecursivePartial[
      js.UndefOr[js.Function1[/* error */ NativeSyntheticEvent[ImageErrorEventData], Unit]]
    ] = null,
    onLayout: RecursivePartial[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]] = null,
    onLoad: RecursivePartial[
      js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[ImageLoadEventData], Unit]]
    ] = null,
    onLoadEnd: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    onLoadStart: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    onMagicTap: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    onPartialLoad: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    onProgress: RecursivePartial[
      js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[ImageProgressEventDataIOS], Unit]]
    ] = null,
    placeholderStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    progressiveRenderingEnabled: RecursivePartial[js.UndefOr[Boolean]] = null,
    resizeMethod: RecursivePartial[js.UndefOr[auto | resize | scale]] = null,
    resizeMode: RecursivePartial[js.UndefOr[ImageResizeMode]] = null,
    source: RecursivePartial[js.UndefOr[ImageSourcePropType]] = null,
    style: RecursivePartial[js.UndefOr[StyleProp[ImageStyle]]] = null,
    testID: RecursivePartial[js.UndefOr[String]] = null,
    width: RecursivePartial[js.UndefOr[Double]] = null
  ): RecursivePartialPartialIm = {
    val __obj = js.Dynamic.literal()
    if (ImageComponent != null) __obj.updateDynamic("ImageComponent")(ImageComponent.asInstanceOf[js.Any])
    if (PlaceholderContent != null) __obj.updateDynamic("PlaceholderContent")(PlaceholderContent.asInstanceOf[js.Any])
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (accessibilityElementsHidden != null) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (accessibilityIgnoresInvertColors != null) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState.asInstanceOf[js.Any])
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (accessibilityValue != null) __obj.updateDynamic("accessibilityValue")(accessibilityValue.asInstanceOf[js.Any])
    if (accessibilityViewIsModal != null) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.asInstanceOf[js.Any])
    if (accessible != null) __obj.updateDynamic("accessible")(accessible.asInstanceOf[js.Any])
    if (blurRadius != null) __obj.updateDynamic("blurRadius")(blurRadius.asInstanceOf[js.Any])
    if (borderBottomLeftRadius != null) __obj.updateDynamic("borderBottomLeftRadius")(borderBottomLeftRadius.asInstanceOf[js.Any])
    if (borderBottomRightRadius != null) __obj.updateDynamic("borderBottomRightRadius")(borderBottomRightRadius.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderTopLeftRadius != null) __obj.updateDynamic("borderTopLeftRadius")(borderTopLeftRadius.asInstanceOf[js.Any])
    if (borderTopRightRadius != null) __obj.updateDynamic("borderTopRightRadius")(borderTopRightRadius.asInstanceOf[js.Any])
    if (capInsets != null) __obj.updateDynamic("capInsets")(capInsets.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (defaultSource != null) __obj.updateDynamic("defaultSource")(defaultSource.asInstanceOf[js.Any])
    if (fadeDuration != null) __obj.updateDynamic("fadeDuration")(fadeDuration.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (loadingIndicatorSource != null) __obj.updateDynamic("loadingIndicatorSource")(loadingIndicatorSource.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(onAccessibilityAction.asInstanceOf[js.Any])
    if (onAccessibilityEscape != null) __obj.updateDynamic("onAccessibilityEscape")(onAccessibilityEscape.asInstanceOf[js.Any])
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(onAccessibilityTap.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(onError.asInstanceOf[js.Any])
    if (onLayout != null) __obj.updateDynamic("onLayout")(onLayout.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad.asInstanceOf[js.Any])
    if (onLoadEnd != null) __obj.updateDynamic("onLoadEnd")(onLoadEnd.asInstanceOf[js.Any])
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(onLoadStart.asInstanceOf[js.Any])
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(onMagicTap.asInstanceOf[js.Any])
    if (onPartialLoad != null) __obj.updateDynamic("onPartialLoad")(onPartialLoad.asInstanceOf[js.Any])
    if (onProgress != null) __obj.updateDynamic("onProgress")(onProgress.asInstanceOf[js.Any])
    if (placeholderStyle != null) __obj.updateDynamic("placeholderStyle")(placeholderStyle.asInstanceOf[js.Any])
    if (progressiveRenderingEnabled != null) __obj.updateDynamic("progressiveRenderingEnabled")(progressiveRenderingEnabled.asInstanceOf[js.Any])
    if (resizeMethod != null) __obj.updateDynamic("resizeMethod")(resizeMethod.asInstanceOf[js.Any])
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecursivePartialPartialIm]
  }
}

