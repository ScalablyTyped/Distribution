package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// fire
trait FireParameters extends StObject {
  
  var channel: String
  
  var message: Any
  
  var meta: js.UndefOr[Any] = js.undefined
  
  var sendByPost: js.UndefOr[Boolean] = js.undefined
}
object FireParameters {
  
  inline def apply(channel: String, message: Any): FireParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[FireParameters]
  }
  
  extension [Self <: FireParameters](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setSendByPost(value: Boolean): Self = StObject.set(x, "sendByPost", value.asInstanceOf[js.Any])
    
    inline def setSendByPostUndefined: Self = StObject.set(x, "sendByPost", js.undefined)
  }
}
