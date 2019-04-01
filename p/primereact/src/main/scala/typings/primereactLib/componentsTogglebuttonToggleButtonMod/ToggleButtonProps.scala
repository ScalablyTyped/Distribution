package typings
package primereactLib.componentsTogglebuttonToggleButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleButtonProps extends js.Object {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var offIcon: js.UndefOr[java.lang.String] = js.undefined
  var offLabel: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValueBoolean, scala.Unit]] = js.undefined
  var onIcon: js.UndefOr[java.lang.String] = js.undefined
  var onLabel: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions] = js.undefined
}

object ToggleButtonProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    id: java.lang.String = null,
    offIcon: java.lang.String = null,
    offLabel: java.lang.String = null,
    onChange: /* e */ primereactLib.Anon_OriginalEventValueBoolean => scala.Unit = null,
    onIcon: java.lang.String = null,
    onLabel: java.lang.String = null,
    style: js.Object = null,
    tooltip: js.Any = null,
    tooltipOptions: primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions = null
  ): ToggleButtonProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (offIcon != null) __obj.updateDynamic("offIcon")(offIcon)
    if (offLabel != null) __obj.updateDynamic("offLabel")(offLabel)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onIcon != null) __obj.updateDynamic("onIcon")(onIcon)
    if (onLabel != null) __obj.updateDynamic("onLabel")(onLabel)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions)
    __obj.asInstanceOf[ToggleButtonProps]
  }
}

