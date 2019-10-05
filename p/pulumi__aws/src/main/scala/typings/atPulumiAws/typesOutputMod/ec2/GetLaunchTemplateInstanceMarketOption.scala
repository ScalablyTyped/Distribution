package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLaunchTemplateInstanceMarketOption extends js.Object {
  var marketType: String
  var spotOptions: js.Array[GetLaunchTemplateInstanceMarketOptionSpotOption]
}

object GetLaunchTemplateInstanceMarketOption {
  @scala.inline
  def apply(marketType: String, spotOptions: js.Array[GetLaunchTemplateInstanceMarketOptionSpotOption]): GetLaunchTemplateInstanceMarketOption = {
    val __obj = js.Dynamic.literal(marketType = marketType, spotOptions = spotOptions)
  
    __obj.asInstanceOf[GetLaunchTemplateInstanceMarketOption]
  }
}

