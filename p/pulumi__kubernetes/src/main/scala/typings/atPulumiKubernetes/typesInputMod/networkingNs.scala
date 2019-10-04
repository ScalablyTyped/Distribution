package typings.atPulumiKubernetes.typesInputMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`networkingDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`networkingDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesInputMod.coreNs.v1Ns.LoadBalancerStatus
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.LabelSelector
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ListMeta
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiKubernetes.typesInputMod.networkingNs.v1Ns.IPBlock
import typings.atPulumiKubernetes.typesInputMod.networkingNs.v1Ns.NetworkPolicy
import typings.atPulumiKubernetes.typesInputMod.networkingNs.v1Ns.NetworkPolicyEgressRule
import typings.atPulumiKubernetes.typesInputMod.networkingNs.v1Ns.NetworkPolicyIngressRule
import typings.atPulumiKubernetes.typesInputMod.networkingNs.v1Ns.NetworkPolicyPeer
import typings.atPulumiKubernetes.typesInputMod.networkingNs.v1Ns.NetworkPolicyPort
import typings.atPulumiKubernetes.typesInputMod.networkingNs.v1Ns.NetworkPolicySpec
import typings.atPulumiKubernetes.typesInputMod.networkingNs.v1beta1Ns.HTTPIngressPath
import typings.atPulumiKubernetes.typesInputMod.networkingNs.v1beta1Ns.HTTPIngressRuleValue
import typings.atPulumiKubernetes.typesInputMod.networkingNs.v1beta1Ns.Ingress
import typings.atPulumiKubernetes.typesInputMod.networkingNs.v1beta1Ns.IngressBackend
import typings.atPulumiKubernetes.typesInputMod.networkingNs.v1beta1Ns.IngressRule
import typings.atPulumiKubernetes.typesInputMod.networkingNs.v1beta1Ns.IngressSpec
import typings.atPulumiKubernetes.typesInputMod.networkingNs.v1beta1Ns.IngressTLS
import typings.atPulumiPulumi.outputMod.Input
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
      var cidr: Input[String]
      /**
        * Except is a slice of CIDRs that should not be included within an IP Block Valid examples
        * are "192.168.1.1/24" Except values will be rejected if they are outside the CIDR range
        */
      var except: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    }
    
    /**
      * NetworkPolicy describes what network traffic is allowed for a set of Pods
      */
    trait NetworkPolicy extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`networkingDOTk8sDOTio/v1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.NetworkPolicy]] = js.undefined
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Specification of the desired behavior for this NetworkPolicy.
        */
      var spec: js.UndefOr[Input[NetworkPolicySpec]] = js.undefined
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
      var ports: js.UndefOr[Input[js.Array[Input[NetworkPolicyPort]]]] = js.undefined
      /**
        * List of destinations for outgoing traffic of pods selected for this rule. Items in this
        * list are combined using a logical OR operation. If this field is empty or missing, this
        * rule matches all destinations (traffic not restricted by destination). If this field is
        * present and contains at least one item, this rule allows traffic only if the traffic
        * matches at least one item in the to list.
        */
      var to: js.UndefOr[Input[js.Array[Input[NetworkPolicyPeer]]]] = js.undefined
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
        * and contains at least one item, this rule allows traffic only if the traffic matches at
        * least one item in the from list.
        */
      var from: js.UndefOr[Input[js.Array[Input[NetworkPolicyPeer]]]] = js.undefined
      /**
        * List of ports which should be made accessible on the pods selected for this rule. Each item
        * in this list is combined using a logical OR. If this field is empty or missing, this rule
        * matches all ports (traffic not restricted by port). If this field is present and contains
        * at least one item, then this rule allows traffic only if the traffic matches at least one
        * port in the list.
        */
      var ports: js.UndefOr[Input[js.Array[Input[NetworkPolicyPort]]]] = js.undefined
    }
    
    /**
      * NetworkPolicyList is a list of NetworkPolicy objects.
      */
    trait NetworkPolicyList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`networkingDOTk8sDOTio/v1`]] = js.undefined
      /**
        * Items is a list of schema objects.
        */
      var items: Input[js.Array[Input[NetworkPolicy]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.NetworkPolicyList]] = js.undefined
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    /**
      * NetworkPolicyPeer describes a peer to allow traffic from. Only certain combinations of fields
      * are allowed
      */
    trait NetworkPolicyPeer extends js.Object {
      /**
        * IPBlock defines policy on a particular IPBlock. If this field is set then neither of the
        * other fields can be.
        */
      var ipBlock: js.UndefOr[Input[IPBlock]] = js.undefined
      /**
        * Selects Namespaces using cluster-scoped labels. This field follows standard label selector
        * semantics; if present but empty, it selects all namespaces.
        *
        * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching
        * PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods
        * in the Namespaces selected by NamespaceSelector.
        */
      var namespaceSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
      /**
        * This is a label selector which selects Pods. This field follows standard label selector
        * semantics; if present but empty, it selects all pods.
        *
        * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods
        * matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects
        * the Pods matching PodSelector in the policy's own Namespace.
        */
      var podSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
    }
    
    /**
      * NetworkPolicyPort describes a port to allow traffic on
      */
    trait NetworkPolicyPort extends js.Object {
      /**
        * The port on the given protocol. This can either be a numerical or named port on a pod. If
        * this field is not provided, this matches all port names and numbers.
        */
      var port: js.UndefOr[Input[Double | String]] = js.undefined
      /**
        * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field
        * defaults to TCP.
        */
      var protocol: js.UndefOr[Input[String]] = js.undefined
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
      var egress: js.UndefOr[Input[js.Array[Input[NetworkPolicyEgressRule]]]] = js.undefined
      /**
        * List of ingress rules to be applied to the selected pods. Traffic is allowed to a pod if
        * there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the
        * traffic), OR if the traffic source is the pod's local node, OR if the traffic matches at
        * least one ingress rule across all of the NetworkPolicy objects whose podSelector matches
        * the pod. If this field is empty then this NetworkPolicy does not allow any traffic (and
        * serves solely to ensure that the pods it selects are isolated by default)
        */
      var ingress: js.UndefOr[Input[js.Array[Input[NetworkPolicyIngressRule]]]] = js.undefined
      /**
        * Selects the pods to which this NetworkPolicy object applies. The array of ingress rules is
        * applied to any pods selected by this field. Multiple network policies can select the same
        * set of pods. In this case, the ingress rules for each are combined additively. This field
        * is NOT optional and follows standard label selector semantics. An empty podSelector matches
        * all pods in this namespace.
        */
      var podSelector: Input[LabelSelector]
      /**
        * List of rule types that the NetworkPolicy relates to. Valid options are "Ingress",
        * "Egress", or "Ingress,Egress". If this field is not specified, it will default based on the
        * existence of Ingress or Egress rules; policies that contain an Egress section are assumed
        * to affect Egress, and all policies (whether or not they contain an Ingress section) are
        * assumed to affect Ingress. If you want to write an egress-only policy, you must explicitly
        * specify policyTypes [ "Egress" ]. Likewise, if you want to write a policy that specifies
        * that no egress is allowed, you must specify a policyTypes value that include "Egress"
        * (since such a policy would not include an Egress section and would otherwise default to
        * just [ "Ingress" ]). This field is beta-level in 1.8
        */
      var policyTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    }
    
    def isNetworkPolicy(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.networking.v1.NetworkPolicy */ Boolean = js.native
    def isNetworkPolicyList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.networking.v1.NetworkPolicyList */ Boolean = js.native
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * HTTPIngressPath associates a path regex with a backend. Incoming urls matching the path are
      * forwarded to the backend.
      */
    trait HTTPIngressPath extends js.Object {
      /**
        * Backend defines the referenced service endpoint to which the traffic will be forwarded to.
        */
      var backend: Input[IngressBackend]
      /**
        * Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the
        * egrep/unix syntax, not the perl syntax) matched against the path of an incoming request.
        * Currently it can contain characters disallowed from the conventional "path" part of a URL
        * as defined by RFC 3986. Paths must begin with a '/'. If unspecified, the path defaults to a
        * catch all sending traffic to the backend.
        */
      var path: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * HTTPIngressRuleValue is a list of http selectors pointing to backends. In the example:
      * http://<host>/<path>?<searchpart> -> backend where where parts of the url correspond to RFC
      * 3986, this resource will be used to match against everything after the last '/' and before
      * the first '?' or '#'.
      */
    trait HTTPIngressRuleValue extends js.Object {
      /**
        * A collection of paths that map requests to backends.
        */
      var paths: Input[js.Array[Input[HTTPIngressPath]]]
    }
    
    /**
      * Ingress is a collection of rules that allow inbound connections to reach the endpoints
      * defined by a backend. An Ingress can be configured to give services externally-reachable
      * urls, load balance traffic, terminate SSL, offer name based virtual hosting etc.
      */
    trait Ingress extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`networkingDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Ingress]] = js.undefined
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Spec is the desired state of the Ingress. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: js.UndefOr[Input[IngressSpec]] = js.undefined
    }
    
    /**
      * IngressBackend describes all endpoints for a given service and port.
      */
    trait IngressBackend extends js.Object {
      /**
        * Specifies the name of the referenced service.
        */
      var serviceName: Input[String]
      /**
        * Specifies the port of the referenced service.
        */
      var servicePort: Input[Double | String]
    }
    
    /**
      * IngressList is a collection of Ingress.
      */
    trait IngressList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`networkingDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Items is the list of Ingress.
        */
      var items: Input[js.Array[Input[Ingress]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.IngressList]] = js.undefined
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    /**
      * IngressRule represents the rules mapping the paths under a specified host to the related
      * backend services. Incoming requests are first evaluated for a host match, then routed to the
      * backend associated with the matching IngressRuleValue.
      */
    trait IngressRule extends js.Object {
      /**
        * Host is the fully qualified domain name of a network host, as defined by RFC 3986. Note the
        * following deviations from the "host" part of the URI as defined in the RFC: 1. IPs are not
        * allowed. Currently an IngressRuleValue can only apply to the
        * 	  IP in the Spec of the parent Ingress.
        * 2. The `:` delimiter is not respected because ports are not allowed.
        * 	  Currently the port of an Ingress is implicitly :80 for http and
        * 	  :443 for https.
        * Both these may change in the future. Incoming requests are matched against the host before
        * the IngressRuleValue. If the host is unspecified, the Ingress routes all traffic based on
        * the specified IngressRuleValue.
        */
      var host: js.UndefOr[Input[String]] = js.undefined
      var http: js.UndefOr[Input[HTTPIngressRuleValue]] = js.undefined
    }
    
    /**
      * IngressSpec describes the Ingress the user wishes to exist.
      */
    trait IngressSpec extends js.Object {
      /**
        * A default backend capable of servicing requests that don't match any rule. At least one of
        * 'backend' or 'rules' must be specified. This field is optional to allow the loadbalancer
        * controller or defaulting logic to specify a global default.
        */
      var backend: js.UndefOr[Input[IngressBackend]] = js.undefined
      /**
        * A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all
        * traffic is sent to the default backend.
        */
      var rules: js.UndefOr[Input[js.Array[Input[IngressRule]]]] = js.undefined
      /**
        * TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple
        * members of this list specify different hosts, they will be multiplexed on the same port
        * according to the hostname specified through the SNI TLS extension, if the ingress
        * controller fulfilling the ingress supports SNI.
        */
      var tls: js.UndefOr[Input[js.Array[Input[IngressTLS]]]] = js.undefined
    }
    
    /**
      * IngressStatus describe the current state of the Ingress.
      */
    trait IngressStatus extends js.Object {
      /**
        * LoadBalancer contains the current status of the load-balancer.
        */
      var loadBalancer: js.UndefOr[Input[LoadBalancerStatus]] = js.undefined
    }
    
    /**
      * IngressTLS describes the transport layer security associated with an Ingress.
      */
    trait IngressTLS extends js.Object {
      /**
        * Hosts are a list of hosts included in the TLS certificate. The values in this list must
        * match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the
        * loadbalancer controller fulfilling this Ingress, if left unspecified.
        */
      var hosts: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * SecretName is the name of the secret used to terminate SSL traffic on 443. Field is left
        * optional to allow SSL routing based on SNI hostname alone. If the SNI host in a listener
        * conflicts with the "Host" header field used by an IngressRule, the SNI host is used for
        * termination and value of the Host header is used for routing.
        */
      var secretName: js.UndefOr[Input[String]] = js.undefined
    }
    
    def isIngress(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.networking.v1beta1.Ingress */ Boolean = js.native
    def isIngressList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.networking.v1beta1.IngressList */ Boolean = js.native
  }
  
}

