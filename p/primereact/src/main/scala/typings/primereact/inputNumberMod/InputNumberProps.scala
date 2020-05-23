package typings.primereact.inputNumberMod

import typings.primereact.anon.Target
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputNumberProps extends js.Object {
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  var buttonLayout: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var currencyDisplay: js.UndefOr[String] = js.undefined
  var decrementButtonClassName: js.UndefOr[String] = js.undefined
  var decrementButtonIcon: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var incrementButtonClassName: js.UndefOr[String] = js.undefined
  var incrementButtonIcon: js.UndefOr[String] = js.undefined
  var inputClassName: js.UndefOr[String] = js.undefined
  var inputId: js.UndefOr[String] = js.undefined
  var inputMode: js.UndefOr[String] = js.undefined
  var inputStyle: js.UndefOr[js.Object] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var localeMatcher: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var maxFractionDigits: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var minFractionDigits: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ Target, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var showButtons: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var useGrouping: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object InputNumberProps {
  @scala.inline
  def apply(
    ariaLabelledBy: String = null,
    buttonLayout: String = null,
    className: String = null,
    currency: String = null,
    currencyDisplay: String = null,
    decrementButtonClassName: String = null,
    decrementButtonIcon: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    format: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    incrementButtonClassName: String = null,
    incrementButtonIcon: String = null,
    inputClassName: String = null,
    inputId: String = null,
    inputMode: String = null,
    inputStyle: js.Object = null,
    locale: String = null,
    localeMatcher: String = null,
    max: js.UndefOr[Double] = js.undefined,
    maxFractionDigits: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    minFractionDigits: js.UndefOr[Double] = js.undefined,
    mode: String = null,
    name: String = null,
    onBlur: /* e */ Event => Unit = null,
    onChange: /* e */ Target => Unit = null,
    onFocus: /* e */ Event => Unit = null,
    pattern: String = null,
    placeholder: String = null,
    prefix: String = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    showButtons: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    step: js.UndefOr[Double] = js.undefined,
    style: js.Object = null,
    suffix: String = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    tooltip: String = null,
    tooltipOptions: TooltipOptions = null,
    `type`: String = null,
    useGrouping: js.UndefOr[Boolean] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): InputNumberProps = {
    val __obj = js.Dynamic.literal()
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (buttonLayout != null) __obj.updateDynamic("buttonLayout")(buttonLayout.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (currencyDisplay != null) __obj.updateDynamic("currencyDisplay")(currencyDisplay.asInstanceOf[js.Any])
    if (decrementButtonClassName != null) __obj.updateDynamic("decrementButtonClassName")(decrementButtonClassName.asInstanceOf[js.Any])
    if (decrementButtonIcon != null) __obj.updateDynamic("decrementButtonIcon")(decrementButtonIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (incrementButtonClassName != null) __obj.updateDynamic("incrementButtonClassName")(incrementButtonClassName.asInstanceOf[js.Any])
    if (incrementButtonIcon != null) __obj.updateDynamic("incrementButtonIcon")(incrementButtonIcon.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (inputId != null) __obj.updateDynamic("inputId")(inputId.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFractionDigits)) __obj.updateDynamic("maxFractionDigits")(maxFractionDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minFractionDigits)) __obj.updateDynamic("minFractionDigits")(minFractionDigits.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showButtons)) __obj.updateDynamic("showButtons")(showButtons.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(useGrouping)) __obj.updateDynamic("useGrouping")(useGrouping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputNumberProps]
  }
}

