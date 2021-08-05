package typings.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroup extends StObject {
  
  /**
    * A configuration block that defines additional settings available to use in the rules defined in the rule group. See Rule Variables below for details.
    */
  var ruleVariables: js.UndefOr[RuleGroupRuleGroupRuleVariables] = js.undefined
  
  /**
    * A configuration block that defines the stateful or stateless rules for the rule group. See Rules Source below for details.
    */
  var rulesSource: RuleGroupRuleGroupRulesSource
}
object RuleGroupRuleGroup {
  
  inline def apply(rulesSource: RuleGroupRuleGroupRulesSource): RuleGroupRuleGroup = {
    val __obj = js.Dynamic.literal(rulesSource = rulesSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroup]
  }
  
  extension [Self <: RuleGroupRuleGroup](x: Self) {
    
    inline def setRuleVariables(value: RuleGroupRuleGroupRuleVariables): Self = StObject.set(x, "ruleVariables", value.asInstanceOf[js.Any])
    
    inline def setRuleVariablesUndefined: Self = StObject.set(x, "ruleVariables", js.undefined)
    
    inline def setRulesSource(value: RuleGroupRuleGroupRulesSource): Self = StObject.set(x, "rulesSource", value.asInstanceOf[js.Any])
  }
}
