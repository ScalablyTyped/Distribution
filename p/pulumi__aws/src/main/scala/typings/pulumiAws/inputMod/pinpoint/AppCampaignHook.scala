package typings.pulumiAws.inputMod.pinpoint

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppCampaignHook extends js.Object {
  /**
    * Lambda function name or ARN to be called for delivery. Conflicts with `webUrl`
    */
  var lambdaFunctionName: js.UndefOr[Input[String]] = js.native
  /**
    * What mode Lambda should be invoked in. Valid values for this parameter are `DELIVERY`, `FILTER`.
    */
  var mode: js.UndefOr[Input[String]] = js.native
  /**
    * Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the request. Conflicts with `lambdaFunctionName`
    */
  var webUrl: js.UndefOr[Input[String]] = js.native
}

object AppCampaignHook {
  @scala.inline
  def apply(): AppCampaignHook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppCampaignHook]
  }
  @scala.inline
  implicit class AppCampaignHookOps[Self <: AppCampaignHook] (val x: Self) extends AnyVal {
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
    def setLambdaFunctionName(value: Input[String]): Self = this.set("lambdaFunctionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaFunctionName: Self = this.set("lambdaFunctionName", js.undefined)
    @scala.inline
    def setMode(value: Input[String]): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setWebUrl(value: Input[String]): Self = this.set("webUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebUrl: Self = this.set("webUrl", js.undefined)
  }
  
}

