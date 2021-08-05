package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAuthnAssertion extends StObject {
  
  val authenticatorData: ArrayBuffer
  
  val clientData: ArrayBuffer
  
  val credential: ScopedCredential
  
  val signature: ArrayBuffer
}
object WebAuthnAssertion {
  
  inline def apply(
    authenticatorData: ArrayBuffer,
    clientData: ArrayBuffer,
    credential: ScopedCredential,
    signature: ArrayBuffer
  ): WebAuthnAssertion = {
    val __obj = js.Dynamic.literal(authenticatorData = authenticatorData.asInstanceOf[js.Any], clientData = clientData.asInstanceOf[js.Any], credential = credential.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAuthnAssertion]
  }
  
  extension [Self <: WebAuthnAssertion](x: Self) {
    
    inline def setAuthenticatorData(value: ArrayBuffer): Self = StObject.set(x, "authenticatorData", value.asInstanceOf[js.Any])
    
    inline def setClientData(value: ArrayBuffer): Self = StObject.set(x, "clientData", value.asInstanceOf[js.Any])
    
    inline def setCredential(value: ScopedCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: ArrayBuffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
