package typings
package atPulumiAwsLib.wafRuleGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleGroupArgs extends js.Object {
  /**
    * A list of activated rules, see below
    */
  val activatedRules: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_Action]]]
  ] = js.undefined
  /**
    * A friendly name for the metrics from the rule group
    */
  val metricName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * A friendly name of the rule group
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

