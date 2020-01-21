package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchTemplateInstanceMarketOption extends js.Object {
  var marketType: String = js.native
  var spotOptions: js.Array[GetLaunchTemplateInstanceMarketOptionSpotOption] = js.native
}

object GetLaunchTemplateInstanceMarketOption {
  @scala.inline
  def apply(marketType: String, spotOptions: js.Array[GetLaunchTemplateInstanceMarketOptionSpotOption]): GetLaunchTemplateInstanceMarketOption = {
    val __obj = js.Dynamic.literal(marketType = marketType.asInstanceOf[js.Any], spotOptions = spotOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetLaunchTemplateInstanceMarketOption]
  }
}

