package typings
package qwestLib.QwestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /** true (default) or false; used to make asynchronous or synchronous requests */
  var async: js.UndefOr[scala.Boolean] = js.undefined
  /** the total number of times to attempt the request through timeouts; 1 by default; if you want to remove the limit set it to null */
  var attempts: js.UndefOr[scala.Double] = js.undefined
  /** browser caching; default is false for GET requests and true for POST requests */
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  /** post (by default), json, text, arraybuffer, blob, document or formdata */
  var dataType: js.UndefOr[java.lang.String] = js.undefined
  /** javascript object containing headers to be sent */
  var headers: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
  /** the password to access to the URL, if needed */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /** the response type; either auto (default), json, xml, text, arraybuffer, blob or document */
  var responseType: js.UndefOr[java.lang.String] = js.undefined
  /** the timeout for the request in ms; 30000 by default */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** the user to access to the URL, if needed */
  var user: js.UndefOr[java.lang.String] = js.undefined
  /** false by default; sends credentials with your XHR2 request */
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

