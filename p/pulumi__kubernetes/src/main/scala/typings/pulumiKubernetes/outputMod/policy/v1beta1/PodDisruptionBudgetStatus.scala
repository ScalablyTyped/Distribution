package typings.pulumiKubernetes.outputMod.policy.v1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget. Status may trail the actual state of a system.
  */
@js.native
trait PodDisruptionBudgetStatus extends js.Object {
  
  /**
    * current number of healthy pods
    */
  var currentHealthy: Double = js.native
  
  /**
    * minimum desired number of healthy pods
    */
  var desiredHealthy: Double = js.native
  
  /**
    * DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the API server processed the eviction request. If the deletion didn't occur and a pod is still there it will be removed from the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions.
    */
  var disruptedPods: StringDictionary[String] = js.native
  
  /**
    * Number of pod disruptions that are currently allowed.
    */
  var disruptionsAllowed: Double = js.native
  
  /**
    * total number of pods counted by this disruption budget
    */
  var expectedPods: Double = js.native
  
  /**
    * Most recent generation observed when updating this PDB status. DisruptionsAllowed and other status information is valid only if observedGeneration equals to PDB's object generation.
    */
  var observedGeneration: Double = js.native
}
object PodDisruptionBudgetStatus {
  
  @scala.inline
  def apply(
    currentHealthy: Double,
    desiredHealthy: Double,
    disruptedPods: StringDictionary[String],
    disruptionsAllowed: Double,
    expectedPods: Double,
    observedGeneration: Double
  ): PodDisruptionBudgetStatus = {
    val __obj = js.Dynamic.literal(currentHealthy = currentHealthy.asInstanceOf[js.Any], desiredHealthy = desiredHealthy.asInstanceOf[js.Any], disruptedPods = disruptedPods.asInstanceOf[js.Any], disruptionsAllowed = disruptionsAllowed.asInstanceOf[js.Any], expectedPods = expectedPods.asInstanceOf[js.Any], observedGeneration = observedGeneration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodDisruptionBudgetStatus]
  }
  
  @scala.inline
  implicit class PodDisruptionBudgetStatusOps[Self <: PodDisruptionBudgetStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrentHealthy(value: Double): Self = this.set("currentHealthy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredHealthy(value: Double): Self = this.set("desiredHealthy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisruptedPods(value: StringDictionary[String]): Self = this.set("disruptedPods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisruptionsAllowed(value: Double): Self = this.set("disruptionsAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedPods(value: Double): Self = this.set("expectedPods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservedGeneration(value: Double): Self = this.set("observedGeneration", value.asInstanceOf[js.Any])
  }
}
