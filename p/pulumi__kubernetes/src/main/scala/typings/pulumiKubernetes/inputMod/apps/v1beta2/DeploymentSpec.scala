package typings.pulumiKubernetes.inputMod.apps.v1beta2

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
    * Indicates that the deployment is paused.
    */
  var paused: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The maximum time in seconds for a deployment to make progress before it is considered to be
    * failed. The deployment controller will continue to process failed deployments and a
    * condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status.
    * Note that progress will not be estimated during the time a deployment is paused. Defaults
    * to 600s.
    */
  var progressDeadlineSeconds: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Number of desired pods. This is a pointer to distinguish between explicit zero and not
    * specified. Defaults to 1.
    */
  var replicas: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish
    * between explicit zero and not specified. Defaults to 10.
    */
  var revisionHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the
    * ones affected by this deployment. It must match the pod template's labels.
    */
  var selector: Input[LabelSelector]
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
    selector: Input[LabelSelector],
    template: Input[PodTemplateSpec],
    minReadySeconds: Input[Double] = null,
    paused: Input[Boolean] = null,
    progressDeadlineSeconds: Input[Double] = null,
    replicas: Input[Double] = null,
    revisionHistoryLimit: Input[Double] = null,
    strategy: Input[DeploymentStrategy] = null
  ): DeploymentSpec = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    if (minReadySeconds != null) __obj.updateDynamic("minReadySeconds")(minReadySeconds.asInstanceOf[js.Any])
    if (paused != null) __obj.updateDynamic("paused")(paused.asInstanceOf[js.Any])
    if (progressDeadlineSeconds != null) __obj.updateDynamic("progressDeadlineSeconds")(progressDeadlineSeconds.asInstanceOf[js.Any])
    if (replicas != null) __obj.updateDynamic("replicas")(replicas.asInstanceOf[js.Any])
    if (revisionHistoryLimit != null) __obj.updateDynamic("revisionHistoryLimit")(revisionHistoryLimit.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentSpec]
  }
}

