package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceSpec describes the attributes that a user creates on a service.
  */
@js.native
trait ServiceSpec extends StObject {
  
  /**
    * clusterIP is the IP address of the service and is usually assigned randomly by the master. If an address is specified manually and is not in use by others, it will be allocated to the service; otherwise, creation of the service will fail. This field can not be changed through updates. Valid values are "None", empty string (""), or a valid IP address. "None" can be specified for headless services when proxying is not required. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
    */
  var clusterIP: js.UndefOr[Input[String]] = js.native
  
  /**
    * externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.  These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.
    */
  var externalIPs: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * externalName is the external reference that kubedns or equivalent will return as a CNAME record for this service. No proxying will be involved. Must be a valid RFC-1123 hostname (https://tools.ietf.org/html/rfc1123) and requires Type to be ExternalName.
    */
  var externalName: js.UndefOr[Input[String]] = js.native
  
  /**
    * externalTrafficPolicy denotes if this Service desires to route external traffic to node-local or cluster-wide endpoints. "Local" preserves the client source IP and avoids a second hop for LoadBalancer and Nodeport type services, but risks potentially imbalanced traffic spreading. "Cluster" obscures the client source IP and may cause a second hop to another node, but should have good overall load-spreading.
    */
  var externalTrafficPolicy: js.UndefOr[Input[String]] = js.native
  
  /**
    * healthCheckNodePort specifies the healthcheck nodePort for the service. If not specified, HealthCheckNodePort is created by the service api backend with the allocated nodePort. Will use user-specified nodePort value if specified by the client. Only effects when Type is set to LoadBalancer and ExternalTrafficPolicy is set to Local.
    */
  var healthCheckNodePort: js.UndefOr[Input[Double]] = js.native
  
  /**
    * ipFamily specifies whether this Service has a preference for a particular IP family (e.g. IPv4 vs. IPv6) when the IPv6DualStack feature gate is enabled. In a dual-stack cluster, you can specify ipFamily when creating a ClusterIP Service to determine whether the controller will allocate an IPv4 or IPv6 IP for it, and you can specify ipFamily when creating a headless Service to determine whether it will have IPv4 or IPv6 Endpoints. In either case, if you do not specify an ipFamily explicitly, it will default to the cluster's primary IP family. This field is part of an alpha feature, and you should not make any assumptions about its semantics other than those described above. In particular, you should not assume that it can (or cannot) be changed after creation time; that it can only have the values "IPv4" and "IPv6"; or that its current value on a given Service correctly reflects the current state of that Service. (For ClusterIP Services, look at clusterIP to see if the Service is IPv4 or IPv6. For headless Services, look at the endpoints, which may be dual-stack in the future. For ExternalName Services, ipFamily has no meaning, but it may be set to an irrelevant value anyway.)
    */
  var ipFamily: js.UndefOr[Input[String]] = js.native
  
  /**
    * Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field. This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.
    */
  var loadBalancerIP: js.UndefOr[Input[String]] = js.native
  
  /**
    * If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs. This field will be ignored if the cloud-provider does not support the feature." More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/
    */
  var loadBalancerSourceRanges: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The list of ports that are exposed by this service. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
    */
  var ports: js.UndefOr[Input[js.Array[Input[ServicePort]]]] = js.native
  
  /**
    * publishNotReadyAddresses indicates that any agent which deals with endpoints for this Service should disregard any indications of ready/not-ready. The primary use case for setting this field is for a StatefulSet's Headless Service to propagate SRV DNS records for its Pods for the purpose of peer discovery. The Kubernetes controllers that generate Endpoints and EndpointSlice resources for Services interpret this to mean that all endpoints are considered "ready" even if the Pods themselves are not. Agents which consume only Kubernetes generated endpoints through the Endpoints or EndpointSlice resources can safely assume this behavior.
    */
  var publishNotReadyAddresses: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Route service traffic to pods with label keys and values matching this selector. If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/
    */
  var selector: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Supports "ClientIP" and "None". Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
    */
  var sessionAffinity: js.UndefOr[Input[String]] = js.native
  
  /**
    * sessionAffinityConfig contains the configurations of session affinity.
    */
  var sessionAffinityConfig: js.UndefOr[Input[SessionAffinityConfig]] = js.native
  
  /**
    * topologyKeys is a preference-order list of topology keys which implementations of services should use to preferentially sort endpoints when accessing this Service, it can not be used at the same time as externalTrafficPolicy=Local. Topology keys must be valid label keys and at most 16 keys may be specified. Endpoints are chosen based on the first topology key with available backends. If this field is specified and all entries have no backends that match the topology of the client, the service has no backends for that client and connections should fail. The special value "*" may be used to mean "any topology". This catch-all value, if used, only makes sense as the last value in the list. If this is not specified or empty, no topology constraints will be applied.
    */
  var topologyKeys: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types
    */
  var `type`: js.UndefOr[Input[String]] = js.native
}
object ServiceSpec {
  
  @scala.inline
  def apply(): ServiceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceSpec]
  }
  
  @scala.inline
  implicit class ServiceSpecMutableBuilder[Self <: ServiceSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterIP(value: Input[String]): Self = StObject.set(x, "clusterIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIPUndefined: Self = StObject.set(x, "clusterIP", js.undefined)
    
    @scala.inline
    def setExternalIPs(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "externalIPs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIPsUndefined: Self = StObject.set(x, "externalIPs", js.undefined)
    
    @scala.inline
    def setExternalIPsVarargs(value: Input[String]*): Self = StObject.set(x, "externalIPs", js.Array(value :_*))
    
    @scala.inline
    def setExternalName(value: Input[String]): Self = StObject.set(x, "externalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalNameUndefined: Self = StObject.set(x, "externalName", js.undefined)
    
    @scala.inline
    def setExternalTrafficPolicy(value: Input[String]): Self = StObject.set(x, "externalTrafficPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalTrafficPolicyUndefined: Self = StObject.set(x, "externalTrafficPolicy", js.undefined)
    
    @scala.inline
    def setHealthCheckNodePort(value: Input[Double]): Self = StObject.set(x, "healthCheckNodePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckNodePortUndefined: Self = StObject.set(x, "healthCheckNodePort", js.undefined)
    
    @scala.inline
    def setIpFamily(value: Input[String]): Self = StObject.set(x, "ipFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpFamilyUndefined: Self = StObject.set(x, "ipFamily", js.undefined)
    
    @scala.inline
    def setLoadBalancerIP(value: Input[String]): Self = StObject.set(x, "loadBalancerIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerIPUndefined: Self = StObject.set(x, "loadBalancerIP", js.undefined)
    
    @scala.inline
    def setLoadBalancerSourceRanges(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "loadBalancerSourceRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerSourceRangesUndefined: Self = StObject.set(x, "loadBalancerSourceRanges", js.undefined)
    
    @scala.inline
    def setLoadBalancerSourceRangesVarargs(value: Input[String]*): Self = StObject.set(x, "loadBalancerSourceRanges", js.Array(value :_*))
    
    @scala.inline
    def setPorts(value: Input[js.Array[Input[ServicePort]]]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: Input[ServicePort]*): Self = StObject.set(x, "ports", js.Array(value :_*))
    
    @scala.inline
    def setPublishNotReadyAddresses(value: Input[Boolean]): Self = StObject.set(x, "publishNotReadyAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishNotReadyAddressesUndefined: Self = StObject.set(x, "publishNotReadyAddresses", js.undefined)
    
    @scala.inline
    def setSelector(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setSessionAffinity(value: Input[String]): Self = StObject.set(x, "sessionAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionAffinityConfig(value: Input[SessionAffinityConfig]): Self = StObject.set(x, "sessionAffinityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionAffinityConfigUndefined: Self = StObject.set(x, "sessionAffinityConfig", js.undefined)
    
    @scala.inline
    def setSessionAffinityUndefined: Self = StObject.set(x, "sessionAffinity", js.undefined)
    
    @scala.inline
    def setTopologyKeys(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "topologyKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopologyKeysUndefined: Self = StObject.set(x, "topologyKeys", js.undefined)
    
    @scala.inline
    def setTopologyKeysVarargs(value: Input[String]*): Self = StObject.set(x, "topologyKeys", js.Array(value :_*))
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
