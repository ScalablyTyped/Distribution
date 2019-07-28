package typings.restling.restlingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestlingOptions extends js.Object {
  /**
    * OAuth Bearer Token.
    */
  var accessToken: js.UndefOr[String] = js.undefined
  /**
    *  HTTP Agent instance to use. If not defined globalAgent will be used. If false opts out of connection pooling with an Agent, defaults request to Connection: close.
    */
  var agent: js.UndefOr[js.Any] = js.undefined
  /**
    * A http.Client instance if you want to reuse or implement some kind of connection pooling.
    */
  var client: js.UndefOr[js.Any] = js.undefined
  /**
    * Data to be added to the body of the request.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * Encoding of the response body
    */
  var decoding: js.UndefOr[String] = js.undefined
  /**
    * Encoding of the request body.
    */
  var encoding: js.UndefOr[String] = js.undefined
  /**
    * If set will recursively follow redirects.
    */
  var followRedirects: js.UndefOr[Boolean] = js.undefined
  /**
    * A hash of HTTP headers to be sent.
    */
  var headers: js.UndefOr[RestlerOptionsHeader] = js.undefined
  /**
    * Request method
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * If set the data passed will be formatted as <code>multipart/form-encoded</code>.
    */
  var multipart: js.UndefOr[Boolean] = js.undefined
  /**
    * A function that will be called on the returned data. Use any of predefined <code>restler.parsers</code>.
    */
  var parser: js.UndefOr[js.Any] = js.undefined
  /**
    * Basic auth password.
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * Query string variables as a javascript object, will override the querystring in the URL.
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /**
    * If true, the server certificate is verified against the list of supplied CAs.
    * An 'error' event is emitted if verification fails. Verification happens at the connection level, before the HTTP request is sent.
    */
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  /**
    * Emit the timeout event when the response does not return within the said value (in ms).
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * Basic auth username.
    */
  var username: js.UndefOr[String] = js.undefined
  /**
    * Options for xml2js.
    */
  var xml2js: js.UndefOr[js.Any] = js.undefined
}

object RestlingOptions {
  @scala.inline
  def apply(
    accessToken: String = null,
    agent: js.Any = null,
    client: js.Any = null,
    data: js.Any = null,
    decoding: String = null,
    encoding: String = null,
    followRedirects: js.UndefOr[Boolean] = js.undefined,
    headers: RestlerOptionsHeader = null,
    method: String = null,
    multipart: js.UndefOr[Boolean] = js.undefined,
    parser: js.Any = null,
    password: String = null,
    query: js.Any = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    username: String = null,
    xml2js: js.Any = null
  ): RestlingOptions = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (client != null) __obj.updateDynamic("client")(client)
    if (data != null) __obj.updateDynamic("data")(data)
    if (decoding != null) __obj.updateDynamic("decoding")(decoding)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(multipart)) __obj.updateDynamic("multipart")(multipart)
    if (parser != null) __obj.updateDynamic("parser")(parser)
    if (password != null) __obj.updateDynamic("password")(password)
    if (query != null) __obj.updateDynamic("query")(query)
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username)
    if (xml2js != null) __obj.updateDynamic("xml2js")(xml2js)
    __obj.asInstanceOf[RestlingOptions]
  }
}

