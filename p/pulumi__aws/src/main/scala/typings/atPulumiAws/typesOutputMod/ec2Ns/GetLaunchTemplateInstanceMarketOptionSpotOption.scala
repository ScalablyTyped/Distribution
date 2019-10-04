package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLaunchTemplateInstanceMarketOptionSpotOption extends js.Object {
  var blockDurationMinutes: Double
  var instanceInterruptionBehavior: String
  var maxPrice: String
  var spotInstanceType: String
  var validUntil: String
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
    val __obj = js.Dynamic.literal(blockDurationMinutes = blockDurationMinutes, instanceInterruptionBehavior = instanceInterruptionBehavior, maxPrice = maxPrice, spotInstanceType = spotInstanceType, validUntil = validUntil)
  
    __obj.asInstanceOf[GetLaunchTemplateInstanceMarketOptionSpotOption]
  }
}

