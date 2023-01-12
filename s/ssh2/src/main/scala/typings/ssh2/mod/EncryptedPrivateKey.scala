package typings.ssh2.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptedPrivateKey extends StObject {
  
  /** A Buffer or string that contains a private key. */
  var key: ParsedKey | Buffer | String
  
  /** The passphrase to decrypt a private key. */
  var passphrase: js.UndefOr[Buffer | String] = js.undefined
}
object EncryptedPrivateKey {
  
  inline def apply(key: ParsedKey | Buffer | String): EncryptedPrivateKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedPrivateKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptedPrivateKey] (val x: Self) extends AnyVal {
    
    inline def setKey(value: ParsedKey | Buffer | String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPassphrase(value: Buffer | String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
  }
}
