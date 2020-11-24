package typings.pulumiAws.outputMod.networkfirewall

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleGroupRulesSourceStatefulRule extends js.Object {
  
  /**
    * Action to take with packets in a traffic flow when the flow matches the stateful rule criteria. For all actions, AWS Network Firewall performs the specified action and discontinues stateful inspection of the traffic flow. Valid values: `ALERT`, `DROP` or `PASS`.
    */
  var action: String = js.native
  
  /**
    * A configuration block containing the stateful 5-tuple inspection criteria for the rule, used to inspect traffic flows. See Header below for details.
    */
  var header: RuleGroupRuleGroupRulesSourceStatefulRuleHeader = js.native
  
  /**
    * Set of configuration blocks containing additional settings for a stateful rule. See Rule Option below for details.
    */
  var ruleOptions: js.Array[RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption] = js.native
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
  implicit class RuleGroupRuleGroupRulesSourceStatefulRuleOps[Self <: RuleGroupRuleGroupRulesSourceStatefulRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: RuleGroupRuleGroupRulesSourceStatefulRuleHeader): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleOptionsVarargs(value: RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption*): Self = this.set("ruleOptions", js.Array(value :_*))
    
    @scala.inline
    def setRuleOptions(value: js.Array[RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption]): Self = this.set("ruleOptions", value.asInstanceOf[js.Any])
  }
}
