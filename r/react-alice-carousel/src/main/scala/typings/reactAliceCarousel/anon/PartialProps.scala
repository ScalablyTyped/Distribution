package typings.reactAliceCarousel.anon

import typings.reactAliceCarousel.libTypesMod.AnimationType
import typings.reactAliceCarousel.libTypesMod.AutoPlayStrategy
import typings.reactAliceCarousel.libTypesMod.AutoplayDirection
import typings.reactAliceCarousel.libTypesMod.ControlsStrategy
import typings.reactAliceCarousel.libTypesMod.DotsItem
import typings.reactAliceCarousel.libTypesMod.EventObject
import typings.reactAliceCarousel.libTypesMod.Responsive
import typings.reactAliceCarousel.libTypesMod.RootElement
import typings.reactAliceCarousel.libTypesMod.SlideInfo
import typings.reactAliceCarousel.reactAliceCarouselStrings.action
import typings.reactAliceCarousel.reactAliceCarouselStrings.all
import typings.reactAliceCarousel.reactAliceCarouselStrings.alternate
import typings.reactAliceCarousel.reactAliceCarouselStrings.default
import typings.reactAliceCarousel.reactAliceCarouselStrings.fadeout
import typings.reactAliceCarousel.reactAliceCarouselStrings.ltr
import typings.reactAliceCarousel.reactAliceCarouselStrings.none
import typings.reactAliceCarousel.reactAliceCarouselStrings.responsive
import typings.reactAliceCarousel.reactAliceCarouselStrings.rtl
import typings.reactAliceCarousel.reactAliceCarouselStrings.slide
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-alice-carousel.react-alice-carousel/lib/types.Props> */
trait PartialProps extends StObject {
  
  var activeIndex: js.UndefOr[Double] = js.undefined
  
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  var animationEasingFunction: js.UndefOr[String] = js.undefined
  
  var animationType: js.UndefOr[slide | fadeout | AnimationType] = js.undefined
  
  var autoHeight: js.UndefOr[Boolean] = js.undefined
  
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  
  var autoPlayControls: js.UndefOr[Boolean] = js.undefined
  
  var autoPlayDirection: js.UndefOr[rtl | ltr | AutoplayDirection] = js.undefined
  
  var autoPlayInterval: js.UndefOr[Double] = js.undefined
  
  var autoPlayStrategy: js.UndefOr[default | all | action | none | AutoPlayStrategy] = js.undefined
  
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[Any] = js.undefined
  
  var controlsStrategy: js.UndefOr[default | responsive | alternate | String | ControlsStrategy] = js.undefined
  
  var disableButtonsControls: js.UndefOr[Boolean] = js.undefined
  
  var disableDotsControls: js.UndefOr[Boolean] = js.undefined
  
  var disableSlideInfo: js.UndefOr[Boolean] = js.undefined
  
  var infinite: js.UndefOr[Boolean] = js.undefined
  
  var innerWidth: js.UndefOr[Double] = js.undefined
  
  var items: js.UndefOr[js.Array[Any]] = js.undefined
  
  var keyboardNavigation: js.UndefOr[Boolean] = js.undefined
  
  var mouseTracking: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var onInitialized: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.undefined
  
  var onResizeEvent: js.UndefOr[
    js.Function3[/* e */ Event, /* prevProps */ RootElement, /* nextProps */ RootElement, Boolean]
  ] = js.undefined
  
  var onResized: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.undefined
  
  var onSlideChange: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.undefined
  
  var onSlideChanged: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.undefined
  
  var paddingLeft: js.UndefOr[Double] = js.undefined
  
  var paddingRight: js.UndefOr[Double] = js.undefined
  
  var preservePosition: js.UndefOr[Boolean] = js.undefined
  
  var renderDotsItem: js.UndefOr[js.Function1[/* e */ DotsItem, Any]] = js.undefined
  
  var renderKey: js.UndefOr[Double] = js.undefined
  
  var renderNextButton: js.UndefOr[js.Function1[/* param0 */ IsDisabled, Any]] = js.undefined
  
  var renderPlayPauseButton: js.UndefOr[js.Function1[/* param0 */ IsPlaying, Any]] = js.undefined
  
  var renderPrevButton: js.UndefOr[js.Function1[/* param0 */ IsDisabled, Any]] = js.undefined
  
  var renderSlideInfo: js.UndefOr[js.Function1[/* e */ SlideInfo, Any]] = js.undefined
  
  var responsive: js.UndefOr[Responsive] = js.undefined
  
  var ssrSilentMode: js.UndefOr[Boolean] = js.undefined
  
  var swipeDelta: js.UndefOr[Double] = js.undefined
  
  var swipeExtraPadding: js.UndefOr[Double] = js.undefined
  
  var touchMoveDefaultEvents: js.UndefOr[Boolean] = js.undefined
  
  var touchTracking: js.UndefOr[Boolean] = js.undefined
}
object PartialProps {
  
  inline def apply(): PartialProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialProps] (val x: Self) extends AnyVal {
    
    inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setAnimationEasingFunction(value: String): Self = StObject.set(x, "animationEasingFunction", value.asInstanceOf[js.Any])
    
    inline def setAnimationEasingFunctionUndefined: Self = StObject.set(x, "animationEasingFunction", js.undefined)
    
    inline def setAnimationType(value: slide | fadeout | AnimationType): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    inline def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    inline def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
    
    inline def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
    
    inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayControls(value: Boolean): Self = StObject.set(x, "autoPlayControls", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayControlsUndefined: Self = StObject.set(x, "autoPlayControls", js.undefined)
    
    inline def setAutoPlayDirection(value: rtl | ltr | AutoplayDirection): Self = StObject.set(x, "autoPlayDirection", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayDirectionUndefined: Self = StObject.set(x, "autoPlayDirection", js.undefined)
    
    inline def setAutoPlayInterval(value: Double): Self = StObject.set(x, "autoPlayInterval", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayIntervalUndefined: Self = StObject.set(x, "autoPlayInterval", js.undefined)
    
    inline def setAutoPlayStrategy(value: default | all | action | none | AutoPlayStrategy): Self = StObject.set(x, "autoPlayStrategy", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayStrategyUndefined: Self = StObject.set(x, "autoPlayStrategy", js.undefined)
    
    inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
    
    inline def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
    
    inline def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setControlsStrategy(value: default | responsive | alternate | String | ControlsStrategy): Self = StObject.set(x, "controlsStrategy", value.asInstanceOf[js.Any])
    
    inline def setControlsStrategyUndefined: Self = StObject.set(x, "controlsStrategy", js.undefined)
    
    inline def setDisableButtonsControls(value: Boolean): Self = StObject.set(x, "disableButtonsControls", value.asInstanceOf[js.Any])
    
    inline def setDisableButtonsControlsUndefined: Self = StObject.set(x, "disableButtonsControls", js.undefined)
    
    inline def setDisableDotsControls(value: Boolean): Self = StObject.set(x, "disableDotsControls", value.asInstanceOf[js.Any])
    
    inline def setDisableDotsControlsUndefined: Self = StObject.set(x, "disableDotsControls", js.undefined)
    
    inline def setDisableSlideInfo(value: Boolean): Self = StObject.set(x, "disableSlideInfo", value.asInstanceOf[js.Any])
    
    inline def setDisableSlideInfoUndefined: Self = StObject.set(x, "disableSlideInfo", js.undefined)
    
    inline def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    inline def setInfiniteUndefined: Self = StObject.set(x, "infinite", js.undefined)
    
    inline def setInnerWidth(value: Double): Self = StObject.set(x, "innerWidth", value.asInstanceOf[js.Any])
    
    inline def setInnerWidthUndefined: Self = StObject.set(x, "innerWidth", js.undefined)
    
    inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKeyboardNavigation(value: Boolean): Self = StObject.set(x, "keyboardNavigation", value.asInstanceOf[js.Any])
    
    inline def setKeyboardNavigationUndefined: Self = StObject.set(x, "keyboardNavigation", js.undefined)
    
    inline def setMouseTracking(value: Boolean): Self = StObject.set(x, "mouseTracking", value.asInstanceOf[js.Any])
    
    inline def setMouseTrackingUndefined: Self = StObject.set(x, "mouseTracking", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnInitialized(value: /* e */ EventObject => Unit): Self = StObject.set(x, "onInitialized", js.Any.fromFunction1(value))
    
    inline def setOnInitializedUndefined: Self = StObject.set(x, "onInitialized", js.undefined)
    
    inline def setOnResizeEvent(value: (/* e */ Event, /* prevProps */ RootElement, /* nextProps */ RootElement) => Boolean): Self = StObject.set(x, "onResizeEvent", js.Any.fromFunction3(value))
    
    inline def setOnResizeEventUndefined: Self = StObject.set(x, "onResizeEvent", js.undefined)
    
    inline def setOnResized(value: /* e */ EventObject => Unit): Self = StObject.set(x, "onResized", js.Any.fromFunction1(value))
    
    inline def setOnResizedUndefined: Self = StObject.set(x, "onResized", js.undefined)
    
    inline def setOnSlideChange(value: /* e */ EventObject => Unit): Self = StObject.set(x, "onSlideChange", js.Any.fromFunction1(value))
    
    inline def setOnSlideChangeUndefined: Self = StObject.set(x, "onSlideChange", js.undefined)
    
    inline def setOnSlideChanged(value: /* e */ EventObject => Unit): Self = StObject.set(x, "onSlideChanged", js.Any.fromFunction1(value))
    
    inline def setOnSlideChangedUndefined: Self = StObject.set(x, "onSlideChanged", js.undefined)
    
    inline def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
    
    inline def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    inline def setPreservePosition(value: Boolean): Self = StObject.set(x, "preservePosition", value.asInstanceOf[js.Any])
    
    inline def setPreservePositionUndefined: Self = StObject.set(x, "preservePosition", js.undefined)
    
    inline def setRenderDotsItem(value: /* e */ DotsItem => Any): Self = StObject.set(x, "renderDotsItem", js.Any.fromFunction1(value))
    
    inline def setRenderDotsItemUndefined: Self = StObject.set(x, "renderDotsItem", js.undefined)
    
    inline def setRenderKey(value: Double): Self = StObject.set(x, "renderKey", value.asInstanceOf[js.Any])
    
    inline def setRenderKeyUndefined: Self = StObject.set(x, "renderKey", js.undefined)
    
    inline def setRenderNextButton(value: /* param0 */ IsDisabled => Any): Self = StObject.set(x, "renderNextButton", js.Any.fromFunction1(value))
    
    inline def setRenderNextButtonUndefined: Self = StObject.set(x, "renderNextButton", js.undefined)
    
    inline def setRenderPlayPauseButton(value: /* param0 */ IsPlaying => Any): Self = StObject.set(x, "renderPlayPauseButton", js.Any.fromFunction1(value))
    
    inline def setRenderPlayPauseButtonUndefined: Self = StObject.set(x, "renderPlayPauseButton", js.undefined)
    
    inline def setRenderPrevButton(value: /* param0 */ IsDisabled => Any): Self = StObject.set(x, "renderPrevButton", js.Any.fromFunction1(value))
    
    inline def setRenderPrevButtonUndefined: Self = StObject.set(x, "renderPrevButton", js.undefined)
    
    inline def setRenderSlideInfo(value: /* e */ SlideInfo => Any): Self = StObject.set(x, "renderSlideInfo", js.Any.fromFunction1(value))
    
    inline def setRenderSlideInfoUndefined: Self = StObject.set(x, "renderSlideInfo", js.undefined)
    
    inline def setResponsive(value: Responsive): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    inline def setSsrSilentMode(value: Boolean): Self = StObject.set(x, "ssrSilentMode", value.asInstanceOf[js.Any])
    
    inline def setSsrSilentModeUndefined: Self = StObject.set(x, "ssrSilentMode", js.undefined)
    
    inline def setSwipeDelta(value: Double): Self = StObject.set(x, "swipeDelta", value.asInstanceOf[js.Any])
    
    inline def setSwipeDeltaUndefined: Self = StObject.set(x, "swipeDelta", js.undefined)
    
    inline def setSwipeExtraPadding(value: Double): Self = StObject.set(x, "swipeExtraPadding", value.asInstanceOf[js.Any])
    
    inline def setSwipeExtraPaddingUndefined: Self = StObject.set(x, "swipeExtraPadding", js.undefined)
    
    inline def setTouchMoveDefaultEvents(value: Boolean): Self = StObject.set(x, "touchMoveDefaultEvents", value.asInstanceOf[js.Any])
    
    inline def setTouchMoveDefaultEventsUndefined: Self = StObject.set(x, "touchMoveDefaultEvents", js.undefined)
    
    inline def setTouchTracking(value: Boolean): Self = StObject.set(x, "touchTracking", value.asInstanceOf[js.Any])
    
    inline def setTouchTrackingUndefined: Self = StObject.set(x, "touchTracking", js.undefined)
  }
}
