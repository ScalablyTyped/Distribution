package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateInstanceMarketOptionsSpotOptions extends js.Object {
  var blockDurationMinutes: js.UndefOr[Input[Double]] = js.native
  var instanceInterruptionBehavior: js.UndefOr[Input[String]] = js.native
  var maxPrice: js.UndefOr[Input[String]] = js.native
  var spotInstanceType: js.UndefOr[Input[String]] = js.native
  var validUntil: js.UndefOr[Input[String]] = js.native
}

object LaunchTemplateInstanceMarketOptionsSpotOptions {
  @scala.inline
  def apply(
    blockDurationMinutes: Input[Double] = null,
    instanceInterruptionBehavior: Input[String] = null,
    maxPrice: Input[String] = null,
    spotInstanceType: Input[String] = null,
    validUntil: Input[String] = null
  ): LaunchTemplateInstanceMarketOptionsSpotOptions = {
    val __obj = js.Dynamic.literal()
    if (blockDurationMinutes != null) __obj.updateDynamic("blockDurationMinutes")(blockDurationMinutes.asInstanceOf[js.Any])
    if (instanceInterruptionBehavior != null) __obj.updateDynamic("instanceInterruptionBehavior")(instanceInterruptionBehavior.asInstanceOf[js.Any])
    if (maxPrice != null) __obj.updateDynamic("maxPrice")(maxPrice.asInstanceOf[js.Any])
    if (spotInstanceType != null) __obj.updateDynamic("spotInstanceType")(spotInstanceType.asInstanceOf[js.Any])
    if (validUntil != null) __obj.updateDynamic("validUntil")(validUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateInstanceMarketOptionsSpotOptions]
  }
}

