package typings
package atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DaemonSetStatus represents the current status of a daemon set.
  */
trait DaemonSetStatus extends js.Object {
  /**
    * Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a
    * collision avoidance mechanism when it needs to create the name for the newest
    * ControllerRevision.
    */
  val collisionCount: scala.Double
  /**
    * Represents the latest available observations of a DaemonSet's current state.
    */
  val conditions: js.Array[DaemonSetCondition]
  /**
    * The number of nodes that are running at least 1 daemon pod and are supposed to run the
    * daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  val currentNumberScheduled: scala.Double
  /**
    * The total number of nodes that should be running the daemon pod (including nodes correctly
    * running the daemon pod). More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  val desiredNumberScheduled: scala.Double
  /**
    * The number of nodes that should be running the daemon pod and have one or more of the
    * daemon pod running and available (ready for at least spec.minReadySeconds)
    */
  val numberAvailable: scala.Double
  /**
    * The number of nodes that are running the daemon pod, but are not supposed to run the daemon
    * pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  val numberMisscheduled: scala.Double
  /**
    * The number of nodes that should be running the daemon pod and have one or more of the
    * daemon pod running and ready.
    */
  val numberReady: scala.Double
  /**
    * The number of nodes that should be running the daemon pod and have none of the daemon pod
    * running and available (ready for at least spec.minReadySeconds)
    */
  val numberUnavailable: scala.Double
  /**
    * The most recent generation observed by the daemon set controller.
    */
  val observedGeneration: scala.Double
  /**
    * The total number of nodes that are running updated daemon pod
    */
  val updatedNumberScheduled: scala.Double
}

object DaemonSetStatus {
  @scala.inline
  def apply(
    collisionCount: scala.Double,
    conditions: js.Array[DaemonSetCondition],
    currentNumberScheduled: scala.Double,
    desiredNumberScheduled: scala.Double,
    numberAvailable: scala.Double,
    numberMisscheduled: scala.Double,
    numberReady: scala.Double,
    numberUnavailable: scala.Double,
    observedGeneration: scala.Double,
    updatedNumberScheduled: scala.Double
  ): DaemonSetStatus = {
    val __obj = js.Dynamic.literal(collisionCount = collisionCount, conditions = conditions, currentNumberScheduled = currentNumberScheduled, desiredNumberScheduled = desiredNumberScheduled, numberAvailable = numberAvailable, numberMisscheduled = numberMisscheduled, numberReady = numberReady, numberUnavailable = numberUnavailable, observedGeneration = observedGeneration, updatedNumberScheduled = updatedNumberScheduled)
  
    __obj.asInstanceOf[DaemonSetStatus]
  }
}

