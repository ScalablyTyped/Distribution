package typings.pulumiKubernetes.inputMod.networking.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NetworkPolicyIngressRule describes a particular set of traffic that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and from.
  */
trait NetworkPolicyIngressRule extends StObject {
  
  /**
    * List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
    */
  var from: js.UndefOr[Input[js.Array[Input[NetworkPolicyPeer]]]] = js.undefined
  
  /**
    * List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
    */
  var ports: js.UndefOr[Input[js.Array[Input[NetworkPolicyPort]]]] = js.undefined
}
object NetworkPolicyIngressRule {
  
  @scala.inline
  def apply(): NetworkPolicyIngressRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPolicyIngressRule]
  }
  
  @scala.inline
  implicit class NetworkPolicyIngressRuleMutableBuilder[Self <: NetworkPolicyIngressRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: Input[js.Array[Input[NetworkPolicyPeer]]]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setFromVarargs(value: Input[NetworkPolicyPeer]*): Self = StObject.set(x, "from", js.Array(value :_*))
    
    @scala.inline
    def setPorts(value: Input[js.Array[Input[NetworkPolicyPort]]]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: Input[NetworkPolicyPort]*): Self = StObject.set(x, "ports", js.Array(value :_*))
  }
}
