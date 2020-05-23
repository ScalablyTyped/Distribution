package typings.reactOutsideClickHandler.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline-block`
import typings.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline`
import typings.reactOutsideClickHandler.reactOutsideClickHandlerStrings.block
import typings.reactOutsideClickHandler.reactOutsideClickHandlerStrings.contents
import typings.reactOutsideClickHandler.reactOutsideClickHandlerStrings.flex
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<react-outside-click-handler.react-outside-click-handler.DefaultProps> */
trait Props extends js.Object {
  var children: ReactNode
  var disabled: js.UndefOr[Boolean] = js.undefined
  var display: js.UndefOr[block | flex | `inline` | `inline-block` | contents] = js.undefined
  var useCapture: js.UndefOr[Boolean] = js.undefined
  def onOutsideClick(e: MouseEvent[HTMLElement, NativeMouseEvent]): Unit
}

object Props {
  @scala.inline
  def apply(
    onOutsideClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit,
    children: ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    display: block | flex | `inline` | `inline-block` | contents = null,
    useCapture: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(onOutsideClick = js.Any.fromFunction1(onOutsideClick))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(useCapture)) __obj.updateDynamic("useCapture")(useCapture.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

