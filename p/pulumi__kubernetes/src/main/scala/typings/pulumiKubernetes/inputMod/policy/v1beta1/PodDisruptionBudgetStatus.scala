package typings.pulumiKubernetes.inputMod.policy.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget. Status may trail the actual state of a system.
  */
@js.native
trait PodDisruptionBudgetStatus extends StObject {
  
  /**
    * current number of healthy pods
    */
  var currentHealthy: Input[Double] = js.native
  
  /**
    * minimum desired number of healthy pods
    */
  var desiredHealthy: Input[Double] = js.native
  
  /**
    * DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the API server processed the eviction request. If the deletion didn't occur and a pod is still there it will be removed from the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions.
    */
  var disruptedPods: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Number of pod disruptions that are currently allowed.
    */
  var disruptionsAllowed: Input[Double] = js.native
  
  /**
    * total number of pods counted by this disruption budget
    */
  var expectedPods: Input[Double] = js.native
  
  /**
    * Most recent generation observed when updating this PDB status. DisruptionsAllowed and other status information is valid only if observedGeneration equals to PDB's object generation.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.native
}
object PodDisruptionBudgetStatus {
  
  @scala.inline
  def apply(
    currentHealthy: Input[Double],
    desiredHealthy: Input[Double],
    disruptionsAllowed: Input[Double],
    expectedPods: Input[Double]
  ): PodDisruptionBudgetStatus = {
    val __obj = js.Dynamic.literal(currentHealthy = currentHealthy.asInstanceOf[js.Any], desiredHealthy = desiredHealthy.asInstanceOf[js.Any], disruptionsAllowed = disruptionsAllowed.asInstanceOf[js.Any], expectedPods = expectedPods.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodDisruptionBudgetStatus]
  }
  
  @scala.inline
  implicit class PodDisruptionBudgetStatusMutableBuilder[Self <: PodDisruptionBudgetStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentHealthy(value: Input[Double]): Self = StObject.set(x, "currentHealthy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredHealthy(value: Input[Double]): Self = StObject.set(x, "desiredHealthy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisruptedPods(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "disruptedPods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisruptedPodsUndefined: Self = StObject.set(x, "disruptedPods", js.undefined)
    
    @scala.inline
    def setDisruptionsAllowed(value: Input[Double]): Self = StObject.set(x, "disruptionsAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedPods(value: Input[Double]): Self = StObject.set(x, "expectedPods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservedGeneration(value: Input[Double]): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
  }
}
