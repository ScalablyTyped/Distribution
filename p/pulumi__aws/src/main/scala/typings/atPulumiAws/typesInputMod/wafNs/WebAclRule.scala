package typings.atPulumiAws.typesInputMod.wafNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAclRule extends js.Object {
  /**
    * The action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule. Not used if `type` is `GROUP`.
    */
  var action: js.UndefOr[Input[WebAclRuleAction]] = js.undefined
  /**
    * Override the action that a group requests CloudFront or AWS WAF takes when a web request matches the conditions in the rule. Only used if `type` is `GROUP`.
    */
  var overrideAction: js.UndefOr[Input[WebAclRuleOverrideAction]] = js.undefined
  /**
    * Specifies the order in which the rules in a WebACL are evaluated.
    * Rules with a lower value are evaluated before rules with a higher value.
    */
  var priority: Input[Double]
  /**
    * ID of the associated WAF (Global) rule (e.g. [`aws.waf.Rule`](https://www.terraform.io/docs/providers/aws/r/waf_rule.html)). WAF (Regional) rules cannot be used.
    */
  var ruleId: Input[String]
  /**
    * The rule type, either `REGULAR`, as defined by [Rule](http://docs.aws.amazon.com/waf/latest/APIReference/API_Rule.html), `RATE_BASED`, as defined by [RateBasedRule](http://docs.aws.amazon.com/waf/latest/APIReference/API_RateBasedRule.html), or `GROUP`, as defined by [RuleGroup](https://docs.aws.amazon.com/waf/latest/APIReference/API_RuleGroup.html). The default is REGULAR. If you add a RATE_BASED rule, you need to set `type` as `RATE_BASED`. If you add a GROUP rule, you need to set `type` as `GROUP`.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object WebAclRule {
  @scala.inline
  def apply(
    priority: Input[Double],
    ruleId: Input[String],
    action: Input[WebAclRuleAction] = null,
    overrideAction: Input[WebAclRuleOverrideAction] = null,
    `type`: Input[String] = null
  ): WebAclRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (overrideAction != null) __obj.updateDynamic("overrideAction")(overrideAction.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRule]
  }
}

