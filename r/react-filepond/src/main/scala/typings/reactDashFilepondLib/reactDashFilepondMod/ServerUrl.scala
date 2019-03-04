package typings
package reactDashFilepondLib.reactDashFilepondMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerUrl extends js.Object {
  var headers: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean | scala.Double]
  ] = js.undefined
  var method: js.UndefOr[
    reactDashFilepondLib.reactDashFilepondLibStrings.GET | reactDashFilepondLib.reactDashFilepondLibStrings.POST | reactDashFilepondLib.reactDashFilepondLibStrings.PUT | reactDashFilepondLib.reactDashFilepondLibStrings.DELETE
  ] = js.undefined
  /**
    * Called with the formdata object right before it is sent,
    * return extended formdata object to make changes
    */
  var ondata: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  /**
    * Called when server error is received, receives the response
    * body, useful to select the relevant error data
    */
  var onerror: js.UndefOr[js.Function1[/* responseBody */ js.Any, _]] = js.undefined
  /**
    * Called when server response is received, useful for getting
    * the unique file id from the server response
    */
  var onload: js.UndefOr[js.Function0[_]] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var url: java.lang.String
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object ServerUrl {
  @scala.inline
  def apply(
    url: java.lang.String,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean | scala.Double] = null,
    method: reactDashFilepondLib.reactDashFilepondLibStrings.GET | reactDashFilepondLib.reactDashFilepondLibStrings.POST | reactDashFilepondLib.reactDashFilepondLibStrings.PUT | reactDashFilepondLib.reactDashFilepondLibStrings.DELETE = null,
    ondata: js.Function1[/* data */ js.Any, _] = null,
    onerror: js.Function1[/* responseBody */ js.Any, _] = null,
    onload: js.Function0[_] = null,
    timeout: scala.Int | scala.Double = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): ServerUrl = {
    val __obj = js.Dynamic.literal(url = url)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (ondata != null) __obj.updateDynamic("ondata")(ondata)
    if (onerror != null) __obj.updateDynamic("onerror")(onerror)
    if (onload != null) __obj.updateDynamic("onload")(onload)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[ServerUrl]
  }
}

