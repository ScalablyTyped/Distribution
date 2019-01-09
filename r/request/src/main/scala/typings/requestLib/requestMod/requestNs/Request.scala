package typings
package requestLib.requestMod.requestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request
  extends nodeLib.streamMod.Stream
     with caselessLib.caselessMod.Httpified {
  var agent: requestLib.requestLibNumbers.`false` | nodeLib.httpMod.Agent | nodeLib.httpsMod.Agent = js.native
  var body: nodeLib.Buffer | js.Array[nodeLib.Buffer] | java.lang.String | js.Array[java.lang.String] | nodeLib.streamMod.Readable = js.native
  var ca: js.UndefOr[
    java.lang.String | nodeLib.Buffer | js.Array[java.lang.String] | js.Array[nodeLib.Buffer]
  ] = js.native
  var callback: js.UndefOr[RequestCallback] = js.native
  var cert: js.UndefOr[nodeLib.Buffer] = js.native
  var dests: js.Array[nodeLib.streamMod.Readable] = js.native
  // set in `Request.prototype.onRequestResponse`
  var elapsedTime: js.UndefOr[scala.Double] = js.native
  var encoding: js.UndefOr[java.lang.String | scala.Null] = js.native
  var explicitMethod: js.UndefOr[requestLib.requestLibNumbers.`true`] = js.native
  var followAllRedirects: js.UndefOr[scala.Boolean] = js.native
  var followOriginalHttpMethod: js.UndefOr[scala.Boolean] = js.native
  var gzip: js.UndefOr[scala.Boolean] = js.native
  var har: js.UndefOr[HttpArchiveRequest] = js.native
  // set in `Request.prototype.init`
  @JSName("headers")
  var headers_Request: Headers = js.native
  // several of the CoreOptions are copied onto the request instance
  var host: js.UndefOr[java.lang.String] = js.native
  // set in `Request.prototype.start`
  var href: java.lang.String = js.native
  var key: js.UndefOr[nodeLib.Buffer] = js.native
  var localAddress: js.UndefOr[java.lang.String] = js.native
  var maxRedirects: js.UndefOr[scala.Double] = js.native
  var method: java.lang.String = js.native
  var passphrase: js.UndefOr[java.lang.String] = js.native
  var path: java.lang.String = js.native
  var pool: requestLib.requestLibNumbers.`false` | (org.scalablytyped.runtime.StringDictionary[nodeLib.httpMod.Agent | nodeLib.httpsMod.Agent]) = js.native
  var port: js.UndefOr[scala.Double] = js.native
  var postambleCRLF: js.UndefOr[scala.Boolean] = js.native
  var preambleCRLF: js.UndefOr[scala.Boolean] = js.native
  var proxy: scala.Null | java.lang.String | nodeLib.urlMod.Url = js.native
  var readable: scala.Boolean = js.native
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.native
  var removeRefererHeader: js.UndefOr[scala.Boolean] = js.native
  var response: js.UndefOr[Response] = js.native
  var setHost: scala.Boolean = js.native
  var src: js.UndefOr[nodeLib.streamMod.Readable] = js.native
  var startTime: js.UndefOr[scala.Double] = js.native
  var startTimeNow: js.UndefOr[scala.Double] = js.native
  var strictSSL: js.UndefOr[scala.Boolean] = js.native
  var time: js.UndefOr[scala.Boolean] = js.native
  var timeout: js.UndefOr[scala.Double] = js.native
  var timing: js.UndefOr[scala.Boolean] = js.native
  var timings: js.UndefOr[requestLib.Anon_Connect] = js.native
  var tunnel: scala.Boolean = js.native
  var uri: nodeLib.urlMod.Url with requestLib.Anon_Href = js.native
  var withCredentials: js.UndefOr[scala.Boolean] = js.native
  var writable: scala.Boolean = js.native
  def abort(): scala.Unit = js.native
  def auth(username: java.lang.String, password: java.lang.String): Request = js.native
  def auth(username: java.lang.String, password: java.lang.String, sendImmediately: scala.Boolean): Request = js.native
  def auth(
    username: java.lang.String,
    password: java.lang.String,
    sendImmediately: scala.Boolean,
    bearer: java.lang.String
  ): Request = js.native
  def aws(opts: AWSOptions): Request = js.native
  def aws(opts: AWSOptions, now: scala.Boolean): Request = js.native
  def debug(args: js.Any*): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def end(): scala.Unit = js.native
  def end(cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def end(chunk: java.lang.String): scala.Unit = js.native
  def end(chunk: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def end(chunk: nodeLib.Buffer): scala.Unit = js.native
  def end(chunk: nodeLib.Buffer, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def end(str: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  def end(str: java.lang.String, encoding: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def form(): formDashDataLib.formDashDataMod.namespaced = js.native
  def form(form: js.Any): Request = js.native
  def hawk(opts: HawkOptions): scala.Unit = js.native
  def jar(jar: CookieJar): Request = js.native
  def json(`val`: js.Any): Request = js.native
  def multipart(multipart: js.Array[RequestPart]): Request = js.native
  def oauth(oauth: OAuthOptions): Request = js.native
  @JSName("on")
  def on_complete(
    event: requestLib.requestLibStrings.complete,
    listener: js.Function2[
      /* resp */ Response, 
      /* body */ js.UndefOr[java.lang.String | nodeLib.Buffer], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_data(
    event: requestLib.requestLibStrings.data,
    listener: js.Function1[/* data */ nodeLib.Buffer | java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: requestLib.requestLibStrings.error,
    listener: js.Function1[/* e */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pipe(
    event: requestLib.requestLibStrings.pipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_request(
    event: requestLib.requestLibStrings.request,
    listener: js.Function1[/* req */ nodeLib.httpMod.ClientRequest, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_response(
    event: requestLib.requestLibStrings.response,
    listener: js.Function1[/* resp */ Response, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_socket(
    event: requestLib.requestLibStrings.socket,
    listener: js.Function1[/* src */ nodeLib.netMod.Socket, scala.Unit]
  ): this.type = js.native
  def pause(): scala.Unit = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T, options: nodeLib.Anon_End): T = js.native
  def pipeDest(dest: js.Any): scala.Unit = js.native
  def qs(q: js.Object): Request = js.native
  def qs(q: js.Object, clobber: scala.Boolean): Request = js.native
  def resume(): scala.Unit = js.native
  def toJSON(): RequestAsJSON = js.native
  def write(buffer: java.lang.String): scala.Boolean = js.native
  def write(buffer: java.lang.String, cb: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]): scala.Boolean = js.native
  def write(buffer: nodeLib.Buffer): scala.Boolean = js.native
  def write(buffer: nodeLib.Buffer, cb: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]): scala.Boolean = js.native
  def write(str: java.lang.String, encoding: java.lang.String): scala.Boolean = js.native
  def write(
    str: java.lang.String,
    encoding: java.lang.String,
    cb: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): scala.Boolean = js.native
}

