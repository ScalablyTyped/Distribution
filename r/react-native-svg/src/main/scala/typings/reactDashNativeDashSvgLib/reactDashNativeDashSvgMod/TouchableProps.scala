package typings
package reactDashNativeDashSvgLib.reactDashNativeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchableProps extends js.Object {
  var delayLongPress: js.UndefOr[scala.Double] = js.undefined
  var delayPressIn: js.UndefOr[scala.Double] = js.undefined
  var delayPressOut: js.UndefOr[scala.Double] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var onLongPress: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  var onPress: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  var onPressIn: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  var onPressOut: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
}

object TouchableProps {
  @scala.inline
  def apply(
    delayLongPress: scala.Int | scala.Double = null,
    delayPressIn: scala.Int | scala.Double = null,
    delayPressOut: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onLongPress: /* event */ js.Any => _ = null,
    onPress: /* event */ js.Any => _ = null,
    onPressIn: /* event */ js.Any => _ = null,
    onPressOut: /* event */ js.Any => _ = null
  ): TouchableProps = {
    val __obj = js.Dynamic.literal()
    if (delayLongPress != null) __obj.updateDynamic("delayLongPress")(delayLongPress.asInstanceOf[js.Any])
    if (delayPressIn != null) __obj.updateDynamic("delayPressIn")(delayPressIn.asInstanceOf[js.Any])
    if (delayPressOut != null) __obj.updateDynamic("delayPressOut")(delayPressOut.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction1(onPressIn))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction1(onPressOut))
    __obj.asInstanceOf[TouchableProps]
  }
}

