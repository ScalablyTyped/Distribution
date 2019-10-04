package typings.atPulumiAws.typesInputMod.mqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBrokerLogs extends js.Object {
  var audit: js.UndefOr[Boolean] = js.undefined
  var general: js.UndefOr[Boolean] = js.undefined
}

object GetBrokerLogs {
  @scala.inline
  def apply(audit: js.UndefOr[Boolean] = js.undefined, general: js.UndefOr[Boolean] = js.undefined): GetBrokerLogs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audit)) __obj.updateDynamic("audit")(audit)
    if (!js.isUndefined(general)) __obj.updateDynamic("general")(general)
    __obj.asInstanceOf[GetBrokerLogs]
  }
}

