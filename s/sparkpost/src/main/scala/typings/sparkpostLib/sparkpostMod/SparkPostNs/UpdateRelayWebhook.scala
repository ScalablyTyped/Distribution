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

