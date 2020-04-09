package typings.pulumiAws.inputMod.lb

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerRuleConditionPathPattern extends js.Object {
  /**
    * List of exactly one pattern to match. Required when `field` is set.
    */
  var values: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object ListenerRuleConditionPathPattern {
  @scala.inline
  def apply(values: Input[js.Array[Input[String]]] = null): ListenerRuleConditionPathPattern = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleConditionPathPattern]
  }
}

