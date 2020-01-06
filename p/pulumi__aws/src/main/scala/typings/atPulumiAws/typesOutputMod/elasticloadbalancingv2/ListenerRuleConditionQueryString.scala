package typings.atPulumiAws.typesOutputMod.elasticloadbalancingv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerRuleConditionQueryString extends js.Object {
  /**
    * Query string key pattern to match.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Query string value pattern to match.
    */
  var value: String = js.native
}

object ListenerRuleConditionQueryString {
  @scala.inline
  def apply(value: String, key: String = null): ListenerRuleConditionQueryString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleConditionQueryString]
  }
}

