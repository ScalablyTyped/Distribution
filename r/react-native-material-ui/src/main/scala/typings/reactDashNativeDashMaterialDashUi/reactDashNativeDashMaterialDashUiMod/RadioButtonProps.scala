package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioButtonProps extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var label: String
  var theme: js.UndefOr[String] = js.undefined
  var value: String | Double
  def onSelect(value: String): Unit
}

object RadioButtonProps {
  @scala.inline
  def apply(
    label: String,
    onSelect: String => Unit,
    value: String | Double,
    checked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    theme: String = null
  ): RadioButtonProps = {
    val __obj = js.Dynamic.literal(label = label, onSelect = js.Any.fromFunction1(onSelect), value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[RadioButtonProps]
  }
}

