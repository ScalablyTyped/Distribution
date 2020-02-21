package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FCMNotificationPayload extends BaseNotificationPayload {
  var icon: js.UndefOr[String] = js.undefined
  var isSilent: Boolean
  var tag: js.UndefOr[String] = js.undefined
}

object FCMNotificationPayload {
  @scala.inline
  def apply(
    isSilent: Boolean,
    payload: js.Object,
    badge: Int | Double = null,
    body: String = null,
    icon: String = null,
    sound: String = null,
    subtitle: String = null,
    tag: String = null,
    title: String = null
  ): FCMNotificationPayload = {
    val __obj = js.Dynamic.literal(isSilent = isSilent.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FCMNotificationPayload]
  }
}

