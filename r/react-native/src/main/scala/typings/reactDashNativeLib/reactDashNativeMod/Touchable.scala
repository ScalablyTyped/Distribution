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
    onTouchCancel: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onTouchEnd: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onTouchEndCapture: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onTouchMove: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onTouchStart: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null
  ): Touchable = {
    val __obj = js.Dynamic.literal()
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(onTouchEndCapture)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    __obj.asInstanceOf[Touchable]
  }
}

