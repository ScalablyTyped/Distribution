package typings.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRule extends StObject {
  
  /**
    * A setting that indicates the order in which to run this rule relative to all of the rules that are defined for a stateless rule group. AWS Network Firewall evaluates the rules in a rule group starting with the lowest priority setting.
    */
  var priority: Double
  
  /**
    * A configuration block defining the stateless 5-tuple packet inspection criteria and the action to take on a packet that matches the criteria. See Rule Definition below for details.
    */
  var ruleDefinition: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinition
}
object RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRule {
  
  inline def apply(
    priority: Double,
    ruleDefinition: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinition
  ): RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], ruleDefinition = ruleDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRule]
  }
  
  extension [Self <: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRule](x: Self) {
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setRuleDefinition(value: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinition): Self = StObject.set(x, "ruleDefinition", value.asInstanceOf[js.Any])
  }
}
