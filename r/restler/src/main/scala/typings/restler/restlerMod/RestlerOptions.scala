package typings.restler.restlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for restler options.
  * @interface
  */
trait RestlerOptions extends js.Object {
  /**
    * OAuth Bearer Token.
    * @type {string}
    */
  var accessToken: js.UndefOr[String] = js.undefined
  /**
    *  HTTP Agent instance to use. If not defined globalAgent will be used. If false opts out of connection pooling with an Agent, defaults request to Connection: close.
    * @type {any}
    */
  var agent: js.UndefOr[js.Any] = js.undefined
  /**
    * A http.Client instance if you want to reuse or implement some kind of connection pooling.
    * @type {any}
    */
  var client: js.UndefOr[js.Any] = js.undefined
  /**
    * Data to be added to the body of the request.
    * @type {any}
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * Encoding of the response body
    * @type {string}
    */
  var decoding: js.UndefOr[String] = js.undefined
  /**
    * Encoding of the request body.
    * @type {string}
    */
  var encoding: js.UndefOr[String] = js.undefined
  /**
    * If set will recursively follow redirects.
    * @type {boolean}
    */
  var followRedirects: js.UndefOr[Boolean] = js.undefined
  /**
    * A hash of HTTP headers to be sent.
    * @type {RestlerOptionsHeader}
    */
  var headers: js.UndefOr[RestlerOptionsHeader] = js.undefined
  /**
    * Request method
    * @type {string}
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * If set the data passed will be formatted as <code>multipart/form-encoded</code>.
    * @type {boolean}
    */
  var multipart: js.UndefOr[Boolean] = js.undefined
  /**
    * A function that will be called on the returned data. Use any of predefined <code>restler.parsers</code>.
    * @type {any}
    */
  var parser: js.UndefOr[js.Any] = js.undefined
  /**
    * Basic auth password.
    * @type {string}
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * Query string variables as a javascript object, will override the querystring in the URL.
    * @type {any}
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /**
    * If true, the server certificate is verified against the list of supplied CAs.
    * An 'error' event is emitted if verification fails. Verification happens at the connection level, before the HTTP request is sent.
    * @type {boolean}
    */
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  /**
    * Emit the timeout event when the response does not return within the said value (in ms).
    * @type {number}
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * Basic auth username.
    * @type {string}
    */
  var username: js.UndefOr[String] = js.undefined
  /**
    * Options for xml2js.
    * @type {any}
    */
  var xml2js: js.UndefOr[js.Any] = js.undefined
}

object RestlerOptions {
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
  ): RestlerOptions = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (decoding != null) __obj.updateDynamic("decoding")(decoding.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(multipart)) __obj.updateDynamic("multipart")(multipart.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (xml2js != null) __obj.updateDynamic("xml2js")(xml2js.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestlerOptions]
  }
}

