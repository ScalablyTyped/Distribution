package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRelayWebhook extends js.Object {
  /** Authentication token to present in the X-MessageSystems-Webhook-Token header of POST requests to target */
  var auth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Restrict which inbound messages will be relayed to the target */
  var `match`: js.UndefOr[Match] = js.undefined
  /** User-friendly name  no  example: Inbound Customer Replies */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** URL of the target to which to POST relay batches */
  var target: java.lang.String
}

object UpdateRelayWebhook {
  @scala.inline
  def apply(
    target: java.lang.String,
    auth_token: java.lang.String = null,
    `match`: Match = null,
    name: java.lang.String = null
  ): UpdateRelayWebhook = {
    val __obj = js.Dynamic.literal(target = target)
    if (auth_token != null) __obj.updateDynamic("auth_token")(auth_token)
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[UpdateRelayWebhook]
  }
}

