package typings
package atPulumiAwsLib.wafregionalRuleGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleGroupArgs extends js.Object {
  /**
    * A list of activated rules, see below
    */
  val activatedRules: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ActionPriorityRuleId]]
    ]
  ] = js.undefined
  /**
    * A friendly name for the metrics from the rule group
    */
  val metricName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A friendly name of the rule group
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object RuleGroupArgs {
  @scala.inline
  def apply(
    metricName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    activatedRules: atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ActionPriorityRuleId]]
    ] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): RuleGroupArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (activatedRules != null) __obj.updateDynamic("activatedRules")(activatedRules.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupArgs]
  }
}

