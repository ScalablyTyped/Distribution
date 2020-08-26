package typings.semanticUiModal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.Modal.SelectorSettings._Impl, 'close'> */
@js.native
trait PickImplclose extends js.Object {
  var close: String = js.native
}

object PickImplclose {
  @scala.inline
  def apply(close: String): PickImplclose = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplclose]
  }
  @scala.inline
  implicit class PickImplcloseOps[Self <: PickImplclose] (val x: Self) extends AnyVal {
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
    def setClose(value: String): Self = this.set("close", value.asInstanceOf[js.Any])
  }
  
}

