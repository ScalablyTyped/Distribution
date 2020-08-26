package typings.reactBootstrap.modalFooterMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalFooterProps
  extends AllHTMLAttributes[ModalFooter]
     with ClassAttributes[ModalFooter] {
  var bsClass: js.UndefOr[String] = js.native
  var componentClass: js.UndefOr[ReactType[_]] = js.native
}

object ModalFooterProps {
  @scala.inline
  def apply(): ModalFooterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalFooterProps]
  }
  @scala.inline
  implicit class ModalFooterPropsOps[Self <: ModalFooterProps] (val x: Self) extends AnyVal {
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
    def setComponentClass(value: ReactType[_]): Self = this.set("componentClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentClass: Self = this.set("componentClass", js.undefined)
  }
  
}

