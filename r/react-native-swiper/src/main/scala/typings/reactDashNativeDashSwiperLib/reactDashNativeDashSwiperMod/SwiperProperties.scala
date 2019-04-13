package typings
package reactDashNativeDashSwiperLib.reactDashNativeDashSwiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwiperProperties
  extends reactLib.reactMod.Props[Swiper] {
  var activeDot: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var activeDotColor: js.UndefOr[java.lang.String] = js.undefined
  var activeDotStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var automaticallyAdjustContentInsets: js.UndefOr[scala.Boolean] = js.undefined
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  var autoplayDirection: js.UndefOr[scala.Boolean] = js.undefined
  var autoplayTimeout: js.UndefOr[scala.Double] = js.undefined
  var bounces: js.UndefOr[scala.Boolean] = js.undefined
  var buttonWrapperStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var dot: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var dotColor: js.UndefOr[java.lang.String] = js.undefined
  var dotStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var loadMinimal: js.UndefOr[scala.Boolean] = js.undefined
  var loadMinimalLoader: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var loadMinimalSize: js.UndefOr[scala.Double] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var nextButton: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var onMomentumScrollEnd: js.UndefOr[
    js.Function3[
      /* event */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.NativeScrollEvent], 
      /* state */ SwiperState, 
      /* context */ Swiper, 
      scala.Unit
    ]
  ] = js.undefined
  var onResponderRelease: js.UndefOr[
    js.Function3[
      /* event */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.NativeScrollEvent], 
      /* state */ SwiperState, 
      /* context */ Swiper, 
      scala.Unit
    ]
  ] = js.undefined
  var onScrollBeginDrag: js.UndefOr[
    js.Function3[
      /* event */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.NativeScrollEvent], 
      /* state */ SwiperState, 
      /* context */ Swiper, 
      scala.Unit
    ]
  ] = js.undefined
  var onTouchEnd: js.UndefOr[
    js.Function3[
      /* event */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.NativeScrollEvent], 
      /* state */ SwiperState, 
      /* context */ Swiper, 
      scala.Unit
    ]
  ] = js.undefined
  var onTouchStart: js.UndefOr[
    js.Function3[
      /* event */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.NativeScrollEvent], 
      /* state */ SwiperState, 
      /* context */ Swiper, 
      scala.Unit
    ]
  ] = js.undefined
  var onTouchStartCapture: js.UndefOr[
    js.Function3[
      /* event */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.NativeScrollEvent], 
      /* state */ SwiperState, 
      /* context */ Swiper, 
      scala.Unit
    ]
  ] = js.undefined
  var paginationStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var pagingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var prevButton: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var removeClippedSubviews: js.UndefOr[scala.Boolean] = js.undefined
  var renderPagination: js.UndefOr[
    js.Function3[
      /* index */ scala.Double, 
      /* total */ scala.Double, 
      /* thisObject */ Swiper, 
      reactLib.reactMod.Global.JSXNs.Element
    ]
  ] = js.undefined
  var scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var scrollsToTop: js.UndefOr[scala.Boolean] = js.undefined
  var showsButtons: js.UndefOr[scala.Boolean] = js.undefined
  var showsHorizontalScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined
  var showsPagination: js.UndefOr[scala.Boolean] = js.undefined
  var showsVerticalScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object SwiperProperties {
  @scala.inline
  def apply(
    activeDot: reactLib.reactMod.Global.JSXNs.Element = null,
    activeDotColor: java.lang.String = null,
    activeDotStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    automaticallyAdjustContentInsets: js.UndefOr[scala.Boolean] = js.undefined,
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    autoplayDirection: js.UndefOr[scala.Boolean] = js.undefined,
    autoplayTimeout: scala.Int | scala.Double = null,
    bounces: js.UndefOr[scala.Boolean] = js.undefined,
    buttonWrapperStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    children: reactLib.reactMod.ReactNode = null,
    dot: reactLib.reactMod.Global.JSXNs.Element = null,
    dotColor: java.lang.String = null,
    dotStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    height: scala.Int | scala.Double = null,
    horizontal: js.UndefOr[scala.Boolean] = js.undefined,
    index: scala.Int | scala.Double = null,
    key: reactLib.reactMod.Key = null,
    loadMinimal: js.UndefOr[scala.Boolean] = js.undefined,
    loadMinimalLoader: reactLib.reactMod.Global.JSXNs.Element = null,
    loadMinimalSize: scala.Int | scala.Double = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    nextButton: reactLib.reactMod.Global.JSXNs.Element = null,
    onMomentumScrollEnd: (/* event */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => scala.Unit = null,
    onResponderRelease: (/* event */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => scala.Unit = null,
    onScrollBeginDrag: (/* event */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => scala.Unit = null,
    onTouchEnd: (/* event */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => scala.Unit = null,
    onTouchStart: (/* event */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => scala.Unit = null,
    onTouchStartCapture: (/* event */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => scala.Unit = null,
    paginationStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    pagingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    prevButton: reactLib.reactMod.Global.JSXNs.Element = null,
    ref: reactLib.reactMod.LegacyRef[Swiper] = null,
    removeClippedSubviews: js.UndefOr[scala.Boolean] = js.undefined,
    renderPagination: (/* index */ scala.Double, /* total */ scala.Double, /* thisObject */ Swiper) => reactLib.reactMod.Global.JSXNs.Element = null,
    scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    scrollsToTop: js.UndefOr[scala.Boolean] = js.undefined,
    showsButtons: js.UndefOr[scala.Boolean] = js.undefined,
    showsHorizontalScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined,
    showsPagination: js.UndefOr[scala.Boolean] = js.undefined,
    showsVerticalScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    width: scala.Int | scala.Double = null
  ): SwiperProperties = {
    val __obj = js.Dynamic.literal()
    if (activeDot != null) __obj.updateDynamic("activeDot")(activeDot)
    if (activeDotColor != null) __obj.updateDynamic("activeDotColor")(activeDotColor)
    if (activeDotStyle != null) __obj.updateDynamic("activeDotStyle")(activeDotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(automaticallyAdjustContentInsets)) __obj.updateDynamic("automaticallyAdjustContentInsets")(automaticallyAdjustContentInsets)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (!js.isUndefined(autoplayDirection)) __obj.updateDynamic("autoplayDirection")(autoplayDirection)
    if (autoplayTimeout != null) __obj.updateDynamic("autoplayTimeout")(autoplayTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(bounces)) __obj.updateDynamic("bounces")(bounces)
    if (buttonWrapperStyle != null) __obj.updateDynamic("buttonWrapperStyle")(buttonWrapperStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (dot != null) __obj.updateDynamic("dot")(dot)
    if (dotColor != null) __obj.updateDynamic("dotColor")(dotColor)
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(loadMinimal)) __obj.updateDynamic("loadMinimal")(loadMinimal)
    if (loadMinimalLoader != null) __obj.updateDynamic("loadMinimalLoader")(loadMinimalLoader)
    if (loadMinimalSize != null) __obj.updateDynamic("loadMinimalSize")(loadMinimalSize.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (nextButton != null) __obj.updateDynamic("nextButton")(nextButton)
    if (onMomentumScrollEnd != null) __obj.updateDynamic("onMomentumScrollEnd")(js.Any.fromFunction3(onMomentumScrollEnd))
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(js.Any.fromFunction3(onResponderRelease))
    if (onScrollBeginDrag != null) __obj.updateDynamic("onScrollBeginDrag")(js.Any.fromFunction3(onScrollBeginDrag))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction3(onTouchEnd))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction3(onTouchStart))
    if (onTouchStartCapture != null) __obj.updateDynamic("onTouchStartCapture")(js.Any.fromFunction3(onTouchStartCapture))
    if (paginationStyle != null) __obj.updateDynamic("paginationStyle")(paginationStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(pagingEnabled)) __obj.updateDynamic("pagingEnabled")(pagingEnabled)
    if (prevButton != null) __obj.updateDynamic("prevButton")(prevButton)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews)
    if (renderPagination != null) __obj.updateDynamic("renderPagination")(js.Any.fromFunction3(renderPagination))
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled)
    if (!js.isUndefined(scrollsToTop)) __obj.updateDynamic("scrollsToTop")(scrollsToTop)
    if (!js.isUndefined(showsButtons)) __obj.updateDynamic("showsButtons")(showsButtons)
    if (!js.isUndefined(showsHorizontalScrollIndicator)) __obj.updateDynamic("showsHorizontalScrollIndicator")(showsHorizontalScrollIndicator)
    if (!js.isUndefined(showsPagination)) __obj.updateDynamic("showsPagination")(showsPagination)
    if (!js.isUndefined(showsVerticalScrollIndicator)) __obj.updateDynamic("showsVerticalScrollIndicator")(showsVerticalScrollIndicator)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwiperProperties]
  }
}

