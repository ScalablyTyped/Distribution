package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionPriorityRuleId extends js.Object {
  var action: Input[Anon_TypeInputString]
  var priority: Input[Double]
  var ruleId: Input[String]
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object Anon_ActionPriorityRuleId {
  @scala.inline
  def apply(
    action: Input[Anon_TypeInputString],
    priority: Input[Double],
    ruleId: Input[String],
    `type`: Input[String] = null
  ): Anon_ActionPriorityRuleId = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActionPriorityRuleId]
  }
}

