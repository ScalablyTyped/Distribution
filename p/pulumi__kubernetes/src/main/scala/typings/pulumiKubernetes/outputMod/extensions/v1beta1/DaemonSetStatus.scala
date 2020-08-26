package typings.pulumiKubernetes.outputMod.extensions.v1beta1

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
  var collisionCount: Double = js.native
  /**
    * Represents the latest available observations of a DaemonSet's current state.
    */
  var conditions: js.Array[DaemonSetCondition] = js.native
  /**
    * The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  var currentNumberScheduled: Double = js.native
  /**
    * The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  var desiredNumberScheduled: Double = js.native
  /**
    * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds)
    */
  var numberAvailable: Double = js.native
  /**
    * The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  var numberMisscheduled: Double = js.native
  /**
    * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and ready.
    */
  var numberReady: Double = js.native
  /**
    * The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds)
    */
  var numberUnavailable: Double = js.native
  /**
    * The most recent generation observed by the daemon set controller.
    */
  var observedGeneration: Double = js.native
  /**
    * The total number of nodes that are running updated daemon pod
    */
  var updatedNumberScheduled: Double = js.native
}

object DaemonSetStatus {
  @scala.inline
  def apply(
    collisionCount: Double,
    conditions: js.Array[DaemonSetCondition],
    currentNumberScheduled: Double,
    desiredNumberScheduled: Double,
    numberAvailable: Double,
    numberMisscheduled: Double,
    numberReady: Double,
    numberUnavailable: Double,
    observedGeneration: Double,
    updatedNumberScheduled: Double
  ): DaemonSetStatus = {
    val __obj = js.Dynamic.literal(collisionCount = collisionCount.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], currentNumberScheduled = currentNumberScheduled.asInstanceOf[js.Any], desiredNumberScheduled = desiredNumberScheduled.asInstanceOf[js.Any], numberAvailable = numberAvailable.asInstanceOf[js.Any], numberMisscheduled = numberMisscheduled.asInstanceOf[js.Any], numberReady = numberReady.asInstanceOf[js.Any], numberUnavailable = numberUnavailable.asInstanceOf[js.Any], observedGeneration = observedGeneration.asInstanceOf[js.Any], updatedNumberScheduled = updatedNumberScheduled.asInstanceOf[js.Any])
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
    def setCollisionCount(value: Double): Self = this.set("collisionCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setConditionsVarargs(value: DaemonSetCondition*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: js.Array[DaemonSetCondition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentNumberScheduled(value: Double): Self = this.set("currentNumberScheduled", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesiredNumberScheduled(value: Double): Self = this.set("desiredNumberScheduled", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberAvailable(value: Double): Self = this.set("numberAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberMisscheduled(value: Double): Self = this.set("numberMisscheduled", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberReady(value: Double): Self = this.set("numberReady", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberUnavailable(value: Double): Self = this.set("numberUnavailable", value.asInstanceOf[js.Any])
    @scala.inline
    def setObservedGeneration(value: Double): Self = this.set("observedGeneration", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedNumberScheduled(value: Double): Self = this.set("updatedNumberScheduled", value.asInstanceOf[js.Any])
  }
  
}

