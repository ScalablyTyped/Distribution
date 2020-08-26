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
  @scala.inline
  implicit class GetLaunchTemplateInstanceMarketOptionOps[Self <: GetLaunchTemplateInstanceMarketOption] (val x: Self) extends AnyVal {
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
    def setMarketType(value: String): Self = this.set("marketType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpotOptionsVarargs(value: GetLaunchTemplateInstanceMarketOptionSpotOption*): Self = this.set("spotOptions", js.Array(value :_*))
    @scala.inline
    def setSpotOptions(value: js.Array[GetLaunchTemplateInstanceMarketOptionSpotOption]): Self = this.set("spotOptions", value.asInstanceOf[js.Any])
  }
  
}

