package typings.reactNativeSwiper.mod

import typings.react.mod.Props
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.NativeScrollEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwiperProperties extends Props[Swiper] {
  
  var activeDot: js.UndefOr[Element] = js.native
  
  var activeDotColor: js.UndefOr[String] = js.native
  
  var activeDotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.native
  
  var autoplay: js.UndefOr[Boolean] = js.native
  
  var autoplayDirection: js.UndefOr[Boolean] = js.native
  
  var autoplayTimeout: js.UndefOr[Double] = js.native
  
  var bounces: js.UndefOr[Boolean] = js.native
  
  var buttonWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var dot: js.UndefOr[Element] = js.native
  
  var dotColor: js.UndefOr[String] = js.native
  
  var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var horizontal: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var loadMinimal: js.UndefOr[Boolean] = js.native
  
  var loadMinimalLoader: js.UndefOr[Element] = js.native
  
  var loadMinimalSize: js.UndefOr[Double] = js.native
  
  var loop: js.UndefOr[Boolean] = js.native
  
  var nextButton: js.UndefOr[Element] = js.native
  
  var onMomentumScrollEnd: js.UndefOr[
    js.Function3[
      /* event */ NativeSyntheticEvent[NativeScrollEvent], 
      /* state */ SwiperState, 
      /* context */ Swiper, 
      Unit
    ]
  ] = js.native
  
  var onResponderRelease: js.UndefOr[
    js.Function3[
      /* event */ NativeSyntheticEvent[NativeScrollEvent], 
      /* state */ SwiperState, 
      /* context */ Swiper, 
      Unit
    ]
  ] = js.native
  
  var onScrollBeginDrag: js.UndefOr[
    js.Function3[
      /* event */ NativeSyntheticEvent[NativeScrollEvent], 
      /* state */ SwiperState, 
      /* context */ Swiper, 
      Unit
    ]
  ] = js.native
  
  var onTouchEnd: js.UndefOr[
    js.Function3[
      /* event */ NativeSyntheticEvent[NativeScrollEvent], 
      /* state */ SwiperState, 
      /* context */ Swiper, 
      Unit
    ]
  ] = js.native
  
  var onTouchStart: js.UndefOr[
    js.Function3[
      /* event */ NativeSyntheticEvent[NativeScrollEvent], 
      /* state */ SwiperState, 
      /* context */ Swiper, 
      Unit
    ]
  ] = js.native
  
  var onTouchStartCapture: js.UndefOr[
    js.Function3[
      /* event */ NativeSyntheticEvent[NativeScrollEvent], 
      /* state */ SwiperState, 
      /* context */ Swiper, 
      Unit
    ]
  ] = js.native
  
  var paginationStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var pagingEnabled: js.UndefOr[Boolean] = js.native
  
  var prevButton: js.UndefOr[Element] = js.native
  
  var removeClippedSubviews: js.UndefOr[Boolean] = js.native
  
  var renderPagination: js.UndefOr[
    js.Function3[/* index */ Double, /* total */ Double, /* thisObject */ Swiper, Element]
  ] = js.native
  
  var scrollEnabled: js.UndefOr[Boolean] = js.native
  
  var scrollsToTop: js.UndefOr[Boolean] = js.native
  
  var showsButtons: js.UndefOr[Boolean] = js.native
  
  var showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.native
  
  var showsPagination: js.UndefOr[Boolean] = js.native
  
  var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object SwiperProperties {
  
  @scala.inline
  def apply(): SwiperProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwiperProperties]
  }
  
  @scala.inline
  implicit class SwiperPropertiesOps[Self <: SwiperProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActiveDot(value: Element): Self = this.set("activeDot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveDot: Self = this.set("activeDot", js.undefined)
    
    @scala.inline
    def setActiveDotColor(value: String): Self = this.set("activeDotColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveDotColor: Self = this.set("activeDotColor", js.undefined)
    
    @scala.inline
    def setActiveDotStyle(value: StyleProp[ViewStyle]): Self = this.set("activeDotStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveDotStyle: Self = this.set("activeDotStyle", js.undefined)
    
    @scala.inline
    def setActiveDotStyleNull: Self = this.set("activeDotStyle", null)
    
    @scala.inline
    def setAutomaticallyAdjustContentInsets(value: Boolean): Self = this.set("automaticallyAdjustContentInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticallyAdjustContentInsets: Self = this.set("automaticallyAdjustContentInsets", js.undefined)
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    
    @scala.inline
    def setAutoplayDirection(value: Boolean): Self = this.set("autoplayDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplayDirection: Self = this.set("autoplayDirection", js.undefined)
    
    @scala.inline
    def setAutoplayTimeout(value: Double): Self = this.set("autoplayTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplayTimeout: Self = this.set("autoplayTimeout", js.undefined)
    
    @scala.inline
    def setBounces(value: Boolean): Self = this.set("bounces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounces: Self = this.set("bounces", js.undefined)
    
    @scala.inline
    def setButtonWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("buttonWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonWrapperStyle: Self = this.set("buttonWrapperStyle", js.undefined)
    
    @scala.inline
    def setButtonWrapperStyleNull: Self = this.set("buttonWrapperStyle", null)
    
    @scala.inline
    def setDot(value: Element): Self = this.set("dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDot: Self = this.set("dot", js.undefined)
    
    @scala.inline
    def setDotColor(value: String): Self = this.set("dotColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotColor: Self = this.set("dotColor", js.undefined)
    
    @scala.inline
    def setDotStyle(value: StyleProp[ViewStyle]): Self = this.set("dotStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotStyle: Self = this.set("dotStyle", js.undefined)
    
    @scala.inline
    def setDotStyleNull: Self = this.set("dotStyle", null)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setLoadMinimal(value: Boolean): Self = this.set("loadMinimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadMinimal: Self = this.set("loadMinimal", js.undefined)
    
    @scala.inline
    def setLoadMinimalLoader(value: Element): Self = this.set("loadMinimalLoader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadMinimalLoader: Self = this.set("loadMinimalLoader", js.undefined)
    
    @scala.inline
    def setLoadMinimalSize(value: Double): Self = this.set("loadMinimalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadMinimalSize: Self = this.set("loadMinimalSize", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setNextButton(value: Element): Self = this.set("nextButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextButton: Self = this.set("nextButton", js.undefined)
    
    @scala.inline
    def setOnMomentumScrollEnd(
      value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit
    ): Self = this.set("onMomentumScrollEnd", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnMomentumScrollEnd: Self = this.set("onMomentumScrollEnd", js.undefined)
    
    @scala.inline
    def setOnResponderRelease(
      value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit
    ): Self = this.set("onResponderRelease", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnResponderRelease: Self = this.set("onResponderRelease", js.undefined)
    
    @scala.inline
    def setOnScrollBeginDrag(
      value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit
    ): Self = this.set("onScrollBeginDrag", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnScrollBeginDrag: Self = this.set("onScrollBeginDrag", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(
      value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit
    ): Self = this.set("onTouchEnd", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchStart(
      value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit
    ): Self = this.set("onTouchStart", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    
    @scala.inline
    def setOnTouchStartCapture(
      value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit
    ): Self = this.set("onTouchStartCapture", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnTouchStartCapture: Self = this.set("onTouchStartCapture", js.undefined)
    
    @scala.inline
    def setPaginationStyle(value: StyleProp[ViewStyle]): Self = this.set("paginationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationStyle: Self = this.set("paginationStyle", js.undefined)
    
    @scala.inline
    def setPaginationStyleNull: Self = this.set("paginationStyle", null)
    
    @scala.inline
    def setPagingEnabled(value: Boolean): Self = this.set("pagingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagingEnabled: Self = this.set("pagingEnabled", js.undefined)
    
    @scala.inline
    def setPrevButton(value: Element): Self = this.set("prevButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevButton: Self = this.set("prevButton", js.undefined)
    
    @scala.inline
    def setRemoveClippedSubviews(value: Boolean): Self = this.set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveClippedSubviews: Self = this.set("removeClippedSubviews", js.undefined)
    
    @scala.inline
    def setRenderPagination(value: (/* index */ Double, /* total */ Double, /* thisObject */ Swiper) => Element): Self = this.set("renderPagination", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRenderPagination: Self = this.set("renderPagination", js.undefined)
    
    @scala.inline
    def setScrollEnabled(value: Boolean): Self = this.set("scrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollEnabled: Self = this.set("scrollEnabled", js.undefined)
    
    @scala.inline
    def setScrollsToTop(value: Boolean): Self = this.set("scrollsToTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollsToTop: Self = this.set("scrollsToTop", js.undefined)
    
    @scala.inline
    def setShowsButtons(value: Boolean): Self = this.set("showsButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsButtons: Self = this.set("showsButtons", js.undefined)
    
    @scala.inline
    def setShowsHorizontalScrollIndicator(value: Boolean): Self = this.set("showsHorizontalScrollIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsHorizontalScrollIndicator: Self = this.set("showsHorizontalScrollIndicator", js.undefined)
    
    @scala.inline
    def setShowsPagination(value: Boolean): Self = this.set("showsPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsPagination: Self = this.set("showsPagination", js.undefined)
    
    @scala.inline
    def setShowsVerticalScrollIndicator(value: Boolean): Self = this.set("showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsVerticalScrollIndicator: Self = this.set("showsVerticalScrollIndicator", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
