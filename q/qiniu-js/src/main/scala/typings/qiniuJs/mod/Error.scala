package typings.qiniuJs.mod

import typings.qiniuJs.qiniuJsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var code: Double
      // 错误信息，包含错误码，当后端返回提示信息时也会有相应的错误信息。
  var isRequestError: js.UndefOr[`true`] = js.undefined
      // 请求错误状态码，只有在 err.isRequestError 为 true 的时候才有效。可查阅码值对应说明。
  var message: String
      // 用于区分是否 xhr 请求错误；当 xhr 请求出现错误并且后端通过 HTTP 状态码返回了错误信息时，该参数为 true；否则为 undefined 。
  var reqId: String
}

object Error {
  @scala.inline
  def apply(code: Double, message: String, reqId: String, isRequestError: `true` = null): Error = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reqId = reqId.asInstanceOf[js.Any])
    if (isRequestError != null) __obj.updateDynamic("isRequestError")(isRequestError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

