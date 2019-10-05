package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var availableReplicas: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Represents the latest available observations of a replication controller's current state.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[ReplicationControllerCondition]]]] = js.undefined
  /**
    * The number of pods that have labels matching the labels of the pod template of the
    * replication controller.
    */
  var fullyLabeledReplicas: js.UndefOr[Input[Double]] = js.undefined
  /**
    * ObservedGeneration reflects the generation of the most recently observed replication
    * controller.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The number of ready replicas for this replication controller.
    */
  var readyReplicas: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Replicas is the most recently oberved number of replicas. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
    */
  var replicas: Input[Double]
}

object ReplicationControllerStatus {
  @scala.inline
  def apply(
    replicas: Input[Double],
    availableReplicas: Input[Double] = null,
    conditions: Input[js.Array[Input[ReplicationControllerCondition]]] = null,
    fullyLabeledReplicas: Input[Double] = null,
    observedGeneration: Input[Double] = null,
    readyReplicas: Input[Double] = null
  ): ReplicationControllerStatus = {
    val __obj = js.Dynamic.literal(replicas = replicas.asInstanceOf[js.Any])
    if (availableReplicas != null) __obj.updateDynamic("availableReplicas")(availableReplicas.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (fullyLabeledReplicas != null) __obj.updateDynamic("fullyLabeledReplicas")(fullyLabeledReplicas.asInstanceOf[js.Any])
    if (observedGeneration != null) __obj.updateDynamic("observedGeneration")(observedGeneration.asInstanceOf[js.Any])
    if (readyReplicas != null) __obj.updateDynamic("readyReplicas")(readyReplicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationControllerStatus]
  }
}

