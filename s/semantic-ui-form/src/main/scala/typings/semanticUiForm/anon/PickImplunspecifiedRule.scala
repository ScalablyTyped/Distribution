package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.TextSettings._Impl, 'unspecifiedRule'> */
@js.native
trait PickImplunspecifiedRule extends js.Object {
  var unspecifiedRule: String = js.native
}

object PickImplunspecifiedRule {
  @scala.inline
  def apply(unspecifiedRule: String): PickImplunspecifiedRule = {
    val __obj = js.Dynamic.literal(unspecifiedRule = unspecifiedRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplunspecifiedRule]
  }
  @scala.inline
  implicit class PickImplunspecifiedRuleOps[Self <: PickImplunspecifiedRule] (val x: Self) extends AnyVal {
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
    def setUnspecifiedRule(value: String): Self = this.set("unspecifiedRule", value.asInstanceOf[js.Any])
  }
  
}

