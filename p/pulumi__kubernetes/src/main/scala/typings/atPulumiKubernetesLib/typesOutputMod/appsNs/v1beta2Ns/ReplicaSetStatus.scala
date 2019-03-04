package typings
package atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns

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
  val availableReplicas: scala.Double
  /**
    * Represents the latest available observations of a replica set's current state.
    */
  val conditions: js.Array[ReplicaSetCondition]
  /**
    * The number of pods that have labels matching the labels of the pod template of the
    * replicaset.
    */
  val fullyLabeledReplicas: scala.Double
  /**
    * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
    */
  val observedGeneration: scala.Double
  /**
    * The number of ready replicas for this replica set.
    */
  val readyReplicas: scala.Double
  /**
    * Replicas is the most recently oberved number of replicas. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
    */
  val replicas: scala.Double
}

object ReplicaSetStatus {
  @scala.inline
  def apply(
    availableReplicas: scala.Double,
    conditions: js.Array[ReplicaSetCondition],
    fullyLabeledReplicas: scala.Double,
    observedGeneration: scala.Double,
    readyReplicas: scala.Double,
    replicas: scala.Double
  ): ReplicaSetStatus = {
    val __obj = js.Dynamic.literal(availableReplicas = availableReplicas, conditions = conditions, fullyLabeledReplicas = fullyLabeledReplicas, observedGeneration = observedGeneration, readyReplicas = readyReplicas, replicas = replicas)
  
    __obj.asInstanceOf[ReplicaSetStatus]
  }
}

