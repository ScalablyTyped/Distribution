package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionPriorityRuleId extends js.Object {
  var action: atPulumiPulumiLib.outputMod.Input[Anon_TypeInput]
  var priority: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var ruleId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var `type`: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_ActionPriorityRuleId {
  @scala.inline
  def apply(
    action: atPulumiPulumiLib.outputMod.Input[Anon_TypeInput],
    priority: atPulumiPulumiLib.outputMod.Input[scala.Double],
    ruleId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_ActionPriorityRuleId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.updateDynamic("ruleId")(ruleId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActionPriorityRuleId]
  }
}

