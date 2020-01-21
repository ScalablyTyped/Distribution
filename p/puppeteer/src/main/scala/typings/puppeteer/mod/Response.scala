package typings.puppeteer.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  /** Promise which resolves to a buffer with response body. */
  def buffer(): js.Promise[Buffer]
  /** A Frame that initiated this response, or null if navigating to error pages. */
  def frame(): Frame | Null
  /** True if the response was served from either the browser's disk cache or memory cache. */
  def fromCache(): Boolean
  /** True if the response was served by a service worker. */
  def fromServiceWorker(): Boolean
  /** An object with HTTP headers associated with the response. All header names are lower-case. */
  def headers(): Headers
  /**
    * Promise which resolves to a JSON representation of response body.
    * @throws This method will throw if the response body is not parsable via `JSON.parse`.
    */
  def json(): js.Promise[_]
  /** Contains a boolean stating whether the response was successful (status in the range 200-299) or not. */
  def ok(): Boolean
  /** Returns remote connection info */
  def remoteAddress(): RemoteInfo
  /** A matching Request object. */
  def request(): Request
  /** Returns an object with security details associated with the response. */
  def securityDetails(): SecurityDetails | Null
  /** Contains the status code of the response (e.g., 200 for a success). */
  def status(): Double
  /** Contains the status text of the response (e.g. usually an "OK" for a success).  */
  def statusText(): String
  /** Promise which resolves to a text representation of response body. */
  def text(): js.Promise[String]
  /** Contains the URL of the response. */
  def url(): String
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
}

