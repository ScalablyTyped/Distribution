package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAuthnAssertion extends StObject {
  
  val authenticatorData: ArrayBuffer = js.native
  
  val clientData: ArrayBuffer = js.native
  
  val credential: ScopedCredential = js.native
  
  val signature: ArrayBuffer = js.native
}
object WebAuthnAssertion {
  
  @scala.inline
  def apply(
    authenticatorData: ArrayBuffer,
    clientData: ArrayBuffer,
    credential: ScopedCredential,
    signature: ArrayBuffer
  ): WebAuthnAssertion = {
    val __obj = js.Dynamic.literal(authenticatorData = authenticatorData.asInstanceOf[js.Any], clientData = clientData.asInstanceOf[js.Any], credential = credential.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAuthnAssertion]
  }
  
  @scala.inline
  implicit class WebAuthnAssertionMutableBuilder[Self <: WebAuthnAssertion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticatorData(value: ArrayBuffer): Self = StObject.set(x, "authenticatorData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientData(value: ArrayBuffer): Self = StObject.set(x, "clientData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredential(value: ScopedCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: ArrayBuffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
