package typings.pulumiAws.outputMod.waf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleGroupActivatedRule extends js.Object {
  /**
    * Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule.
    */
  var action: RuleGroupActivatedRuleAction = js.native
  /**
    * Specifies the order in which the rules are evaluated. Rules with a lower value are evaluated before rules with a higher value.
    */
  var priority: Double = js.native
  /**
    * The ID of a `wafRule`
    */
  var ruleId: String = js.native
  /**
    * The rule type, either `REGULAR`, `RATE_BASED`, or `GROUP`. Defaults to `REGULAR`.
    */
  var `type`: js.UndefOr[String] = js.native
}

object RuleGroupActivatedRule {
  @scala.inline
  def apply(action: RuleGroupActivatedRuleAction, priority: Double, ruleId: String): RuleGroupActivatedRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupActivatedRule]
  }
  @scala.inline
  implicit class RuleGroupActivatedRuleOps[Self <: RuleGroupActivatedRule] (val x: Self) extends AnyVal {
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
    def setAction(value: RuleGroupActivatedRuleAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleId(value: String): Self = this.set("ruleId", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

