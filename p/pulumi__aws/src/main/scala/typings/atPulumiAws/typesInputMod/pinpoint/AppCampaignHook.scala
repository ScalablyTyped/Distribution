package typings.atPulumiAws.typesInputMod.pinpoint

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppCampaignHook extends js.Object {
  /**
    * Lambda function name or ARN to be called for delivery. Conflicts with `webUrl`
    */
  var lambdaFunctionName: js.UndefOr[Input[String]] = js.undefined
  /**
    * What mode Lambda should be invoked in. Valid values for this parameter are `DELIVERY`, `FILTER`.
    */
  var mode: js.UndefOr[Input[String]] = js.undefined
  /**
    * Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the request. Conflicts with `lambdaFunctionName`
    */
  var webUrl: js.UndefOr[Input[String]] = js.undefined
}

object AppCampaignHook {
  @scala.inline
  def apply(lambdaFunctionName: Input[String] = null, mode: Input[String] = null, webUrl: Input[String] = null): AppCampaignHook = {
    val __obj = js.Dynamic.literal()
    if (lambdaFunctionName != null) __obj.updateDynamic("lambdaFunctionName")(lambdaFunctionName.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppCampaignHook]
  }
}

