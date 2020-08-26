package typings.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.  Only one "target" type should be set.
  */
@js.native
trait ResourceMetricSource extends js.Object {
  /**
    * name is the name of the resource in question.
    */
  var name: Input[String] = js.native
  /**
    * targetAverageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
    */
  var targetAverageUtilization: js.UndefOr[Input[Double]] = js.native
  /**
    * targetAverageValue is the target value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the "pods" metric source type.
    */
  var targetAverageValue: js.UndefOr[Input[String]] = js.native
}

object ResourceMetricSource {
  @scala.inline
  def apply(name: Input[String]): ResourceMetricSource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceMetricSource]
  }
  @scala.inline
  implicit class ResourceMetricSourceOps[Self <: ResourceMetricSource] (val x: Self) extends AnyVal {
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetAverageUtilization(value: Input[Double]): Self = this.set("targetAverageUtilization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetAverageUtilization: Self = this.set("targetAverageUtilization", js.undefined)
    @scala.inline
    def setTargetAverageValue(value: Input[String]): Self = this.set("targetAverageValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetAverageValue: Self = this.set("targetAverageValue", js.undefined)
  }
  
}

