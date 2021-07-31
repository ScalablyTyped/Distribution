package typings.pubnub.mod

import typings.pubnub.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddMessageActionParameters extends StObject {
  
  var action: Value
  
  var channel: String
  
  var messageTimetoken: String
}
object AddMessageActionParameters {
  
  @scala.inline
  def apply(action: Value, channel: String, messageTimetoken: String): AddMessageActionParameters = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], messageTimetoken = messageTimetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddMessageActionParameters]
  }
  
  @scala.inline
  implicit class AddMessageActionParametersMutableBuilder[Self <: AddMessageActionParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Value): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTimetoken(value: String): Self = StObject.set(x, "messageTimetoken", value.asInstanceOf[js.Any])
  }
}
