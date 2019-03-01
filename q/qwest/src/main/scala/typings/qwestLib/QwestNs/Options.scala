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
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
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

object Options {
  @scala.inline
  def apply(
    async: js.UndefOr[scala.Boolean] = js.undefined,
    attempts: scala.Int | scala.Double = null,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    dataType: java.lang.String = null,
    headers: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    password: java.lang.String = null,
    responseType: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    user: java.lang.String = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (attempts != null) __obj.updateDynamic("attempts")(attempts.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (password != null) __obj.updateDynamic("password")(password)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[Options]
  }
}

