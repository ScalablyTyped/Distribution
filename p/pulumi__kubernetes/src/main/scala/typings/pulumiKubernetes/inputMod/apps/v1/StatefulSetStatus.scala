package typings.pulumiKubernetes.inputMod.apps.v1

import typings.pulumiPulumi.outputMod.Input
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
  var collisionCount: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Represents the latest available observations of a statefulset's current state.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[StatefulSetCondition]]]] = js.undefined
  /**
    * currentReplicas is the number of Pods created by the StatefulSet controller from the
    * StatefulSet version indicated by currentRevision.
    */
  var currentReplicas: js.UndefOr[Input[Double]] = js.undefined
  /**
    * currentRevision, if not empty, indicates the version of the StatefulSet used to generate
    * Pods in the sequence [0,currentReplicas).
    */
  var currentRevision: js.UndefOr[Input[String]] = js.undefined
  /**
    * observedGeneration is the most recent generation observed for this StatefulSet. It
    * corresponds to the StatefulSet's generation, which is updated on mutation by the API
    * Server.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
  /**
    * readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready
    * Condition.
    */
  var readyReplicas: js.UndefOr[Input[Double]] = js.undefined
  /**
    * replicas is the number of Pods created by the StatefulSet controller.
    */
  var replicas: Input[Double]
  /**
    * updateRevision, if not empty, indicates the version of the StatefulSet used to generate
    * Pods in the sequence [replicas-updatedReplicas,replicas)
    */
  var updateRevision: js.UndefOr[Input[String]] = js.undefined
  /**
    * updatedReplicas is the number of Pods created by the StatefulSet controller from the
    * StatefulSet version indicated by updateRevision.
    */
  var updatedReplicas: js.UndefOr[Input[Double]] = js.undefined
}

object StatefulSetStatus {
  @scala.inline
  def apply(
    replicas: Input[Double],
    collisionCount: Input[Double] = null,
    conditions: Input[js.Array[Input[StatefulSetCondition]]] = null,
    currentReplicas: Input[Double] = null,
    currentRevision: Input[String] = null,
    observedGeneration: Input[Double] = null,
    readyReplicas: Input[Double] = null,
    updateRevision: Input[String] = null,
    updatedReplicas: Input[Double] = null
  ): StatefulSetStatus = {
    val __obj = js.Dynamic.literal(replicas = replicas.asInstanceOf[js.Any])
    if (collisionCount != null) __obj.updateDynamic("collisionCount")(collisionCount.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (currentReplicas != null) __obj.updateDynamic("currentReplicas")(currentReplicas.asInstanceOf[js.Any])
    if (currentRevision != null) __obj.updateDynamic("currentRevision")(currentRevision.asInstanceOf[js.Any])
    if (observedGeneration != null) __obj.updateDynamic("observedGeneration")(observedGeneration.asInstanceOf[js.Any])
    if (readyReplicas != null) __obj.updateDynamic("readyReplicas")(readyReplicas.asInstanceOf[js.Any])
    if (updateRevision != null) __obj.updateDynamic("updateRevision")(updateRevision.asInstanceOf[js.Any])
    if (updatedReplicas != null) __obj.updateDynamic("updatedReplicas")(updatedReplicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulSetStatus]
  }
}

