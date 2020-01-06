package typings.atPulumiAws.typesOutputMod.pinpoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppCampaignHook extends js.Object {
  /**
    * Lambda function name or ARN to be called for delivery. Conflicts with `webUrl`
    */
  var lambdaFunctionName: js.UndefOr[String] = js.native
  /**
    * What mode Lambda should be invoked in. Valid values for this parameter are `DELIVERY`, `FILTER`.
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the request. Conflicts with `lambdaFunctionName`
    */
  var webUrl: js.UndefOr[String] = js.native
}

object AppCampaignHook {
  @scala.inline
  def apply(lambdaFunctionName: String = null, mode: String = null, webUrl: String = null): AppCampaignHook = {
    val __obj = js.Dynamic.literal()
    if (lambdaFunctionName != null) __obj.updateDynamic("lambdaFunctionName")(lambdaFunctionName.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppCampaignHook]
  }
}

