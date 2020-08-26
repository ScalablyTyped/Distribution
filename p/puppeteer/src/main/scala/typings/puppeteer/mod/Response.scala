package typings.puppeteer.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  /** Promise which resolves to a buffer with response body. */
  def buffer(): js.Promise[Buffer] = js.native
  /** A Frame that initiated this response, or null if navigating to error pages. */
  def frame(): Frame | Null = js.native
  /** True if the response was served from either the browser's disk cache or memory cache. */
  def fromCache(): Boolean = js.native
  /** True if the response was served by a service worker. */
  def fromServiceWorker(): Boolean = js.native
  /** An object with HTTP headers associated with the response. All header names are lower-case. */
  def headers(): Headers = js.native
  /**
    * Promise which resolves to a JSON representation of response body.
    * @throws This method will throw if the response body is not parsable via `JSON.parse`.
    */
  def json(): js.Promise[_] = js.native
  /** Contains a boolean stating whether the response was successful (status in the range 200-299) or not. */
  def ok(): Boolean = js.native
  /** Returns remote connection info */
  def remoteAddress(): RemoteInfo = js.native
  /** A matching Request object. */
  def request(): Request = js.native
  /** Returns an object with security details associated with the response. */
  def securityDetails(): SecurityDetails | Null = js.native
  /** Contains the status code of the response (e.g., 200 for a success). */
  def status(): Double = js.native
  /** Contains the status text of the response (e.g. usually an "OK" for a success).  */
  def statusText(): String = js.native
  /** Promise which resolves to a text representation of response body. */
  def text(): js.Promise[String] = js.native
  /** Contains the URL of the response. */
  def url(): String = js.native
}

object Response {
  @scala.inline
  def apply(
    buffer: () => js.Promise[Buffer],
    frame: () => Frame | Null,
    fromCache: () => Boolean,
    fromServiceWorker: () => Boolean,
    headers: () => Headers,
    json: () => js.Promise[_],
    ok: () => Boolean,
    remoteAddress: () => RemoteInfo,
    request: () => Request,
    securityDetails: () => SecurityDetails | Null,
    status: () => Double,
    statusText: () => String,
    text: () => js.Promise[String],
    url: () => String
  ): Response = {
    val __obj = js.Dynamic.literal(buffer = js.Any.fromFunction0(buffer), frame = js.Any.fromFunction0(frame), fromCache = js.Any.fromFunction0(fromCache), fromServiceWorker = js.Any.fromFunction0(fromServiceWorker), headers = js.Any.fromFunction0(headers), json = js.Any.fromFunction0(json), ok = js.Any.fromFunction0(ok), remoteAddress = js.Any.fromFunction0(remoteAddress), request = js.Any.fromFunction0(request), securityDetails = js.Any.fromFunction0(securityDetails), status = js.Any.fromFunction0(status), statusText = js.Any.fromFunction0(statusText), text = js.Any.fromFunction0(text), url = js.Any.fromFunction0(url))
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuffer(value: () => js.Promise[Buffer]): Self = this.set("buffer", js.Any.fromFunction0(value))
    @scala.inline
    def setFrame(value: () => Frame | Null): Self = this.set("frame", js.Any.fromFunction0(value))
    @scala.inline
    def setFromCache(value: () => Boolean): Self = this.set("fromCache", js.Any.fromFunction0(value))
    @scala.inline
    def setFromServiceWorker(value: () => Boolean): Self = this.set("fromServiceWorker", js.Any.fromFunction0(value))
    @scala.inline
    def setHeaders(value: () => Headers): Self = this.set("headers", js.Any.fromFunction0(value))
    @scala.inline
    def setJson(value: () => js.Promise[_]): Self = this.set("json", js.Any.fromFunction0(value))
    @scala.inline
    def setOk(value: () => Boolean): Self = this.set("ok", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoteAddress(value: () => RemoteInfo): Self = this.set("remoteAddress", js.Any.fromFunction0(value))
    @scala.inline
    def setRequest(value: () => Request): Self = this.set("request", js.Any.fromFunction0(value))
    @scala.inline
    def setSecurityDetails(value: () => SecurityDetails | Null): Self = this.set("securityDetails", js.Any.fromFunction0(value))
    @scala.inline
    def setStatus(value: () => Double): Self = this.set("status", js.Any.fromFunction0(value))
    @scala.inline
    def setStatusText(value: () => String): Self = this.set("statusText", js.Any.fromFunction0(value))
    @scala.inline
    def setText(value: () => js.Promise[String]): Self = this.set("text", js.Any.fromFunction0(value))
    @scala.inline
    def setUrl(value: () => String): Self = this.set("url", js.Any.fromFunction0(value))
  }
  
}

