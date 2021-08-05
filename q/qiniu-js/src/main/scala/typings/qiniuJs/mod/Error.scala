package typings.qiniuJs.mod

import typings.qiniuJs.qiniuJsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var code: Double
  
  // 错误信息，包含错误码，当后端返回提示信息时也会有相应的错误信息。
  var isRequestError: js.UndefOr[`true`] = js.undefined
  
  // 请求错误状态码，只有在 err.isRequestError 为 true 的时候才有效。可查阅码值对应说明。
  var message: String
  
  // 用于区分是否 xhr 请求错误；当 xhr 请求出现错误并且后端通过 HTTP 状态码返回了错误信息时，该参数为 true；否则为 undefined 。
  var reqId: String
}
object Error {
  
  inline def apply(code: Double, message: String, reqId: String): Error = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reqId = reqId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setIsRequestError(value: `true`): Self = StObject.set(x, "isRequestError", value.asInstanceOf[js.Any])
    
    inline def setIsRequestErrorUndefined: Self = StObject.set(x, "isRequestError", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setReqId(value: String): Self = StObject.set(x, "reqId", value.asInstanceOf[js.Any])
  }
}
