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

object Webhook {
  @scala.inline
  def apply(
    events: js.Array[java.lang.String],
    name: java.lang.String,
    target: java.lang.String,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    auth_credentials: js.Any = null,
    auth_request_details: js.Any = null,
    auth_token: java.lang.String = null,
    auth_type: java.lang.String = null
  ): Webhook = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("target")(target)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (auth_credentials != null) __obj.updateDynamic("auth_credentials")(auth_credentials)
    if (auth_request_details != null) __obj.updateDynamic("auth_request_details")(auth_request_details)
    if (auth_token != null) __obj.updateDynamic("auth_token")(auth_token)
    if (auth_type != null) __obj.updateDynamic("auth_type")(auth_type)
    __obj.asInstanceOf[Webhook]
  }
}

