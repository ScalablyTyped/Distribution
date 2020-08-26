package typings.socketclusterServer.serversocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionOptions extends js.Object {
  var channel: String = js.native
  var data: js.UndefOr[js.Any] = js.native
  var waitForAuth: js.UndefOr[Boolean] = js.native
}

object SubscriptionOptions {
  @scala.inline
  def apply(channel: String): SubscriptionOptions = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionOptions]
  }
  @scala.inline
  implicit class SubscriptionOptionsOps[Self <: SubscriptionOptions] (val x: Self) extends AnyVal {
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
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setWaitForAuth(value: Boolean): Self = this.set("waitForAuth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForAuth: Self = this.set("waitForAuth", js.undefined)
  }
  
}

