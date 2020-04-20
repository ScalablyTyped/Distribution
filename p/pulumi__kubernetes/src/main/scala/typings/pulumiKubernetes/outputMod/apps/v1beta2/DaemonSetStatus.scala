package typings.pulumiKubernetes.outputMod.apps.v1beta2

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
  val collisionCount: Double
  /**
    * Represents the latest available observations of a DaemonSet's current state.
    */
  val conditions: js.Array[DaemonSetCondition]
  /**
    * The number of nodes that are running at least 1 daemon pod and are supposed to run the
    * daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  val currentNumberScheduled: Double
  /**
    * The total number of nodes that should be running the daemon pod (including nodes correctly
    * running the daemon pod). More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  val desiredNumberScheduled: Double
  /**
    * The number of nodes that should be running the daemon pod and have one or more of the
    * daemon pod running and available (ready for at least spec.minReadySeconds)
    */
  val numberAvailable: Double
  /**
    * The number of nodes that are running the daemon pod, but are not supposed to run the daemon
    * pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  val numberMisscheduled: Double
  /**
    * The number of nodes that should be running the daemon pod and have one or more of the
    * daemon pod running and ready.
    */
  val numberReady: Double
  /**
    * The number of nodes that should be running the daemon pod and have none of the daemon pod
    * running and available (ready for at least spec.minReadySeconds)
    */
  val numberUnavailable: Double
  /**
    * The most recent generation observed by the daemon set controller.
    */
  val observedGeneration: Double
  /**
    * The total number of nodes that are running updated daemon pod
    */
  val updatedNumberScheduled: Double
}

object DaemonSetStatus {
  @scala.inline
  def apply(
    collisionCount: Double,
    conditions: js.Array[DaemonSetCondition],
    currentNumberScheduled: Double,
    desiredNumberScheduled: Double,
    numberAvailable: Double,
    numberMisscheduled: Double,
    numberReady: Double,
    numberUnavailable: Double,
    observedGeneration: Double,
    updatedNumberScheduled: Double
  ): DaemonSetStatus = {
    val __obj = js.Dynamic.literal(collisionCount = collisionCount.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], currentNumberScheduled = currentNumberScheduled.asInstanceOf[js.Any], desiredNumberScheduled = desiredNumberScheduled.asInstanceOf[js.Any], numberAvailable = numberAvailable.asInstanceOf[js.Any], numberMisscheduled = numberMisscheduled.asInstanceOf[js.Any], numberReady = numberReady.asInstanceOf[js.Any], numberUnavailable = numberUnavailable.asInstanceOf[js.Any], observedGeneration = observedGeneration.asInstanceOf[js.Any], updatedNumberScheduled = updatedNumberScheduled.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaemonSetStatus]
  }
}

