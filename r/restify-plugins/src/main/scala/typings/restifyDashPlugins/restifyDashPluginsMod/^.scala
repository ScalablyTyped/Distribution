package typings.restifyDashPlugins.restifyDashPluginsMod

import typings.restify.restifyMod.RequestHandler
import typings.restifyDashPlugins.Anon_MapParams
import typings.restifyDashPlugins.Anon_MaxBodySize
import typings.restifyDashPlugins.Anon_Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify-plugins", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def acceptParser(accepts: js.Array[String]): RequestHandler = js.native
  def auditLogger(options: AuditLoggerOptions): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def authorizationParser(): RequestHandler = js.native
  def authorizationParser(options: js.Any): RequestHandler = js.native
  def bodyParser(): js.Array[RequestHandler] = js.native
  def bodyParser(options: BodyParserOptions): js.Array[RequestHandler] = js.native
  def bodyReader(): RequestHandler = js.native
  def bodyReader(options: Anon_MaxBodySize): RequestHandler = js.native
  def conditionalRequest(): js.Array[RequestHandler] = js.native
  def dateParser(): RequestHandler = js.native
  def dateParser(delta: Double): RequestHandler = js.native
  def fullResponse(): RequestHandler = js.native
  def gzipResponse(): RequestHandler = js.native
  def gzipResponse(options: js.Any): RequestHandler = js.native
  def jsonBodyParser(): js.Array[RequestHandler] = js.native
  def jsonBodyParser(options: Anon_MapParams): js.Array[RequestHandler] = js.native
  def jsonp(): RequestHandler = js.native
  def metrics(opts: Anon_Server, callback: js.Function1[/* options */ MetricsCallback, _]): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def multipartBodyParser(): RequestHandler = js.native
  def multipartBodyParser(options: MultipartBodyParser): RequestHandler = js.native
  def oauth2TokenParser(): RequestHandler = js.native
  def queryParser(): RequestHandler = js.native
  def queryParser(options: QueryParserOptions): RequestHandler = js.native
  def requestExpiry(): RequestHandler = js.native
  def requestExpiry(options: RequestExpiryOptions): RequestHandler = js.native
  def requestLogger(): RequestHandler = js.native
  def requestLogger(options: RequestLogger): RequestHandler = js.native
  def serveStatic(): RequestHandler = js.native
  def serveStatic(options: ServeStatic): RequestHandler = js.native
  def throttle(): RequestHandler = js.native
  def throttle(options: ThrottleOptions): RequestHandler = js.native
  def urlEncodedBodyParser(): js.Array[RequestHandler] = js.native
  def urlEncodedBodyParser(options: UrlEncodedBodyParser): js.Array[RequestHandler] = js.native
}

