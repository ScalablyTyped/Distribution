package typings.atPulumiAws.typesInputMod.ec2Ns

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateInstanceMarketOptions extends js.Object {
  var marketType: js.UndefOr[Input[String]] = js.undefined
  var spotOptions: js.UndefOr[Input[LaunchTemplateInstanceMarketOptionsSpotOptions]] = js.undefined
}

object LaunchTemplateInstanceMarketOptions {
  @scala.inline
  def apply(
    marketType: Input[String] = null,
    spotOptions: Input[LaunchTemplateInstanceMarketOptionsSpotOptions] = null
  ): LaunchTemplateInstanceMarketOptions = {
    val __obj = js.Dynamic.literal()
    if (marketType != null) __obj.updateDynamic("marketType")(marketType.asInstanceOf[js.Any])
    if (spotOptions != null) __obj.updateDynamic("spotOptions")(spotOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateInstanceMarketOptions]
  }
}

