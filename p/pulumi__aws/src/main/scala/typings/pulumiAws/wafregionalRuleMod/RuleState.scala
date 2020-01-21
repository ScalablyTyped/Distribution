package typings.pulumiAws.wafregionalRuleMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.wafregional.RulePredicate
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleState extends js.Object {
  /**
    * The ARN of the WAF Regional Rule.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The name or description for the Amazon CloudWatch metric of this rule.
    */
  val metricName: js.UndefOr[Input[String]] = js.native
  /**
    * The name or description of the rule.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The objects to include in a rule (documented below).
    */
  val predicates: js.UndefOr[Input[js.Array[Input[RulePredicate]]]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object RuleState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    metricName: Input[String] = null,
    name: Input[String] = null,
    predicates: Input[js.Array[Input[RulePredicate]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): RuleState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (predicates != null) __obj.updateDynamic("predicates")(predicates.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleState]
  }
}

