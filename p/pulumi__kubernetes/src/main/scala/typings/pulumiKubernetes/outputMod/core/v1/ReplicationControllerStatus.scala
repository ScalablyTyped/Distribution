package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ReplicationControllerStatus represents the current status of a replication controller.
  */
trait ReplicationControllerStatus extends StObject {
  
  /**
    * The number of available replicas (ready for at least minReadySeconds) for this replication controller.
    */
  var availableReplicas: Double
  
  /**
    * Represents the latest available observations of a replication controller's current state.
    */
  var conditions: js.Array[ReplicationControllerCondition]
  
  /**
    * The number of pods that have labels matching the labels of the pod template of the replication controller.
    */
  var fullyLabeledReplicas: Double
  
  /**
    * ObservedGeneration reflects the generation of the most recently observed replication controller.
    */
  var observedGeneration: Double
  
  /**
    * The number of ready replicas for this replication controller.
    */
  var readyReplicas: Double
  
  /**
    * Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
    */
  var replicas: Double
}
object ReplicationControllerStatus {
  
  @scala.inline
  def apply(
    availableReplicas: Double,
    conditions: js.Array[ReplicationControllerCondition],
    fullyLabeledReplicas: Double,
    observedGeneration: Double,
    readyReplicas: Double,
    replicas: Double
  ): ReplicationControllerStatus = {
    val __obj = js.Dynamic.literal(availableReplicas = availableReplicas.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], fullyLabeledReplicas = fullyLabeledReplicas.asInstanceOf[js.Any], observedGeneration = observedGeneration.asInstanceOf[js.Any], readyReplicas = readyReplicas.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationControllerStatus]
  }
  
  @scala.inline
  implicit class ReplicationControllerStatusMutableBuilder[Self <: ReplicationControllerStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableReplicas(value: Double): Self = StObject.set(x, "availableReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditions(value: js.Array[ReplicationControllerCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsVarargs(value: ReplicationControllerCondition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setFullyLabeledReplicas(value: Double): Self = StObject.set(x, "fullyLabeledReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservedGeneration(value: Double): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyReplicas(value: Double): Self = StObject.set(x, "readyReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicas(value: Double): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
  }
}
