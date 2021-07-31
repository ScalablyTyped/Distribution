package typings.pulumiKubernetes.outputMod.apps.v1beta1

import typings.pulumiKubernetes.outputMod.core.v1.PodTemplateSpec
import typings.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DeploymentSpec is the specification of the desired behavior of the Deployment.
  */
trait DeploymentSpec extends StObject {
  
  /**
    * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
    */
  var minReadySeconds: Double
  
  /**
    * Indicates that the deployment is paused.
    */
  var paused: Boolean
  
  /**
    * The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
    */
  var progressDeadlineSeconds: Double
  
  /**
    * Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
    */
  var replicas: Double
  
  /**
    * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 2.
    */
  var revisionHistoryLimit: Double
  
  /**
    * DEPRECATED. The config this deployment is rolling back to. Will be cleared after rollback is done.
    */
  var rollbackTo: RollbackConfig
  
  /**
    * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment.
    */
  var selector: LabelSelector
  
  /**
    * The deployment strategy to use to replace existing pods with new ones.
    */
  var strategy: DeploymentStrategy
  
  /**
    * Template describes the pods that will be created.
    */
  var template: PodTemplateSpec
}
object DeploymentSpec {
  
  @scala.inline
  def apply(
    minReadySeconds: Double,
    paused: Boolean,
    progressDeadlineSeconds: Double,
    replicas: Double,
    revisionHistoryLimit: Double,
    rollbackTo: RollbackConfig,
    selector: LabelSelector,
    strategy: DeploymentStrategy,
    template: PodTemplateSpec
  ): DeploymentSpec = {
    val __obj = js.Dynamic.literal(minReadySeconds = minReadySeconds.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], progressDeadlineSeconds = progressDeadlineSeconds.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any], revisionHistoryLimit = revisionHistoryLimit.asInstanceOf[js.Any], rollbackTo = rollbackTo.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentSpec]
  }
  
  @scala.inline
  implicit class DeploymentSpecMutableBuilder[Self <: DeploymentSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinReadySeconds(value: Double): Self = StObject.set(x, "minReadySeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressDeadlineSeconds(value: Double): Self = StObject.set(x, "progressDeadlineSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicas(value: Double): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionHistoryLimit(value: Double): Self = StObject.set(x, "revisionHistoryLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollbackTo(value: RollbackConfig): Self = StObject.set(x, "rollbackTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: LabelSelector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategy(value: DeploymentStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: PodTemplateSpec): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
