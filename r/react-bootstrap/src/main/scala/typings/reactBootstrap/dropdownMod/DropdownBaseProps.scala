package typings.reactBootstrap.dropdownMod

import typings.react.mod.ReactType
import typings.reactBootstrap.mod.SelectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownBaseProps extends js.Object {
  var bsClass: js.UndefOr[String] = js.native
  var componentClass: js.UndefOr[ReactType[_]] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var dropup: js.UndefOr[Boolean] = js.native
  var id: String = js.native
  var onClose: js.UndefOr[js.Function] = js.native
  var onSelect: js.UndefOr[SelectCallback] = js.native
  var onToggle: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var pullRight: js.UndefOr[Boolean] = js.native
  var role: js.UndefOr[String] = js.native
}

object DropdownBaseProps {
  @scala.inline
  def apply(id: String): DropdownBaseProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownBaseProps]
  }
  @scala.inline
  implicit class DropdownBasePropsOps[Self <: DropdownBaseProps] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setBsClass(value: String): Self = this.set("bsClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBsClass: Self = this.set("bsClass", js.undefined)
    @scala.inline
    def setComponentClass(value: ReactType[_]): Self = this.set("componentClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentClass: Self = this.set("componentClass", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDropup(value: Boolean): Self = this.set("dropup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropup: Self = this.set("dropup", js.undefined)
    @scala.inline
    def setOnClose(value: js.Function): Self = this.set("onClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnSelect(value: SelectCallback): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnToggle(value: /* isOpen */ Boolean => Unit): Self = this.set("onToggle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnToggle: Self = this.set("onToggle", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setPullRight(value: Boolean): Self = this.set("pullRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullRight: Self = this.set("pullRight", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
  
}

