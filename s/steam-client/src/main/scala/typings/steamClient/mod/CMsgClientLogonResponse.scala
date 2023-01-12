package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CMsgClientLogonResponse extends StObject {
  
  /**
    * The logon was successful if equal to EResult.OK
    */
  var eresult: EResult
  
  /**
    * "loginkey" to be used with WebAPI's AuthenticateUser."
    */
  var webapi_authenticate_user_nonce: String
}
object CMsgClientLogonResponse {
  
  inline def apply(eresult: EResult, webapi_authenticate_user_nonce: String): CMsgClientLogonResponse = {
    val __obj = js.Dynamic.literal(eresult = eresult.asInstanceOf[js.Any], webapi_authenticate_user_nonce = webapi_authenticate_user_nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMsgClientLogonResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CMsgClientLogonResponse] (val x: Self) extends AnyVal {
    
    inline def setEresult(value: EResult): Self = StObject.set(x, "eresult", value.asInstanceOf[js.Any])
    
    inline def setWebapi_authenticate_user_nonce(value: String): Self = StObject.set(x, "webapi_authenticate_user_nonce", value.asInstanceOf[js.Any])
  }
}
