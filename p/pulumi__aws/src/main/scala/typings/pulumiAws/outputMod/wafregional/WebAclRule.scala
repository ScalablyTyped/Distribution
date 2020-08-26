package typings.pulumiAws.outputMod.wafregional

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAclRule extends js.Object {
  /**
    * Configuration block of the action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule.  Not used if `type` is `GROUP`. Detailed below.
    */
  var action: js.UndefOr[WebAclRuleAction] = js.native
  /**
    * Configuration block of the override the action that a group requests CloudFront or AWS WAF takes when a web request matches the conditions in the rule.  Only used if `type` is `GROUP`. Detailed below.
    */
  var overrideAction: js.UndefOr[WebAclRuleOverrideAction] = js.native
  /**
    * Specifies the order in which the rules in a WebACL are evaluated.
    * Rules with a lower value are evaluated before rules with a higher value.
    */
  var priority: Double = js.native
  /**
    * ID of the associated WAF (Regional) rule (e.g. `aws.wafregional.Rule`). WAF (Global) rules cannot be used.
    */
  var ruleId: String = js.native
  /**
    * Specifies how you want AWS WAF Regional to respond to requests that match the settings in a rule. e.g. `ALLOW`, `BLOCK` or `COUNT`
    */
  var `type`: js.UndefOr[String] = js.native
}

object WebAclRule {
  @scala.inline
  def apply(priority: Double, ruleId: String): WebAclRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRule]
  }
  @scala.inline
  implicit class WebAclRuleOps[Self <: WebAclRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleId(value: String): Self = this.set("ruleId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAction(value: WebAclRuleAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setOverrideAction(value: WebAclRuleOverrideAction): Self = this.set("overrideAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrideAction: Self = this.set("overrideAction", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

