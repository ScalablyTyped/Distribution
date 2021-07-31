package typings.pulumiKubernetes.inputMod.networking

import typings.pulumiKubernetes.inputMod.core.v1.LoadBalancerStatus
import typings.pulumiKubernetes.inputMod.core.v1.TypedLocalObjectReference
import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.networkingDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1beta1 {
  
  /**
    * HTTPIngressPath associates a path with a backend. Incoming urls matching the path are forwarded to the backend.
    */
  trait HTTPIngressPath extends StObject {
    
    /**
      * Backend defines the referenced service endpoint to which the traffic will be forwarded to.
      */
    var backend: Input[IngressBackend]
    
    /**
      * Path is matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/'. When unspecified, all paths from incoming requests are matched.
      */
    var path: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * PathType determines the interpretation of the Path matching. PathType can be one of the following values: * Exact: Matches the URL path exactly. * Prefix: Matches based on a URL path prefix split by '/'. Matching is
      *   done on a path element by element basis. A path element refers is the
      *   list of labels in the path split by the '/' separator. A request is a
      *   match for path p if every p is an element-wise prefix of p of the
      *   request path. Note that if the last element of the path is a substring
      *   of the last element in request path, it is not a match (e.g. /foo/bar
      *   matches /foo/bar/baz, but does not match /foo/barbaz).
      * * ImplementationSpecific: Interpretation of the Path matching is up to
      *   the IngressClass. Implementations can treat this as a separate PathType
      *   or treat it identically to Prefix or Exact path types.
      * Implementations are required to support all path types. Defaults to ImplementationSpecific.
      */
    var pathType: js.UndefOr[Input[String]] = js.undefined
  }
  object HTTPIngressPath {
    
    @scala.inline
    def apply(backend: Input[IngressBackend]): HTTPIngressPath = {
      val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any])
      __obj.asInstanceOf[HTTPIngressPath]
    }
    
    @scala.inline
    implicit class HTTPIngressPathMutableBuilder[Self <: HTTPIngressPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackend(value: Input[IngressBackend]): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathType(value: Input[String]): Self = StObject.set(x, "pathType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathTypeUndefined: Self = StObject.set(x, "pathType", js.undefined)
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  /**
    * HTTPIngressRuleValue is a list of http selectors pointing to backends. In the example: http://<host>/<path>?<searchpart> -> backend where where parts of the url correspond to RFC 3986, this resource will be used to match against everything after the last '/' and before the first '?' or '#'.
    */
  trait HTTPIngressRuleValue extends StObject {
    
    /**
      * A collection of paths that map requests to backends.
      */
    var paths: Input[js.Array[Input[HTTPIngressPath]]]
  }
  object HTTPIngressRuleValue {
    
    @scala.inline
    def apply(paths: Input[js.Array[Input[HTTPIngressPath]]]): HTTPIngressRuleValue = {
      val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[HTTPIngressRuleValue]
    }
    
    @scala.inline
    implicit class HTTPIngressRuleValueMutableBuilder[Self <: HTTPIngressRuleValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPaths(value: Input[js.Array[Input[HTTPIngressPath]]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsVarargs(value: Input[HTTPIngressPath]*): Self = StObject.set(x, "paths", js.Array(value :_*))
    }
  }
  
  /**
    * Ingress is a collection of rules that allow inbound connections to reach the endpoints defined by a backend. An Ingress can be configured to give services externally-reachable urls, load balance traffic, terminate SSL, offer name based virtual hosting etc.
    *
    * This resource waits until its status is ready before registering success
    * for create/update, and populating output properties from the current state of the resource.
    * The following conditions are used to determine whether the resource creation has
    * succeeded or failed:
    *
    * 1.  Ingress object exists.
    * 2.  Endpoint objects exist with matching names for each Ingress path (except when Service
    *     type is ExternalName).
    * 3.  Ingress entry exists for '.status.loadBalancer.ingress'.
    *
    * If the Ingress has not reached a Ready state after 10 minutes, it will
    * time out and mark the resource update as Failed. You can override the default timeout value
    * by setting the 'customTimeouts' option on the resource.
    */
  trait Ingress extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[networkingDotk8sDotioSlashv1beta1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Ingress]] = js.undefined
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
    
    /**
      * Spec is the desired state of the Ingress. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    var spec: js.UndefOr[Input[IngressSpec]] = js.undefined
    
    /**
      * Status is the current state of the Ingress. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    var status: js.UndefOr[Input[IngressStatus]] = js.undefined
  }
  object Ingress {
    
    @scala.inline
    def apply(): Ingress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ingress]
    }
    
    @scala.inline
    implicit class IngressMutableBuilder[Self <: Ingress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[networkingDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Ingress]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setSpec(value: Input[IngressSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      
      @scala.inline
      def setStatus(value: Input[IngressStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * IngressBackend describes all endpoints for a given service and port.
    */
  trait IngressBackend extends StObject {
    
    /**
      * Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is specified, serviceName and servicePort must not be specified.
      */
    var resource: js.UndefOr[Input[TypedLocalObjectReference]] = js.undefined
    
    /**
      * Specifies the name of the referenced service.
      */
    var serviceName: Input[String]
    
    /**
      * Specifies the port of the referenced service.
      */
    var servicePort: Input[Double | String]
  }
  object IngressBackend {
    
    @scala.inline
    def apply(serviceName: Input[String], servicePort: Input[Double | String]): IngressBackend = {
      val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], servicePort = servicePort.asInstanceOf[js.Any])
      __obj.asInstanceOf[IngressBackend]
    }
    
    @scala.inline
    implicit class IngressBackendMutableBuilder[Self <: IngressBackend] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResource(value: Input[TypedLocalObjectReference]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setServiceName(value: Input[String]): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServicePort(value: Input[Double | String]): Self = StObject.set(x, "servicePort", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * IngressClass represents the class of the Ingress, referenced by the Ingress Spec. The `ingressclass.kubernetes.io/is-default-class` annotation can be used to indicate that an IngressClass should be considered default. When a single IngressClass resource has this annotation set to true, new Ingress resources without a class specified will be assigned this default class.
    */
  trait IngressClass extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[networkingDotk8sDotioSlashv1beta1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.IngressClass]] = js.undefined
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
    
    /**
      * Spec is the desired state of the IngressClass. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    var spec: js.UndefOr[Input[IngressClassSpec]] = js.undefined
  }
  object IngressClass {
    
    @scala.inline
    def apply(): IngressClass = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IngressClass]
    }
    
    @scala.inline
    implicit class IngressClassMutableBuilder[Self <: IngressClass] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[networkingDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.IngressClass]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setSpec(value: Input[IngressClassSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    }
  }
  
  /**
    * IngressClassSpec provides information about the class of an Ingress.
    */
  trait IngressClassSpec extends StObject {
    
    /**
      * Controller refers to the name of the controller that should handle this class. This allows for different "flavors" that are controlled by the same controller. For example, you may have different Parameters for the same implementing controller. This should be specified as a domain-prefixed path no more than 250 characters in length, e.g. "acme.io/ingress-controller". This field is immutable.
      */
    var controller: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Parameters is a link to a custom resource containing additional configuration for the controller. This is optional if the controller does not require extra parameters.
      */
    var parameters: js.UndefOr[Input[TypedLocalObjectReference]] = js.undefined
  }
  object IngressClassSpec {
    
    @scala.inline
    def apply(): IngressClassSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IngressClassSpec]
    }
    
    @scala.inline
    implicit class IngressClassSpecMutableBuilder[Self <: IngressClassSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setController(value: Input[String]): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
      
      @scala.inline
      def setParameters(value: Input[TypedLocalObjectReference]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    }
  }
  
  /**
    * IngressRule represents the rules mapping the paths under a specified host to the related backend services. Incoming requests are first evaluated for a host match, then routed to the backend associated with the matching IngressRuleValue.
    */
  trait IngressRule extends StObject {
    
    /**
      * Host is the fully qualified domain name of a network host, as defined by RFC 3986. Note the following deviations from the "host" part of the URI as defined in RFC 3986: 1. IPs are not allowed. Currently an IngressRuleValue can only apply to
      *    the IP in the Spec of the parent Ingress.
      * 2. The `:` delimiter is not respected because ports are not allowed.
      * 	  Currently the port of an Ingress is implicitly :80 for http and
      * 	  :443 for https.
      * Both these may change in the future. Incoming requests are matched against the host before the IngressRuleValue. If the host is unspecified, the Ingress routes all traffic based on the specified IngressRuleValue.
      *
      * Host can be "precise" which is a domain name without the terminating dot of a network host (e.g. "foo.bar.com") or "wildcard", which is a domain name prefixed with a single wildcard label (e.g. "*.foo.com"). The wildcard character '*' must appear by itself as the first DNS label and matches only a single label. You cannot have a wildcard label by itself (e.g. Host == "*"). Requests will be matched against the Host field in the following way: 1. If Host is precise, the request matches this rule if the http host header is equal to Host. 2. If Host is a wildcard, then the request matches this rule if the http host header is to equal to the suffix (removing the first label) of the wildcard rule.
      */
    var host: js.UndefOr[Input[String]] = js.undefined
    
    var http: js.UndefOr[Input[HTTPIngressRuleValue]] = js.undefined
  }
  object IngressRule {
    
    @scala.inline
    def apply(): IngressRule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IngressRule]
    }
    
    @scala.inline
    implicit class IngressRuleMutableBuilder[Self <: IngressRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: Input[String]): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHttp(value: Input[HTTPIngressRuleValue]): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    }
  }
  
  /**
    * IngressSpec describes the Ingress the user wishes to exist.
    */
  trait IngressSpec extends StObject {
    
    /**
      * A default backend capable of servicing requests that don't match any rule. At least one of 'backend' or 'rules' must be specified. This field is optional to allow the loadbalancer controller or defaulting logic to specify a global default.
      */
    var backend: js.UndefOr[Input[IngressBackend]] = js.undefined
    
    /**
      * IngressClassName is the name of the IngressClass cluster resource. The associated IngressClass defines which controller will implement the resource. This replaces the deprecated `kubernetes.io/ingress.class` annotation. For backwards compatibility, when that annotation is set, it must be given precedence over this field. The controller may emit a warning if the field and annotation have different values. Implementations of this API should ignore Ingresses without a class specified. An IngressClass resource may be marked as default, which can be used to set a default value for this field. For more information, refer to the IngressClass documentation.
      */
    var ingressClassName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.
      */
    var rules: js.UndefOr[Input[js.Array[Input[IngressRule]]]] = js.undefined
    
    /**
      * TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
      */
    var tls: js.UndefOr[Input[js.Array[Input[IngressTLS]]]] = js.undefined
  }
  object IngressSpec {
    
    @scala.inline
    def apply(): IngressSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IngressSpec]
    }
    
    @scala.inline
    implicit class IngressSpecMutableBuilder[Self <: IngressSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackend(value: Input[IngressBackend]): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
      
      @scala.inline
      def setIngressClassName(value: Input[String]): Self = StObject.set(x, "ingressClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIngressClassNameUndefined: Self = StObject.set(x, "ingressClassName", js.undefined)
      
      @scala.inline
      def setRules(value: Input[js.Array[Input[IngressRule]]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: Input[IngressRule]*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      @scala.inline
      def setTls(value: Input[js.Array[Input[IngressTLS]]]): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      @scala.inline
      def setTlsVarargs(value: Input[IngressTLS]*): Self = StObject.set(x, "tls", js.Array(value :_*))
    }
  }
  
  /**
    * IngressStatus describe the current state of the Ingress.
    */
  trait IngressStatus extends StObject {
    
    /**
      * LoadBalancer contains the current status of the load-balancer.
      */
    var loadBalancer: js.UndefOr[Input[LoadBalancerStatus]] = js.undefined
  }
  object IngressStatus {
    
    @scala.inline
    def apply(): IngressStatus = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IngressStatus]
    }
    
    @scala.inline
    implicit class IngressStatusMutableBuilder[Self <: IngressStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoadBalancer(value: Input[LoadBalancerStatus]): Self = StObject.set(x, "loadBalancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancerUndefined: Self = StObject.set(x, "loadBalancer", js.undefined)
    }
  }
  
  /**
    * IngressTLS describes the transport layer security associated with an Ingress.
    */
  trait IngressTLS extends StObject {
    
    /**
      * Hosts are a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
      */
    var hosts: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * SecretName is the name of the secret used to terminate TLS traffic on port 443. Field is left optional to allow TLS routing based on SNI hostname alone. If the SNI host in a listener conflicts with the "Host" header field used by an IngressRule, the SNI host is used for termination and value of the Host header is used for routing.
      */
    var secretName: js.UndefOr[Input[String]] = js.undefined
  }
  object IngressTLS {
    
    @scala.inline
    def apply(): IngressTLS = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IngressTLS]
    }
    
    @scala.inline
    implicit class IngressTLSMutableBuilder[Self <: IngressTLS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHosts(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
      
      @scala.inline
      def setHostsVarargs(value: Input[String]*): Self = StObject.set(x, "hosts", js.Array(value :_*))
      
      @scala.inline
      def setSecretName(value: Input[String]): Self = StObject.set(x, "secretName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretNameUndefined: Self = StObject.set(x, "secretName", js.undefined)
    }
  }
}
