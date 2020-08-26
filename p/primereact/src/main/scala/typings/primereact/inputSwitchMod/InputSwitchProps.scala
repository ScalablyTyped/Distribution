package typings.primereact.inputSwitchMod

import typings.primereact.anon.TargetValue
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputSwitchProps extends js.Object {
  var ariaLabelledBy: js.UndefOr[String] = js.native
  var checked: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var offLabel: js.UndefOr[String] = js.native
  var onBlur: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onChange: js.UndefOr[js.Function1[/* e */ TargetValue, Unit]] = js.native
  var onFocus: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onLabel: js.UndefOr[String] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var tooltip: js.UndefOr[js.Any] = js.native
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.native
}

object InputSwitchProps {
  @scala.inline
  def apply(): InputSwitchProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSwitchProps]
  }
  @scala.inline
  implicit class InputSwitchPropsOps[Self <: InputSwitchProps] (val x: Self) extends AnyVal {
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOffLabel(value: String): Self = this.set("offLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffLabel: Self = this.set("offLabel", js.undefined)
    @scala.inline
    def setOnBlur(value: /* event */ Event => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChange(value: /* e */ TargetValue => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnFocus(value: /* event */ Event => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnLabel(value: String): Self = this.set("onLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLabel: Self = this.set("onLabel", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTooltip(value: js.Any): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTooltipOptions(value: TooltipOptions): Self = this.set("tooltipOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipOptions: Self = this.set("tooltipOptions", js.undefined)
  }
  
}

