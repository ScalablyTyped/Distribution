package typings.atPulumiAws.wafregionalRuleGroupMod

import typings.atPulumiAws.typesInputMod.wafregionalNs.RuleGroupActivatedRule
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleGroupState extends js.Object {
  /**
    * A list of activated rules, see below
    */
  val activatedRules: js.UndefOr[Input[js.Array[Input[RuleGroupActivatedRule]]]] = js.undefined
  /**
    * A friendly name for the metrics from the rule group
    */
  val metricName: js.UndefOr[Input[String]] = js.undefined
  /**
    * A friendly name of the rule group
    */
  val name: js.UndefOr[Input[String]] = js.undefined
}

object RuleGroupState {
  @scala.inline
  def apply(
    activatedRules: Input[js.Array[Input[RuleGroupActivatedRule]]] = null,
    metricName: Input[String] = null,
    name: Input[String] = null
  ): RuleGroupState = {
    val __obj = js.Dynamic.literal()
    if (activatedRules != null) __obj.updateDynamic("activatedRules")(activatedRules.asInstanceOf[js.Any])
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupState]
  }
}

