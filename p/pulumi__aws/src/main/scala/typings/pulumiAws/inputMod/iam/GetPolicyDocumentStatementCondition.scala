package typings.pulumiAws.inputMod.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyDocumentStatementCondition extends js.Object {
  /**
    * The name of the
    * [IAM condition operator](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition_operators.html)
    * to evaluate.
    */
  var test: String = js.native
  /**
    * The values to evaluate the condition against. If multiple
    * values are provided, the condition matches if at least one of them applies.
    * (That is, the tests are combined with the "OR" boolean operation.)
    */
  var values: js.Array[String] = js.native
  /**
    * The name of a
    * [Context Variable](http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html#AvailableKeys)
    * to apply the condition to. Context variables may either be standard AWS
    * variables starting with `aws:`, or service-specific variables prefixed with
    * the service name.
    */
  var variable: String = js.native
}

object GetPolicyDocumentStatementCondition {
  @scala.inline
  def apply(test: String, values: js.Array[String], variable: String): GetPolicyDocumentStatementCondition = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetPolicyDocumentStatementCondition]
  }
}

