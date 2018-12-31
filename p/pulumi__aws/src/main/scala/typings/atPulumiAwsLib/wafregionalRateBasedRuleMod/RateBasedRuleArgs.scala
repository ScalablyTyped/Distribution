package typings
package atPulumiAwsLib.wafregionalRateBasedRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateBasedRuleArgs extends js.Object {
  /**
    * The name or description for the Amazon CloudWatch metric of this rule.
    */
  val metricName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The name or description of the rule.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * One of ByteMatchSet, IPSet, SizeConstraintSet, SqlInjectionMatchSet, or XssMatchSet objects to include in a rule.
    */
  val predicates: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_Type]]]
  ] = js.undefined
  /**
    * Valid value is IP.
    */
  val rateKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. Minimum value is 2000.
    */
  val rateLimit: atPulumiPulumiLib.resourceMod.Input[scala.Double]
}

