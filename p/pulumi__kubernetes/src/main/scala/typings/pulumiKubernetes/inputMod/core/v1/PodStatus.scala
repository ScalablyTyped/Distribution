package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodStatus represents information about the status of a pod. Status may trail the actual state of a system, especially if the node that hosts the pod cannot contact the control plane.
  */
trait PodStatus extends StObject {
  
  /**
    * Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
    */
  var conditions: js.UndefOr[Input[js.Array[Input[PodCondition]]]] = js.undefined
  
  /**
    * The list has one entry per container in the manifest. Each entry is currently the output of `docker inspect`. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
    */
  var containerStatuses: js.UndefOr[Input[js.Array[Input[ContainerStatus]]]] = js.undefined
  
  /**
    * Status for any ephemeral containers that have run in this pod. This field is alpha-level and is only populated by servers that enable the EphemeralContainers feature.
    */
  var ephemeralContainerStatuses: js.UndefOr[Input[js.Array[Input[ContainerStatus]]]] = js.undefined
  
  /**
    * IP address of the host to which the pod is assigned. Empty if not yet scheduled.
    */
  var hostIP: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The list has one entry per init container in the manifest. The most recent successful init container will have ready = true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
    */
  var initContainerStatuses: js.UndefOr[Input[js.Array[Input[ContainerStatus]]]] = js.undefined
  
  /**
    * A human readable message indicating details about why the pod is in this condition.
    */
  var message: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot be scheduled right away as preemption victims receive their graceful termination periods. This field does not guarantee that the pod will be scheduled on this node. Scheduler may decide to place the pod elsewhere if other nodes become available sooner. Scheduler may also decide to give the resources on this node to a higher priority pod that is created after preemption. As a result, this field may be different than PodSpec.nodeName when the pod is scheduled.
    */
  var nominatedNodeName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the reason and message fields, and the individual container status arrays contain more detail about the pod's status. There are five possible phase values:
    *
    * Pending: The pod has been accepted by the Kubernetes system, but one or more of the container images has not been created. This includes time before being scheduled as well as time spent downloading images over the network, which could take a while. Running: The pod has been bound to a node, and all of the containers have been created. At least one container is still running, or is in the process of starting or restarting. Succeeded: All containers in the pod have terminated in success, and will not be restarted. Failed: All containers in the pod have terminated, and at least one container has terminated in failure. The container either exited with non-zero status or was terminated by the system. Unknown: For some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod.
    *
    * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
    */
  var phase: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.
    */
  var podIP: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated yet.
    */
  var podIPs: js.UndefOr[Input[js.Array[Input[PodIP]]]] = js.undefined
  
  /**
    * The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md
    */
  var qosClass: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A brief CamelCase message indicating details about why the pod is in this state. e.g. 'Evicted'
    */
  var reason: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the container image(s) for the pod.
    */
  var startTime: js.UndefOr[Input[String]] = js.undefined
}
object PodStatus {
  
  inline def apply(): PodStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodStatus]
  }
  
  extension [Self <: PodStatus](x: Self) {
    
    inline def setConditions(value: Input[js.Array[Input[PodCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: Input[PodCondition]*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    inline def setContainerStatuses(value: Input[js.Array[Input[ContainerStatus]]]): Self = StObject.set(x, "containerStatuses", value.asInstanceOf[js.Any])
    
    inline def setContainerStatusesUndefined: Self = StObject.set(x, "containerStatuses", js.undefined)
    
    inline def setContainerStatusesVarargs(value: Input[ContainerStatus]*): Self = StObject.set(x, "containerStatuses", js.Array(value :_*))
    
    inline def setEphemeralContainerStatuses(value: Input[js.Array[Input[ContainerStatus]]]): Self = StObject.set(x, "ephemeralContainerStatuses", value.asInstanceOf[js.Any])
    
    inline def setEphemeralContainerStatusesUndefined: Self = StObject.set(x, "ephemeralContainerStatuses", js.undefined)
    
    inline def setEphemeralContainerStatusesVarargs(value: Input[ContainerStatus]*): Self = StObject.set(x, "ephemeralContainerStatuses", js.Array(value :_*))
    
    inline def setHostIP(value: Input[String]): Self = StObject.set(x, "hostIP", value.asInstanceOf[js.Any])
    
    inline def setHostIPUndefined: Self = StObject.set(x, "hostIP", js.undefined)
    
    inline def setInitContainerStatuses(value: Input[js.Array[Input[ContainerStatus]]]): Self = StObject.set(x, "initContainerStatuses", value.asInstanceOf[js.Any])
    
    inline def setInitContainerStatusesUndefined: Self = StObject.set(x, "initContainerStatuses", js.undefined)
    
    inline def setInitContainerStatusesVarargs(value: Input[ContainerStatus]*): Self = StObject.set(x, "initContainerStatuses", js.Array(value :_*))
    
    inline def setMessage(value: Input[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setNominatedNodeName(value: Input[String]): Self = StObject.set(x, "nominatedNodeName", value.asInstanceOf[js.Any])
    
    inline def setNominatedNodeNameUndefined: Self = StObject.set(x, "nominatedNodeName", js.undefined)
    
    inline def setPhase(value: Input[String]): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
    
    inline def setPodIP(value: Input[String]): Self = StObject.set(x, "podIP", value.asInstanceOf[js.Any])
    
    inline def setPodIPUndefined: Self = StObject.set(x, "podIP", js.undefined)
    
    inline def setPodIPs(value: Input[js.Array[Input[PodIP]]]): Self = StObject.set(x, "podIPs", value.asInstanceOf[js.Any])
    
    inline def setPodIPsUndefined: Self = StObject.set(x, "podIPs", js.undefined)
    
    inline def setPodIPsVarargs(value: Input[PodIP]*): Self = StObject.set(x, "podIPs", js.Array(value :_*))
    
    inline def setQosClass(value: Input[String]): Self = StObject.set(x, "qosClass", value.asInstanceOf[js.Any])
    
    inline def setQosClassUndefined: Self = StObject.set(x, "qosClass", js.undefined)
    
    inline def setReason(value: Input[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setStartTime(value: Input[String]): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
