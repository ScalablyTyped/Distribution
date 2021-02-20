package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// publish
@js.native
trait PublishParameters extends StObject {
  
  var channel: String = js.native
  
  var message: js.Any = js.native
  
  var meta: js.UndefOr[js.Any] = js.native
  
  var sendByPost: js.UndefOr[Boolean] = js.native
  
  var storeInHistory: js.UndefOr[Boolean] = js.native
  
  var ttl: js.UndefOr[Double] = js.native
}
object PublishParameters {
  
  @scala.inline
  def apply(channel: String, message: js.Any): PublishParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishParameters]
  }
  
  @scala.inline
  implicit class PublishParametersMutableBuilder[Self <: PublishParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setSendByPost(value: Boolean): Self = StObject.set(x, "sendByPost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendByPostUndefined: Self = StObject.set(x, "sendByPost", js.undefined)
    
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
