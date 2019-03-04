package typings
package atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns

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
  val minReadySeconds: scala.Double
  /**
    * Indicates that the deployment is paused and will not be processed by the deployment
    * controller.
    */
  val paused: scala.Boolean
  /**
    * The maximum time in seconds for a deployment to make progress before it is considered to be
    * failed. The deployment controller will continue to process failed deployments and a
    * condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status.
    * Note that progress will not be estimated during the time a deployment is paused. This is
    * set to the max value of int32 (i.e. 2147483647) by default, which means "no deadline".
    */
  val progressDeadlineSeconds: scala.Double
  /**
    * Number of desired pods. This is a pointer to distinguish between explicit zero and not
    * specified. Defaults to 1.
    */
  val replicas: scala.Double
  /**
    * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish
    * between explicit zero and not specified. This is set to the max value of int32 (i.e.
    * 2147483647) by default, which means "retaining all old RelicaSets".
    */
  val revisionHistoryLimit: scala.Double
  /**
    * DEPRECATED. The config this deployment is rolling back to. Will be cleared after rollback
    * is done.
    */
  val rollbackTo: RollbackConfig
  /**
    * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the
    * ones affected by this deployment.
    */
  val selector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector
  /**
    * The deployment strategy to use to replace existing pods with new ones.
    */
  val strategy: DeploymentStrategy
  /**
    * Template describes the pods that will be created.
    */
  val template: atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodTemplateSpec
}

object DeploymentSpec {
  @scala.inline
  def apply(
    minReadySeconds: scala.Double,
    paused: scala.Boolean,
    progressDeadlineSeconds: scala.Double,
    replicas: scala.Double,
    revisionHistoryLimit: scala.Double,
    rollbackTo: RollbackConfig,
    selector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector,
    strategy: DeploymentStrategy,
    template: atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodTemplateSpec
  ): DeploymentSpec = {
    val __obj = js.Dynamic.literal(minReadySeconds = minReadySeconds, paused = paused, progressDeadlineSeconds = progressDeadlineSeconds, replicas = replicas, revisionHistoryLimit = revisionHistoryLimit, rollbackTo = rollbackTo, selector = selector, strategy = strategy, template = template)
  
    __obj.asInstanceOf[DeploymentSpec]
  }
}

