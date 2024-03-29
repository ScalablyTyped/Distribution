package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoKeyPair extends StObject {
  
  /* standard dom */
  var privateKey: CryptoKey
  
  /* standard dom */
  var publicKey: CryptoKey
}
object CryptoKeyPair {
  
  inline def apply(privateKey: CryptoKey, publicKey: CryptoKey): CryptoKeyPair = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKeyPair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CryptoKeyPair] (val x: Self) extends AnyVal {
    
    inline def setPrivateKey(value: CryptoKey): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKey(value: CryptoKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
