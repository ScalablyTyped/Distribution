package typings.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MetricValueStatus holds the current value for a metric
  */
@js.native
trait MetricValueStatus extends js.Object {
  /**
    * currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
    */
  var averageUtilization: js.UndefOr[Input[Double]] = js.native
  /**
    * averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
    */
  var averageValue: js.UndefOr[Input[String]] = js.native
  /**
    * value is the current value of the metric (as a quantity).
    */
  var value: js.UndefOr[Input[String]] = js.native
}

object MetricValueStatus {
  @scala.inline
  def apply(): MetricValueStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricValueStatus]
  }
  @scala.inline
  implicit class MetricValueStatusOps[Self <: MetricValueStatus] (val x: Self) extends AnyVal {
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

