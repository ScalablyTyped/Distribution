package typings.reactDashSwipeable.reactDashSwipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeableOptions extends js.Object {
  // Configuration Props
  var delta: js.UndefOr[Double] = js.undefined
  // Event handler/callbacks
  var onSwiped: js.UndefOr[SwipeCallback] = js.undefined
  var onSwipedDown: js.UndefOr[SwipeCallback] = js.undefined
  var onSwipedLeft: js.UndefOr[SwipeCallback] = js.undefined
  var onSwipedRight: js.UndefOr[SwipeCallback] = js.undefined
  var onSwipedUp: js.UndefOr[SwipeCallback] = js.undefined
  var onSwiping: js.UndefOr[SwipeCallback] = js.undefined
  var preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.undefined
  var rotationAngle: js.UndefOr[Double] = js.undefined
  var trackMouse: js.UndefOr[Boolean] = js.undefined
  var trackTouch: js.UndefOr[Boolean] = js.undefined
}

object SwipeableOptions {
  @scala.inline
  def apply(
    delta: Int | Double = null,
    onSwiped: /* eventData */ EventData => Unit = null,
    onSwipedDown: /* eventData */ EventData => Unit = null,
    onSwipedLeft: /* eventData */ EventData => Unit = null,
    onSwipedRight: /* eventData */ EventData => Unit = null,
    onSwipedUp: /* eventData */ EventData => Unit = null,
    onSwiping: /* eventData */ EventData => Unit = null,
    preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.undefined,
    rotationAngle: Int | Double = null,
    trackMouse: js.UndefOr[Boolean] = js.undefined,
    trackTouch: js.UndefOr[Boolean] = js.undefined
  ): SwipeableOptions = {
    val __obj = js.Dynamic.literal()
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (onSwiped != null) __obj.updateDynamic("onSwiped")(js.Any.fromFunction1(onSwiped))
    if (onSwipedDown != null) __obj.updateDynamic("onSwipedDown")(js.Any.fromFunction1(onSwipedDown))
    if (onSwipedLeft != null) __obj.updateDynamic("onSwipedLeft")(js.Any.fromFunction1(onSwipedLeft))
    if (onSwipedRight != null) __obj.updateDynamic("onSwipedRight")(js.Any.fromFunction1(onSwipedRight))
    if (onSwipedUp != null) __obj.updateDynamic("onSwipedUp")(js.Any.fromFunction1(onSwipedUp))
    if (onSwiping != null) __obj.updateDynamic("onSwiping")(js.Any.fromFunction1(onSwiping))
    if (!js.isUndefined(preventDefaultTouchmoveEvent)) __obj.updateDynamic("preventDefaultTouchmoveEvent")(preventDefaultTouchmoveEvent)
    if (rotationAngle != null) __obj.updateDynamic("rotationAngle")(rotationAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(trackMouse)) __obj.updateDynamic("trackMouse")(trackMouse)
    if (!js.isUndefined(trackTouch)) __obj.updateDynamic("trackTouch")(trackTouch)
    __obj.asInstanceOf[SwipeableOptions]
  }
}

