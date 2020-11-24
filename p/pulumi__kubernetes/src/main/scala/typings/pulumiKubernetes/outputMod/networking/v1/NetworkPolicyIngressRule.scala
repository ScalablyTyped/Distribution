package typings.pulumiKubernetes.outputMod.networking.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NetworkPolicyIngressRule describes a particular set of traffic that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and from.
  */
@js.native
trait NetworkPolicyIngressRule extends js.Object {
  
  /**
    * List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
    */
  var from: js.Array[NetworkPolicyPeer] = js.native
  
  /**
    * List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
    */
  var ports: js.Array[NetworkPolicyPort] = js.native
}
object NetworkPolicyIngressRule {
  
  @scala.inline
  def apply(from: js.Array[NetworkPolicyPeer], ports: js.Array[NetworkPolicyPort]): NetworkPolicyIngressRule = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkPolicyIngressRule]
  }
  
  @scala.inline
  implicit class NetworkPolicyIngressRuleOps[Self <: NetworkPolicyIngressRule] (val x: Self) extends AnyVal {
    
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
    def setFromVarargs(value: NetworkPolicyPeer*): Self = this.set("from", js.Array(value :_*))
    
    @scala.inline
    def setFrom(value: js.Array[NetworkPolicyPeer]): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsVarargs(value: NetworkPolicyPort*): Self = this.set("ports", js.Array(value :_*))
    
    @scala.inline
    def setPorts(value: js.Array[NetworkPolicyPort]): Self = this.set("ports", value.asInstanceOf[js.Any])
  }
}
