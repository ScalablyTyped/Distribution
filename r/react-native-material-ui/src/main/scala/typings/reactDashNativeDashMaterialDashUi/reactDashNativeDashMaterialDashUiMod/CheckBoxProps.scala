package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import typings.reactDashNativeDashMaterialDashUi.Anon_ContainerIcon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckBoxProps extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var checkedIcon: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var label: String
  var style: js.UndefOr[Anon_ContainerIcon] = js.undefined
  var uncheckedIcon: js.UndefOr[String] = js.undefined
  var value: String | Double
  def onCheck(checked: Boolean): Unit
}

object CheckBoxProps {
  @scala.inline
  def apply(
    label: String,
    onCheck: Boolean => Unit,
    value: String | Double,
    checked: js.UndefOr[Boolean] = js.undefined,
    checkedIcon: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    style: Anon_ContainerIcon = null,
    uncheckedIcon: String = null
  ): CheckBoxProps = {
    val __obj = js.Dynamic.literal(label = label, onCheck = js.Any.fromFunction1(onCheck), value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (checkedIcon != null) __obj.updateDynamic("checkedIcon")(checkedIcon)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (style != null) __obj.updateDynamic("style")(style)
    if (uncheckedIcon != null) __obj.updateDynamic("uncheckedIcon")(uncheckedIcon)
    __obj.asInstanceOf[CheckBoxProps]
  }
}

