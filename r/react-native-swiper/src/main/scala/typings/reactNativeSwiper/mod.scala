package typings.reactNativeSwiper

import typings.react.mod.Component
import typings.react.mod.Props
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.NativeScrollEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSwiper.anon.X
import typings.reactNativeSwiper.reactNativeSwiperStrings.x
import typings.reactNativeSwiper.reactNativeSwiperStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-swiper", JSImport.Default)
  @js.native
  class default () extends Swiper
  
  @js.native
  trait Swiper
    extends Component[SwiperProperties, SwiperState, js.Any] {
    
    def scrollBy(index: Double, animated: Boolean): Unit = js.native
  }
  
  trait SwiperProperties
    extends StObject
       with Props[Swiper] {
    
    var activeDot: js.UndefOr[Element] = js.undefined
    
    var activeDotColor: js.UndefOr[String] = js.undefined
    
    var activeDotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var autoplayDirection: js.UndefOr[Boolean] = js.undefined
    
    var autoplayTimeout: js.UndefOr[Double] = js.undefined
    
    var bounces: js.UndefOr[Boolean] = js.undefined
    
    var buttonWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var dot: js.UndefOr[Element] = js.undefined
    
    var dotColor: js.UndefOr[String] = js.undefined
    
    var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var loadMinimal: js.UndefOr[Boolean] = js.undefined
    
    var loadMinimalLoader: js.UndefOr[Element] = js.undefined
    
    var loadMinimalSize: js.UndefOr[Double] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var nextButton: js.UndefOr[Element] = js.undefined
    
    var onMomentumScrollEnd: js.UndefOr[
        js.Function3[
          /* event */ NativeSyntheticEvent[NativeScrollEvent], 
          /* state */ SwiperState, 
          /* context */ Swiper, 
          Unit
        ]
      ] = js.undefined
    
    var onResponderRelease: js.UndefOr[
        js.Function3[
          /* event */ NativeSyntheticEvent[NativeScrollEvent], 
          /* state */ SwiperState, 
          /* context */ Swiper, 
          Unit
        ]
      ] = js.undefined
    
    var onScrollBeginDrag: js.UndefOr[
        js.Function3[
          /* event */ NativeSyntheticEvent[NativeScrollEvent], 
          /* state */ SwiperState, 
          /* context */ Swiper, 
          Unit
        ]
      ] = js.undefined
    
    var onTouchEnd: js.UndefOr[
        js.Function3[
          /* event */ NativeSyntheticEvent[NativeScrollEvent], 
          /* state */ SwiperState, 
          /* context */ Swiper, 
          Unit
        ]
      ] = js.undefined
    
    var onTouchStart: js.UndefOr[
        js.Function3[
          /* event */ NativeSyntheticEvent[NativeScrollEvent], 
          /* state */ SwiperState, 
          /* context */ Swiper, 
          Unit
        ]
      ] = js.undefined
    
    var onTouchStartCapture: js.UndefOr[
        js.Function3[
          /* event */ NativeSyntheticEvent[NativeScrollEvent], 
          /* state */ SwiperState, 
          /* context */ Swiper, 
          Unit
        ]
      ] = js.undefined
    
    var paginationStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var pagingEnabled: js.UndefOr[Boolean] = js.undefined
    
    var prevButton: js.UndefOr[Element] = js.undefined
    
    var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
    
    var renderPagination: js.UndefOr[
        js.Function3[/* index */ Double, /* total */ Double, /* thisObject */ Swiper, Element]
      ] = js.undefined
    
    var scrollEnabled: js.UndefOr[Boolean] = js.undefined
    
    var scrollsToTop: js.UndefOr[Boolean] = js.undefined
    
    var showsButtons: js.UndefOr[Boolean] = js.undefined
    
    var showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined
    
    var showsPagination: js.UndefOr[Boolean] = js.undefined
    
    var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object SwiperProperties {
    
    @scala.inline
    def apply(): SwiperProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwiperProperties]
    }
    
    @scala.inline
    implicit class SwiperPropertiesMutableBuilder[Self <: SwiperProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveDot(value: Element): Self = StObject.set(x, "activeDot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveDotColor(value: String): Self = StObject.set(x, "activeDotColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveDotColorUndefined: Self = StObject.set(x, "activeDotColor", js.undefined)
      
      @scala.inline
      def setActiveDotStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "activeDotStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveDotStyleNull: Self = StObject.set(x, "activeDotStyle", null)
      
      @scala.inline
      def setActiveDotStyleUndefined: Self = StObject.set(x, "activeDotStyle", js.undefined)
      
      @scala.inline
      def setActiveDotUndefined: Self = StObject.set(x, "activeDot", js.undefined)
      
      @scala.inline
      def setAutomaticallyAdjustContentInsets(value: Boolean): Self = StObject.set(x, "automaticallyAdjustContentInsets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomaticallyAdjustContentInsetsUndefined: Self = StObject.set(x, "automaticallyAdjustContentInsets", js.undefined)
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayDirection(value: Boolean): Self = StObject.set(x, "autoplayDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayDirectionUndefined: Self = StObject.set(x, "autoplayDirection", js.undefined)
      
      @scala.inline
      def setAutoplayTimeout(value: Double): Self = StObject.set(x, "autoplayTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayTimeoutUndefined: Self = StObject.set(x, "autoplayTimeout", js.undefined)
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setBounces(value: Boolean): Self = StObject.set(x, "bounces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBouncesUndefined: Self = StObject.set(x, "bounces", js.undefined)
      
      @scala.inline
      def setButtonWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonWrapperStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonWrapperStyleNull: Self = StObject.set(x, "buttonWrapperStyle", null)
      
      @scala.inline
      def setButtonWrapperStyleUndefined: Self = StObject.set(x, "buttonWrapperStyle", js.undefined)
      
      @scala.inline
      def setDot(value: Element): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotColor(value: String): Self = StObject.set(x, "dotColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotColorUndefined: Self = StObject.set(x, "dotColor", js.undefined)
      
      @scala.inline
      def setDotStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dotStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotStyleNull: Self = StObject.set(x, "dotStyle", null)
      
      @scala.inline
      def setDotStyleUndefined: Self = StObject.set(x, "dotStyle", js.undefined)
      
      @scala.inline
      def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setLoadMinimal(value: Boolean): Self = StObject.set(x, "loadMinimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadMinimalLoader(value: Element): Self = StObject.set(x, "loadMinimalLoader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadMinimalLoaderUndefined: Self = StObject.set(x, "loadMinimalLoader", js.undefined)
      
      @scala.inline
      def setLoadMinimalSize(value: Double): Self = StObject.set(x, "loadMinimalSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadMinimalSizeUndefined: Self = StObject.set(x, "loadMinimalSize", js.undefined)
      
      @scala.inline
      def setLoadMinimalUndefined: Self = StObject.set(x, "loadMinimal", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setNextButton(value: Element): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextButtonUndefined: Self = StObject.set(x, "nextButton", js.undefined)
      
      @scala.inline
      def setOnMomentumScrollEnd(
        value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit
      ): Self = StObject.set(x, "onMomentumScrollEnd", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnMomentumScrollEndUndefined: Self = StObject.set(x, "onMomentumScrollEnd", js.undefined)
      
      @scala.inline
      def setOnResponderRelease(
        value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit
      ): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
      
      @scala.inline
      def setOnScrollBeginDrag(
        value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit
      ): Self = StObject.set(x, "onScrollBeginDrag", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnScrollBeginDragUndefined: Self = StObject.set(x, "onScrollBeginDrag", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(
        value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit
      ): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchStart(
        value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit
      ): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnTouchStartCapture(
        value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit
      ): Self = StObject.set(x, "onTouchStartCapture", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnTouchStartCaptureUndefined: Self = StObject.set(x, "onTouchStartCapture", js.undefined)
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setPaginationStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "paginationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationStyleNull: Self = StObject.set(x, "paginationStyle", null)
      
      @scala.inline
      def setPaginationStyleUndefined: Self = StObject.set(x, "paginationStyle", js.undefined)
      
      @scala.inline
      def setPagingEnabled(value: Boolean): Self = StObject.set(x, "pagingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagingEnabledUndefined: Self = StObject.set(x, "pagingEnabled", js.undefined)
      
      @scala.inline
      def setPrevButton(value: Element): Self = StObject.set(x, "prevButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevButtonUndefined: Self = StObject.set(x, "prevButton", js.undefined)
      
      @scala.inline
      def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
      
      @scala.inline
      def setRenderPagination(value: (/* index */ Double, /* total */ Double, /* thisObject */ Swiper) => Element): Self = StObject.set(x, "renderPagination", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderPaginationUndefined: Self = StObject.set(x, "renderPagination", js.undefined)
      
      @scala.inline
      def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
      
      @scala.inline
      def setScrollsToTop(value: Boolean): Self = StObject.set(x, "scrollsToTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollsToTopUndefined: Self = StObject.set(x, "scrollsToTop", js.undefined)
      
      @scala.inline
      def setShowsButtons(value: Boolean): Self = StObject.set(x, "showsButtons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowsButtonsUndefined: Self = StObject.set(x, "showsButtons", js.undefined)
      
      @scala.inline
      def setShowsHorizontalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsHorizontalScrollIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowsHorizontalScrollIndicatorUndefined: Self = StObject.set(x, "showsHorizontalScrollIndicator", js.undefined)
      
      @scala.inline
      def setShowsPagination(value: Boolean): Self = StObject.set(x, "showsPagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowsPaginationUndefined: Self = StObject.set(x, "showsPagination", js.undefined)
      
      @scala.inline
      def setShowsVerticalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowsVerticalScrollIndicatorUndefined: Self = StObject.set(x, "showsVerticalScrollIndicator", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SwiperState extends StObject {
    
    var autoplayEnd: Boolean
    
    var dir: x | y
    
    var height: Double
    
    var index: Double
    
    var isScrolling: Boolean
    
    var loopJump: Boolean
    
    var offset: X
    
    var total: Double
    
    var width: Double
  }
  object SwiperState {
    
    @scala.inline
    def apply(
      autoplayEnd: Boolean,
      dir: x | y,
      height: Double,
      index: Double,
      isScrolling: Boolean,
      loopJump: Boolean,
      offset: X,
      total: Double,
      width: Double
    ): SwiperState = {
      val __obj = js.Dynamic.literal(autoplayEnd = autoplayEnd.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], loopJump = loopJump.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwiperState]
    }
    
    @scala.inline
    implicit class SwiperStateMutableBuilder[Self <: SwiperState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoplayEnd(value: Boolean): Self = StObject.set(x, "autoplayEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDir(value: typings.reactNativeSwiper.reactNativeSwiperStrings.x | y): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopJump(value: Boolean): Self = StObject.set(x, "loopJump", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: X): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
