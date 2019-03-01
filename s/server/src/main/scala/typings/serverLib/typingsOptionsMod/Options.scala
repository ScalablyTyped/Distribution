package typings
package serverLib.typingsOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var engine: js.UndefOr[java.lang.String] = js.undefined
  var env: js.UndefOr[java.lang.String] = js.undefined
  var favicon: js.UndefOr[java.lang.String] = js.undefined
  var log: js.UndefOr[serverLib.typingsCommonMod.LogLevel | serverLib.Anon_Content] = js.undefined
  var parser: js.UndefOr[serverLib.Anon_Body] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var public: js.UndefOr[java.lang.String] = js.undefined
  var secret: js.UndefOr[java.lang.String] = js.undefined
  var security: js.UndefOr[
    (serverLib.serverLibNumbers.`false` | helmetLib.helmetMod.helmetNs.IHelmetConfiguration) with serverLib.Anon_Csurf
  ] = js.undefined
  var session: js.UndefOr[expressDashSessionLib.expressDashSessionMod.sessionNs.SessionOptions] = js.undefined
  var views: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    engine: java.lang.String = null,
    env: java.lang.String = null,
    favicon: java.lang.String = null,
    log: serverLib.typingsCommonMod.LogLevel | serverLib.Anon_Content = null,
    parser: serverLib.Anon_Body = null,
    port: scala.Int | scala.Double = null,
    public: java.lang.String = null,
    secret: java.lang.String = null,
    security: (serverLib.serverLibNumbers.`false` | helmetLib.helmetMod.helmetNs.IHelmetConfiguration) with serverLib.Anon_Csurf = null,
    session: expressDashSessionLib.expressDashSessionMod.sessionNs.SessionOptions = null,
    views: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (engine != null) __obj.updateDynamic("engine")(engine)
    if (env != null) __obj.updateDynamic("env")(env)
    if (favicon != null) __obj.updateDynamic("favicon")(favicon)
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (public != null) __obj.updateDynamic("public")(public)
    if (secret != null) __obj.updateDynamic("secret")(secret)
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session)
    if (views != null) __obj.updateDynamic("views")(views)
    __obj.asInstanceOf[Options]
  }
}

