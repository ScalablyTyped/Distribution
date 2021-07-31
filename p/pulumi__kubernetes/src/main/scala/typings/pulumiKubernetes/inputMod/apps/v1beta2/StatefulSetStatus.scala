package typings.pulumiKubernetes.inputMod.apps.v1beta2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StatefulSetStatus represents the current state of a StatefulSet.
  */
trait StatefulSetStatus extends StObject {
  
  /**
    * collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
    */
  var collisionCount: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Represents the latest available observations of a statefulset's current state.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[StatefulSetCondition]]]] = js.undefined
  
  /**
    * currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.
    */
  var currentReplicas: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).
    */
  var currentRevision: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet's generation, which is updated on mutation by the API Server.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready Condition.
    */
  var readyReplicas: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * replicas is the number of Pods created by the StatefulSet controller.
    */
  var replicas: Input[Double]
  
  /**
    * updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)
    */
  var updateRevision: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.
    */
  var updatedReplicas: js.UndefOr[Input[Double]] = js.undefined
}
object StatefulSetStatus {
  
  @scala.inline
  def apply(replicas: Input[Double]): StatefulSetStatus = {
    val __obj = js.Dynamic.literal(replicas = replicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulSetStatus]
  }
  
  @scala.inline
  implicit class StatefulSetStatusMutableBuilder[Self <: StatefulSetStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollisionCount(value: Input[Double]): Self = StObject.set(x, "collisionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollisionCountUndefined: Self = StObject.set(x, "collisionCount", js.undefined)
    
    @scala.inline
    def setConditions(value: Input[js.Array[Input[StatefulSetCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: Input[StatefulSetCondition]*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setCurrentReplicas(value: Input[Double]): Self = StObject.set(x, "currentReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentReplicasUndefined: Self = StObject.set(x, "currentReplicas", js.undefined)
    
    @scala.inline
    def setCurrentRevision(value: Input[String]): Self = StObject.set(x, "currentRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRevisionUndefined: Self = StObject.set(x, "currentRevision", js.undefined)
    
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
    def setUpdateRevision(value: Input[String]): Self = StObject.set(x, "updateRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateRevisionUndefined: Self = StObject.set(x, "updateRevision", js.undefined)
    
    @scala.inline
    def setUpdatedReplicas(value: Input[Double]): Self = StObject.set(x, "updatedReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedReplicasUndefined: Self = StObject.set(x, "updatedReplicas", js.undefined)
  }
}
