package typings.atPulumiKubernetes.typesInputMod.policy.v1beta1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget.
  * Status may trail the actual state of a system.
  */
trait PodDisruptionBudgetStatus extends js.Object {
  /**
    * current number of healthy pods
    */
  var currentHealthy: Input[Double]
  /**
    * minimum desired number of healthy pods
    */
  var desiredHealthy: Input[Double]
  /**
    * DisruptedPods contains information about pods whose eviction was processed by the API
    * server eviction subresource handler but has not yet been observed by the
    * PodDisruptionBudget controller. A pod will be in this map from the time when the API server
    * processed the eviction request to the time when the pod is seen by PDB controller as having
    * been marked for deletion (or after a timeout). The key in the map is the name of the pod
    * and the value is the time when the API server processed the eviction request. If the
    * deletion didn't occur and a pod is still there it will be removed from the list
    * automatically by PodDisruptionBudget controller after some time. If everything goes smooth
    * this map should be empty for the most of the time. Large number of entries in the map may
    * indicate problems with pod deletions.
    */
  var disruptedPods: js.UndefOr[Input[js.Object]] = js.undefined
  /**
    * Number of pod disruptions that are currently allowed.
    */
  var disruptionsAllowed: Input[Double]
  /**
    * total number of pods counted by this disruption budget
    */
  var expectedPods: Input[Double]
  /**
    * Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and
    * other status information is valid only if observedGeneration equals to PDB's object
    * generation.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
}

object PodDisruptionBudgetStatus {
  @scala.inline
  def apply(
    currentHealthy: Input[Double],
    desiredHealthy: Input[Double],
    disruptionsAllowed: Input[Double],
    expectedPods: Input[Double],
    disruptedPods: Input[js.Object] = null,
    observedGeneration: Input[Double] = null
  ): PodDisruptionBudgetStatus = {
    val __obj = js.Dynamic.literal(currentHealthy = currentHealthy.asInstanceOf[js.Any], desiredHealthy = desiredHealthy.asInstanceOf[js.Any], disruptionsAllowed = disruptionsAllowed.asInstanceOf[js.Any], expectedPods = expectedPods.asInstanceOf[js.Any])
    if (disruptedPods != null) __obj.updateDynamic("disruptedPods")(disruptedPods.asInstanceOf[js.Any])
    if (observedGeneration != null) __obj.updateDynamic("observedGeneration")(observedGeneration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodDisruptionBudgetStatus]
  }
}

