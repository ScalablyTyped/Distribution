package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateInstanceMarketOptionsSpotOptions extends js.Object {
  var blockDurationMinutes: js.UndefOr[Double] = js.undefined
  var instanceInterruptionBehavior: js.UndefOr[String] = js.undefined
  var maxPrice: js.UndefOr[String] = js.undefined
  var spotInstanceType: js.UndefOr[String] = js.undefined
  var validUntil: String
}

object LaunchTemplateInstanceMarketOptionsSpotOptions {
  @scala.inline
  def apply(
    validUntil: String,
    blockDurationMinutes: Int | Double = null,
    instanceInterruptionBehavior: String = null,
    maxPrice: String = null,
    spotInstanceType: String = null
  ): LaunchTemplateInstanceMarketOptionsSpotOptions = {
    val __obj = js.Dynamic.literal(validUntil = validUntil)
    if (blockDurationMinutes != null) __obj.updateDynamic("blockDurationMinutes")(blockDurationMinutes.asInstanceOf[js.Any])
    if (instanceInterruptionBehavior != null) __obj.updateDynamic("instanceInterruptionBehavior")(instanceInterruptionBehavior)
    if (maxPrice != null) __obj.updateDynamic("maxPrice")(maxPrice)
    if (spotInstanceType != null) __obj.updateDynamic("spotInstanceType")(spotInstanceType)
    __obj.asInstanceOf[LaunchTemplateInstanceMarketOptionsSpotOptions]
  }
}

