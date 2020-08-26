package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRelayWebhook extends js.Object {
  /** Authentication token to present in the X-MessageSystems-Webhook-Token header of POST requests to target */
  var auth_token: js.UndefOr[String] = js.native
  /** Restrict which inbound messages will be relayed to the target */
  var `match`: js.UndefOr[Match] = js.native
  /** User-friendly name  no  example: Inbound Customer Replies */
  var name: js.UndefOr[String] = js.native
  /** URL of the target to which to POST relay batches */
  var target: String = js.native
}

object UpdateRelayWebhook {
  @scala.inline
  def apply(target: String): UpdateRelayWebhook = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRelayWebhook]
  }
  @scala.inline
  implicit class UpdateRelayWebhookOps[Self <: UpdateRelayWebhook] (val x: Self) extends AnyVal {
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
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuth_token(value: String): Self = this.set("auth_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth_token: Self = this.set("auth_token", js.undefined)
    @scala.inline
    def setMatch(value: Match): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

