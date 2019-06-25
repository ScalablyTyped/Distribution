package typings
package primereactLib.componentsSpinnerSpinnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var decimalSeparator: java.lang.String
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var formatInput: scala.Boolean
  var id: js.UndefOr[java.lang.String] = js.undefined
  var inputClassName: js.UndefOr[java.lang.String] = js.undefined
  var inputId: js.UndefOr[java.lang.String] = js.undefined
  var inputStyle: js.UndefOr[js.Object] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var maxlength: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* e */ stdLib.Event, scala.Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_Value, scala.Unit]] = js.undefined
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var readonly: js.UndefOr[scala.Boolean] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var thousandSeparator: java.lang.String
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object SpinnerProps {
  @scala.inline
  def apply(
    decimalSeparator: java.lang.String,
    formatInput: scala.Boolean,
    thousandSeparator: java.lang.String,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    inputClassName: java.lang.String = null,
    inputId: java.lang.String = null,
    inputStyle: js.Object = null,
    max: scala.Int | scala.Double = null,
    maxlength: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    onBlur: /* e */ stdLib.Event => scala.Unit = null,
    onChange: /* e */ primereactLib.Anon_Value => scala.Unit = null,
    pattern: java.lang.String = null,
    placeholder: java.lang.String = null,
    readonly: js.UndefOr[scala.Boolean] = js.undefined,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Int | scala.Double = null,
    step: scala.Int | scala.Double = null,
    style: js.Object = null,
    tooltip: js.Any = null,
    tooltipOptions: primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions = null,
    value: scala.Int | scala.Double = null
  ): SpinnerProps = {
    val __obj = js.Dynamic.literal(decimalSeparator = decimalSeparator, formatInput = formatInput, thousandSeparator = thousandSeparator)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName)
    if (inputId != null) __obj.updateDynamic("inputId")(inputId)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinnerProps]
  }
}

