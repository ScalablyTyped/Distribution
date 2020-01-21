package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchTemplateInstanceMarketOptionSpotOption extends js.Object {
  var blockDurationMinutes: Double = js.native
  var instanceInterruptionBehavior: String = js.native
  var maxPrice: String = js.native
  var spotInstanceType: String = js.native
  var validUntil: String = js.native
}

object GetLaunchTemplateInstanceMarketOptionSpotOption {
  @scala.inline
  def apply(
    blockDurationMinutes: Double,
    instanceInterruptionBehavior: String,
    maxPrice: String,
    spotInstanceType: String,
    validUntil: String
  ): GetLaunchTemplateInstanceMarketOptionSpotOption = {
    val __obj = js.Dynamic.literal(blockDurationMinutes = blockDurationMinutes.asInstanceOf[js.Any], instanceInterruptionBehavior = instanceInterruptionBehavior.asInstanceOf[js.Any], maxPrice = maxPrice.asInstanceOf[js.Any], spotInstanceType = spotInstanceType.asInstanceOf[js.Any], validUntil = validUntil.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetLaunchTemplateInstanceMarketOptionSpotOption]
  }
}

