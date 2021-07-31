package typings.reactNativeFirebase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AUTOVERIFIED extends StObject {
  
  var AUTO_VERIFIED: String
  
  var AUTO_VERIFY_TIMEOUT: String
  
  var CODE_SENT: String
  
  var ERROR: String
}
object AUTOVERIFIED {
  
  @scala.inline
  def apply(AUTO_VERIFIED: String, AUTO_VERIFY_TIMEOUT: String, CODE_SENT: String, ERROR: String): AUTOVERIFIED = {
    val __obj = js.Dynamic.literal(AUTO_VERIFIED = AUTO_VERIFIED.asInstanceOf[js.Any], AUTO_VERIFY_TIMEOUT = AUTO_VERIFY_TIMEOUT.asInstanceOf[js.Any], CODE_SENT = CODE_SENT.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUTOVERIFIED]
  }
  
  @scala.inline
  implicit class AUTOVERIFIEDMutableBuilder[Self <: AUTOVERIFIED] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAUTO_VERIFIED(value: String): Self = StObject.set(x, "AUTO_VERIFIED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAUTO_VERIFY_TIMEOUT(value: String): Self = StObject.set(x, "AUTO_VERIFY_TIMEOUT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCODE_SENT(value: String): Self = StObject.set(x, "CODE_SENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR(value: String): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
  }
}
