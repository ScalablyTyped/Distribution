package typings.primereact.overlayPanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayPanelProps extends js.Object {
  var appendTo: js.UndefOr[js.Any] = js.native
  var ariaCloseLabel: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var dismissable: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var onHide: js.UndefOr[js.Function0[Unit]] = js.native
  var showCloseIcon: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[js.Object] = js.native
}

object OverlayPanelProps {
  @scala.inline
  def apply(): OverlayPanelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayPanelProps]
  }
  @scala.inline
  implicit class OverlayPanelPropsOps[Self <: OverlayPanelProps] (val x: Self) extends AnyVal {
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
    def setAriaCloseLabel(value: String): Self = this.set("ariaCloseLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaCloseLabel: Self = this.set("ariaCloseLabel", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDismissable(value: Boolean): Self = this.set("dismissable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDismissable: Self = this.set("dismissable", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOnHide(value: () => Unit): Self = this.set("onHide", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    @scala.inline
    def setShowCloseIcon(value: Boolean): Self = this.set("showCloseIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCloseIcon: Self = this.set("showCloseIcon", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

