package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginWithRecoveryCodeParams extends StObject {
  
  var mfaToken: String
  
  var recoveryCode: String
}
object LoginWithRecoveryCodeParams {
  
  inline def apply(mfaToken: String, recoveryCode: String): LoginWithRecoveryCodeParams = {
    val __obj = js.Dynamic.literal(mfaToken = mfaToken.asInstanceOf[js.Any], recoveryCode = recoveryCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginWithRecoveryCodeParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoginWithRecoveryCodeParams] (val x: Self) extends AnyVal {
    
    inline def setMfaToken(value: String): Self = StObject.set(x, "mfaToken", value.asInstanceOf[js.Any])
    
    inline def setRecoveryCode(value: String): Self = StObject.set(x, "recoveryCode", value.asInstanceOf[js.Any])
  }
}
