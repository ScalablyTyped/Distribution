package typings.pulumiAws.autoscalingPolicyMod

import typings.pulumiAws.inputMod.autoscaling.PolicyStepAdjustment
import typings.pulumiAws.inputMod.autoscaling.PolicyTargetTrackingConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyArgs extends js.Object {
  /**
    * Specifies whether the adjustment is an absolute number or a percentage of the current capacity. Valid values are `ChangeInCapacity`, `ExactCapacity`, and `PercentChangeInCapacity`.
    */
  val adjustmentType: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the autoscaling group.
    */
  val autoscalingGroupName: Input[String] = js.native
  /**
    * The amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start.
    */
  val cooldown: js.UndefOr[Input[Double]] = js.native
  /**
    * The estimated time, in seconds, until a newly launched instance will contribute CloudWatch metrics. Without a value, AWS will default to the group's specified cooldown period.
    */
  val estimatedInstanceWarmup: js.UndefOr[Input[Double]] = js.native
  /**
    * The aggregation type for the policy's metrics. Valid values are "Minimum", "Maximum", and "Average". Without a value, AWS will treat the aggregation type as "Average".
    */
  val metricAggregationType: js.UndefOr[Input[String]] = js.native
  val minAdjustmentMagnitude: js.UndefOr[Input[Double]] = js.native
  /**
    * The name of the dimension.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The policy type, either "SimpleScaling", "StepScaling" or "TargetTrackingScaling". If this value isn't provided, AWS will default to "SimpleScaling."
    */
  val policyType: js.UndefOr[Input[String]] = js.native
  /**
    * The number of members by which to
    * scale, when the adjustment bounds are breached. A positive value scales
    * up. A negative value scales down.
    */
  val scalingAdjustment: js.UndefOr[Input[Double]] = js.native
  /**
    * A set of adjustments that manage
    * group scaling. These have the following structure:
    */
  val stepAdjustments: js.UndefOr[Input[js.Array[Input[PolicyStepAdjustment]]]] = js.native
  /**
    * A target tracking policy. These have the following structure:
    */
  val targetTrackingConfiguration: js.UndefOr[Input[PolicyTargetTrackingConfiguration]] = js.native
}

object PolicyArgs {
  @scala.inline
  def apply(autoscalingGroupName: Input[String]): PolicyArgs = {
    val __obj = js.Dynamic.literal(autoscalingGroupName = autoscalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyArgs]
  }
  @scala.inline
  implicit class PolicyArgsOps[Self <: PolicyArgs] (val x: Self) extends AnyVal {
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
    def setAutoscalingGroupName(value: Input[String]): Self = this.set("autoscalingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdjustmentType(value: Input[String]): Self = this.set("adjustmentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjustmentType: Self = this.set("adjustmentType", js.undefined)
    @scala.inline
    def setCooldown(value: Input[Double]): Self = this.set("cooldown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCooldown: Self = this.set("cooldown", js.undefined)
    @scala.inline
    def setEstimatedInstanceWarmup(value: Input[Double]): Self = this.set("estimatedInstanceWarmup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedInstanceWarmup: Self = this.set("estimatedInstanceWarmup", js.undefined)
    @scala.inline
    def setMetricAggregationType(value: Input[String]): Self = this.set("metricAggregationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricAggregationType: Self = this.set("metricAggregationType", js.undefined)
    @scala.inline
    def setMinAdjustmentMagnitude(value: Input[Double]): Self = this.set("minAdjustmentMagnitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinAdjustmentMagnitude: Self = this.set("minAdjustmentMagnitude", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPolicyType(value: Input[String]): Self = this.set("policyType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyType: Self = this.set("policyType", js.undefined)
    @scala.inline
    def setScalingAdjustment(value: Input[Double]): Self = this.set("scalingAdjustment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScalingAdjustment: Self = this.set("scalingAdjustment", js.undefined)
    @scala.inline
    def setStepAdjustmentsVarargs(value: Input[PolicyStepAdjustment]*): Self = this.set("stepAdjustments", js.Array(value :_*))
    @scala.inline
    def setStepAdjustments(value: Input[js.Array[Input[PolicyStepAdjustment]]]): Self = this.set("stepAdjustments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepAdjustments: Self = this.set("stepAdjustments", js.undefined)
    @scala.inline
    def setTargetTrackingConfiguration(value: Input[PolicyTargetTrackingConfiguration]): Self = this.set("targetTrackingConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetTrackingConfiguration: Self = this.set("targetTrackingConfiguration", js.undefined)
  }
  
}

