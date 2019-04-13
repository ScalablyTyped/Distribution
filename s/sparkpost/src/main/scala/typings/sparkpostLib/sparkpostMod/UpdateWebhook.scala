package typings
package sparkpostLib.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateWebhook extends js.Object {
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
  var events: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** User-friendly name for webhook */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** URL of the target to which to POST event batches */
  var target: js.UndefOr[java.lang.String] = js.undefined
}

object UpdateWebhook {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    auth_credentials: js.Any = null,
    auth_request_details: js.Any = null,
    auth_token: java.lang.String = null,
    auth_type: java.lang.String = null,
    events: js.Array[java.lang.String] = null,
    name: java.lang.String = null,
    target: java.lang.String = null
  ): UpdateWebhook = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (auth_credentials != null) __obj.updateDynamic("auth_credentials")(auth_credentials)
    if (auth_request_details != null) __obj.updateDynamic("auth_request_details")(auth_request_details)
    if (auth_token != null) __obj.updateDynamic("auth_token")(auth_token)
    if (auth_type != null) __obj.updateDynamic("auth_type")(auth_type)
    if (events != null) __obj.updateDynamic("events")(events)
    if (name != null) __obj.updateDynamic("name")(name)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[UpdateWebhook]
  }
}

