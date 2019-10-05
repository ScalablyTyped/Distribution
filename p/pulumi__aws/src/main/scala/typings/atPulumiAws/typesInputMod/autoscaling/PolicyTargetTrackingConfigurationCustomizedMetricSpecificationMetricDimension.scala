package typings.atPulumiAws.typesInputMod.autoscaling

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension extends js.Object {
  /**
    * The name of the dimension.
    */
  var name: Input[String]
  /**
    * The value of the dimension.
    */
  var value: Input[String]
}

object PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension {
  @scala.inline
  def apply(name: Input[String], value: Input[String]): PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension]
  }
}

