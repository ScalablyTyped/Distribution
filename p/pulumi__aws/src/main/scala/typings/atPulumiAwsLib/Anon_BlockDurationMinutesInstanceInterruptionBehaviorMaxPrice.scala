package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockDurationMinutesInstanceInterruptionBehaviorMaxPrice extends js.Object {
  var blockDurationMinutes: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var instanceInterruptionBehavior: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var maxPrice: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var spotInstanceType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var validUntil: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_BlockDurationMinutesInstanceInterruptionBehaviorMaxPrice {
  @scala.inline
  def apply(
    blockDurationMinutes: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    instanceInterruptionBehavior: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    maxPrice: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    spotInstanceType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    validUntil: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_BlockDurationMinutesInstanceInterruptionBehaviorMaxPrice = {
    val __obj = js.Dynamic.literal()
    if (blockDurationMinutes != null) __obj.updateDynamic("blockDurationMinutes")(blockDurationMinutes.asInstanceOf[js.Any])
    if (instanceInterruptionBehavior != null) __obj.updateDynamic("instanceInterruptionBehavior")(instanceInterruptionBehavior.asInstanceOf[js.Any])
    if (maxPrice != null) __obj.updateDynamic("maxPrice")(maxPrice.asInstanceOf[js.Any])
    if (spotInstanceType != null) __obj.updateDynamic("spotInstanceType")(spotInstanceType.asInstanceOf[js.Any])
    if (validUntil != null) __obj.updateDynamic("validUntil")(validUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BlockDurationMinutesInstanceInterruptionBehaviorMaxPrice]
  }
}

