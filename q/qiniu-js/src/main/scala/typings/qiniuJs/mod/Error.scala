package typings.qiniuJs.mod

import typings.qiniuJs.qiniuJsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends js.Object {
  
  var code: Double = js.native
  
      // 错误信息，包含错误码，当后端返回提示信息时也会有相应的错误信息。
  var isRequestError: js.UndefOr[`true`] = js.native
  
      // 请求错误状态码，只有在 err.isRequestError 为 true 的时候才有效。可查阅码值对应说明。
  var message: String = js.native
  
      // 用于区分是否 xhr 请求错误；当 xhr 请求出现错误并且后端通过 HTTP 状态码返回了错误信息时，该参数为 true；否则为 undefined 。
  var reqId: String = js.native
}
object Error {
  
  @scala.inline
  def apply(code: Double, message: String, reqId: String): Error = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reqId = reqId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqId(value: String): Self = this.set("reqId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRequestError(value: `true`): Self = this.set("isRequestError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRequestError: Self = this.set("isRequestError", js.undefined)
  }
}
