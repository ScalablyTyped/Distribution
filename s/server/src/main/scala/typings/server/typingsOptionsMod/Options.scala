package typings.server.typingsOptionsMod

import typings.expressDashSession.expressDashSessionMod.SessionOptions
import typings.helmet.helmetMod.IHelmetConfiguration
import typings.server.Anon_Body
import typings.server.Anon_Content
import typings.server.Anon_Csurf
import typings.server.serverNumbers.`false`
import typings.server.typingsCommonMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var engine: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[String] = js.undefined
  var favicon: js.UndefOr[String] = js.undefined
  var log: js.UndefOr[LogLevel | Anon_Content] = js.undefined
  var parser: js.UndefOr[Anon_Body] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var public: js.UndefOr[String] = js.undefined
  var secret: js.UndefOr[String] = js.undefined
  var security: js.UndefOr[`false` | (IHelmetConfiguration with Anon_Csurf)] = js.undefined
  var session: js.UndefOr[SessionOptions] = js.undefined
  var views: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    engine: String = null,
    env: String = null,
    favicon: String = null,
    log: LogLevel | Anon_Content = null,
    parser: Anon_Body = null,
    port: Int | Double = null,
    public: String = null,
    secret: String = null,
    security: `false` | (IHelmetConfiguration with Anon_Csurf) = null,
    session: SessionOptions = null,
    views: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (favicon != null) __obj.updateDynamic("favicon")(favicon.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (public != null) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

