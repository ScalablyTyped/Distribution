package typings.pulumiAws.outputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerLogs extends js.Object {
  /**
    * Enables audit logging. User management action made using JMX or the ActiveMQ Web Console is logged. Defaults to `false`.
    */
  var audit: js.UndefOr[Boolean] = js.native
  /**
    * Enables general logging via CloudWatch. Defaults to `false`.
    */
  var general: js.UndefOr[Boolean] = js.native
}

object BrokerLogs {
  @scala.inline
  def apply(audit: js.UndefOr[Boolean] = js.undefined, general: js.UndefOr[Boolean] = js.undefined): BrokerLogs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audit)) __obj.updateDynamic("audit")(audit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(general)) __obj.updateDynamic("general")(general.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerLogs]
  }
}

