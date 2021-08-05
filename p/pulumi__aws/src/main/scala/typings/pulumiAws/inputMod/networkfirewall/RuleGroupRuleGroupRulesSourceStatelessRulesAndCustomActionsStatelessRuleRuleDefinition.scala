package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinition extends StObject {
  
  /**
    * Set of actions to take on a packet that matches one of the stateless rule definition's `matchAttributes`. For every rule you must specify 1 standard action, and you can add custom actions. Standard actions include: `aws:pass`, `aws:drop`, `aws:forward_to_sfe`.
    */
  var actions: Input[js.Array[Input[String]]]
  
  /**
    * A configuration block containing criteria for AWS Network Firewall to use to inspect an individual packet in stateless rule inspection. See Match Attributes below for details.
    */
  var matchAttributes: Input[
    RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes
  ]
}
object RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinition {
  
  inline def apply(
    actions: Input[js.Array[Input[String]]],
    matchAttributes: Input[
      RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes
    ]
  ): RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinition = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], matchAttributes = matchAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinition]
  }
  
  extension [Self <: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinition](x: Self) {
    
    inline def setActions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: Input[String]*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setMatchAttributes(
      value: Input[
          RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes
        ]
    ): Self = StObject.set(x, "matchAttributes", value.asInstanceOf[js.Any])
  }
}
