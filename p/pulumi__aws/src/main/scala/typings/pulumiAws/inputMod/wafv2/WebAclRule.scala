package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRule extends StObject {
  
  /**
    * The action that AWS WAF should take on a web request when it matches the rule's statement. This is used only for rules whose **statements do not reference a rule group**. See Action below for details.
    */
  var action: js.UndefOr[Input[WebAclRuleAction]] = js.undefined
  
  /**
    * A friendly name of the rule.
    */
  var name: Input[String]
  
  /**
    * The override action to apply to the rules in a rule group. Used only for rule **statements that reference a rule group**, like `ruleGroupReferenceStatement` and `managedRuleGroupStatement`. See Override Action below for details.
    */
  var overrideAction: js.UndefOr[Input[WebAclRuleOverrideAction]] = js.undefined
  
  /**
    * If you define more than one Rule in a WebACL, AWS WAF evaluates each request against the `rules` in order based on the value of `priority`. AWS WAF processes rules with lower priority first.
    */
  var priority: Input[Double]
  
  /**
    * The AWS WAF processing statement for the rule, for example `byteMatchStatement` or `geoMatchStatement`. See Statement below for details.
    */
  var statement: Input[WebAclRuleStatement]
  
  /**
    * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
    */
  var visibilityConfig: Input[WebAclRuleVisibilityConfig]
}
object WebAclRule {
  
  inline def apply(
    name: Input[String],
    priority: Input[Double],
    statement: Input[WebAclRuleStatement],
    visibilityConfig: Input[WebAclRuleVisibilityConfig]
  ): WebAclRule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], statement = statement.asInstanceOf[js.Any], visibilityConfig = visibilityConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRule]
  }
  
  extension [Self <: WebAclRule](x: Self) {
    
    inline def setAction(value: Input[WebAclRuleAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOverrideAction(value: Input[WebAclRuleOverrideAction]): Self = StObject.set(x, "overrideAction", value.asInstanceOf[js.Any])
    
    inline def setOverrideActionUndefined: Self = StObject.set(x, "overrideAction", js.undefined)
    
    inline def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setStatement(value: Input[WebAclRuleStatement]): Self = StObject.set(x, "statement", value.asInstanceOf[js.Any])
    
    inline def setVisibilityConfig(value: Input[WebAclRuleVisibilityConfig]): Self = StObject.set(x, "visibilityConfig", value.asInstanceOf[js.Any])
  }
}
