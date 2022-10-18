package typings.pubnub.mod

import typings.pubnub.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// message actions
trait AddMessageActionParameters extends StObject {
  
  var action: Type
  
  var channel: String
  
  var messageTimetoken: String
}
object AddMessageActionParameters {
  
  inline def apply(action: Type, channel: String, messageTimetoken: String): AddMessageActionParameters = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], messageTimetoken = messageTimetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddMessageActionParameters]
  }
  
  extension [Self <: AddMessageActionParameters](x: Self) {
    
    inline def setAction(value: Type): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setMessageTimetoken(value: String): Self = StObject.set(x, "messageTimetoken", value.asInstanceOf[js.Any])
  }
}
