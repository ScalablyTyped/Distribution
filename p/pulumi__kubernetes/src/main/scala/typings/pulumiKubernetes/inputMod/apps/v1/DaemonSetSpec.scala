package typings.pulumiKubernetes.inputMod.apps.v1

import typings.pulumiKubernetes.inputMod.core.v1.PodTemplateSpec
import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DaemonSetSpec is the specification of a daemon set.
  */
@js.native
trait DaemonSetSpec extends js.Object {
  
  /**
    * The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready).
    */
  var minReadySeconds: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
    */
  var revisionHistoryLimit: js.UndefOr[Input[Double]] = js.native
  
  /**
    * A label query over pods that are managed by the daemon set. Must match in order to be controlled. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  var selector: Input[LabelSelector] = js.native
  
  /**
    * An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every node that matches the template's node selector (or on every node if no node selector is specified). More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
    */
  var template: Input[PodTemplateSpec] = js.native
  
  /**
    * An update strategy to replace existing DaemonSet pods with new pods.
    */
  var updateStrategy: js.UndefOr[Input[DaemonSetUpdateStrategy]] = js.native
}
object DaemonSetSpec {
  
  @scala.inline
  def apply(selector: Input[LabelSelector], template: Input[PodTemplateSpec]): DaemonSetSpec = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaemonSetSpec]
  }
  
  @scala.inline
  implicit class DaemonSetSpecOps[Self <: DaemonSetSpec] (val x: Self) extends AnyVal {
    
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
    def setRevisionHistoryLimit(value: Input[Double]): Self = this.set("revisionHistoryLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionHistoryLimit: Self = this.set("revisionHistoryLimit", js.undefined)
    
    @scala.inline
    def setUpdateStrategy(value: Input[DaemonSetUpdateStrategy]): Self = this.set("updateStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateStrategy: Self = this.set("updateStrategy", js.undefined)
  }
}
