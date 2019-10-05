package typings.atPulumiAws.typesOutputMod.wafregional

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAclRule extends js.Object {
  /**
    * Configuration block of the action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule.  Not used if `type` is `GROUP`. Detailed below.
    */
  var action: js.UndefOr[WebAclRuleAction] = js.undefined
  /**
    * Configuration block of the override the action that a group requests CloudFront or AWS WAF takes when a web request matches the conditions in the rule.  Only used if `type` is `GROUP`. Detailed below.
    */
  var overrideAction: js.UndefOr[WebAclRuleOverrideAction] = js.undefined
  /**
    * Specifies the order in which the rules in a WebACL are evaluated.
    * Rules with a lower value are evaluated before rules with a higher value.
    */
  var priority: Double
  /**
    * ID of the associated WAF (Regional) rule (e.g. [`aws.wafregional.Rule`](https://www.terraform.io/docs/providers/aws/r/wafregional_rule.html)). WAF (Global) rules cannot be used.
    */
  var ruleId: String
  /**
    * Specifies how you want AWS WAF Regional to respond to requests that match the settings in a rule. e.g. `ALLOW`, `BLOCK` or `COUNT`
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

