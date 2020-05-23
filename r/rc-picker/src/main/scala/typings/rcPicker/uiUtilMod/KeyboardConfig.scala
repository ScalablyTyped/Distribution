package typings.rcPicker.uiUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardConfig extends js.Object {
  var onCtrlLeftRight: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.undefined
  var onEnter: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onLeftRight: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.undefined
  var onPageUpDown: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.undefined
  var onUpDown: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.undefined
}

object KeyboardConfig {
  @scala.inline
  def apply(
    onCtrlLeftRight: js.UndefOr[Null | (/* diff */ Double => Unit)] = js.undefined,
    onEnter: js.UndefOr[Null | (() => Unit)] = js.undefined,
    onLeftRight: js.UndefOr[Null | (/* diff */ Double => Unit)] = js.undefined,
    onPageUpDown: js.UndefOr[Null | (/* diff */ Double => Unit)] = js.undefined,
    onUpDown: js.UndefOr[Null | (/* diff */ Double => Unit)] = js.undefined
  ): KeyboardConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onCtrlLeftRight)) __obj.updateDynamic("onCtrlLeftRight")(if (onCtrlLeftRight != null) js.Any.fromFunction1(onCtrlLeftRight.asInstanceOf[/* diff */ Double => Unit]) else null)
    if (!js.isUndefined(onEnter)) __obj.updateDynamic("onEnter")(if (onEnter != null) js.Any.fromFunction0(onEnter.asInstanceOf[() => Unit]) else null)
    if (!js.isUndefined(onLeftRight)) __obj.updateDynamic("onLeftRight")(if (onLeftRight != null) js.Any.fromFunction1(onLeftRight.asInstanceOf[/* diff */ Double => Unit]) else null)
    if (!js.isUndefined(onPageUpDown)) __obj.updateDynamic("onPageUpDown")(if (onPageUpDown != null) js.Any.fromFunction1(onPageUpDown.asInstanceOf[/* diff */ Double => Unit]) else null)
    if (!js.isUndefined(onUpDown)) __obj.updateDynamic("onUpDown")(if (onUpDown != null) js.Any.fromFunction1(onUpDown.asInstanceOf[/* diff */ Double => Unit]) else null)
    __obj.asInstanceOf[KeyboardConfig]
  }
}

