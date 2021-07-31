package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiKubernetes.inputMod.core.v1.PodTemplateSpec
import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
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
  var minReadySeconds: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Indicates that the deployment is paused and will not be processed by the deployment controller.
    */
  var paused: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. This is set to the max value of int32 (i.e. 2147483647) by default, which means "no deadline".
    */
  var progressDeadlineSeconds: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
    */
  var replicas: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. This is set to the max value of int32 (i.e. 2147483647) by default, which means "retaining all old RelicaSets".
    */
  var revisionHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * DEPRECATED. The config this deployment is rolling back to. Will be cleared after rollback is done.
    */
  var rollbackTo: js.UndefOr[Input[RollbackConfig]] = js.undefined
  
  /**
    * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment.
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
  def apply(template: Input[PodTemplateSpec]): DeploymentSpec = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentSpec]
  }
  
  @scala.inline
  implicit class DeploymentSpecMutableBuilder[Self <: DeploymentSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinReadySeconds(value: Input[Double]): Self = StObject.set(x, "minReadySeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinReadySecondsUndefined: Self = StObject.set(x, "minReadySeconds", js.undefined)
    
    @scala.inline
    def setPaused(value: Input[Boolean]): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
    
    @scala.inline
    def setProgressDeadlineSeconds(value: Input[Double]): Self = StObject.set(x, "progressDeadlineSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressDeadlineSecondsUndefined: Self = StObject.set(x, "progressDeadlineSeconds", js.undefined)
    
    @scala.inline
    def setReplicas(value: Input[Double]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
    
    @scala.inline
    def setRevisionHistoryLimit(value: Input[Double]): Self = StObject.set(x, "revisionHistoryLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionHistoryLimitUndefined: Self = StObject.set(x, "revisionHistoryLimit", js.undefined)
    
    @scala.inline
    def setRollbackTo(value: Input[RollbackConfig]): Self = StObject.set(x, "rollbackTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollbackToUndefined: Self = StObject.set(x, "rollbackTo", js.undefined)
    
    @scala.inline
    def setSelector(value: Input[LabelSelector]): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setStrategy(value: Input[DeploymentStrategy]): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    
    @scala.inline
    def setTemplate(value: Input[PodTemplateSpec]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
