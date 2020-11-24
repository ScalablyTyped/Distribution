package typings.reactAliceCarousel.anon

import typings.reactAliceCarousel.reactAliceCarouselStrings.action
import typings.reactAliceCarousel.reactAliceCarouselStrings.all
import typings.reactAliceCarousel.reactAliceCarouselStrings.default
import typings.reactAliceCarousel.reactAliceCarouselStrings.fadeout
import typings.reactAliceCarousel.reactAliceCarouselStrings.ltr
import typings.reactAliceCarousel.reactAliceCarouselStrings.none
import typings.reactAliceCarousel.reactAliceCarouselStrings.responsive
import typings.reactAliceCarousel.reactAliceCarouselStrings.rtl
import typings.reactAliceCarousel.reactAliceCarouselStrings.slide
import typings.reactAliceCarousel.typesMod.AnimationType
import typings.reactAliceCarousel.typesMod.AutoPlayStrategy
import typings.reactAliceCarousel.typesMod.AutoplayDirection
import typings.reactAliceCarousel.typesMod.ControlsStrategy
import typings.reactAliceCarousel.typesMod.EventObject
import typings.reactAliceCarousel.typesMod.Responsive
import typings.reactAliceCarousel.typesMod.RootElement
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-alice-carousel.react-alice-carousel/lib/types.Props> */
@js.native
trait ReadonlyProps extends js.Object {
  
  val activeIndex: js.UndefOr[Double] = js.native
  
  val animationDuration: js.UndefOr[Double] = js.native
  
  val animationEasingFunction: js.UndefOr[String] = js.native
  
  val animationType: js.UndefOr[slide | fadeout | AnimationType] = js.native
  
  val autoHeight: js.UndefOr[Boolean] = js.native
  
  val autoPlay: js.UndefOr[Boolean] = js.native
  
  val autoPlayControls: js.UndefOr[Boolean] = js.native
  
  val autoPlayDirection: js.UndefOr[rtl | ltr | AutoplayDirection] = js.native
  
  val autoPlayInterval: js.UndefOr[Double] = js.native
  
  val autoPlayStrategy: js.UndefOr[default | all | action | none | AutoPlayStrategy] = js.native
  
  val autoWidth: js.UndefOr[Boolean] = js.native
  
  val children: js.UndefOr[js.Any] = js.native
  
  val controlsStrategy: js.UndefOr[
    default | typings.reactAliceCarousel.reactAliceCarouselStrings.responsive | ControlsStrategy
  ] = js.native
  
  val disableButtonsControls: js.UndefOr[Boolean] = js.native
  
  val disableDotsControls: js.UndefOr[Boolean] = js.native
  
  val disableSlideInfo: js.UndefOr[Boolean] = js.native
  
  val infinite: js.UndefOr[Boolean] = js.native
  
  val items: js.UndefOr[js.Array[_]] = js.native
  
  val mouseTracking: js.UndefOr[Boolean] = js.native
  
  val onInitialized: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.native
  
  val onResizeEvent: js.UndefOr[
    js.Function3[/* e */ Event, /* prevProps */ RootElement, /* nextProps */ RootElement, Boolean]
  ] = js.native
  
  val onResized: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.native
  
  val onSlideChange: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.native
  
  val onSlideChanged: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.native
  
  val paddingLeft: js.UndefOr[Double] = js.native
  
  val paddingRight: js.UndefOr[Double] = js.native
  
  val preservePosition: js.UndefOr[Boolean] = js.native
  
  val responsive: js.UndefOr[Responsive] = js.native
  
  val swipeDelta: js.UndefOr[Double] = js.native
  
  val swipeExtraPadding: js.UndefOr[Double] = js.native
  
  val touchMoveDefaultEvents: js.UndefOr[Boolean] = js.native
  
  val touchTracking: js.UndefOr[Boolean] = js.native
}
object ReadonlyProps {
  
  @scala.inline
  def apply(): ReadonlyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyProps]
  }
  
  @scala.inline
  implicit class ReadonlyPropsOps[Self <: ReadonlyProps] (val x: Self) extends AnyVal {
    
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
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveIndex: Self = this.set("activeIndex", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationEasingFunction(value: String): Self = this.set("animationEasingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationEasingFunction: Self = this.set("animationEasingFunction", js.undefined)
    
    @scala.inline
    def setAnimationType(value: slide | fadeout | AnimationType): Self = this.set("animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationType: Self = this.set("animationType", js.undefined)
    
    @scala.inline
    def setAutoHeight(value: Boolean): Self = this.set("autoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHeight: Self = this.set("autoHeight", js.undefined)
    
    @scala.inline
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    
    @scala.inline
    def setAutoPlayControls(value: Boolean): Self = this.set("autoPlayControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPlayControls: Self = this.set("autoPlayControls", js.undefined)
    
    @scala.inline
    def setAutoPlayDirection(value: rtl | ltr | AutoplayDirection): Self = this.set("autoPlayDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPlayDirection: Self = this.set("autoPlayDirection", js.undefined)
    
    @scala.inline
    def setAutoPlayInterval(value: Double): Self = this.set("autoPlayInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPlayInterval: Self = this.set("autoPlayInterval", js.undefined)
    
    @scala.inline
    def setAutoPlayStrategy(value: default | all | action | none | AutoPlayStrategy): Self = this.set("autoPlayStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPlayStrategy: Self = this.set("autoPlayStrategy", js.undefined)
    
    @scala.inline
    def setAutoWidth(value: Boolean): Self = this.set("autoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoWidth: Self = this.set("autoWidth", js.undefined)
    
    @scala.inline
    def setChildren(value: js.Any): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setControlsStrategy(value: default | responsive | ControlsStrategy): Self = this.set("controlsStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlsStrategy: Self = this.set("controlsStrategy", js.undefined)
    
    @scala.inline
    def setDisableButtonsControls(value: Boolean): Self = this.set("disableButtonsControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableButtonsControls: Self = this.set("disableButtonsControls", js.undefined)
    
    @scala.inline
    def setDisableDotsControls(value: Boolean): Self = this.set("disableDotsControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDotsControls: Self = this.set("disableDotsControls", js.undefined)
    
    @scala.inline
    def setDisableSlideInfo(value: Boolean): Self = this.set("disableSlideInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSlideInfo: Self = this.set("disableSlideInfo", js.undefined)
    
    @scala.inline
    def setInfinite(value: Boolean): Self = this.set("infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfinite: Self = this.set("infinite", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setMouseTracking(value: Boolean): Self = this.set("mouseTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseTracking: Self = this.set("mouseTracking", js.undefined)
    
    @scala.inline
    def setOnInitialized(value: /* e */ EventObject => Unit): Self = this.set("onInitialized", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInitialized: Self = this.set("onInitialized", js.undefined)
    
    @scala.inline
    def setOnResizeEvent(value: (/* e */ Event, /* prevProps */ RootElement, /* nextProps */ RootElement) => Boolean): Self = this.set("onResizeEvent", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnResizeEvent: Self = this.set("onResizeEvent", js.undefined)
    
    @scala.inline
    def setOnResized(value: /* e */ EventObject => Unit): Self = this.set("onResized", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResized: Self = this.set("onResized", js.undefined)
    
    @scala.inline
    def setOnSlideChange(value: /* e */ EventObject => Unit): Self = this.set("onSlideChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSlideChange: Self = this.set("onSlideChange", js.undefined)
    
    @scala.inline
    def setOnSlideChanged(value: /* e */ EventObject => Unit): Self = this.set("onSlideChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSlideChanged: Self = this.set("onSlideChanged", js.undefined)
    
    @scala.inline
    def setPaddingLeft(value: Double): Self = this.set("paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingLeft: Self = this.set("paddingLeft", js.undefined)
    
    @scala.inline
    def setPaddingRight(value: Double): Self = this.set("paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingRight: Self = this.set("paddingRight", js.undefined)
    
    @scala.inline
    def setPreservePosition(value: Boolean): Self = this.set("preservePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreservePosition: Self = this.set("preservePosition", js.undefined)
    
    @scala.inline
    def setResponsive(value: Responsive): Self = this.set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    
    @scala.inline
    def setSwipeDelta(value: Double): Self = this.set("swipeDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeDelta: Self = this.set("swipeDelta", js.undefined)
    
    @scala.inline
    def setSwipeExtraPadding(value: Double): Self = this.set("swipeExtraPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeExtraPadding: Self = this.set("swipeExtraPadding", js.undefined)
    
    @scala.inline
    def setTouchMoveDefaultEvents(value: Boolean): Self = this.set("touchMoveDefaultEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchMoveDefaultEvents: Self = this.set("touchMoveDefaultEvents", js.undefined)
    
    @scala.inline
    def setTouchTracking(value: Boolean): Self = this.set("touchTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchTracking: Self = this.set("touchTracking", js.undefined)
  }
}
