package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ReplicationControllerStatus represents the current status of a replication controller.
  */
trait ReplicationControllerStatus extends js.Object {
  /**
    * The number of available replicas (ready for at least minReadySeconds) for this replication
    * controller.
    */
  val availableReplicas: Double
  /**
    * Represents the latest available observations of a replication controller's current state.
    */
  val conditions: js.Array[ReplicationControllerCondition]
  /**
    * The number of pods that have labels matching the labels of the pod template of the
    * replication controller.
    */
  val fullyLabeledReplicas: Double
  /**
    * ObservedGeneration reflects the generation of the most recently observed replication
    * controller.
    */
  val observedGeneration: Double
  /**
    * The number of ready replicas for this replication controller.
    */
  val readyReplicas: Double
  /**
    * Replicas is the most recently oberved number of replicas. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
    */
  val replicas: Double
}

object ReplicationControllerStatus {
  @scala.inline
  def apply(
    availableReplicas: Double,
    conditions: js.Array[ReplicationControllerCondition],
    fullyLabeledReplicas: Double,
    observedGeneration: Double,
    readyReplicas: Double,
    replicas: Double
  ): ReplicationControllerStatus = {
    val __obj = js.Dynamic.literal(availableReplicas = availableReplicas.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], fullyLabeledReplicas = fullyLabeledReplicas.asInstanceOf[js.Any], observedGeneration = observedGeneration.asInstanceOf[js.Any], readyReplicas = readyReplicas.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationControllerStatus]
  }
}

