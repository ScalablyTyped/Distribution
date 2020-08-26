package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DeploymentStatus is the most recently observed status of the Deployment.
  */
@js.native
trait DeploymentStatus extends js.Object {
  /**
    * Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.
    */
  var availableReplicas: js.UndefOr[Input[Double]] = js.native
  /**
    * Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
    */
  var collisionCount: js.UndefOr[Input[Double]] = js.native
  /**
    * Represents the latest available observations of a deployment's current state.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[DeploymentCondition]]]] = js.native
  /**
    * The generation observed by the deployment controller.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.native
  /**
    * Total number of ready pods targeted by this deployment.
    */
  var readyReplicas: js.UndefOr[Input[Double]] = js.native
  /**
    * Total number of non-terminated pods targeted by this deployment (their labels match the selector).
    */
  var replicas: js.UndefOr[Input[Double]] = js.native
  /**
    * Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or pods that still have not been created.
    */
  var unavailableReplicas: js.UndefOr[Input[Double]] = js.native
  /**
    * Total number of non-terminated pods targeted by this deployment that have the desired template spec.
    */
  var updatedReplicas: js.UndefOr[Input[Double]] = js.native
}

object DeploymentStatus {
  @scala.inline
  def apply(): DeploymentStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentStatus]
  }
  @scala.inline
  implicit class DeploymentStatusOps[Self <: DeploymentStatus] (val x: Self) extends AnyVal {
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
    def setAvailableReplicas(value: Input[Double]): Self = this.set("availableReplicas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailableReplicas: Self = this.set("availableReplicas", js.undefined)
    @scala.inline
    def setCollisionCount(value: Input[Double]): Self = this.set("collisionCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollisionCount: Self = this.set("collisionCount", js.undefined)
    @scala.inline
    def setConditionsVarargs(value: Input[DeploymentCondition]*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: Input[js.Array[Input[DeploymentCondition]]]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    @scala.inline
    def setObservedGeneration(value: Input[Double]): Self = this.set("observedGeneration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObservedGeneration: Self = this.set("observedGeneration", js.undefined)
    @scala.inline
    def setReadyReplicas(value: Input[Double]): Self = this.set("readyReplicas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadyReplicas: Self = this.set("readyReplicas", js.undefined)
    @scala.inline
    def setReplicas(value: Input[Double]): Self = this.set("replicas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicas: Self = this.set("replicas", js.undefined)
    @scala.inline
    def setUnavailableReplicas(value: Input[Double]): Self = this.set("unavailableReplicas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnavailableReplicas: Self = this.set("unavailableReplicas", js.undefined)
    @scala.inline
    def setUpdatedReplicas(value: Input[Double]): Self = this.set("updatedReplicas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedReplicas: Self = this.set("updatedReplicas", js.undefined)
  }
  
}

