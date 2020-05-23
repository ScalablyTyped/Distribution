package typings.semanticUiModal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-modal.SemanticUI.Modal.SelectorSettings._Impl, keyof semantic-ui-modal.SemanticUI.Modal.SelectorSettings._Impl>> */
trait PartialPickImplkeyofImplApprove extends js.Object {
  var approve: js.UndefOr[String] = js.undefined
  var close: js.UndefOr[String] = js.undefined
  var deny: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplApprove {
  @scala.inline
  def apply(approve: String = null, close: String = null, deny: String = null): PartialPickImplkeyofImplApprove = {
    val __obj = js.Dynamic.literal()
    if (approve != null) __obj.updateDynamic("approve")(approve.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (deny != null) __obj.updateDynamic("deny")(deny.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplApprove]
  }
}

