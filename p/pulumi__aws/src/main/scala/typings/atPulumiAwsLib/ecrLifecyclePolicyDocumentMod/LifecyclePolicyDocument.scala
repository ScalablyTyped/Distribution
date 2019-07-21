package typings
package atPulumiAwsLib.ecrLifecyclePolicyDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecyclePolicyDocument extends js.Object {
  var rules: js.Array[PolicyRule]
}

object LifecyclePolicyDocument {
  @scala.inline
  def apply(rules: js.Array[PolicyRule]): LifecyclePolicyDocument = {
    val __obj = js.Dynamic.literal(rules = rules)
  
    __obj.asInstanceOf[LifecyclePolicyDocument]
  }
}

