package typings.slackDashWinston.slackDashWinstonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlackTransportOptions extends js.Object {
  var channel: String
  var close: js.UndefOr[js.Function0[Unit]] = js.undefined
  var domain: String
  // from winston-transport TransportStreamOptions
  var format: js.UndefOr[Format] = js.undefined
  var handleExceptions: js.UndefOr[Boolean] = js.undefined
  var icon_emoji: js.UndefOr[String] = js.undefined
  var level: js.UndefOr[String] = js.undefined
  var log: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], _]] = js.undefined
  var logv: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], _]] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var queueDelay: js.UndefOr[Double] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var token: String
  var username: js.UndefOr[String] = js.undefined
  var webhook_url: String
}

object SlackTransportOptions {
  @scala.inline
  def apply(
    channel: String,
    domain: String,
    token: String,
    webhook_url: String,
    close: () => Unit = null,
    format: Format = null,
    handleExceptions: js.UndefOr[Boolean] = js.undefined,
    icon_emoji: String = null,
    level: String = null,
    log: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _ = null,
    logv: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _ = null,
    message: String = null,
    queueDelay: Int | Double = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    username: String = null
  ): SlackTransportOptions = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], webhook_url = webhook_url.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(handleExceptions)) __obj.updateDynamic("handleExceptions")(handleExceptions.asInstanceOf[js.Any])
    if (icon_emoji != null) __obj.updateDynamic("icon_emoji")(icon_emoji.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction2(log))
    if (logv != null) __obj.updateDynamic("logv")(js.Any.fromFunction2(logv))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (queueDelay != null) __obj.updateDynamic("queueDelay")(queueDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlackTransportOptions]
  }
}

