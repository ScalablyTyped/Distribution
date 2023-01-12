package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// publish
trait PublishParameters extends StObject {
  
  var channel: String
  
  var message: Any
  
  var meta: js.UndefOr[Any] = js.undefined
  
  var sendByPost: js.UndefOr[Boolean] = js.undefined
  
  var storeInHistory: js.UndefOr[Boolean] = js.undefined
  
  var ttl: js.UndefOr[Double] = js.undefined
}
object PublishParameters {
  
  inline def apply(channel: String, message: Any): PublishParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublishParameters] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setSendByPost(value: Boolean): Self = StObject.set(x, "sendByPost", value.asInstanceOf[js.Any])
    
    inline def setSendByPostUndefined: Self = StObject.set(x, "sendByPost", js.undefined)
    
    inline def setStoreInHistory(value: Boolean): Self = StObject.set(x, "storeInHistory", value.asInstanceOf[js.Any])
    
    inline def setStoreInHistoryUndefined: Self = StObject.set(x, "storeInHistory", js.undefined)
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
