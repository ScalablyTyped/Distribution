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
}

