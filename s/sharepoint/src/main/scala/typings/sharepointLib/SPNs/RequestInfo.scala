package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInfo extends js.Object {
  var binaryStringRequestBody: js.UndefOr[scala.Boolean] = js.undefined
  /** Currently need fix to get ginary response. Details: http:// techmikael.blogspot.ru/2013/07/how-to-copy-files-between-sites-using.html */
  var binaryStringResponseBody: js.UndefOr[scala.Boolean] = js.undefined
  /** Can be string or bytearray depending on binaryStringRequestBody field */
  var body: js.UndefOr[java.lang.String | stdLib.Uint8Array] = js.undefined
  var error: js.UndefOr[
    js.Function3[
      /* response */ ResponseInfo, 
      /* error */ RequestExecutorErrors, 
      /* statusText */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[js.Any] = js.undefined
  var success: js.UndefOr[js.Function1[/* response */ ResponseInfo, scala.Unit]] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var url: java.lang.String
}

object RequestInfo {
  @scala.inline
  def apply(
    url: java.lang.String,
    binaryStringRequestBody: js.UndefOr[scala.Boolean] = js.undefined,
    binaryStringResponseBody: js.UndefOr[scala.Boolean] = js.undefined,
    body: java.lang.String | stdLib.Uint8Array = null,
    error: js.Function3[
      /* response */ ResponseInfo, 
      /* error */ RequestExecutorErrors, 
      /* statusText */ java.lang.String, 
      scala.Unit
    ] = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    method: java.lang.String = null,
    state: js.Any = null,
    success: js.Function1[/* response */ ResponseInfo, scala.Unit] = null,
    timeout: scala.Int | scala.Double = null
  ): RequestInfo = {
    val __obj = js.Dynamic.literal(url = url)
    if (!js.isUndefined(binaryStringRequestBody)) __obj.updateDynamic("binaryStringRequestBody")(binaryStringRequestBody)
    if (!js.isUndefined(binaryStringResponseBody)) __obj.updateDynamic("binaryStringResponseBody")(binaryStringResponseBody)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (state != null) __obj.updateDynamic("state")(state)
    if (success != null) __obj.updateDynamic("success")(success)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInfo]
  }
}

