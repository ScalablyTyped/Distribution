package typings
package soapLib.libHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/http", "HttpClient")
@js.native
class HttpClient () extends js.Object {
  def this(options: soapLib.libTypesMod.IOptions) = this()
  var _request: js.Any = js.native
  /**
    * Build the HTTP request (method, uri, headers, ...)
    * @param {String} rurl The resource url
    * @param {Object|String} data The payload
    * @param {Object} exheaders Extra http headers
    * @param {Object} exoptions Extra options
    * @returns {Object} The http request object for the `request` module
    */
  def buildRequest(rurl: java.lang.String, data: js.Any): js.Any = js.native
  def buildRequest(rurl: java.lang.String, data: js.Any, exheaders: soapLib.libTypesMod.IHeaders): js.Any = js.native
  def buildRequest(
    rurl: java.lang.String,
    data: js.Any,
    exheaders: soapLib.libTypesMod.IHeaders,
    exoptions: IExOptions
  ): js.Any = js.native
  /**
    * Handle the http response
    * @param {Object} The req object
    * @param {Object} res The res object
    * @param {Object} body The http body
    * @param {Object} The parsed body
    */
  def handleResponse(req: requestLib.requestMod.Request, res: requestLib.requestMod.Response, body: js.Any): js.Any = js.native
  def request(
    rurl: java.lang.String,
    data: js.Any,
    callback: js.Function3[/* error */ js.Any, /* res */ js.UndefOr[js.Any], /* body */ js.UndefOr[js.Any], _]
  ): requestLib.requestMod.Request = js.native
  def request(
    rurl: java.lang.String,
    data: js.Any,
    callback: js.Function3[/* error */ js.Any, /* res */ js.UndefOr[js.Any], /* body */ js.UndefOr[js.Any], _],
    exheaders: soapLib.libTypesMod.IHeaders
  ): requestLib.requestMod.Request = js.native
  def request(
    rurl: java.lang.String,
    data: js.Any,
    callback: js.Function3[/* error */ js.Any, /* res */ js.UndefOr[js.Any], /* body */ js.UndefOr[js.Any], _],
    exheaders: soapLib.libTypesMod.IHeaders,
    exoptions: IExOptions
  ): requestLib.requestMod.Request = js.native
  def request(
    rurl: java.lang.String,
    data: js.Any,
    callback: js.Function3[/* error */ js.Any, /* res */ js.UndefOr[js.Any], /* body */ js.UndefOr[js.Any], _],
    exheaders: soapLib.libTypesMod.IHeaders,
    exoptions: IExOptions,
    caller: js.Any
  ): requestLib.requestMod.Request = js.native
  def requestStream(rurl: java.lang.String, data: js.Any): requestLib.requestMod.Request = js.native
  def requestStream(rurl: java.lang.String, data: js.Any, exheaders: soapLib.libTypesMod.IHeaders): requestLib.requestMod.Request = js.native
  def requestStream(
    rurl: java.lang.String,
    data: js.Any,
    exheaders: soapLib.libTypesMod.IHeaders,
    exoptions: IExOptions
  ): requestLib.requestMod.Request = js.native
  def requestStream(
    rurl: java.lang.String,
    data: js.Any,
    exheaders: soapLib.libTypesMod.IHeaders,
    exoptions: IExOptions,
    caller: js.Any
  ): requestLib.requestMod.Request = js.native
}

