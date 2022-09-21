package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// setState
trait SetStateParameters extends StObject {
  
  var channelGroups: js.UndefOr[js.Array[String]] = js.undefined
  
  var channels: js.UndefOr[js.Array[String]] = js.undefined
  
  var state: js.UndefOr[Any] = js.undefined
}
object SetStateParameters {
  
  inline def apply(): SetStateParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetStateParameters]
  }
  
  extension [Self <: SetStateParameters](x: Self) {
    
    inline def setChannelGroups(value: js.Array[String]): Self = StObject.set(x, "channelGroups", value.asInstanceOf[js.Any])
    
    inline def setChannelGroupsUndefined: Self = StObject.set(x, "channelGroups", js.undefined)
    
    inline def setChannelGroupsVarargs(value: String*): Self = StObject.set(x, "channelGroups", js.Array(value*))
    
    inline def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value*))
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
