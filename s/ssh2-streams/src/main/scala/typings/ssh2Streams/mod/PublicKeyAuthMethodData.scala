package typings.ssh2Streams.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKeyAuthMethodData extends _AuthMethodData {
  
  var blob: js.UndefOr[Buffer] = js.native
  
  var key: Buffer = js.native
  
  var keyAlgo: String = js.native
  
  var signature: js.UndefOr[Buffer] = js.native
}
object PublicKeyAuthMethodData {
  
  @scala.inline
  def apply(key: Buffer, keyAlgo: String): PublicKeyAuthMethodData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyAlgo = keyAlgo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyAuthMethodData]
  }
  
  @scala.inline
  implicit class PublicKeyAuthMethodDataMutableBuilder[Self <: PublicKeyAuthMethodData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlob(value: Buffer): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
    
    @scala.inline
    def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyAlgo(value: String): Self = StObject.set(x, "keyAlgo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: Buffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
