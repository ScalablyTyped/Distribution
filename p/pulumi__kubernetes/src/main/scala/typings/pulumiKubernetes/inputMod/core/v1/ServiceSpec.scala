package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceSpec describes the attributes that a user creates on a service.
  */
trait ServiceSpec extends js.Object {
  /**
    * clusterIP is the IP address of the service and is usually assigned randomly by the master.
    * If an address is specified manually and is not in use by others, it will be allocated to
    * the service; otherwise, creation of the service will fail. This field can not be changed
    * through updates. Valid values are "None", empty string (""), or a valid IP address. "None"
    * can be specified for headless services when proxying is not required. Only applies to types
    * ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info:
    * https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
    */
  var clusterIP: js.UndefOr[Input[String]] = js.undefined
  /**
    * externalIPs is a list of IP addresses for which nodes in the cluster will also accept
    * traffic for this service.  These IPs are not managed by Kubernetes.  The user is
    * responsible for ensuring that traffic arrives at a node with this IP.  A common example is
    * external load-balancers that are not part of the Kubernetes system.
    */
  var externalIPs: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * externalName is the external reference that kubedns or equivalent will return as a CNAME
    * record for this service. No proxying will be involved. Must be a valid RFC-1123 hostname
    * (https://tools.ietf.org/html/rfc1123) and requires Type to be ExternalName.
    */
  var externalName: js.UndefOr[Input[String]] = js.undefined
  /**
    * externalTrafficPolicy denotes if this Service desires to route external traffic to
    * node-local or cluster-wide endpoints. "Local" preserves the client source IP and avoids a
    * second hop for LoadBalancer and Nodeport type services, but risks potentially imbalanced
    * traffic spreading. "Cluster" obscures the client source IP and may cause a second hop to
    * another node, but should have good overall load-spreading.
    */
  var externalTrafficPolicy: js.UndefOr[Input[String]] = js.undefined
  /**
    * healthCheckNodePort specifies the healthcheck nodePort for the service. If not specified,
    * HealthCheckNodePort is created by the service api backend with the allocated nodePort. Will
    * use user-specified nodePort value if specified by the client. Only effects when Type is set
    * to LoadBalancer and ExternalTrafficPolicy is set to Local.
    */
  var healthCheckNodePort: js.UndefOr[Input[Double]] = js.undefined
  /**
    * ipFamily specifies whether this Service has a preference for a particular IP family (e.g.
    * IPv4 vs. IPv6).  If a specific IP family is requested, the clusterIP field will be
    * allocated from that family, if it is available in the cluster.  If no IP family is
    * requested, the cluster's primary IP family will be used. Other IP fields (loadBalancerIP,
    * loadBalancerSourceRanges, externalIPs) and controllers which allocate external
    * load-balancers should use the same IP family.  Endpoints for this Service will be of this
    * family.  This field is immutable after creation. Assigning a ServiceIPFamily not available
    * in the cluster (e.g. IPv6 in IPv4 only cluster) is an error condition and will fail during
    * clusterIP assignment.
    */
  var ipFamily: js.UndefOr[Input[String]] = js.undefined
  /**
    * Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP
    * specified in this field. This feature depends on whether the underlying cloud-provider
    * supports specifying the loadBalancerIP when a load balancer is created. This field will be
    * ignored if the cloud-provider does not support the feature.
    */
  var loadBalancerIP: js.UndefOr[Input[String]] = js.undefined
  /**
    * If specified and supported by the platform, this will restrict traffic through the
    * cloud-provider load-balancer will be restricted to the specified client IPs. This field
    * will be ignored if the cloud-provider does not support the feature." More info:
    * https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/
    */
  var loadBalancerSourceRanges: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The list of ports that are exposed by this service. More info:
    * https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
    */
  var ports: js.UndefOr[Input[js.Array[Input[ServicePort]]]] = js.undefined
  /**
    * publishNotReadyAddresses, when set to true, indicates that DNS implementations must publish
    * the notReadyAddresses of subsets for the Endpoints associated with the Service. The default
    * value is false. The primary use case for setting this field is to use a StatefulSet's
    * Headless Service to propagate SRV records for its Pods without respect to their readiness
    * for purpose of peer discovery.
    */
  var publishNotReadyAddresses: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Route service traffic to pods with label keys and values matching this selector. If empty
    * or not present, the service is assumed to have an external process managing its endpoints,
    * which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and
    * LoadBalancer. Ignored if type is ExternalName. More info:
    * https://kubernetes.io/docs/concepts/services-networking/service/
    */
  var selector: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * Supports "ClientIP" and "None". Used to maintain session affinity. Enable client IP based
    * session affinity. Must be ClientIP or None. Defaults to None. More info:
    * https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
    */
  var sessionAffinity: js.UndefOr[Input[String]] = js.undefined
  /**
    * sessionAffinityConfig contains the configurations of session affinity.
    */
  var sessionAffinityConfig: js.UndefOr[Input[SessionAffinityConfig]] = js.undefined
  /**
    * topologyKeys is a preference-order list of topology keys which implementations of services
    * should use to preferentially sort endpoints when accessing this Service, it can not be used
    * at the same time as externalTrafficPolicy=Local. Topology keys must be valid label keys and
    * at most 16 keys may be specified. Endpoints are chosen based on the first topology key with
    * available backends. If this field is specified and all entries have no backends that match
    * the topology of the client, the service has no backends for that client and connections
    * should fail. The special value "*" may be used to mean "any topology". This catch-all
    * value, if used, only makes sense as the last value in the list. If this is not specified or
    * empty, no topology constraints will be applied.
    */
  var topologyKeys: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * type determines how the Service is exposed. Defaults to ClusterIP. Valid options are
    * ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified
    * externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to
    * endpoints. Endpoints are determined by the selector or if that is not specified, by manual
    * construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and
    * the endpoints are published as a set of endpoints rather than a stable IP. "NodePort"
    * builds on ClusterIP and allocates a port on every node which routes to the clusterIP.
    * "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in
    * the current cloud) which routes to the clusterIP. More info:
    * https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object ServiceSpec {
  @scala.inline
  def apply(
    clusterIP: Input[String] = null,
    externalIPs: Input[js.Array[Input[String]]] = null,
    externalName: Input[String] = null,
    externalTrafficPolicy: Input[String] = null,
    healthCheckNodePort: Input[Double] = null,
    ipFamily: Input[String] = null,
    loadBalancerIP: Input[String] = null,
    loadBalancerSourceRanges: Input[js.Array[Input[String]]] = null,
    ports: Input[js.Array[Input[ServicePort]]] = null,
    publishNotReadyAddresses: Input[Boolean] = null,
    selector: Input[StringDictionary[Input[String]]] = null,
    sessionAffinity: Input[String] = null,
    sessionAffinityConfig: Input[SessionAffinityConfig] = null,
    topologyKeys: Input[js.Array[Input[String]]] = null,
    `type`: Input[String] = null
  ): ServiceSpec = {
    val __obj = js.Dynamic.literal()
    if (clusterIP != null) __obj.updateDynamic("clusterIP")(clusterIP.asInstanceOf[js.Any])
    if (externalIPs != null) __obj.updateDynamic("externalIPs")(externalIPs.asInstanceOf[js.Any])
    if (externalName != null) __obj.updateDynamic("externalName")(externalName.asInstanceOf[js.Any])
    if (externalTrafficPolicy != null) __obj.updateDynamic("externalTrafficPolicy")(externalTrafficPolicy.asInstanceOf[js.Any])
    if (healthCheckNodePort != null) __obj.updateDynamic("healthCheckNodePort")(healthCheckNodePort.asInstanceOf[js.Any])
    if (ipFamily != null) __obj.updateDynamic("ipFamily")(ipFamily.asInstanceOf[js.Any])
    if (loadBalancerIP != null) __obj.updateDynamic("loadBalancerIP")(loadBalancerIP.asInstanceOf[js.Any])
    if (loadBalancerSourceRanges != null) __obj.updateDynamic("loadBalancerSourceRanges")(loadBalancerSourceRanges.asInstanceOf[js.Any])
    if (ports != null) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    if (publishNotReadyAddresses != null) __obj.updateDynamic("publishNotReadyAddresses")(publishNotReadyAddresses.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (sessionAffinity != null) __obj.updateDynamic("sessionAffinity")(sessionAffinity.asInstanceOf[js.Any])
    if (sessionAffinityConfig != null) __obj.updateDynamic("sessionAffinityConfig")(sessionAffinityConfig.asInstanceOf[js.Any])
    if (topologyKeys != null) __obj.updateDynamic("topologyKeys")(topologyKeys.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceSpec]
  }
}

