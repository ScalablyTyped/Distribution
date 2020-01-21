package typings.pulumiAws.inputMod.applicationloadbalancing

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerRuleConditionQueryString extends js.Object {
  /**
    * Query string key pattern to match.
    */
  var key: js.UndefOr[Input[String]] = js.native
  /**
    * Query string value pattern to match.
    */
  var value: Input[String] = js.native
}

object ListenerRuleConditionQueryString {
  @scala.inline
  def apply(value: Input[String], key: Input[String] = null): ListenerRuleConditionQueryString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleConditionQueryString]
  }
}

