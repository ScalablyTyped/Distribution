package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Webhook extends js.Object {
  /**
    * Reserved for future use
    *
    * @default {true}
    */
  var active: js.UndefOr[Boolean] = js.native
  /** Object containing credentials needed to make authorized POST requests to target */
  var auth_credentials: js.UndefOr[js.Any] = js.native
  /** Object containing details needed to request authorization credentials, as necessary */
  var auth_request_details: js.UndefOr[js.Any] = js.native
  /** Authentication token to present in the X-MessageSystems-Webhook-Token header of POST requests to target */
  var auth_token: js.UndefOr[String] = js.native
  /** Type of authentication to be used during POST requests to target */
  var auth_type: js.UndefOr[String] = js.native
  /** Array of event types this webhook will receive */
  var events: js.Array[String] = js.native
  /** User-friendly name for webhook */
  var name: String = js.native
  /** URL of the target to which to POST event batches */
  var target: String = js.native
}

object Webhook {
  @scala.inline
  def apply(events: js.Array[String], name: String, target: String): Webhook = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webhook]
  }
  @scala.inline
  implicit class WebhookOps[Self <: Webhook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEventsVarargs(value: String*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[String]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAuth_credentials(value: js.Any): Self = this.set("auth_credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth_credentials: Self = this.set("auth_credentials", js.undefined)
    @scala.inline
    def setAuth_request_details(value: js.Any): Self = this.set("auth_request_details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth_request_details: Self = this.set("auth_request_details", js.undefined)
    @scala.inline
    def setAuth_token(value: String): Self = this.set("auth_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth_token: Self = this.set("auth_token", js.undefined)
    @scala.inline
    def setAuth_type(value: String): Self = this.set("auth_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth_type: Self = this.set("auth_type", js.undefined)
  }
  
}

