package typings.atPulumiAws.typesInputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBrokerLogs extends js.Object {
  var audit: js.UndefOr[Boolean] = js.native
  var general: js.UndefOr[Boolean] = js.native
}

object GetBrokerLogs {
  @scala.inline
  def apply(audit: js.UndefOr[Boolean] = js.undefined, general: js.UndefOr[Boolean] = js.undefined): GetBrokerLogs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audit)) __obj.updateDynamic("audit")(audit.asInstanceOf[js.Any])
    if (!js.isUndefined(general)) __obj.updateDynamic("general")(general.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBrokerLogs]
  }
}

