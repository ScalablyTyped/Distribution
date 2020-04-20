package typings.pulumiAws.outputMod.appautoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension extends js.Object {
  /**
    * The name of the policy.
    */
  var name: String = js.native
  var value: String = js.native
}

object PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension {
  @scala.inline
  def apply(name: String, value: String): PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension]
  }
}

