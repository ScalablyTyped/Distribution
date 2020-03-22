package typings.rcPicker.interfaceMod

import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelRefProps extends js.Object {
  var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[HTMLElement], Boolean]] = js.undefined
}

object PanelRefProps {
  @scala.inline
  def apply(
    onBlur: FocusEvent[HTMLElement] => Unit = null,
    onClose: () => Unit = null,
    onKeyDown: /* e */ KeyboardEvent[HTMLElement] => Boolean = null
  ): PanelRefProps = {
    val __obj = js.Dynamic.literal()
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    __obj.asInstanceOf[PanelRefProps]
  }
}

