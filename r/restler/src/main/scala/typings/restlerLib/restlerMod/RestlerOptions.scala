package typings
package restlerLib.restlerMod

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
  var accessToken: js.UndefOr[java.lang.String] = js.undefined
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
  var decoding: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Encoding of the request body.
           * @type {string}
           */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
           * If set will recursively follow redirects.
           * @type {boolean}
           */
  var followRedirects: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * A hash of HTTP headers to be sent.
           * @type {RestlerOptionsHeader}
           */
  var headers: js.UndefOr[RestlerOptionsHeader] = js.undefined
  /**
           * Request method
           * @type {string}
           */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /**
           * If set the data passed will be formatted as <code>multipart/form-encoded</code>.
           * @type {boolean}
           */
  var multipart: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * A function that will be called on the returned data. Use any of predefined <code>restler.parsers</code>.
           * @type {any}
           */
  var parser: js.UndefOr[js.Any] = js.undefined
  /**
           * Basic auth password.
           * @type {string}
           */
  var password: js.UndefOr[java.lang.String] = js.undefined
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
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Emit the timeout event when the response does not return within the said value (in ms).
           * @type {number}
           */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
           * Basic auth username.
           * @type {string}
           */
  var username: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Options for xml2js.
           * @type {any}
           */
  var xml2js: js.UndefOr[js.Any] = js.undefined
}

