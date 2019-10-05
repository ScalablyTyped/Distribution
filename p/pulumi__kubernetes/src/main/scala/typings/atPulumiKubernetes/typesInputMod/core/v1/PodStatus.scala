package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodStatus represents information about the status of a pod. Status may trail the actual state
  * of a system, especially if the node that hosts the pod cannot contact the control plane.
  */
trait PodStatus extends js.Object {
  /**
    * Current service state of pod. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
    */
  var conditions: js.UndefOr[Input[js.Array[Input[PodCondition]]]] = js.undefined
  /**
    * The list has one entry per container in the manifest. Each entry is currently the output of
    * `docker inspect`. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
    */
  var containerStatuses: js.UndefOr[Input[js.Array[Input[ContainerStatus]]]] = js.undefined
  /**
    * Status for any ephemeral containers that have run in this pod. This field is alpha-level
    * and is only populated by servers that enable the EphemeralContainers feature.
    */
  var ephemeralContainerStatuses: js.UndefOr[Input[js.Array[Input[ContainerStatus]]]] = js.undefined
  /**
    * IP address of the host to which the pod is assigned. Empty if not yet scheduled.
    */
  var hostIP: js.UndefOr[Input[String]] = js.undefined
  /**
    * The list has one entry per init container in the manifest. The most recent successful init
    * container will have ready = true, the most recently started container will have startTime
    * set. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
    */
  var initContainerStatuses: js.UndefOr[Input[js.Array[Input[ContainerStatus]]]] = js.undefined
  /**
    * A human readable message indicating details about why the pod is in this condition.
    */
  var message: js.UndefOr[Input[String]] = js.undefined
  /**
    * nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot
    * be scheduled right away as preemption victims receive their graceful termination periods.
    * This field does not guarantee that the pod will be scheduled on this node. Scheduler may
    * decide to place the pod elsewhere if other nodes become available sooner. Scheduler may
    * also decide to give the resources on this node to a higher priority pod that is created
    * after preemption. As a result, this field may be different than PodSpec.nodeName when the
    * pod is scheduled.
    */
  var nominatedNodeName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle.
    * The conditions array, the reason and message fields, and the individual container status
    * arrays contain more detail about the pod's status. There are five possible phase values:
    *
    * Pending: The pod has been accepted by the Kubernetes system, but one or more of the
    * container images has not been created. This includes time before being scheduled as well as
    * time spent downloading images over the network, which could take a while. Running: The pod
    * has been bound to a node, and all of the containers have been created. At least one
    * container is still running, or is in the process of starting or restarting. Succeeded: All
    * containers in the pod have terminated in success, and will not be restarted. Failed: All
    * containers in the pod have terminated, and at least one container has terminated in
    * failure. The container either exited with non-zero status or was terminated by the system.
    * Unknown: For some reason the state of the pod could not be obtained, typically due to an
    * error in communicating with the host of the pod.
    *
    * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
    */
  var phase: js.UndefOr[Input[String]] = js.undefined
  /**
    * IP address allocated to the pod. Routable at least within the cluster. Empty if not yet
    * allocated.
    */
  var podIP: js.UndefOr[Input[String]] = js.undefined
  /**
    * podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th
    * entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4
    * and IPv6. This list is empty if no IPs have been allocated yet.
    */
  var podIPs: js.UndefOr[Input[js.Array[Input[PodIP]]]] = js.undefined
  /**
    * The Quality of Service (QOS) classification assigned to the pod based on resource
    * requirements See PodQOSClass type for available QOS classes More info:
    * https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md
    */
  var qosClass: js.UndefOr[Input[String]] = js.undefined
  /**
    * A brief CamelCase message indicating details about why the pod is in this state. e.g.
    * 'Evicted'
    */
  var reason: js.UndefOr[Input[String]] = js.undefined
  /**
    * RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before
    * the Kubelet pulled the container image(s) for the pod.
    */
  var startTime: js.UndefOr[Input[String]] = js.undefined
}

object PodStatus {
  @scala.inline
  def apply(
    conditions: Input[js.Array[Input[PodCondition]]] = null,
    containerStatuses: Input[js.Array[Input[ContainerStatus]]] = null,
    ephemeralContainerStatuses: Input[js.Array[Input[ContainerStatus]]] = null,
    hostIP: Input[String] = null,
    initContainerStatuses: Input[js.Array[Input[ContainerStatus]]] = null,
    message: Input[String] = null,
    nominatedNodeName: Input[String] = null,
    phase: Input[String] = null,
    podIP: Input[String] = null,
    podIPs: Input[js.Array[Input[PodIP]]] = null,
    qosClass: Input[String] = null,
    reason: Input[String] = null,
    startTime: Input[String] = null
  ): PodStatus = {
    val __obj = js.Dynamic.literal()
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (containerStatuses != null) __obj.updateDynamic("containerStatuses")(containerStatuses.asInstanceOf[js.Any])
    if (ephemeralContainerStatuses != null) __obj.updateDynamic("ephemeralContainerStatuses")(ephemeralContainerStatuses.asInstanceOf[js.Any])
    if (hostIP != null) __obj.updateDynamic("hostIP")(hostIP.asInstanceOf[js.Any])
    if (initContainerStatuses != null) __obj.updateDynamic("initContainerStatuses")(initContainerStatuses.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (nominatedNodeName != null) __obj.updateDynamic("nominatedNodeName")(nominatedNodeName.asInstanceOf[js.Any])
    if (phase != null) __obj.updateDynamic("phase")(phase.asInstanceOf[js.Any])
    if (podIP != null) __obj.updateDynamic("podIP")(podIP.asInstanceOf[js.Any])
    if (podIPs != null) __obj.updateDynamic("podIPs")(podIPs.asInstanceOf[js.Any])
    if (qosClass != null) __obj.updateDynamic("qosClass")(qosClass.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodStatus]
  }
}

