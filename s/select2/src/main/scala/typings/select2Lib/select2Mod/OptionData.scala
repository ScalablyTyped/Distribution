package typings
package select2Lib.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionData extends js.Object {
  var children: js.UndefOr[scala.Nothing] = js.undefined
  var disabled: scala.Boolean
  var element: stdLib.HTMLOptionElement
  var id: java.lang.String
  var loading: js.UndefOr[scala.Nothing] = js.undefined
  var selected: scala.Boolean
  var text: java.lang.String
  var title: java.lang.String
}

object OptionData {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    element: stdLib.HTMLOptionElement,
    id: java.lang.String,
    selected: scala.Boolean,
    text: java.lang.String,
    title: java.lang.String,
    children: js.UndefOr[scala.Nothing] = js.undefined,
    loading: js.UndefOr[scala.Nothing] = js.undefined
  ): OptionData = {
    val __obj = js.Dynamic.literal(disabled = disabled, element = element, id = id, selected = selected, text = text, title = title)
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    __obj.asInstanceOf[OptionData]
  }
}

