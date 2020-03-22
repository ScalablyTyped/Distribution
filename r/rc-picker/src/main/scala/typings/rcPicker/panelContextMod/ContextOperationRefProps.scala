package typings.rcPicker.panelContextMod

import typings.react.mod.KeyboardEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextOperationRefProps extends js.Object {
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[HTMLElement], Boolean]] = js.undefined
}

object ContextOperationRefProps {
  @scala.inline
  def apply(onClose: () => Unit = null, onKeyDown: /* e */ KeyboardEvent[HTMLElement] => Boolean = null): ContextOperationRefProps = {
    val __obj = js.Dynamic.literal()
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    __obj.asInstanceOf[ContextOperationRefProps]
  }
}

