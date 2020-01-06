package typings.atPulumiAws.wafregionalRateBasedRuleMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.wafregional.RateBasedRulePredicate
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateBasedRuleState extends js.Object {
  /**
    * The ARN of the WAF Regional Rate Based Rule.
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
  val predicates: js.UndefOr[Input[js.Array[Input[RateBasedRulePredicate]]]] = js.native
  /**
    * Valid value is IP.
    */
  val rateKey: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. Minimum value is 100.
    */
  val rateLimit: js.UndefOr[Input[Double]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object RateBasedRuleState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    metricName: Input[String] = null,
    name: Input[String] = null,
    predicates: Input[js.Array[Input[RateBasedRulePredicate]]] = null,
    rateKey: Input[String] = null,
    rateLimit: Input[Double] = null,
    tags: Input[StringDictionary[_]] = null
  ): RateBasedRuleState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (predicates != null) __obj.updateDynamic("predicates")(predicates.asInstanceOf[js.Any])
    if (rateKey != null) __obj.updateDynamic("rateKey")(rateKey.asInstanceOf[js.Any])
    if (rateLimit != null) __obj.updateDynamic("rateLimit")(rateLimit.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateBasedRuleState]
  }
}

