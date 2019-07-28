package typings.primereact.componentsCheckboxCheckboxMod

import typings.primereact.Anon_Checked
import typings.primereact.componentsTooltipTooltipOptionsMod.TooltipOptions
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxProps extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inputId: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onMouseDown: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  def onChange(e: Anon_Checked): Unit
}

object CheckboxProps {
  @scala.inline
  def apply(
    onChange: Anon_Checked => Unit,
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inputId: String = null,
    name: String = null,
    onContextMenu: /* event */ Event => Unit = null,
    onMouseDown: /* event */ Event => Unit = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    value: js.Any = null
  ): CheckboxProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputId != null) __obj.updateDynamic("inputId")(inputId)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CheckboxProps]
  }
}

