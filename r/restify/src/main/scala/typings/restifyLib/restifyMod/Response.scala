package typings
package restifyLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response
  extends nodeLib.httpMod.ServerResponse {
  /** HTTP status code. */
  var code: scala.Double = js.native
  /** short hand for the header content-length. */
  var contentLength: scala.Double = js.native
  /** short hand for the header content-type. */
  var contentType: java.lang.String = js.native
  /** A unique request id (x-request-id). */
  var id: java.lang.String = js.native
  /**
    * sets the cache-control header. `type` defaults to _public_,
    * and options currently only takes maxAge.
    * @param    [options] an options object
    * @returns          the value set to the header
    */
  def cache(): java.lang.String = js.native
  def cache(options: CacheOptions): java.lang.String = js.native
  /**
    * sets the cache-control header. `type` defaults to _public_,
    * and options currently only takes maxAge.
    * @param    type    value of the header
    * @param    [options] an options object
    * @returns          the value set to the header
    */
  def cache(`type`: java.lang.String): java.lang.String = js.native
  def cache(`type`: java.lang.String, options: CacheOptions): java.lang.String = js.native
  /**
    * Appends the provided character set to the response's Content-Type.
    * e.g., res.charSet('utf-8');
    * @param    type char-set value
    * @returns  self, the response object
    */
  def charSet(`type`: java.lang.String): Response = js.native
  /**
    * retrieves a header off the response.
    * @param    name the header name
    */
  def get(name: java.lang.String): java.lang.String = js.native
  /**
    * sets headers on the response.
    * @param    key  the name of the header
    * @param    value the value of the header
    */
  def header(key: java.lang.String): js.Any = js.native
  def header(key: java.lang.String, value: js.Any): js.Any = js.native
  /**
    * pass through to getHeaders.
    */
  def headers(): js.Any = js.native
  /**
    * short hand method for:
    *     res.contentType = 'json';
    *     res.send({hello: 'world'});
    * @param    body    value to json.stringify
    * @param    [headers] headers to set on the response
    */
  def json(body: js.Any): js.Any = js.native
  def json(body: js.Any, headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]): js.Any = js.native
  /**
    * short hand method for:
    *     res.contentType = 'json';
    *     res.send({hello: 'world'});
    * @param    code    http status code
    * @param    body    value to json.stringify
    * @param    [headers] headers to set on the response
    */
  def json(code: scala.Double, body: js.Any): js.Any = js.native
  def json(
    code: scala.Double,
    body: js.Any,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): js.Any = js.native
  /**
    * sets the link heaader.
    * @param    key   the link key
    * @param    value the link value
    * @returns      the header value set to res
    */
  def link(key: java.lang.String, value: java.lang.String): java.lang.String = js.native
  /**
    * turns off all cache related headers.
    * @returns  self, the response object
    */
  def noCache(): Response = js.native
  /**
    * redirect is sugar method for redirecting.
    * res.redirect(301, 'www.foo.com', next);
    * `next` is mandatory, to complete the response and trigger audit logger.
    * @param    code the status code
    * @param    url to redirect to
    * @param    next - mandatory, to complete the response and trigger audit logger
    * @emits    redirect
    */
  def redirect(code: scala.Double, url: java.lang.String, next: Next): scala.Unit = js.native
  /**
    * redirect is sugar method for redirecting.
    * res.redirect({...}, next);
    * `next` is mandatory, to complete the response and trigger audit logger.
    * @param    url to redirect to or options object to configure a redirect or
    * @param    next - mandatory, to complete the response and trigger audit logger
    * @emits    redirect
    */
  def redirect(opts: java.lang.String, next: Next): scala.Unit = js.native
  def redirect(opts: RedirectOptions, next: Next): scala.Unit = js.native
  /**
    * sends the response object. pass through to internal __send that uses a
    * formatter based on the content-type header.
    * @param    [code] http status code
    * @param    [body] the content to send
    * @param    [headers]  any add'l headers to set
    * @returns  the response object
    */
  def send(): js.Any = js.native
  def send(body: js.Any): js.Any = js.native
  def send(body: js.Any, headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]): js.Any = js.native
  def send(code: scala.Double): js.Any = js.native
  def send(code: scala.Double, body: js.Any): js.Any = js.native
  def send(
    code: scala.Double,
    body: js.Any,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): js.Any = js.native
  /**
    * sends the response object. pass through to internal __send that skips
    * formatters entirely and sends the content as is.
    * @param    [code] http status code
    * @param    [body] the content to send
    * @param    [headers]  any add'l headers to set
    * @returns  the response object
    */
  def sendRaw(): js.Any = js.native
  def sendRaw(body: js.Any): js.Any = js.native
  def sendRaw(body: js.Any, headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]): js.Any = js.native
  def sendRaw(code: scala.Double): js.Any = js.native
  def sendRaw(code: scala.Double, body: js.Any): js.Any = js.native
  def sendRaw(
    code: scala.Double,
    body: js.Any,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): js.Any = js.native
  /**
    * sets a header on the response.
    * @param    val  object of headers
    * @returns       self, the response object
    */
  def set(): Response = js.native
  def set(headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]): Response = js.native
  /**
    * sets a header on the response.
    * @param    name name of the header
    * @param    val  value of the header
    * @returns       self, the response object
    */
  def set(name: java.lang.String, `val`: java.lang.String): Response = js.native
  /**
    * sets the http status code on the response.
    * @param    code http status code
    * @returns      the status code passed in
    */
  def status(code: scala.Double): scala.Double = js.native
}

