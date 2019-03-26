package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val clusterIP: java.lang.String
  /**
    * externalIPs is a list of IP addresses for which nodes in the cluster will also accept
    * traffic for this service.  These IPs are not managed by Kubernetes.  The user is
    * responsible for ensuring that traffic arrives at a node with this IP.  A common example is
    * external load-balancers that are not part of the Kubernetes system.
    */
  val externalIPs: js.Array[java.lang.String]
  /**
    * externalName is the external reference that kubedns or equivalent will return as a CNAME
    * record for this service. No proxying will be involved. Must be a valid RFC-1123 hostname
    * (https://tools.ietf.org/html/rfc1123) and requires Type to be ExternalName.
    */
  val externalName: java.lang.String
  /**
    * externalTrafficPolicy denotes if this Service desires to route external traffic to
    * node-local or cluster-wide endpoints. "Local" preserves the client source IP and avoids a
    * second hop for LoadBalancer and Nodeport type services, but risks potentially imbalanced
    * traffic spreading. "Cluster" obscures the client source IP and may cause a second hop to
    * another node, but should have good overall load-spreading.
    */
  val externalTrafficPolicy: java.lang.String
  /**
    * healthCheckNodePort specifies the healthcheck nodePort for the service. If not specified,
    * HealthCheckNodePort is created by the service api backend with the allocated nodePort. Will
    * use user-specified nodePort value if specified by the client. Only effects when Type is set
    * to LoadBalancer and ExternalTrafficPolicy is set to Local.
    */
  val healthCheckNodePort: scala.Double
  /**
    * Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP
    * specified in this field. This feature depends on whether the underlying cloud-provider
    * supports specifying the loadBalancerIP when a load balancer is created. This field will be
    * ignored if the cloud-provider does not support the feature.
    */
  val loadBalancerIP: java.lang.String
  /**
    * If specified and supported by the platform, this will restrict traffic through the
    * cloud-provider load-balancer will be restricted to the specified client IPs. This field
    * will be ignored if the cloud-provider does not support the feature." More info:
    * https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/
    */
  val loadBalancerSourceRanges: js.Array[java.lang.String]
  /**
    * The list of ports that are exposed by this service. More info:
    * https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
    */
  val ports: js.Array[ServicePort]
  /**
    * publishNotReadyAddresses, when set to true, indicates that DNS implementations must publish
    * the notReadyAddresses of subsets for the Endpoints associated with the Service. The default
    * value is false. The primary use case for setting this field is to use a StatefulSet's
    * Headless Service to propagate SRV records for its Pods without respect to their readiness
    * for purpose of peer discovery.
    */
  val publishNotReadyAddresses: scala.Boolean
  /**
    * Route service traffic to pods with label keys and values matching this selector. If empty
    * or not present, the service is assumed to have an external process managing its endpoints,
    * which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and
    * LoadBalancer. Ignored if type is ExternalName. More info:
    * https://kubernetes.io/docs/concepts/services-networking/service/
    */
  val selector: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * Supports "ClientIP" and "None". Used to maintain session affinity. Enable client IP based
    * session affinity. Must be ClientIP or None. Defaults to None. More info:
    * https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
    */
  val sessionAffinity: java.lang.String
  /**
    * sessionAffinityConfig contains the configurations of session affinity.
    */
  val sessionAffinityConfig: SessionAffinityConfig
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
  val `type`: java.lang.String
}

object ServiceSpec {
  @scala.inline
  def apply(
    clusterIP: java.lang.String,
    externalIPs: js.Array[java.lang.String],
    externalName: java.lang.String,
    externalTrafficPolicy: java.lang.String,
    healthCheckNodePort: scala.Double,
    loadBalancerIP: java.lang.String,
    loadBalancerSourceRanges: js.Array[java.lang.String],
    ports: js.Array[ServicePort],
    publishNotReadyAddresses: scala.Boolean,
    selector: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    sessionAffinity: java.lang.String,
    sessionAffinityConfig: SessionAffinityConfig,
    `type`: java.lang.String
  ): ServiceSpec = {
    val __obj = js.Dynamic.literal(clusterIP = clusterIP, externalIPs = externalIPs, externalName = externalName, externalTrafficPolicy = externalTrafficPolicy, healthCheckNodePort = healthCheckNodePort, loadBalancerIP = loadBalancerIP, loadBalancerSourceRanges = loadBalancerSourceRanges, ports = ports, publishNotReadyAddresses = publishNotReadyAddresses, selector = selector, sessionAffinity = sessionAffinity, sessionAffinityConfig = sessionAffinityConfig)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ServiceSpec]
  }
}

