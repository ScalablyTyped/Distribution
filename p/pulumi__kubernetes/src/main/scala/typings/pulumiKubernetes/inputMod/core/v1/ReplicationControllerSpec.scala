package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ReplicationControllerSpec is the specification of a replication controller.
  */
@js.native
trait ReplicationControllerSpec extends js.Object {
  /**
    * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
    */
  var minReadySeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
    */
  var replicas: js.UndefOr[Input[Double]] = js.native
  /**
    * Selector is a label query over pods that should match the Replicas count. If Selector is empty, it is defaulted to the labels present on the Pod template. Label keys and values that must match in order to be controlled by this replication controller, if empty defaulted to labels on Pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  var selector: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Template is the object that describes the pod that will be created if insufficient replicas are detected. This takes precedence over a TemplateRef. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
    */
  var template: js.UndefOr[Input[PodTemplateSpec]] = js.native
}

object ReplicationControllerSpec {
  @scala.inline
  def apply(): ReplicationControllerSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationControllerSpec]
  }
  @scala.inline
  implicit class ReplicationControllerSpecOps[Self <: ReplicationControllerSpec] (val x: Self) extends AnyVal {
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
    def setMinReadySeconds(value: Input[Double]): Self = this.set("minReadySeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinReadySeconds: Self = this.set("minReadySeconds", js.undefined)
    @scala.inline
    def setReplicas(value: Input[Double]): Self = this.set("replicas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicas: Self = this.set("replicas", js.undefined)
    @scala.inline
    def setSelector(value: Input[StringDictionary[Input[String]]]): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setTemplate(value: Input[PodTemplateSpec]): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
  
}

