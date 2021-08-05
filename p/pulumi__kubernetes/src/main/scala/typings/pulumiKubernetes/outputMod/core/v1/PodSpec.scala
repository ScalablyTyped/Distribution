package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodSpec is a description of a pod.
  */
trait PodSpec extends StObject {
  
  /**
    * Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.
    */
  var activeDeadlineSeconds: Double
  
  /**
    * If specified, the pod's scheduling constraints
    */
  var affinity: Affinity
  
  /**
    * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
    */
  var automountServiceAccountToken: Boolean
  
  /**
    * List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.
    */
  var containers: js.Array[Container]
  
  /**
    * Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based on DNSPolicy.
    */
  var dnsConfig: PodDNSConfig
  
  /**
    * Set DNS policy for the pod. Defaults to "ClusterFirst". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.
    */
  var dnsPolicy: String
  
  /**
    * EnableServiceLinks indicates whether information about services should be injected into pod's environment variables, matching the syntax of Docker links. Optional: Defaults to true.
    */
  var enableServiceLinks: Boolean
  
  /**
    * List of ephemeral containers run in this pod. Ephemeral containers may be run in an existing pod to perform user-initiated actions such as debugging. This list cannot be specified when creating a pod, and it cannot be modified by updating the pod spec. In order to add an ephemeral container to an existing pod, use the pod's ephemeralcontainers subresource. This field is alpha-level and is only honored by servers that enable the EphemeralContainers feature.
    */
  var ephemeralContainers: js.Array[EphemeralContainer]
  
  /**
    * HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts file if specified. This is only valid for non-hostNetwork pods.
    */
  var hostAliases: js.Array[HostAlias]
  
  /**
    * Use the host's ipc namespace. Optional: Default to false.
    */
  var hostIPC: Boolean
  
  /**
    * Host networking requested for this pod. Use the host's network namespace. If this option is set, the ports that will be used must be specified. Default to false.
    */
  var hostNetwork: Boolean
  
  /**
    * Use the host's pid namespace. Optional: Default to false.
    */
  var hostPID: Boolean
  
  /**
    * Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a system-defined value.
    */
  var hostname: String
  
  /**
    * ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
    */
  var imagePullSecrets: js.Array[LocalObjectReference]
  
  /**
    * List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/
    */
  var initContainers: js.Array[Container]
  
  /**
    * NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.
    */
  var nodeName: String
  
  /**
    * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
    */
  var nodeSelector: StringDictionary[String]
  
  /**
    * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. This field will be autopopulated at admission time by the RuntimeClass admission controller. If the RuntimeClass admission controller is enabled, overhead must not be set in Pod create requests. The RuntimeClass admission controller will reject Pod create requests which have the overhead already set. If RuntimeClass is configured and selected in the PodSpec, Overhead will be set to the value defined in the corresponding RuntimeClass, otherwise it will remain unset and treated as zero. More info: https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.16, and is only honored by servers that enable the PodOverhead feature.
    */
  var overhead: StringDictionary[String]
  
  /**
    * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is beta-level, gated by the NonPreemptingPriority feature-gate.
    */
  var preemptionPolicy: String
  
  /**
    * The priority value. Various system components use this field to find the priority of the pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority.
    */
  var priority: Double
  
  /**
    * If specified, indicates the pod's priority. "system-node-critical" and "system-cluster-critical" are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.
    */
  var priorityClassName: String
  
  /**
    * If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when all its containers are ready AND all conditions specified in the readiness gates have status equal to "True" More info: https://git.k8s.io/enhancements/keps/sig-network/0007-pod-ready%2B%2B.md
    */
  var readinessGates: js.Array[PodReadinessGate]
  
  /**
    * Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
    */
  var restartPolicy: String
  
  /**
    * RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod.  If no RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the "legacy" RuntimeClass will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info: https://git.k8s.io/enhancements/keps/sig-node/runtime-class.md This is a beta feature as of Kubernetes v1.14.
    */
  var runtimeClassName: String
  
  /**
    * If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.
    */
  var schedulerName: String
  
  /**
    * SecurityContext holds pod-level security attributes and common container settings. Optional: Defaults to empty.  See type description for default values of each field.
    */
  var securityContext: PodSecurityContext
  
  /**
    * DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.
    */
  var serviceAccount: String
  
  /**
    * ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
    */
  var serviceAccountName: String
  
  /**
    * If true the pod's hostname will be configured as the pod's FQDN, rather than the leaf name (the default). In Linux containers, this means setting the FQDN in the hostname field of the kernel (the nodename field of struct utsname). In Windows containers, this means setting the registry value of hostname for the registry key HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\Tcpip\Parameters to FQDN. If a pod does not have FQDN, this has no effect. Default to false.
    */
  var setHostnameAsFQDN: Boolean
  
  /**
    * Share a single process namespace between all of the containers in a pod. When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Default to false.
    */
  var shareProcessNamespace: Boolean
  
  /**
    * If specified, the fully qualified Pod hostname will be "<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>". If not specified, the pod will not have a domainname at all.
    */
  var subdomain: String
  
  /**
    * Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.
    */
  var terminationGracePeriodSeconds: Double
  
  /**
    * If specified, the pod's tolerations.
    */
  var tolerations: js.Array[Toleration]
  
  /**
    * TopologySpreadConstraints describes how a group of pods ought to spread across topology domains. Scheduler will schedule pods in a way which abides by the constraints. All topologySpreadConstraints are ANDed.
    */
  var topologySpreadConstraints: js.Array[TopologySpreadConstraint]
  
  /**
    * List of volumes that can be mounted by containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes
    */
  var volumes: js.Array[Volume]
}
object PodSpec {
  
  inline def apply(
    activeDeadlineSeconds: Double,
    affinity: Affinity,
    automountServiceAccountToken: Boolean,
    containers: js.Array[Container],
    dnsConfig: PodDNSConfig,
    dnsPolicy: String,
    enableServiceLinks: Boolean,
    ephemeralContainers: js.Array[EphemeralContainer],
    hostAliases: js.Array[HostAlias],
    hostIPC: Boolean,
    hostNetwork: Boolean,
    hostPID: Boolean,
    hostname: String,
    imagePullSecrets: js.Array[LocalObjectReference],
    initContainers: js.Array[Container],
    nodeName: String,
    nodeSelector: StringDictionary[String],
    overhead: StringDictionary[String],
    preemptionPolicy: String,
    priority: Double,
    priorityClassName: String,
    readinessGates: js.Array[PodReadinessGate],
    restartPolicy: String,
    runtimeClassName: String,
    schedulerName: String,
    securityContext: PodSecurityContext,
    serviceAccount: String,
    serviceAccountName: String,
    setHostnameAsFQDN: Boolean,
    shareProcessNamespace: Boolean,
    subdomain: String,
    terminationGracePeriodSeconds: Double,
    tolerations: js.Array[Toleration],
    topologySpreadConstraints: js.Array[TopologySpreadConstraint],
    volumes: js.Array[Volume]
  ): PodSpec = {
    val __obj = js.Dynamic.literal(activeDeadlineSeconds = activeDeadlineSeconds.asInstanceOf[js.Any], affinity = affinity.asInstanceOf[js.Any], automountServiceAccountToken = automountServiceAccountToken.asInstanceOf[js.Any], containers = containers.asInstanceOf[js.Any], dnsConfig = dnsConfig.asInstanceOf[js.Any], dnsPolicy = dnsPolicy.asInstanceOf[js.Any], enableServiceLinks = enableServiceLinks.asInstanceOf[js.Any], ephemeralContainers = ephemeralContainers.asInstanceOf[js.Any], hostAliases = hostAliases.asInstanceOf[js.Any], hostIPC = hostIPC.asInstanceOf[js.Any], hostNetwork = hostNetwork.asInstanceOf[js.Any], hostPID = hostPID.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], imagePullSecrets = imagePullSecrets.asInstanceOf[js.Any], initContainers = initContainers.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeSelector = nodeSelector.asInstanceOf[js.Any], overhead = overhead.asInstanceOf[js.Any], preemptionPolicy = preemptionPolicy.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], priorityClassName = priorityClassName.asInstanceOf[js.Any], readinessGates = readinessGates.asInstanceOf[js.Any], restartPolicy = restartPolicy.asInstanceOf[js.Any], runtimeClassName = runtimeClassName.asInstanceOf[js.Any], schedulerName = schedulerName.asInstanceOf[js.Any], securityContext = securityContext.asInstanceOf[js.Any], serviceAccount = serviceAccount.asInstanceOf[js.Any], serviceAccountName = serviceAccountName.asInstanceOf[js.Any], setHostnameAsFQDN = setHostnameAsFQDN.asInstanceOf[js.Any], shareProcessNamespace = shareProcessNamespace.asInstanceOf[js.Any], subdomain = subdomain.asInstanceOf[js.Any], terminationGracePeriodSeconds = terminationGracePeriodSeconds.asInstanceOf[js.Any], tolerations = tolerations.asInstanceOf[js.Any], topologySpreadConstraints = topologySpreadConstraints.asInstanceOf[js.Any], volumes = volumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodSpec]
  }
  
  extension [Self <: PodSpec](x: Self) {
    
    inline def setActiveDeadlineSeconds(value: Double): Self = StObject.set(x, "activeDeadlineSeconds", value.asInstanceOf[js.Any])
    
    inline def setAffinity(value: Affinity): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
    
    inline def setAutomountServiceAccountToken(value: Boolean): Self = StObject.set(x, "automountServiceAccountToken", value.asInstanceOf[js.Any])
    
    inline def setContainers(value: js.Array[Container]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersVarargs(value: Container*): Self = StObject.set(x, "containers", js.Array(value :_*))
    
    inline def setDnsConfig(value: PodDNSConfig): Self = StObject.set(x, "dnsConfig", value.asInstanceOf[js.Any])
    
    inline def setDnsPolicy(value: String): Self = StObject.set(x, "dnsPolicy", value.asInstanceOf[js.Any])
    
    inline def setEnableServiceLinks(value: Boolean): Self = StObject.set(x, "enableServiceLinks", value.asInstanceOf[js.Any])
    
    inline def setEphemeralContainers(value: js.Array[EphemeralContainer]): Self = StObject.set(x, "ephemeralContainers", value.asInstanceOf[js.Any])
    
    inline def setEphemeralContainersVarargs(value: EphemeralContainer*): Self = StObject.set(x, "ephemeralContainers", js.Array(value :_*))
    
    inline def setHostAliases(value: js.Array[HostAlias]): Self = StObject.set(x, "hostAliases", value.asInstanceOf[js.Any])
    
    inline def setHostAliasesVarargs(value: HostAlias*): Self = StObject.set(x, "hostAliases", js.Array(value :_*))
    
    inline def setHostIPC(value: Boolean): Self = StObject.set(x, "hostIPC", value.asInstanceOf[js.Any])
    
    inline def setHostNetwork(value: Boolean): Self = StObject.set(x, "hostNetwork", value.asInstanceOf[js.Any])
    
    inline def setHostPID(value: Boolean): Self = StObject.set(x, "hostPID", value.asInstanceOf[js.Any])
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setImagePullSecrets(value: js.Array[LocalObjectReference]): Self = StObject.set(x, "imagePullSecrets", value.asInstanceOf[js.Any])
    
    inline def setImagePullSecretsVarargs(value: LocalObjectReference*): Self = StObject.set(x, "imagePullSecrets", js.Array(value :_*))
    
    inline def setInitContainers(value: js.Array[Container]): Self = StObject.set(x, "initContainers", value.asInstanceOf[js.Any])
    
    inline def setInitContainersVarargs(value: Container*): Self = StObject.set(x, "initContainers", js.Array(value :_*))
    
    inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    inline def setNodeSelector(value: StringDictionary[String]): Self = StObject.set(x, "nodeSelector", value.asInstanceOf[js.Any])
    
    inline def setOverhead(value: StringDictionary[String]): Self = StObject.set(x, "overhead", value.asInstanceOf[js.Any])
    
    inline def setPreemptionPolicy(value: String): Self = StObject.set(x, "preemptionPolicy", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityClassName(value: String): Self = StObject.set(x, "priorityClassName", value.asInstanceOf[js.Any])
    
    inline def setReadinessGates(value: js.Array[PodReadinessGate]): Self = StObject.set(x, "readinessGates", value.asInstanceOf[js.Any])
    
    inline def setReadinessGatesVarargs(value: PodReadinessGate*): Self = StObject.set(x, "readinessGates", js.Array(value :_*))
    
    inline def setRestartPolicy(value: String): Self = StObject.set(x, "restartPolicy", value.asInstanceOf[js.Any])
    
    inline def setRuntimeClassName(value: String): Self = StObject.set(x, "runtimeClassName", value.asInstanceOf[js.Any])
    
    inline def setSchedulerName(value: String): Self = StObject.set(x, "schedulerName", value.asInstanceOf[js.Any])
    
    inline def setSecurityContext(value: PodSecurityContext): Self = StObject.set(x, "securityContext", value.asInstanceOf[js.Any])
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountName(value: String): Self = StObject.set(x, "serviceAccountName", value.asInstanceOf[js.Any])
    
    inline def setSetHostnameAsFQDN(value: Boolean): Self = StObject.set(x, "setHostnameAsFQDN", value.asInstanceOf[js.Any])
    
    inline def setShareProcessNamespace(value: Boolean): Self = StObject.set(x, "shareProcessNamespace", value.asInstanceOf[js.Any])
    
    inline def setSubdomain(value: String): Self = StObject.set(x, "subdomain", value.asInstanceOf[js.Any])
    
    inline def setTerminationGracePeriodSeconds(value: Double): Self = StObject.set(x, "terminationGracePeriodSeconds", value.asInstanceOf[js.Any])
    
    inline def setTolerations(value: js.Array[Toleration]): Self = StObject.set(x, "tolerations", value.asInstanceOf[js.Any])
    
    inline def setTolerationsVarargs(value: Toleration*): Self = StObject.set(x, "tolerations", js.Array(value :_*))
    
    inline def setTopologySpreadConstraints(value: js.Array[TopologySpreadConstraint]): Self = StObject.set(x, "topologySpreadConstraints", value.asInstanceOf[js.Any])
    
    inline def setTopologySpreadConstraintsVarargs(value: TopologySpreadConstraint*): Self = StObject.set(x, "topologySpreadConstraints", js.Array(value :_*))
    
    inline def setVolumes(value: js.Array[Volume]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesVarargs(value: Volume*): Self = StObject.set(x, "volumes", js.Array(value :_*))
  }
}
