package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'exactLength'> */
@js.native
trait PickImplexactLength extends js.Object {
  var exactLength: String = js.native
}

object PickImplexactLength {
  @scala.inline
  def apply(exactLength: String): PickImplexactLength = {
    val __obj = js.Dynamic.literal(exactLength = exactLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplexactLength]
  }
  @scala.inline
  implicit class PickImplexactLengthOps[Self <: PickImplexactLength] (val x: Self) extends AnyVal {
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
    def setExactLength(value: String): Self = this.set("exactLength", value.asInstanceOf[js.Any])
  }
  
}

