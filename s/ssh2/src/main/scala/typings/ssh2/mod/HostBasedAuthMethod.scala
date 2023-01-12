package typings.ssh2.mod

import typings.node.bufferMod.global.Buffer
import typings.ssh2.ssh2Strings.hostbased
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostBasedAuthMethod
  extends StObject
     with AuthMethod
     with AnyAuthMethod {
  
  /**
    * Can be a string, Buffer, or parsed key containing a private key
    */
  var key: ParsedKey | Buffer | String
  
  var localHostname: String
  
  var localUsername: String
  
  /**
    * `passphrase` only required for encrypted keys
    */
  var passphrase: js.UndefOr[Buffer | String] = js.undefined
  
  @JSName("type")
  var type_HostBasedAuthMethod: hostbased
}
object HostBasedAuthMethod {
  
  inline def apply(key: ParsedKey | Buffer | String, localHostname: String, localUsername: String, username: String): HostBasedAuthMethod = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], localHostname = localHostname.asInstanceOf[js.Any], localUsername = localUsername.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hostbased")
    __obj.asInstanceOf[HostBasedAuthMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostBasedAuthMethod] (val x: Self) extends AnyVal {
    
    inline def setKey(value: ParsedKey | Buffer | String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLocalHostname(value: String): Self = StObject.set(x, "localHostname", value.asInstanceOf[js.Any])
    
    inline def setLocalUsername(value: String): Self = StObject.set(x, "localUsername", value.asInstanceOf[js.Any])
    
    inline def setPassphrase(value: Buffer | String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    
    inline def setType(value: hostbased): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
