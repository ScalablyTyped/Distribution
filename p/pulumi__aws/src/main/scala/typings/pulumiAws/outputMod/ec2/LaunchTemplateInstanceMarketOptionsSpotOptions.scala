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
  def apply(validUntil: String): LaunchTemplateInstanceMarketOptionsSpotOptions = {
    val __obj = js.Dynamic.literal(validUntil = validUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateInstanceMarketOptionsSpotOptions]
  }
  @scala.inline
  implicit class LaunchTemplateInstanceMarketOptionsSpotOptionsOps[Self <: LaunchTemplateInstanceMarketOptionsSpotOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValidUntil(value: String): Self = this.set("validUntil", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlockDurationMinutes(value: Double): Self = this.set("blockDurationMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockDurationMinutes: Self = this.set("blockDurationMinutes", js.undefined)
    @scala.inline
    def setInstanceInterruptionBehavior(value: String): Self = this.set("instanceInterruptionBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceInterruptionBehavior: Self = this.set("instanceInterruptionBehavior", js.undefined)
    @scala.inline
    def setMaxPrice(value: String): Self = this.set("maxPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPrice: Self = this.set("maxPrice", js.undefined)
    @scala.inline
    def setSpotInstanceType(value: String): Self = this.set("spotInstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotInstanceType: Self = this.set("spotInstanceType", js.undefined)
  }
  
}

