package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateInstanceMarketOptions extends js.Object {
  var marketType: js.UndefOr[String] = js.undefined
  var spotOptions: js.UndefOr[LaunchTemplateInstanceMarketOptionsSpotOptions] = js.undefined
}

object LaunchTemplateInstanceMarketOptions {
  @scala.inline
  def apply(marketType: String = null, spotOptions: LaunchTemplateInstanceMarketOptionsSpotOptions = null): LaunchTemplateInstanceMarketOptions = {
    val __obj = js.Dynamic.literal()
    if (marketType != null) __obj.updateDynamic("marketType")(marketType)
    if (spotOptions != null) __obj.updateDynamic("spotOptions")(spotOptions)
    __obj.asInstanceOf[LaunchTemplateInstanceMarketOptions]
  }
}

