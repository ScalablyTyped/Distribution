package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlexaSmartHome extends js.Object {
  var appId: String
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object AlexaSmartHome {
  @scala.inline
  def apply(appId: String, enabled: js.UndefOr[Boolean] = js.undefined): AlexaSmartHome = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlexaSmartHome]
  }
}

