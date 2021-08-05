package typings.pulumiKubernetes.outputMod.apps.v1beta2

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
  var availableReplicas: Double
  
  /**
    * Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
    */
  var collisionCount: Double
  
  /**
    * Represents the latest available observations of a deployment's current state.
    */
  var conditions: js.Array[DeploymentCondition]
  
  /**
    * The generation observed by the deployment controller.
    */
  var observedGeneration: Double
  
  /**
    * Total number of ready pods targeted by this deployment.
    */
  var readyReplicas: Double
  
  /**
    * Total number of non-terminated pods targeted by this deployment (their labels match the selector).
    */
  var replicas: Double
  
  /**
    * Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or pods that still have not been created.
    */
  var unavailableReplicas: Double
  
  /**
    * Total number of non-terminated pods targeted by this deployment that have the desired template spec.
    */
  var updatedReplicas: Double
}
object DeploymentStatus {
  
  inline def apply(
    availableReplicas: Double,
    collisionCount: Double,
    conditions: js.Array[DeploymentCondition],
    observedGeneration: Double,
    readyReplicas: Double,
    replicas: Double,
    unavailableReplicas: Double,
    updatedReplicas: Double
  ): DeploymentStatus = {
    val __obj = js.Dynamic.literal(availableReplicas = availableReplicas.asInstanceOf[js.Any], collisionCount = collisionCount.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], observedGeneration = observedGeneration.asInstanceOf[js.Any], readyReplicas = readyReplicas.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any], unavailableReplicas = unavailableReplicas.asInstanceOf[js.Any], updatedReplicas = updatedReplicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentStatus]
  }
  
  extension [Self <: DeploymentStatus](x: Self) {
    
    inline def setAvailableReplicas(value: Double): Self = StObject.set(x, "availableReplicas", value.asInstanceOf[js.Any])
    
    inline def setCollisionCount(value: Double): Self = StObject.set(x, "collisionCount", value.asInstanceOf[js.Any])
    
    inline def setConditions(value: js.Array[DeploymentCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: DeploymentCondition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    inline def setObservedGeneration(value: Double): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    inline def setReadyReplicas(value: Double): Self = StObject.set(x, "readyReplicas", value.asInstanceOf[js.Any])
    
    inline def setReplicas(value: Double): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setUnavailableReplicas(value: Double): Self = StObject.set(x, "unavailableReplicas", value.asInstanceOf[js.Any])
    
    inline def setUpdatedReplicas(value: Double): Self = StObject.set(x, "updatedReplicas", value.asInstanceOf[js.Any])
  }
}
