package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// signal
trait SignalParameters extends StObject {
  
  var channel: String
  
  var message: js.Any
}
object SignalParameters {
  
  @scala.inline
  def apply(channel: String, message: js.Any): SignalParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalParameters]
  }
  
  @scala.inline
  implicit class SignalParametersMutableBuilder[Self <: SignalParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
