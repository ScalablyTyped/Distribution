package typings
package reactDashTouchLib.reactDashTouchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeableProps extends js.Object {
  /** @see defineSwipe */
  var config: js.UndefOr[SwipeableConfig] = js.undefined
  var onMouseDown: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSwipeDown: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSwipeLeft: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSwipeRight: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSwipeUp: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onTouchStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object SwipeableProps {
  @scala.inline
  def apply(
    config: SwipeableConfig = null,
    onMouseDown: js.Function0[scala.Unit] = null,
    onSwipeDown: js.Function0[scala.Unit] = null,
    onSwipeLeft: js.Function0[scala.Unit] = null,
    onSwipeRight: js.Function0[scala.Unit] = null,
    onSwipeUp: js.Function0[scala.Unit] = null,
    onTouchStart: js.Function0[scala.Unit] = null
  ): SwipeableProps = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onSwipeDown != null) __obj.updateDynamic("onSwipeDown")(onSwipeDown)
    if (onSwipeLeft != null) __obj.updateDynamic("onSwipeLeft")(onSwipeLeft)
    if (onSwipeRight != null) __obj.updateDynamic("onSwipeRight")(onSwipeRight)
    if (onSwipeUp != null) __obj.updateDynamic("onSwipeUp")(onSwipeUp)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    __obj.asInstanceOf[SwipeableProps]
  }
}

