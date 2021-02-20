package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostKey extends StObject {
  
  var privateKey: ParsedKey = js.native
  
  var publicKey: ParsedKey = js.native
}
object HostKey {
  
  @scala.inline
  def apply(privateKey: ParsedKey, publicKey: ParsedKey): HostKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostKey]
  }
  
  @scala.inline
  implicit class HostKeyMutableBuilder[Self <: HostKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivateKey(value: ParsedKey): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: ParsedKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
