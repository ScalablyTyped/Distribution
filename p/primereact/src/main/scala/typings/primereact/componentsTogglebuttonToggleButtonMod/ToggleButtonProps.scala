package typings.primereact.componentsTogglebuttonToggleButtonMod

import typings.primereact.Anon_OriginalEventValueBoolean
import typings.primereact.componentsTooltipTooltipOptionsMod.TooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleButtonProps extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var offIcon: js.UndefOr[String] = js.undefined
  var offLabel: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ Anon_OriginalEventValueBoolean, Unit]] = js.undefined
  var onIcon: js.UndefOr[String] = js.undefined
  var onLabel: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
}

object ToggleButtonProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    id: String = null,
    offIcon: String = null,
    offLabel: String = null,
    onChange: /* e */ Anon_OriginalEventValueBoolean => Unit = null,
    onIcon: String = null,
    onLabel: String = null,
    style: js.Object = null,
    tabIndex: Int | Double = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null
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
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions)
    __obj.asInstanceOf[ToggleButtonProps]
  }
}

