package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PredefinedMetricTypeResourceLabel extends js.Object {
  var predefinedMetricType: Input[String]
  var resourceLabel: js.UndefOr[Input[String]] = js.undefined
}

object Anon_PredefinedMetricTypeResourceLabel {
  @scala.inline
  def apply(predefinedMetricType: Input[String], resourceLabel: Input[String] = null): Anon_PredefinedMetricTypeResourceLabel = {
    val __obj = js.Dynamic.literal(predefinedMetricType = predefinedMetricType.asInstanceOf[js.Any])
    if (resourceLabel != null) __obj.updateDynamic("resourceLabel")(resourceLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PredefinedMetricTypeResourceLabel]
  }
}

