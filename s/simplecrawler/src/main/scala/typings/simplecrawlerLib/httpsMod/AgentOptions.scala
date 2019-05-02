package typings
package simplecrawlerLib.httpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentOptions
  extends simplecrawlerLib.httpMod.AgentOptions {
  var ca: js.UndefOr[js.Any] = js.undefined
  var cert: js.UndefOr[js.Any] = js.undefined
  var ciphers: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var maxCachedSessions: js.UndefOr[scala.Double] = js.undefined
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  var pfx: js.UndefOr[js.Any] = js.undefined
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  var secureProtocol: js.UndefOr[java.lang.String] = js.undefined
}

object AgentOptions {
  @scala.inline
  def apply(
    ca: js.Any = null,
    cert: js.Any = null,
    ciphers: java.lang.String = null,
    keepAlive: js.UndefOr[scala.Boolean] = js.undefined,
    keepAliveMsecs: scala.Int | scala.Double = null,
    key: js.Any = null,
    maxCachedSessions: scala.Int | scala.Double = null,
    maxFreeSockets: scala.Int | scala.Double = null,
    maxSockets: scala.Int | scala.Double = null,
    passphrase: java.lang.String = null,
    pfx: js.Any = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    secureProtocol: java.lang.String = null
  ): AgentOptions = {
    val __obj = js.Dynamic.literal()
    if (ca != null) __obj.updateDynamic("ca")(ca)
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (keepAliveMsecs != null) __obj.updateDynamic("keepAliveMsecs")(keepAliveMsecs.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxCachedSessions != null) __obj.updateDynamic("maxCachedSessions")(maxCachedSessions.asInstanceOf[js.Any])
    if (maxFreeSockets != null) __obj.updateDynamic("maxFreeSockets")(maxFreeSockets.asInstanceOf[js.Any])
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx)
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol)
    __obj.asInstanceOf[AgentOptions]
  }
}

