package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PredefinedMetricTypeResourceLabel extends js.Object {
  var predefinedMetricType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var resourceLabel: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_PredefinedMetricTypeResourceLabel {
  @scala.inline
  def apply(
    predefinedMetricType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    resourceLabel: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_PredefinedMetricTypeResourceLabel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("predefinedMetricType")(predefinedMetricType.asInstanceOf[js.Any])
    if (resourceLabel != null) __obj.updateDynamic("resourceLabel")(resourceLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PredefinedMetricTypeResourceLabel]
  }
}

