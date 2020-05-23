package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MPNSNotificationPayload extends BaseNotificationPayload {
  var backContent: js.UndefOr[String] = js.undefined
  var backTitle: js.UndefOr[String] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object MPNSNotificationPayload {
  @scala.inline
  def apply(
    payload: js.Object,
    backContent: String = null,
    backTitle: String = null,
    badge: js.UndefOr[Double] = js.undefined,
    body: String = null,
    count: js.UndefOr[Double] = js.undefined,
    sound: String = null,
    subtitle: String = null,
    title: String = null,
    `type`: String = null
  ): MPNSNotificationPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    if (backContent != null) __obj.updateDynamic("backContent")(backContent.asInstanceOf[js.Any])
    if (backTitle != null) __obj.updateDynamic("backTitle")(backTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(badge)) __obj.updateDynamic("badge")(badge.get.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MPNSNotificationPayload]
  }
}

