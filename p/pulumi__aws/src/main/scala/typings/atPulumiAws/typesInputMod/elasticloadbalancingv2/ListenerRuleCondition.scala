package typings.atPulumiAws.typesInputMod.elasticloadbalancingv2

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerRuleCondition extends js.Object {
  /**
    * The name of the field. Must be one of `path-pattern` for path based routing or `host-header` for host based routing.
    */
  var field: js.UndefOr[Input[String]] = js.undefined
  /**
    * The path patterns to match. A maximum of 1 can be defined.
    */
  var values: js.UndefOr[Input[String]] = js.undefined
}

object ListenerRuleCondition {
  @scala.inline
  def apply(field: Input[String] = null, values: Input[String] = null): ListenerRuleCondition = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleCondition]
  }
}

