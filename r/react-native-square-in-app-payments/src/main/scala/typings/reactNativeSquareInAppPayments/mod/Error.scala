package typings.reactNativeSquareInAppPayments.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends js.Object {
  
  /** The enumerated error types */
  var code: SQIPErrorCodes = js.native
  
  /** Information about error state */
  var debugCode: String = js.native
  
  /** A description of the error state */
  var debugMessage: String = js.native
  
  /** A description of the usage error */
  var message: String = js.native
}
object Error {
  
  @scala.inline
  def apply(code: SQIPErrorCodes, debugCode: String, debugMessage: String, message: String): Error = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], debugCode = debugCode.asInstanceOf[js.Any], debugMessage = debugMessage.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
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
    def setCode(value: SQIPErrorCodes): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugCode(value: String): Self = this.set("debugCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugMessage(value: String): Self = this.set("debugMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
