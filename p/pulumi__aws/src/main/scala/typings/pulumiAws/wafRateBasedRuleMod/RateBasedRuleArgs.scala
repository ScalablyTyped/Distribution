package typings.pulumiAws.wafRateBasedRuleMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.waf.RateBasedRulePredicate
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateBasedRuleArgs extends js.Object {
  /**
    * The name or description for the Amazon CloudWatch metric of this rule.
    */
  val metricName: Input[String] = js.native
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
  val rateKey: Input[String] = js.native
  /**
    * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. Minimum value is 100.
    */
  val rateLimit: Input[Double] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object RateBasedRuleArgs {
  @scala.inline
  def apply(
    metricName: Input[String],
    rateKey: Input[String],
    rateLimit: Input[Double],
    name: Input[String] = null,
    predicates: Input[js.Array[Input[RateBasedRulePredicate]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): RateBasedRuleArgs = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], rateKey = rateKey.asInstanceOf[js.Any], rateLimit = rateLimit.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (predicates != null) __obj.updateDynamic("predicates")(predicates.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateBasedRuleArgs]
  }
}

