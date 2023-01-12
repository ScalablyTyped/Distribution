package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// getState
trait GetStateParameters extends StObject {
  
  var channelGroups: js.UndefOr[js.Array[String]] = js.undefined
  
  var channels: js.UndefOr[js.Array[String]] = js.undefined
  
  var uuid: js.UndefOr[String] = js.undefined
}
object GetStateParameters {
  
  inline def apply(): GetStateParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStateParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStateParameters] (val x: Self) extends AnyVal {
    
    inline def setChannelGroups(value: js.Array[String]): Self = StObject.set(x, "channelGroups", value.asInstanceOf[js.Any])
    
    inline def setChannelGroupsUndefined: Self = StObject.set(x, "channelGroups", js.undefined)
    
    inline def setChannelGroupsVarargs(value: String*): Self = StObject.set(x, "channelGroups", js.Array(value*))
    
    inline def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value*))
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
