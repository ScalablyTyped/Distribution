package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishFileParameters extends StObject {
  
  var channel: String
  
  var fileId: String
  
  var fileName: String
  
  var message: js.UndefOr[Any] = js.undefined
  
  var meta: js.UndefOr[Any] = js.undefined
  
  var storeInHistory: js.UndefOr[Boolean] = js.undefined
  
  var ttl: js.UndefOr[Double] = js.undefined
}
object PublishFileParameters {
  
  inline def apply(channel: String, fileId: String, fileName: String): PublishFileParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], fileId = fileId.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishFileParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublishFileParameters] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setStoreInHistory(value: Boolean): Self = StObject.set(x, "storeInHistory", value.asInstanceOf[js.Any])
    
    inline def setStoreInHistoryUndefined: Self = StObject.set(x, "storeInHistory", js.undefined)
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
