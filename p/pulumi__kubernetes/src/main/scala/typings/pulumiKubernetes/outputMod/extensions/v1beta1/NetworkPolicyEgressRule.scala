package typings.pulumiKubernetes.outputMod.extensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DEPRECATED 1.9 - This group version of NetworkPolicyEgressRule is deprecated by networking/v1/NetworkPolicyEgressRule. NetworkPolicyEgressRule describes a particular set of traffic that is allowed out of pods matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and to. This type is beta-level in 1.8
  */
trait NetworkPolicyEgressRule extends StObject {
  
  /**
    * List of destination ports for outgoing traffic. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
    */
  var ports: js.Array[NetworkPolicyPort]
  
  /**
    * List of destinations for outgoing traffic of pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all destinations (traffic not restricted by destination). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the to list.
    */
  var to: js.Array[NetworkPolicyPeer]
}
object NetworkPolicyEgressRule {
  
  @scala.inline
  def apply(ports: js.Array[NetworkPolicyPort], to: js.Array[NetworkPolicyPeer]): NetworkPolicyEgressRule = {
    val __obj = js.Dynamic.literal(ports = ports.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkPolicyEgressRule]
  }
  
  @scala.inline
  implicit class NetworkPolicyEgressRuleMutableBuilder[Self <: NetworkPolicyEgressRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPorts(value: js.Array[NetworkPolicyPort]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsVarargs(value: NetworkPolicyPort*): Self = StObject.set(x, "ports", js.Array(value :_*))
    
    @scala.inline
    def setTo(value: js.Array[NetworkPolicyPeer]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToVarargs(value: NetworkPolicyPeer*): Self = StObject.set(x, "to", js.Array(value :_*))
  }
}
