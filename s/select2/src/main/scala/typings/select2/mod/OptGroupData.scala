package typings.select2.mod

import typings.std.HTMLOptGroupElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptGroupData extends js.Object {
  var children: js.Array[OptionData]
  var disabled: Boolean
  var element: HTMLOptGroupElement
  var loading: js.UndefOr[scala.Nothing] = js.undefined
  var selected: Boolean
  var text: String
  var title: String
}

object OptGroupData {
  @scala.inline
  def apply(
    children: js.Array[OptionData],
    disabled: Boolean,
    element: HTMLOptGroupElement,
    selected: Boolean,
    text: String,
    title: String,
    loading: js.UndefOr[scala.Nothing] = js.undefined
  ): OptGroupData = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptGroupData]
  }
}

