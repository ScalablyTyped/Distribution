package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// unsubscribe
trait UnsubscribeParameters extends StObject {
  
  var channelGroups: js.UndefOr[js.Array[String]] = js.undefined
  
  var channels: js.UndefOr[js.Array[String]] = js.undefined
}
object UnsubscribeParameters {
  
  @scala.inline
  def apply(): UnsubscribeParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnsubscribeParameters]
  }
  
  @scala.inline
  implicit class UnsubscribeParametersMutableBuilder[Self <: UnsubscribeParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelGroups(value: js.Array[String]): Self = StObject.set(x, "channelGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelGroupsUndefined: Self = StObject.set(x, "channelGroups", js.undefined)
    
    @scala.inline
    def setChannelGroupsVarargs(value: String*): Self = StObject.set(x, "channelGroups", js.Array(value :_*))
    
    @scala.inline
    def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    @scala.inline
    def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value :_*))
  }
}
