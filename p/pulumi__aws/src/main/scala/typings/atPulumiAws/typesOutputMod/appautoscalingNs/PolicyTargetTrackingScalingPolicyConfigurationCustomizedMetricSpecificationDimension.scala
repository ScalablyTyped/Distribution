package typings.atPulumiAws.typesOutputMod.appautoscalingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension extends js.Object {
  /**
    * The name of the policy.
    */
  var name: String
  var value: String
}

object PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension {
  @scala.inline
  def apply(name: String, value: String): PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension]
  }
}

