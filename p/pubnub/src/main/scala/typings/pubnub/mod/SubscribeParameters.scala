package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// subscribe
trait SubscribeParameters extends StObject {
  
  var channelGroups: js.UndefOr[js.Array[String]] = js.undefined
  
  var channels: js.UndefOr[js.Array[String]] = js.undefined
  
  var timetoken: js.UndefOr[Double] = js.undefined
  
  var withPresence: js.UndefOr[Boolean] = js.undefined
}
object SubscribeParameters {
  
  inline def apply(): SubscribeParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscribeParameters] (val x: Self) extends AnyVal {
    
    inline def setChannelGroups(value: js.Array[String]): Self = StObject.set(x, "channelGroups", value.asInstanceOf[js.Any])
    
    inline def setChannelGroupsUndefined: Self = StObject.set(x, "channelGroups", js.undefined)
    
    inline def setChannelGroupsVarargs(value: String*): Self = StObject.set(x, "channelGroups", js.Array(value*))
    
    inline def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value*))
    
    inline def setTimetoken(value: Double): Self = StObject.set(x, "timetoken", value.asInstanceOf[js.Any])
    
    inline def setTimetokenUndefined: Self = StObject.set(x, "timetoken", js.undefined)
    
    inline def setWithPresence(value: Boolean): Self = StObject.set(x, "withPresence", value.asInstanceOf[js.Any])
    
    inline def setWithPresenceUndefined: Self = StObject.set(x, "withPresence", js.undefined)
  }
}
