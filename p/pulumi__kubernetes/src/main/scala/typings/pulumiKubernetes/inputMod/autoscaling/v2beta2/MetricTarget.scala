package typings.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MetricTarget defines the target value, average value, or average utilization of a specific metric
  */
@js.native
trait MetricTarget extends js.Object {
  /**
    * averageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods. Currently only valid for Resource metric source type
    */
  var averageUtilization: js.UndefOr[Input[Double]] = js.native
  /**
    * averageValue is the target value of the average of the metric across all relevant pods (as a quantity)
    */
  var averageValue: js.UndefOr[Input[String]] = js.native
  /**
    * type represents whether the metric type is Utilization, Value, or AverageValue
    */
  var `type`: Input[String] = js.native
  /**
    * value is the target value of the metric (as a quantity).
    */
  var value: js.UndefOr[Input[String]] = js.native
}

object MetricTarget {
  @scala.inline
  def apply(`type`: Input[String]): MetricTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricTarget]
  }
  @scala.inline
  implicit class MetricTargetOps[Self <: MetricTarget] (val x: Self) extends AnyVal {
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
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAverageUtilization(value: Input[Double]): Self = this.set("averageUtilization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAverageUtilization: Self = this.set("averageUtilization", js.undefined)
    @scala.inline
    def setAverageValue(value: Input[String]): Self = this.set("averageValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAverageValue: Self = this.set("averageValue", js.undefined)
    @scala.inline
    def setValue(value: Input[String]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

