package typings.pulumiAws.inputMod.applicationloadbalancing

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerRuleConditionHostHeader extends js.Object {
  /**
    * List of exactly one pattern to match. Required when `field` is set.
    */
  var values: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object ListenerRuleConditionHostHeader {
  @scala.inline
  def apply(values: Input[js.Array[Input[String]]] = null): ListenerRuleConditionHostHeader = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleConditionHostHeader]
  }
}

