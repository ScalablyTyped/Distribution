package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IntervalPercentage extends js.Object {
  var interval: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var percentage: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object Anon_IntervalPercentage {
  @scala.inline
  def apply(
    interval: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    percentage: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_IntervalPercentage = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IntervalPercentage]
  }
}

