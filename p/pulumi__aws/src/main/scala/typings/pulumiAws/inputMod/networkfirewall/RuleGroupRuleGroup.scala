package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroup extends StObject {
  
  /**
    * A configuration block that defines additional settings available to use in the rules defined in the rule group. See Rule Variables below for details.
    */
  var ruleVariables: js.UndefOr[Input[RuleGroupRuleGroupRuleVariables]] = js.undefined
  
  /**
    * A configuration block that defines the stateful or stateless rules for the rule group. See Rules Source below for details.
    */
  var rulesSource: Input[RuleGroupRuleGroupRulesSource]
}
object RuleGroupRuleGroup {
  
  inline def apply(rulesSource: Input[RuleGroupRuleGroupRulesSource]): RuleGroupRuleGroup = {
    val __obj = js.Dynamic.literal(rulesSource = rulesSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroup]
  }
  
  extension [Self <: RuleGroupRuleGroup](x: Self) {
    
    inline def setRuleVariables(value: Input[RuleGroupRuleGroupRuleVariables]): Self = StObject.set(x, "ruleVariables", value.asInstanceOf[js.Any])
    
    inline def setRuleVariablesUndefined: Self = StObject.set(x, "ruleVariables", js.undefined)
    
    inline def setRulesSource(value: Input[RuleGroupRuleGroupRulesSource]): Self = StObject.set(x, "rulesSource", value.asInstanceOf[js.Any])
  }
}
