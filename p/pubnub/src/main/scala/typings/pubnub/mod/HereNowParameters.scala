package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// hereNow
trait HereNowParameters extends StObject {
  
  var channelGroups: js.UndefOr[js.Array[String]] = js.undefined
  
  var channels: js.UndefOr[js.Array[String]] = js.undefined
  
  var includeState: js.UndefOr[Boolean] = js.undefined
  
  var includeUUIDs: js.UndefOr[Boolean] = js.undefined
}
object HereNowParameters {
  
  inline def apply(): HereNowParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HereNowParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HereNowParameters] (val x: Self) extends AnyVal {
    
    inline def setChannelGroups(value: js.Array[String]): Self = StObject.set(x, "channelGroups", value.asInstanceOf[js.Any])
    
    inline def setChannelGroupsUndefined: Self = StObject.set(x, "channelGroups", js.undefined)
    
    inline def setChannelGroupsVarargs(value: String*): Self = StObject.set(x, "channelGroups", js.Array(value*))
    
    inline def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value*))
    
    inline def setIncludeState(value: Boolean): Self = StObject.set(x, "includeState", value.asInstanceOf[js.Any])
    
    inline def setIncludeStateUndefined: Self = StObject.set(x, "includeState", js.undefined)
    
    inline def setIncludeUUIDs(value: Boolean): Self = StObject.set(x, "includeUUIDs", value.asInstanceOf[js.Any])
    
    inline def setIncludeUUIDsUndefined: Self = StObject.set(x, "includeUUIDs", js.undefined)
  }
}
