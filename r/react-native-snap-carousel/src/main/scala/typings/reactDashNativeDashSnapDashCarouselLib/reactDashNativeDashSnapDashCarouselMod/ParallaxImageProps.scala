package typings
package reactDashNativeDashSnapDashCarouselLib.reactDashNativeDashSnapDashCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParallaxImageProps
  extends reactDashNativeLib.reactDashNativeMod.ImageProps
     with AdditionalParallaxProps {
  /**
    * Optional style for image's container
    */
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * On screen dimensions of the image
    */
  var dimensions: js.UndefOr[reactDashNativeDashSnapDashCarouselLib.Anon_Height] = js.undefined
  /**
    * Speed of parallax effect. A higher value appears more 'zoomed in'
    */
  var parallaxFactor: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to display a loading spinner
    */
  var showSpinner: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Color of the loading spinner if displayed
    */
  var spinnerColor: js.UndefOr[java.lang.String] = js.undefined
}

object ParallaxImageProps {
  @scala.inline
  def apply(
    source: reactDashNativeLib.reactDashNativeMod.ImageSourcePropType,
    accessibilityComponentType: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.button | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_checked | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityHint: java.lang.String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityLabel: java.lang.String = null,
    accessibilityLiveRegion: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.polite | reactDashNativeLib.reactDashNativeLibStrings.assertive = null,
    accessibilityRole: reactDashNativeLib.reactDashNativeMod.AccessibilityRole = null,
    accessibilityStates: js.Array[reactDashNativeLib.reactDashNativeMod.AccessibilityState] = null,
    accessibilityTraits: reactDashNativeLib.AccessibilityTrait | js.Array[reactDashNativeLib.AccessibilityTrait] = null,
    accessible: js.UndefOr[scala.Boolean] = js.undefined,
    blurRadius: scala.Int | scala.Double = null,
    borderBottomLeftRadius: scala.Int | scala.Double = null,
    borderBottomRightRadius: scala.Int | scala.Double = null,
    borderRadius: scala.Int | scala.Double = null,
    borderTopLeftRadius: scala.Int | scala.Double = null,
    borderTopRightRadius: scala.Int | scala.Double = null,
    capInsets: reactDashNativeLib.reactDashNativeMod.Insets = null,
    carouselRef: reactLib.reactMod.Component[reactDashNativeLib.reactDashNativeMod.FlatListProps[_], js.Object, _] = null,
    containerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    defaultSource: reactDashNativeLib.reactDashNativeMod.ImageURISource | scala.Double = null,
    dimensions: reactDashNativeDashSnapDashCarouselLib.Anon_Height = null,
    fadeDuration: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    importantForAccessibility: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.yes | reactDashNativeLib.reactDashNativeLibStrings.no | reactDashNativeLib.reactDashNativeLibStrings.`no-hide-descendants` = null,
    itemHeight: scala.Int | scala.Double = null,
    itemWidth: scala.Int | scala.Double = null,
    loadingIndicatorSource: reactDashNativeLib.reactDashNativeMod.ImageURISource = null,
    onAccessibilityTap: () => scala.Unit = null,
    onError: /* error */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.ImageErrorEventData] => scala.Unit = null,
    onLayout: /* event */ reactDashNativeLib.reactDashNativeMod.LayoutChangeEvent => scala.Unit = null,
    onLoad: /* event */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.ImageLoadEventData] => scala.Unit = null,
    onLoadEnd: () => scala.Unit = null,
    onLoadStart: () => scala.Unit = null,
    onMagicTap: () => scala.Unit = null,
    onPartialLoad: () => scala.Unit = null,
    onProgress: /* event */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.ImageProgressEventDataIOS] => scala.Unit = null,
    parallaxFactor: scala.Int | scala.Double = null,
    progressiveRenderingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    resizeMethod: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.resize | reactDashNativeLib.reactDashNativeLibStrings.scale = null,
    resizeMode: reactDashNativeLib.reactDashNativeMod.ImageResizeMode = null,
    scrollPosition: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value = null,
    showSpinner: js.UndefOr[scala.Boolean] = js.undefined,
    sliderHeight: scala.Int | scala.Double = null,
    sliderWidth: scala.Int | scala.Double = null,
    spinnerColor: java.lang.String = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ImageStyle] = null,
    testID: java.lang.String = null,
    vertical: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): ParallaxImageProps = {
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
    if (carouselRef != null) __obj.updateDynamic("carouselRef")(carouselRef)
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (defaultSource != null) __obj.updateDynamic("defaultSource")(defaultSource.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (fadeDuration != null) __obj.updateDynamic("fadeDuration")(fadeDuration.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
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
    if (parallaxFactor != null) __obj.updateDynamic("parallaxFactor")(parallaxFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(progressiveRenderingEnabled)) __obj.updateDynamic("progressiveRenderingEnabled")(progressiveRenderingEnabled)
    if (resizeMethod != null) __obj.updateDynamic("resizeMethod")(resizeMethod.asInstanceOf[js.Any])
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode)
    if (scrollPosition != null) __obj.updateDynamic("scrollPosition")(scrollPosition)
    if (!js.isUndefined(showSpinner)) __obj.updateDynamic("showSpinner")(showSpinner)
    if (sliderHeight != null) __obj.updateDynamic("sliderHeight")(sliderHeight.asInstanceOf[js.Any])
    if (sliderWidth != null) __obj.updateDynamic("sliderWidth")(sliderWidth.asInstanceOf[js.Any])
    if (spinnerColor != null) __obj.updateDynamic("spinnerColor")(spinnerColor)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallaxImageProps]
  }
}

