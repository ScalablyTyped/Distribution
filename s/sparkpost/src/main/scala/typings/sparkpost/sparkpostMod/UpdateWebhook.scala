package typings.sparkpost.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateWebhook extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  /** Object containing credentials needed to make authorized POST requests to target */
  var auth_credentials: js.UndefOr[js.Any] = js.undefined
  /** Object containing details needed to request authorization credentials, as necessary */
  var auth_request_details: js.UndefOr[js.Any] = js.undefined
  /** Authentication token to present in the X-MessageSystems-Webhook-Token header of POST requests to target */
  var auth_token: js.UndefOr[String] = js.undefined
  /** Type of authentication to be used during POST requests to target */
  var auth_type: js.UndefOr[String] = js.undefined
  /** Array of event types this webhook will receive */
  var events: js.UndefOr[js.Array[String]] = js.undefined
  /** User-friendly name for webhook */
  var name: js.UndefOr[String] = js.undefined
  /** URL of the target to which to POST event batches */
  var target: js.UndefOr[String] = js.undefined
}

object UpdateWebhook {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    auth_credentials: js.Any = null,
    auth_request_details: js.Any = null,
    auth_token: String = null,
    auth_type: String = null,
    events: js.Array[String] = null,
    name: String = null,
    target: String = null
  ): UpdateWebhook = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (auth_credentials != null) __obj.updateDynamic("auth_credentials")(auth_credentials.asInstanceOf[js.Any])
    if (auth_request_details != null) __obj.updateDynamic("auth_request_details")(auth_request_details.asInstanceOf[js.Any])
    if (auth_token != null) __obj.updateDynamic("auth_token")(auth_token.asInstanceOf[js.Any])
    if (auth_type != null) __obj.updateDynamic("auth_type")(auth_type.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWebhook]
  }
}

