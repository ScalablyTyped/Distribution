package typings.atStorybookComponents.distActionBarActionBarMod

import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionItem extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var title: String | Element
  def onClick(e: typings.react.reactMod.MouseEvent[HTMLButtonElement, MouseEvent]): Unit
}

object ActionItem {
  @scala.inline
  def apply(
    onClick: typings.react.reactMod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit,
    title: String | Element,
    disabled: js.UndefOr[Boolean] = js.undefined
  ): ActionItem = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[ActionItem]
  }
}

