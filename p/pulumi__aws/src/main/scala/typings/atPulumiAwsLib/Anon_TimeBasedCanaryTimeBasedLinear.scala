package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TimeBasedCanaryTimeBasedLinear extends js.Object {
  var timeBasedCanary: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_IntervalPercentage]] = js.undefined
  var timeBasedLinear: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_IntervalPercentage]] = js.undefined
  var `type`: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_TimeBasedCanaryTimeBasedLinear {
  @scala.inline
  def apply(
    timeBasedCanary: atPulumiPulumiLib.outputMod.Input[Anon_IntervalPercentage] = null,
    timeBasedLinear: atPulumiPulumiLib.outputMod.Input[Anon_IntervalPercentage] = null,
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_TimeBasedCanaryTimeBasedLinear = {
    val __obj = js.Dynamic.literal()
    if (timeBasedCanary != null) __obj.updateDynamic("timeBasedCanary")(timeBasedCanary.asInstanceOf[js.Any])
    if (timeBasedLinear != null) __obj.updateDynamic("timeBasedLinear")(timeBasedLinear.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TimeBasedCanaryTimeBasedLinear]
  }
}

