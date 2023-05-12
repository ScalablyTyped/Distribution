package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginWithOOBParams extends StObject {
  
  var bindingCode: js.UndefOr[String] = js.undefined
  
  var mfaToken: String
  
  var oobCode: String
}
object LoginWithOOBParams {
  
  inline def apply(mfaToken: String, oobCode: String): LoginWithOOBParams = {
    val __obj = js.Dynamic.literal(mfaToken = mfaToken.asInstanceOf[js.Any], oobCode = oobCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginWithOOBParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoginWithOOBParams] (val x: Self) extends AnyVal {
    
    inline def setBindingCode(value: String): Self = StObject.set(x, "bindingCode", value.asInstanceOf[js.Any])
    
    inline def setBindingCodeUndefined: Self = StObject.set(x, "bindingCode", js.undefined)
    
    inline def setMfaToken(value: String): Self = StObject.set(x, "mfaToken", value.asInstanceOf[js.Any])
    
    inline def setOobCode(value: String): Self = StObject.set(x, "oobCode", value.asInstanceOf[js.Any])
  }
}
