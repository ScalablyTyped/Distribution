package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NotificationPayloads
trait BaseNotificationPayload extends js.Object {
  var badge: js.UndefOr[Double] = js.undefined
  var body: js.UndefOr[String] = js.undefined
  var payload: js.Object
  var sound: js.UndefOr[String] = js.undefined
  var subtitle: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object BaseNotificationPayload {
  @scala.inline
  def apply(
    payload: js.Object,
    badge: Int | Double = null,
    body: String = null,
    sound: String = null,
    subtitle: String = null,
    title: String = null
  ): BaseNotificationPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseNotificationPayload]
  }
}

