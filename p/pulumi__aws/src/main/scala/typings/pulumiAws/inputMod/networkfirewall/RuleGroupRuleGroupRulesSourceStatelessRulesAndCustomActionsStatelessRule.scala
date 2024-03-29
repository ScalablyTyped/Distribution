package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRule extends StObject {
  
  /**
    * A setting that indicates the order in which to run this rule relative to all of the rules that are defined for a stateless rule group. AWS Network Firewall evaluates the rules in a rule group starting with the lowest priority setting.
    */
  var priority: Input[Double]
  
  /**
    * A configuration block defining the stateless 5-tuple packet inspection criteria and the action to take on a packet that matches the criteria. See Rule Definition below for details.
    */
  var ruleDefinition: Input[
    RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinition
  ]
}
object RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRule {
  
  inline def apply(
    priority: Input[Double],
    ruleDefinition: Input[
      RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinition
    ]
  ): RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], ruleDefinition = ruleDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRule]
  }
  
  extension [Self <: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRule](x: Self) {
    
    inline def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setRuleDefinition(
      value: Input[
          RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinition
        ]
    ): Self = StObject.set(x, "ruleDefinition", value.asInstanceOf[js.Any])
  }
}
