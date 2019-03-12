package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Touchable extends js.Object {
  var onTouchCancel: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Unit]] = js.undefined
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Unit]] = js.undefined
  var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Unit]] = js.undefined
  var onTouchMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Unit]] = js.undefined
  var onTouchStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Unit]] = js.undefined
}

object Touchable {
  @scala.inline
  def apply(
    onTouchCancel: /* event */ GestureResponderEvent => scala.Unit = null,
    onTouchEnd: /* event */ GestureResponderEvent => scala.Unit = null,
    onTouchEndCapture: /* event */ GestureResponderEvent => scala.Unit = null,
    onTouchMove: /* event */ GestureResponderEvent => scala.Unit = null,
    onTouchStart: /* event */ GestureResponderEvent => scala.Unit = null
  ): Touchable = {
    val __obj = js.Dynamic.literal()
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1(onTouchEndCapture))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    __obj.asInstanceOf[Touchable]
  }
}

