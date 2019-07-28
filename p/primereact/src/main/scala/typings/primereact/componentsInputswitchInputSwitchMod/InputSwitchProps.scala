package typings.primereact.componentsInputswitchInputSwitchMod

import typings.primereact.Anon_OriginalEventValueBoolean
import typings.primereact.componentsTooltipTooltipOptionsMod.TooltipOptions
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputSwitchProps extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var offLabel: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ Anon_OriginalEventValueBoolean, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onLabel: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
}

object InputSwitchProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    offLabel: String = null,
    onBlur: /* event */ Event => Unit = null,
    onChange: /* e */ Anon_OriginalEventValueBoolean => Unit = null,
    onFocus: /* event */ Event => Unit = null,
    onLabel: String = null,
    style: js.Object = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null
  ): InputSwitchProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (offLabel != null) __obj.updateDynamic("offLabel")(offLabel)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onLabel != null) __obj.updateDynamic("onLabel")(onLabel)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions)
    __obj.asInstanceOf[InputSwitchProps]
  }
}

