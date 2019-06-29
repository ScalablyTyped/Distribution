package typings
package atReachComboboxLib.atReachComboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboboxInputProps
  extends reactLib.reactMod.HTMLProps[stdLib.HTMLElement] {
  var autocomplete: js.UndefOr[scala.Boolean] = js.undefined
  var selectOnClick: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("value")
  var value_ComboboxInputProps: js.UndefOr[java.lang.String] = js.undefined
}

object ComboboxInputProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[stdLib.HTMLElement] = null,
    as: java.lang.String = null,
    autocomplete: js.UndefOr[scala.Boolean] = js.undefined,
    selectOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String = null
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

