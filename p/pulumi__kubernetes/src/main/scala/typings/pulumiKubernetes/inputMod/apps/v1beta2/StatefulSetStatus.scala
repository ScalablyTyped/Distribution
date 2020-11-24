package typings.pulumiKubernetes.inputMod.apps.v1beta2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StatefulSetStatus represents the current state of a StatefulSet.
  */
@js.native
trait StatefulSetStatus extends js.Object {
  
  /**
    * collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
    */
  var collisionCount: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Represents the latest available observations of a statefulset's current state.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[StatefulSetCondition]]]] = js.native
  
  /**
    * currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.
    */
  var currentReplicas: js.UndefOr[Input[Double]] = js.native
  
  /**
    * currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).
    */
  var currentRevision: js.UndefOr[Input[String]] = js.native
  
  /**
    * observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet's generation, which is updated on mutation by the API Server.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.native
  
  /**
    * readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready Condition.
    */
  var readyReplicas: js.UndefOr[Input[Double]] = js.native
  
  /**
    * replicas is the number of Pods created by the StatefulSet controller.
    */
  var replicas: Input[Double] = js.native
  
  /**
    * updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)
    */
  var updateRevision: js.UndefOr[Input[String]] = js.native
  
  /**
    * updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.
    */
  var updatedReplicas: js.UndefOr[Input[Double]] = js.native
}
object StatefulSetStatus {
  
  @scala.inline
  def apply(replicas: Input[Double]): StatefulSetStatus = {
    val __obj = js.Dynamic.literal(replicas = replicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulSetStatus]
  }
  
  @scala.inline
  implicit class StatefulSetStatusOps[Self <: StatefulSetStatus] (val x: Self) extends AnyVal {
    
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
    def setCollisionCount(value: Input[Double]): Self = this.set("collisionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollisionCount: Self = this.set("collisionCount", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: Input[StatefulSetCondition]*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: Input[js.Array[Input[StatefulSetCondition]]]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    
    @scala.inline
    def setCurrentReplicas(value: Input[Double]): Self = this.set("currentReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentReplicas: Self = this.set("currentReplicas", js.undefined)
    
    @scala.inline
    def setCurrentRevision(value: Input[String]): Self = this.set("currentRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentRevision: Self = this.set("currentRevision", js.undefined)
    
    @scala.inline
    def setObservedGeneration(value: Input[Double]): Self = this.set("observedGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObservedGeneration: Self = this.set("observedGeneration", js.undefined)
    
    @scala.inline
    def setReadyReplicas(value: Input[Double]): Self = this.set("readyReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadyReplicas: Self = this.set("readyReplicas", js.undefined)
    
    @scala.inline
    def setUpdateRevision(value: Input[String]): Self = this.set("updateRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateRevision: Self = this.set("updateRevision", js.undefined)
    
    @scala.inline
    def setUpdatedReplicas(value: Input[Double]): Self = this.set("updatedReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedReplicas: Self = this.set("updatedReplicas", js.undefined)
  }
}
