package typings.sharepoint.SP

import org.scalablytyped.runtime.StringDictionary
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInfo extends js.Object {
  var binaryStringRequestBody: js.UndefOr[Boolean] = js.undefined
  /** Currently need fix to get ginary response. Details: http:// techmikael.blogspot.ru/2013/07/how-to-copy-files-between-sites-using.html */
  var binaryStringResponseBody: js.UndefOr[Boolean] = js.undefined
  /** Can be string or bytearray depending on binaryStringRequestBody field */
  var body: js.UndefOr[String | Uint8Array] = js.undefined
  var error: js.UndefOr[
    js.Function3[
      /* response */ ResponseInfo, 
      /* error */ RequestExecutorErrors, 
      /* statusText */ String, 
      Unit
    ]
  ] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[js.Any] = js.undefined
  var success: js.UndefOr[js.Function1[/* response */ ResponseInfo, Unit]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var url: String
}

object RequestInfo {
  @scala.inline
  def apply(
    url: String,
    binaryStringRequestBody: js.UndefOr[Boolean] = js.undefined,
    binaryStringResponseBody: js.UndefOr[Boolean] = js.undefined,
    body: String | Uint8Array = null,
    error: (/* response */ ResponseInfo, /* error */ RequestExecutorErrors, /* statusText */ String) => Unit = null,
    headers: StringDictionary[String] = null,
    method: String = null,
    state: js.Any = null,
    success: /* response */ ResponseInfo => Unit = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): RequestInfo = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(binaryStringRequestBody)) __obj.updateDynamic("binaryStringRequestBody")(binaryStringRequestBody.get.asInstanceOf[js.Any])
    if (!js.isUndefined(binaryStringResponseBody)) __obj.updateDynamic("binaryStringResponseBody")(binaryStringResponseBody.get.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInfo]
  }
}

