package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * PodStatus represents information about the status of a pod. Status may trail the actual state
         * of a system.
         */

trait PodStatus extends js.Object {
  /**
               * Current service state of pod. More info:
               * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
               */
  val conditions: js.Array[PodCondition]
  /**
               * The list has one entry per container in the manifest. Each entry is currently the output of
               * `docker inspect`. More info:
               * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
               */
  val containerStatuses: js.Array[ContainerStatus]
  /**
               * IP address of the host to which the pod is assigned. Empty if not yet scheduled.
               */
  val hostIP: java.lang.String
  /**
               * The list has one entry per init container in the manifest. The most recent successful init
               * container will have ready = true, the most recently started container will have startTime
               * set. More info:
               * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
               */
  val initContainerStatuses: js.Array[ContainerStatus]
  /**
               * A human readable message indicating details about why the pod is in this condition.
               */
  val message: java.lang.String
  /**
               * Current condition of the pod. More info:
               * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
               */
  val phase: java.lang.String
  /**
               * IP address allocated to the pod. Routable at least within the cluster. Empty if not yet
               * allocated.
               */
  val podIP: java.lang.String
  /**
               * The Quality of Service (QOS) classification assigned to the pod based on resource
               * requirements See PodQOSClass type for available QOS classes More info:
               * https://github.com/kubernetes/kubernetes/blob/master/docs/design/resource-qos.md
               */
  val qosClass: java.lang.String
  /**
               * A brief CamelCase message indicating details about why the pod is in this state. e.g.
               * 'Evicted'
               */
  val reason: java.lang.String
  /**
               * RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before
               * the Kubelet pulled the container image(s) for the pod.
               */
  val startTime: java.lang.String
}

