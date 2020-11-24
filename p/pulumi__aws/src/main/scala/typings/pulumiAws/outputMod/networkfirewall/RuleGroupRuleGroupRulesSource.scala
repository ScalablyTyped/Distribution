package typings.pulumiAws.outputMod.networkfirewall

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleGroupRulesSource extends js.Object {
  
  /**
    * A configuration block containing **stateful** inspection criteria for a domain list rule group. See Rules Source List below for details.
    */
  var rulesSourceList: js.UndefOr[RuleGroupRuleGroupRulesSourceRulesSourceList] = js.native
  
  /**
    * The fully qualified name of a file in an S3 bucket that contains Suricata compatible intrusion preventions system (IPS) rules or the Suricata rules as a string. These rules contain **stateful** inspection criteria and the action to take for traffic that matches the criteria.
    */
  var rulesString: js.UndefOr[String] = js.native
  
  /**
    * Set of configuration blocks containing **stateful** inspection criteria for 5-tuple rules to be used together in a rule group. See Stateful Rule below for details.
    */
  var statefulRules: js.UndefOr[js.Array[RuleGroupRuleGroupRulesSourceStatefulRule]] = js.native
  
  /**
    * A configuration block containing **stateless** inspection criteria for a stateless rule group. See Stateless Rules and Custom Actions below for details.
    */
  var statelessRulesAndCustomActions: js.UndefOr[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions] = js.native
}
object RuleGroupRuleGroupRulesSource {
  
  @scala.inline
  def apply(): RuleGroupRuleGroupRulesSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSource]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupRulesSourceOps[Self <: RuleGroupRuleGroupRulesSource] (val x: Self) extends AnyVal {
    
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
    def setRulesSourceList(value: RuleGroupRuleGroupRulesSourceRulesSourceList): Self = this.set("rulesSourceList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRulesSourceList: Self = this.set("rulesSourceList", js.undefined)
    
    @scala.inline
    def setRulesString(value: String): Self = this.set("rulesString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRulesString: Self = this.set("rulesString", js.undefined)
    
    @scala.inline
    def setStatefulRulesVarargs(value: RuleGroupRuleGroupRulesSourceStatefulRule*): Self = this.set("statefulRules", js.Array(value :_*))
    
    @scala.inline
    def setStatefulRules(value: js.Array[RuleGroupRuleGroupRulesSourceStatefulRule]): Self = this.set("statefulRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatefulRules: Self = this.set("statefulRules", js.undefined)
    
    @scala.inline
    def setStatelessRulesAndCustomActions(value: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions): Self = this.set("statelessRulesAndCustomActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatelessRulesAndCustomActions: Self = this.set("statelessRulesAndCustomActions", js.undefined)
  }
}
