package typings
package pubnubLib.pubnubMod.PubnubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PubnubConfig extends js.Object {
  var authKey: js.UndefOr[java.lang.String] = js.undefined
  var cipherKey: js.UndefOr[java.lang.String] = js.undefined
  var heartbeatInterval: js.UndefOr[scala.Double] = js.undefined
  var keepAlive: js.UndefOr[scala.Boolean] = js.undefined
  var keepAliveSettings: js.UndefOr[pubnubLib.Anon_FreeSocketKeepAliveTimeout] = js.undefined
  var logVerbosity: js.UndefOr[scala.Boolean] = js.undefined
  var origin: js.UndefOr[java.lang.String] = js.undefined
  var presenceTimeout: js.UndefOr[scala.Double] = js.undefined
  var publishKey: js.UndefOr[java.lang.String] = js.undefined
  var restore: js.UndefOr[scala.Boolean] = js.undefined
  var secretKey: js.UndefOr[java.lang.String] = js.undefined
  var ssl: js.UndefOr[scala.Boolean] = js.undefined
  var subscribeKey: java.lang.String
  var suppressLeaveEvents: js.UndefOr[scala.Boolean] = js.undefined
  var uuid: js.UndefOr[java.lang.String] = js.undefined
}

object PubnubConfig {
  @scala.inline
  def apply(
    subscribeKey: java.lang.String,
    authKey: java.lang.String = null,
    cipherKey: java.lang.String = null,
    heartbeatInterval: scala.Int | scala.Double = null,
    keepAlive: js.UndefOr[scala.Boolean] = js.undefined,
    keepAliveSettings: pubnubLib.Anon_FreeSocketKeepAliveTimeout = null,
    logVerbosity: js.UndefOr[scala.Boolean] = js.undefined,
    origin: java.lang.String = null,
    presenceTimeout: scala.Int | scala.Double = null,
    publishKey: java.lang.String = null,
    restore: js.UndefOr[scala.Boolean] = js.undefined,
    secretKey: java.lang.String = null,
    ssl: js.UndefOr[scala.Boolean] = js.undefined,
    suppressLeaveEvents: js.UndefOr[scala.Boolean] = js.undefined,
    uuid: java.lang.String = null
  ): PubnubConfig = {
    val __obj = js.Dynamic.literal(subscribeKey = subscribeKey)
    if (authKey != null) __obj.updateDynamic("authKey")(authKey)
    if (cipherKey != null) __obj.updateDynamic("cipherKey")(cipherKey)
    if (heartbeatInterval != null) __obj.updateDynamic("heartbeatInterval")(heartbeatInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (keepAliveSettings != null) __obj.updateDynamic("keepAliveSettings")(keepAliveSettings)
    if (!js.isUndefined(logVerbosity)) __obj.updateDynamic("logVerbosity")(logVerbosity)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (presenceTimeout != null) __obj.updateDynamic("presenceTimeout")(presenceTimeout.asInstanceOf[js.Any])
    if (publishKey != null) __obj.updateDynamic("publishKey")(publishKey)
    if (!js.isUndefined(restore)) __obj.updateDynamic("restore")(restore)
    if (secretKey != null) __obj.updateDynamic("secretKey")(secretKey)
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl)
    if (!js.isUndefined(suppressLeaveEvents)) __obj.updateDynamic("suppressLeaveEvents")(suppressLeaveEvents)
    if (uuid != null) __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[PubnubConfig]
  }
}

