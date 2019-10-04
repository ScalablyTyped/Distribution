package typings.atPulumiAws.typesOutputMod.wafregionalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleGroupActivatedRule extends js.Object {
  /**
    * Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule.
    */
  var action: RuleGroupActivatedRuleAction
  /**
    * Specifies the order in which the rules are evaluated. Rules with a lower value are evaluated before rules with a higher value.
    */
  var priority: Double
  /**
    * The ID of a [rule](https://www.terraform.io/docs/providers/aws/r/wafregional_rule.html)
    */
  var ruleId: String
  /**
    * The rule type, either [`REGULAR`](https://www.terraform.io/docs/providers/aws/r/wafregional_rule.html), [`RATE_BASED`](https://www.terraform.io/docs/providers/aws/r/wafregional_rate_based_rule.html), or `GROUP`. Defaults to `REGULAR`.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object RuleGroupActivatedRule {
  @scala.inline
  def apply(action: RuleGroupActivatedRuleAction, priority: Double, ruleId: String, `type`: String = null): RuleGroupActivatedRule = {
    val __obj = js.Dynamic.literal(action = action, priority = priority, ruleId = ruleId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RuleGroupActivatedRule]
  }
}

