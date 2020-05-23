package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateInstanceMarketOptionsSpotOptions extends js.Object {
  /**
    * The required duration in minutes. This value must be a multiple of 60.
    */
  var blockDurationMinutes: js.UndefOr[Double] = js.native
  /**
    * The behavior when a Spot Instance is interrupted. Can be `hibernate`,
    * `stop`, or `terminate`. (Default: `terminate`).
    */
  var instanceInterruptionBehavior: js.UndefOr[String] = js.native
  /**
    * The maximum hourly price you're willing to pay for the Spot Instances.
    */
  var maxPrice: js.UndefOr[String] = js.native
  /**
    * The Spot Instance request type. Can be `one-time`, or `persistent`.
    */
  var spotInstanceType: js.UndefOr[String] = js.native
  /**
    * The end date of the request.
    */
  var validUntil: String = js.native
}

object LaunchTemplateInstanceMarketOptionsSpotOptions {
  @scala.inline
  def apply(
    validUntil: String,
    blockDurationMinutes: js.UndefOr[Double] = js.undefined,
    instanceInterruptionBehavior: String = null,
    maxPrice: String = null,
    spotInstanceType: String = null
  ): LaunchTemplateInstanceMarketOptionsSpotOptions = {
    val __obj = js.Dynamic.literal(validUntil = validUntil.asInstanceOf[js.Any])
    if (!js.isUndefined(blockDurationMinutes)) __obj.updateDynamic("blockDurationMinutes")(blockDurationMinutes.get.asInstanceOf[js.Any])
    if (instanceInterruptionBehavior != null) __obj.updateDynamic("instanceInterruptionBehavior")(instanceInterruptionBehavior.asInstanceOf[js.Any])
    if (maxPrice != null) __obj.updateDynamic("maxPrice")(maxPrice.asInstanceOf[js.Any])
    if (spotInstanceType != null) __obj.updateDynamic("spotInstanceType")(spotInstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateInstanceMarketOptionsSpotOptions]
  }
}

