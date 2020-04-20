package typings.rbx.modalBackgroundMod

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalBackgroundModifierProps extends js.Object {
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
}

object ModalBackgroundModifierProps {
  @scala.inline
  def apply(onClick: MouseEvent[Element, NativeMouseEvent] => Unit = null): ModalBackgroundModifierProps = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[ModalBackgroundModifierProps]
  }
}

