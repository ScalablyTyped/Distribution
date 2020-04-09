package typings.pulumiAws.inputMod.elasticloadbalancingv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerRuleConditionHttpRequestMethod extends js.Object {
  /**
    * List of exactly one pattern to match. Required when `field` is set.
    */
  var values: Input[js.Array[Input[String]]] = js.native
}

object ListenerRuleConditionHttpRequestMethod {
  @scala.inline
  def apply(values: Input[js.Array[Input[String]]]): ListenerRuleConditionHttpRequestMethod = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListenerRuleConditionHttpRequestMethod]
  }
}

