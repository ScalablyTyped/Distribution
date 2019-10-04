package typings.atPulumiAws.typesOutputMod.wafNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAclRule extends js.Object {
  /**
    * The action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule. Not used if `type` is `GROUP`.
    */
  var action: js.UndefOr[WebAclRuleAction] = js.undefined
  /**
    * Override the action that a group requests CloudFront or AWS WAF takes when a web request matches the conditions in the rule. Only used if `type` is `GROUP`.
    */
  var overrideAction: js.UndefOr[WebAclRuleOverrideAction] = js.undefined
  /**
    * Specifies the order in which the rules in a WebACL are evaluated.
    * Rules with a lower value are evaluated before rules with a higher value.
    */
  var priority: Double
  /**
    * ID of the associated WAF (Global) rule (e.g. [`aws.waf.Rule`](https://www.terraform.io/docs/providers/aws/r/waf_rule.html)). WAF (Regional) rules cannot be used.
    */
  var ruleId: String
  /**
    * The rule type, either `REGULAR`, as defined by [Rule](http://docs.aws.amazon.com/waf/latest/APIReference/API_Rule.html), `RATE_BASED`, as defined by [RateBasedRule](http://docs.aws.amazon.com/waf/latest/APIReference/API_RateBasedRule.html), or `GROUP`, as defined by [RuleGroup](https://docs.aws.amazon.com/waf/latest/APIReference/API_RuleGroup.html). The default is REGULAR. If you add a RATE_BASED rule, you need to set `type` as `RATE_BASED`. If you add a GROUP rule, you need to set `type` as `GROUP`.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object WebAclRule {
  @scala.inline
  def apply(
    priority: Double,
    ruleId: String,
    action: WebAclRuleAction = null,
    overrideAction: WebAclRuleOverrideAction = null,
    `type`: String = null
  ): WebAclRule = {
    val __obj = js.Dynamic.literal(priority = priority, ruleId = ruleId)
    if (action != null) __obj.updateDynamic("action")(action)
    if (overrideAction != null) __obj.updateDynamic("overrideAction")(overrideAction)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WebAclRule]
  }
}

