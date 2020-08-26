package typings.primereact.spinnerMod

import typings.primereact.anon.OriginalEventTargetValue
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpinnerProps extends js.Object {
  var ariaLabelledBy: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var decimalSeparator: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var formatInput: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var inputClassName: js.UndefOr[String] = js.native
  var inputId: js.UndefOr[String] = js.native
  var inputStyle: js.UndefOr[js.Object] = js.native
  var max: js.UndefOr[Double] = js.native
  var maxlength: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var onBlur: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  var onChange: js.UndefOr[js.Function1[/* e */ OriginalEventTargetValue, Unit]] = js.native
  var pattern: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var readonly: js.UndefOr[Boolean] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[Double] = js.native
  var step: js.UndefOr[Double] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var thousandSeparator: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[js.Any] = js.native
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.native
  var value: js.UndefOr[Double] = js.native
}

object SpinnerProps {
  @scala.inline
  def apply(): SpinnerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpinnerProps]
  }
  @scala.inline
  implicit class SpinnerPropsOps[Self <: SpinnerProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDecimalSeparator(value: String): Self = this.set("decimalSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimalSeparator: Self = this.set("decimalSeparator", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFormatInput(value: Boolean): Self = this.set("formatInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatInput: Self = this.set("formatInput", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInputClassName(value: String): Self = this.set("inputClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputClassName: Self = this.set("inputClassName", js.undefined)
    @scala.inline
    def setInputId(value: String): Self = this.set("inputId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputId: Self = this.set("inputId", js.undefined)
    @scala.inline
    def setInputStyle(value: js.Object): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputStyle: Self = this.set("inputStyle", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMaxlength(value: Double): Self = this.set("maxlength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxlength: Self = this.set("maxlength", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnBlur(value: /* e */ Event => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChange(value: /* e */ OriginalEventTargetValue => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
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
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setThousandSeparator(value: String): Self = this.set("thousandSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThousandSeparator: Self = this.set("thousandSeparator", js.undefined)
    @scala.inline
    def setTooltip(value: js.Any): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTooltipOptions(value: TooltipOptions): Self = this.set("tooltipOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipOptions: Self = this.set("tooltipOptions", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

