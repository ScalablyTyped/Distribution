package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushChannelParameters extends StObject {
  
  var channels: js.Array[String]
  
  var device: String
  
  var pushGateway: String
}
object PushChannelParameters {
  
  @scala.inline
  def apply(channels: js.Array[String], device: String, pushGateway: String): PushChannelParameters = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], pushGateway = pushGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushChannelParameters]
  }
  
  @scala.inline
  implicit class PushChannelParametersMutableBuilder[Self <: PushChannelParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    @scala.inline
    def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushGateway(value: String): Self = StObject.set(x, "pushGateway", value.asInstanceOf[js.Any])
  }
}
