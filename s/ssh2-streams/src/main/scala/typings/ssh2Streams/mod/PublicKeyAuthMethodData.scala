package typings.ssh2Streams.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKeyAuthMethodData
  extends StObject
     with _AuthMethodData {
  
  var blob: js.UndefOr[Buffer] = js.undefined
  
  var key: Buffer
  
  var keyAlgo: String
  
  var signature: js.UndefOr[Buffer] = js.undefined
}
object PublicKeyAuthMethodData {
  
  inline def apply(key: Buffer, keyAlgo: String): PublicKeyAuthMethodData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyAlgo = keyAlgo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyAuthMethodData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicKeyAuthMethodData] (val x: Self) extends AnyVal {
    
    inline def setBlob(value: Buffer): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    inline def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
    
    inline def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyAlgo(value: String): Self = StObject.set(x, "keyAlgo", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: Buffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
