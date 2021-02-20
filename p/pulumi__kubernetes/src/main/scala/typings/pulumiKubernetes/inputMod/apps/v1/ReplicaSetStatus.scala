package typings.pulumiKubernetes.inputMod.apps.v1

import typings.pulumiPulumi.outputMod.Input
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
  var availableReplicas: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Represents the latest available observations of a replica set's current state.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[ReplicaSetCondition]]]] = js.native
  
  /**
    * The number of pods that have labels matching the labels of the pod template of the replicaset.
    */
  var fullyLabeledReplicas: js.UndefOr[Input[Double]] = js.native
  
  /**
    * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The number of ready replicas for this replica set.
    */
  var readyReplicas: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
    */
  var replicas: Input[Double] = js.native
}
object ReplicaSetStatus {
  
  @scala.inline
  def apply(replicas: Input[Double]): ReplicaSetStatus = {
    val __obj = js.Dynamic.literal(replicas = replicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaSetStatus]
  }
  
  @scala.inline
  implicit class ReplicaSetStatusMutableBuilder[Self <: ReplicaSetStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableReplicas(value: Input[Double]): Self = StObject.set(x, "availableReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableReplicasUndefined: Self = StObject.set(x, "availableReplicas", js.undefined)
    
    @scala.inline
    def setConditions(value: Input[js.Array[Input[ReplicaSetCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: Input[ReplicaSetCondition]*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setFullyLabeledReplicas(value: Input[Double]): Self = StObject.set(x, "fullyLabeledReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullyLabeledReplicasUndefined: Self = StObject.set(x, "fullyLabeledReplicas", js.undefined)
    
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
  }
}
