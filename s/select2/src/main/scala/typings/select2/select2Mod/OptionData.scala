package typings.select2.select2Mod

import typings.std.HTMLOptionElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionData extends js.Object {
  var children: js.UndefOr[scala.Nothing] = js.undefined
  var disabled: Boolean
  var element: HTMLOptionElement
  var id: String
  var loading: js.UndefOr[scala.Nothing] = js.undefined
  var selected: Boolean
  var text: String
  var title: String
}

object OptionData {
  @scala.inline
  def apply(
    disabled: Boolean,
    element: HTMLOptionElement,
    id: String,
    selected: Boolean,
    text: String,
    title: String,
    children: js.UndefOr[scala.Nothing] = js.undefined,
    loading: js.UndefOr[scala.Nothing] = js.undefined
  ): OptionData = {
    val __obj = js.Dynamic.literal(disabled = disabled, element = element, id = id, selected = selected, text = text, title = title)
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    __obj.asInstanceOf[OptionData]
  }
}

