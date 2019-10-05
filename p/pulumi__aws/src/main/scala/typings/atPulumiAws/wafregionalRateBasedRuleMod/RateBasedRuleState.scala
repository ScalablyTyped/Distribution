package typings.atPulumiAws.wafregionalRateBasedRuleMod

import typings.atPulumiAws.typesInputMod.wafregional.RateBasedRulePredicate
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateBasedRuleState extends js.Object {
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
  val predicates: js.UndefOr[Input[js.Array[Input[RateBasedRulePredicate]]]] = js.undefined
  /**
    * Valid value is IP.
    */
  val rateKey: js.UndefOr[Input[String]] = js.undefined
  /**
    * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. Minimum value is 100.
    */
  val rateLimit: js.UndefOr[Input[Double]] = js.undefined
}

object RateBasedRuleState {
  @scala.inline
  def apply(
    metricName: Input[String] = null,
    name: Input[String] = null,
    predicates: Input[js.Array[Input[RateBasedRulePredicate]]] = null,
    rateKey: Input[String] = null,
    rateLimit: Input[Double] = null
  ): RateBasedRuleState = {
    val __obj = js.Dynamic.literal()
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (predicates != null) __obj.updateDynamic("predicates")(predicates.asInstanceOf[js.Any])
    if (rateKey != null) __obj.updateDynamic("rateKey")(rateKey.asInstanceOf[js.Any])
    if (rateLimit != null) __obj.updateDynamic("rateLimit")(rateLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateBasedRuleState]
  }
}

