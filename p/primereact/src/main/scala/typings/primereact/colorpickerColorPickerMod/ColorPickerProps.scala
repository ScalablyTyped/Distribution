package typings.primereact.colorpickerColorPickerMod

import typings.primereact.anon.Id
import typings.primereact.tooltipOptionsMod.TooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorPickerProps extends js.Object {
  var appendTo: js.UndefOr[js.Any] = js.native
  var className: js.UndefOr[String] = js.native
  var defaultColor: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  var inputId: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[js.Function2[/* value */ js.Any, /* target */ Id, Unit]] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var tabindex: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[js.Any] = js.native
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object ColorPickerProps {
  @scala.inline
  def apply(): ColorPickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorPickerProps]
  }
  @scala.inline
  implicit class ColorPickerPropsOps[Self <: ColorPickerProps] (val x: Self) extends AnyVal {
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
    def setAppendTo(value: js.Any): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDefaultColor(value: String): Self = this.set("defaultColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultColor: Self = this.set("defaultColor", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setInputId(value: String): Self = this.set("inputId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputId: Self = this.set("inputId", js.undefined)
    @scala.inline
    def setOnChange(value: (/* value */ js.Any, /* target */ Id) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTabindex(value: String): Self = this.set("tabindex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabindex: Self = this.set("tabindex", js.undefined)
    @scala.inline
    def setTooltip(value: js.Any): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTooltipOptions(value: TooltipOptions): Self = this.set("tooltipOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipOptions: Self = this.set("tooltipOptions", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

