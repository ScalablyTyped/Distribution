package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FCMNotificationPayload extends BaseNotificationPayload {
  var icon: js.UndefOr[String] = js.native
  var isSilent: Boolean = js.native
  var tag: js.UndefOr[String] = js.native
}

object FCMNotificationPayload {
  @scala.inline
  def apply(isSilent: Boolean, payload: js.Object): FCMNotificationPayload = {
    val __obj = js.Dynamic.literal(isSilent = isSilent.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[FCMNotificationPayload]
  }
  @scala.inline
  implicit class FCMNotificationPayloadOps[Self <: FCMNotificationPayload] (val x: Self) extends AnyVal {
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
    def setIsSilent(value: Boolean): Self = this.set("isSilent", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

