package typings.pulumiAws.inputMod.appautoscaling

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension extends js.Object {
  /**
    * The name of the policy.
    */
  var name: Input[String] = js.native
  /**
    * Value of the dimension.
    */
  var value: Input[String] = js.native
}

object PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension {
  @scala.inline
  def apply(name: Input[String], value: Input[String]): PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension]
  }
  @scala.inline
  implicit class PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimensionOps[Self <: PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension] (val x: Self) extends AnyVal {
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
    def setValue(value: Input[String]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

