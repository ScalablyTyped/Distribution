package typings.select2.mod

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
    title: String
  ): OptionData = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionData]
  }
}

