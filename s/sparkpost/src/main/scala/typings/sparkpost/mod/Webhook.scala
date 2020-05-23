package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Webhook extends js.Object {
  /**
    * Reserved for future use
    *
    * @default {true}
    */
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
  var events: js.Array[String]
  /** User-friendly name for webhook */
  var name: String
  /** URL of the target to which to POST event batches */
  var target: String
}

object Webhook {
  @scala.inline
  def apply(
    events: js.Array[String],
    name: String,
    target: String,
    active: js.UndefOr[Boolean] = js.undefined,
    auth_credentials: js.Any = null,
    auth_request_details: js.Any = null,
    auth_token: String = null,
    auth_type: String = null
  ): Webhook = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (auth_credentials != null) __obj.updateDynamic("auth_credentials")(auth_credentials.asInstanceOf[js.Any])
    if (auth_request_details != null) __obj.updateDynamic("auth_request_details")(auth_request_details.asInstanceOf[js.Any])
    if (auth_token != null) __obj.updateDynamic("auth_token")(auth_token.asInstanceOf[js.Any])
    if (auth_type != null) __obj.updateDynamic("auth_type")(auth_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webhook]
  }
}

