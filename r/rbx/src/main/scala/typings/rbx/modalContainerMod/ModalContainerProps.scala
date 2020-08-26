package typings.rbx.modalContainerMod

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.ReactType
import typings.react.mod.Ref
import typings.std.Document
import typings.std.HTMLElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalContainerProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var as: js.UndefOr[ReactType[_]] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var clipped: js.UndefOr[Boolean] = js.native
  var closeOnBlur: js.UndefOr[Boolean] = js.native
  var closeOnEsc: js.UndefOr[Boolean] = js.native
  var containerClassName: js.UndefOr[String] = js.native
  var document: js.UndefOr[Document] = js.native
  var innerRef: js.UndefOr[Ref[HTMLElement | SVGElement | ComponentType[js.Object]]] = js.native
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
}

object ModalContainerProps {
  @scala.inline
  def apply(): ModalContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalContainerProps]
  }
  @scala.inline
  implicit class ModalContainerPropsOps[Self <: ModalContainerProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAs(value: ReactType[_]): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClipped(value: Boolean): Self = this.set("clipped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipped: Self = this.set("clipped", js.undefined)
    @scala.inline
    def setCloseOnBlur(value: Boolean): Self = this.set("closeOnBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnBlur: Self = this.set("closeOnBlur", js.undefined)
    @scala.inline
    def setCloseOnEsc(value: Boolean): Self = this.set("closeOnEsc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnEsc: Self = this.set("closeOnEsc", js.undefined)
    @scala.inline
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    @scala.inline
    def setDocument(value: Document): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ (HTMLElement | SVGElement | ComponentType[js.Object]) | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInnerRef(value: Ref[HTMLElement | SVGElement | ComponentType[js.Object]]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
  }
  
}

