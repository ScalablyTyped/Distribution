package typings.atPulumiAws.wafregionalRuleGroupMod

import typings.atPulumiAws.typesInputMod.wafregional.RuleGroupActivatedRule
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleGroupArgs extends js.Object {
  /**
    * A list of activated rules, see below
    */
  val activatedRules: js.UndefOr[Input[js.Array[Input[RuleGroupActivatedRule]]]] = js.undefined
  /**
    * A friendly name for the metrics from the rule group
    */
  val metricName: Input[String]
  /**
    * A friendly name of the rule group
    */
  val name: js.UndefOr[Input[String]] = js.undefined
}

object RuleGroupArgs {
  @scala.inline
  def apply(
    metricName: Input[String],
    activatedRules: Input[js.Array[Input[RuleGroupActivatedRule]]] = null,
    name: Input[String] = null
  ): RuleGroupArgs = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any])
    if (activatedRules != null) __obj.updateDynamic("activatedRules")(activatedRules.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupArgs]
  }
}

