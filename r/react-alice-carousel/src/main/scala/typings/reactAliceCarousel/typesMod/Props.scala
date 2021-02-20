package typings.reactAliceCarousel.typesMod

import typings.reactAliceCarousel.reactAliceCarouselStrings.action
import typings.reactAliceCarousel.reactAliceCarouselStrings.all
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends StObject {
  
  var activeIndex: js.UndefOr[Double] = js.native
  
  var animationDuration: js.UndefOr[Double] = js.native
  
  var animationEasingFunction: js.UndefOr[String] = js.native
  
  var animationType: js.UndefOr[slide | fadeout | AnimationType] = js.native
  
  var autoHeight: js.UndefOr[Boolean] = js.native
  
  var autoPlay: js.UndefOr[Boolean] = js.native
  
  var autoPlayControls: js.UndefOr[Boolean] = js.native
  
  var autoPlayDirection: js.UndefOr[rtl | ltr | AutoplayDirection] = js.native
  
  var autoPlayInterval: js.UndefOr[Double] = js.native
  
  var autoPlayStrategy: js.UndefOr[default | all | action | none | AutoPlayStrategy] = js.native
  
  var autoWidth: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[js.Any] = js.native
  
  var controlsStrategy: js.UndefOr[default | responsive | ControlsStrategy] = js.native
  
  var disableButtonsControls: js.UndefOr[Boolean] = js.native
  
  var disableDotsControls: js.UndefOr[Boolean] = js.native
  
  var disableSlideInfo: js.UndefOr[Boolean] = js.native
  
  var infinite: js.UndefOr[Boolean] = js.native
  
  var items: js.UndefOr[js.Array[_]] = js.native
  
  var mouseTracking: js.UndefOr[Boolean] = js.native
  
  var onInitialized: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.native
  
  var onResizeEvent: js.UndefOr[
    js.Function3[/* e */ Event, /* prevProps */ RootElement, /* nextProps */ RootElement, Boolean]
  ] = js.native
  
  var onResized: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.native
  
  var onSlideChange: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.native
  
  var onSlideChanged: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.native
  
  var paddingLeft: js.UndefOr[Double] = js.native
  
  var paddingRight: js.UndefOr[Double] = js.native
  
  var preservePosition: js.UndefOr[Boolean] = js.native
  
  var responsive: js.UndefOr[Responsive] = js.native
  
  var swipeDelta: js.UndefOr[Double] = js.native
  
  var swipeExtraPadding: js.UndefOr[Double] = js.native
  
  var touchMoveDefaultEvents: js.UndefOr[Boolean] = js.native
  
  var touchTracking: js.UndefOr[Boolean] = js.native
}
object Props {
  
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationEasingFunction(value: String): Self = StObject.set(x, "animationEasingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationEasingFunctionUndefined: Self = StObject.set(x, "animationEasingFunction", js.undefined)
    
    @scala.inline
    def setAnimationType(value: slide | fadeout | AnimationType): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    @scala.inline
    def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
    
    @scala.inline
    def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayControls(value: Boolean): Self = StObject.set(x, "autoPlayControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayControlsUndefined: Self = StObject.set(x, "autoPlayControls", js.undefined)
    
    @scala.inline
    def setAutoPlayDirection(value: rtl | ltr | AutoplayDirection): Self = StObject.set(x, "autoPlayDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayDirectionUndefined: Self = StObject.set(x, "autoPlayDirection", js.undefined)
    
    @scala.inline
    def setAutoPlayInterval(value: Double): Self = StObject.set(x, "autoPlayInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayIntervalUndefined: Self = StObject.set(x, "autoPlayInterval", js.undefined)
    
    @scala.inline
    def setAutoPlayStrategy(value: default | all | action | none | AutoPlayStrategy): Self = StObject.set(x, "autoPlayStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayStrategyUndefined: Self = StObject.set(x, "autoPlayStrategy", js.undefined)
    
    @scala.inline
    def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
    
    @scala.inline
    def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
    
    @scala.inline
    def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setControlsStrategy(value: default | responsive | ControlsStrategy): Self = StObject.set(x, "controlsStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsStrategyUndefined: Self = StObject.set(x, "controlsStrategy", js.undefined)
    
    @scala.inline
    def setDisableButtonsControls(value: Boolean): Self = StObject.set(x, "disableButtonsControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableButtonsControlsUndefined: Self = StObject.set(x, "disableButtonsControls", js.undefined)
    
    @scala.inline
    def setDisableDotsControls(value: Boolean): Self = StObject.set(x, "disableDotsControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableDotsControlsUndefined: Self = StObject.set(x, "disableDotsControls", js.undefined)
    
    @scala.inline
    def setDisableSlideInfo(value: Boolean): Self = StObject.set(x, "disableSlideInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSlideInfoUndefined: Self = StObject.set(x, "disableSlideInfo", js.undefined)
    
    @scala.inline
    def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfiniteUndefined: Self = StObject.set(x, "infinite", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setMouseTracking(value: Boolean): Self = StObject.set(x, "mouseTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseTrackingUndefined: Self = StObject.set(x, "mouseTracking", js.undefined)
    
    @scala.inline
    def setOnInitialized(value: /* e */ EventObject => Unit): Self = StObject.set(x, "onInitialized", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInitializedUndefined: Self = StObject.set(x, "onInitialized", js.undefined)
    
    @scala.inline
    def setOnResizeEvent(value: (/* e */ Event, /* prevProps */ RootElement, /* nextProps */ RootElement) => Boolean): Self = StObject.set(x, "onResizeEvent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnResizeEventUndefined: Self = StObject.set(x, "onResizeEvent", js.undefined)
    
    @scala.inline
    def setOnResized(value: /* e */ EventObject => Unit): Self = StObject.set(x, "onResized", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResizedUndefined: Self = StObject.set(x, "onResized", js.undefined)
    
    @scala.inline
    def setOnSlideChange(value: /* e */ EventObject => Unit): Self = StObject.set(x, "onSlideChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSlideChangeUndefined: Self = StObject.set(x, "onSlideChange", js.undefined)
    
    @scala.inline
    def setOnSlideChanged(value: /* e */ EventObject => Unit): Self = StObject.set(x, "onSlideChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSlideChangedUndefined: Self = StObject.set(x, "onSlideChanged", js.undefined)
    
    @scala.inline
    def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
    
    @scala.inline
    def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    @scala.inline
    def setPreservePosition(value: Boolean): Self = StObject.set(x, "preservePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreservePositionUndefined: Self = StObject.set(x, "preservePosition", js.undefined)
    
    @scala.inline
    def setResponsive(value: Responsive): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    @scala.inline
    def setSwipeDelta(value: Double): Self = StObject.set(x, "swipeDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeDeltaUndefined: Self = StObject.set(x, "swipeDelta", js.undefined)
    
    @scala.inline
    def setSwipeExtraPadding(value: Double): Self = StObject.set(x, "swipeExtraPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeExtraPaddingUndefined: Self = StObject.set(x, "swipeExtraPadding", js.undefined)
    
    @scala.inline
    def setTouchMoveDefaultEvents(value: Boolean): Self = StObject.set(x, "touchMoveDefaultEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchMoveDefaultEventsUndefined: Self = StObject.set(x, "touchMoveDefaultEvents", js.undefined)
    
    @scala.inline
    def setTouchTracking(value: Boolean): Self = StObject.set(x, "touchTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchTrackingUndefined: Self = StObject.set(x, "touchTracking", js.undefined)
  }
}
