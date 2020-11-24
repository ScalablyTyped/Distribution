package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxValidationError extends js.Object {
  
  var qContext: String = js.native
  
  var qErrorCode: Double = js.native
  
  var qExtendedMessage: String = js.native
}
object NxValidationError {
  
  @scala.inline
  def apply(qContext: String, qErrorCode: Double, qExtendedMessage: String): NxValidationError = {
    val __obj = js.Dynamic.literal(qContext = qContext.asInstanceOf[js.Any], qErrorCode = qErrorCode.asInstanceOf[js.Any], qExtendedMessage = qExtendedMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxValidationError]
  }
  
  @scala.inline
  implicit class NxValidationErrorOps[Self <: NxValidationError] (val x: Self) extends AnyVal {
    
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
    def setQContext(value: String): Self = this.set("qContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQErrorCode(value: Double): Self = this.set("qErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQExtendedMessage(value: String): Self = this.set("qExtendedMessage", value.asInstanceOf[js.Any])
  }
}
