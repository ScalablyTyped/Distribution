package typings
package slackDashWinstonLib.slackDashWinstonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlackTransportOptions
  extends winstonDashTransportLib.winstonDashTransportMod.TransportStreamNs.TransportStreamOptions {
  var channel: java.lang.String
  var domain: java.lang.String
  var icon_emoji: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var queueDelay: js.UndefOr[scala.Double] = js.undefined
  var token: java.lang.String
  var username: js.UndefOr[java.lang.String] = js.undefined
  var webhook_url: java.lang.String
}

object SlackTransportOptions {
  @scala.inline
  def apply(
    channel: java.lang.String,
    domain: java.lang.String,
    token: java.lang.String,
    webhook_url: java.lang.String,
    close: js.Function0[scala.Unit] = null,
    format: logformLib.logformMod.Format = null,
    handleExceptions: js.UndefOr[scala.Boolean] = js.undefined,
    icon_emoji: java.lang.String = null,
    level: java.lang.String = null,
    log: js.Function2[/* info */ js.Any, /* next */ js.Function0[scala.Unit], _] = null,
    logv: js.Function2[/* info */ js.Any, /* next */ js.Function0[scala.Unit], _] = null,
    message: java.lang.String = null,
    queueDelay: scala.Int | scala.Double = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    username: java.lang.String = null
  ): SlackTransportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channel")(channel)
    __obj.updateDynamic("domain")(domain)
    __obj.updateDynamic("token")(token)
    __obj.updateDynamic("webhook_url")(webhook_url)
    if (close != null) __obj.updateDynamic("close")(close)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(handleExceptions)) __obj.updateDynamic("handleExceptions")(handleExceptions)
    if (icon_emoji != null) __obj.updateDynamic("icon_emoji")(icon_emoji)
    if (level != null) __obj.updateDynamic("level")(level)
    if (log != null) __obj.updateDynamic("log")(log)
    if (logv != null) __obj.updateDynamic("logv")(logv)
    if (message != null) __obj.updateDynamic("message")(message)
    if (queueDelay != null) __obj.updateDynamic("queueDelay")(queueDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[SlackTransportOptions]
  }
}

