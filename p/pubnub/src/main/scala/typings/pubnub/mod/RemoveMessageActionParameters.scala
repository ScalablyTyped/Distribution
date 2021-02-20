package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveMessageActionParameters extends StObject {
  
  var actionTimetoken: String = js.native
  
  var channel: String = js.native
  
  var messageTimetoken: String = js.native
}
object RemoveMessageActionParameters {
  
  @scala.inline
  def apply(actionTimetoken: String, channel: String, messageTimetoken: String): RemoveMessageActionParameters = {
    val __obj = js.Dynamic.literal(actionTimetoken = actionTimetoken.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], messageTimetoken = messageTimetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveMessageActionParameters]
  }
  
  @scala.inline
  implicit class RemoveMessageActionParametersMutableBuilder[Self <: RemoveMessageActionParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionTimetoken(value: String): Self = StObject.set(x, "actionTimetoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTimetoken(value: String): Self = StObject.set(x, "messageTimetoken", value.asInstanceOf[js.Any])
  }
}
