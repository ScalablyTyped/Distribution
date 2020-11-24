package typings.pulumiAws.outputMod.networkfirewall

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirewallPolicyFirewallPolicy extends js.Object {
  
  /**
    * Set of configuration blocks containing references to the stateful rule groups that are used in the policy. See Stateful Rule Group Reference below for details.
    */
  var statefulRuleGroupReferences: js.UndefOr[js.Array[FirewallPolicyFirewallPolicyStatefulRuleGroupReference]] = js.native
  
  /**
    * Set of configuration blocks describing the custom action definitions that are available for use in the firewall policy's `statelessDefaultActions`. See Stateless Custom Action below for details.
    */
  var statelessCustomActions: js.UndefOr[js.Array[FirewallPolicyFirewallPolicyStatelessCustomAction]] = js.native
  
  /**
    * Set of actions to take on a packet if it does not match any of the stateless rules in the policy. You must specify one of the standard actions including: `aws:drop`, `aws:pass`, or `aws:forward_to_sfe`.
    * In addition, you can specify custom actions that are compatible with your standard action choice. If you want non-matching packets to be forwarded for stateful inspection, specify `aws:forward_to_sfe`.
    */
  var statelessDefaultActions: js.Array[String] = js.native
  
  /**
    * Set of actions to take on a fragmented packet if it does not match any of the stateless rules in the policy. You must specify one of the standard actions including: `aws:drop`, `aws:pass`, or `aws:forward_to_sfe`.
    * In addition, you can specify custom actions that are compatible with your standard action choice. If you want non-matching packets to be forwarded for stateful inspection, specify `aws:forward_to_sfe`.
    */
  var statelessFragmentDefaultActions: js.Array[String] = js.native
  
  /**
    * Set of configuration blocks containing references to the stateless rule groups that are used in the policy. See Stateless Rule Group Reference below for details.
    */
  var statelessRuleGroupReferences: js.UndefOr[js.Array[FirewallPolicyFirewallPolicyStatelessRuleGroupReference]] = js.native
}
object FirewallPolicyFirewallPolicy {
  
  @scala.inline
  def apply(statelessDefaultActions: js.Array[String], statelessFragmentDefaultActions: js.Array[String]): FirewallPolicyFirewallPolicy = {
    val __obj = js.Dynamic.literal(statelessDefaultActions = statelessDefaultActions.asInstanceOf[js.Any], statelessFragmentDefaultActions = statelessFragmentDefaultActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallPolicyFirewallPolicy]
  }
  
  @scala.inline
  implicit class FirewallPolicyFirewallPolicyOps[Self <: FirewallPolicyFirewallPolicy] (val x: Self) extends AnyVal {
    
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
    def setStatelessDefaultActionsVarargs(value: String*): Self = this.set("statelessDefaultActions", js.Array(value :_*))
    
    @scala.inline
    def setStatelessDefaultActions(value: js.Array[String]): Self = this.set("statelessDefaultActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatelessFragmentDefaultActionsVarargs(value: String*): Self = this.set("statelessFragmentDefaultActions", js.Array(value :_*))
    
    @scala.inline
    def setStatelessFragmentDefaultActions(value: js.Array[String]): Self = this.set("statelessFragmentDefaultActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatefulRuleGroupReferencesVarargs(value: FirewallPolicyFirewallPolicyStatefulRuleGroupReference*): Self = this.set("statefulRuleGroupReferences", js.Array(value :_*))
    
    @scala.inline
    def setStatefulRuleGroupReferences(value: js.Array[FirewallPolicyFirewallPolicyStatefulRuleGroupReference]): Self = this.set("statefulRuleGroupReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatefulRuleGroupReferences: Self = this.set("statefulRuleGroupReferences", js.undefined)
    
    @scala.inline
    def setStatelessCustomActionsVarargs(value: FirewallPolicyFirewallPolicyStatelessCustomAction*): Self = this.set("statelessCustomActions", js.Array(value :_*))
    
    @scala.inline
    def setStatelessCustomActions(value: js.Array[FirewallPolicyFirewallPolicyStatelessCustomAction]): Self = this.set("statelessCustomActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatelessCustomActions: Self = this.set("statelessCustomActions", js.undefined)
    
    @scala.inline
    def setStatelessRuleGroupReferencesVarargs(value: FirewallPolicyFirewallPolicyStatelessRuleGroupReference*): Self = this.set("statelessRuleGroupReferences", js.Array(value :_*))
    
    @scala.inline
    def setStatelessRuleGroupReferences(value: js.Array[FirewallPolicyFirewallPolicyStatelessRuleGroupReference]): Self = this.set("statelessRuleGroupReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatelessRuleGroupReferences: Self = this.set("statelessRuleGroupReferences", js.undefined)
  }
}
