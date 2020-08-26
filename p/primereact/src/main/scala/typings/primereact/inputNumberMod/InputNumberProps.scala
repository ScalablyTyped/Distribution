package typings.primereact.inputNumberMod

import typings.primereact.anon.Target
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputNumberProps extends js.Object {
  var ariaLabelledBy: js.UndefOr[String] = js.native
  var buttonLayout: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var currency: js.UndefOr[String] = js.native
  var currencyDisplay: js.UndefOr[String] = js.native
  var decrementButtonClassName: js.UndefOr[String] = js.native
  var decrementButtonIcon: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var incrementButtonClassName: js.UndefOr[String] = js.native
  var incrementButtonIcon: js.UndefOr[String] = js.native
  var inputClassName: js.UndefOr[String] = js.native
  var inputId: js.UndefOr[String] = js.native
  var inputMode: js.UndefOr[String] = js.native
  var inputStyle: js.UndefOr[js.Object] = js.native
  var locale: js.UndefOr[String] = js.native
  var localeMatcher: js.UndefOr[String] = js.native
  var max: js.UndefOr[Double] = js.native
  var maxFractionDigits: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var minFractionDigits: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var onBlur: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  var onChange: js.UndefOr[js.Function1[/* e */ Target, Unit]] = js.native
  var onFocus: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  var pattern: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var readonly: js.UndefOr[Boolean] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var showButtons: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[Double] = js.native
  var step: js.UndefOr[Double] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var suffix: js.UndefOr[String] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var tooltip: js.UndefOr[String] = js.native
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.native
  var `type`: js.UndefOr[String] = js.native
  var useGrouping: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[Double] = js.native
}

object InputNumberProps {
  @scala.inline
  def apply(): InputNumberProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputNumberProps]
  }
  @scala.inline
  implicit class InputNumberPropsOps[Self <: InputNumberProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAriaLabelledBy(value: String): Self = this.set("ariaLabelledBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabelledBy: Self = this.set("ariaLabelledBy", js.undefined)
    @scala.inline
    def setButtonLayout(value: String): Self = this.set("buttonLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonLayout: Self = this.set("buttonLayout", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setCurrencyDisplay(value: String): Self = this.set("currencyDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyDisplay: Self = this.set("currencyDisplay", js.undefined)
    @scala.inline
    def setDecrementButtonClassName(value: String): Self = this.set("decrementButtonClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecrementButtonClassName: Self = this.set("decrementButtonClassName", js.undefined)
    @scala.inline
    def setDecrementButtonIcon(value: String): Self = this.set("decrementButtonIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecrementButtonIcon: Self = this.set("decrementButtonIcon", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFormat(value: Boolean): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIncrementButtonClassName(value: String): Self = this.set("incrementButtonClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncrementButtonClassName: Self = this.set("incrementButtonClassName", js.undefined)
    @scala.inline
    def setIncrementButtonIcon(value: String): Self = this.set("incrementButtonIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncrementButtonIcon: Self = this.set("incrementButtonIcon", js.undefined)
    @scala.inline
    def setInputClassName(value: String): Self = this.set("inputClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputClassName: Self = this.set("inputClassName", js.undefined)
    @scala.inline
    def setInputId(value: String): Self = this.set("inputId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputId: Self = this.set("inputId", js.undefined)
    @scala.inline
    def setInputMode(value: String): Self = this.set("inputMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputMode: Self = this.set("inputMode", js.undefined)
    @scala.inline
    def setInputStyle(value: js.Object): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputStyle: Self = this.set("inputStyle", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setLocaleMatcher(value: String): Self = this.set("localeMatcher", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocaleMatcher: Self = this.set("localeMatcher", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMaxFractionDigits(value: Double): Self = this.set("maxFractionDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFractionDigits: Self = this.set("maxFractionDigits", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinFractionDigits(value: Double): Self = this.set("minFractionDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinFractionDigits: Self = this.set("minFractionDigits", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnBlur(value: /* e */ Event => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChange(value: /* e */ Target => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnFocus(value: /* e */ Event => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setShowButtons(value: Boolean): Self = this.set("showButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowButtons: Self = this.set("showButtons", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTooltipOptions(value: TooltipOptions): Self = this.set("tooltipOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipOptions: Self = this.set("tooltipOptions", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUseGrouping(value: Boolean): Self = this.set("useGrouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseGrouping: Self = this.set("useGrouping", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

