package typings
package atPulumiKubernetesLib.typesInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "networking")
@js.native
object networkingNs extends js.Object {
  @JSName("v1")
  @js.native
  object v1Ns extends js.Object {
    /**
             * IPBlock describes a particular CIDR (Ex. "192.168.1.1/24") that is allowed to the pods
             * matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that should
             * not be included within this rule.
             */
    
    trait IPBlock extends js.Object {
      /**
                   * CIDR is a string representing the IP Block Valid examples are "192.168.1.1/24"
                   */
      var cidr: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Except is a slice of CIDRs that should not be included within an IP Block Valid examples
                   * are "192.168.1.1/24" Except values will be rejected if they are outside the CIDR range
                   */
      var except: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
    }
    
    /**
             * NetworkPolicy describes what network traffic is allowed for a set of Pods
             */
    
    trait NetworkPolicy extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Specification of the desired behavior for this NetworkPolicy.
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[NetworkPolicySpec]] = js.undefined
    }
    
    /**
             * NetworkPolicyEgressRule describes a particular set of traffic that is allowed out of pods
             * matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and to. This
             * type is beta-level in 1.8
             */
    
    trait NetworkPolicyEgressRule extends js.Object {
      /**
                   * List of destination ports for outgoing traffic. Each item in this list is combined using a
                   * logical OR. If this field is empty or missing, this rule matches all ports (traffic not
                   * restricted by port). If this field is present and contains at least one item, then this
                   * rule allows traffic only if the traffic matches at least one port in the list.
                   */
      var ports: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[NetworkPolicyPort]]] = js.undefined
      /**
                   * List of destinations for outgoing traffic of pods selected for this rule. Items in this
                   * list are combined using a logical OR operation. If this field is empty or missing, this
                   * rule matches all destinations (traffic not restricted by destination). If this field is
                   * present and contains at least one item, this rule allows traffic only if the traffic
                   * matches at least one item in the to list.
                   */
      var to: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[NetworkPolicyPeer]]] = js.undefined
    }
    
    /**
             * NetworkPolicyIngressRule describes a particular set of traffic that is allowed to the pods
             * matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and from.
             */
    
    trait NetworkPolicyIngressRule extends js.Object {
      /**
                   * List of sources which should be able to access the pods selected for this rule. Items in
                   * this list are combined using a logical OR operation. If this field is empty or missing,
                   * this rule matches all sources (traffic not restricted by source). If this field is present
                   * and contains at least on item, this rule allows traffic only if the traffic matches at
                   * least one item in the from list.
                   */
      var from: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[NetworkPolicyPeer]]] = js.undefined
      /**
                   * List of ports which should be made accessible on the pods selected for this rule. Each item
                   * in this list is combined using a logical OR. If this field is empty or missing, this rule
                   * matches all ports (traffic not restricted by port). If this field is present and contains
                   * at least one item, then this rule allows traffic only if the traffic matches at least one
                   * port in the list.
                   */
      var ports: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[NetworkPolicyPort]]] = js.undefined
    }
    
    /**
             * NetworkPolicyList is a list of NetworkPolicy objects.
             */
    
    trait NetworkPolicyList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is a list of schema objects.
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[NetworkPolicy]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * NetworkPolicyPeer describes a peer to allow traffic from. Exactly one of its fields must be
             * specified.
             */
    
    trait NetworkPolicyPeer extends js.Object {
      /**
                   * IPBlock defines policy on a particular IPBlock
                   */
      var ipBlock: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[IPBlock]] = js.undefined
      /**
                   * Selects Namespaces using cluster scoped-labels. This matches all pods in all namespaces
                   * selected by this label selector. This field follows standard label selector semantics. If
                   * present but empty, this selector selects all namespaces.
                   */
      var namespaceSelector: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
          ] = js.undefined
      /**
                   * This is a label selector which selects Pods in this namespace. This field follows standard
                   * label selector semantics. If present but empty, this selector selects all pods in this
                   * namespace.
                   */
      var podSelector: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
          ] = js.undefined
    }
    
    /**
             * NetworkPolicyPort describes a port to allow traffic on
             */
    
    trait NetworkPolicyPort extends js.Object {
      /**
                   * The port on the given protocol. This can either be a numerical or named port on a pod. If
                   * this field is not provided, this matches all port names and numbers.
                   */
      var port: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double | java.lang.String]] = js.undefined
      /**
                   * The protocol (TCP or UDP) which traffic must match. If not specified, this field defaults
                   * to TCP.
                   */
      var protocol: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * NetworkPolicySpec provides the specification of a NetworkPolicy
             */
    
    trait NetworkPolicySpec extends js.Object {
      /**
                   * List of egress rules to be applied to the selected pods. Outgoing traffic is allowed if
                   * there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the
                   * traffic), OR if the traffic matches at least one egress rule across all of the
                   * NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this
                   * NetworkPolicy limits all outgoing traffic (and serves solely to ensure that the pods it
                   * selects are isolated by default). This field is beta-level in 1.8
                   */
      var egress: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[NetworkPolicyEgressRule]]] = js.undefined
      /**
                   * List of ingress rules to be applied to the selected pods. Traffic is allowed to a pod if
                   * there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the
                   * traffic), OR if the traffic source is the pod's local node, OR if the traffic matches at
                   * least one ingress rule across all of the NetworkPolicy objects whose podSelector matches
                   * the pod. If this field is empty then this NetworkPolicy does not allow any traffic (and
                   * serves solely to ensure that the pods it selects are isolated by default)
                   */
      var ingress: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[NetworkPolicyIngressRule]]] = js.undefined
      /**
                   * Selects the pods to which this NetworkPolicy object applies. The array of ingress rules is
                   * applied to any pods selected by this field. Multiple network policies can select the same
                   * set of pods. In this case, the ingress rules for each are combined additively. This field
                   * is NOT optional and follows standard label selector semantics. An empty podSelector matches
                   * all pods in this namespace.
                   */
      var podSelector: atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
      /**
                   * List of rule types that the NetworkPolicy relates to. Valid options are Ingress, Egress, or
                   * Ingress,Egress. If this field is not specified, it will default based on the existence of
                   * Ingress or Egress rules; policies that contain an Egress section are assumed to affect
                   * Egress, and all policies (whether or not they contain an Ingress section) are assumed to
                   * affect Ingress. If you want to write an egress-only policy, you must explicitly specify
                   * policyTypes [ "Egress" ]. Likewise, if you want to write a policy that specifies that no
                   * egress is allowed, you must specify a policyTypes value that include "Egress" (since such a
                   * policy would not include an Egress section and would otherwise default to just [ "Ingress"
                   * ]). This field is beta-level in 1.8
                   */
      var policyTypes: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
    }
    
    def isNetworkPolicy(o: js.Any): /* is NetworkPolicy */scala.Boolean = js.native
    def isNetworkPolicyList(o: js.Any): /* is NetworkPolicyList */scala.Boolean = js.native
  }
  
}

