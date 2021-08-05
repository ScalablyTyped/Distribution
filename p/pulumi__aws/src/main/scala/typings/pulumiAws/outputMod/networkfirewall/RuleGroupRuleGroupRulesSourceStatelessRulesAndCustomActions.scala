package typings.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions extends StObject {
  
  /**
    * Set of configuration blocks containing custom action definitions that are available for use by the set of `stateless rule`. See Custom Action below for details.
    */
  var customActions: js.UndefOr[
    js.Array[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomAction]
  ] = js.undefined
  
  /**
    * Set of configuration blocks containing the stateless rules for use in the stateless rule group. See Stateless Rule below for details.
    */
  var statelessRules: js.Array[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRule]
}
object RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions {
  
  inline def apply(statelessRules: js.Array[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRule]): RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions = {
    val __obj = js.Dynamic.literal(statelessRules = statelessRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions]
  }
  
  extension [Self <: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions](x: Self) {
    
    inline def setCustomActions(value: js.Array[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomAction]): Self = StObject.set(x, "customActions", value.asInstanceOf[js.Any])
    
    inline def setCustomActionsUndefined: Self = StObject.set(x, "customActions", js.undefined)
    
    inline def setCustomActionsVarargs(value: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomAction*): Self = StObject.set(x, "customActions", js.Array(value :_*))
    
    inline def setStatelessRules(value: js.Array[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRule]): Self = StObject.set(x, "statelessRules", value.asInstanceOf[js.Any])
    
    inline def setStatelessRulesVarargs(value: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRule*): Self = StObject.set(x, "statelessRules", js.Array(value :_*))
  }
}
