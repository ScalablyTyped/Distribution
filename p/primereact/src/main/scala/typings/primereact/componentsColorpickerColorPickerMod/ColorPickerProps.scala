package typings.primereact.componentsColorpickerColorPickerMod

import typings.primereact.componentsTooltipTooltipOptionsMod.TooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorPickerProps extends js.Object {
  var appendTo: js.UndefOr[js.Any] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var defaultColor: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var inputId: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabindex: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ColorPickerProps {
  @scala.inline
  def apply(
    appendTo: js.Any = null,
    className: String = null,
    defaultColor: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    id: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    inputId: String = null,
    onChange: /* value */ js.Any => Unit = null,
    style: js.Object = null,
    tabindex: String = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    value: js.Any = null
  ): ColorPickerProps = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultColor != null) __obj.updateDynamic("defaultColor")(defaultColor)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (format != null) __obj.updateDynamic("format")(format)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (inputId != null) __obj.updateDynamic("inputId")(inputId)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ColorPickerProps]
  }
}

