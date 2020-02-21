package typings.request.mod

import typings.caseless.mod.Httpified
import typings.node.Buffer
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequest
import typings.node.netMod.Socket
import typings.node.streamMod.Readable
import typings.node.streamMod.Stream
import typings.node.urlMod.Url
import typings.request.AnonConnect
import typings.request.AnonHref
import typings.request.requestBooleans.`false`
import typings.request.requestBooleans.`true`
import typings.request.requestStrings.complete
import typings.request.requestStrings.data
import typings.request.requestStrings.error
import typings.request.requestStrings.pipe
import typings.request.requestStrings.request
import typings.request.requestStrings.response
import typings.request.requestStrings.socket
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request
  extends Stream
     with Httpified {
  var agent: `false` | Agent | typings.node.httpsMod.Agent = js.native
  var body: Buffer | (js.Array[Buffer | String]) | String | Readable = js.native
  var ca: js.UndefOr[String | Buffer | (js.Array[Buffer | String])] = js.native
  var callback: js.UndefOr[RequestCallback] = js.native
  var cert: js.UndefOr[Buffer] = js.native
  var dests: js.Array[Readable] = js.native
  // set in `Request.prototype.onRequestResponse`
  var elapsedTime: js.UndefOr[Double] = js.native
  var encoding: js.UndefOr[String | Null] = js.native
  var explicitMethod: js.UndefOr[`true`] = js.native
  var followAllRedirects: js.UndefOr[Boolean] = js.native
  var followOriginalHttpMethod: js.UndefOr[Boolean] = js.native
  var gzip: js.UndefOr[Boolean] = js.native
  var har: js.UndefOr[HttpArchiveRequest] = js.native
  // set in `Request.prototype.init`
  @JSName("headers")
  var headers_Request: Headers = js.native
  // several of the CoreOptions are copied onto the request instance
  var host: js.UndefOr[String] = js.native
  // set in `Request.prototype.start`
  var href: String = js.native
  var key: js.UndefOr[Buffer] = js.native
  var localAddress: js.UndefOr[String] = js.native
  var maxRedirects: js.UndefOr[Double] = js.native
  var method: String = js.native
  var passphrase: js.UndefOr[String] = js.native
  var path: String = js.native
  var pool: PoolOptions = js.native
  var port: js.UndefOr[Double] = js.native
  var postambleCRLF: js.UndefOr[Boolean] = js.native
  var preambleCRLF: js.UndefOr[Boolean] = js.native
  var proxy: Null | String | Url = js.native
  var readable: Boolean = js.native
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  var removeRefererHeader: js.UndefOr[Boolean] = js.native
  var response: js.UndefOr[Response] = js.native
  var setHost: Boolean = js.native
  var src: js.UndefOr[Readable] = js.native
  var startTime: js.UndefOr[Double] = js.native
  var startTimeNow: js.UndefOr[Double] = js.native
  var strictSSL: js.UndefOr[Boolean] = js.native
  var time: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var timing: js.UndefOr[Boolean] = js.native
  var timings: js.UndefOr[AnonConnect] = js.native
  var tunnel: Boolean = js.native
  var uri: Url with AnonHref = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
  var writable: Boolean = js.native
  def abort(): Unit = js.native
  def auth(username: String, password: String): Request = js.native
  def auth(username: String, password: String, sendImmediately: Boolean): Request = js.native
  def auth(username: String, password: String, sendImmediately: Boolean, bearer: String): Request = js.native
  def aws(opts: AWSOptions): Request = js.native
  def aws(opts: AWSOptions, now: Boolean): Request = js.native
  def debug(args: js.Any*): Unit = js.native
  def destroy(): Unit = js.native
  def end(): Unit = js.native
  def end(cb: js.Function0[Unit]): Unit = js.native
  def end(chunk: String): Unit = js.native
  def end(chunk: String, cb: js.Function0[Unit]): Unit = js.native
  def end(chunk: Buffer): Unit = js.native
  def end(chunk: Buffer, cb: js.Function0[Unit]): Unit = js.native
  def end(str: String, encoding: String): Unit = js.native
  def end(str: String, encoding: String, cb: js.Function0[Unit]): Unit = js.native
  def form(): typings.formData.mod.^ = js.native
  def form(form: js.Any): Request = js.native
  def hawk(opts: HawkOptions): Unit = js.native
  def jar(jar: CookieJar): Request = js.native
  def json(`val`: js.Any): Request = js.native
  def multipart(multipart: js.Array[RequestPart]): Request = js.native
  def oauth(oauth: OAuthOptions): Request = js.native
  @JSName("on")
  def on_complete(
    event: complete,
    listener: js.Function2[/* resp */ Response, /* body */ js.UndefOr[String | Buffer], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* data */ Buffer | String, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* e */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("on")
  def on_request(event: request, listener: js.Function1[/* req */ ClientRequest, Unit]): this.type = js.native
  @JSName("on")
  def on_response(event: response, listener: js.Function1[/* resp */ Response, Unit]): this.type = js.native
  @JSName("on")
  def on_socket(event: socket, listener: js.Function1[/* src */ Socket, Unit]): this.type = js.native
  def pause(): Unit = js.native
  def pipeDest(dest: js.Any): Unit = js.native
  def qs(q: js.Object): Request = js.native
  def qs(q: js.Object, clobber: Boolean): Request = js.native
  def resume(): Unit = js.native
  def toJSON(): RequestAsJSON = js.native
  def write(buffer: String): Boolean = js.native
  def write(buffer: String, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Boolean = js.native
  def write(buffer: Buffer): Boolean = js.native
  def write(buffer: Buffer, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Boolean = js.native
  def write(str: String, encoding: String): Boolean = js.native
  def write(str: String, encoding: String, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Boolean = js.native
}

