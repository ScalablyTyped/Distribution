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
  
  /* standard dom */
  def getAuthenticatorData(): js.typedarray.ArrayBuffer
  
  /* standard dom */
  def getPublicKey(): js.typedarray.ArrayBuffer | Null
  
  /* standard dom */
  def getPublicKeyAlgorithm(): COSEAlgorithmIdentifier
  
  /* standard dom */
  def getTransports(): js.Array[java.lang.String]
}
object AuthenticatorAttestationResponse {
  
  inline def apply(
    attestationObject: js.typedarray.ArrayBuffer,
    clientDataJSON: js.typedarray.ArrayBuffer,
    getAuthenticatorData: () => js.typedarray.ArrayBuffer,
    getPublicKey: () => js.typedarray.ArrayBuffer | Null,
    getPublicKeyAlgorithm: () => COSEAlgorithmIdentifier,
    getTransports: () => js.Array[java.lang.String]
  ): AuthenticatorAttestationResponse = {
    val __obj = js.Dynamic.literal(attestationObject = attestationObject.asInstanceOf[js.Any], clientDataJSON = clientDataJSON.asInstanceOf[js.Any], getAuthenticatorData = js.Any.fromFunction0(getAuthenticatorData), getPublicKey = js.Any.fromFunction0(getPublicKey), getPublicKeyAlgorithm = js.Any.fromFunction0(getPublicKeyAlgorithm), getTransports = js.Any.fromFunction0(getTransports))
    __obj.asInstanceOf[AuthenticatorAttestationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticatorAttestationResponse] (val x: Self) extends AnyVal {
    
    inline def setAttestationObject(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "attestationObject", value.asInstanceOf[js.Any])
    
    inline def setGetAuthenticatorData(value: () => js.typedarray.ArrayBuffer): Self = StObject.set(x, "getAuthenticatorData", js.Any.fromFunction0(value))
    
    inline def setGetPublicKey(value: () => js.typedarray.ArrayBuffer | Null): Self = StObject.set(x, "getPublicKey", js.Any.fromFunction0(value))
    
    inline def setGetPublicKeyAlgorithm(value: () => COSEAlgorithmIdentifier): Self = StObject.set(x, "getPublicKeyAlgorithm", js.Any.fromFunction0(value))
    
    inline def setGetTransports(value: () => js.Array[java.lang.String]): Self = StObject.set(x, "getTransports", js.Any.fromFunction0(value))
  }
}
