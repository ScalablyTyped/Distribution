package typings.atPulumiAws.typesInputMod.appautoscaling

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification extends js.Object {
  var dimensions: js.UndefOr[
    Input[
      js.Array[
        Input[
          PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension
        ]
      ]
    ]
  ] = js.undefined
  var metricName: Input[String]
  var namespace: Input[String]
  var statistic: Input[String]
  var unit: js.UndefOr[Input[String]] = js.undefined
}

object PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification {
  @scala.inline
  def apply(
    metricName: Input[String],
    namespace: Input[String],
    statistic: Input[String],
    dimensions: Input[
      js.Array[
        Input[
          PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension
        ]
      ]
    ] = null,
    unit: Input[String] = null
  ): PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], statistic = statistic.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification]
  }
}

