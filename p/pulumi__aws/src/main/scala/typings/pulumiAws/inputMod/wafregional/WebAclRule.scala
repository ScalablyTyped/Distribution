package typings.pulumiAws.inputMod.wafregional

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRule extends StObject {
  
  /**
    * Configuration block of the action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule.  Not used if `type` is `GROUP`. Detailed below.
    */
  var action: js.UndefOr[Input[WebAclRuleAction]] = js.undefined
  
  /**
    * Configuration block of the override the action that a group requests CloudFront or AWS WAF takes when a web request matches the conditions in the rule.  Only used if `type` is `GROUP`. Detailed below.
    */
  var overrideAction: js.UndefOr[Input[WebAclRuleOverrideAction]] = js.undefined
  
  /**
    * Specifies the order in which the rules in a WebACL are evaluated.
    * Rules with a lower value are evaluated before rules with a higher value.
    */
  var priority: Input[Double]
  
  /**
    * ID of the associated WAF (Regional) rule (e.g. `aws.wafregional.Rule`). WAF (Global) rules cannot be used.
    */
  var ruleId: Input[String]
  
  /**
    * Specifies how you want AWS WAF Regional to respond to requests that match the settings in a rule. e.g. `ALLOW`, `BLOCK` or `COUNT`
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}
object WebAclRule {
  
  inline def apply(priority: Input[Double], ruleId: Input[String]): WebAclRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRule]
  }
  
  extension [Self <: WebAclRule](x: Self) {
    
    inline def setAction(value: Input[WebAclRuleAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setOverrideAction(value: Input[WebAclRuleOverrideAction]): Self = StObject.set(x, "overrideAction", value.asInstanceOf[js.Any])
    
    inline def setOverrideActionUndefined: Self = StObject.set(x, "overrideAction", js.undefined)
    
    inline def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: Input[String]): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
