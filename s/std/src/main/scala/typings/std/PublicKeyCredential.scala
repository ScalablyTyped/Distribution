package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait PublicKeyCredential
  extends StObject
     with Credential {
  
  /* standard dom */
  val authenticatorAttachment: java.lang.String | Null
  
  /* standard dom */
  def getClientExtensionResults(): AuthenticationExtensionsClientOutputs
  
  /* standard dom */
  val rawId: js.typedarray.ArrayBuffer
  
  /* standard dom */
  val response: AuthenticatorResponse
}
object PublicKeyCredential {
  
  inline def apply(
    getClientExtensionResults: () => AuthenticationExtensionsClientOutputs,
    id: java.lang.String,
    rawId: js.typedarray.ArrayBuffer,
    response: AuthenticatorResponse,
    `type`: java.lang.String
  ): PublicKeyCredential = {
    val __obj = js.Dynamic.literal(getClientExtensionResults = js.Any.fromFunction0(getClientExtensionResults), id = id.asInstanceOf[js.Any], rawId = rawId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], authenticatorAttachment = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredential]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicKeyCredential] (val x: Self) extends AnyVal {
    
    inline def setAuthenticatorAttachment(value: java.lang.String): Self = StObject.set(x, "authenticatorAttachment", value.asInstanceOf[js.Any])
    
    inline def setAuthenticatorAttachmentNull: Self = StObject.set(x, "authenticatorAttachment", null)
    
    inline def setGetClientExtensionResults(value: () => AuthenticationExtensionsClientOutputs): Self = StObject.set(x, "getClientExtensionResults", js.Any.fromFunction0(value))
    
    inline def setRawId(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "rawId", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: AuthenticatorResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
