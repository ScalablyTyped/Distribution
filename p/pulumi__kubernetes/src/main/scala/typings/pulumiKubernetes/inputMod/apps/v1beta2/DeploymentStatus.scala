package typings.pulumiKubernetes.inputMod.apps.v1beta2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DeploymentStatus is the most recently observed status of the Deployment.
  */
trait DeploymentStatus extends js.Object {
  /**
    * Total number of available pods (ready for at least minReadySeconds) targeted by this
    * deployment.
    */
  var availableReplicas: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Count of hash collisions for the Deployment. The Deployment controller uses this field as a
    * collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
    */
  var collisionCount: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Represents the latest available observations of a deployment's current state.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[DeploymentCondition]]]] = js.undefined
  /**
    * The generation observed by the deployment controller.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Total number of ready pods targeted by this deployment.
    */
  var readyReplicas: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Total number of non-terminated pods targeted by this deployment (their labels match the
    * selector).
    */
  var replicas: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Total number of unavailable pods targeted by this deployment. This is the total number of
    * pods that are still required for the deployment to have 100% available capacity. They may
    * either be pods that are running but not yet available or pods that still have not been
    * created.
    */
  var unavailableReplicas: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Total number of non-terminated pods targeted by this deployment that have the desired
    * template spec.
    */
  var updatedReplicas: js.UndefOr[Input[Double]] = js.undefined
}

object DeploymentStatus {
  @scala.inline
  def apply(
    availableReplicas: Input[Double] = null,
    collisionCount: Input[Double] = null,
    conditions: Input[js.Array[Input[DeploymentCondition]]] = null,
    observedGeneration: Input[Double] = null,
    readyReplicas: Input[Double] = null,
    replicas: Input[Double] = null,
    unavailableReplicas: Input[Double] = null,
    updatedReplicas: Input[Double] = null
  ): DeploymentStatus = {
    val __obj = js.Dynamic.literal()
    if (availableReplicas != null) __obj.updateDynamic("availableReplicas")(availableReplicas.asInstanceOf[js.Any])
    if (collisionCount != null) __obj.updateDynamic("collisionCount")(collisionCount.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (observedGeneration != null) __obj.updateDynamic("observedGeneration")(observedGeneration.asInstanceOf[js.Any])
    if (readyReplicas != null) __obj.updateDynamic("readyReplicas")(readyReplicas.asInstanceOf[js.Any])
    if (replicas != null) __obj.updateDynamic("replicas")(replicas.asInstanceOf[js.Any])
    if (unavailableReplicas != null) __obj.updateDynamic("unavailableReplicas")(unavailableReplicas.asInstanceOf[js.Any])
    if (updatedReplicas != null) __obj.updateDynamic("updatedReplicas")(updatedReplicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentStatus]
  }
}

