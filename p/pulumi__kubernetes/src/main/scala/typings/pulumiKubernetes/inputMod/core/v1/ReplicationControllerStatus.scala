package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ReplicationControllerStatus represents the current status of a replication controller.
  */
@js.native
trait ReplicationControllerStatus extends js.Object {
  
  /**
    * The number of available replicas (ready for at least minReadySeconds) for this replication controller.
    */
  var availableReplicas: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Represents the latest available observations of a replication controller's current state.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[ReplicationControllerCondition]]]] = js.native
  
  /**
    * The number of pods that have labels matching the labels of the pod template of the replication controller.
    */
  var fullyLabeledReplicas: js.UndefOr[Input[Double]] = js.native
  
  /**
    * ObservedGeneration reflects the generation of the most recently observed replication controller.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The number of ready replicas for this replication controller.
    */
  var readyReplicas: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
    */
  var replicas: Input[Double] = js.native
}
object ReplicationControllerStatus {
  
  @scala.inline
  def apply(replicas: Input[Double]): ReplicationControllerStatus = {
    val __obj = js.Dynamic.literal(replicas = replicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationControllerStatus]
  }
  
  @scala.inline
  implicit class ReplicationControllerStatusOps[Self <: ReplicationControllerStatus] (val x: Self) extends AnyVal {
    
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
    def setReplicas(value: Input[Double]): Self = this.set("replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableReplicas(value: Input[Double]): Self = this.set("availableReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableReplicas: Self = this.set("availableReplicas", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: Input[ReplicationControllerCondition]*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: Input[js.Array[Input[ReplicationControllerCondition]]]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    
    @scala.inline
    def setFullyLabeledReplicas(value: Input[Double]): Self = this.set("fullyLabeledReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullyLabeledReplicas: Self = this.set("fullyLabeledReplicas", js.undefined)
    
    @scala.inline
    def setObservedGeneration(value: Input[Double]): Self = this.set("observedGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObservedGeneration: Self = this.set("observedGeneration", js.undefined)
    
    @scala.inline
    def setReadyReplicas(value: Input[Double]): Self = this.set("readyReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadyReplicas: Self = this.set("readyReplicas", js.undefined)
  }
}
