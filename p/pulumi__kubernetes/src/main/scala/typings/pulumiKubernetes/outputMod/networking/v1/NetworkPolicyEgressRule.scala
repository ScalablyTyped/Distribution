package typings.pulumiKubernetes.outputMod.networking.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NetworkPolicyEgressRule describes a particular set of traffic that is allowed out of pods matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and to. This type is beta-level in 1.8
  */
@js.native
trait NetworkPolicyEgressRule extends js.Object {
  /**
    * List of destination ports for outgoing traffic. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
    */
  var ports: js.Array[NetworkPolicyPort] = js.native
  /**
    * List of destinations for outgoing traffic of pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all destinations (traffic not restricted by destination). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the to list.
    */
  var to: js.Array[NetworkPolicyPeer] = js.native
}

object NetworkPolicyEgressRule {
  @scala.inline
  def apply(ports: js.Array[NetworkPolicyPort], to: js.Array[NetworkPolicyPeer]): NetworkPolicyEgressRule = {
    val __obj = js.Dynamic.literal(ports = ports.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkPolicyEgressRule]
  }
  @scala.inline
  implicit class NetworkPolicyEgressRuleOps[Self <: NetworkPolicyEgressRule] (val x: Self) extends AnyVal {
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
    def setPortsVarargs(value: NetworkPolicyPort*): Self = this.set("ports", js.Array(value :_*))
    @scala.inline
    def setPorts(value: js.Array[NetworkPolicyPort]): Self = this.set("ports", value.asInstanceOf[js.Any])
    @scala.inline
    def setToVarargs(value: NetworkPolicyPeer*): Self = this.set("to", js.Array(value :_*))
    @scala.inline
    def setTo(value: js.Array[NetworkPolicyPeer]): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}

