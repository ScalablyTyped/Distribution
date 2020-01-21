package typings.storybookComponents.actionBarMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionItem extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var title: String | Element
  def onClick(e: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit
}

object ActionItem {
  @scala.inline
  def apply(
    onClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit,
    title: String | Element,
    disabled: js.UndefOr[Boolean] = js.undefined
  ): ActionItem = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionItem]
  }
}

