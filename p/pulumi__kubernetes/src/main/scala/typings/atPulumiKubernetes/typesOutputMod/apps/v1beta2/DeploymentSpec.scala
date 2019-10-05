package typings.atPulumiKubernetes.typesOutputMod.apps.v1beta2

import typings.atPulumiKubernetes.typesOutputMod.core.v1.PodTemplateSpec
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.LabelSelector
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
  val minReadySeconds: Double
  /**
    * Indicates that the deployment is paused.
    */
  val paused: Boolean
  /**
    * The maximum time in seconds for a deployment to make progress before it is considered to be
    * failed. The deployment controller will continue to process failed deployments and a
    * condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status.
    * Note that progress will not be estimated during the time a deployment is paused. Defaults
    * to 600s.
    */
  val progressDeadlineSeconds: Double
  /**
    * Number of desired pods. This is a pointer to distinguish between explicit zero and not
    * specified. Defaults to 1.
    */
  val replicas: Double
  /**
    * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish
    * between explicit zero and not specified. Defaults to 10.
    */
  val revisionHistoryLimit: Double
  /**
    * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the
    * ones affected by this deployment. It must match the pod template's labels.
    */
  val selector: LabelSelector
  /**
    * The deployment strategy to use to replace existing pods with new ones.
    */
  val strategy: DeploymentStrategy
  /**
    * Template describes the pods that will be created.
    */
  val template: PodTemplateSpec
}

object DeploymentSpec {
  @scala.inline
  def apply(
    minReadySeconds: Double,
    paused: Boolean,
    progressDeadlineSeconds: Double,
    replicas: Double,
    revisionHistoryLimit: Double,
    selector: LabelSelector,
    strategy: DeploymentStrategy,
    template: PodTemplateSpec
  ): DeploymentSpec = {
    val __obj = js.Dynamic.literal(minReadySeconds = minReadySeconds, paused = paused, progressDeadlineSeconds = progressDeadlineSeconds, replicas = replicas, revisionHistoryLimit = revisionHistoryLimit, selector = selector, strategy = strategy, template = template)
  
    __obj.asInstanceOf[DeploymentSpec]
  }
}

