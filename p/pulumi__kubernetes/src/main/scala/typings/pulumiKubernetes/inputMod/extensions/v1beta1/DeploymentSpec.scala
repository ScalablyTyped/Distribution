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
trait DeploymentSpec extends js.Object {
  /**
    * Minimum number of seconds for which a newly created pod should be ready without any of its
    * container crashing, for it to be considered available. Defaults to 0 (pod will be
    * considered available as soon as it is ready)
    */
  var minReadySeconds: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Indicates that the deployment is paused and will not be processed by the deployment
    * controller.
    */
  var paused: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The maximum time in seconds for a deployment to make progress before it is considered to be
    * failed. The deployment controller will continue to process failed deployments and a
    * condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status.
    * Note that progress will not be estimated during the time a deployment is paused. This is
    * set to the max value of int32 (i.e. 2147483647) by default, which means "no deadline".
    */
  var progressDeadlineSeconds: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Number of desired pods. This is a pointer to distinguish between explicit zero and not
    * specified. Defaults to 1.
    */
  var replicas: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish
    * between explicit zero and not specified. This is set to the max value of int32 (i.e.
    * 2147483647) by default, which means "retaining all old RelicaSets".
    */
  var revisionHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
  /**
    * DEPRECATED. The config this deployment is rolling back to. Will be cleared after rollback
    * is done.
    */
  var rollbackTo: js.UndefOr[Input[RollbackConfig]] = js.undefined
  /**
    * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the
    * ones affected by this deployment.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.undefined
  /**
    * The deployment strategy to use to replace existing pods with new ones.
    */
  var strategy: js.UndefOr[Input[DeploymentStrategy]] = js.undefined
  /**
    * Template describes the pods that will be created.
    */
  var template: Input[PodTemplateSpec]
}

object DeploymentSpec {
  @scala.inline
  def apply(
    template: Input[PodTemplateSpec],
    minReadySeconds: Input[Double] = null,
    paused: Input[Boolean] = null,
    progressDeadlineSeconds: Input[Double] = null,
    replicas: Input[Double] = null,
    revisionHistoryLimit: Input[Double] = null,
    rollbackTo: Input[RollbackConfig] = null,
    selector: Input[LabelSelector] = null,
    strategy: Input[DeploymentStrategy] = null
  ): DeploymentSpec = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    if (minReadySeconds != null) __obj.updateDynamic("minReadySeconds")(minReadySeconds.asInstanceOf[js.Any])
    if (paused != null) __obj.updateDynamic("paused")(paused.asInstanceOf[js.Any])
    if (progressDeadlineSeconds != null) __obj.updateDynamic("progressDeadlineSeconds")(progressDeadlineSeconds.asInstanceOf[js.Any])
    if (replicas != null) __obj.updateDynamic("replicas")(replicas.asInstanceOf[js.Any])
    if (revisionHistoryLimit != null) __obj.updateDynamic("revisionHistoryLimit")(revisionHistoryLimit.asInstanceOf[js.Any])
    if (rollbackTo != null) __obj.updateDynamic("rollbackTo")(rollbackTo.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentSpec]
  }
}

