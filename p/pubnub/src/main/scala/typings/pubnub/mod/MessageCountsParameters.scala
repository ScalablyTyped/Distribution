package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageCountsParameters extends StObject {
  
  var channelTimetokens: js.Array[Double | String]
  
  var channels: js.Array[String]
}
object MessageCountsParameters {
  
  inline def apply(channelTimetokens: js.Array[Double | String], channels: js.Array[String]): MessageCountsParameters = {
    val __obj = js.Dynamic.literal(channelTimetokens = channelTimetokens.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageCountsParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageCountsParameters] (val x: Self) extends AnyVal {
    
    inline def setChannelTimetokens(value: js.Array[Double | String]): Self = StObject.set(x, "channelTimetokens", value.asInstanceOf[js.Any])
    
    inline def setChannelTimetokensVarargs(value: (Double | String)*): Self = StObject.set(x, "channelTimetokens", js.Array(value*))
    
    inline def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value*))
  }
}
