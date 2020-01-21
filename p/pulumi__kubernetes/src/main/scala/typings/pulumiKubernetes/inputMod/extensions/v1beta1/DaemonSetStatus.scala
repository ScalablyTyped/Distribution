package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DaemonSetStatus represents the current status of a daemon set.
  */
trait DaemonSetStatus extends js.Object {
  /**
    * Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a
    * collision avoidance mechanism when it needs to create the name for the newest
    * ControllerRevision.
    */
  var collisionCount: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Represents the latest available observations of a DaemonSet's current state.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[DaemonSetCondition]]]] = js.undefined
  /**
    * The number of nodes that are running at least 1 daemon pod and are supposed to run the
    * daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  var currentNumberScheduled: Input[Double]
  /**
    * The total number of nodes that should be running the daemon pod (including nodes correctly
    * running the daemon pod). More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  var desiredNumberScheduled: Input[Double]
  /**
    * The number of nodes that should be running the daemon pod and have one or more of the
    * daemon pod running and available (ready for at least spec.minReadySeconds)
    */
  var numberAvailable: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The number of nodes that are running the daemon pod, but are not supposed to run the daemon
    * pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  var numberMisscheduled: Input[Double]
  /**
    * The number of nodes that should be running the daemon pod and have one or more of the
    * daemon pod running and ready.
    */
  var numberReady: Input[Double]
  /**
    * The number of nodes that should be running the daemon pod and have none of the daemon pod
    * running and available (ready for at least spec.minReadySeconds)
    */
  var numberUnavailable: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The most recent generation observed by the daemon set controller.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The total number of nodes that are running updated daemon pod
    */
  var updatedNumberScheduled: js.UndefOr[Input[Double]] = js.undefined
}

object DaemonSetStatus {
  @scala.inline
  def apply(
    currentNumberScheduled: Input[Double],
    desiredNumberScheduled: Input[Double],
    numberMisscheduled: Input[Double],
    numberReady: Input[Double],
    collisionCount: Input[Double] = null,
    conditions: Input[js.Array[Input[DaemonSetCondition]]] = null,
    numberAvailable: Input[Double] = null,
    numberUnavailable: Input[Double] = null,
    observedGeneration: Input[Double] = null,
    updatedNumberScheduled: Input[Double] = null
  ): DaemonSetStatus = {
    val __obj = js.Dynamic.literal(currentNumberScheduled = currentNumberScheduled.asInstanceOf[js.Any], desiredNumberScheduled = desiredNumberScheduled.asInstanceOf[js.Any], numberMisscheduled = numberMisscheduled.asInstanceOf[js.Any], numberReady = numberReady.asInstanceOf[js.Any])
    if (collisionCount != null) __obj.updateDynamic("collisionCount")(collisionCount.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (numberAvailable != null) __obj.updateDynamic("numberAvailable")(numberAvailable.asInstanceOf[js.Any])
    if (numberUnavailable != null) __obj.updateDynamic("numberUnavailable")(numberUnavailable.asInstanceOf[js.Any])
    if (observedGeneration != null) __obj.updateDynamic("observedGeneration")(observedGeneration.asInstanceOf[js.Any])
    if (updatedNumberScheduled != null) __obj.updateDynamic("updatedNumberScheduled")(updatedNumberScheduled.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaemonSetStatus]
  }
}

