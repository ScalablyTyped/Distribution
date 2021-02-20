package typings.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleGroupRulesSource extends StObject {
  
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
  implicit class RuleGroupRuleGroupRulesSourceMutableBuilder[Self <: RuleGroupRuleGroupRulesSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRulesSourceList(value: RuleGroupRuleGroupRulesSourceRulesSourceList): Self = StObject.set(x, "rulesSourceList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesSourceListUndefined: Self = StObject.set(x, "rulesSourceList", js.undefined)
    
    @scala.inline
    def setRulesString(value: String): Self = StObject.set(x, "rulesString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesStringUndefined: Self = StObject.set(x, "rulesString", js.undefined)
    
    @scala.inline
    def setStatefulRules(value: js.Array[RuleGroupRuleGroupRulesSourceStatefulRule]): Self = StObject.set(x, "statefulRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatefulRulesUndefined: Self = StObject.set(x, "statefulRules", js.undefined)
    
    @scala.inline
    def setStatefulRulesVarargs(value: RuleGroupRuleGroupRulesSourceStatefulRule*): Self = StObject.set(x, "statefulRules", js.Array(value :_*))
    
    @scala.inline
    def setStatelessRulesAndCustomActions(value: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions): Self = StObject.set(x, "statelessRulesAndCustomActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatelessRulesAndCustomActionsUndefined: Self = StObject.set(x, "statelessRulesAndCustomActions", js.undefined)
  }
}
