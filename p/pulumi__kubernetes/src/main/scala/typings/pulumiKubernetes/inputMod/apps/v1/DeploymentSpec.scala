package typings.pulumiKubernetes.inputMod.apps.v1

import typings.pulumiKubernetes.inputMod.core.v1.PodTemplateSpec
import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Indicates that the deployment is paused.
    */
  var paused: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
    */
  var progressDeadlineSeconds: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
    */
  var replicas: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
    */
  var revisionHistoryLimit: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment. It must match the pod template's labels.
    */
  var selector: Input[LabelSelector] = js.native
  
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
  def apply(selector: Input[LabelSelector], template: Input[PodTemplateSpec]): DeploymentSpec = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
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
    def setSelector(value: Input[LabelSelector]): Self = this.set("selector", value.asInstanceOf[js.Any])
    
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
    def setStrategy(value: Input[DeploymentStrategy]): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
  }
}
