package typings.pulumiAws.inputMod.appautoscaling

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification extends js.Object {
  
  /**
    * Configuration block(s) with the dimensions of the metric if the metric was published with dimensions. Detailed below.
    */
  var dimensions: js.UndefOr[
    Input[
      js.Array[
        Input[
          PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension
        ]
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
    * The statistic of the metric. Valid values: `Average`, `Minimum`, `Maximum`, `SampleCount`, and `Sum`.
    */
  var statistic: Input[String] = js.native
  
  /**
    * The unit of the metric.
    */
  var unit: js.UndefOr[Input[String]] = js.native
}
object PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification {
  
  @scala.inline
  def apply(metricName: Input[String], namespace: Input[String], statistic: Input[String]): PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], statistic = statistic.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification]
  }
  
  @scala.inline
  implicit class PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationOps[Self <: PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification] (val x: Self) extends AnyVal {
    
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
    def setDimensionsVarargs(
      value: (Input[
          PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension
        ])*
    ): Self = this.set("dimensions", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(
      value: Input[
          js.Array[
            Input[
              PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension
            ]
          ]
        ]
    ): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
    @scala.inline
    def setUnit(value: Input[String]): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
