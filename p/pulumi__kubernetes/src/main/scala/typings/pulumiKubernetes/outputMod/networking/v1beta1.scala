package typings.pulumiKubernetes.outputMod.networking

import typings.pulumiKubernetes.outputMod.core.v1.LoadBalancerStatus
import typings.pulumiKubernetes.outputMod.core.v1.TypedLocalObjectReference
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.networkingDotk8sDotioSlashv1beta1
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
    var backend: IngressBackend
    
    /**
      * Path is matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/'. When unspecified, all paths from incoming requests are matched.
      */
    var path: String
    
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
    var pathType: String
  }
  object HTTPIngressPath {
    
    inline def apply(backend: IngressBackend, path: String, pathType: String): HTTPIngressPath = {
      val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathType = pathType.asInstanceOf[js.Any])
      __obj.asInstanceOf[HTTPIngressPath]
    }
    
    extension [Self <: HTTPIngressPath](x: Self) {
      
      inline def setBackend(value: IngressBackend): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathType(value: String): Self = StObject.set(x, "pathType", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * HTTPIngressRuleValue is a list of http selectors pointing to backends. In the example: http://<host>/<path>?<searchpart> -> backend where where parts of the url correspond to RFC 3986, this resource will be used to match against everything after the last '/' and before the first '?' or '#'.
    */
  trait HTTPIngressRuleValue extends StObject {
    
    /**
      * A collection of paths that map requests to backends.
      */
    var paths: js.Array[HTTPIngressPath]
  }
  object HTTPIngressRuleValue {
    
    inline def apply(paths: js.Array[HTTPIngressPath]): HTTPIngressRuleValue = {
      val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[HTTPIngressRuleValue]
    }
    
    extension [Self <: HTTPIngressRuleValue](x: Self) {
      
      inline def setPaths(value: js.Array[HTTPIngressPath]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsVarargs(value: HTTPIngressPath*): Self = StObject.set(x, "paths", js.Array(value :_*))
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
    var apiVersion: networkingDotk8sDotioSlashv1beta1
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.Ingress
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: ObjectMeta
    
    /**
      * Spec is the desired state of the Ingress. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    var spec: IngressSpec
    
    /**
      * Status is the current state of the Ingress. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    var status: IngressStatus
  }
  object Ingress {
    
    inline def apply(metadata: ObjectMeta, spec: IngressSpec, status: IngressStatus): Ingress = {
      val __obj = js.Dynamic.literal(apiVersion = "networking.k8s.io/v1beta1", kind = "Ingress", metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ingress]
    }
    
    extension [Self <: Ingress](x: Self) {
      
      inline def setApiVersion(value: networkingDotk8sDotioSlashv1beta1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.Ingress): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: IngressSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: IngressStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * IngressBackend describes all endpoints for a given service and port.
    */
  trait IngressBackend extends StObject {
    
    /**
      * Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is specified, serviceName and servicePort must not be specified.
      */
    var resource: TypedLocalObjectReference
    
    /**
      * Specifies the name of the referenced service.
      */
    var serviceName: String
    
    /**
      * Specifies the port of the referenced service.
      */
    var servicePort: Double | String
  }
  object IngressBackend {
    
    inline def apply(resource: TypedLocalObjectReference, serviceName: String, servicePort: Double | String): IngressBackend = {
      val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], servicePort = servicePort.asInstanceOf[js.Any])
      __obj.asInstanceOf[IngressBackend]
    }
    
    extension [Self <: IngressBackend](x: Self) {
      
      inline def setResource(value: TypedLocalObjectReference): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      inline def setServicePort(value: Double | String): Self = StObject.set(x, "servicePort", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * IngressClass represents the class of the Ingress, referenced by the Ingress Spec. The `ingressclass.kubernetes.io/is-default-class` annotation can be used to indicate that an IngressClass should be considered default. When a single IngressClass resource has this annotation set to true, new Ingress resources without a class specified will be assigned this default class.
    */
  trait IngressClass extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: networkingDotk8sDotioSlashv1beta1
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.IngressClass
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: ObjectMeta
    
    /**
      * Spec is the desired state of the IngressClass. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    var spec: IngressClassSpec
  }
  object IngressClass {
    
    inline def apply(metadata: ObjectMeta, spec: IngressClassSpec): IngressClass = {
      val __obj = js.Dynamic.literal(apiVersion = "networking.k8s.io/v1beta1", kind = "IngressClass", metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[IngressClass]
    }
    
    extension [Self <: IngressClass](x: Self) {
      
      inline def setApiVersion(value: networkingDotk8sDotioSlashv1beta1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.IngressClass): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: IngressClassSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * IngressClassSpec provides information about the class of an Ingress.
    */
  trait IngressClassSpec extends StObject {
    
    /**
      * Controller refers to the name of the controller that should handle this class. This allows for different "flavors" that are controlled by the same controller. For example, you may have different Parameters for the same implementing controller. This should be specified as a domain-prefixed path no more than 250 characters in length, e.g. "acme.io/ingress-controller". This field is immutable.
      */
    var controller: String
    
    /**
      * Parameters is a link to a custom resource containing additional configuration for the controller. This is optional if the controller does not require extra parameters.
      */
    var parameters: TypedLocalObjectReference
  }
  object IngressClassSpec {
    
    inline def apply(controller: String, parameters: TypedLocalObjectReference): IngressClassSpec = {
      val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[IngressClassSpec]
    }
    
    extension [Self <: IngressClassSpec](x: Self) {
      
      inline def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: TypedLocalObjectReference): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
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
    var host: String
    
    var http: HTTPIngressRuleValue
  }
  object IngressRule {
    
    inline def apply(host: String, http: HTTPIngressRuleValue): IngressRule = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any])
      __obj.asInstanceOf[IngressRule]
    }
    
    extension [Self <: IngressRule](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHttp(value: HTTPIngressRuleValue): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * IngressSpec describes the Ingress the user wishes to exist.
    */
  trait IngressSpec extends StObject {
    
    /**
      * A default backend capable of servicing requests that don't match any rule. At least one of 'backend' or 'rules' must be specified. This field is optional to allow the loadbalancer controller or defaulting logic to specify a global default.
      */
    var backend: IngressBackend
    
    /**
      * IngressClassName is the name of the IngressClass cluster resource. The associated IngressClass defines which controller will implement the resource. This replaces the deprecated `kubernetes.io/ingress.class` annotation. For backwards compatibility, when that annotation is set, it must be given precedence over this field. The controller may emit a warning if the field and annotation have different values. Implementations of this API should ignore Ingresses without a class specified. An IngressClass resource may be marked as default, which can be used to set a default value for this field. For more information, refer to the IngressClass documentation.
      */
    var ingressClassName: String
    
    /**
      * A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.
      */
    var rules: js.Array[IngressRule]
    
    /**
      * TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
      */
    var tls: js.Array[IngressTLS]
  }
  object IngressSpec {
    
    inline def apply(
      backend: IngressBackend,
      ingressClassName: String,
      rules: js.Array[IngressRule],
      tls: js.Array[IngressTLS]
    ): IngressSpec = {
      val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], ingressClassName = ingressClassName.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], tls = tls.asInstanceOf[js.Any])
      __obj.asInstanceOf[IngressSpec]
    }
    
    extension [Self <: IngressSpec](x: Self) {
      
      inline def setBackend(value: IngressBackend): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      inline def setIngressClassName(value: String): Self = StObject.set(x, "ingressClassName", value.asInstanceOf[js.Any])
      
      inline def setRules(value: js.Array[IngressRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: IngressRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      inline def setTls(value: js.Array[IngressTLS]): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsVarargs(value: IngressTLS*): Self = StObject.set(x, "tls", js.Array(value :_*))
    }
  }
  
  /**
    * IngressStatus describe the current state of the Ingress.
    */
  trait IngressStatus extends StObject {
    
    /**
      * LoadBalancer contains the current status of the load-balancer.
      */
    var loadBalancer: LoadBalancerStatus
  }
  object IngressStatus {
    
    inline def apply(loadBalancer: LoadBalancerStatus): IngressStatus = {
      val __obj = js.Dynamic.literal(loadBalancer = loadBalancer.asInstanceOf[js.Any])
      __obj.asInstanceOf[IngressStatus]
    }
    
    extension [Self <: IngressStatus](x: Self) {
      
      inline def setLoadBalancer(value: LoadBalancerStatus): Self = StObject.set(x, "loadBalancer", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * IngressTLS describes the transport layer security associated with an Ingress.
    */
  trait IngressTLS extends StObject {
    
    /**
      * Hosts are a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
      */
    var hosts: js.Array[String]
    
    /**
      * SecretName is the name of the secret used to terminate TLS traffic on port 443. Field is left optional to allow TLS routing based on SNI hostname alone. If the SNI host in a listener conflicts with the "Host" header field used by an IngressRule, the SNI host is used for termination and value of the Host header is used for routing.
      */
    var secretName: String
  }
  object IngressTLS {
    
    inline def apply(hosts: js.Array[String], secretName: String): IngressTLS = {
      val __obj = js.Dynamic.literal(hosts = hosts.asInstanceOf[js.Any], secretName = secretName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IngressTLS]
    }
    
    extension [Self <: IngressTLS](x: Self) {
      
      inline def setHosts(value: js.Array[String]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      inline def setHostsVarargs(value: String*): Self = StObject.set(x, "hosts", js.Array(value :_*))
      
      inline def setSecretName(value: String): Self = StObject.set(x, "secretName", value.asInstanceOf[js.Any])
    }
  }
}
