package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveChannelParameters extends StObject {
  
  var channelGroup: String
  
  var channels: js.Array[String]
}
object RemoveChannelParameters {
  
  inline def apply(channelGroup: String, channels: js.Array[String]): RemoveChannelParameters = {
    val __obj = js.Dynamic.literal(channelGroup = channelGroup.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveChannelParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveChannelParameters] (val x: Self) extends AnyVal {
    
    inline def setChannelGroup(value: String): Self = StObject.set(x, "channelGroup", value.asInstanceOf[js.Any])
    
    inline def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value*))
  }
}
