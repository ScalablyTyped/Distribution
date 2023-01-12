package typings.ssh2Streams.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostbasedAuthMethodData
  extends StObject
     with _AuthMethodData {
  
  var blob: js.UndefOr[Buffer] = js.undefined
  
  var key: Buffer
  
  var keyAlgo: String
  
  var localHostname: String
  
  var localUsername: String
  
  var signature: js.UndefOr[Buffer] = js.undefined
}
object HostbasedAuthMethodData {
  
  inline def apply(key: Buffer, keyAlgo: String, localHostname: String, localUsername: String): HostbasedAuthMethodData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyAlgo = keyAlgo.asInstanceOf[js.Any], localHostname = localHostname.asInstanceOf[js.Any], localUsername = localUsername.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostbasedAuthMethodData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostbasedAuthMethodData] (val x: Self) extends AnyVal {
    
    inline def setBlob(value: Buffer): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    inline def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
    
    inline def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyAlgo(value: String): Self = StObject.set(x, "keyAlgo", value.asInstanceOf[js.Any])
    
    inline def setLocalHostname(value: String): Self = StObject.set(x, "localHostname", value.asInstanceOf[js.Any])
    
    inline def setLocalUsername(value: String): Self = StObject.set(x, "localUsername", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: Buffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
