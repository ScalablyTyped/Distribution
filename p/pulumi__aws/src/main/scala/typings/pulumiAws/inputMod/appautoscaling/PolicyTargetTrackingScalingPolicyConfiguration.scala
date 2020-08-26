package typings.pulumiAws.inputMod.appautoscaling

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTargetTrackingScalingPolicyConfiguration extends js.Object {
  /**
    * A custom CloudWatch metric. Documentation can be found  at: [AWS Customized Metric Specification](https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_CustomizedMetricSpecification.html). See supported fields below.
    */
  var customizedMetricSpecification: js.UndefOr[
    Input[PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification]
  ] = js.native
  /**
    * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The default value is `false`.
    */
  var disableScaleIn: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A predefined metric. See supported fields below.
    */
  var predefinedMetricSpecification: js.UndefOr[
    Input[PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification]
  ] = js.native
  /**
    * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start.
    */
  var scaleInCooldown: js.UndefOr[Input[Double]] = js.native
  /**
    * The amount of time, in seconds, after a scale out activity completes before another scale out activity can start.
    */
  var scaleOutCooldown: js.UndefOr[Input[Double]] = js.native
  /**
    * The target value for the metric.
    */
  var targetValue: Input[Double] = js.native
}

object PolicyTargetTrackingScalingPolicyConfiguration {
  @scala.inline
  def apply(targetValue: Input[Double]): PolicyTargetTrackingScalingPolicyConfiguration = {
    val __obj = js.Dynamic.literal(targetValue = targetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingScalingPolicyConfiguration]
  }
  @scala.inline
  implicit class PolicyTargetTrackingScalingPolicyConfigurationOps[Self <: PolicyTargetTrackingScalingPolicyConfiguration] (val x: Self) extends AnyVal {
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
    def setTargetValue(value: Input[Double]): Self = this.set("targetValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomizedMetricSpecification(value: Input[PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification]): Self = this.set("customizedMetricSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomizedMetricSpecification: Self = this.set("customizedMetricSpecification", js.undefined)
    @scala.inline
    def setDisableScaleIn(value: Input[Boolean]): Self = this.set("disableScaleIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableScaleIn: Self = this.set("disableScaleIn", js.undefined)
    @scala.inline
    def setPredefinedMetricSpecification(value: Input[PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification]): Self = this.set("predefinedMetricSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredefinedMetricSpecification: Self = this.set("predefinedMetricSpecification", js.undefined)
    @scala.inline
    def setScaleInCooldown(value: Input[Double]): Self = this.set("scaleInCooldown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleInCooldown: Self = this.set("scaleInCooldown", js.undefined)
    @scala.inline
    def setScaleOutCooldown(value: Input[Double]): Self = this.set("scaleOutCooldown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleOutCooldown: Self = this.set("scaleOutCooldown", js.undefined)
  }
  
}

