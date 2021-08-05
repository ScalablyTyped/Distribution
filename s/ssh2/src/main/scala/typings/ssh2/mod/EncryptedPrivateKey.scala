package typings.ssh2.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptedPrivateKey extends StObject {
  
  /** A Buffer or string that contains a private key. */
  var key: Buffer | String
  
  /** The passphrase to decrypt a private key. */
  var passphrase: js.UndefOr[String] = js.undefined
}
object EncryptedPrivateKey {
  
  inline def apply(key: Buffer | String): EncryptedPrivateKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedPrivateKey]
  }
  
  extension [Self <: EncryptedPrivateKey](x: Self) {
    
    inline def setKey(value: Buffer | String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
  }
}
