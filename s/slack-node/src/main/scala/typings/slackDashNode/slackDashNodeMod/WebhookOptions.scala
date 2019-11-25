package typings.slackDashNode.slackDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookOptions extends js.Object {
  var attachments: js.UndefOr[js.Array[_]] = js.undefined
  var channel: js.UndefOr[String] = js.undefined
  var icon_emoji: js.UndefOr[String] = js.undefined
  var link_names: js.UndefOr[js.Any] = js.undefined
  var response_type: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object WebhookOptions {
  @scala.inline
  def apply(
    attachments: js.Array[_] = null,
    channel: String = null,
    icon_emoji: String = null,
    link_names: js.Any = null,
    response_type: String = null,
    text: String = null,
    username: String = null
  ): WebhookOptions = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (icon_emoji != null) __obj.updateDynamic("icon_emoji")(icon_emoji.asInstanceOf[js.Any])
    if (link_names != null) __obj.updateDynamic("link_names")(link_names.asInstanceOf[js.Any])
    if (response_type != null) __obj.updateDynamic("response_type")(response_type.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookOptions]
  }
}

