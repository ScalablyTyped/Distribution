package typings.atPulumiAws.typesOutputMod.mqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokerLogs extends js.Object {
  /**
    * Enables audit logging. User management action made using JMX or the ActiveMQ Web Console is logged. Defaults to `false`.
    */
  var audit: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables general logging via CloudWatch. Defaults to `false`.
    */
  var general: js.UndefOr[Boolean] = js.undefined
}

object BrokerLogs {
  @scala.inline
  def apply(audit: js.UndefOr[Boolean] = js.undefined, general: js.UndefOr[Boolean] = js.undefined): BrokerLogs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audit)) __obj.updateDynamic("audit")(audit)
    if (!js.isUndefined(general)) __obj.updateDynamic("general")(general)
    __obj.asInstanceOf[BrokerLogs]
  }
}

