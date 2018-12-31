package typings
package restlingLib.restlingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestlingOptions extends js.Object {
  /**
    * OAuth Bearer Token.
    */
  var accessToken: js.UndefOr[java.lang.String] = js.undefined
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
  var decoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Encoding of the request body.
    */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set will recursively follow redirects.
    */
  var followRedirects: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A hash of HTTP headers to be sent.
    */
  var headers: js.UndefOr[RestlerOptionsHeader] = js.undefined
  /**
    * Request method
    */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set the data passed will be formatted as <code>multipart/form-encoded</code>.
    */
  var multipart: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A function that will be called on the returned data. Use any of predefined <code>restler.parsers</code>.
    */
  var parser: js.UndefOr[js.Any] = js.undefined
  /**
    * Basic auth password.
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Query string variables as a javascript object, will override the querystring in the URL.
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /**
    * If true, the server certificate is verified against the list of supplied CAs.
    * An 'error' event is emitted if verification fails. Verification happens at the connection level, before the HTTP request is sent.
    */
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Emit the timeout event when the response does not return within the said value (in ms).
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Basic auth username.
    */
  var username: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Options for xml2js.
    */
  var xml2js: js.UndefOr[js.Any] = js.undefined
}

