package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Webhook extends js.Object {
  /**
           * Reserved for future use
           *
           * @default {true}
           */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** Object containing credentials needed to make authorized POST requests to target */
  var auth_credentials: js.UndefOr[js.Any] = js.undefined
  /** Object containing details needed to request authorization credentials, as necessary */
  var auth_request_details: js.UndefOr[js.Any] = js.undefined
  /** Authentication token to present in the X-MessageSystems-Webhook-Token header of POST requests to target */
  var auth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Type of authentication to be used during POST requests to target */
  var auth_type: js.UndefOr[java.lang.String] = js.undefined
  /** Array of event types this webhook will receive */
  var events: js.Array[java.lang.String]
  /** User-friendly name for webhook */
  var name: java.lang.String
  /** URL of the target to which to POST event batches */
  var target: java.lang.String
}

