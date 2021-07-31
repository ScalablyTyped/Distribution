package typings.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroupRulesSourceStatefulRule extends StObject {
  
  /**
    * Action to take with packets in a traffic flow when the flow matches the stateful rule criteria. For all actions, AWS Network Firewall performs the specified action and discontinues stateful inspection of the traffic flow. Valid values: `ALERT`, `DROP` or `PASS`.
    */
  var action: String
  
  /**
    * A configuration block containing the stateful 5-tuple inspection criteria for the rule, used to inspect traffic flows. See Header below for details.
    */
  var header: RuleGroupRuleGroupRulesSourceStatefulRuleHeader
  
  /**
    * Set of configuration blocks containing additional settings for a stateful rule. See Rule Option below for details.
    */
  var ruleOptions: js.Array[RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption]
}
object RuleGroupRuleGroupRulesSourceStatefulRule {
  
  @scala.inline
  def apply(
    action: String,
    header: RuleGroupRuleGroupRulesSourceStatefulRuleHeader,
    ruleOptions: js.Array[RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption]
  ): RuleGroupRuleGroupRulesSourceStatefulRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], ruleOptions = ruleOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSourceStatefulRule]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupRulesSourceStatefulRuleMutableBuilder[Self <: RuleGroupRuleGroupRulesSourceStatefulRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: RuleGroupRuleGroupRulesSourceStatefulRuleHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleOptions(value: js.Array[RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption]): Self = StObject.set(x, "ruleOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleOptionsVarargs(value: RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption*): Self = StObject.set(x, "ruleOptions", js.Array(value :_*))
  }
}
