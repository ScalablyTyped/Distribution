package typings.ssh2.mod

import typings.node.bufferMod.global.Buffer
import typings.ssh2.ssh2Strings.publickey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKeyAuthMethod
  extends StObject
     with AuthMethod
     with AnyAuthMethod {
  
  var key: ParsedKey | Buffer | String
  
  var passphrase: js.UndefOr[Buffer | String] = js.undefined
  
  @JSName("type")
  var type_PublicKeyAuthMethod: publickey
}
object PublicKeyAuthMethod {
  
  inline def apply(key: ParsedKey | Buffer | String, username: String): PublicKeyAuthMethod = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("publickey")
    __obj.asInstanceOf[PublicKeyAuthMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicKeyAuthMethod] (val x: Self) extends AnyVal {
    
    inline def setKey(value: ParsedKey | Buffer | String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPassphrase(value: Buffer | String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    
    inline def setType(value: publickey): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
