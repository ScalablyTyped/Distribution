package typings.pulumiKubernetes.outputMod.extensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ReplicaSetStatus represents the current status of a ReplicaSet.
  */
@js.native
trait ReplicaSetStatus extends StObject {
  
  /**
    * The number of available replicas (ready for at least minReadySeconds) for this replica set.
    */
  var availableReplicas: Double = js.native
  
  /**
    * Represents the latest available observations of a replica set's current state.
    */
  var conditions: js.Array[ReplicaSetCondition] = js.native
  
  /**
    * The number of pods that have labels matching the labels of the pod template of the replicaset.
    */
  var fullyLabeledReplicas: Double = js.native
  
  /**
    * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
    */
  var observedGeneration: Double = js.native
  
  /**
    * The number of ready replicas for this replica set.
    */
  var readyReplicas: Double = js.native
  
  /**
    * Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
    */
  var replicas: Double = js.native
}
object ReplicaSetStatus {
  
  @scala.inline
  def apply(
    availableReplicas: Double,
    conditions: js.Array[ReplicaSetCondition],
    fullyLabeledReplicas: Double,
    observedGeneration: Double,
    readyReplicas: Double,
    replicas: Double
  ): ReplicaSetStatus = {
    val __obj = js.Dynamic.literal(availableReplicas = availableReplicas.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], fullyLabeledReplicas = fullyLabeledReplicas.asInstanceOf[js.Any], observedGeneration = observedGeneration.asInstanceOf[js.Any], readyReplicas = readyReplicas.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaSetStatus]
  }
  
  @scala.inline
  implicit class ReplicaSetStatusMutableBuilder[Self <: ReplicaSetStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableReplicas(value: Double): Self = StObject.set(x, "availableReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditions(value: js.Array[ReplicaSetCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsVarargs(value: ReplicaSetCondition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
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
