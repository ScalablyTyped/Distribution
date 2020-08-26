package typings.pubnub.mod

import typings.pubnub.anon.Apns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationsPayload extends js.Object {
  var apns: APNSNotificationPayload = js.native
  var badge: js.UndefOr[Double] = js.native
  var body: js.UndefOr[String] = js.native
  var debugging: Boolean = js.native
  var fcm: FCMNotificationPayload = js.native
  var mpns: MPNSNotificationPayload = js.native
  var payload: Apns = js.native
  var sound: js.UndefOr[String] = js.native
  var subtitle: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  def buildPayload(platforms: js.Array[String]): js.Object = js.native
}

object NotificationsPayload {
  @scala.inline
  def apply(
    apns: APNSNotificationPayload,
    buildPayload: js.Array[String] => js.Object,
    debugging: Boolean,
    fcm: FCMNotificationPayload,
    mpns: MPNSNotificationPayload,
    payload: Apns
  ): NotificationsPayload = {
    val __obj = js.Dynamic.literal(apns = apns.asInstanceOf[js.Any], buildPayload = js.Any.fromFunction1(buildPayload), debugging = debugging.asInstanceOf[js.Any], fcm = fcm.asInstanceOf[js.Any], mpns = mpns.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationsPayload]
  }
  @scala.inline
  implicit class NotificationsPayloadOps[Self <: NotificationsPayload] (val x: Self) extends AnyVal {
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
    def setApns(value: APNSNotificationPayload): Self = this.set("apns", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuildPayload(value: js.Array[String] => js.Object): Self = this.set("buildPayload", js.Any.fromFunction1(value))
    @scala.inline
    def setDebugging(value: Boolean): Self = this.set("debugging", value.asInstanceOf[js.Any])
    @scala.inline
    def setFcm(value: FCMNotificationPayload): Self = this.set("fcm", value.asInstanceOf[js.Any])
    @scala.inline
    def setMpns(value: MPNSNotificationPayload): Self = this.set("mpns", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: Apns): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setBadge(value: Double): Self = this.set("badge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setSound(value: String): Self = this.set("sound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSound: Self = this.set("sound", js.undefined)
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

