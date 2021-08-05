package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostKey extends StObject {
  
  var privateKey: ParsedKey
  
  var publicKey: ParsedKey
}
object HostKey {
  
  inline def apply(privateKey: ParsedKey, publicKey: ParsedKey): HostKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostKey]
  }
  
  extension [Self <: HostKey](x: Self) {
    
    inline def setPrivateKey(value: ParsedKey): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKey(value: ParsedKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
