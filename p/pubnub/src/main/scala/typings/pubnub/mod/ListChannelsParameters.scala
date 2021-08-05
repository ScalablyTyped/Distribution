package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelsParameters extends StObject {
  
  var channelGroup: String
}
object ListChannelsParameters {
  
  inline def apply(channelGroup: String): ListChannelsParameters = {
    val __obj = js.Dynamic.literal(channelGroup = channelGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelsParameters]
  }
  
  extension [Self <: ListChannelsParameters](x: Self) {
    
    inline def setChannelGroup(value: String): Self = StObject.set(x, "channelGroup", value.asInstanceOf[js.Any])
  }
}
