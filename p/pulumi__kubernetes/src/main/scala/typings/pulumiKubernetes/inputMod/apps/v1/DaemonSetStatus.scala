package typings.pulumiKubernetes.inputMod.apps.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DaemonSetStatus represents the current status of a daemon set.
  */
@js.native
trait DaemonSetStatus extends js.Object {
  /**
    * Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
    */
  var collisionCount: js.UndefOr[Input[Double]] = js.native
  /**
    * Represents the latest available observations of a DaemonSet's current state.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[DaemonSetCondition]]]] = js.native
  /**
    * The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  var currentNumberScheduled: Input[Double] = js.native
  /**
    * The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  var desiredNumberScheduled: Input[Double] = js.native
  /**
    * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds)
    */
  var numberAvailable: js.UndefOr[Input[Double]] = js.native
  /**
    * The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  var numberMisscheduled: Input[Double] = js.native
  /**
    * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and ready.
    */
  var numberReady: Input[Double] = js.native
  /**
    * The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds)
    */
  var numberUnavailable: js.UndefOr[Input[Double]] = js.native
  /**
    * The most recent generation observed by the daemon set controller.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.native
  /**
    * The total number of nodes that are running updated daemon pod
    */
  var updatedNumberScheduled: js.UndefOr[Input[Double]] = js.native
}

object DaemonSetStatus {
  @scala.inline
  def apply(
    currentNumberScheduled: Input[Double],
    desiredNumberScheduled: Input[Double],
    numberMisscheduled: Input[Double],
    numberReady: Input[Double]
  ): DaemonSetStatus = {
    val __obj = js.Dynamic.literal(currentNumberScheduled = currentNumberScheduled.asInstanceOf[js.Any], desiredNumberScheduled = desiredNumberScheduled.asInstanceOf[js.Any], numberMisscheduled = numberMisscheduled.asInstanceOf[js.Any], numberReady = numberReady.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaemonSetStatus]
  }
  @scala.inline
  implicit class DaemonSetStatusOps[Self <: DaemonSetStatus] (val x: Self) extends AnyVal {
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
    def setCurrentNumberScheduled(value: Input[Double]): Self = this.set("currentNumberScheduled", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesiredNumberScheduled(value: Input[Double]): Self = this.set("desiredNumberScheduled", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberMisscheduled(value: Input[Double]): Self = this.set("numberMisscheduled", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberReady(value: Input[Double]): Self = this.set("numberReady", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollisionCount(value: Input[Double]): Self = this.set("collisionCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollisionCount: Self = this.set("collisionCount", js.undefined)
    @scala.inline
    def setConditionsVarargs(value: Input[DaemonSetCondition]*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: Input[js.Array[Input[DaemonSetCondition]]]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    @scala.inline
    def setNumberAvailable(value: Input[Double]): Self = this.set("numberAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberAvailable: Self = this.set("numberAvailable", js.undefined)
    @scala.inline
    def setNumberUnavailable(value: Input[Double]): Self = this.set("numberUnavailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberUnavailable: Self = this.set("numberUnavailable", js.undefined)
    @scala.inline
    def setObservedGeneration(value: Input[Double]): Self = this.set("observedGeneration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObservedGeneration: Self = this.set("observedGeneration", js.undefined)
    @scala.inline
    def setUpdatedNumberScheduled(value: Input[Double]): Self = this.set("updatedNumberScheduled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedNumberScheduled: Self = this.set("updatedNumberScheduled", js.undefined)
  }
  
}

