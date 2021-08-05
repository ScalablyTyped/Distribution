package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroupRulesSourceStatefulRule extends StObject {
  
  /**
    * Action to take with packets in a traffic flow when the flow matches the stateful rule criteria. For all actions, AWS Network Firewall performs the specified action and discontinues stateful inspection of the traffic flow. Valid values: `ALERT`, `DROP` or `PASS`.
    */
  var action: Input[String]
  
  /**
    * A configuration block containing the stateful 5-tuple inspection criteria for the rule, used to inspect traffic flows. See Header below for details.
    */
  var header: Input[RuleGroupRuleGroupRulesSourceStatefulRuleHeader]
  
  /**
    * Set of configuration blocks containing additional settings for a stateful rule. See Rule Option below for details.
    */
  var ruleOptions: Input[js.Array[Input[RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption]]]
}
object RuleGroupRuleGroupRulesSourceStatefulRule {
  
  inline def apply(
    action: Input[String],
    header: Input[RuleGroupRuleGroupRulesSourceStatefulRuleHeader],
    ruleOptions: Input[js.Array[Input[RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption]]]
  ): RuleGroupRuleGroupRulesSourceStatefulRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], ruleOptions = ruleOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSourceStatefulRule]
  }
  
  extension [Self <: RuleGroupRuleGroupRulesSourceStatefulRule](x: Self) {
    
    inline def setAction(value: Input[String]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: Input[RuleGroupRuleGroupRulesSourceStatefulRuleHeader]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setRuleOptions(value: Input[js.Array[Input[RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption]]]): Self = StObject.set(x, "ruleOptions", value.asInstanceOf[js.Any])
    
    inline def setRuleOptionsVarargs(value: Input[RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption]*): Self = StObject.set(x, "ruleOptions", js.Array(value :_*))
  }
}
