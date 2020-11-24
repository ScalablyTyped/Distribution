package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirewallPolicyFirewallPolicy extends js.Object {
  
  /**
    * Set of configuration blocks containing references to the stateful rule groups that are used in the policy. See Stateful Rule Group Reference below for details.
    */
  var statefulRuleGroupReferences: js.UndefOr[Input[js.Array[Input[FirewallPolicyFirewallPolicyStatefulRuleGroupReference]]]] = js.native
  
  /**
    * Set of configuration blocks describing the custom action definitions that are available for use in the firewall policy's `statelessDefaultActions`. See Stateless Custom Action below for details.
    */
  var statelessCustomActions: js.UndefOr[Input[js.Array[Input[FirewallPolicyFirewallPolicyStatelessCustomAction]]]] = js.native
  
  /**
    * Set of actions to take on a packet if it does not match any of the stateless rules in the policy. You must specify one of the standard actions including: `aws:drop`, `aws:pass`, or `aws:forward_to_sfe`.
    * In addition, you can specify custom actions that are compatible with your standard action choice. If you want non-matching packets to be forwarded for stateful inspection, specify `aws:forward_to_sfe`.
    */
  var statelessDefaultActions: Input[js.Array[Input[String]]] = js.native
  
  /**
    * Set of actions to take on a fragmented packet if it does not match any of the stateless rules in the policy. You must specify one of the standard actions including: `aws:drop`, `aws:pass`, or `aws:forward_to_sfe`.
    * In addition, you can specify custom actions that are compatible with your standard action choice. If you want non-matching packets to be forwarded for stateful inspection, specify `aws:forward_to_sfe`.
    */
  var statelessFragmentDefaultActions: Input[js.Array[Input[String]]] = js.native
  
  /**
    * Set of configuration blocks containing references to the stateless rule groups that are used in the policy. See Stateless Rule Group Reference below for details.
    */
  var statelessRuleGroupReferences: js.UndefOr[Input[js.Array[Input[FirewallPolicyFirewallPolicyStatelessRuleGroupReference]]]] = js.native
}
object FirewallPolicyFirewallPolicy {
  
  @scala.inline
  def apply(
    statelessDefaultActions: Input[js.Array[Input[String]]],
    statelessFragmentDefaultActions: Input[js.Array[Input[String]]]
  ): FirewallPolicyFirewallPolicy = {
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
    def setStatelessDefaultActionsVarargs(value: Input[String]*): Self = this.set("statelessDefaultActions", js.Array(value :_*))
    
    @scala.inline
    def setStatelessDefaultActions(value: Input[js.Array[Input[String]]]): Self = this.set("statelessDefaultActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatelessFragmentDefaultActionsVarargs(value: Input[String]*): Self = this.set("statelessFragmentDefaultActions", js.Array(value :_*))
    
    @scala.inline
    def setStatelessFragmentDefaultActions(value: Input[js.Array[Input[String]]]): Self = this.set("statelessFragmentDefaultActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatefulRuleGroupReferencesVarargs(value: Input[FirewallPolicyFirewallPolicyStatefulRuleGroupReference]*): Self = this.set("statefulRuleGroupReferences", js.Array(value :_*))
    
    @scala.inline
    def setStatefulRuleGroupReferences(value: Input[js.Array[Input[FirewallPolicyFirewallPolicyStatefulRuleGroupReference]]]): Self = this.set("statefulRuleGroupReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatefulRuleGroupReferences: Self = this.set("statefulRuleGroupReferences", js.undefined)
    
    @scala.inline
    def setStatelessCustomActionsVarargs(value: Input[FirewallPolicyFirewallPolicyStatelessCustomAction]*): Self = this.set("statelessCustomActions", js.Array(value :_*))
    
    @scala.inline
    def setStatelessCustomActions(value: Input[js.Array[Input[FirewallPolicyFirewallPolicyStatelessCustomAction]]]): Self = this.set("statelessCustomActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatelessCustomActions: Self = this.set("statelessCustomActions", js.undefined)
    
    @scala.inline
    def setStatelessRuleGroupReferencesVarargs(value: Input[FirewallPolicyFirewallPolicyStatelessRuleGroupReference]*): Self = this.set("statelessRuleGroupReferences", js.Array(value :_*))
    
    @scala.inline
    def setStatelessRuleGroupReferences(value: Input[js.Array[Input[FirewallPolicyFirewallPolicyStatelessRuleGroupReference]]]): Self = this.set("statelessRuleGroupReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatelessRuleGroupReferences: Self = this.set("statelessRuleGroupReferences", js.undefined)
  }
}
