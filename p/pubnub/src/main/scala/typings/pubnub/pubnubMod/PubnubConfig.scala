package typings.pubnub.pubnubMod

import typings.pubnub.Anon_FreeSocketKeepAliveTimeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PubnubConfig extends js.Object {
  var authKey: js.UndefOr[String] = js.undefined
  var autoNetworkDetection: js.UndefOr[Boolean] = js.undefined
  var cipherKey: js.UndefOr[String] = js.undefined
  var heartbeatInterval: js.UndefOr[Double] = js.undefined
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  var keepAliveSettings: js.UndefOr[Anon_FreeSocketKeepAliveTimeout] = js.undefined
  var listenToBrowserNetworkEvents: js.UndefOr[Boolean] = js.undefined
  var logVerbosity: js.UndefOr[Boolean] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var presenceTimeout: js.UndefOr[Double] = js.undefined
  var publishKey: js.UndefOr[String] = js.undefined
  var requestMessageCountThreshold: js.UndefOr[Double] = js.undefined
  var restore: js.UndefOr[Boolean] = js.undefined
  var secretKey: js.UndefOr[String] = js.undefined
  var ssl: js.UndefOr[Boolean] = js.undefined
  var subscribeKey: String
  var suppressLeaveEvents: js.UndefOr[Boolean] = js.undefined
  var uuid: js.UndefOr[String] = js.undefined
}

object PubnubConfig {
  @scala.inline
  def apply(
    subscribeKey: String,
    authKey: String = null,
    autoNetworkDetection: js.UndefOr[Boolean] = js.undefined,
    cipherKey: String = null,
    heartbeatInterval: Int | Double = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveSettings: Anon_FreeSocketKeepAliveTimeout = null,
    listenToBrowserNetworkEvents: js.UndefOr[Boolean] = js.undefined,
    logVerbosity: js.UndefOr[Boolean] = js.undefined,
    origin: String = null,
    presenceTimeout: Int | Double = null,
    publishKey: String = null,
    requestMessageCountThreshold: Int | Double = null,
    restore: js.UndefOr[Boolean] = js.undefined,
    secretKey: String = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    suppressLeaveEvents: js.UndefOr[Boolean] = js.undefined,
    uuid: String = null
  ): PubnubConfig = {
    val __obj = js.Dynamic.literal(subscribeKey = subscribeKey)
    if (authKey != null) __obj.updateDynamic("authKey")(authKey)
    if (!js.isUndefined(autoNetworkDetection)) __obj.updateDynamic("autoNetworkDetection")(autoNetworkDetection)
    if (cipherKey != null) __obj.updateDynamic("cipherKey")(cipherKey)
    if (heartbeatInterval != null) __obj.updateDynamic("heartbeatInterval")(heartbeatInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (keepAliveSettings != null) __obj.updateDynamic("keepAliveSettings")(keepAliveSettings)
    if (!js.isUndefined(listenToBrowserNetworkEvents)) __obj.updateDynamic("listenToBrowserNetworkEvents")(listenToBrowserNetworkEvents)
    if (!js.isUndefined(logVerbosity)) __obj.updateDynamic("logVerbosity")(logVerbosity)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (presenceTimeout != null) __obj.updateDynamic("presenceTimeout")(presenceTimeout.asInstanceOf[js.Any])
    if (publishKey != null) __obj.updateDynamic("publishKey")(publishKey)
    if (requestMessageCountThreshold != null) __obj.updateDynamic("requestMessageCountThreshold")(requestMessageCountThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(restore)) __obj.updateDynamic("restore")(restore)
    if (secretKey != null) __obj.updateDynamic("secretKey")(secretKey)
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl)
    if (!js.isUndefined(suppressLeaveEvents)) __obj.updateDynamic("suppressLeaveEvents")(suppressLeaveEvents)
    if (uuid != null) __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[PubnubConfig]
  }
}

