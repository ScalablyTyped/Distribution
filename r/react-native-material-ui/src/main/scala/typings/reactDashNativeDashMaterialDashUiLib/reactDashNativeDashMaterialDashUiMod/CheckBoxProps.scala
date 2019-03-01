package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckBoxProps extends js.Object {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var checkedIcon: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var label: java.lang.String
  var style: js.UndefOr[reactDashNativeDashMaterialDashUiLib.Anon_ContainerIcon] = js.undefined
  var uncheckedIcon: js.UndefOr[java.lang.String] = js.undefined
  var value: java.lang.String | scala.Double
  def onCheck(checked: scala.Boolean): scala.Unit
}

object CheckBoxProps {
  @scala.inline
  def apply(
    label: java.lang.String,
    onCheck: js.Function1[scala.Boolean, scala.Unit],
    value: java.lang.String | scala.Double,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    checkedIcon: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeDashMaterialDashUiLib.Anon_ContainerIcon = null,
    uncheckedIcon: java.lang.String = null
  ): CheckBoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("onCheck")(onCheck)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (checkedIcon != null) __obj.updateDynamic("checkedIcon")(checkedIcon)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (style != null) __obj.updateDynamic("style")(style)
    if (uncheckedIcon != null) __obj.updateDynamic("uncheckedIcon")(uncheckedIcon)
    __obj.asInstanceOf[CheckBoxProps]
  }
}

