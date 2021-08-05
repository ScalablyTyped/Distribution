package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScopedCredentialInfo extends StObject {
  
  val credential: ScopedCredential
  
  val publicKey: CryptoKey
}
object ScopedCredentialInfo {
  
  inline def apply(credential: ScopedCredential, publicKey: CryptoKey): ScopedCredentialInfo = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedCredentialInfo]
  }
  
  extension [Self <: ScopedCredentialInfo](x: Self) {
    
    inline def setCredential(value: ScopedCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    inline def setPublicKey(value: CryptoKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
