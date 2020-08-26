package typings.semanticUiModal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-modal.SemanticUI.Modal.SelectorSettings._Impl, keyof semantic-ui-modal.SemanticUI.Modal.SelectorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplApprove extends js.Object {
  var approve: js.UndefOr[String] = js.native
  var close: js.UndefOr[String] = js.native
  var deny: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplApprove {
  @scala.inline
  def apply(): PartialPickImplkeyofImplApprove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplApprove]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplApproveOps[Self <: PartialPickImplkeyofImplApprove] (val x: Self) extends AnyVal {
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
    def setApprove(value: String): Self = this.set("approve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprove: Self = this.set("approve", js.undefined)
    @scala.inline
    def setClose(value: String): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setDeny(value: String): Self = this.set("deny", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeny: Self = this.set("deny", js.undefined)
  }
  
}

