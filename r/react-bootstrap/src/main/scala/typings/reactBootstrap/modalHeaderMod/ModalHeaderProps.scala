package typings.reactBootstrap.modalHeaderMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalHeaderProps
  extends AllHTMLAttributes[ModalHeader]
     with ClassAttributes[ModalHeader] {
  var bsClass: js.UndefOr[String] = js.native
  var closeButton: js.UndefOr[Boolean] = js.native
  var closeLabel: js.UndefOr[String] = js.native
  var onHide: js.UndefOr[js.Function] = js.native
}

object ModalHeaderProps {
  @scala.inline
  def apply(): ModalHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalHeaderProps]
  }
  @scala.inline
  implicit class ModalHeaderPropsOps[Self <: ModalHeaderProps] (val x: Self) extends AnyVal {
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
    def setBsClass(value: String): Self = this.set("bsClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBsClass: Self = this.set("bsClass", js.undefined)
    @scala.inline
    def setCloseButton(value: Boolean): Self = this.set("closeButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseButton: Self = this.set("closeButton", js.undefined)
    @scala.inline
    def setCloseLabel(value: String): Self = this.set("closeLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseLabel: Self = this.set("closeLabel", js.undefined)
    @scala.inline
    def setOnHide(value: js.Function): Self = this.set("onHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
  }
  
}

