package typings.pulumiAws.inputMod.autoscaling

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTargetTrackingConfigurationCustomizedMetricSpecification extends js.Object {
  /**
    * The dimensions of the metric.
    */
  var metricDimensions: js.UndefOr[
    Input[
      js.Array[
        Input[PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension]
      ]
    ]
  ] = js.native
  /**
    * The name of the metric.
    */
  var metricName: Input[String] = js.native
  /**
    * The namespace of the metric.
    */
  var namespace: Input[String] = js.native
  /**
    * The statistic of the metric.
    */
  var statistic: Input[String] = js.native
  /**
    * The unit of the metric.
    */
  var unit: js.UndefOr[Input[String]] = js.native
}

object PolicyTargetTrackingConfigurationCustomizedMetricSpecification {
  @scala.inline
  def apply(metricName: Input[String], namespace: Input[String], statistic: Input[String]): PolicyTargetTrackingConfigurationCustomizedMetricSpecification = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], statistic = statistic.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingConfigurationCustomizedMetricSpecification]
  }
  @scala.inline
  implicit class PolicyTargetTrackingConfigurationCustomizedMetricSpecificationOps[Self <: PolicyTargetTrackingConfigurationCustomizedMetricSpecification] (val x: Self) extends AnyVal {
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
    def setMetricName(value: Input[String]): Self = this.set("metricName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: Input[String]): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatistic(value: Input[String]): Self = this.set("statistic", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetricDimensionsVarargs(value: Input[PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension]*): Self = this.set("metricDimensions", js.Array(value :_*))
    @scala.inline
    def setMetricDimensions(
      value: Input[
          js.Array[
            Input[PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension]
          ]
        ]
    ): Self = this.set("metricDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricDimensions: Self = this.set("metricDimensions", js.undefined)
    @scala.inline
    def setUnit(value: Input[String]): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
  
}

