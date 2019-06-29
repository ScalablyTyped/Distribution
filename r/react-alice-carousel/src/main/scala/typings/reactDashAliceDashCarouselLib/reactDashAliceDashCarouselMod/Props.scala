package typings
package reactDashAliceDashCarouselLib.reactDashAliceDashCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * Set auto height for the stage
    *
    * Default: false.
    */
  var autoHeight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  Set auto play mode
    *
    * Default: false.
    */
  var autoPlay: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If this property is identified as true auto play animation will be stopped after clicking user on any gallery button
    *
    * Default: false.
    */
  var autoPlayActionDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * To run auto play in the left direction specify rtl value
    *
    * Default: 'ltr'.
    */
  var autoPlayDirection: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Interval of auto play animation (milliseconds). If specified, a larger value will be taken from comparing this property and the duration one
    *
    * Default: 250.
    */
  var autoPlayInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Disable buttons control
    *
    * Default: false.
    */
  var buttonsDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If this property is identified as true auto play animation will be stopped after clicking user on any gallery button
    *
    * Default: false.
    */
  var disableAutoPlayOnAction: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disable dots navigation
    *
    * Default: false.
    */
  var dotsDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Duration of slides transition (milliseconds)
    *
    * Default: 250.
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enable fadeout animation. Fired when 1 item is in the slide
    *
    * Default: false.
    */
  var fadeOutAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disable infinite mode
    *
    * Default: true.
    */
  var infinite: js.UndefOr[scala.Boolean] = js.undefined
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
  var keysControlDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable mouse drag animation
    *
    * Default: false.
    */
  var mouseDragEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Fired when the gallery was initialized / returns event object
    */
  var onInitialized: js.UndefOr[js.Function1[/* e */ EventObject, scala.Unit]] = js.undefined
  /**
    * Fired when the gallery was resized / returns event object
    */
  var onResized: js.UndefOr[js.Function1[/* e */ EventObject, scala.Unit]] = js.undefined
  /**
    * Fired when the event object is changing / returns event object
    */
  var onSlideChange: js.UndefOr[js.Function1[/* e */ EventObject, scala.Unit]] = js.undefined
  /**
    * Fired when the event object was changed / returns event object
    */
  var onSlideChanged: js.UndefOr[js.Function1[/* e */ EventObject, scala.Unit]] = js.undefined
  /**
    * Disable play/pause button
    *
    * Default: false.
    */
  var playButtonEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Prevent the browser's touchmove event when carousel is swiping
    *
    * Default: false.
    */
  var preventEventOnTouchMove: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Number of items in the slide.
    *
    * Default: {}.
    */
  var responsive: js.UndefOr[js.Object] = js.undefined
  /**
    * Fired during resize event to determine whether the event handler should be called / return boolean
    */
  var shouldHandleResizeEvent: js.UndefOr[js.Function1[/* e */ js.Any, scala.Boolean]] = js.undefined
  /**
    * Show slide info
    *
    * Default: false.
    */
  var showSlideInfo: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets the carousel at the specified position
    *
    * Default: 0.
    */
  var slideToIndex: js.UndefOr[scala.Double] = js.undefined
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
  var startIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * If this property is identified as false auto play animation won't stopped on hover
    *
    * Default: true.
    */
  var stopAutoPlayOnHover: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disable swipe handlers
    *
    * Default: false.
    */
  var swipeDisabled: js.UndefOr[scala.Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    autoHeight: js.UndefOr[scala.Boolean] = js.undefined,
    autoPlay: js.UndefOr[scala.Boolean] = js.undefined,
    autoPlayActionDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    autoPlayDirection: java.lang.String = null,
    autoPlayInterval: scala.Int | scala.Double = null,
    buttonsDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    disableAutoPlayOnAction: js.UndefOr[scala.Boolean] = js.undefined,
    dotsDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    fadeOutAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    infinite: js.UndefOr[scala.Boolean] = js.undefined,
    items: js.Array[js.Object] = null,
    keysControlDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    mouseDragEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    onInitialized: /* e */ EventObject => scala.Unit = null,
    onResized: /* e */ EventObject => scala.Unit = null,
    onSlideChange: /* e */ EventObject => scala.Unit = null,
    onSlideChanged: /* e */ EventObject => scala.Unit = null,
    playButtonEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    preventEventOnTouchMove: js.UndefOr[scala.Boolean] = js.undefined,
    responsive: js.Object = null,
    shouldHandleResizeEvent: /* e */ js.Any => scala.Boolean = null,
    showSlideInfo: js.UndefOr[scala.Boolean] = js.undefined,
    slideToIndex: scala.Int | scala.Double = null,
    stagePadding: js.Object = null,
    startIndex: scala.Int | scala.Double = null,
    stopAutoPlayOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    swipeDisabled: js.UndefOr[scala.Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight)
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay)
    if (!js.isUndefined(autoPlayActionDisabled)) __obj.updateDynamic("autoPlayActionDisabled")(autoPlayActionDisabled)
    if (autoPlayDirection != null) __obj.updateDynamic("autoPlayDirection")(autoPlayDirection)
    if (autoPlayInterval != null) __obj.updateDynamic("autoPlayInterval")(autoPlayInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonsDisabled)) __obj.updateDynamic("buttonsDisabled")(buttonsDisabled)
    if (!js.isUndefined(disableAutoPlayOnAction)) __obj.updateDynamic("disableAutoPlayOnAction")(disableAutoPlayOnAction)
    if (!js.isUndefined(dotsDisabled)) __obj.updateDynamic("dotsDisabled")(dotsDisabled)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeOutAnimation)) __obj.updateDynamic("fadeOutAnimation")(fadeOutAnimation)
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite)
    if (items != null) __obj.updateDynamic("items")(items)
    if (!js.isUndefined(keysControlDisabled)) __obj.updateDynamic("keysControlDisabled")(keysControlDisabled)
    if (!js.isUndefined(mouseDragEnabled)) __obj.updateDynamic("mouseDragEnabled")(mouseDragEnabled)
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onResized != null) __obj.updateDynamic("onResized")(js.Any.fromFunction1(onResized))
    if (onSlideChange != null) __obj.updateDynamic("onSlideChange")(js.Any.fromFunction1(onSlideChange))
    if (onSlideChanged != null) __obj.updateDynamic("onSlideChanged")(js.Any.fromFunction1(onSlideChanged))
    if (!js.isUndefined(playButtonEnabled)) __obj.updateDynamic("playButtonEnabled")(playButtonEnabled)
    if (!js.isUndefined(preventEventOnTouchMove)) __obj.updateDynamic("preventEventOnTouchMove")(preventEventOnTouchMove)
    if (responsive != null) __obj.updateDynamic("responsive")(responsive)
    if (shouldHandleResizeEvent != null) __obj.updateDynamic("shouldHandleResizeEvent")(js.Any.fromFunction1(shouldHandleResizeEvent))
    if (!js.isUndefined(showSlideInfo)) __obj.updateDynamic("showSlideInfo")(showSlideInfo)
    if (slideToIndex != null) __obj.updateDynamic("slideToIndex")(slideToIndex.asInstanceOf[js.Any])
    if (stagePadding != null) __obj.updateDynamic("stagePadding")(stagePadding)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(stopAutoPlayOnHover)) __obj.updateDynamic("stopAutoPlayOnHover")(stopAutoPlayOnHover)
    if (!js.isUndefined(swipeDisabled)) __obj.updateDynamic("swipeDisabled")(swipeDisabled)
    __obj.asInstanceOf[Props]
  }
}

