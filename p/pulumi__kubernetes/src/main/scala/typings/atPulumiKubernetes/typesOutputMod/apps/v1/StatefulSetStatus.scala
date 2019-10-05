package typings.atPulumiKubernetes.typesOutputMod.apps.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StatefulSetStatus represents the current state of a StatefulSet.
  */
trait StatefulSetStatus extends js.Object {
  /**
    * collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet
    * controller uses this field as a collision avoidance mechanism when it needs to create the
    * name for the newest ControllerRevision.
    */
  val collisionCount: Double
  /**
    * Represents the latest available observations of a statefulset's current state.
    */
  val conditions: js.Array[StatefulSetCondition]
  /**
    * currentReplicas is the number of Pods created by the StatefulSet controller from the
    * StatefulSet version indicated by currentRevision.
    */
  val currentReplicas: Double
  /**
    * currentRevision, if not empty, indicates the version of the StatefulSet used to generate
    * Pods in the sequence [0,currentReplicas).
    */
  val currentRevision: String
  /**
    * observedGeneration is the most recent generation observed for this StatefulSet. It
    * corresponds to the StatefulSet's generation, which is updated on mutation by the API
    * Server.
    */
  val observedGeneration: Double
  /**
    * readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready
    * Condition.
    */
  val readyReplicas: Double
  /**
    * replicas is the number of Pods created by the StatefulSet controller.
    */
  val replicas: Double
  /**
    * updateRevision, if not empty, indicates the version of the StatefulSet used to generate
    * Pods in the sequence [replicas-updatedReplicas,replicas)
    */
  val updateRevision: String
  /**
    * updatedReplicas is the number of Pods created by the StatefulSet controller from the
    * StatefulSet version indicated by updateRevision.
    */
  val updatedReplicas: Double
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
    val __obj = js.Dynamic.literal(collisionCount = collisionCount, conditions = conditions, currentReplicas = currentReplicas, currentRevision = currentRevision, observedGeneration = observedGeneration, readyReplicas = readyReplicas, replicas = replicas, updateRevision = updateRevision, updatedReplicas = updatedReplicas)
  
    __obj.asInstanceOf[StatefulSetStatus]
  }
}

