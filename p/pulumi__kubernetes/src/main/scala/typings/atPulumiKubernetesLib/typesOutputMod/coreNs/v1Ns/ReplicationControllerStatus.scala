package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val availableReplicas: scala.Double
  /**
               * Represents the latest available observations of a replication controller's current state.
               */
  val conditions: js.Array[ReplicationControllerCondition]
  /**
               * The number of pods that have labels matching the labels of the pod template of the
               * replication controller.
               */
  val fullyLabeledReplicas: scala.Double
  /**
               * ObservedGeneration reflects the generation of the most recently observed replication
               * controller.
               */
  val observedGeneration: scala.Double
  /**
               * The number of ready replicas for this replication controller.
               */
  val readyReplicas: scala.Double
  /**
               * Replicas is the most recently oberved number of replicas. More info:
               * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
               */
  val replicas: scala.Double
}

