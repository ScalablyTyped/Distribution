package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallPolicyFirewallPolicy extends StObject {
  
  /**
    * Set of configuration blocks containing references to the stateful rule groups that are used in the policy. See Stateful Rule Group Reference below for details.
    */
  var statefulRuleGroupReferences: js.UndefOr[Input[js.Array[Input[FirewallPolicyFirewallPolicyStatefulRuleGroupReference]]]] = js.undefined
  
  /**
    * Set of configuration blocks describing the custom action definitions that are available for use in the firewall policy's `statelessDefaultActions`. See Stateless Custom Action below for details.
    */
  var statelessCustomActions: js.UndefOr[Input[js.Array[Input[FirewallPolicyFirewallPolicyStatelessCustomAction]]]] = js.undefined
  
  /**
    * Set of actions to take on a packet if it does not match any of the stateless rules in the policy. You must specify one of the standard actions including: `aws:drop`, `aws:pass`, or `aws:forward_to_sfe`.
    * In addition, you can specify custom actions that are compatible with your standard action choice. If you want non-matching packets to be forwarded for stateful inspection, specify `aws:forward_to_sfe`.
    */
  var statelessDefaultActions: Input[js.Array[Input[String]]]
  
  /**
    * Set of actions to take on a fragmented packet if it does not match any of the stateless rules in the policy. You must specify one of the standard actions including: `aws:drop`, `aws:pass`, or `aws:forward_to_sfe`.
    * In addition, you can specify custom actions that are compatible with your standard action choice. If you want non-matching packets to be forwarded for stateful inspection, specify `aws:forward_to_sfe`.
    */
  var statelessFragmentDefaultActions: Input[js.Array[Input[String]]]
  
  /**
    * Set of configuration blocks containing references to the stateless rule groups that are used in the policy. See Stateless Rule Group Reference below for details.
    */
  var statelessRuleGroupReferences: js.UndefOr[Input[js.Array[Input[FirewallPolicyFirewallPolicyStatelessRuleGroupReference]]]] = js.undefined
}
object FirewallPolicyFirewallPolicy {
  
  inline def apply(
    statelessDefaultActions: Input[js.Array[Input[String]]],
    statelessFragmentDefaultActions: Input[js.Array[Input[String]]]
  ): FirewallPolicyFirewallPolicy = {
    val __obj = js.Dynamic.literal(statelessDefaultActions = statelessDefaultActions.asInstanceOf[js.Any], statelessFragmentDefaultActions = statelessFragmentDefaultActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallPolicyFirewallPolicy]
  }
  
  extension [Self <: FirewallPolicyFirewallPolicy](x: Self) {
    
    inline def setStatefulRuleGroupReferences(value: Input[js.Array[Input[FirewallPolicyFirewallPolicyStatefulRuleGroupReference]]]): Self = StObject.set(x, "statefulRuleGroupReferences", value.asInstanceOf[js.Any])
    
    inline def setStatefulRuleGroupReferencesUndefined: Self = StObject.set(x, "statefulRuleGroupReferences", js.undefined)
    
    inline def setStatefulRuleGroupReferencesVarargs(value: Input[FirewallPolicyFirewallPolicyStatefulRuleGroupReference]*): Self = StObject.set(x, "statefulRuleGroupReferences", js.Array(value :_*))
    
    inline def setStatelessCustomActions(value: Input[js.Array[Input[FirewallPolicyFirewallPolicyStatelessCustomAction]]]): Self = StObject.set(x, "statelessCustomActions", value.asInstanceOf[js.Any])
    
    inline def setStatelessCustomActionsUndefined: Self = StObject.set(x, "statelessCustomActions", js.undefined)
    
    inline def setStatelessCustomActionsVarargs(value: Input[FirewallPolicyFirewallPolicyStatelessCustomAction]*): Self = StObject.set(x, "statelessCustomActions", js.Array(value :_*))
    
    inline def setStatelessDefaultActions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "statelessDefaultActions", value.asInstanceOf[js.Any])
    
    inline def setStatelessDefaultActionsVarargs(value: Input[String]*): Self = StObject.set(x, "statelessDefaultActions", js.Array(value :_*))
    
    inline def setStatelessFragmentDefaultActions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "statelessFragmentDefaultActions", value.asInstanceOf[js.Any])
    
    inline def setStatelessFragmentDefaultActionsVarargs(value: Input[String]*): Self = StObject.set(x, "statelessFragmentDefaultActions", js.Array(value :_*))
    
    inline def setStatelessRuleGroupReferences(value: Input[js.Array[Input[FirewallPolicyFirewallPolicyStatelessRuleGroupReference]]]): Self = StObject.set(x, "statelessRuleGroupReferences", value.asInstanceOf[js.Any])
    
    inline def setStatelessRuleGroupReferencesUndefined: Self = StObject.set(x, "statelessRuleGroupReferences", js.undefined)
    
    inline def setStatelessRuleGroupReferencesVarargs(value: Input[FirewallPolicyFirewallPolicyStatelessRuleGroupReference]*): Self = StObject.set(x, "statelessRuleGroupReferences", js.Array(value :_*))
  }
}
