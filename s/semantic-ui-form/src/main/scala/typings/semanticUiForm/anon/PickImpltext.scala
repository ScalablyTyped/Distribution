package typings.semanticUiForm.anon

import typings.semanticUiForm.SemanticUI.Form.TextSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'text'> */
@js.native
trait PickImpltext extends js.Object {
  var text: TextSettings = js.native
}

object PickImpltext {
  @scala.inline
  def apply(text: TextSettings): PickImpltext = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltext]
  }
  @scala.inline
  implicit class PickImpltextOps[Self <: PickImpltext] (val x: Self) extends AnyVal {
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
    def setText(value: TextSettings): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

