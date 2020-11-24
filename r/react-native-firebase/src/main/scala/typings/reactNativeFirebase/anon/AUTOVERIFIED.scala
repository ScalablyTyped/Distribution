package typings.reactNativeFirebase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AUTOVERIFIED extends js.Object {
  
  var AUTO_VERIFIED: String = js.native
  
  var AUTO_VERIFY_TIMEOUT: String = js.native
  
  var CODE_SENT: String = js.native
  
  var ERROR: String = js.native
}
object AUTOVERIFIED {
  
  @scala.inline
  def apply(AUTO_VERIFIED: String, AUTO_VERIFY_TIMEOUT: String, CODE_SENT: String, ERROR: String): AUTOVERIFIED = {
    val __obj = js.Dynamic.literal(AUTO_VERIFIED = AUTO_VERIFIED.asInstanceOf[js.Any], AUTO_VERIFY_TIMEOUT = AUTO_VERIFY_TIMEOUT.asInstanceOf[js.Any], CODE_SENT = CODE_SENT.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUTOVERIFIED]
  }
  
  @scala.inline
  implicit class AUTOVERIFIEDOps[Self <: AUTOVERIFIED] (val x: Self) extends AnyVal {
    
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
    def setAUTO_VERIFIED(value: String): Self = this.set("AUTO_VERIFIED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAUTO_VERIFY_TIMEOUT(value: String): Self = this.set("AUTO_VERIFY_TIMEOUT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCODE_SENT(value: String): Self = this.set("CODE_SENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR(value: String): Self = this.set("ERROR", value.asInstanceOf[js.Any])
  }
}
