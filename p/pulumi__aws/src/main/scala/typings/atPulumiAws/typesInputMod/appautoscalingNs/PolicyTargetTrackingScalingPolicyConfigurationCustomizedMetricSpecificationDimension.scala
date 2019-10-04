package typings.atPulumiAws.typesInputMod.appautoscalingNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension extends js.Object {
  /**
    * The name of the policy.
    */
  var name: Input[String]
  var value: Input[String]
}

object PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension {
  @scala.inline
  def apply(name: Input[String], value: Input[String]): PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension]
  }
}

