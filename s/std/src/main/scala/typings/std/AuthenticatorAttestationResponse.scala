package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait AuthenticatorAttestationResponse
  extends StObject
     with AuthenticatorResponse {
  
  /* standard dom */
  val attestationObject: js.typedarray.ArrayBuffer
}
object AuthenticatorAttestationResponse {
  
  inline def apply(attestationObject: js.typedarray.ArrayBuffer, clientDataJSON: js.typedarray.ArrayBuffer): AuthenticatorAttestationResponse = {
    val __obj = js.Dynamic.literal(attestationObject = attestationObject.asInstanceOf[js.Any], clientDataJSON = clientDataJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatorAttestationResponse]
  }
  
  extension [Self <: AuthenticatorAttestationResponse](x: Self) {
    
    inline def setAttestationObject(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "attestationObject", value.asInstanceOf[js.Any])
  }
}
