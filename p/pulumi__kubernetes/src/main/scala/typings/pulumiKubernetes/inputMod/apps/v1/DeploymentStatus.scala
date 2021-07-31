package typings.pulumiKubernetes.inputMod.apps.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DeploymentStatus is the most recently observed status of the Deployment.
  */
trait DeploymentStatus extends StObject {
  
  /**
    * Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.
    */
  var availableReplicas: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
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
    * Total number of non-terminated pods targeted by this deployment (their labels match the selector).
    */
  var replicas: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or pods that still have not been created.
    */
  var unavailableReplicas: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Total number of non-terminated pods targeted by this deployment that have the desired template spec.
    */
  var updatedReplicas: js.UndefOr[Input[Double]] = js.undefined
}
object DeploymentStatus {
  
  @scala.inline
  def apply(): DeploymentStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentStatus]
  }
  
  @scala.inline
  implicit class DeploymentStatusMutableBuilder[Self <: DeploymentStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableReplicas(value: Input[Double]): Self = StObject.set(x, "availableReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableReplicasUndefined: Self = StObject.set(x, "availableReplicas", js.undefined)
    
    @scala.inline
    def setCollisionCount(value: Input[Double]): Self = StObject.set(x, "collisionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollisionCountUndefined: Self = StObject.set(x, "collisionCount", js.undefined)
    
    @scala.inline
    def setConditions(value: Input[js.Array[Input[DeploymentCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: Input[DeploymentCondition]*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setObservedGeneration(value: Input[Double]): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
    
    @scala.inline
    def setReadyReplicas(value: Input[Double]): Self = StObject.set(x, "readyReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyReplicasUndefined: Self = StObject.set(x, "readyReplicas", js.undefined)
    
    @scala.inline
    def setReplicas(value: Input[Double]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
    
    @scala.inline
    def setUnavailableReplicas(value: Input[Double]): Self = StObject.set(x, "unavailableReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnavailableReplicasUndefined: Self = StObject.set(x, "unavailableReplicas", js.undefined)
    
    @scala.inline
    def setUpdatedReplicas(value: Input[Double]): Self = StObject.set(x, "updatedReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedReplicasUndefined: Self = StObject.set(x, "updatedReplicas", js.undefined)
  }
}
