package typings.atReachCombobox.atReachComboboxMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboboxInputProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement] {
  var autocomplete: js.UndefOr[Boolean] = js.undefined
  var selectOnClick: js.UndefOr[Boolean] = js.undefined
  @JSName("value")
  var value_ComboboxInputProps: js.UndefOr[String] = js.undefined
}

object ComboboxInputProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    autocomplete: js.UndefOr[Boolean] = js.undefined,
    selectOnClick: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): ComboboxInputProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(autocomplete)) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (!js.isUndefined(selectOnClick)) __obj.updateDynamic("selectOnClick")(selectOnClick.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComboboxInputProps]
  }
}

