package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiKubernetes.inputMod.core.v1.PodTemplateSpec
import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DeploymentSpec is the specification of the desired behavior of the Deployment.
  */
@js.native
trait DeploymentSpec extends js.Object {
  /**
    * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
    */
  var minReadySeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * Indicates that the deployment is paused and will not be processed by the deployment controller.
    */
  var paused: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. This is set to the max value of int32 (i.e. 2147483647) by default, which means "no deadline".
    */
  var progressDeadlineSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
    */
  var replicas: js.UndefOr[Input[Double]] = js.native
  /**
    * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. This is set to the max value of int32 (i.e. 2147483647) by default, which means "retaining all old RelicaSets".
    */
  var revisionHistoryLimit: js.UndefOr[Input[Double]] = js.native
  /**
    * DEPRECATED. The config this deployment is rolling back to. Will be cleared after rollback is done.
    */
  var rollbackTo: js.UndefOr[Input[RollbackConfig]] = js.native
  /**
    * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.native
  /**
    * The deployment strategy to use to replace existing pods with new ones.
    */
  var strategy: js.UndefOr[Input[DeploymentStrategy]] = js.native
  /**
    * Template describes the pods that will be created.
    */
  var template: Input[PodTemplateSpec] = js.native
}

object DeploymentSpec {
  @scala.inline
  def apply(template: Input[PodTemplateSpec]): DeploymentSpec = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentSpec]
  }
  @scala.inline
  implicit class DeploymentSpecOps[Self <: DeploymentSpec] (val x: Self) extends AnyVal {
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
    def setTemplate(value: Input[PodTemplateSpec]): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinReadySeconds(value: Input[Double]): Self = this.set("minReadySeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinReadySeconds: Self = this.set("minReadySeconds", js.undefined)
    @scala.inline
    def setPaused(value: Input[Boolean]): Self = this.set("paused", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaused: Self = this.set("paused", js.undefined)
    @scala.inline
    def setProgressDeadlineSeconds(value: Input[Double]): Self = this.set("progressDeadlineSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressDeadlineSeconds: Self = this.set("progressDeadlineSeconds", js.undefined)
    @scala.inline
    def setReplicas(value: Input[Double]): Self = this.set("replicas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicas: Self = this.set("replicas", js.undefined)
    @scala.inline
    def setRevisionHistoryLimit(value: Input[Double]): Self = this.set("revisionHistoryLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionHistoryLimit: Self = this.set("revisionHistoryLimit", js.undefined)
    @scala.inline
    def setRollbackTo(value: Input[RollbackConfig]): Self = this.set("rollbackTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRollbackTo: Self = this.set("rollbackTo", js.undefined)
    @scala.inline
    def setSelector(value: Input[LabelSelector]): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setStrategy(value: Input[DeploymentStrategy]): Self = this.set("strategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
  }
  
}

