package typings.reactAliceCarousel.mod

import typings.reactAliceCarousel.reactAliceCarouselStrings.responsive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
    * Set auto height for the stage
    *
    * Default: false.
    */
  var autoHeight: js.UndefOr[Boolean] = js.native
  /**
    *  Set auto play mode
    *
    * Default: false.
    */
  var autoPlay: js.UndefOr[Boolean] = js.native
  /**
    * If this property is identified as true auto play animation will be stopped after clicking user on any gallery button
    *
    * Default: false.
    */
  var autoPlayActionDisabled: js.UndefOr[Boolean] = js.native
  /**
    * To run auto play in the left direction specify rtl value
    *
    * Default: 'ltr'.
    */
  var autoPlayDirection: js.UndefOr[String] = js.native
  /**
    * Interval of auto play animation (milliseconds). If specified, a larger value will be taken from comparing this property and the duration one
    *
    * Default: 250.
    */
  var autoPlayInterval: js.UndefOr[Double] = js.native
  /**
    * Disable buttons control
    *
    * Default: false.
    */
  var buttonsDisabled: js.UndefOr[Boolean] = js.native
  /** Defines the behavior strategy for controls.
    *
    * Default: 'default'
    *
    * If `responsive` is specified, dots navigation will be hidden if the number of gallery items is equal to the number of items on the slide
    */
  var controlsStrategy: js.UndefOr[typings.reactAliceCarousel.reactAliceCarouselStrings.default | responsive] = js.native
  /**
    * If this property is identified as true auto play animation will be stopped after clicking user on any gallery button
    *
    * Default: false.
    */
  var disableAutoPlayOnAction: js.UndefOr[Boolean] = js.native
  /**
    * Disable dots navigation
    *
    * Default: false.
    */
  var dotsDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Duration of slides transition (milliseconds)
    *
    * Default: 250.
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Enable fadeout animation. Fired when 1 item is in the slide
    *
    * Default: false.
    */
  var fadeOutAnimation: js.UndefOr[Boolean] = js.native
  /**
    * Disable infinite mode
    *
    * Default: true.
    */
  var infinite: js.UndefOr[Boolean] = js.native
  /**
    * Gallery items, preferable to use this property instead of children
    *
    * Default: [].
    */
  var items: js.UndefOr[js.Array[js.Object]] = js.native
  /**
    * Disable keys controls (left, right, space)
    *
    * Default: false.
    */
  var keysControlDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Enable mouse drag animation
    *
    * Default: false.
    */
  var mouseTrackingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Fired when the gallery was initialized / returns event object
    */
  var onInitialized: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.native
  /**
    * Fired when the gallery was resized / returns event object
    */
  var onResized: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.native
  /**
    * Fired when the event object is changing / returns event object
    */
  var onSlideChange: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.native
  /**
    * Fired when the event object was changed / returns event object
    */
  var onSlideChanged: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.native
  /**
    * Disable play/pause button
    *
    * Default: false.
    */
  var playButtonEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Preserve current slide position when resize event fired
    *
    * Default: false.
    */
  var preservePosition: js.UndefOr[Boolean] = js.native
  /**
    * Prevent the browser's touchmove event when carousel is swiping
    *
    * Default: false.
    */
  var preventEventOnTouchMove: js.UndefOr[Boolean] = js.native
  /**
    * Number of items in the slide.
    *
    * Default: {}.
    */
  var responsive: js.UndefOr[js.Object] = js.native
  /**
    * Fired during resize event to determine whether the event handler should be called / return boolean
    */
  var shouldHandleResizeEvent: js.UndefOr[js.Function1[/* e */ js.Any, Boolean]] = js.native
  /**
    * Show slide info
    *
    * Default: false.
    */
  var showSlideInfo: js.UndefOr[Boolean] = js.native
  /**
    * Sets the carousel at the specified position
    *
    * Default: 0.
    */
  var slideToIndex: js.UndefOr[Double] = js.native
  /**
    * Padding left and right on the stage
    *
    * Default: {}.
    */
  var stagePadding: js.UndefOr[js.Object] = js.native
  /**
    * The starting index of the carousel
    *
    * Default: 0.
    */
  var startIndex: js.UndefOr[Double] = js.native
  /**
    * If this property is identified as false auto play animation won't stopped on hover
    *
    * Default: true.
    */
  var stopAutoPlayOnHover: js.UndefOr[Boolean] = js.native
  /**
    * Disable swipe handlers
    *
    * Default: false.
    */
  var swipeDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Enable touch tracking animation
    *
    * Default: false.
    */
  var touchTrackingEnabled: js.UndefOr[Boolean] = js.native
  /** Sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * Default: 'ease-out'
    *
    */
  var transitionTimingFunction: js.UndefOr[String] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setAutoHeight(value: Boolean): Self = this.set("autoHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoHeight: Self = this.set("autoHeight", js.undefined)
    @scala.inline
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    @scala.inline
    def setAutoPlayActionDisabled(value: Boolean): Self = this.set("autoPlayActionDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPlayActionDisabled: Self = this.set("autoPlayActionDisabled", js.undefined)
    @scala.inline
    def setAutoPlayDirection(value: String): Self = this.set("autoPlayDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPlayDirection: Self = this.set("autoPlayDirection", js.undefined)
    @scala.inline
    def setAutoPlayInterval(value: Double): Self = this.set("autoPlayInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPlayInterval: Self = this.set("autoPlayInterval", js.undefined)
    @scala.inline
    def setButtonsDisabled(value: Boolean): Self = this.set("buttonsDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonsDisabled: Self = this.set("buttonsDisabled", js.undefined)
    @scala.inline
    def setControlsStrategy(value: typings.reactAliceCarousel.reactAliceCarouselStrings.default | responsive): Self = this.set("controlsStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlsStrategy: Self = this.set("controlsStrategy", js.undefined)
    @scala.inline
    def setDisableAutoPlayOnAction(value: Boolean): Self = this.set("disableAutoPlayOnAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAutoPlayOnAction: Self = this.set("disableAutoPlayOnAction", js.undefined)
    @scala.inline
    def setDotsDisabled(value: Boolean): Self = this.set("dotsDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotsDisabled: Self = this.set("dotsDisabled", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setFadeOutAnimation(value: Boolean): Self = this.set("fadeOutAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeOutAnimation: Self = this.set("fadeOutAnimation", js.undefined)
    @scala.inline
    def setInfinite(value: Boolean): Self = this.set("infinite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfinite: Self = this.set("infinite", js.undefined)
    @scala.inline
    def setItemsVarargs(value: js.Object*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[js.Object]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKeysControlDisabled(value: Boolean): Self = this.set("keysControlDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeysControlDisabled: Self = this.set("keysControlDisabled", js.undefined)
    @scala.inline
    def setMouseTrackingEnabled(value: Boolean): Self = this.set("mouseTrackingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseTrackingEnabled: Self = this.set("mouseTrackingEnabled", js.undefined)
    @scala.inline
    def setOnInitialized(value: /* e */ EventObject => Unit): Self = this.set("onInitialized", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInitialized: Self = this.set("onInitialized", js.undefined)
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
    def setPlayButtonEnabled(value: Boolean): Self = this.set("playButtonEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayButtonEnabled: Self = this.set("playButtonEnabled", js.undefined)
    @scala.inline
    def setPreservePosition(value: Boolean): Self = this.set("preservePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreservePosition: Self = this.set("preservePosition", js.undefined)
    @scala.inline
    def setPreventEventOnTouchMove(value: Boolean): Self = this.set("preventEventOnTouchMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventEventOnTouchMove: Self = this.set("preventEventOnTouchMove", js.undefined)
    @scala.inline
    def setResponsive(value: js.Object): Self = this.set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    @scala.inline
    def setShouldHandleResizeEvent(value: /* e */ js.Any => Boolean): Self = this.set("shouldHandleResizeEvent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShouldHandleResizeEvent: Self = this.set("shouldHandleResizeEvent", js.undefined)
    @scala.inline
    def setShowSlideInfo(value: Boolean): Self = this.set("showSlideInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSlideInfo: Self = this.set("showSlideInfo", js.undefined)
    @scala.inline
    def setSlideToIndex(value: Double): Self = this.set("slideToIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideToIndex: Self = this.set("slideToIndex", js.undefined)
    @scala.inline
    def setStagePadding(value: js.Object): Self = this.set("stagePadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStagePadding: Self = this.set("stagePadding", js.undefined)
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    @scala.inline
    def setStopAutoPlayOnHover(value: Boolean): Self = this.set("stopAutoPlayOnHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopAutoPlayOnHover: Self = this.set("stopAutoPlayOnHover", js.undefined)
    @scala.inline
    def setSwipeDisabled(value: Boolean): Self = this.set("swipeDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeDisabled: Self = this.set("swipeDisabled", js.undefined)
    @scala.inline
    def setTouchTrackingEnabled(value: Boolean): Self = this.set("touchTrackingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchTrackingEnabled: Self = this.set("touchTrackingEnabled", js.undefined)
    @scala.inline
    def setTransitionTimingFunction(value: String): Self = this.set("transitionTimingFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionTimingFunction: Self = this.set("transitionTimingFunction", js.undefined)
  }
  
}

