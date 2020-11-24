package typings.pulumiAws.inputMod.appautoscaling

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyStepScalingPolicyConfiguration extends js.Object {
  
  /**
    * Specifies whether the adjustment is an absolute number or a percentage of the current capacity. Valid values are `ChangeInCapacity`, `ExactCapacity`, and `PercentChangeInCapacity`.
    */
  var adjustmentType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start.
    */
  var cooldown: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The aggregation type for the policy's metrics. Valid values are "Minimum", "Maximum", and "Average". Without a value, AWS will treat the aggregation type as "Average".
    */
  var metricAggregationType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The minimum number to adjust your scalable dimension as a result of a scaling activity. If the adjustment type is PercentChangeInCapacity, the scaling policy changes the scalable dimension of the scalable target by this amount.
    */
  var minAdjustmentMagnitude: js.UndefOr[Input[Double]] = js.native
  
  /**
    * A set of adjustments that manage scaling. These have the following structure:
    */
  var stepAdjustments: js.UndefOr[Input[js.Array[Input[PolicyStepScalingPolicyConfigurationStepAdjustment]]]] = js.native
}
object PolicyStepScalingPolicyConfiguration {
  
  @scala.inline
  def apply(): PolicyStepScalingPolicyConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyStepScalingPolicyConfiguration]
  }
  
  @scala.inline
  implicit class PolicyStepScalingPolicyConfigurationOps[Self <: PolicyStepScalingPolicyConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAdjustmentType(value: Input[String]): Self = this.set("adjustmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjustmentType: Self = this.set("adjustmentType", js.undefined)
    
    @scala.inline
    def setCooldown(value: Input[Double]): Self = this.set("cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCooldown: Self = this.set("cooldown", js.undefined)
    
    @scala.inline
    def setMetricAggregationType(value: Input[String]): Self = this.set("metricAggregationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricAggregationType: Self = this.set("metricAggregationType", js.undefined)
    
    @scala.inline
    def setMinAdjustmentMagnitude(value: Input[Double]): Self = this.set("minAdjustmentMagnitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinAdjustmentMagnitude: Self = this.set("minAdjustmentMagnitude", js.undefined)
    
    @scala.inline
    def setStepAdjustmentsVarargs(value: Input[PolicyStepScalingPolicyConfigurationStepAdjustment]*): Self = this.set("stepAdjustments", js.Array(value :_*))
    
    @scala.inline
    def setStepAdjustments(value: Input[js.Array[Input[PolicyStepScalingPolicyConfigurationStepAdjustment]]]): Self = this.set("stepAdjustments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepAdjustments: Self = this.set("stepAdjustments", js.undefined)
  }
}
