package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticatorAssertionResponse
  extends StObject
     with AuthenticatorResponse {
  
  val authenticatorData: ArrayBuffer
  
  val signature: ArrayBuffer
  
  val userHandle: ArrayBuffer | Null
}
object AuthenticatorAssertionResponse {
  
  @scala.inline
  def apply(authenticatorData: ArrayBuffer, clientDataJSON: ArrayBuffer, signature: ArrayBuffer): AuthenticatorAssertionResponse = {
    val __obj = js.Dynamic.literal(authenticatorData = authenticatorData.asInstanceOf[js.Any], clientDataJSON = clientDataJSON.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], userHandle = null)
    __obj.asInstanceOf[AuthenticatorAssertionResponse]
  }
  
  @scala.inline
  implicit class AuthenticatorAssertionResponseMutableBuilder[Self <: AuthenticatorAssertionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticatorData(value: ArrayBuffer): Self = StObject.set(x, "authenticatorData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: ArrayBuffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserHandle(value: ArrayBuffer): Self = StObject.set(x, "userHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserHandleNull: Self = StObject.set(x, "userHandle", null)
  }
}
