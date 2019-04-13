package typings
package sparkpostLib.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayWebhook extends js.Object {
  /** Authentication token to present in the X-MessageSystems-Webhook-Token header of POST requests to target */
  var auth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Restrict which inbound messages will be relayed to the target */
  var `match`: Match
  /** User-friendly name  no  example: Inbound Customer Replies */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** URL of the target to which to POST relay batches */
  var target: java.lang.String
}

object RelayWebhook {
  @scala.inline
  def apply(
    `match`: Match,
    target: java.lang.String,
    auth_token: java.lang.String = null,
    name: java.lang.String = null
  ): RelayWebhook = {
    val __obj = js.Dynamic.literal(target = target)
    __obj.updateDynamic("match")(`match`)
    if (auth_token != null) __obj.updateDynamic("auth_token")(auth_token)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[RelayWebhook]
  }
}

