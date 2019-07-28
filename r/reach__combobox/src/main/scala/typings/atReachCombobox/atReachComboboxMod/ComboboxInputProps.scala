package typings.atReachCombobox.atReachComboboxMod

import typings.react.reactMod.HTMLProps
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboboxInputProps extends HTMLProps[HTMLElement] {
  var autocomplete: js.UndefOr[Boolean] = js.undefined
  var selectOnClick: js.UndefOr[Boolean] = js.undefined
  @JSName("value")
  var value_ComboboxInputProps: js.UndefOr[String] = js.undefined
}

object ComboboxInputProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[HTMLElement] = null,
    as: String = null,
    autocomplete: js.UndefOr[Boolean] = js.undefined,
    selectOnClick: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): ComboboxInputProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(autocomplete)) __obj.updateDynamic("autocomplete")(autocomplete)
    if (!js.isUndefined(selectOnClick)) __obj.updateDynamic("selectOnClick")(selectOnClick)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ComboboxInputProps]
  }
}

