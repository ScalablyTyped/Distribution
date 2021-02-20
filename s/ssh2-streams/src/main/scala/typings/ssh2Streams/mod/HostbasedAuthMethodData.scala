package typings.ssh2Streams.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostbasedAuthMethodData extends _AuthMethodData {
  
  var blob: js.UndefOr[Buffer] = js.native
  
  var key: Buffer = js.native
  
  var keyAlgo: String = js.native
  
  var localHostname: String = js.native
  
  var localUsername: String = js.native
  
  var signature: js.UndefOr[Buffer] = js.native
}
object HostbasedAuthMethodData {
  
  @scala.inline
  def apply(key: Buffer, keyAlgo: String, localHostname: String, localUsername: String): HostbasedAuthMethodData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyAlgo = keyAlgo.asInstanceOf[js.Any], localHostname = localHostname.asInstanceOf[js.Any], localUsername = localUsername.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostbasedAuthMethodData]
  }
  
  @scala.inline
  implicit class HostbasedAuthMethodDataMutableBuilder[Self <: HostbasedAuthMethodData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlob(value: Buffer): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
    
    @scala.inline
    def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyAlgo(value: String): Self = StObject.set(x, "keyAlgo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalHostname(value: String): Self = StObject.set(x, "localHostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalUsername(value: String): Self = StObject.set(x, "localUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: Buffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
