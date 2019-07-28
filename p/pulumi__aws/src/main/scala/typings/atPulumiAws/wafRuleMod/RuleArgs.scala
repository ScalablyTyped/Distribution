package typings.atPulumiAws.wafRuleMod

import typings.atPulumiAws.Anon_DataIdNegated
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleArgs extends js.Object {
  /**
    * The name or description for the Amazon CloudWatch metric of this rule. The name can contain only alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace.
    */
  val metricName: Input[String]
  /**
    * The name or description of the rule.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The objects to include in a rule (documented below).
    */
  val predicates: js.UndefOr[Input[js.Array[Input[Anon_DataIdNegated]]]] = js.undefined
}

object RuleArgs {
  @scala.inline
  def apply(
    metricName: Input[String],
    name: Input[String] = null,
    predicates: Input[js.Array[Input[Anon_DataIdNegated]]] = null
  ): RuleArgs = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (predicates != null) __obj.updateDynamic("predicates")(predicates.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleArgs]
  }
}

