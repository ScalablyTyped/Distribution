package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRule extends StObject {
  
  /**
    * The action that AWS WAF should take on a web request when it matches the rule's statement. Settings at the `aws.wafv2.WebAcl` level can override the rule action setting. See Action below for details.
    */
  var action: RuleGroupRuleAction
  
  /**
    * A friendly name of the rule.
    */
  var name: String
  
  /**
    * If you define more than one Rule in a WebACL, AWS WAF evaluates each request against the `rules` in order based on the value of `priority`. AWS WAF processes rules with lower priority first.
    */
  var priority: Double
  
  /**
    * The AWS WAF processing statement for the rule, for example `byteMatchStatement` or `geoMatchStatement`. See Statement below for details.
    */
  var statement: RuleGroupRuleStatement
  
  /**
    * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
    */
  var visibilityConfig: RuleGroupRuleVisibilityConfig
}
object RuleGroupRule {
  
  inline def apply(
    action: RuleGroupRuleAction,
    name: String,
    priority: Double,
    statement: RuleGroupRuleStatement,
    visibilityConfig: RuleGroupRuleVisibilityConfig
  ): RuleGroupRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], statement = statement.asInstanceOf[js.Any], visibilityConfig = visibilityConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRule]
  }
  
  extension [Self <: RuleGroupRule](x: Self) {
    
    inline def setAction(value: RuleGroupRuleAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setStatement(value: RuleGroupRuleStatement): Self = StObject.set(x, "statement", value.asInstanceOf[js.Any])
    
    inline def setVisibilityConfig(value: RuleGroupRuleVisibilityConfig): Self = StObject.set(x, "visibilityConfig", value.asInstanceOf[js.Any])
  }
}
