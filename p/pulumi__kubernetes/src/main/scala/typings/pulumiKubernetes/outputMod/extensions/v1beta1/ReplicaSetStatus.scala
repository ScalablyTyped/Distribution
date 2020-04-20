package typings.pulumiKubernetes.outputMod.extensions.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ReplicaSetStatus represents the current status of a ReplicaSet.
  */
trait ReplicaSetStatus extends js.Object {
  /**
    * The number of available replicas (ready for at least minReadySeconds) for this replica set.
    */
  val availableReplicas: Double
  /**
    * Represents the latest available observations of a replica set's current state.
    */
  val conditions: js.Array[ReplicaSetCondition]
  /**
    * The number of pods that have labels matching the labels of the pod template of the
    * replicaset.
    */
  val fullyLabeledReplicas: Double
  /**
    * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
    */
  val observedGeneration: Double
  /**
    * The number of ready replicas for this replica set.
    */
  val readyReplicas: Double
  /**
    * Replicas is the most recently oberved number of replicas. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
    */
  val replicas: Double
}

object ReplicaSetStatus {
  @scala.inline
  def apply(
    availableReplicas: Double,
    conditions: js.Array[ReplicaSetCondition],
    fullyLabeledReplicas: Double,
    observedGeneration: Double,
    readyReplicas: Double,
    replicas: Double
  ): ReplicaSetStatus = {
    val __obj = js.Dynamic.literal(availableReplicas = availableReplicas.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], fullyLabeledReplicas = fullyLabeledReplicas.asInstanceOf[js.Any], observedGeneration = observedGeneration.asInstanceOf[js.Any], readyReplicas = readyReplicas.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaSetStatus]
  }
}

