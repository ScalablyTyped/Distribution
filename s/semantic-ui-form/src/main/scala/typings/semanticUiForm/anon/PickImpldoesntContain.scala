package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'doesntContain'> */
@js.native
trait PickImpldoesntContain extends js.Object {
  var doesntContain: String = js.native
}

object PickImpldoesntContain {
  @scala.inline
  def apply(doesntContain: String): PickImpldoesntContain = {
    val __obj = js.Dynamic.literal(doesntContain = doesntContain.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldoesntContain]
  }
  @scala.inline
  implicit class PickImpldoesntContainOps[Self <: PickImpldoesntContain] (val x: Self) extends AnyVal {
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
    def setDoesntContain(value: String): Self = this.set("doesntContain", value.asInstanceOf[js.Any])
  }
  
}

