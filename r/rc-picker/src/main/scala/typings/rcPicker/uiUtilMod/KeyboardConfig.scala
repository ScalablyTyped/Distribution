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
    onCtrlLeftRight: /* diff */ Double => Unit = null,
    onEnter: () => Unit = null,
    onLeftRight: /* diff */ Double => Unit = null,
    onPageUpDown: /* diff */ Double => Unit = null,
    onUpDown: /* diff */ Double => Unit = null
  ): KeyboardConfig = {
    val __obj = js.Dynamic.literal()
    if (onCtrlLeftRight != null) __obj.updateDynamic("onCtrlLeftRight")(js.Any.fromFunction1(onCtrlLeftRight))
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction0(onEnter))
    if (onLeftRight != null) __obj.updateDynamic("onLeftRight")(js.Any.fromFunction1(onLeftRight))
    if (onPageUpDown != null) __obj.updateDynamic("onPageUpDown")(js.Any.fromFunction1(onPageUpDown))
    if (onUpDown != null) __obj.updateDynamic("onUpDown")(js.Any.fromFunction1(onUpDown))
    __obj.asInstanceOf[KeyboardConfig]
  }
}

