package typings.reactAliceCarousel.mod

import typings.reactAliceCarousel.reactAliceCarouselStrings.responsive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * Set auto height for the stage
    *
    * Default: false.
    */
  var autoHeight: js.UndefOr[Boolean] = js.undefined
  /**
    *  Set auto play mode
    *
    * Default: false.
    */
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  /**
    * If this property is identified as true auto play animation will be stopped after clicking user on any gallery button
    *
    * Default: false.
    */
  var autoPlayActionDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * To run auto play in the left direction specify rtl value
    *
    * Default: 'ltr'.
    */
  var autoPlayDirection: js.UndefOr[String] = js.undefined
  /**
    * Interval of auto play animation (milliseconds). If specified, a larger value will be taken from comparing this property and the duration one
    *
    * Default: 250.
    */
  var autoPlayInterval: js.UndefOr[Double] = js.undefined
  /**
    * Disable buttons control
    *
    * Default: false.
    */
  var buttonsDisabled: js.UndefOr[Boolean] = js.undefined
  /** Defines the behavior strategy for controls.
    *
    * Default: 'default'
    *
    * If `responsive` is specified, dots navigation will be hidden if the number of gallery items is equal to the number of items on the slide
    */
  var controlsStrategy: js.UndefOr[typings.reactAliceCarousel.reactAliceCarouselStrings.default | responsive] = js.undefined
  /**
    * If this property is identified as true auto play animation will be stopped after clicking user on any gallery button
    *
    * Default: false.
    */
  var disableAutoPlayOnAction: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable dots navigation
    *
    * Default: false.
    */
  var dotsDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Duration of slides transition (milliseconds)
    *
    * Default: 250.
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Enable fadeout animation. Fired when 1 item is in the slide
    *
    * Default: false.
    */
  var fadeOutAnimation: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable infinite mode
    *
    * Default: true.
    */
  var infinite: js.UndefOr[Boolean] = js.undefined
  /**
    * Gallery items, preferable to use this property instead of children
    *
    * Default: [].
    */
  var items: js.UndefOr[js.Array[js.Object]] = js.undefined
  /**
    * Disable keys controls (left, right, space)
    *
    * Default: false.
    */
  var keysControlDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable mouse drag animation
    *
    * Default: false.
    */
  var mouseTrackingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Fired when the gallery was initialized / returns event object
    */
  var onInitialized: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.undefined
  /**
    * Fired when the gallery was resized / returns event object
    */
  var onResized: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.undefined
  /**
    * Fired when the event object is changing / returns event object
    */
  var onSlideChange: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.undefined
  /**
    * Fired when the event object was changed / returns event object
    */
  var onSlideChanged: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.undefined
  /**
    * Disable play/pause button
    *
    * Default: false.
    */
  var playButtonEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Preserve current slide position when resize event fired
    *
    * Default: false.
    */
  var preservePosition: js.UndefOr[Boolean] = js.undefined
  /**
    * Prevent the browser's touchmove event when carousel is swiping
    *
    * Default: false.
    */
  var preventEventOnTouchMove: js.UndefOr[Boolean] = js.undefined
  /**
    * Number of items in the slide.
    *
    * Default: {}.
    */
  var responsive: js.UndefOr[js.Object] = js.undefined
  /**
    * Fired during resize event to determine whether the event handler should be called / return boolean
    */
  var shouldHandleResizeEvent: js.UndefOr[js.Function1[/* e */ js.Any, Boolean]] = js.undefined
  /**
    * Show slide info
    *
    * Default: false.
    */
  var showSlideInfo: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the carousel at the specified position
    *
    * Default: 0.
    */
  var slideToIndex: js.UndefOr[Double] = js.undefined
  /**
    * Padding left and right on the stage
    *
    * Default: {}.
    */
  var stagePadding: js.UndefOr[js.Object] = js.undefined
  /**
    * The starting index of the carousel
    *
    * Default: 0.
    */
  var startIndex: js.UndefOr[Double] = js.undefined
  /**
    * If this property is identified as false auto play animation won't stopped on hover
    *
    * Default: true.
    */
  var stopAutoPlayOnHover: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable swipe handlers
    *
    * Default: false.
    */
  var swipeDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable touch tracking animation
    *
    * Default: false.
    */
  var touchTrackingEnabled: js.UndefOr[Boolean] = js.undefined
  /** Sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * Default: 'ease-out'
    *
    */
  var transitionTimingFunction: js.UndefOr[String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    autoPlayActionDisabled: js.UndefOr[Boolean] = js.undefined,
    autoPlayDirection: String = null,
    autoPlayInterval: js.UndefOr[Double] = js.undefined,
    buttonsDisabled: js.UndefOr[Boolean] = js.undefined,
    controlsStrategy: typings.reactAliceCarousel.reactAliceCarouselStrings.default | responsive = null,
    disableAutoPlayOnAction: js.UndefOr[Boolean] = js.undefined,
    dotsDisabled: js.UndefOr[Boolean] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    fadeOutAnimation: js.UndefOr[Boolean] = js.undefined,
    infinite: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[js.Object] = null,
    keysControlDisabled: js.UndefOr[Boolean] = js.undefined,
    mouseTrackingEnabled: js.UndefOr[Boolean] = js.undefined,
    onInitialized: /* e */ EventObject => Unit = null,
    onResized: /* e */ EventObject => Unit = null,
    onSlideChange: /* e */ EventObject => Unit = null,
    onSlideChanged: /* e */ EventObject => Unit = null,
    playButtonEnabled: js.UndefOr[Boolean] = js.undefined,
    preservePosition: js.UndefOr[Boolean] = js.undefined,
    preventEventOnTouchMove: js.UndefOr[Boolean] = js.undefined,
    responsive: js.Object = null,
    shouldHandleResizeEvent: /* e */ js.Any => Boolean = null,
    showSlideInfo: js.UndefOr[Boolean] = js.undefined,
    slideToIndex: js.UndefOr[Double] = js.undefined,
    stagePadding: js.Object = null,
    startIndex: js.UndefOr[Double] = js.undefined,
    stopAutoPlayOnHover: js.UndefOr[Boolean] = js.undefined,
    swipeDisabled: js.UndefOr[Boolean] = js.undefined,
    touchTrackingEnabled: js.UndefOr[Boolean] = js.undefined,
    transitionTimingFunction: String = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlayActionDisabled)) __obj.updateDynamic("autoPlayActionDisabled")(autoPlayActionDisabled.get.asInstanceOf[js.Any])
    if (autoPlayDirection != null) __obj.updateDynamic("autoPlayDirection")(autoPlayDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlayInterval)) __obj.updateDynamic("autoPlayInterval")(autoPlayInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonsDisabled)) __obj.updateDynamic("buttonsDisabled")(buttonsDisabled.get.asInstanceOf[js.Any])
    if (controlsStrategy != null) __obj.updateDynamic("controlsStrategy")(controlsStrategy.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAutoPlayOnAction)) __obj.updateDynamic("disableAutoPlayOnAction")(disableAutoPlayOnAction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dotsDisabled)) __obj.updateDynamic("dotsDisabled")(dotsDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeOutAnimation)) __obj.updateDynamic("fadeOutAnimation")(fadeOutAnimation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.get.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(keysControlDisabled)) __obj.updateDynamic("keysControlDisabled")(keysControlDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseTrackingEnabled)) __obj.updateDynamic("mouseTrackingEnabled")(mouseTrackingEnabled.get.asInstanceOf[js.Any])
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onResized != null) __obj.updateDynamic("onResized")(js.Any.fromFunction1(onResized))
    if (onSlideChange != null) __obj.updateDynamic("onSlideChange")(js.Any.fromFunction1(onSlideChange))
    if (onSlideChanged != null) __obj.updateDynamic("onSlideChanged")(js.Any.fromFunction1(onSlideChanged))
    if (!js.isUndefined(playButtonEnabled)) __obj.updateDynamic("playButtonEnabled")(playButtonEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preservePosition)) __obj.updateDynamic("preservePosition")(preservePosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preventEventOnTouchMove)) __obj.updateDynamic("preventEventOnTouchMove")(preventEventOnTouchMove.get.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (shouldHandleResizeEvent != null) __obj.updateDynamic("shouldHandleResizeEvent")(js.Any.fromFunction1(shouldHandleResizeEvent))
    if (!js.isUndefined(showSlideInfo)) __obj.updateDynamic("showSlideInfo")(showSlideInfo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slideToIndex)) __obj.updateDynamic("slideToIndex")(slideToIndex.get.asInstanceOf[js.Any])
    if (stagePadding != null) __obj.updateDynamic("stagePadding")(stagePadding.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopAutoPlayOnHover)) __obj.updateDynamic("stopAutoPlayOnHover")(stopAutoPlayOnHover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeDisabled)) __obj.updateDynamic("swipeDisabled")(swipeDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touchTrackingEnabled)) __obj.updateDynamic("touchTrackingEnabled")(touchTrackingEnabled.get.asInstanceOf[js.Any])
    if (transitionTimingFunction != null) __obj.updateDynamic("transitionTimingFunction")(transitionTimingFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

