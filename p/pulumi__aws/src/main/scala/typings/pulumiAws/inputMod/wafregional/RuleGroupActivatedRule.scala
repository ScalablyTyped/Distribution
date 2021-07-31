package typings.pulumiAws.inputMod.wafregional

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupActivatedRule extends StObject {
  
  /**
    * Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule.
    */
  var action: Input[RuleGroupActivatedRuleAction]
  
  /**
    * Specifies the order in which the rules are evaluated. Rules with a lower value are evaluated before rules with a higher value.
    */
  var priority: Input[Double]
  
  /**
    * The ID of a `wafRegionalRule`
    */
  var ruleId: Input[String]
  
  /**
    * The rule type, either `REGULAR`, `RATE_BASED`, or `GROUP`. Defaults to `REGULAR`.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}
object RuleGroupActivatedRule {
  
  @scala.inline
  def apply(action: Input[RuleGroupActivatedRuleAction], priority: Input[Double], ruleId: Input[String]): RuleGroupActivatedRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupActivatedRule]
  }
  
  @scala.inline
  implicit class RuleGroupActivatedRuleMutableBuilder[Self <: RuleGroupActivatedRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Input[RuleGroupActivatedRuleAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleId(value: Input[String]): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
