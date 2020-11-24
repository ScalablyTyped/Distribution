package typings.pulumiKubernetes.outputMod.apps.v1

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
  var collisionCount: Double = js.native
  
  /**
    * Represents the latest available observations of a statefulset's current state.
    */
  var conditions: js.Array[StatefulSetCondition] = js.native
  
  /**
    * currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.
    */
  var currentReplicas: Double = js.native
  
  /**
    * currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).
    */
  var currentRevision: String = js.native
  
  /**
    * observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet's generation, which is updated on mutation by the API Server.
    */
  var observedGeneration: Double = js.native
  
  /**
    * readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready Condition.
    */
  var readyReplicas: Double = js.native
  
  /**
    * replicas is the number of Pods created by the StatefulSet controller.
    */
  var replicas: Double = js.native
  
  /**
    * updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)
    */
  var updateRevision: String = js.native
  
  /**
    * updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.
    */
  var updatedReplicas: Double = js.native
}
object StatefulSetStatus {
  
  @scala.inline
  def apply(
    collisionCount: Double,
    conditions: js.Array[StatefulSetCondition],
    currentReplicas: Double,
    currentRevision: String,
    observedGeneration: Double,
    readyReplicas: Double,
    replicas: Double,
    updateRevision: String,
    updatedReplicas: Double
  ): StatefulSetStatus = {
    val __obj = js.Dynamic.literal(collisionCount = collisionCount.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], currentReplicas = currentReplicas.asInstanceOf[js.Any], currentRevision = currentRevision.asInstanceOf[js.Any], observedGeneration = observedGeneration.asInstanceOf[js.Any], readyReplicas = readyReplicas.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any], updateRevision = updateRevision.asInstanceOf[js.Any], updatedReplicas = updatedReplicas.asInstanceOf[js.Any])
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
    def setCollisionCount(value: Double): Self = this.set("collisionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsVarargs(value: StatefulSetCondition*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[StatefulSetCondition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentReplicas(value: Double): Self = this.set("currentReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRevision(value: String): Self = this.set("currentRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservedGeneration(value: Double): Self = this.set("observedGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyReplicas(value: Double): Self = this.set("readyReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicas(value: Double): Self = this.set("replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateRevision(value: String): Self = this.set("updateRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedReplicas(value: Double): Self = this.set("updatedReplicas", value.asInstanceOf[js.Any])
  }
}
