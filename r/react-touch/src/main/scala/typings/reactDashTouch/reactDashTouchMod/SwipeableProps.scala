package typings.reactDashTouch.reactDashTouchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeableProps extends js.Object {
  /** @see defineSwipe */
  var config: js.UndefOr[SwipeableConfig] = js.undefined
  var onMouseDown: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeDown: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeLeft: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeRight: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeUp: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTouchStart: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SwipeableProps {
  @scala.inline
  def apply(
    config: SwipeableConfig = null,
    onMouseDown: () => Unit = null,
    onSwipeDown: () => Unit = null,
    onSwipeLeft: () => Unit = null,
    onSwipeRight: () => Unit = null,
    onSwipeUp: () => Unit = null,
    onTouchStart: () => Unit = null
  ): SwipeableProps = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction0(onMouseDown))
    if (onSwipeDown != null) __obj.updateDynamic("onSwipeDown")(js.Any.fromFunction0(onSwipeDown))
    if (onSwipeLeft != null) __obj.updateDynamic("onSwipeLeft")(js.Any.fromFunction0(onSwipeLeft))
    if (onSwipeRight != null) __obj.updateDynamic("onSwipeRight")(js.Any.fromFunction0(onSwipeRight))
    if (onSwipeUp != null) __obj.updateDynamic("onSwipeUp")(js.Any.fromFunction0(onSwipeUp))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction0(onTouchStart))
    __obj.asInstanceOf[SwipeableProps]
  }
}

