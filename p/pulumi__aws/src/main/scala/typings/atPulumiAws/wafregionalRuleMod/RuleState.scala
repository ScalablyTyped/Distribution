package typings.atPulumiAws.wafregionalRuleMod

import typings.atPulumiAws.typesInputMod.wafregional.RulePredicate
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleState extends js.Object {
  /**
    * The name or description for the Amazon CloudWatch metric of this rule.
    */
  val metricName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name or description of the rule.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The objects to include in a rule (documented below).
    */
  val predicates: js.UndefOr[Input[js.Array[Input[RulePredicate]]]] = js.undefined
}

object RuleState {
  @scala.inline
  def apply(
    metricName: Input[String] = null,
    name: Input[String] = null,
    predicates: Input[js.Array[Input[RulePredicate]]] = null
  ): RuleState = {
    val __obj = js.Dynamic.literal()
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (predicates != null) __obj.updateDynamic("predicates")(predicates.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleState]
  }
}

