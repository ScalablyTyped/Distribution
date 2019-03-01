package typings
package atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns

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
  val currentHealthy: scala.Double
  /**
    * minimum desired number of healthy pods
    */
  val desiredHealthy: scala.Double
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
  val disruptedPods: js.Object
  /**
    * Number of pod disruptions that are currently allowed.
    */
  val disruptionsAllowed: scala.Double
  /**
    * total number of pods counted by this disruption budget
    */
  val expectedPods: scala.Double
  /**
    * Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and
    * other status informatio is valid only if observedGeneration equals to PDB's object
    * generation.
    */
  val observedGeneration: scala.Double
}

object PodDisruptionBudgetStatus {
  @scala.inline
  def apply(
    currentHealthy: scala.Double,
    desiredHealthy: scala.Double,
    disruptedPods: js.Object,
    disruptionsAllowed: scala.Double,
    expectedPods: scala.Double,
    observedGeneration: scala.Double
  ): PodDisruptionBudgetStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentHealthy")(currentHealthy)
    __obj.updateDynamic("desiredHealthy")(desiredHealthy)
    __obj.updateDynamic("disruptedPods")(disruptedPods)
    __obj.updateDynamic("disruptionsAllowed")(disruptionsAllowed)
    __obj.updateDynamic("expectedPods")(expectedPods)
    __obj.updateDynamic("observedGeneration")(observedGeneration)
    __obj.asInstanceOf[PodDisruptionBudgetStatus]
  }
}

