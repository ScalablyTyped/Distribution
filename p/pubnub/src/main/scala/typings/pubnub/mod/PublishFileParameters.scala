package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishFileParameters extends StObject {
  
  var channel: String = js.native
  
  var fileId: String = js.native
  
  var fileName: String = js.native
  
  var message: js.UndefOr[js.Any] = js.native
  
  var meta: js.UndefOr[js.Any] = js.native
  
  var storeInHistory: js.UndefOr[Boolean] = js.native
  
  var ttl: js.UndefOr[Double] = js.native
}
object PublishFileParameters {
  
  @scala.inline
  def apply(channel: String, fileId: String, fileName: String): PublishFileParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], fileId = fileId.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishFileParameters]
  }
  
  @scala.inline
  implicit class PublishFileParametersMutableBuilder[Self <: PublishFileParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
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
