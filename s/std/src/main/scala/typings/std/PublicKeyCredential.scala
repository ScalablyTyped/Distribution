package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKeyCredential
  extends StObject
     with Credential {
  
  def getClientExtensionResults(): AuthenticationExtensionsClientOutputs
  
  val rawId: ArrayBuffer
  
  val response: AuthenticatorResponse
}
object PublicKeyCredential {
  
  inline def apply(
    getClientExtensionResults: () => AuthenticationExtensionsClientOutputs,
    id: java.lang.String,
    rawId: ArrayBuffer,
    response: AuthenticatorResponse,
    `type`: java.lang.String
  ): PublicKeyCredential = {
    val __obj = js.Dynamic.literal(getClientExtensionResults = js.Any.fromFunction0(getClientExtensionResults), id = id.asInstanceOf[js.Any], rawId = rawId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredential]
  }
  
  extension [Self <: PublicKeyCredential](x: Self) {
    
    inline def setGetClientExtensionResults(value: () => AuthenticationExtensionsClientOutputs): Self = StObject.set(x, "getClientExtensionResults", js.Any.fromFunction0(value))
    
    inline def setRawId(value: ArrayBuffer): Self = StObject.set(x, "rawId", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: AuthenticatorResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
