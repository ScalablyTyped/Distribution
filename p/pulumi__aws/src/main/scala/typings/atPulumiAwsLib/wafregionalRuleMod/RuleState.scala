package typings
package atPulumiAwsLib.wafregionalRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleState extends js.Object {
  /**
    * The name or description for the Amazon CloudWatch metric of this rule.
    */
  val metricName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name or description of the rule.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The objects to include in a rule.
    */
  val predicates: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DataIdNegated]]]
  ] = js.undefined
}

