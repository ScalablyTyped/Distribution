package typings.primereact.splitButtonMod

import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitButtonProps extends js.Object {
  var appendTo: js.UndefOr[HTMLElement] = js.native
  var className: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var menuClassName: js.UndefOr[String] = js.native
  var menuStyle: js.UndefOr[js.Object] = js.native
  var model: js.UndefOr[js.Array[_]] = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var tabIndex: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[js.Any] = js.native
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.native
}

object SplitButtonProps {
  @scala.inline
  def apply(): SplitButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitButtonProps]
  }
  @scala.inline
  implicit class SplitButtonPropsOps[Self <: SplitButtonProps] (val x: Self) extends AnyVal {
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
    def setAppendTo(value: HTMLElement): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMenuClassName(value: String): Self = this.set("menuClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuClassName: Self = this.set("menuClassName", js.undefined)
    @scala.inline
    def setMenuStyle(value: js.Object): Self = this.set("menuStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuStyle: Self = this.set("menuStyle", js.undefined)
    @scala.inline
    def setModelVarargs(value: js.Any*): Self = this.set("model", js.Array(value :_*))
    @scala.inline
    def setModel(value: js.Array[_]): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setOnClick(value: /* event */ Event => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTabIndex(value: String): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
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

