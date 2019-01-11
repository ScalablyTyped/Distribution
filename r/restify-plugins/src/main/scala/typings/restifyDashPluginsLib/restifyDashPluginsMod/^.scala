package typings
package restifyDashPluginsLib.restifyDashPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify-plugins", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def acceptParser(accepts: js.Array[java.lang.String]): restifyLib.restifyMod.RequestHandler = js.native
  def auditLogger(options: restifyDashPluginsLib.restifyDashPluginsMod.AuditLoggerOptions): js.Function1[/* repeated */ js.Any, scala.Unit] = js.native
  def authorizationParser(): restifyLib.restifyMod.RequestHandler = js.native
  def authorizationParser(options: js.Any): restifyLib.restifyMod.RequestHandler = js.native
  def bodyParser(): js.Array[restifyLib.restifyMod.RequestHandler] = js.native
  def bodyParser(options: restifyDashPluginsLib.restifyDashPluginsMod.BodyParserOptions): js.Array[restifyLib.restifyMod.RequestHandler] = js.native
  def bodyReader(): restifyLib.restifyMod.RequestHandler = js.native
  def bodyReader(options: restifyDashPluginsLib.Anon_MaxBodySize): restifyLib.restifyMod.RequestHandler = js.native
  def conditionalRequest(): js.Array[restifyLib.restifyMod.RequestHandler] = js.native
  def dateParser(): restifyLib.restifyMod.RequestHandler = js.native
  def dateParser(delta: scala.Double): restifyLib.restifyMod.RequestHandler = js.native
  def fullResponse(): restifyLib.restifyMod.RequestHandler = js.native
  def gzipResponse(): restifyLib.restifyMod.RequestHandler = js.native
  def gzipResponse(options: js.Any): restifyLib.restifyMod.RequestHandler = js.native
  def jsonBodyParser(): js.Array[restifyLib.restifyMod.RequestHandler] = js.native
  def jsonBodyParser(options: restifyDashPluginsLib.Anon_MapParams): js.Array[restifyLib.restifyMod.RequestHandler] = js.native
  def jsonp(): restifyLib.restifyMod.RequestHandler = js.native
  def metrics(
    opts: restifyDashPluginsLib.Anon_Server,
    callback: js.Function1[/* options */ restifyDashPluginsLib.restifyDashPluginsMod.MetricsCallback, _]
  ): js.Function1[/* repeated */ js.Any, scala.Unit] = js.native
  def multipartBodyParser(): restifyLib.restifyMod.RequestHandler = js.native
  def multipartBodyParser(options: restifyDashPluginsLib.restifyDashPluginsMod.MultipartBodyParser): restifyLib.restifyMod.RequestHandler = js.native
  def oauth2TokenParser(): restifyLib.restifyMod.RequestHandler = js.native
  def queryParser(): restifyLib.restifyMod.RequestHandler = js.native
  def queryParser(options: restifyDashPluginsLib.restifyDashPluginsMod.QueryParserOptions): restifyLib.restifyMod.RequestHandler = js.native
  def requestExpiry(): restifyLib.restifyMod.RequestHandler = js.native
  def requestExpiry(options: restifyDashPluginsLib.restifyDashPluginsMod.RequestExpiryOptions): restifyLib.restifyMod.RequestHandler = js.native
  def requestLogger(): restifyLib.restifyMod.RequestHandler = js.native
  def requestLogger(options: restifyDashPluginsLib.restifyDashPluginsMod.RequestLogger): restifyLib.restifyMod.RequestHandler = js.native
  def serveStatic(): restifyLib.restifyMod.RequestHandler = js.native
  def serveStatic(options: restifyDashPluginsLib.restifyDashPluginsMod.ServeStatic): restifyLib.restifyMod.RequestHandler = js.native
  def throttle(): restifyLib.restifyMod.RequestHandler = js.native
  def throttle(options: restifyDashPluginsLib.restifyDashPluginsMod.ThrottleOptions): restifyLib.restifyMod.RequestHandler = js.native
  def urlEncodedBodyParser(): js.Array[restifyLib.restifyMod.RequestHandler] = js.native
  def urlEncodedBodyParser(options: restifyDashPluginsLib.restifyDashPluginsMod.UrlEncodedBodyParser): js.Array[restifyLib.restifyMod.RequestHandler] = js.native
}

