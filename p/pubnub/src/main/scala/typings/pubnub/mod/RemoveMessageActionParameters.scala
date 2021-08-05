package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveMessageActionParameters extends StObject {
  
  var actionTimetoken: String
  
  var channel: String
  
  var messageTimetoken: String
}
object RemoveMessageActionParameters {
  
  inline def apply(actionTimetoken: String, channel: String, messageTimetoken: String): RemoveMessageActionParameters = {
    val __obj = js.Dynamic.literal(actionTimetoken = actionTimetoken.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], messageTimetoken = messageTimetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveMessageActionParameters]
  }
  
  extension [Self <: RemoveMessageActionParameters](x: Self) {
    
    inline def setActionTimetoken(value: String): Self = StObject.set(x, "actionTimetoken", value.asInstanceOf[js.Any])
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setMessageTimetoken(value: String): Self = StObject.set(x, "messageTimetoken", value.asInstanceOf[js.Any])
  }
}
