package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateInstanceMarketOptions extends js.Object {
  /**
    * The market type. Can be `spot`.
    */
  var marketType: js.UndefOr[Input[String]] = js.native
  /**
    * The options for [Spot Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html)
    */
  var spotOptions: js.UndefOr[Input[LaunchTemplateInstanceMarketOptionsSpotOptions]] = js.native
}

object LaunchTemplateInstanceMarketOptions {
  @scala.inline
  def apply(): LaunchTemplateInstanceMarketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateInstanceMarketOptions]
  }
  @scala.inline
  implicit class LaunchTemplateInstanceMarketOptionsOps[Self <: LaunchTemplateInstanceMarketOptions] (val x: Self) extends AnyVal {
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
    def setMarketType(value: Input[String]): Self = this.set("marketType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarketType: Self = this.set("marketType", js.undefined)
    @scala.inline
    def setSpotOptions(value: Input[LaunchTemplateInstanceMarketOptionsSpotOptions]): Self = this.set("spotOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotOptions: Self = this.set("spotOptions", js.undefined)
  }
  
}

