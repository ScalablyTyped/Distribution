package typings.atPulumiAws.typesOutputMod.pinpointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppCampaignHook extends js.Object {
  /**
    * Lambda function name or ARN to be called for delivery. Conflicts with `webUrl`
    */
  var lambdaFunctionName: js.UndefOr[String] = js.undefined
  /**
    * What mode Lambda should be invoked in. Valid values for this parameter are `DELIVERY`, `FILTER`.
    */
  var mode: js.UndefOr[String] = js.undefined
  /**
    * Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the request. Conflicts with `lambdaFunctionName`
    */
  var webUrl: js.UndefOr[String] = js.undefined
}

object AppCampaignHook {
  @scala.inline
  def apply(lambdaFunctionName: String = null, mode: String = null, webUrl: String = null): AppCampaignHook = {
    val __obj = js.Dynamic.literal()
    if (lambdaFunctionName != null) __obj.updateDynamic("lambdaFunctionName")(lambdaFunctionName)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl)
    __obj.asInstanceOf[AppCampaignHook]
  }
}

