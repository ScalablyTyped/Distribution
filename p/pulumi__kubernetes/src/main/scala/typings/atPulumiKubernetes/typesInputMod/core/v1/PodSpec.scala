package typings.atPulumiKubernetes.typesInputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodSpec is a description of a pod.
  */
trait PodSpec extends js.Object {
  /**
    * Optional duration in seconds the pod may be active on the node relative to StartTime before
    * the system will actively try to mark it failed and kill associated containers. Value must
    * be a positive integer.
    */
  var activeDeadlineSeconds: js.UndefOr[Input[Double]] = js.undefined
  /**
    * If specified, the pod's scheduling constraints
    */
  var affinity: js.UndefOr[Input[Affinity]] = js.undefined
  /**
    * AutomountServiceAccountToken indicates whether a service account token should be
    * automatically mounted.
    */
  var automountServiceAccountToken: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * List of containers belonging to the pod. Containers cannot currently be added or removed.
    * There must be at least one container in a Pod. Cannot be updated.
    */
  var containers: Input[js.Array[Input[Container]]]
  /**
    * Specifies the DNS parameters of a pod. Parameters specified here will be merged to the
    * generated DNS configuration based on DNSPolicy.
    */
  var dnsConfig: js.UndefOr[Input[PodDNSConfig]] = js.undefined
  /**
    * Set DNS policy for the pod. Defaults to "ClusterFirst". Valid values are
    * 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in
    * DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set
    * along with hostNetwork, you have to specify DNS policy explicitly to
    * 'ClusterFirstWithHostNet'.
    */
  var dnsPolicy: js.UndefOr[Input[String]] = js.undefined
  /**
    * EnableServiceLinks indicates whether information about services should be injected into
    * pod's environment variables, matching the syntax of Docker links. Optional: Defaults to
    * true.
    */
  var enableServiceLinks: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * List of ephemeral containers run in this pod. Ephemeral containers may be run in an
    * existing pod to perform user-initiated actions such as debugging. This list cannot be
    * specified when creating a pod, and it cannot be modified by updating the pod spec. In order
    * to add an ephemeral container to an existing pod, use the pod's ephemeralcontainers
    * subresource. This field is alpha-level and is only honored by servers that enable the
    * EphemeralContainers feature.
    */
  var ephemeralContainers: js.UndefOr[Input[js.Array[Input[EphemeralContainer]]]] = js.undefined
  /**
    * HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts
    * file if specified. This is only valid for non-hostNetwork pods.
    */
  var hostAliases: js.UndefOr[Input[js.Array[Input[HostAlias]]]] = js.undefined
  /**
    * Use the host's ipc namespace. Optional: Default to false.
    */
  var hostIPC: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Host networking requested for this pod. Use the host's network namespace. If this option is
    * set, the ports that will be used must be specified. Default to false.
    */
  var hostNetwork: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Use the host's pid namespace. Optional: Default to false.
    */
  var hostPID: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a
    * system-defined value.
    */
  var hostname: js.UndefOr[Input[String]] = js.undefined
  /**
    * ImagePullSecrets is an optional list of references to secrets in the same namespace to use
    * for pulling any of the images used by this PodSpec. If specified, these secrets will be
    * passed to individual puller implementations for them to use. For example, in the case of
    * docker, only DockerConfig type secrets are honored. More info:
    * https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
    */
  var imagePullSecrets: js.UndefOr[Input[js.Array[Input[LocalObjectReference]]]] = js.undefined
  /**
    * List of initialization containers belonging to the pod. Init containers are executed in
    * order prior to containers being started. If any init container fails, the pod is considered
    * to have failed and is handled according to its restartPolicy. The name for an init
    * container or normal container must be unique among all containers. Init containers may not
    * have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes. The
    * resourceRequirements of an init container are taken into account during scheduling by
    * finding the highest request/limit for each resource type, and then using the max of of that
    * value or the sum of the normal containers. Limits are applied to init containers in a
    * similar fashion. Init containers cannot currently be added or removed. Cannot be updated.
    * More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/
    */
  var initContainers: js.UndefOr[Input[js.Array[Input[Container]]]] = js.undefined
  /**
    * NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the
    * scheduler simply schedules this pod onto that node, assuming that it fits resource
    * requirements.
    */
  var nodeName: js.UndefOr[Input[String]] = js.undefined
  /**
    * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which
    * must match a node's labels for the pod to be scheduled on that node. More info:
    * https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
    */
  var nodeSelector: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * Overhead represents the resource overhead associated with running a pod for a given
    * RuntimeClass. This field will be autopopulated at admission time by the RuntimeClass
    * admission controller. If the RuntimeClass admission controller is enabled, overhead must
    * not be set in Pod create requests. The RuntimeClass admission controller will reject Pod
    * create requests which have the overhead already set. If RuntimeClass is configured and
    * selected in the PodSpec, Overhead will be set to the value defined in the corresponding
    * RuntimeClass, otherwise it will remain unset and treated as zero. More info:
    * https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is
    * alpha-level as of Kubernetes v1.16, and is only honored by servers that enable the
    * PodOverhead feature.
    */
  var overhead: js.UndefOr[Input[js.Object]] = js.undefined
  /**
    * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never,
    * PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level
    * and is only honored by servers that enable the NonPreemptingPriority feature.
    */
  var preemptionPolicy: js.UndefOr[Input[String]] = js.undefined
  /**
    * The priority value. Various system components use this field to find the priority of the
    * pod. When Priority Admission Controller is enabled, it prevents users from setting this
    * field. The admission controller populates this field from PriorityClassName. The higher the
    * value, the higher the priority.
    */
  var priority: js.UndefOr[Input[Double]] = js.undefined
  /**
    * If specified, indicates the pod's priority. "system-node-critical" and
    * "system-cluster-critical" are two special keywords which indicate the highest priorities
    * with the former being the highest priority. Any other name must be defined by creating a
    * PriorityClass object with that name. If not specified, the pod priority will be default or
    * zero if there is no default.
    */
  var priorityClassName: js.UndefOr[Input[String]] = js.undefined
  /**
    * If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when
    * all its containers are ready AND all conditions specified in the readiness gates have
    * status equal to "True" More info:
    * https://git.k8s.io/enhancements/keps/sig-network/0007-pod-ready%2B%2B.md
    */
  var readinessGates: js.UndefOr[Input[js.Array[Input[PodReadinessGate]]]] = js.undefined
  /**
    * Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default
    * to Always. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
    */
  var restartPolicy: js.UndefOr[Input[String]] = js.undefined
  /**
    * RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be
    * used to run this pod.  If no RuntimeClass resource matches the named class, the pod will
    * not be run. If unset or empty, the "legacy" RuntimeClass will be used, which is an implicit
    * class with an empty definition that uses the default runtime handler. More info:
    * https://git.k8s.io/enhancements/keps/sig-node/runtime-class.md This is a beta feature as of
    * Kubernetes v1.14.
    */
  var runtimeClassName: js.UndefOr[Input[String]] = js.undefined
  /**
    * If specified, the pod will be dispatched by specified scheduler. If not specified, the pod
    * will be dispatched by default scheduler.
    */
  var schedulerName: js.UndefOr[Input[String]] = js.undefined
  /**
    * SecurityContext holds pod-level security attributes and common container settings.
    * Optional: Defaults to empty.  See type description for default values of each field.
    */
  var securityContext: js.UndefOr[Input[PodSecurityContext]] = js.undefined
  /**
    * DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use
    * serviceAccountName instead.
    */
  var serviceAccount: js.UndefOr[Input[String]] = js.undefined
  /**
    * ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info:
    * https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
    */
  var serviceAccountName: js.UndefOr[Input[String]] = js.undefined
  /**
    * Share a single process namespace between all of the containers in a pod. When this is set
    * containers will be able to view and signal processes from other containers in the same pod,
    * and the first process in each container will not be assigned PID 1. HostPID and
    * ShareProcessNamespace cannot both be set. Optional: Default to false. This field is
    * beta-level and may be disabled with the PodShareProcessNamespace feature.
    */
  var shareProcessNamespace: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * If specified, the fully qualified Pod hostname will be "<hostname>.<subdomain>.<pod
    * namespace>.svc.<cluster domain>". If not specified, the pod will not have a domainname at
    * all.
    */
  var subdomain: js.UndefOr[Input[String]] = js.undefined
  /**
    * Optional duration in seconds the pod needs to terminate gracefully. May be decreased in
    * delete request. Value must be non-negative integer. The value zero indicates delete
    * immediately. If this value is nil, the default grace period will be used instead. The grace
    * period is the duration in seconds after the processes running in the pod are sent a
    * termination signal and the time when the processes are forcibly halted with a kill signal.
    * Set this value longer than the expected cleanup time for your process. Defaults to 30
    * seconds.
    */
  var terminationGracePeriodSeconds: js.UndefOr[Input[Double]] = js.undefined
  /**
    * If specified, the pod's tolerations.
    */
  var tolerations: js.UndefOr[Input[js.Array[Input[Toleration]]]] = js.undefined
  /**
    * TopologySpreadConstraints describes how a group of pods ought to spread across topology
    * domains. Scheduler will schedule pods in a way which abides by the constraints. This field
    * is alpha-level and is only honored by clusters that enables the EvenPodsSpread feature. All
    * topologySpreadConstraints are ANDed.
    */
  var topologySpreadConstraints: js.UndefOr[Input[js.Array[Input[TopologySpreadConstraint]]]] = js.undefined
  /**
    * List of volumes that can be mounted by containers belonging to the pod. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes
    */
  var volumes: js.UndefOr[Input[js.Array[Input[Volume]]]] = js.undefined
}

object PodSpec {
  @scala.inline
  def apply(
    containers: Input[js.Array[Input[Container]]],
    activeDeadlineSeconds: Input[Double] = null,
    affinity: Input[Affinity] = null,
    automountServiceAccountToken: Input[Boolean] = null,
    dnsConfig: Input[PodDNSConfig] = null,
    dnsPolicy: Input[String] = null,
    enableServiceLinks: Input[Boolean] = null,
    ephemeralContainers: Input[js.Array[Input[EphemeralContainer]]] = null,
    hostAliases: Input[js.Array[Input[HostAlias]]] = null,
    hostIPC: Input[Boolean] = null,
    hostNetwork: Input[Boolean] = null,
    hostPID: Input[Boolean] = null,
    hostname: Input[String] = null,
    imagePullSecrets: Input[js.Array[Input[LocalObjectReference]]] = null,
    initContainers: Input[js.Array[Input[Container]]] = null,
    nodeName: Input[String] = null,
    nodeSelector: Input[StringDictionary[Input[String]]] = null,
    overhead: Input[js.Object] = null,
    preemptionPolicy: Input[String] = null,
    priority: Input[Double] = null,
    priorityClassName: Input[String] = null,
    readinessGates: Input[js.Array[Input[PodReadinessGate]]] = null,
    restartPolicy: Input[String] = null,
    runtimeClassName: Input[String] = null,
    schedulerName: Input[String] = null,
    securityContext: Input[PodSecurityContext] = null,
    serviceAccount: Input[String] = null,
    serviceAccountName: Input[String] = null,
    shareProcessNamespace: Input[Boolean] = null,
    subdomain: Input[String] = null,
    terminationGracePeriodSeconds: Input[Double] = null,
    tolerations: Input[js.Array[Input[Toleration]]] = null,
    topologySpreadConstraints: Input[js.Array[Input[TopologySpreadConstraint]]] = null,
    volumes: Input[js.Array[Input[Volume]]] = null
  ): PodSpec = {
    val __obj = js.Dynamic.literal(containers = containers.asInstanceOf[js.Any])
    if (activeDeadlineSeconds != null) __obj.updateDynamic("activeDeadlineSeconds")(activeDeadlineSeconds.asInstanceOf[js.Any])
    if (affinity != null) __obj.updateDynamic("affinity")(affinity.asInstanceOf[js.Any])
    if (automountServiceAccountToken != null) __obj.updateDynamic("automountServiceAccountToken")(automountServiceAccountToken.asInstanceOf[js.Any])
    if (dnsConfig != null) __obj.updateDynamic("dnsConfig")(dnsConfig.asInstanceOf[js.Any])
    if (dnsPolicy != null) __obj.updateDynamic("dnsPolicy")(dnsPolicy.asInstanceOf[js.Any])
    if (enableServiceLinks != null) __obj.updateDynamic("enableServiceLinks")(enableServiceLinks.asInstanceOf[js.Any])
    if (ephemeralContainers != null) __obj.updateDynamic("ephemeralContainers")(ephemeralContainers.asInstanceOf[js.Any])
    if (hostAliases != null) __obj.updateDynamic("hostAliases")(hostAliases.asInstanceOf[js.Any])
    if (hostIPC != null) __obj.updateDynamic("hostIPC")(hostIPC.asInstanceOf[js.Any])
    if (hostNetwork != null) __obj.updateDynamic("hostNetwork")(hostNetwork.asInstanceOf[js.Any])
    if (hostPID != null) __obj.updateDynamic("hostPID")(hostPID.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (imagePullSecrets != null) __obj.updateDynamic("imagePullSecrets")(imagePullSecrets.asInstanceOf[js.Any])
    if (initContainers != null) __obj.updateDynamic("initContainers")(initContainers.asInstanceOf[js.Any])
    if (nodeName != null) __obj.updateDynamic("nodeName")(nodeName.asInstanceOf[js.Any])
    if (nodeSelector != null) __obj.updateDynamic("nodeSelector")(nodeSelector.asInstanceOf[js.Any])
    if (overhead != null) __obj.updateDynamic("overhead")(overhead.asInstanceOf[js.Any])
    if (preemptionPolicy != null) __obj.updateDynamic("preemptionPolicy")(preemptionPolicy.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (priorityClassName != null) __obj.updateDynamic("priorityClassName")(priorityClassName.asInstanceOf[js.Any])
    if (readinessGates != null) __obj.updateDynamic("readinessGates")(readinessGates.asInstanceOf[js.Any])
    if (restartPolicy != null) __obj.updateDynamic("restartPolicy")(restartPolicy.asInstanceOf[js.Any])
    if (runtimeClassName != null) __obj.updateDynamic("runtimeClassName")(runtimeClassName.asInstanceOf[js.Any])
    if (schedulerName != null) __obj.updateDynamic("schedulerName")(schedulerName.asInstanceOf[js.Any])
    if (securityContext != null) __obj.updateDynamic("securityContext")(securityContext.asInstanceOf[js.Any])
    if (serviceAccount != null) __obj.updateDynamic("serviceAccount")(serviceAccount.asInstanceOf[js.Any])
    if (serviceAccountName != null) __obj.updateDynamic("serviceAccountName")(serviceAccountName.asInstanceOf[js.Any])
    if (shareProcessNamespace != null) __obj.updateDynamic("shareProcessNamespace")(shareProcessNamespace.asInstanceOf[js.Any])
    if (subdomain != null) __obj.updateDynamic("subdomain")(subdomain.asInstanceOf[js.Any])
    if (terminationGracePeriodSeconds != null) __obj.updateDynamic("terminationGracePeriodSeconds")(terminationGracePeriodSeconds.asInstanceOf[js.Any])
    if (tolerations != null) __obj.updateDynamic("tolerations")(tolerations.asInstanceOf[js.Any])
    if (topologySpreadConstraints != null) __obj.updateDynamic("topologySpreadConstraints")(topologySpreadConstraints.asInstanceOf[js.Any])
    if (volumes != null) __obj.updateDynamic("volumes")(volumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodSpec]
  }
}

