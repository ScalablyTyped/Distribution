package typings.soap.libHttpMod

import typings.request.requestMod.Response
import typings.soap.libTypesMod.IHeaders
import typings.soap.libTypesMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/http", "HttpClient")
@js.native
class HttpClient () extends js.Object {
  def this(options: IOptions) = this()
  var _request: js.Any = js.native
  /**
    * Build the HTTP request (method, uri, headers, ...)
    * @param {String} rurl The resource url
    * @param {Object|String} data The payload
    * @param {Object} exheaders Extra http headers
    * @param {Object} exoptions Extra options
    * @returns {Object} The http request object for the `request` module
    */
  def buildRequest(rurl: String, data: js.Any): js.Any = js.native
  def buildRequest(rurl: String, data: js.Any, exheaders: IHeaders): js.Any = js.native
  def buildRequest(rurl: String, data: js.Any, exheaders: IHeaders, exoptions: IExOptions): js.Any = js.native
  /**
    * Handle the http response
    * @param {Object} The req object
    * @param {Object} res The res object
    * @param {Object} body The http body
    * @param {Object} The parsed body
    */
  def handleResponse(req: typings.request.requestMod.Request, res: Response, body: js.Any): js.Any = js.native
  def request(
    rurl: String,
    data: js.Any,
    callback: js.Function3[/* error */ js.Any, /* res */ js.UndefOr[js.Any], /* body */ js.UndefOr[js.Any], _]
  ): typings.request.requestMod.Request = js.native
  def request(
    rurl: String,
    data: js.Any,
    callback: js.Function3[/* error */ js.Any, /* res */ js.UndefOr[js.Any], /* body */ js.UndefOr[js.Any], _],
    exheaders: IHeaders
  ): typings.request.requestMod.Request = js.native
  def request(
    rurl: String,
    data: js.Any,
    callback: js.Function3[/* error */ js.Any, /* res */ js.UndefOr[js.Any], /* body */ js.UndefOr[js.Any], _],
    exheaders: IHeaders,
    exoptions: IExOptions
  ): typings.request.requestMod.Request = js.native
  def request(
    rurl: String,
    data: js.Any,
    callback: js.Function3[/* error */ js.Any, /* res */ js.UndefOr[js.Any], /* body */ js.UndefOr[js.Any], _],
    exheaders: IHeaders,
    exoptions: IExOptions,
    caller: js.Any
  ): typings.request.requestMod.Request = js.native
  def requestStream(rurl: String, data: js.Any): typings.request.requestMod.Request = js.native
  def requestStream(rurl: String, data: js.Any, exheaders: IHeaders): typings.request.requestMod.Request = js.native
  def requestStream(rurl: String, data: js.Any, exheaders: IHeaders, exoptions: IExOptions): typings.request.requestMod.Request = js.native
  def requestStream(rurl: String, data: js.Any, exheaders: IHeaders, exoptions: IExOptions, caller: js.Any): typings.request.requestMod.Request = js.native
}

