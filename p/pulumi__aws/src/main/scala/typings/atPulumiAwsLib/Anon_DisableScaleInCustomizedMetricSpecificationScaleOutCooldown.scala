package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisableScaleInCustomizedMetricSpecificationScaleOutCooldown extends js.Object {
  var customizedMetricSpecification: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_StatisticMetricName]] = js.undefined
  var disableScaleIn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var predefinedMetricSpecification: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_PredefinedMetricType]] = js.undefined
  var scaleInCooldown: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var scaleOutCooldown: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var targetValue: atPulumiPulumiLib.resourceMod.Input[scala.Double]
}

