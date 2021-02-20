package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendFileParameters extends StObject {
  
  var channel: String = js.native
  
  var cipherKey: js.UndefOr[String] = js.native
  
  var file: StreamFileInput | BufferFileInput | UriFileInput = js.native
  
  var message: js.UndefOr[js.Any] = js.native
  
  var meta: js.UndefOr[js.Any] = js.native
  
  var storeInHistory: js.UndefOr[Boolean] = js.native
  
  var ttl: js.UndefOr[Double] = js.native
}
object SendFileParameters {
  
  @scala.inline
  def apply(channel: String, file: StreamFileInput | BufferFileInput | UriFileInput): SendFileParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendFileParameters]
  }
  
  @scala.inline
  implicit class SendFileParametersMutableBuilder[Self <: SendFileParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCipherKey(value: String): Self = StObject.set(x, "cipherKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCipherKeyUndefined: Self = StObject.set(x, "cipherKey", js.undefined)
    
    @scala.inline
    def setFile(value: StreamFileInput | BufferFileInput | UriFileInput): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setStoreInHistory(value: Boolean): Self = StObject.set(x, "storeInHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreInHistoryUndefined: Self = StObject.set(x, "storeInHistory", js.undefined)
    
    @scala.inline
    def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
