package typings.pulumiKubernetes.outputMod.extensions.v1beta1

import typings.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DEPRECATED 1.9 - This group version of NetworkPolicySpec is deprecated by networking/v1/NetworkPolicySpec.
  */
@js.native
trait NetworkPolicySpec extends StObject {
  
  /**
    * List of egress rules to be applied to the selected pods. Outgoing traffic is allowed if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic matches at least one egress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy limits all outgoing traffic (and serves solely to ensure that the pods it selects are isolated by default). This field is beta-level in 1.8
    */
  var egress: js.Array[NetworkPolicyEgressRule] = js.native
  
  /**
    * List of ingress rules to be applied to the selected pods. Traffic is allowed to a pod if there are no NetworkPolicies selecting the pod OR if the traffic source is the pod's local node, OR if the traffic matches at least one ingress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy does not allow any traffic (and serves solely to ensure that the pods it selects are isolated by default).
    */
  var ingress: js.Array[NetworkPolicyIngressRule] = js.native
  
  /**
    * Selects the pods to which this NetworkPolicy object applies.  The array of ingress rules is applied to any pods selected by this field. Multiple network policies can select the same set of pods.  In this case, the ingress rules for each are combined additively. This field is NOT optional and follows standard label selector semantics. An empty podSelector matches all pods in this namespace.
    */
  var podSelector: LabelSelector = js.native
  
  /**
    * List of rule types that the NetworkPolicy relates to. Valid options are "Ingress", "Egress", or "Ingress,Egress". If this field is not specified, it will default based on the existence of Ingress or Egress rules; policies that contain an Egress section are assumed to affect Egress, and all policies (whether or not they contain an Ingress section) are assumed to affect Ingress. If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ]. Likewise, if you want to write a policy that specifies that no egress is allowed, you must specify a policyTypes value that include "Egress" (since such a policy would not include an Egress section and would otherwise default to just [ "Ingress" ]). This field is beta-level in 1.8
    */
  var policyTypes: js.Array[String] = js.native
}
object NetworkPolicySpec {
  
  @scala.inline
  def apply(
    egress: js.Array[NetworkPolicyEgressRule],
    ingress: js.Array[NetworkPolicyIngressRule],
    podSelector: LabelSelector,
    policyTypes: js.Array[String]
  ): NetworkPolicySpec = {
    val __obj = js.Dynamic.literal(egress = egress.asInstanceOf[js.Any], ingress = ingress.asInstanceOf[js.Any], podSelector = podSelector.asInstanceOf[js.Any], policyTypes = policyTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkPolicySpec]
  }
  
  @scala.inline
  implicit class NetworkPolicySpecMutableBuilder[Self <: NetworkPolicySpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEgress(value: js.Array[NetworkPolicyEgressRule]): Self = StObject.set(x, "egress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEgressVarargs(value: NetworkPolicyEgressRule*): Self = StObject.set(x, "egress", js.Array(value :_*))
    
    @scala.inline
    def setIngress(value: js.Array[NetworkPolicyIngressRule]): Self = StObject.set(x, "ingress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngressVarargs(value: NetworkPolicyIngressRule*): Self = StObject.set(x, "ingress", js.Array(value :_*))
    
    @scala.inline
    def setPodSelector(value: LabelSelector): Self = StObject.set(x, "podSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyTypes(value: js.Array[String]): Self = StObject.set(x, "policyTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyTypesVarargs(value: String*): Self = StObject.set(x, "policyTypes", js.Array(value :_*))
  }
}
