package typings.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallPolicyFirewallPolicy extends StObject {
  
  /**
    * Set of configuration blocks containing references to the stateful rule groups that are used in the policy. See Stateful Rule Group Reference below for details.
    */
  var statefulRuleGroupReferences: js.UndefOr[js.Array[FirewallPolicyFirewallPolicyStatefulRuleGroupReference]] = js.undefined
  
  /**
    * Set of configuration blocks describing the custom action definitions that are available for use in the firewall policy's `statelessDefaultActions`. See Stateless Custom Action below for details.
    */
  var statelessCustomActions: js.UndefOr[js.Array[FirewallPolicyFirewallPolicyStatelessCustomAction]] = js.undefined
  
  /**
    * Set of actions to take on a packet if it does not match any of the stateless rules in the policy. You must specify one of the standard actions including: `aws:drop`, `aws:pass`, or `aws:forward_to_sfe`.
    * In addition, you can specify custom actions that are compatible with your standard action choice. If you want non-matching packets to be forwarded for stateful inspection, specify `aws:forward_to_sfe`.
    */
  var statelessDefaultActions: js.Array[String]
  
  /**
    * Set of actions to take on a fragmented packet if it does not match any of the stateless rules in the policy. You must specify one of the standard actions including: `aws:drop`, `aws:pass`, or `aws:forward_to_sfe`.
    * In addition, you can specify custom actions that are compatible with your standard action choice. If you want non-matching packets to be forwarded for stateful inspection, specify `aws:forward_to_sfe`.
    */
  var statelessFragmentDefaultActions: js.Array[String]
  
  /**
    * Set of configuration blocks containing references to the stateless rule groups that are used in the policy. See Stateless Rule Group Reference below for details.
    */
  var statelessRuleGroupReferences: js.UndefOr[js.Array[FirewallPolicyFirewallPolicyStatelessRuleGroupReference]] = js.undefined
}
object FirewallPolicyFirewallPolicy {
  
  @scala.inline
  def apply(statelessDefaultActions: js.Array[String], statelessFragmentDefaultActions: js.Array[String]): FirewallPolicyFirewallPolicy = {
    val __obj = js.Dynamic.literal(statelessDefaultActions = statelessDefaultActions.asInstanceOf[js.Any], statelessFragmentDefaultActions = statelessFragmentDefaultActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallPolicyFirewallPolicy]
  }
  
  @scala.inline
  implicit class FirewallPolicyFirewallPolicyMutableBuilder[Self <: FirewallPolicyFirewallPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatefulRuleGroupReferences(value: js.Array[FirewallPolicyFirewallPolicyStatefulRuleGroupReference]): Self = StObject.set(x, "statefulRuleGroupReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatefulRuleGroupReferencesUndefined: Self = StObject.set(x, "statefulRuleGroupReferences", js.undefined)
    
    @scala.inline
    def setStatefulRuleGroupReferencesVarargs(value: FirewallPolicyFirewallPolicyStatefulRuleGroupReference*): Self = StObject.set(x, "statefulRuleGroupReferences", js.Array(value :_*))
    
    @scala.inline
    def setStatelessCustomActions(value: js.Array[FirewallPolicyFirewallPolicyStatelessCustomAction]): Self = StObject.set(x, "statelessCustomActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatelessCustomActionsUndefined: Self = StObject.set(x, "statelessCustomActions", js.undefined)
    
    @scala.inline
    def setStatelessCustomActionsVarargs(value: FirewallPolicyFirewallPolicyStatelessCustomAction*): Self = StObject.set(x, "statelessCustomActions", js.Array(value :_*))
    
    @scala.inline
    def setStatelessDefaultActions(value: js.Array[String]): Self = StObject.set(x, "statelessDefaultActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatelessDefaultActionsVarargs(value: String*): Self = StObject.set(x, "statelessDefaultActions", js.Array(value :_*))
    
    @scala.inline
    def setStatelessFragmentDefaultActions(value: js.Array[String]): Self = StObject.set(x, "statelessFragmentDefaultActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatelessFragmentDefaultActionsVarargs(value: String*): Self = StObject.set(x, "statelessFragmentDefaultActions", js.Array(value :_*))
    
    @scala.inline
    def setStatelessRuleGroupReferences(value: js.Array[FirewallPolicyFirewallPolicyStatelessRuleGroupReference]): Self = StObject.set(x, "statelessRuleGroupReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatelessRuleGroupReferencesUndefined: Self = StObject.set(x, "statelessRuleGroupReferences", js.undefined)
    
    @scala.inline
    def setStatelessRuleGroupReferencesVarargs(value: FirewallPolicyFirewallPolicyStatelessRuleGroupReference*): Self = StObject.set(x, "statelessRuleGroupReferences", js.Array(value :_*))
  }
}
