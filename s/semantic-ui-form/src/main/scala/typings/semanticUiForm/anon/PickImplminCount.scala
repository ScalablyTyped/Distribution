package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'minCount'> */
@js.native
trait PickImplminCount extends js.Object {
  var minCount: String = js.native
}

object PickImplminCount {
  @scala.inline
  def apply(minCount: String): PickImplminCount = {
    val __obj = js.Dynamic.literal(minCount = minCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplminCount]
  }
  @scala.inline
  implicit class PickImplminCountOps[Self <: PickImplminCount] (val x: Self) extends AnyVal {
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
    def setMinCount(value: String): Self = this.set("minCount", value.asInstanceOf[js.Any])
  }
  
}

