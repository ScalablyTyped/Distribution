package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomizedMetricSpecificationDisableScaleInPredefinedMetricSpecification extends js.Object {
  var customizedMetricSpecification: js.UndefOr[Anon_MetricDimensions] = js.undefined
  var disableScaleIn: js.UndefOr[scala.Boolean] = js.undefined
  var predefinedMetricSpecification: js.UndefOr[Anon_PredefinedMetricType] = js.undefined
  var targetValue: scala.Double
}

object Anon_CustomizedMetricSpecificationDisableScaleInPredefinedMetricSpecification {
  @scala.inline
  def apply(
    targetValue: scala.Double,
    customizedMetricSpecification: Anon_MetricDimensions = null,
    disableScaleIn: js.UndefOr[scala.Boolean] = js.undefined,
    predefinedMetricSpecification: Anon_PredefinedMetricType = null
  ): Anon_CustomizedMetricSpecificationDisableScaleInPredefinedMetricSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("targetValue")(targetValue)
    if (customizedMetricSpecification != null) __obj.updateDynamic("customizedMetricSpecification")(customizedMetricSpecification)
    if (!js.isUndefined(disableScaleIn)) __obj.updateDynamic("disableScaleIn")(disableScaleIn)
    if (predefinedMetricSpecification != null) __obj.updateDynamic("predefinedMetricSpecification")(predefinedMetricSpecification)
    __obj.asInstanceOf[Anon_CustomizedMetricSpecificationDisableScaleInPredefinedMetricSpecification]
  }
}

