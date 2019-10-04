package typings.atPulumiAws.typesOutputMod.autoscalingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension extends js.Object {
  /**
    * The name of the dimension.
    */
  var name: String
  /**
    * The value of the dimension.
    */
  var value: String
}

object PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension {
  @scala.inline
  def apply(name: String, value: String): PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension]
  }
}

