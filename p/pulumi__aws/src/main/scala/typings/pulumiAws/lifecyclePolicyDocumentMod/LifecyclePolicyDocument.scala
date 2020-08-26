package typings.pulumiAws.lifecyclePolicyDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicyDocument extends js.Object {
  var rules: js.Array[PolicyRule] = js.native
}

object LifecyclePolicyDocument {
  @scala.inline
  def apply(rules: js.Array[PolicyRule]): LifecyclePolicyDocument = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyDocument]
  }
  @scala.inline
  implicit class LifecyclePolicyDocumentOps[Self <: LifecyclePolicyDocument] (val x: Self) extends AnyVal {
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
    def setRulesVarargs(value: PolicyRule*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[PolicyRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
  }
  
}

