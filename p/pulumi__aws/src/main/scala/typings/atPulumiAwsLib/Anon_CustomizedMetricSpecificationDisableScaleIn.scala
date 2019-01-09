package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomizedMetricSpecificationDisableScaleIn extends js.Object {
  var customizedMetricSpecification: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_DimensionsMetricName]] = js.undefined
  var disableScaleIn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var predefinedMetricSpecification: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_PredefinedMetricTypeResourceLabel]] = js.undefined
  var scaleInCooldown: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var scaleOutCooldown: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var targetValue: atPulumiPulumiLib.resourceMod.Input[scala.Double]
}

