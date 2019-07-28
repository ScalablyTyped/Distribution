package typings.primereact.componentsSpinnerSpinnerMod

import typings.primereact.Anon_Value
import typings.primereact.componentsTooltipTooltipOptionsMod.TooltipOptions
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var decimalSeparator: String
  var disabled: js.UndefOr[Boolean] = js.undefined
  var formatInput: Boolean
  var id: js.UndefOr[String] = js.undefined
  var inputClassName: js.UndefOr[String] = js.undefined
  var inputId: js.UndefOr[String] = js.undefined
  var inputStyle: js.UndefOr[js.Object] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var maxlength: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ Anon_Value, Unit]] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var thousandSeparator: String
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object SpinnerProps {
  @scala.inline
  def apply(
    decimalSeparator: String,
    formatInput: Boolean,
    thousandSeparator: String,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inputClassName: String = null,
    inputId: String = null,
    inputStyle: js.Object = null,
    max: Int | Double = null,
    maxlength: Int | Double = null,
    min: Int | Double = null,
    name: String = null,
    onBlur: /* e */ Event => Unit = null,
    onChange: /* e */ Anon_Value => Unit = null,
    pattern: String = null,
    placeholder: String = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null,
    step: Int | Double = null,
    style: js.Object = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    value: Int | Double = null
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

