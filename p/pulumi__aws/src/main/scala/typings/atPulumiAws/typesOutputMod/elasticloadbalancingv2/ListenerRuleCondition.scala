package typings.atPulumiAws.typesOutputMod.elasticloadbalancingv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerRuleCondition extends js.Object {
  /**
    * The name of the field. Must be one of `path-pattern` for path based routing or `host-header` for host based routing.
    */
  var field: js.UndefOr[String] = js.undefined
  /**
    * The path patterns to match. A maximum of 1 can be defined.
    */
  var values: js.UndefOr[String] = js.undefined
}

object ListenerRuleCondition {
  @scala.inline
  def apply(field: String = null, values: String = null): ListenerRuleCondition = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[ListenerRuleCondition]
  }
}

