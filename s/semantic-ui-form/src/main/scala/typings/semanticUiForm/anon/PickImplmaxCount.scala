package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'maxCount'> */
@js.native
trait PickImplmaxCount extends js.Object {
  var maxCount: String = js.native
}

object PickImplmaxCount {
  @scala.inline
  def apply(maxCount: String): PickImplmaxCount = {
    val __obj = js.Dynamic.literal(maxCount = maxCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmaxCount]
  }
  @scala.inline
  implicit class PickImplmaxCountOps[Self <: PickImplmaxCount] (val x: Self) extends AnyVal {
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
    def setMaxCount(value: String): Self = this.set("maxCount", value.asInstanceOf[js.Any])
  }
  
}

