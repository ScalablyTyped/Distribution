package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APNSNotificationPayload extends BaseNotificationPayload {
  var apnsPushType: js.UndefOr[String] = js.undefined
  var configurations: js.Array[APNS2Configuration]
  var isSilent: Boolean
}

object APNSNotificationPayload {
  @scala.inline
  def apply(
    configurations: js.Array[APNS2Configuration],
    isSilent: Boolean,
    payload: js.Object,
    apnsPushType: String = null,
    badge: Int | Double = null,
    body: String = null,
    sound: String = null,
    subtitle: String = null,
    title: String = null
  ): APNSNotificationPayload = {
    val __obj = js.Dynamic.literal(configurations = configurations.asInstanceOf[js.Any], isSilent = isSilent.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    if (apnsPushType != null) __obj.updateDynamic("apnsPushType")(apnsPushType.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[APNSNotificationPayload]
  }
}

