package typings
package slackDashNodeLib.slackDashNodeMod.SlackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookOptions extends js.Object {
  var attachments: js.UndefOr[js.Array[_]] = js.undefined
  var channel: js.UndefOr[java.lang.String] = js.undefined
  var icon_emoji: js.UndefOr[java.lang.String] = js.undefined
  var link_names: js.UndefOr[js.Any] = js.undefined
  var response_type: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object WebhookOptions {
  @scala.inline
  def apply(
    attachments: js.Array[_] = null,
    channel: java.lang.String = null,
    icon_emoji: java.lang.String = null,
    link_names: js.Any = null,
    response_type: java.lang.String = null,
    text: java.lang.String = null,
    username: java.lang.String = null
  ): WebhookOptions = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (icon_emoji != null) __obj.updateDynamic("icon_emoji")(icon_emoji)
    if (link_names != null) __obj.updateDynamic("link_names")(link_names)
    if (response_type != null) __obj.updateDynamic("response_type")(response_type)
    if (text != null) __obj.updateDynamic("text")(text)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[WebhookOptions]
  }
}

