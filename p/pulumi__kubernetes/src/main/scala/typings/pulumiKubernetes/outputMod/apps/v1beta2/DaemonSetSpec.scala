package typings.pulumiKubernetes.outputMod.apps.v1beta2

import typings.pulumiKubernetes.outputMod.core.v1.PodTemplateSpec
import typings.pulumiKubernetes.outputMod.meta.v1.LabelSelector
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
  var minReadySeconds: Double = js.native
  
  /**
    * The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
    */
  var revisionHistoryLimit: Double = js.native
  
  /**
    * A label query over pods that are managed by the daemon set. Must match in order to be controlled. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  var selector: LabelSelector = js.native
  
  /**
    * An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every node that matches the template's node selector (or on every node if no node selector is specified). More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
    */
  var template: PodTemplateSpec = js.native
  
  /**
    * An update strategy to replace existing DaemonSet pods with new pods.
    */
  var updateStrategy: DaemonSetUpdateStrategy = js.native
}
object DaemonSetSpec {
  
  @scala.inline
  def apply(
    minReadySeconds: Double,
    revisionHistoryLimit: Double,
    selector: LabelSelector,
    template: PodTemplateSpec,
    updateStrategy: DaemonSetUpdateStrategy
  ): DaemonSetSpec = {
    val __obj = js.Dynamic.literal(minReadySeconds = minReadySeconds.asInstanceOf[js.Any], revisionHistoryLimit = revisionHistoryLimit.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], updateStrategy = updateStrategy.asInstanceOf[js.Any])
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
    def setMinReadySeconds(value: Double): Self = this.set("minReadySeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionHistoryLimit(value: Double): Self = this.set("revisionHistoryLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: LabelSelector): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: PodTemplateSpec): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateStrategy(value: DaemonSetUpdateStrategy): Self = this.set("updateStrategy", value.asInstanceOf[js.Any])
  }
}
