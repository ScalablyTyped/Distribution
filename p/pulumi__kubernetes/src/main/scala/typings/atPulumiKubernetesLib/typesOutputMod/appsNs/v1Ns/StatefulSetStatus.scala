package typings
package atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns

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
  val collisionCount: scala.Double
  /**
    * Represents the latest available observations of a statefulset's current state.
    */
  val conditions: js.Array[StatefulSetCondition]
  /**
    * currentReplicas is the number of Pods created by the StatefulSet controller from the
    * StatefulSet version indicated by currentRevision.
    */
  val currentReplicas: scala.Double
  /**
    * currentRevision, if not empty, indicates the version of the StatefulSet used to generate
    * Pods in the sequence [0,currentReplicas).
    */
  val currentRevision: java.lang.String
  /**
    * observedGeneration is the most recent generation observed for this StatefulSet. It
    * corresponds to the StatefulSet's generation, which is updated on mutation by the API
    * Server.
    */
  val observedGeneration: scala.Double
  /**
    * readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready
    * Condition.
    */
  val readyReplicas: scala.Double
  /**
    * replicas is the number of Pods created by the StatefulSet controller.
    */
  val replicas: scala.Double
  /**
    * updateRevision, if not empty, indicates the version of the StatefulSet used to generate
    * Pods in the sequence [replicas-updatedReplicas,replicas)
    */
  val updateRevision: java.lang.String
  /**
    * updatedReplicas is the number of Pods created by the StatefulSet controller from the
    * StatefulSet version indicated by updateRevision.
    */
  val updatedReplicas: scala.Double
}

object StatefulSetStatus {
  @scala.inline
  def apply(
    collisionCount: scala.Double,
    conditions: js.Array[StatefulSetCondition],
    currentReplicas: scala.Double,
    currentRevision: java.lang.String,
    observedGeneration: scala.Double,
    readyReplicas: scala.Double,
    replicas: scala.Double,
    updateRevision: java.lang.String,
    updatedReplicas: scala.Double
  ): StatefulSetStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collisionCount")(collisionCount)
    __obj.updateDynamic("conditions")(conditions)
    __obj.updateDynamic("currentReplicas")(currentReplicas)
    __obj.updateDynamic("currentRevision")(currentRevision)
    __obj.updateDynamic("observedGeneration")(observedGeneration)
    __obj.updateDynamic("readyReplicas")(readyReplicas)
    __obj.updateDynamic("replicas")(replicas)
    __obj.updateDynamic("updateRevision")(updateRevision)
    __obj.updateDynamic("updatedReplicas")(updatedReplicas)
    __obj.asInstanceOf[StatefulSetStatus]
  }
}

