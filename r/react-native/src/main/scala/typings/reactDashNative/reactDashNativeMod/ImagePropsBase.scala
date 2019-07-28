package typings.reactDashNative.reactDashNativeMod

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

trait ImagePropsBase
  extends AccessibilityProps
     with ImagePropsIOS
     with ImagePropsAndroid {
  var borderBottomLeftRadius: js.UndefOr[Double] = js.undefined
  var borderBottomRightRadius: js.UndefOr[Double] = js.undefined
  var borderRadius: js.UndefOr[Double] = js.undefined
  var borderTopLeftRadius: js.UndefOr[Double] = js.undefined
  var borderTopRightRadius: js.UndefOr[Double] = js.undefined
  /**
    * A static image to display while downloading the final image off the network.
    */
  var defaultSource: js.UndefOr[ImageURISource | Double] = js.undefined
  /**
    * similarly to `source`, this property represents the resource used to render
    * the loading indicator for the image, displayed until image is ready to be
    * displayed, typically after when it got downloaded from network.
    */
  var loadingIndicatorSource: js.UndefOr[ImageURISource] = js.undefined
  /**
    * Invoked on load error with {nativeEvent: {error}}
    */
  var onError: js.UndefOr[js.Function1[/* error */ NativeSyntheticEvent[ImageErrorEventData], Unit]] = js.undefined
  /**
    * onLayout function
    *
    * Invoked on mount and layout changes with
    *
    * {nativeEvent: { layout: {x, y, width, height} }}.
    */
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  /**
    * Invoked when load completes successfully
    * { source: { url, height, width } }.
    */
  var onLoad: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[ImageLoadEventData], Unit]] = js.undefined
  /**
    * Invoked when load either succeeds or fails
    */
  var onLoadEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Invoked on load start
    */
  var onLoadStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var progressiveRenderingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines how to resize the image when the frame doesn't match the raw
    * image dimensions.
    *
    * 'cover': Scale the image uniformly (maintain the image's aspect ratio)
    * so that both dimensions (width and height) of the image will be equal
    * to or larger than the corresponding dimension of the view (minus padding).
    *
    * 'contain': Scale the image uniformly (maintain the image's aspect ratio)
    * so that both dimensions (width and height) of the image will be equal to
    * or less than the corresponding dimension of the view (minus padding).
    *
    * 'stretch': Scale width and height independently, This may change the
    * aspect ratio of the src.
    *
    * 'repeat': Repeat the image to cover the frame of the view.
    * The image will keep it's size and aspect ratio. (iOS only)
    *
    * 'center': Scale the image down so that it is completely visible,
    * if bigger than the area of the view.
    * The image will not be scaled up.
    */
  var resizeMode: js.UndefOr[ImageResizeMode] = js.undefined
  /**
    * The image source (either a remote URL or a local file resource).
    *
    * This prop can also contain several remote URLs, specified together with their width and height and potentially with scale/other URI arguments.
    * The native side will then choose the best uri to display based on the measured size of the image container.
    * A cache property can be added to control how networked request interacts with the local cache.
    *
    * The currently supported formats are png, jpg, jpeg, bmp, gif, webp (Android only), psd (iOS only).
    */
  var source: ImageSourcePropType
  /**
    * A unique identifier for this element to be used in UI Automation testing scripts.
    */
  var testID: js.UndefOr[String] = js.undefined
}

object ImagePropsBase {
  @scala.inline
  def apply(
    source: ImageSourcePropType,
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
    progressiveRenderingEnabled: js.UndefOr[Boolean] = js.undefined,
    resizeMethod: auto | resize | scale = null,
    resizeMode: ImageResizeMode = null,
    testID: String = null,
    width: Int | Double = null
  ): ImagePropsBase = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
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
    if (!js.isUndefined(progressiveRenderingEnabled)) __obj.updateDynamic("progressiveRenderingEnabled")(progressiveRenderingEnabled)
    if (resizeMethod != null) __obj.updateDynamic("resizeMethod")(resizeMethod.asInstanceOf[js.Any])
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode)
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePropsBase]
  }
}

