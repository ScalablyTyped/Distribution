package typings.reactFilepond.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactFilepond.reactFilepondStrings.DELETE
import typings.reactFilepond.reactFilepondStrings.GET
import typings.reactFilepond.reactFilepondStrings.POST
import typings.reactFilepond.reactFilepondStrings.PUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerUrl extends js.Object {
  var headers: js.UndefOr[StringDictionary[String | Boolean | Double]] = js.undefined
  var method: js.UndefOr[GET | POST | PUT | DELETE] = js.undefined
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
  var timeout: js.UndefOr[Double] = js.undefined
  var url: String
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object ServerUrl {
  @scala.inline
  def apply(
    url: String,
    headers: StringDictionary[String | Boolean | Double] = null,
    method: GET | POST | PUT | DELETE = null,
    ondata: /* data */ js.Any => _ = null,
    onerror: /* responseBody */ js.Any => _ = null,
    onload: () => _ = null,
    timeout: js.UndefOr[Double] = js.undefined,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): ServerUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (ondata != null) __obj.updateDynamic("ondata")(js.Any.fromFunction1(ondata))
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction1(onerror))
    if (onload != null) __obj.updateDynamic("onload")(js.Any.fromFunction0(onload))
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerUrl]
  }
}

